/* ============================================*/
CREATE TABLE
    kpi_information_latest
    (
        erbs CHARACTER VARYING,
        eutrancellfdd CHARACTER VARYING,
        datetime_id TIMESTAMP(6) WITHOUT TIME ZONE,
        date_id DATE,
        accessibility_initial_e_rab_establishment_success_rate NUMERIC,
        accessibility_initial_e_rab_establishment_success_rate_predict NUMERIC,
        accessibility_initial_e_rab_establishment_success_rate_anom NUMERIC,
        accessibility_added_e_rab_establishment_success_rate NUMERIC,
        accessibility_added_e_rab_establishment_success_rate_predict NUMERIC,
        accessibility_added_e_rab_establishment_success_rate_anom NUMERIC,
        retainability_e_rab_session_time_normalized_loss_rate NUMERIC,
        retainability_e_rab_session_time_normalized_loss_rate_predict NUMERIC,
        retainability_e_rab_session_time_normalized_loss_rate_anom NUMERIC,
        retainability_e_rab_percentage_lost NUMERIC,
        retainability_e_rab_percentage_lost_predict NUMERIC,
        retainability_e_rab_percentage_lost_anom NUMERIC,
        integrity_average_dl_ue_latency NUMERIC,
        integrity_average_dl_ue_latency_predict NUMERIC,
        integrity_average_dl_ue_latency_anom NUMERIC,
        integrity_average_dl_pdcp_ue_throughput_predict NUMERIC,
        integrity_average_dl_pdcp_ue_throughput_anom NUMERIC,
        integrity_average_dl_pdcp_ue_throughput NUMERIC,
        integrity_ul_packet_loss_rate NUMERIC,
        integrity_ul_packet_loss_rate_predict NUMERIC,
        integrity_ul_packet_loss_rate_anom NUMERIC,
        integrity_average_dl_pdcp_cell_throughput NUMERIC,
        integrity_average_dl_pdcp_cell_throughput_predict NUMERIC,
        integrity_average_dl_pdcp_cell_throughput_anom NUMERIC,
        integrity_average_dl_mac_cell_throughput NUMERIC,
        integrity_average_dl_mac_cell_throughput_predict NUMERIC,
        integrity_average_dl_mac_cell_throughput_anom NUMERIC,
        integrity_average_ul_pdcp_ue_throughput NUMERIC,
        integrity_average_ul_pdcp_ue_throughput_predict NUMERIC,
        integrity_average_ul_pdcp_ue_throughput_anom NUMERIC,
        integrity_average_ul_pdcp_cell_throughput NUMERIC,
        integrity_average_ul_pdcp_cell_throughput_predict NUMERIC,
        integrity_average_ul_pdcp_cell_throughput_anom NUMERIC,
        integrity_average_ul_mac_cell_throughput NUMERIC,
        integrity_average_ul_mac_cell_throughput_predict NUMERIC,
        integrity_average_ul_mac_cell_throughput_anom NUMERIC,
        integrity_voip_integrity NUMERIC,
        integrity_voip_integrity_predict NUMERIC,
        integrity_voip_integrity_anom NUMERIC
    ) WITH ( OIDS=FALSE);

CREATE OR REPLACE FUNCTION create_kpi_partition_and_insert() RETURNS trigger AS
  $BODY$
    DECLARE
      partition_date_id TEXT;
      partition TEXT;
    BEGIN
      partition_date_id := to_char(NEW.date_id,'YYYY_MM_DD');
      partition := TG_RELNAME || '_' || partition_date_id;
      IF NOT EXISTS(SELECT relname FROM pg_class WHERE relname=partition) THEN
        RAISE NOTICE 'A partition has been created %',partition;
        EXECUTE 'CREATE TABLE ' || partition || ' (check (date_id = ''' || NEW.date_id || ''')) INHERITS (' || TG_RELNAME || ');';
      END IF;
      EXECUTE 'INSERT INTO ' || partition || ' SELECT(' || TG_RELNAME || ' ' || quote_literal(NEW) || ').* RETURNING date_id;';
      RETURN NULL;
    END;
  $BODY$
LANGUAGE plpgsql VOLATILE
COST 100;

CREATE TRIGGER kpi_partition_insert_trigger
BEFORE INSERT ON kpi_information
FOR EACH ROW EXECUTE PROCEDURE create_kpi_partition_and_insert();
/* Corelated Kpi Table*/
CREATE TABLE
    corelated_kpi_information
    (
		kpi_group varchar,
        kpi_name varchar,
        corelated_kpi varchar,
        coefficient NUMERIC,
        priority INTEGER
    )
/* EutranCellFdd*/
CREATE TABLE
    dc_e_erbs_eutrancellfdd_raw
    (
        erbs CHARACTER VARYING,
        eutrancellfdd CHARACTER VARYING,
        nesw CHARACTER VARYING,
        datetime_id TIMESTAMP(6) WITHOUT TIME ZONE,
        date_id DATE,
        year_id SMALLINT,
        month_id SMALLINT,
        day_id SMALLINT,
        hour_id SMALLINT,
        min_id SMALLINT,
        moid CHARACTER VARYING,
        pmrrcconnestabsucc NUMERIC,
        pmerabestabattaddedhoongoing NUMERIC,
        pmrrcconnestabatt NUMERIC,
        pmrrcconnestabattreatt NUMERIC,
        pms1sigconnestabsucc NUMERIC,
        pms1sigconnestabatt NUMERIC,
        pmerabestabsuccinit NUMERIC,
        pmerabestabattinit NUMERIC,
        pmrrcconnestabsuccmod NUMERIC,
        pmrrcconnestabsuccmta NUMERIC,
        pmrrcconnestabattmod NUMERIC,
        pmrrcconnestabattmta NUMERIC,
        pmrrcconnestabattreattmod NUMERIC,
        pmrrcconnestabattreattmta NUMERIC,
        pms1sigconnestabsuccmod NUMERIC,
        pms1sigconnestabsuccmta NUMERIC,
        pms1sigconnestabattmod NUMERIC,
        pms1sigconnestabattmta NUMERIC,
        pmrrcconnestabsuccem NUMERIC,
        pmrrcconnestabattem NUMERIC,
        pmrrcconnestabattreattem NUMERIC,
        pms1sigconnestabsuccem NUMERIC,
        pms1sigconnestabattem NUMERIC,
        pmerabestabsuccadded NUMERIC,
        pmerabestabattadded NUMERIC,
        pmerabrelabnormalenbact NUMERIC,
        pmerabrelabnormalmmeact NUMERIC,
        pmsessiontimeue NUMERIC,
        pmerabrelabnormalenb NUMERIC,
        pmerabrelnormalenb NUMERIC,
        pmerabrelmme NUMERIC,
        pmerabrelmmeacteutra NUMERIC,
        pmpdcplattimedl NUMERIC,
        pmpdcplatpkttransdl NUMERIC,
        pmpdcpvoldldrb NUMERIC,
        pmpdcpvoldldrblasttti NUMERIC,
        pmuethptimedl NUMERIC,
        pmschedactivitycelldl NUMERIC,
        pmradiothpvoldl NUMERIC,
        pmuethpvolul NUMERIC,
        pmuethptimeul NUMERIC,
        pmpdcpvoluldrb NUMERIC,
        pmschedactivitycellul NUMERIC,
        pmradiothpvolul NUMERIC,
        pmpdcppktdiscdlpelr NUMERIC,
        pmpdcppktdiscdlpelruu NUMERIC,
        pmpdcppktdiscdlho NUMERIC,
        pmpdcppktreceiveddl NUMERIC,
        pmpdcppktfwddl NUMERIC,
        pmpdcppktlostul NUMERIC,
        pmpdcppktreceivedul NUMERIC,
        pmvoipqualityueulok NUMERIC,
        pmvoipqualityueulnok NUMERIC,
        pmvoipqualityrbulok NUMERIC,
        pmvoipqualityrbulnok NUMERIC,
        pmrrcconnestabfailmmeovlmos NUMERIC,
        pmrrcconnestabfailmmeovlmod NUMERIC,
        pms1sigconnestabfailmmeovlmos NUMERIC,
        pmcelldowntimeman NUMERIC,
        pmcelldowntimeauto NUMERIC,
        pmcellhoprepsucclteintraf NUMERIC,
        pmcellhoprepsucclteinterf NUMERIC,
        pmcellhoprepattlteintraf NUMERIC,
        pmcellhoprepattlteinterf NUMERIC,
        pmcellhoexesucclteintraf NUMERIC,
        pmcellhoexesucclteinterf NUMERIC,
        pmcellhoexeattlteintraf NUMERIC,
        pmactiveuedlsum NUMERIC,
        pmactiveueulsum NUMERIC,
        pmpdcpvoldldrb1 NUMERIC,
        pmuethpvolul1 NUMERIC,
        pmsessiontimeue1 NUMERIC
    ) WITH ( OIDS=FALSE);
/* Partion Table query*/
CREATE TABLE dc_e_erbs_eutrancellfdd_raw_2016_06_06 ( CHECK (date_id ='"+date_id+"' )) INHERITS (dc_e_erbs_eutrancellfdd_raw);

CREATE TABLE kpi_event_parameter ( kpi_name CHARACTER VARYING, counter CHARACTER VARYING, events CHARACTER VARYING, local_event_filter_parameter CHARACTER VARYING, local_event_counter_parameter CHARACTER VARYING );