/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.counter.analytics.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.Entity;

import com.ericsson.counter.analytics.dao.query.holder.NamedQueryHolder;

@Entity
@NamedQueries({
	@NamedQuery(name=NamedQueryHolder.SERVICE_IMPACT,query=NamedQueryHolder.SERVICE_IMPACT_QUERY)
	
})
@Table(name="dc_e_erbs_eutrancellfdd_raw")
public class EutranCellFdd implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private String batch_id;
	@Column
	private String date_id;
	@Column
	private String datetime_id;
	@Column
	private String day_id;
	@Column
	private String dc_release;
	@Column
	private String dc_source;
	@Column
	private String dc_suspectflag;
	@Column
	private String dc_timezone;
	@Column
	private String enodebfunction;
	@Column
	private String erbs;
	@Column
	private String eutrancellfdd;
	@Column
	private String hour_id;
	@Column
	private String min_id;
	@Column
	private String moid;
	@Column
	private String month_id;
	@Column
	private String nesw;
	@Column
	private String oss_id;
	@Column
	private String period_duration;
	@Column
	private String pma3interfbestcellevalreport;
	@Column
	private String pma3interfbestcellevalreportrsrp;
	@Column
	private String pma3interfbestcellevalreportul;
	@Column
	private String pma5bestcellevalreport;
	@Column
	private String pma5bestcellevalreportrsrp;
	@Column
	private String pma5bestcellevalreportul;
	@Column
	private String pmaccessclassbarringem;
	@Column
	private String pmactivedrbdlsum;
	@Column
	private String pmactivedrbulsum;
	@Column
	private String pmactiveuedlmax;
	@Column
	private String pmActiveUeDlSum;
	@Column
	private String pmactiveuedrbsamp;
	@Column
	private String pmactiveueulmax;
	@Column
	private String pmActiveUeUlSum;
	@Column
	private String pmadjustaccessdynloadctrl;
	@Column
	private String pmadjustaccessmploadctrl;
	@Column
	private String pmanrcandnrelcgiadd;
	@Column
	private String pmanrcandnrelrem;
	@Column
	private String pmanrcandnrelx2add;
	@Column
	private String pmanrhosucclevellow;
	@Column
	private String pmanrhosucclevelmedium;
	@Column
	private String pmanrneighbreladd;
	@Column
	private String pmanrneighbrelrem;
	@Column
	private String pmb2bestcellevalreport;
	@Column
	private String pmb2bestcellevalreportrsrp;
	@Column
	private String pmb2bestcellevalreportul;
	@Column
	private String pmbadcovevalreport;
	@Column
	private String pmbadcovoutsearchevalreport;
	@Column
	private String pmbadcovoutsearchevalreportrsrp;
	@Column
	private String pmbadcovsearchevalreport;
	@Column
	private String pmbadcovsearchevalreportrsrp;
	@Column
	private String pmbadcovsearchevalreportul;
	@Column
	private String pmbbuemeasallocatt;
	@Column
	private String pmbbuemeasallocsucc;
	@Column
	private String pmbestcellevalreport;
	@Column
	private String pmcacapabledlsamp;
	@Column
	private String pmcaconfigureddlsamp;
	@Column
	private String pmcaconfiguredmeasatt;
	@Column
	private String pmcaconfiguredmeassucc;
	@Column
	private String pmcaconfigurednomeasatt;
	@Column
	private String pmcaconfigurednomeassucc;
	@Column
	private String pmcaconfiguredsamp;
	@Column
	private String pmcadeconfigured;
	@Column
	private String pmcadeconfiguredlostcoverage;
	@Column
	private String pmcadeconfiguredsamp;
	@Column
	private String pmcadeconfiguredscellchange;
	@Column
	private String pmcelladmcontrolpdcchrej;
	@Column
	private String pmcelladmcontrolpdcchrejmeas;
	@Column
	private String pmcelldownlockauto;
	@Column
	private String pmcelldownlockman;
	@Column
	private String pmCellDowntimeAuto;
	@Column
	private String pmCellDowntimeMan;
	@Column
	private String pmcelldownunlockman;
	@Column
	private String pmcellhoexeattlteinterf;
	@Column
	private String pmcellhoexeattlteinterfcsg;
	@Column
	private String pmcellhoexeattlteinterfhybridcsg;
	@Column
	private String pmcellhoexeattlteinterfmbms;
	@Column
	private String pmcellhoexeattlteinterfuemeas;
	@Column
	private String pmcellhoexeattlteinterfuemeasrsrp;
	@Column
	private String pmcellhoexeattlteinterful;
	@Column
	private String pmcellhoexeattlteintraf;
	@Column
	private String pmcellhoexeattlteintrafafterresync;
	@Column
	private String pmcellhoexeattlteintrafcsg;
	@Column
	private String pmcellhoexeattlteintrafhybridcsg;
	@Column
	private String pmcellhoexeattlteintraftuneout;
	@Column
	private String pmcellhoexesucclteinterf;
	@Column
	private String pmcellhoexesucclteinterfcsg;
	@Column
	private String pmcellhoexesucclteinterfhybridcsg;
	@Column
	private String pmcellhoexesucclteinterfmbms;
	@Column
	private String pmcellhoexesucclteinterfuemeas;
	@Column
	private String pmcellhoexesucclteinterfuemeasrsrp;
	@Column
	private String pmcellhoexesucclteinterful;
	@Column
	private String pmcellhoexesucclteintraf;
	@Column
	private String pmcellhoexesucclteintrafafterresync;
	@Column
	private String pmcellhoexesucclteintrafcsg;
	@Column
	private String pmcellhoexesucclteintrafhybridcsg;
	@Column
	private String pmcellhoexesucclteintraftuneout;
	@Column
	private String pmcellhoprepattlowcovue;
	@Column
	private String pmcellhoprepattlteinterf;
	@Column
	private String pmcellhoprepattlteinterfcsg;
	@Column
	private String pmcellhoprepattlteinterfhybridcsg;
	@Column
	private String pmcellhoprepattlteinterfmbms;
	@Column
	private String pmcellhoprepattlteinterful;
	@Column
	private String pmcellhoprepattlteintraf;
	@Column
	private String pmcellhoprepattlteintrafcsg;
	@Column
	private String pmcellhoprepattlteintrafhybridcsg;
	@Column
	private String pmcellhoprepsucclowcovue;
	@Column
	private String pmcellhoprepsucclteinterf;
	@Column
	private String pmcellhoprepsucclteinterfcsg;
	@Column
	private String pmcellhoprepsucclteinterfhybridcsg;
	@Column
	private String pmcellhoprepsucclteinterfmbms;
	@Column
	private String pmcellhoprepsucclteinterful;
	@Column
	private String pmcellhoprepsucclteintraf;
	@Column
	private String pmcellhoprepsucclteintrafcsg;
	@Column
	private String pmcellhoprepsucclteintrafhybridcsg;
	@Column
	private String pmcellsleeptime;
	@Column
	private String pmconfigrejdlcomp;
	@Column
	private String pmconfirmeduerelreqpft;
	@Column
	private String pmcontdl;
	@Column
	private String pmcontdlcaplic;
	@Column
	private String pmcontdlhw;
	@Column
	private String pmcontdlpdcch;
	@Column
	private String pmcontul;
	@Column
	private String pmcontulcaplic;
	@Column
	private String pmcontulhw;
	@Column
	private String pmcontulpdcch;
	@Column
	private String pmcovgoodzonesamp;
	@Column
	private String pmcovgoodzonesum;
	@Column
	private String pmcovsearchzonesamp;
	@Column
	private String pmcovsearchzonesum;
	@Column
	private String pmcriticalborderevalreport;
	@Column
	private String pmcriticalborderevalreportrsrp;
	@Column
	private String pmcriticalborderevalreportul;
	@Column
	private String pmcrsiccapablesamp;
	@Column
	private String pmcrsiccapablesum;
	@Column
	private String pmdlassigsdetectedharqndo;
	@Column
	private String pmdlassigsdetectedharqvoltendo;
	@Column
	private String pmdlassigstrans;
	@Column
	private String pmdlassigstransndo;
	@Column
	private String pmdlassigstranspcell;
	@Column
	private String pmdlassigstransscell;
	@Column
	private String pmdlassigstransvolte;
	@Column
	private String pmdlassigstransvoltendo;
	@Column
	private String pmdlassigswithdetectedharqack;
	@Column
	private String pmdlassigswithdetectedharqackpcell;
	@Column
	private String pmdlassigswithdetectedharqackscell;
	@Column
	private String pmdlassigswithdetectedharqackvolte;
	@Column
	private String pmdlassigswithunknownreception;
	@Column
	private String pmdlassigswithunknownreceptionpcell;
	@Column
	private String pmdlassigswithunknownreceptionscell;
	@Column
	private String pmdlassigswithunknownreceptionvolte;
	@Column
	private String pmdrxcommandpft;
	@Column
	private String pmdrxsleeptime;
	@Column
	private String pmdrxsleeptimepft;
	@Column
	private String pmdrxtotaltime;
	@Column
	private String pmdrxtotaltimepft;
	@Column
	private String pmdsdreqpft;
	@Column
	private String pmdtdreqpft;
	@Column
	private String pmelcpdcchblankedtti;
	@Column
	private String pmelcpdschblankedtti;
	@Column
	private String pmerabadmissionattarp0;
	@Column
	private String pmerabadmissionattarp1;
	@Column
	private String pmerabadmissionattarp10;
	@Column
	private String pmerabadmissionattarp11;
	@Column
	private String pmerabadmissionattarp12;
	@Column
	private String pmerabadmissionattarp13;
	@Column
	private String pmerabadmissionattarp14;
	@Column
	private String pmerabadmissionattarp15;
	@Column
	private String pmerabadmissionattarp2;
	@Column
	private String pmerabadmissionattarp3;
	@Column
	private String pmerabadmissionattarp4;
	@Column
	private String pmerabadmissionattarp5;
	@Column
	private String pmerabadmissionattarp6;
	@Column
	private String pmerabadmissionattarp7;
	@Column
	private String pmerabadmissionattarp8;
	@Column
	private String pmerabadmissionattarp9;
	@Column
	private String pmerabadmissionsuccarp0;
	@Column
	private String pmerabadmissionsuccarp1;
	@Column
	private String pmerabadmissionsuccarp10;
	@Column
	private String pmerabadmissionsuccarp11;
	@Column
	private String pmerabadmissionsuccarp12;
	@Column
	private String pmerabadmissionsuccarp13;
	@Column
	private String pmerabadmissionsuccarp14;
	@Column
	private String pmerabadmissionsuccarp15;
	@Column
	private String pmerabadmissionsuccarp2;
	@Column
	private String pmerabadmissionsuccarp3;
	@Column
	private String pmerabadmissionsuccarp4;
	@Column
	private String pmerabadmissionsuccarp5;
	@Column
	private String pmerabadmissionsuccarp6;
	@Column
	private String pmerabadmissionsuccarp7;
	@Column
	private String pmerabadmissionsuccarp8;
	@Column
	private String pmerabadmissionsuccarp9;
	@Column
	private String pmerabestabattadded;
	@Column
	private String pmerabestabattaddedhoongoing;
	@Column
	private String pmerabestabattaddedpa;
	@Column
	private String pmerabestabattgbr;
	@Column
	private String pmErabEstabAttInit;
	@Column
	private String pmerabestabattinitpa;
	@Column
	private String pmerabestabfailaddedhoongoing;
	@Column
	private String pmerabestabfailaddedlic;
	@Column
	private String pmerabestabfailgbrdlcell;
	@Column
	private String pmerabestabfailgbrdlenb;
	@Column
	private String pmerabestabfailgbrulcell;
	@Column
	private String pmerabestabfailgbrulenb;
	@Column
	private String pmerabestabfailinitlic;
	@Column
	private String pmerabestabsuccadded;
	@Column
	private String pmerabestabsuccaddedpa;
	@Column
	private String pmerabestabsuccgbr;
	@Column
	private String pmErabEstabSuccInit;
	@Column
	private String pmerabestabsuccinitpa;
	@Column
	private String pmerablevsamp;
	@Column
	private String pmerablevsum;
	@Column
	private String pmerabmax;
	@Column
	private String pmerabmodfaillic;
	@Column
	private String pmErabRelAbnormalEnb;
	@Column
	private String pmErabRelAbnormalEnbAct;
	@Column
	private String pmerabrelabnormalenbactcdt;
	@Column
	private String pmerabrelabnormalenbactcdtauto;
	@Column
	private String pmerabrelabnormalenbactcdtautopnr;
	@Column
	private String pmerabrelabnormalenbactho;
	@Column
	private String pmerabrelabnormalenbacthooos;
	@Column
	private String pmerabrelabnormalenbacthooospft;
	@Column
	private String pmerabrelabnormalenbacthpr;
	@Column
	private String pmerabrelabnormalenbacthproos;
	@Column
	private String pmerabrelabnormalenbacthproospft;
	@Column
	private String pmerabrelabnormalenbactoos;
	@Column
	private String pmerabrelabnormalenbactoospft;
	@Column
	private String pmerabrelabnormalenbactpe;
	@Column
	private String pmerabrelabnormalenbacttnfail;
	@Column
	private String pmerabrelabnormalenbactuelost;
	@Column
	private String pmerabrelabnormalenbactuelostoos;
	@Column
	private String pmerabrelabnormalenbactuelostoospft;
	@Column
	private String pmerabrelabnormalenbcdt;
	@Column
	private String pmerabrelabnormalenbcdtauto;
	@Column
	private String pmerabrelabnormalenbcdtautopnr;
	@Column
	private String pmerabrelabnormalenbextiat;
	@Column
	private String pmerabrelabnormalenbho;
	@Column
	private String pmerabrelabnormalenbhooos;
	@Column
	private String pmerabrelabnormalenbhooospft;
	@Column
	private String pmerabrelabnormalenbhpr;
	@Column
	private String pmerabrelabnormalenbhproos;
	@Column
	private String pmerabrelabnormalenbhproospft;
	@Column
	private String pmerabrelabnormalenblic;
	@Column
	private String pmerabrelabnormalenboos;
	@Column
	private String pmerabrelabnormalenboospft;
	@Column
	private String pmerabrelabnormalenbpe;
	@Column
	private String pmerabrelabnormalenbsir;
	@Column
	private String pmerabrelabnormalenbtnfail;
	@Column
	private String pmerabrelabnormalenbuelost;
	@Column
	private String pmerabrelabnormalenbuelostoos;
	@Column
	private String pmerabrelabnormalenbuelostoospft;
	@Column
	private String pmerabrelabnormalmme;
	@Column
	private String pmErabRelAbnormalMmeAct;
	@Column
	private String pmerabrelabnormalmmeextiat;
	@Column
	private String pmErabRelMme;
	@Column
	private String pmerabrelmmeact;
	@Column
	private String pmErabRelMmeActEutra;
	@Column
	private String pmerabrelmmeactho;
	@Column
	private String pmerabrelmmeactunspecified;
	@Column
	private String pmerabrelmmeactuserinactivity;
	@Column
	private String pmerabrelmmecellunavail;
	@Column
	private String pmerabrelmmeho;
	@Column
	private String pmErabRelNormalEnb;
	@Column
	private String pmerabrelnormalenbact;
	@Column
	private String pmerabrelnormalenbuserinactivity;
	@Column
	private String pmerabrelnormalmme;
	@Column
	private String pmerabresumearplow;
	@Column
	private String pmfastpucchassignpft;
	@Column
	private String pmgoodcovsearchevalreport;
	@Column
	private String pmgoodcovsearchevalreportrsrp;
	@Column
	private String pmgoodcovsearchevalreportul;
	@Column
	private String pmhoprepouts1rejinvalidinterfcsg;
	@Column
	private String pmhoprepouts1rejinvalidinterfhybridcsg;
	@Column
	private String pmhoprepouts1rejinvalidintrafcsg;
	@Column
	private String pmhoprepouts1rejinvalidintrafhybridcsg;
	@Column
	private String pmhopreprejinbeareradmissionrej;
	@Column
	private String pmhopreprejincellintensdlc;
	@Column
	private String pmhopreprejincellintensstat;
	@Column
	private String pmhopreprejincellintensswc;
	@Column
	private String pmhopreprejincelllatency;
	@Column
	private String pmhopreprejindlonlycell;
	@Column
	private String pmhopreprejinduintens;
	@Column
	private String pmhopreprejinduswc;
	@Column
	private String pmhopreprejindynueadmctrl;
	@Column
	private String pmhopreprejinhighload;
	@Column
	private String pmhopreprejinhighloadlong;
	@Column
	private String pmhopreprejinlicconnusers;
	@Column
	private String pmhopreprejinliclowcovue;
	@Column
	private String pmhopreprejinlicmob;
	@Column
	private String pmhopreprejinlicmultierab;
	@Column
	private String pmhopreprejinlicrlcum;
	@Column
	private String pmhopreprejinmisigqcong;
	@Column
	private String pmhopreprejinmpoverload;
	@Column
	private String pmhopreprejinoffloadadmission;
	@Column
	private String pmhopreprejinoverload;
	@Column
	private String pmhopreprejinsl;
	@Column
	private String pmhopreprejinulthres;
	@Column
	private String pmhopreprejinulthrescaredirect;
	@Column
	private String pmhopreventednotinplmnwl;
	@Column
	private String pmhopreventedproblematiccell;
	@Column
	private String pmidlemodereldistrhighload;
	@Column
	private String pmidlemodereldistrlowload;
	@Column
	private String pmidlemodereldistrlowmediumload;
	@Column
	private String pmidlemodereldistrmediumhighload;
	@Column
	private String pmidlemodereldistrmediumload;
	@Column
	private String pminactiveuerelinhighload;
	@Column
	private String pminsynctimepft;
	@Column
	private String pminvalidpftmsg;
	@Column
	private String pminvalidpftnum;
	@Column
	private String pmlbevalexpiredue;
	@Column
	private String pmlbsubratiosamp;
	@Column
	private String pmlbsubratiosum;
	@Column
	private String pmlongdrxcommandpft;
	@Column
	private String pmmaccellthptimedl;
	@Column
	private String pmmaccellthptimeul;
	@Column
	private String pmmacdelaytimedl;
	@Column
	private String pmmacharqdlack;
	@Column
	private String pmmacharqdlack16qam;
	@Column
	private String pmmacharqdlack256qam;
	@Column
	private String pmmacharqdlack64qam;
	@Column
	private String pmmacharqdlackcomp;
	@Column
	private String pmmacharqdlackqpsk;
	@Column
	private String pmmacharqdldtx;
	@Column
	private String pmmacharqdldtx16qam;
	@Column
	private String pmmacharqdldtx256qam;
	@Column
	private String pmmacharqdldtx64qam;
	@Column
	private String pmmacharqdldtxqpsk;
	@Column
	private String pmmacharqdlnack;
	@Column
	private String pmmacharqdlnack16qam;
	@Column
	private String pmmacharqdlnack256qam;
	@Column
	private String pmmacharqdlnack64qam;
	@Column
	private String pmmacharqdlnackcomp;
	@Column
	private String pmmacharqdlnackqpsk;
	@Column
	private String pmmacharqfail;
	@Column
	private String pmmacharqulack;
	@Column
	private String pmmacharquldtx;
	@Column
	private String pmmacharquldtx16qam;
	@Column
	private String pmmacharquldtx64qam;
	@Column
	private String pmmacharquldtxqpsk;
	@Column
	private String pmmacharqulfail16qam;
	@Column
	private String pmmacharqulfail64qam;
	@Column
	private String pmmacharqulfailqpsk;
	@Column
	private String pmmacharqulnack;
	@Column
	private String pmmacharqulsucc16qam;
	@Column
	private String pmmacharqulsucc64qam;
	@Column
	private String pmmacharqulsuccqpsk;
	@Column
	private String pmmaclattimeqcidldrxnosyncsamp;
	@Column
	private String pmmaclattimeqcidldrxnosyncsum;
	@Column
	private String pmmaclattimeqcidldrxsyncsamp;
	@Column
	private String pmmaclattimeqcidldrxsyncsum;
	@Column
	private String pmmaclattimeqcidlnodrxsyncsamp;
	@Column
	private String pmmaclattimeqcidlnodrxsyncsum;
	@Column
	private String pmmaclattimeqcidlsamp;
	@Column
	private String pmmaclattimeqcidlsum;
	@Column
	private String pmmacuethptimedl;
	@Column
	private String pmmacuethptimeul;
	@Column
	private String pmmacuethpvoldl;
	@Column
	private String pmmacuethpvolul;
	@Column
	private String pmmacvoldl;
	@Column
	private String pmmacvolul;
	@Column
	private String pmmeasgapfaillicinterfotdoa;
	@Column
	private String pmmeasmissingneighrel;
	@Column
	private String pmmeasrep;
	@Column
	private String pmmeasrepdiscdlcomp;
	@Column
	private String pmmeasrepdlcomp;
	@Column
	private String pmmimosleepopptime;
	@Column
	private String pmmimosleeptime;
	@Column
	private String pmnastransferattabortdlsrb2;
	@Column
	private String pmnastransferattdlsrb2;
	@Column
	private String pmnastransfersuccdlsrb2;
	@Column
	private String pmoocnewdataulgrants;
	@Column
	private String pmoocstateentries;
	@Column
	private String pmoocstateexits;
	@Column
	private String pmoocstateexitsuerel;
	@Column
	private String pmoocueslevsum;
	@Column
	private String pmoutofsynctimepft;
	@Column
	private String pmpagdiscarded;
	@Column
	private String pmpagreceived;
	@Column
	private String pmpdcchcceactivity;
	@Column
	private String pmpdcchmaxcceavail;
	@Column
	private String pmpdcchresyncatt;
	@Column
	private String pmpdcchresyncfail;
	@Column
	private String pmpdcchresyncsucc;
	@Column
	private String pmpdcchtxaggressive;
	@Column
	private String pmpdcchtxconservative;
	@Column
	private String pmpdcpbitratedldrbmax;
	@Column
	private String pmpdcpbitratedldrbmin;
	@Column
	private String pmpdcpbitrateuldrbmax;
	@Column
	private String pmpdcpbitrateuldrbmin;
	@Column
	private String pmpdcpdelaytimedl;
	@Column
	private String pmPdcpLatPktTransDl;
	@Column
	private String pmpdcplatpkttransdldrxnosync;
	@Column
	private String pmpdcplatpkttransdldrxsync;
	@Column
	private String pmpdcplatpkttransdlnodrxsync;
	@Column
	private String pmPdcpLatTimeDl;
	@Column
	private String pmpdcplattimedldrxnosync;
	@Column
	private String pmpdcplattimedldrxsync;
	@Column
	private String pmpdcplattimedlnodrxsync;
	@Column
	private String pmpdcppktdiscdlaqm;
	@Column
	private String pmpdcppktdiscdlho;
	@Column
	private String pmpdcppktdiscdlpelr;
	@Column
	private String pmpdcppktdiscdlpelruu;
	@Column
	private String pmpdcppktfwddl;
	@Column
	private String pmPdcpPktLostUl;
	@Column
	private String pmpdcppktlostullimitations;
	@Column
	private String pmpdcppktpdbulokvoip;
	@Column
	private String pmpdcppktreceiveddl;
	@Column
	private String pmPdcpPktReceivedUl;
	@Column
	private String pmpdcppkttransdl;
	@Column
	private String pmPdcpVolDlDrb;
	@Column
	private String pmpdcpvoldldrbca;
	@Column
	private String pmPdcpVolDlDrbLastTTI;
	@Column
	private String pmpdcpvoldldrblastttica;
	@Column
	private String pmpdcpvoldldrbtrans;
	@Column
	private String pmpdcpvoldldrbtransplmn0;
	@Column
	private String pmpdcpvoldldrbtransplmn1;
	@Column
	private String pmpdcpvoldldrbtransplmn2;
	@Column
	private String pmpdcpvoldldrbtransplmn3;
	@Column
	private String pmpdcpvoldldrbtransplmn4;
	@Column
	private String pmpdcpvoldldrbtransplmn5;
	@Column
	private String pmpdcpvoldldrbtransplmn6;
	@Column
	private String pmpdcpvoldldrbtransum;
	@Column
	private String pmpdcpvoldlsrb;
	@Column
	private String pmpdcpvoldlsrbtrans;
	@Column
	private String pmPdcpVolUlDrb;
	@Column
	private String pmpdcpvoluldrblasttti;
	@Column
	private String pmpdcpvoluldrbplmn0;
	@Column
	private String pmpdcpvoluldrbplmn1;
	@Column
	private String pmpdcpvoluldrbplmn2;
	@Column
	private String pmpdcpvoluldrbplmn3;
	@Column
	private String pmpdcpvoluldrbplmn4;
	@Column
	private String pmpdcpvoluldrbplmn5;
	@Column
	private String pmpdcpvoluldrbplmn6;
	@Column
	private String pmpdcpvolulsrb;
	@Column
	private String pmpftestablishedsession;
	@Column
	private String pmprbavaildl;
	@Column
	private String pmprbavaildlmbms;
	@Column
	private String pmprbavailul;
	@Column
	private String pmprbuseddl;
	@Column
	private String pmprbuseddlailghighprio;
	@Column
	private String pmprbuseddlailgtot;
	@Column
	private String pmprbuseddlbcch;
	@Column
	private String pmprbuseddlccch;
	@Column
	private String pmprbuseddldtch;
	@Column
	private String pmprbuseddlfirsttrans;
	@Column
	private String pmprbuseddlmax;
	@Column
	private String pmprbuseddlmbms;
	@Column
	private String pmprbuseddlpcch;
	@Column
	private String pmprbuseddlretrans;
	@Column
	private String pmprbuseddlsamp;
	@Column
	private String pmprbuseddlsrb;
	@Column
	private String pmprbuseddlsrbfirsttrans;
	@Column
	private String pmprbuseddlsum;
	@Column
	private String pmprbusedul;
	@Column
	private String pmprbusedulailgtot;
	@Column
	private String pmprbusedulccch;
	@Column
	private String pmprbuseduldtch;
	@Column
	private String pmprbusedulmax;
	@Column
	private String pmprbusedulsamp;
	@Column
	private String pmprbusedulsrb;
	@Column
	private String pmprbusedulsum;
	@Column
	private String pmpucchcqireslongutilcell;
	@Column
	private String pmpucchcqiresmediumutilcell;
	@Column
	private String pmpucchcqiresshortutilcell;
	@Column
	private String pmpucchfailsr;
	@Column
	private String pmpucchsr;
	@Column
	private String pmpucchsrcqiresallocatt;
	@Column
	private String pmpucchsrcqirescongcqi;
	@Column
	private String pmpucchsrcqirescongsr;
	@Column
	private String pmpucchsrmax;
	@Column
	private String pmpucchsrreslongutilcell;
	@Column
	private String pmpucchsrresmediumutilcell;
	@Column
	private String pmpucchsrresshortutilcell;
	@Column
	private String pmpwrboostattlowcovue;
	@Column
	private String pmpwrboostsucclowcovue;
	@Column
	private String pmraaccharqfailaftercontres;
	@Column
	private String pmraaccharqfailwithincontres;
	@Column
	private String pmraalloccfra;
	@Column
	private String pmraattcbra;
	@Column
	private String pmraattcfra;
	@Column
	private String pmrachnumcontentionreport;
	@Column
	private String pmracontresandrrcrsp;
	@Column
	private String pmracontresonly;
	@Column
	private String pmradiorecinterferencepwrprb1;
	@Column
	private String pmradiorecinterferencepwrprb10;
	@Column
	private String pmradiorecinterferencepwrprb100;
	@Column
	private String pmradiorecinterferencepwrprb11;
	@Column
	private String pmradiorecinterferencepwrprb12;
	@Column
	private String pmradiorecinterferencepwrprb13;
	@Column
	private String pmradiorecinterferencepwrprb14;
	@Column
	private String pmradiorecinterferencepwrprb15;
	@Column
	private String pmradiorecinterferencepwrprb16;
	@Column
	private String pmradiorecinterferencepwrprb17;
	@Column
	private String pmradiorecinterferencepwrprb18;
	@Column
	private String pmradiorecinterferencepwrprb19;
	@Column
	private String pmradiorecinterferencepwrprb2;
	@Column
	private String pmradiorecinterferencepwrprb20;
	@Column
	private String pmradiorecinterferencepwrprb21;
	@Column
	private String pmradiorecinterferencepwrprb22;
	@Column
	private String pmradiorecinterferencepwrprb23;
	@Column
	private String pmradiorecinterferencepwrprb24;
	@Column
	private String pmradiorecinterferencepwrprb25;
	@Column
	private String pmradiorecinterferencepwrprb26;
	@Column
	private String pmradiorecinterferencepwrprb27;
	@Column
	private String pmradiorecinterferencepwrprb28;
	@Column
	private String pmradiorecinterferencepwrprb29;
	@Column
	private String pmradiorecinterferencepwrprb3;
	@Column
	private String pmradiorecinterferencepwrprb30;
	@Column
	private String pmradiorecinterferencepwrprb31;
	@Column
	private String pmradiorecinterferencepwrprb32;
	@Column
	private String pmradiorecinterferencepwrprb33;
	@Column
	private String pmradiorecinterferencepwrprb34;
	@Column
	private String pmradiorecinterferencepwrprb35;
	@Column
	private String pmradiorecinterferencepwrprb36;
	@Column
	private String pmradiorecinterferencepwrprb37;
	@Column
	private String pmradiorecinterferencepwrprb38;
	@Column
	private String pmradiorecinterferencepwrprb39;
	@Column
	private String pmradiorecinterferencepwrprb4;
	@Column
	private String pmradiorecinterferencepwrprb40;
	@Column
	private String pmradiorecinterferencepwrprb41;
	@Column
	private String pmradiorecinterferencepwrprb42;
	@Column
	private String pmradiorecinterferencepwrprb43;
	@Column
	private String pmradiorecinterferencepwrprb44;
	@Column
	private String pmradiorecinterferencepwrprb45;
	@Column
	private String pmradiorecinterferencepwrprb46;
	@Column
	private String pmradiorecinterferencepwrprb47;
	@Column
	private String pmradiorecinterferencepwrprb48;
	@Column
	private String pmradiorecinterferencepwrprb49;
	@Column
	private String pmradiorecinterferencepwrprb5;
	@Column
	private String pmradiorecinterferencepwrprb50;
	@Column
	private String pmradiorecinterferencepwrprb51;
	@Column
	private String pmradiorecinterferencepwrprb52;
	@Column
	private String pmradiorecinterferencepwrprb53;
	@Column
	private String pmradiorecinterferencepwrprb54;
	@Column
	private String pmradiorecinterferencepwrprb55;
	@Column
	private String pmradiorecinterferencepwrprb56;
	@Column
	private String pmradiorecinterferencepwrprb57;
	@Column
	private String pmradiorecinterferencepwrprb58;
	@Column
	private String pmradiorecinterferencepwrprb59;
	@Column
	private String pmradiorecinterferencepwrprb6;
	@Column
	private String pmradiorecinterferencepwrprb60;
	@Column
	private String pmradiorecinterferencepwrprb61;
	@Column
	private String pmradiorecinterferencepwrprb62;
	@Column
	private String pmradiorecinterferencepwrprb63;
	@Column
	private String pmradiorecinterferencepwrprb64;
	@Column
	private String pmradiorecinterferencepwrprb65;
	@Column
	private String pmradiorecinterferencepwrprb66;
	@Column
	private String pmradiorecinterferencepwrprb67;
	@Column
	private String pmradiorecinterferencepwrprb68;
	@Column
	private String pmradiorecinterferencepwrprb69;
	@Column
	private String pmradiorecinterferencepwrprb7;
	@Column
	private String pmradiorecinterferencepwrprb70;
	@Column
	private String pmradiorecinterferencepwrprb71;
	@Column
	private String pmradiorecinterferencepwrprb72;
	@Column
	private String pmradiorecinterferencepwrprb73;
	@Column
	private String pmradiorecinterferencepwrprb74;
	@Column
	private String pmradiorecinterferencepwrprb75;
	@Column
	private String pmradiorecinterferencepwrprb76;
	@Column
	private String pmradiorecinterferencepwrprb77;
	@Column
	private String pmradiorecinterferencepwrprb78;
	@Column
	private String pmradiorecinterferencepwrprb79;
	@Column
	private String pmradiorecinterferencepwrprb8;
	@Column
	private String pmradiorecinterferencepwrprb80;
	@Column
	private String pmradiorecinterferencepwrprb81;
	@Column
	private String pmradiorecinterferencepwrprb82;
	@Column
	private String pmradiorecinterferencepwrprb83;
	@Column
	private String pmradiorecinterferencepwrprb84;
	@Column
	private String pmradiorecinterferencepwrprb85;
	@Column
	private String pmradiorecinterferencepwrprb86;
	@Column
	private String pmradiorecinterferencepwrprb87;
	@Column
	private String pmradiorecinterferencepwrprb88;
	@Column
	private String pmradiorecinterferencepwrprb89;
	@Column
	private String pmradiorecinterferencepwrprb9;
	@Column
	private String pmradiorecinterferencepwrprb90;
	@Column
	private String pmradiorecinterferencepwrprb91;
	@Column
	private String pmradiorecinterferencepwrprb92;
	@Column
	private String pmradiorecinterferencepwrprb93;
	@Column
	private String pmradiorecinterferencepwrprb94;
	@Column
	private String pmradiorecinterferencepwrprb95;
	@Column
	private String pmradiorecinterferencepwrprb96;
	@Column
	private String pmradiorecinterferencepwrprb97;
	@Column
	private String pmradiorecinterferencepwrprb98;
	@Column
	private String pmradiorecinterferencepwrprb99;
	@Column
	private String pmradiotbspwrrestricted;
	@Column
	private String pmradiotbspwrunrestricted;
	@Column
	private String pmradiothpresdl;
	@Column
	private String pmradiothpresdlseltbs;
	@Column
	private String pmradiothpresul;
	@Column
	private String pmradiothpresulseltbs;
	@Column
	private String pmRadioThpVolDl;
	@Column
	private String pmradiothpvoldlscell;
	@Column
	private String pmradiothpvoldlscellext;
	@Column
	private String pmradiothpvoldlseltbs;
	@Column
	private String pmradiothpvoltxdlscell;
	@Column
	private String pmradiothpvoltxdlscellext;
	@Column
	private String pmRadioThpVolUl;
	@Column
	private String pmradiothpvolulscell;
	@Column
	private String pmradiothpvolulseltbs;
	@Column
	private String pmradiouerepcqi2subband0sum;
	@Column
	private String pmradiouerepcqi2subband10sum;
	@Column
	private String pmradiouerepcqi2subband11sum;
	@Column
	private String pmradiouerepcqi2subband12sum;
	@Column
	private String pmradiouerepcqi2subband1sum;
	@Column
	private String pmradiouerepcqi2subband2sum;
	@Column
	private String pmradiouerepcqi2subband3sum;
	@Column
	private String pmradiouerepcqi2subband4sum;
	@Column
	private String pmradiouerepcqi2subband5sum;
	@Column
	private String pmradiouerepcqi2subband6sum;
	@Column
	private String pmradiouerepcqi2subband7sum;
	@Column
	private String pmradiouerepcqi2subband8sum;
	@Column
	private String pmradiouerepcqi2subband9sum;
	@Column
	private String pmradiouerepcqi2subbandsamp;
	@Column
	private String pmradiouerepcqisubband0sum;
	@Column
	private String pmradiouerepcqisubband10sum;
	@Column
	private String pmradiouerepcqisubband11sum;
	@Column
	private String pmradiouerepcqisubband12sum;
	@Column
	private String pmradiouerepcqisubband1sum;
	@Column
	private String pmradiouerepcqisubband2sum;
	@Column
	private String pmradiouerepcqisubband3sum;
	@Column
	private String pmradiouerepcqisubband4sum;
	@Column
	private String pmradiouerepcqisubband5sum;
	@Column
	private String pmradiouerepcqisubband6sum;
	@Column
	private String pmradiouerepcqisubband7sum;
	@Column
	private String pmradiouerepcqisubband8sum;
	@Column
	private String pmradiouerepcqisubband9sum;
	@Column
	private String pmradiouerepcqisubbandsamp;
	@Column
	private String pmrafailcbramsg1discooc;
	@Column
	private String pmrafailcbramsg1discsched;
	@Column
	private String pmrafailcbramsg2disc;
	@Column
	private String pmrafailcframsg1discooc;
	@Column
	private String pmrafailcframsg1discsched;
	@Column
	private String pmrafailcframsg2disc;
	@Column
	private String pmramsg2attcbra;
	@Column
	private String pmrarejharqfailaftercontres;
	@Column
	private String pmrarejharqfailwithincontres;
	@Column
	private String pmrasucccbra;
	@Column
	private String pmrasucccfra;
	@Column
	private String pmrasuccsrinsync;
	@Column
	private String pmrasuccsroutofsync;
	@Column
	private String pmrasuccsroutofsyncpft;
	@Column
	private String pmrateshapetimeul;
	@Column
	private String pmraunassignedcfrafalse;
	@Column
	private String pmraunassignedcfrasum;
	@Column
	private String pmrlcarqdlack;
	@Column
	private String pmrlcarqdlnack;
	@Column
	private String pmrlcarqulack;
	@Column
	private String pmrlcarqulnack;
	@Column
	private String pmrlcarqvoldlretrans;
	@Column
	private String pmrlcarqvolulnack;
	@Column
	private String pmrlcarqvolulreceived;
	@Column
	private String pmrlcdelaypkttransdl;
	@Column
	private String pmrlcdelaytimedl;
	@Column
	private String pmrlcpollretxdl;
	@Column
	private String pmrlcpollretxul;
	@Column
	private String pmrlcvoldl;
	@Column
	private String pmrlcvolul;
	@Column
	private String pmrohcestabfailcid;
	@Column
	private String pmrohcestabfaillic;
	@Column
	private String pmrohcestabfailuecap;
	@Column
	private String pmRrcConnEstabAtt;
	@Column
	private String pmrrcconnestabattdta;
	@Column
	private String pmrrcconnestabattem;
	@Column
	private String pmrrcconnestabatthpa;
	@Column
	private String pmrrcconnestabattmod;
	@Column
	private String pmrrcconnestabattmos;
	@Column
	private String pmrrcconnestabattmta;
	@Column
	private String pmRrcConnEstabAttReatt;
	@Column
	private String pmrrcconnestabattreattdta;
	@Column
	private String pmrrcconnestabattreattem;
	@Column
	private String pmrrcconnestabattreatthpa;
	@Column
	private String pmrrcconnestabattreattmod;
	@Column
	private String pmrrcconnestabattreattmos;
	@Column
	private String pmrrcconnestabattreattmta;
	@Column
	private String pmrrcconnestabfailbeareradmissionrej;
	@Column
	private String pmrrcconnestabfailcellintensdlc;
	@Column
	private String pmrrcconnestabfailcellintensstat;
	@Column
	private String pmrrcconnestabfailcellintensswc;
	@Column
	private String pmrrcconnestabfailcelllatency;
	@Column
	private String pmrrcconnestabfailduintens;
	@Column
	private String pmrrcconnestabfailduswc;
	@Column
	private String pmrrcconnestabfaildynueadmctrl;
	@Column
	private String pmrrcconnestabfailhighload;
	@Column
	private String pmrrcconnestabfailhighloadlong;
	@Column
	private String pmrrcconnestabfaillic;
	@Column
	private String pmrrcconnestabfaillicactiveusers;
	@Column
	private String pmrrcconnestabfaillowcovueadmctrl;
	@Column
	private String pmrrcconnestabfaillowcovuelic;
	@Column
	private String pmrrcconnestabfailmisigqcong;
	@Column
	private String pmrrcconnestabfailmmeovlmod;
	@Column
	private String pmrrcconnestabfailmmeovlmos;
	@Column
	private String pmrrcconnestabfailmpoverload;
	@Column
	private String pmrrcconnestabfailoverload;
	@Column
	private String pmrrcconnestablowcovueatt;
	@Column
	private String pmrrcconnestablowcovuesucc;
	@Column
	private String pmRrcConnEstabSucc;
	@Column
	private String pmrrcconnestabsuccdta;
	@Column
	private String pmrrcconnestabsuccem;
	@Column
	private String pmrrcconnestabsuccgummeinative;
	@Column
	private String pmrrcconnestabsucchpa;
	@Column
	private String pmrrcconnestabsuccmod;
	@Column
	private String pmrrcconnestabsuccmos;
	@Column
	private String pmrrcconnestabsuccmta;
	@Column
	private String pmrrcconnlevsamp;
	@Column
	private String pmrrcconnlevsum;
	@Column
	private String pmrrcconnlevsumuloutofsync;
	@Column
	private String pmrrcconnmax;
	@Column
	private String pmrrcconnreconfattnomob;
	@Column
	private String pmrrcconnreconfattnomobdlcomp;
	@Column
	private String pmrrcconnreconfattnomobearfcnca;
	@Column
	private String pmrrcconnreconfsuccnomob;
	@Column
	private String pmrrcconnreconfsuccnomobdlcomp;
	@Column
	private String pmrrcconnreconfsuccnomobearfcnca;
	@Column
	private String pmrrcconnreestatt;
	@Column
	private String pmrrcconnreestattho;
	@Column
	private String pmrrcconnreestfaildynueadmctrl;
	@Column
	private String pmrrcconnreestfaillicmtreest;
	@Column
	private String pmrrcconnreestfailmisigqcong;
	@Column
	private String pmrrcconnreestsucc;
	@Column
	private String pmrrcconnreestsuccho;
	@Column
	private String pmrrcconnrelabnormalenb;
	@Column
	private String pmrrcconnrelabnormalenbact;
	@Column
	private String pmrrcconnrelabnormalenbacttnfail;
	@Column
	private String pmrrcconnrelnormalenb;
	@Column
	private String pmrrcconnrelnormalmme;
	@Column
	private String pmrrcconntuneoutlevsamp;
	@Column
	private String pmrrcconntuneoutlevsum;
	@Column
	private String pmS1SigConnEstabAtt;
	@Column
	private String pms1sigconnestabattdta;
	@Column
	private String pms1sigconnestabattem;
	@Column
	private String pms1sigconnestabatthpa;
	@Column
	private String pms1sigconnestabattmod;
	@Column
	private String pms1sigconnestabattmos;
	@Column
	private String pms1sigconnestabattmta;
	@Column
	private String pms1sigconnestabfailmmeovlmos;
	@Column
	private String pmS1SigConnEstabSucc;
	@Column
	private String pms1sigconnestabsuccdta;
	@Column
	private String pms1sigconnestabsuccem;
	@Column
	private String pms1sigconnestabsucchpa;
	@Column
	private String pms1sigconnestabsuccmod;
	@Column
	private String pms1sigconnestabsuccmos;
	@Column
	private String pms1sigconnestabsuccmta;
	@Column
	private String pmSchedActivityCellDl;
	@Column
	private String pmSchedActivityCellUl;
	@Column
	private String pmschedactivityuedl;
	@Column
	private String pmschedactivityueul;
	@Column
	private String pmschedactivityultti;
	@Column
	private String pmschedrestrictuecatdl;
	@Column
	private String pmschedrestrictuecatul;
	@Column
	private String pmservicetimedrb;
	@Column
	private String pmservicetimeue;
	@Column
	private String pmsessiontimedrb;
	@Column
	private String pmSessionTimeUe;
	@Column
	private String pmttibundlingdisable;
	@Column
	private String pmttibundlingenable;
	@Column
	private String pmttibundlingfailto;
	@Column
	private String pmttibundlinguemax;
	@Column
	private String pmttibundlinguesamp;
	@Column
	private String pmttibundlinguesum;
	@Column
	private String pmuectxtestabatt;
	@Column
	private String pmuectxtestabattcsfb;
	@Column
	private String pmuectxtestabsucc;
	@Column
	private String pmuectxtfetchatt;
	@Column
	private String pmuectxtfetchattintraenbhoexe;
	@Column
	private String pmuectxtfetchattintraenbhoprep;
	@Column
	private String pmuectxtfetchattnastransferdl;
	@Column
	private String pmuectxtfetchattnoneighrel;
	@Column
	private String pmuectxtfetchattreconf;
	@Column
	private String pmuectxtfetchatts1hoexe;
	@Column
	private String pmuectxtfetchatts1hoexesrvccgeran;
	@Column
	private String pmuectxtfetchatts1hoexesrvccutran;
	@Column
	private String pmuectxtfetchatts1hoprep;
	@Column
	private String pmuectxtfetchatts1hoprepsrvccgeran;
	@Column
	private String pmuectxtfetchatts1hoprepsrvccutran;
	@Column
	private String pmuectxtfetchattx2hoexe;
	@Column
	private String pmuectxtfetchattx2hoprep;
	@Column
	private String pmuectxtfetchsucc;
	@Column
	private String pmuectxtfetchsuccintraenbhoexe;
	@Column
	private String pmuectxtfetchsuccintraenbhoprep;
	@Column
	private String pmuectxtfetchsuccnastransferdl;
	@Column
	private String pmuectxtfetchsuccnoneighrel;
	@Column
	private String pmuectxtfetchsuccreconf;
	@Column
	private String pmuectxtfetchsuccs1hoexe;
	@Column
	private String pmuectxtfetchsuccs1hoexesrvccgeran;
	@Column
	private String pmuectxtfetchsuccs1hoexesrvccutran;
	@Column
	private String pmuectxtfetchsuccs1hoprep;
	@Column
	private String pmuectxtfetchsuccs1hoprepsrvccgeran;
	@Column
	private String pmuectxtfetchsuccs1hoprepsrvccutran;
	@Column
	private String pmuectxtfetchsuccx2hoexe;
	@Column
	private String pmuectxtfetchsuccx2hoprep;
	@Column
	private String pmuectxtmodattcsfb;
	@Column
	private String pmuectxtrelabnormalenb;
	@Column
	private String pmuectxtrelabnormalenbact;
	@Column
	private String pmuectxtrelabnormalenbactcdt;
	@Column
	private String pmuectxtrelabnormalenbactcdtauto;
	@Column
	private String pmuectxtrelabnormalenbactcdtautopnr;
	@Column
	private String pmuectxtrelabnormalenbactho;
	@Column
	private String pmuectxtrelabnormalenbacthooos;
	@Column
	private String pmuectxtrelabnormalenbacthooospft;
	@Column
	private String pmuectxtrelabnormalenbactoos;
	@Column
	private String pmuectxtrelabnormalenbactoospft;
	@Column
	private String pmuectxtrelabnormalenbactpe;
	@Column
	private String pmuectxtrelabnormalenbacttnfail;
	@Column
	private String pmuectxtrelabnormalenbactuelost;
	@Column
	private String pmuectxtrelabnormalenbactuelostoos;
	@Column
	private String pmuectxtrelabnormalenbactuelostoospft;
	@Column
	private String pmuectxtrelabnormalenbcdt;
	@Column
	private String pmuectxtrelabnormalenbcdtauto;
	@Column
	private String pmuectxtrelabnormalenbcdtautopnr;
	@Column
	private String pmuectxtrelabnormalenbho;
	@Column
	private String pmuectxtrelabnormalenbhooos;
	@Column
	private String pmuectxtrelabnormalenbhooospft;
	@Column
	private String pmuectxtrelabnormalenblic;
	@Column
	private String pmuectxtrelabnormalenboos;
	@Column
	private String pmuectxtrelabnormalenboospft;
	@Column
	private String pmuectxtrelabnormalenbpe;
	@Column
	private String pmuectxtrelabnormalenbsir;
	@Column
	private String pmuectxtrelabnormalenbtuneout;
	@Column
	private String pmuectxtrelabnormalenbuelost;
	@Column
	private String pmuectxtrelabnormalenbuelostoos;
	@Column
	private String pmuectxtrelabnormalenbuelostoospft;
	@Column
	private String pmuectxtrelabnormalmme;
	@Column
	private String pmuectxtrelabnormalmmeact;
	@Column
	private String pmuectxtrelcsfbcdma1xrtt;
	@Column
	private String pmuectxtrelcsfbcdma1xrttem;
	@Column
	private String pmuectxtrelcsfbgsm;
	@Column
	private String pmuectxtrelcsfbgsmem;
	@Column
	private String pmuectxtrelcsfbhoprepfail1xrtt;
	@Column
	private String pmuectxtrelcsfbhoprepfail1xrttem;
	@Column
	private String pmuectxtrelcsfblimiteddualradiouecdma;
	@Column
	private String pmuectxtrelcsfbmeasto1xrtt;
	@Column
	private String pmuectxtrelcsfbmeasto1xrttem;
	@Column
	private String pmuectxtrelcsfbtdscdma;
	@Column
	private String pmuectxtrelcsfbtdscdmaem;
	@Column
	private String pmuectxtrelcsfbulhopreptxto1xrtt;
	@Column
	private String pmuectxtrelcsfbulhopreptxto1xrttem;
	@Column
	private String pmuectxtrelcsfbwcdma;
	@Column
	private String pmuectxtrelcsfbwcdmaem;
	@Column
	private String pmuectxtrelmme;
	@Column
	private String pmuectxtrelmmeact;
	@Column
	private String pmuectxtrelmmeactho;
	@Column
	private String pmuectxtrelmmeho;
	@Column
	private String pmuectxtrelnacccsfbgsm;
	@Column
	private String pmuectxtrelnacccsfbgsmem;
	@Column
	private String pmuectxtrelnacccsfbwcdma;
	@Column
	private String pmuectxtrelnacccsfbwcdmaem;
	@Column
	private String pmuectxtrelnaccscgsm;
	@Column
	private String pmuectxtrelnaccscwcdma;
	@Column
	private String pmuectxtrelnormalenb;
	@Column
	private String pmuectxtrelnormalenbact;
	@Column
	private String pmuectxtrelnormalenbtuneout;
	@Column
	private String pmuectxtrelsc1xrttulsinr;
	@Column
	private String pmuectxtrelsccdma;
	@Column
	private String pmuectxtrelsccdmaa2rsrp;
	@Column
	private String pmuectxtrelsccdmaa2rsrq;
	@Column
	private String pmuectxtrelsccdmab2rsrp;
	@Column
	private String pmuectxtrelsccdmab2rsrq;
	@Column
	private String pmuectxtrelsccdmaulsinr;
	@Column
	private String pmuectxtrelsceutra;
	@Column
	private String pmuectxtrelsceutraa2rsrp;
	@Column
	private String pmuectxtrelsceutraa2rsrq;
	@Column
	private String pmuectxtrelsceutrabestcellrsrp;
	@Column
	private String pmuectxtrelsceutrabestcellrsrq;
	@Column
	private String pmuectxtrelsceutraulsinr;
	@Column
	private String pmuectxtrelscgsm;
	@Column
	private String pmuectxtrelscgsma2rsrp;
	@Column
	private String pmuectxtrelscgsma2rsrq;
	@Column
	private String pmuectxtrelscgsmb2rsrp;
	@Column
	private String pmuectxtrelscgsmb2rsrq;
	@Column
	private String pmuectxtrelscgsmulsinr;
	@Column
	private String pmuectxtrelsctdscdma;
	@Column
	private String pmuectxtrelscutrana2rsrp;
	@Column
	private String pmuectxtrelscutrana2rsrq;
	@Column
	private String pmuectxtrelscutranb2rsrp;
	@Column
	private String pmuectxtrelscutranb2rsrq;
	@Column
	private String pmuectxtrelscutraulsinr;
	@Column
	private String pmuectxtrelscwcdma;
	@Column
	private String pmuectxtrelsrvcca2critical1xrtt;
	@Column
	private String pmuectxtrelsrvccmeasto1xrtt;
	@Column
	private String pmuectxtretainarphigh;
	@Column
	private String pmuemeasattcsfb1xrtt;
	@Column
	private String pmuemeasattcsfb1xrttem;
	@Column
	private String pmUeThpTimeDl;
	@Column
	private String pmuethptimedlca;
	@Column
	private String pmUeThpTimeUl;
	@Column
	private String pmuethptimeulca;
	@Column
	private String pmuethptimeulrs;
	@Column
	private String pmUeThpVolUl;
	@Column
	private String pmuethpvolulca;
	@Column
	private String pmulgrantsdetectedpuschndo;
	@Column
	private String pmulgrantsdetectedpuschvoltendo;
	@Column
	private String pmulgrantstrans;
	@Column
	private String pmulgrantstransndo;
	@Column
	private String pmulgrantstransnoack;
	@Column
	private String pmulgrantstranspcell;
	@Column
	private String pmulgrantstranspcellnoack;
	@Column
	private String pmulgrantstransvolte;
	@Column
	private String pmulgrantstransvoltendo;
	@Column
	private String pmulgrantstransvoltenoack;
	@Column
	private String pmulgrantswithdetectedpusch;
	@Column
	private String pmulgrantswithdetectedpuschpcell;
	@Column
	private String pmulgrantswithdetectedpuschvolte;
	@Column
	private String pmunackeduerelease;
	@Column
	private String pmvoipqualityrbullowsampl;
	@Column
	private String pmvoipqualityrbulnok;
	@Column
	private String pmvoipqualityrbulok;
	@Column
	private String pmvoipqualityueullowsampl;
	@Column
	private String pmVoipQualityUeUlNok;
	@Column
	private String pmVoipQualityUeUlOk;
	@Column
	private String pmwifiaccessallowed;
	@Column
	private String pmwifiaccessdecisionbywic;
	@Column
	private String pmwifiaccesseval;
	@Column
	private String pmwifiaccessevalfaillic;
	@Column
	private String pmwifiaccessrej;
	@Column
	private String pmztemporary1;
	@Column
	private String pmztemporary10;
	@Column
	private String pmztemporary11;
	@Column
	private String pmztemporary110;
	@Column
	private String pmztemporary111;
	@Column
	private String pmztemporary112;
	@Column
	private String pmztemporary113;
	@Column
	private String pmztemporary114;
	@Column
	private String pmztemporary115;
	@Column
	private String pmztemporary116;
	@Column
	private String pmztemporary117;
	@Column
	private String pmztemporary118;
	@Column
	private String pmztemporary119;
	@Column
	private String pmztemporary12;
	@Column
	private String pmztemporary120;
	@Column
	private String pmztemporary121;
	@Column
	private String pmztemporary122;
	@Column
	private String pmztemporary123;
	@Column
	private String pmztemporary124;
	@Column
	private String pmztemporary125;
	@Column
	private String pmztemporary126;
	@Column
	private String pmztemporary127;
	@Column
	private String pmztemporary128;
	@Column
	private String pmztemporary129;
	@Column
	private String pmztemporary13;
	@Column
	private String pmztemporary130;
	@Column
	private String pmztemporary136;
	@Column
	private String pmztemporary137;
	@Column
	private String pmztemporary138;
	@Column
	private String pmztemporary139;
	@Column
	private String pmztemporary14;
	@Column
	private String pmztemporary140;
	@Column
	private String pmztemporary141;
	@Column
	private String pmztemporary142;
	@Column
	private String pmztemporary143;
	@Column
	private String pmztemporary144;
	@Column
	private String pmztemporary145;
	@Column
	private String pmztemporary146;
	@Column
	private String pmztemporary147;
	@Column
	private String pmztemporary148;
	@Column
	private String pmztemporary149;
	@Column
	private String pmztemporary15;
	@Column
	private String pmztemporary150;
	@Column
	private String pmztemporary160;
	@Column
	private String pmztemporary161;
	@Column
	private String pmztemporary167;
	@Column
	private String pmztemporary170;
	@Column
	private String pmztemporary171;
	@Column
	private String pmztemporary172;
	@Column
	private String pmztemporary173;
	@Column
	private String pmztemporary19;
	@Column
	private String pmztemporary2;
	@Column
	private String pmztemporary20;
	@Column
	private String pmztemporary21;
	@Column
	private String pmztemporary22;
	@Column
	private String pmztemporary23;
	@Column
	private String pmztemporary24;
	@Column
	private String pmztemporary25;
	@Column
	private String pmztemporary26;
	@Column
	private String pmztemporary27;
	@Column
	private String pmztemporary28;
	@Column
	private String pmztemporary29;
	@Column
	private String pmztemporary3;
	@Column
	private String pmztemporary30;
	@Column
	private String pmztemporary31;
	@Column
	private String pmztemporary32;
	@Column
	private String pmztemporary33;
	@Column
	private String pmztemporary4;
	@Column
	private String pmztemporary5;
	@Column
	private String pmztemporary57;
	@Column
	private String pmztemporary6;
	@Column
	private String pmztemporary60;
	@Column
	private String pmztemporary61;
	@Column
	private String pmztemporary62;
	@Column
	private String pmztemporary63;
	@Column
	private String pmztemporary64;
	@Column
	private String pmztemporary65;
	@Column
	private String pmztemporary66;
	@Column
	private String pmztemporary67;
	@Column
	private String pmztemporary68;
	@Column
	private String pmztemporary69;
	@Column
	private String pmztemporary7;
	@Column
	private String pmztemporary70;
	@Column
	private String pmztemporary71;
	@Column
	private String pmztemporary8;
	@Column
	private String pmztemporary84;
	@Column
	private String pmztemporary85;
	@Column
	private String pmztemporary86;
	@Column
	private String pmztemporary87;
	@Column
	private String pmztemporary88;
	@Column
	private String pmztemporary89;
	@Column
	private String pmztemporary9;
	@Column
	private String pmztemporary90;
	@Column
	private String pmztemporary91;
	@Column
	private String pmztemporary92;
	@Column
	private String pmztemporary93;
	@Column
	private String rowstatus;
	@Column
	private String session_id;
	@Column
	private String sn;
	@Column
	private String timelevel;
	@Column
	private String utc_datetime_id;
	@Column
	private String year_id;
	/**
	 * @return the batch_id
	 */
	public String getBatch_id() {
		return batch_id;
	}
	/**
	 * @param batch_id the batch_id to set
	 */
	public void setBatch_id(String batch_id) {
		this.batch_id = batch_id;
	}
	/**
	 * @return the date_id
	 */
	public String getDate_id() {
		return date_id;
	}
	/**
	 * @param date_id the date_id to set
	 */
	public void setDate_id(String date_id) {
		this.date_id = date_id;
	}
	/**
	 * @return the datetime_id
	 */
	public String getDatetime_id() {
		return datetime_id;
	}
	/**
	 * @param datetime_id the datetime_id to set
	 */
	public void setDatetime_id(String datetime_id) {
		this.datetime_id = datetime_id;
	}
	/**
	 * @return the day_id
	 */
	public String getDay_id() {
		return day_id;
	}
	/**
	 * @param day_id the day_id to set
	 */
	public void setDay_id(String day_id) {
		this.day_id = day_id;
	}
	/**
	 * @return the dc_release
	 */
	public String getDc_release() {
		return dc_release;
	}
	/**
	 * @param dc_release the dc_release to set
	 */
	public void setDc_release(String dc_release) {
		this.dc_release = dc_release;
	}
	/**
	 * @return the dc_source
	 */
	public String getDc_source() {
		return dc_source;
	}
	/**
	 * @param dc_source the dc_source to set
	 */
	public void setDc_source(String dc_source) {
		this.dc_source = dc_source;
	}
	/**
	 * @return the dc_suspectflag
	 */
	public String getDc_suspectflag() {
		return dc_suspectflag;
	}
	/**
	 * @param dc_suspectflag the dc_suspectflag to set
	 */
	public void setDc_suspectflag(String dc_suspectflag) {
		this.dc_suspectflag = dc_suspectflag;
	}
	/**
	 * @return the dc_timezone
	 */
	public String getDc_timezone() {
		return dc_timezone;
	}
	/**
	 * @param dc_timezone the dc_timezone to set
	 */
	public void setDc_timezone(String dc_timezone) {
		this.dc_timezone = dc_timezone;
	}
	/**
	 * @return the enodebfunction
	 */
	public String getEnodebfunction() {
		return enodebfunction;
	}
	/**
	 * @param enodebfunction the enodebfunction to set
	 */
	public void setEnodebfunction(String enodebfunction) {
		this.enodebfunction = enodebfunction;
	}
	/**
	 * @return the erbs
	 */
	public String getErbs() {
		return erbs;
	}
	/**
	 * @param erbs the erbs to set
	 */
	public void setErbs(String erbs) {
		this.erbs = erbs;
	}
	/**
	 * @return the eutrancellfdd
	 */
	public String getEutrancellfdd() {
		return eutrancellfdd;
	}
	/**
	 * @param eutrancellfdd the eutrancellfdd to set
	 */
	public void setEutrancellfdd(String eutrancellfdd) {
		this.eutrancellfdd = eutrancellfdd;
	}
	/**
	 * @return the hour_id
	 */
	public String getHour_id() {
		return hour_id;
	}
	/**
	 * @param hour_id the hour_id to set
	 */
	public void setHour_id(String hour_id) {
		this.hour_id = hour_id;
	}
	/**
	 * @return the min_id
	 */
	public String getMin_id() {
		return min_id;
	}
	/**
	 * @param min_id the min_id to set
	 */
	public void setMin_id(String min_id) {
		this.min_id = min_id;
	}
	/**
	 * @return the moid
	 */
	public String getMoid() {
		return moid;
	}
	/**
	 * @param moid the moid to set
	 */
	public void setMoid(String moid) {
		this.moid = moid;
	}
	/**
	 * @return the month_id
	 */
	public String getMonth_id() {
		return month_id;
	}
	/**
	 * @param month_id the month_id to set
	 */
	public void setMonth_id(String month_id) {
		this.month_id = month_id;
	}
	/**
	 * @return the nesw
	 */
	public String getNesw() {
		return nesw;
	}
	/**
	 * @param nesw the nesw to set
	 */
	public void setNesw(String nesw) {
		this.nesw = nesw;
	}
	/**
	 * @return the oss_id
	 */
	public String getOss_id() {
		return oss_id;
	}
	/**
	 * @param oss_id the oss_id to set
	 */
	public void setOss_id(String oss_id) {
		this.oss_id = oss_id;
	}
	/**
	 * @return the period_duration
	 */
	public String getPeriod_duration() {
		return period_duration;
	}
	/**
	 * @param period_duration the period_duration to set
	 */
	public void setPeriod_duration(String period_duration) {
		this.period_duration = period_duration;
	}
	/**
	 * @return the pma3interfbestcellevalreport
	 */
	public String getPma3interfbestcellevalreport() {
		return pma3interfbestcellevalreport;
	}
	/**
	 * @param pma3interfbestcellevalreport the pma3interfbestcellevalreport to set
	 */
	public void setPma3interfbestcellevalreport(String pma3interfbestcellevalreport) {
		this.pma3interfbestcellevalreport = pma3interfbestcellevalreport;
	}
	/**
	 * @return the pma3interfbestcellevalreportrsrp
	 */
	public String getPma3interfbestcellevalreportrsrp() {
		return pma3interfbestcellevalreportrsrp;
	}
	/**
	 * @param pma3interfbestcellevalreportrsrp the pma3interfbestcellevalreportrsrp to set
	 */
	public void setPma3interfbestcellevalreportrsrp(
			String pma3interfbestcellevalreportrsrp) {
		this.pma3interfbestcellevalreportrsrp = pma3interfbestcellevalreportrsrp;
	}
	/**
	 * @return the pma3interfbestcellevalreportul
	 */
	public String getPma3interfbestcellevalreportul() {
		return pma3interfbestcellevalreportul;
	}
	/**
	 * @param pma3interfbestcellevalreportul the pma3interfbestcellevalreportul to set
	 */
	public void setPma3interfbestcellevalreportul(
			String pma3interfbestcellevalreportul) {
		this.pma3interfbestcellevalreportul = pma3interfbestcellevalreportul;
	}
	/**
	 * @return the pma5bestcellevalreport
	 */
	public String getPma5bestcellevalreport() {
		return pma5bestcellevalreport;
	}
	/**
	 * @param pma5bestcellevalreport the pma5bestcellevalreport to set
	 */
	public void setPma5bestcellevalreport(String pma5bestcellevalreport) {
		this.pma5bestcellevalreport = pma5bestcellevalreport;
	}
	/**
	 * @return the pma5bestcellevalreportrsrp
	 */
	public String getPma5bestcellevalreportrsrp() {
		return pma5bestcellevalreportrsrp;
	}
	/**
	 * @param pma5bestcellevalreportrsrp the pma5bestcellevalreportrsrp to set
	 */
	public void setPma5bestcellevalreportrsrp(String pma5bestcellevalreportrsrp) {
		this.pma5bestcellevalreportrsrp = pma5bestcellevalreportrsrp;
	}
	/**
	 * @return the pma5bestcellevalreportul
	 */
	public String getPma5bestcellevalreportul() {
		return pma5bestcellevalreportul;
	}
	/**
	 * @param pma5bestcellevalreportul the pma5bestcellevalreportul to set
	 */
	public void setPma5bestcellevalreportul(String pma5bestcellevalreportul) {
		this.pma5bestcellevalreportul = pma5bestcellevalreportul;
	}
	/**
	 * @return the pmaccessclassbarringem
	 */
	public String getPmaccessclassbarringem() {
		return pmaccessclassbarringem;
	}
	/**
	 * @param pmaccessclassbarringem the pmaccessclassbarringem to set
	 */
	public void setPmaccessclassbarringem(String pmaccessclassbarringem) {
		this.pmaccessclassbarringem = pmaccessclassbarringem;
	}
	/**
	 * @return the pmactivedrbdlsum
	 */
	public String getPmactivedrbdlsum() {
		return pmactivedrbdlsum;
	}
	/**
	 * @param pmactivedrbdlsum the pmactivedrbdlsum to set
	 */
	public void setPmactivedrbdlsum(String pmactivedrbdlsum) {
		this.pmactivedrbdlsum = pmactivedrbdlsum;
	}
	/**
	 * @return the pmactivedrbulsum
	 */
	public String getPmactivedrbulsum() {
		return pmactivedrbulsum;
	}
	/**
	 * @param pmactivedrbulsum the pmactivedrbulsum to set
	 */
	public void setPmactivedrbulsum(String pmactivedrbulsum) {
		this.pmactivedrbulsum = pmactivedrbulsum;
	}
	/**
	 * @return the pmactiveuedlmax
	 */
	public String getPmactiveuedlmax() {
		return pmactiveuedlmax;
	}
	/**
	 * @param pmactiveuedlmax the pmactiveuedlmax to set
	 */
	public void setPmactiveuedlmax(String pmactiveuedlmax) {
		this.pmactiveuedlmax = pmactiveuedlmax;
	}
	/**
	 * @return the pmActiveUeDlSum
	 */
	public String getPmActiveUeDlSum() {
		return pmActiveUeDlSum;
	}
	/**
	 * @param pmactiveuedlsum the pmactiveuedlsum to set
	 */
	public void setPmActiveUeDlSum(String pmActiveUeDlSum) {
		this.pmActiveUeDlSum = pmActiveUeDlSum;
	}
	/**
	 * @return the pmactiveuedrbsamp
	 */
	public String getPmactiveuedrbsamp() {
		return pmactiveuedrbsamp;
	}
	/**
	 * @param pmactiveuedrbsamp the pmactiveuedrbsamp to set
	 */
	public void setPmactiveuedrbsamp(String pmactiveuedrbsamp) {
		this.pmactiveuedrbsamp = pmactiveuedrbsamp;
	}
	/**
	 * @return the pmactiveueulmax
	 */
	public String getPmactiveueulmax() {
		return pmactiveueulmax;
	}
	/**
	 * @param pmactiveueulmax the pmactiveueulmax to set
	 */
	public void setPmactiveueulmax(String pmactiveueulmax) {
		this.pmactiveueulmax = pmactiveueulmax;
	}
	/**
	 * @return the pmActiveUeUlSum
	 */
	public String getPmActiveUeUlSum() {
		return pmActiveUeUlSum;
	}
	/**
	 * @param pmactiveueulsum the pmactiveueulsum to set
	 */
	public void setPmActiveUeUlSum(String pmActiveUeUlSum) {
		this.pmActiveUeUlSum = pmActiveUeUlSum;
	}
	/**
	 * @return the pmadjustaccessdynloadctrl
	 */
	public String getPmadjustaccessdynloadctrl() {
		return pmadjustaccessdynloadctrl;
	}
	/**
	 * @param pmadjustaccessdynloadctrl the pmadjustaccessdynloadctrl to set
	 */
	public void setPmadjustaccessdynloadctrl(String pmadjustaccessdynloadctrl) {
		this.pmadjustaccessdynloadctrl = pmadjustaccessdynloadctrl;
	}
	/**
	 * @return the pmadjustaccessmploadctrl
	 */
	public String getPmadjustaccessmploadctrl() {
		return pmadjustaccessmploadctrl;
	}
	/**
	 * @param pmadjustaccessmploadctrl the pmadjustaccessmploadctrl to set
	 */
	public void setPmadjustaccessmploadctrl(String pmadjustaccessmploadctrl) {
		this.pmadjustaccessmploadctrl = pmadjustaccessmploadctrl;
	}
	/**
	 * @return the pmanrcandnrelcgiadd
	 */
	public String getPmanrcandnrelcgiadd() {
		return pmanrcandnrelcgiadd;
	}
	/**
	 * @param pmanrcandnrelcgiadd the pmanrcandnrelcgiadd to set
	 */
	public void setPmanrcandnrelcgiadd(String pmanrcandnrelcgiadd) {
		this.pmanrcandnrelcgiadd = pmanrcandnrelcgiadd;
	}
	/**
	 * @return the pmanrcandnrelrem
	 */
	public String getPmanrcandnrelrem() {
		return pmanrcandnrelrem;
	}
	/**
	 * @param pmanrcandnrelrem the pmanrcandnrelrem to set
	 */
	public void setPmanrcandnrelrem(String pmanrcandnrelrem) {
		this.pmanrcandnrelrem = pmanrcandnrelrem;
	}
	/**
	 * @return the pmanrcandnrelx2add
	 */
	public String getPmanrcandnrelx2add() {
		return pmanrcandnrelx2add;
	}
	/**
	 * @param pmanrcandnrelx2add the pmanrcandnrelx2add to set
	 */
	public void setPmanrcandnrelx2add(String pmanrcandnrelx2add) {
		this.pmanrcandnrelx2add = pmanrcandnrelx2add;
	}
	/**
	 * @return the pmanrhosucclevellow
	 */
	public String getPmanrhosucclevellow() {
		return pmanrhosucclevellow;
	}
	/**
	 * @param pmanrhosucclevellow the pmanrhosucclevellow to set
	 */
	public void setPmanrhosucclevellow(String pmanrhosucclevellow) {
		this.pmanrhosucclevellow = pmanrhosucclevellow;
	}
	/**
	 * @return the pmanrhosucclevelmedium
	 */
	public String getPmanrhosucclevelmedium() {
		return pmanrhosucclevelmedium;
	}
	/**
	 * @param pmanrhosucclevelmedium the pmanrhosucclevelmedium to set
	 */
	public void setPmanrhosucclevelmedium(String pmanrhosucclevelmedium) {
		this.pmanrhosucclevelmedium = pmanrhosucclevelmedium;
	}
	/**
	 * @return the pmanrneighbreladd
	 */
	public String getPmanrneighbreladd() {
		return pmanrneighbreladd;
	}
	/**
	 * @param pmanrneighbreladd the pmanrneighbreladd to set
	 */
	public void setPmanrneighbreladd(String pmanrneighbreladd) {
		this.pmanrneighbreladd = pmanrneighbreladd;
	}
	/**
	 * @return the pmanrneighbrelrem
	 */
	public String getPmanrneighbrelrem() {
		return pmanrneighbrelrem;
	}
	/**
	 * @param pmanrneighbrelrem the pmanrneighbrelrem to set
	 */
	public void setPmanrneighbrelrem(String pmanrneighbrelrem) {
		this.pmanrneighbrelrem = pmanrneighbrelrem;
	}
	/**
	 * @return the pmb2bestcellevalreport
	 */
	public String getPmb2bestcellevalreport() {
		return pmb2bestcellevalreport;
	}
	/**
	 * @param pmb2bestcellevalreport the pmb2bestcellevalreport to set
	 */
	public void setPmb2bestcellevalreport(String pmb2bestcellevalreport) {
		this.pmb2bestcellevalreport = pmb2bestcellevalreport;
	}
	/**
	 * @return the pmb2bestcellevalreportrsrp
	 */
	public String getPmb2bestcellevalreportrsrp() {
		return pmb2bestcellevalreportrsrp;
	}
	/**
	 * @param pmb2bestcellevalreportrsrp the pmb2bestcellevalreportrsrp to set
	 */
	public void setPmb2bestcellevalreportrsrp(String pmb2bestcellevalreportrsrp) {
		this.pmb2bestcellevalreportrsrp = pmb2bestcellevalreportrsrp;
	}
	/**
	 * @return the pmb2bestcellevalreportul
	 */
	public String getPmb2bestcellevalreportul() {
		return pmb2bestcellevalreportul;
	}
	/**
	 * @param pmb2bestcellevalreportul the pmb2bestcellevalreportul to set
	 */
	public void setPmb2bestcellevalreportul(String pmb2bestcellevalreportul) {
		this.pmb2bestcellevalreportul = pmb2bestcellevalreportul;
	}
	/**
	 * @return the pmbadcovevalreport
	 */
	public String getPmbadcovevalreport() {
		return pmbadcovevalreport;
	}
	/**
	 * @param pmbadcovevalreport the pmbadcovevalreport to set
	 */
	public void setPmbadcovevalreport(String pmbadcovevalreport) {
		this.pmbadcovevalreport = pmbadcovevalreport;
	}
	/**
	 * @return the pmbadcovoutsearchevalreport
	 */
	public String getPmbadcovoutsearchevalreport() {
		return pmbadcovoutsearchevalreport;
	}
	/**
	 * @param pmbadcovoutsearchevalreport the pmbadcovoutsearchevalreport to set
	 */
	public void setPmbadcovoutsearchevalreport(String pmbadcovoutsearchevalreport) {
		this.pmbadcovoutsearchevalreport = pmbadcovoutsearchevalreport;
	}
	/**
	 * @return the pmbadcovoutsearchevalreportrsrp
	 */
	public String getPmbadcovoutsearchevalreportrsrp() {
		return pmbadcovoutsearchevalreportrsrp;
	}
	/**
	 * @param pmbadcovoutsearchevalreportrsrp the pmbadcovoutsearchevalreportrsrp to set
	 */
	public void setPmbadcovoutsearchevalreportrsrp(
			String pmbadcovoutsearchevalreportrsrp) {
		this.pmbadcovoutsearchevalreportrsrp = pmbadcovoutsearchevalreportrsrp;
	}
	/**
	 * @return the pmbadcovsearchevalreport
	 */
	public String getPmbadcovsearchevalreport() {
		return pmbadcovsearchevalreport;
	}
	/**
	 * @param pmbadcovsearchevalreport the pmbadcovsearchevalreport to set
	 */
	public void setPmbadcovsearchevalreport(String pmbadcovsearchevalreport) {
		this.pmbadcovsearchevalreport = pmbadcovsearchevalreport;
	}
	/**
	 * @return the pmbadcovsearchevalreportrsrp
	 */
	public String getPmbadcovsearchevalreportrsrp() {
		return pmbadcovsearchevalreportrsrp;
	}
	/**
	 * @param pmbadcovsearchevalreportrsrp the pmbadcovsearchevalreportrsrp to set
	 */
	public void setPmbadcovsearchevalreportrsrp(String pmbadcovsearchevalreportrsrp) {
		this.pmbadcovsearchevalreportrsrp = pmbadcovsearchevalreportrsrp;
	}
	/**
	 * @return the pmbadcovsearchevalreportul
	 */
	public String getPmbadcovsearchevalreportul() {
		return pmbadcovsearchevalreportul;
	}
	/**
	 * @param pmbadcovsearchevalreportul the pmbadcovsearchevalreportul to set
	 */
	public void setPmbadcovsearchevalreportul(String pmbadcovsearchevalreportul) {
		this.pmbadcovsearchevalreportul = pmbadcovsearchevalreportul;
	}
	/**
	 * @return the pmbbuemeasallocatt
	 */
	public String getPmbbuemeasallocatt() {
		return pmbbuemeasallocatt;
	}
	/**
	 * @param pmbbuemeasallocatt the pmbbuemeasallocatt to set
	 */
	public void setPmbbuemeasallocatt(String pmbbuemeasallocatt) {
		this.pmbbuemeasallocatt = pmbbuemeasallocatt;
	}
	/**
	 * @return the pmbbuemeasallocsucc
	 */
	public String getPmbbuemeasallocsucc() {
		return pmbbuemeasallocsucc;
	}
	/**
	 * @param pmbbuemeasallocsucc the pmbbuemeasallocsucc to set
	 */
	public void setPmbbuemeasallocsucc(String pmbbuemeasallocsucc) {
		this.pmbbuemeasallocsucc = pmbbuemeasallocsucc;
	}
	/**
	 * @return the pmbestcellevalreport
	 */
	public String getPmbestcellevalreport() {
		return pmbestcellevalreport;
	}
	/**
	 * @param pmbestcellevalreport the pmbestcellevalreport to set
	 */
	public void setPmbestcellevalreport(String pmbestcellevalreport) {
		this.pmbestcellevalreport = pmbestcellevalreport;
	}
	/**
	 * @return the pmcacapabledlsamp
	 */
	public String getPmcacapabledlsamp() {
		return pmcacapabledlsamp;
	}
	/**
	 * @param pmcacapabledlsamp the pmcacapabledlsamp to set
	 */
	public void setPmcacapabledlsamp(String pmcacapabledlsamp) {
		this.pmcacapabledlsamp = pmcacapabledlsamp;
	}
	/**
	 * @return the pmcaconfigureddlsamp
	 */
	public String getPmcaconfigureddlsamp() {
		return pmcaconfigureddlsamp;
	}
	/**
	 * @param pmcaconfigureddlsamp the pmcaconfigureddlsamp to set
	 */
	public void setPmcaconfigureddlsamp(String pmcaconfigureddlsamp) {
		this.pmcaconfigureddlsamp = pmcaconfigureddlsamp;
	}
	/**
	 * @return the pmcaconfiguredmeasatt
	 */
	public String getPmcaconfiguredmeasatt() {
		return pmcaconfiguredmeasatt;
	}
	/**
	 * @param pmcaconfiguredmeasatt the pmcaconfiguredmeasatt to set
	 */
	public void setPmcaconfiguredmeasatt(String pmcaconfiguredmeasatt) {
		this.pmcaconfiguredmeasatt = pmcaconfiguredmeasatt;
	}
	/**
	 * @return the pmcaconfiguredmeassucc
	 */
	public String getPmcaconfiguredmeassucc() {
		return pmcaconfiguredmeassucc;
	}
	/**
	 * @param pmcaconfiguredmeassucc the pmcaconfiguredmeassucc to set
	 */
	public void setPmcaconfiguredmeassucc(String pmcaconfiguredmeassucc) {
		this.pmcaconfiguredmeassucc = pmcaconfiguredmeassucc;
	}
	/**
	 * @return the pmcaconfigurednomeasatt
	 */
	public String getPmcaconfigurednomeasatt() {
		return pmcaconfigurednomeasatt;
	}
	/**
	 * @param pmcaconfigurednomeasatt the pmcaconfigurednomeasatt to set
	 */
	public void setPmcaconfigurednomeasatt(String pmcaconfigurednomeasatt) {
		this.pmcaconfigurednomeasatt = pmcaconfigurednomeasatt;
	}
	/**
	 * @return the pmcaconfigurednomeassucc
	 */
	public String getPmcaconfigurednomeassucc() {
		return pmcaconfigurednomeassucc;
	}
	/**
	 * @param pmcaconfigurednomeassucc the pmcaconfigurednomeassucc to set
	 */
	public void setPmcaconfigurednomeassucc(String pmcaconfigurednomeassucc) {
		this.pmcaconfigurednomeassucc = pmcaconfigurednomeassucc;
	}
	/**
	 * @return the pmcaconfiguredsamp
	 */
	public String getPmcaconfiguredsamp() {
		return pmcaconfiguredsamp;
	}
	/**
	 * @param pmcaconfiguredsamp the pmcaconfiguredsamp to set
	 */
	public void setPmcaconfiguredsamp(String pmcaconfiguredsamp) {
		this.pmcaconfiguredsamp = pmcaconfiguredsamp;
	}
	/**
	 * @return the pmcadeconfigured
	 */
	public String getPmcadeconfigured() {
		return pmcadeconfigured;
	}
	/**
	 * @param pmcadeconfigured the pmcadeconfigured to set
	 */
	public void setPmcadeconfigured(String pmcadeconfigured) {
		this.pmcadeconfigured = pmcadeconfigured;
	}
	/**
	 * @return the pmcadeconfiguredlostcoverage
	 */
	public String getPmcadeconfiguredlostcoverage() {
		return pmcadeconfiguredlostcoverage;
	}
	/**
	 * @param pmcadeconfiguredlostcoverage the pmcadeconfiguredlostcoverage to set
	 */
	public void setPmcadeconfiguredlostcoverage(String pmcadeconfiguredlostcoverage) {
		this.pmcadeconfiguredlostcoverage = pmcadeconfiguredlostcoverage;
	}
	/**
	 * @return the pmcadeconfiguredsamp
	 */
	public String getPmcadeconfiguredsamp() {
		return pmcadeconfiguredsamp;
	}
	/**
	 * @param pmcadeconfiguredsamp the pmcadeconfiguredsamp to set
	 */
	public void setPmcadeconfiguredsamp(String pmcadeconfiguredsamp) {
		this.pmcadeconfiguredsamp = pmcadeconfiguredsamp;
	}
	/**
	 * @return the pmcadeconfiguredscellchange
	 */
	public String getPmcadeconfiguredscellchange() {
		return pmcadeconfiguredscellchange;
	}
	/**
	 * @param pmcadeconfiguredscellchange the pmcadeconfiguredscellchange to set
	 */
	public void setPmcadeconfiguredscellchange(String pmcadeconfiguredscellchange) {
		this.pmcadeconfiguredscellchange = pmcadeconfiguredscellchange;
	}
	/**
	 * @return the pmcelladmcontrolpdcchrej
	 */
	public String getPmcelladmcontrolpdcchrej() {
		return pmcelladmcontrolpdcchrej;
	}
	/**
	 * @param pmcelladmcontrolpdcchrej the pmcelladmcontrolpdcchrej to set
	 */
	public void setPmcelladmcontrolpdcchrej(String pmcelladmcontrolpdcchrej) {
		this.pmcelladmcontrolpdcchrej = pmcelladmcontrolpdcchrej;
	}
	/**
	 * @return the pmcelladmcontrolpdcchrejmeas
	 */
	public String getPmcelladmcontrolpdcchrejmeas() {
		return pmcelladmcontrolpdcchrejmeas;
	}
	/**
	 * @param pmcelladmcontrolpdcchrejmeas the pmcelladmcontrolpdcchrejmeas to set
	 */
	public void setPmcelladmcontrolpdcchrejmeas(String pmcelladmcontrolpdcchrejmeas) {
		this.pmcelladmcontrolpdcchrejmeas = pmcelladmcontrolpdcchrejmeas;
	}
	/**
	 * @return the pmcelldownlockauto
	 */
	public String getPmcelldownlockauto() {
		return pmcelldownlockauto;
	}
	/**
	 * @param pmcelldownlockauto the pmcelldownlockauto to set
	 */
	public void setPmcelldownlockauto(String pmcelldownlockauto) {
		this.pmcelldownlockauto = pmcelldownlockauto;
	}
	/**
	 * @return the pmcelldownlockman
	 */
	public String getPmcelldownlockman() {
		return pmcelldownlockman;
	}
	/**
	 * @param pmcelldownlockman the pmcelldownlockman to set
	 */
	public void setPmcelldownlockman(String pmcelldownlockman) {
		this.pmcelldownlockman = pmcelldownlockman;
	}
	/**
	 * @return the pmCellDowntimeAuto
	 */
	public String getPmCellDowntimeAuto() {
		return pmCellDowntimeAuto;
	}
	/**
	 * @param pmcelldowntimeauto the pmCellDowntimeAuto to set
	 */
	public void setPmCellDowntimeAuto(String pmCellDowntimeAuto) {
		this.pmCellDowntimeAuto = pmCellDowntimeAuto;
	}
	/**
	 * @return the pmCellDowntimeMan
	 */
	public String getPmCellDowntimeMan() {
		return pmCellDowntimeMan;
	}
	/**
	 * @param pmcelldowntimeman the pmcelldowntimeman to set
	 */
	public void setPmCellDowntimeMan(String pmCellDowntimeMan) {
		this.pmCellDowntimeMan = pmCellDowntimeMan;
	}
	/**
	 * @return the pmcelldownunlockman
	 */
	public String getPmcelldownunlockman() {
		return pmcelldownunlockman;
	}
	/**
	 * @param pmcelldownunlockman the pmcelldownunlockman to set
	 */
	public void setPmcelldownunlockman(String pmcelldownunlockman) {
		this.pmcelldownunlockman = pmcelldownunlockman;
	}
	/**
	 * @return the pmcellhoexeattlteinterf
	 */
	public String getPmcellhoexeattlteinterf() {
		return pmcellhoexeattlteinterf;
	}
	/**
	 * @param pmcellhoexeattlteinterf the pmcellhoexeattlteinterf to set
	 */
	public void setPmcellhoexeattlteinterf(String pmcellhoexeattlteinterf) {
		this.pmcellhoexeattlteinterf = pmcellhoexeattlteinterf;
	}
	/**
	 * @return the pmcellhoexeattlteinterfcsg
	 */
	public String getPmcellhoexeattlteinterfcsg() {
		return pmcellhoexeattlteinterfcsg;
	}
	/**
	 * @param pmcellhoexeattlteinterfcsg the pmcellhoexeattlteinterfcsg to set
	 */
	public void setPmcellhoexeattlteinterfcsg(String pmcellhoexeattlteinterfcsg) {
		this.pmcellhoexeattlteinterfcsg = pmcellhoexeattlteinterfcsg;
	}
	/**
	 * @return the pmcellhoexeattlteinterfhybridcsg
	 */
	public String getPmcellhoexeattlteinterfhybridcsg() {
		return pmcellhoexeattlteinterfhybridcsg;
	}
	/**
	 * @param pmcellhoexeattlteinterfhybridcsg the pmcellhoexeattlteinterfhybridcsg to set
	 */
	public void setPmcellhoexeattlteinterfhybridcsg(
			String pmcellhoexeattlteinterfhybridcsg) {
		this.pmcellhoexeattlteinterfhybridcsg = pmcellhoexeattlteinterfhybridcsg;
	}
	/**
	 * @return the pmcellhoexeattlteinterfmbms
	 */
	public String getPmcellhoexeattlteinterfmbms() {
		return pmcellhoexeattlteinterfmbms;
	}
	/**
	 * @param pmcellhoexeattlteinterfmbms the pmcellhoexeattlteinterfmbms to set
	 */
	public void setPmcellhoexeattlteinterfmbms(String pmcellhoexeattlteinterfmbms) {
		this.pmcellhoexeattlteinterfmbms = pmcellhoexeattlteinterfmbms;
	}
	/**
	 * @return the pmcellhoexeattlteinterfuemeas
	 */
	public String getPmcellhoexeattlteinterfuemeas() {
		return pmcellhoexeattlteinterfuemeas;
	}
	/**
	 * @param pmcellhoexeattlteinterfuemeas the pmcellhoexeattlteinterfuemeas to set
	 */
	public void setPmcellhoexeattlteinterfuemeas(
			String pmcellhoexeattlteinterfuemeas) {
		this.pmcellhoexeattlteinterfuemeas = pmcellhoexeattlteinterfuemeas;
	}
	/**
	 * @return the pmcellhoexeattlteinterfuemeasrsrp
	 */
	public String getPmcellhoexeattlteinterfuemeasrsrp() {
		return pmcellhoexeattlteinterfuemeasrsrp;
	}
	/**
	 * @param pmcellhoexeattlteinterfuemeasrsrp the pmcellhoexeattlteinterfuemeasrsrp to set
	 */
	public void setPmcellhoexeattlteinterfuemeasrsrp(
			String pmcellhoexeattlteinterfuemeasrsrp) {
		this.pmcellhoexeattlteinterfuemeasrsrp = pmcellhoexeattlteinterfuemeasrsrp;
	}
	/**
	 * @return the pmcellhoexeattlteinterful
	 */
	public String getPmcellhoexeattlteinterful() {
		return pmcellhoexeattlteinterful;
	}
	/**
	 * @param pmcellhoexeattlteinterful the pmcellhoexeattlteinterful to set
	 */
	public void setPmcellhoexeattlteinterful(String pmcellhoexeattlteinterful) {
		this.pmcellhoexeattlteinterful = pmcellhoexeattlteinterful;
	}
	/**
	 * @return the pmcellhoexeattlteintraf
	 */
	public String getPmcellhoexeattlteintraf() {
		return pmcellhoexeattlteintraf;
	}
	/**
	 * @param pmcellhoexeattlteintraf the pmcellhoexeattlteintraf to set
	 */
	public void setPmcellhoexeattlteintraf(String pmcellhoexeattlteintraf) {
		this.pmcellhoexeattlteintraf = pmcellhoexeattlteintraf;
	}
	/**
	 * @return the pmcellhoexeattlteintrafafterresync
	 */
	public String getPmcellhoexeattlteintrafafterresync() {
		return pmcellhoexeattlteintrafafterresync;
	}
	/**
	 * @param pmcellhoexeattlteintrafafterresync the pmcellhoexeattlteintrafafterresync to set
	 */
	public void setPmcellhoexeattlteintrafafterresync(
			String pmcellhoexeattlteintrafafterresync) {
		this.pmcellhoexeattlteintrafafterresync = pmcellhoexeattlteintrafafterresync;
	}
	/**
	 * @return the pmcellhoexeattlteintrafcsg
	 */
	public String getPmcellhoexeattlteintrafcsg() {
		return pmcellhoexeattlteintrafcsg;
	}
	/**
	 * @param pmcellhoexeattlteintrafcsg the pmcellhoexeattlteintrafcsg to set
	 */
	public void setPmcellhoexeattlteintrafcsg(String pmcellhoexeattlteintrafcsg) {
		this.pmcellhoexeattlteintrafcsg = pmcellhoexeattlteintrafcsg;
	}
	/**
	 * @return the pmcellhoexeattlteintrafhybridcsg
	 */
	public String getPmcellhoexeattlteintrafhybridcsg() {
		return pmcellhoexeattlteintrafhybridcsg;
	}
	/**
	 * @param pmcellhoexeattlteintrafhybridcsg the pmcellhoexeattlteintrafhybridcsg to set
	 */
	public void setPmcellhoexeattlteintrafhybridcsg(
			String pmcellhoexeattlteintrafhybridcsg) {
		this.pmcellhoexeattlteintrafhybridcsg = pmcellhoexeattlteintrafhybridcsg;
	}
	/**
	 * @return the pmcellhoexeattlteintraftuneout
	 */
	public String getPmcellhoexeattlteintraftuneout() {
		return pmcellhoexeattlteintraftuneout;
	}
	/**
	 * @param pmcellhoexeattlteintraftuneout the pmcellhoexeattlteintraftuneout to set
	 */
	public void setPmcellhoexeattlteintraftuneout(
			String pmcellhoexeattlteintraftuneout) {
		this.pmcellhoexeattlteintraftuneout = pmcellhoexeattlteintraftuneout;
	}
	/**
	 * @return the pmcellhoexesucclteinterf
	 */
	public String getPmcellhoexesucclteinterf() {
		return pmcellhoexesucclteinterf;
	}
	/**
	 * @param pmcellhoexesucclteinterf the pmcellhoexesucclteinterf to set
	 */
	public void setPmcellhoexesucclteinterf(String pmcellhoexesucclteinterf) {
		this.pmcellhoexesucclteinterf = pmcellhoexesucclteinterf;
	}
	/**
	 * @return the pmcellhoexesucclteinterfcsg
	 */
	public String getPmcellhoexesucclteinterfcsg() {
		return pmcellhoexesucclteinterfcsg;
	}
	/**
	 * @param pmcellhoexesucclteinterfcsg the pmcellhoexesucclteinterfcsg to set
	 */
	public void setPmcellhoexesucclteinterfcsg(String pmcellhoexesucclteinterfcsg) {
		this.pmcellhoexesucclteinterfcsg = pmcellhoexesucclteinterfcsg;
	}
	/**
	 * @return the pmcellhoexesucclteinterfhybridcsg
	 */
	public String getPmcellhoexesucclteinterfhybridcsg() {
		return pmcellhoexesucclteinterfhybridcsg;
	}
	/**
	 * @param pmcellhoexesucclteinterfhybridcsg the pmcellhoexesucclteinterfhybridcsg to set
	 */
	public void setPmcellhoexesucclteinterfhybridcsg(
			String pmcellhoexesucclteinterfhybridcsg) {
		this.pmcellhoexesucclteinterfhybridcsg = pmcellhoexesucclteinterfhybridcsg;
	}
	/**
	 * @return the pmcellhoexesucclteinterfmbms
	 */
	public String getPmcellhoexesucclteinterfmbms() {
		return pmcellhoexesucclteinterfmbms;
	}
	/**
	 * @param pmcellhoexesucclteinterfmbms the pmcellhoexesucclteinterfmbms to set
	 */
	public void setPmcellhoexesucclteinterfmbms(String pmcellhoexesucclteinterfmbms) {
		this.pmcellhoexesucclteinterfmbms = pmcellhoexesucclteinterfmbms;
	}
	/**
	 * @return the pmcellhoexesucclteinterfuemeas
	 */
	public String getPmcellhoexesucclteinterfuemeas() {
		return pmcellhoexesucclteinterfuemeas;
	}
	/**
	 * @param pmcellhoexesucclteinterfuemeas the pmcellhoexesucclteinterfuemeas to set
	 */
	public void setPmcellhoexesucclteinterfuemeas(
			String pmcellhoexesucclteinterfuemeas) {
		this.pmcellhoexesucclteinterfuemeas = pmcellhoexesucclteinterfuemeas;
	}
	/**
	 * @return the pmcellhoexesucclteinterfuemeasrsrp
	 */
	public String getPmcellhoexesucclteinterfuemeasrsrp() {
		return pmcellhoexesucclteinterfuemeasrsrp;
	}
	/**
	 * @param pmcellhoexesucclteinterfuemeasrsrp the pmcellhoexesucclteinterfuemeasrsrp to set
	 */
	public void setPmcellhoexesucclteinterfuemeasrsrp(
			String pmcellhoexesucclteinterfuemeasrsrp) {
		this.pmcellhoexesucclteinterfuemeasrsrp = pmcellhoexesucclteinterfuemeasrsrp;
	}
	/**
	 * @return the pmcellhoexesucclteinterful
	 */
	public String getPmcellhoexesucclteinterful() {
		return pmcellhoexesucclteinterful;
	}
	/**
	 * @param pmcellhoexesucclteinterful the pmcellhoexesucclteinterful to set
	 */
	public void setPmcellhoexesucclteinterful(String pmcellhoexesucclteinterful) {
		this.pmcellhoexesucclteinterful = pmcellhoexesucclteinterful;
	}
	/**
	 * @return the pmcellhoexesucclteintraf
	 */
	public String getPmcellhoexesucclteintraf() {
		return pmcellhoexesucclteintraf;
	}
	/**
	 * @param pmcellhoexesucclteintraf the pmcellhoexesucclteintraf to set
	 */
	public void setPmcellhoexesucclteintraf(String pmcellhoexesucclteintraf) {
		this.pmcellhoexesucclteintraf = pmcellhoexesucclteintraf;
	}
	/**
	 * @return the pmcellhoexesucclteintrafafterresync
	 */
	public String getPmcellhoexesucclteintrafafterresync() {
		return pmcellhoexesucclteintrafafterresync;
	}
	/**
	 * @param pmcellhoexesucclteintrafafterresync the pmcellhoexesucclteintrafafterresync to set
	 */
	public void setPmcellhoexesucclteintrafafterresync(
			String pmcellhoexesucclteintrafafterresync) {
		this.pmcellhoexesucclteintrafafterresync = pmcellhoexesucclteintrafafterresync;
	}
	/**
	 * @return the pmcellhoexesucclteintrafcsg
	 */
	public String getPmcellhoexesucclteintrafcsg() {
		return pmcellhoexesucclteintrafcsg;
	}
	/**
	 * @param pmcellhoexesucclteintrafcsg the pmcellhoexesucclteintrafcsg to set
	 */
	public void setPmcellhoexesucclteintrafcsg(String pmcellhoexesucclteintrafcsg) {
		this.pmcellhoexesucclteintrafcsg = pmcellhoexesucclteintrafcsg;
	}
	/**
	 * @return the pmcellhoexesucclteintrafhybridcsg
	 */
	public String getPmcellhoexesucclteintrafhybridcsg() {
		return pmcellhoexesucclteintrafhybridcsg;
	}
	/**
	 * @param pmcellhoexesucclteintrafhybridcsg the pmcellhoexesucclteintrafhybridcsg to set
	 */
	public void setPmcellhoexesucclteintrafhybridcsg(
			String pmcellhoexesucclteintrafhybridcsg) {
		this.pmcellhoexesucclteintrafhybridcsg = pmcellhoexesucclteintrafhybridcsg;
	}
	/**
	 * @return the pmcellhoexesucclteintraftuneout
	 */
	public String getPmcellhoexesucclteintraftuneout() {
		return pmcellhoexesucclteintraftuneout;
	}
	/**
	 * @param pmcellhoexesucclteintraftuneout the pmcellhoexesucclteintraftuneout to set
	 */
	public void setPmcellhoexesucclteintraftuneout(
			String pmcellhoexesucclteintraftuneout) {
		this.pmcellhoexesucclteintraftuneout = pmcellhoexesucclteintraftuneout;
	}
	/**
	 * @return the pmcellhoprepattlowcovue
	 */
	public String getPmcellhoprepattlowcovue() {
		return pmcellhoprepattlowcovue;
	}
	/**
	 * @param pmcellhoprepattlowcovue the pmcellhoprepattlowcovue to set
	 */
	public void setPmcellhoprepattlowcovue(String pmcellhoprepattlowcovue) {
		this.pmcellhoprepattlowcovue = pmcellhoprepattlowcovue;
	}
	/**
	 * @return the pmcellhoprepattlteinterf
	 */
	public String getPmcellhoprepattlteinterf() {
		return pmcellhoprepattlteinterf;
	}
	/**
	 * @param pmcellhoprepattlteinterf the pmcellhoprepattlteinterf to set
	 */
	public void setPmcellhoprepattlteinterf(String pmcellhoprepattlteinterf) {
		this.pmcellhoprepattlteinterf = pmcellhoprepattlteinterf;
	}
	/**
	 * @return the pmcellhoprepattlteinterfcsg
	 */
	public String getPmcellhoprepattlteinterfcsg() {
		return pmcellhoprepattlteinterfcsg;
	}
	/**
	 * @param pmcellhoprepattlteinterfcsg the pmcellhoprepattlteinterfcsg to set
	 */
	public void setPmcellhoprepattlteinterfcsg(String pmcellhoprepattlteinterfcsg) {
		this.pmcellhoprepattlteinterfcsg = pmcellhoprepattlteinterfcsg;
	}
	/**
	 * @return the pmcellhoprepattlteinterfhybridcsg
	 */
	public String getPmcellhoprepattlteinterfhybridcsg() {
		return pmcellhoprepattlteinterfhybridcsg;
	}
	/**
	 * @param pmcellhoprepattlteinterfhybridcsg the pmcellhoprepattlteinterfhybridcsg to set
	 */
	public void setPmcellhoprepattlteinterfhybridcsg(
			String pmcellhoprepattlteinterfhybridcsg) {
		this.pmcellhoprepattlteinterfhybridcsg = pmcellhoprepattlteinterfhybridcsg;
	}
	/**
	 * @return the pmcellhoprepattlteinterfmbms
	 */
	public String getPmcellhoprepattlteinterfmbms() {
		return pmcellhoprepattlteinterfmbms;
	}
	/**
	 * @param pmcellhoprepattlteinterfmbms the pmcellhoprepattlteinterfmbms to set
	 */
	public void setPmcellhoprepattlteinterfmbms(String pmcellhoprepattlteinterfmbms) {
		this.pmcellhoprepattlteinterfmbms = pmcellhoprepattlteinterfmbms;
	}
	/**
	 * @return the pmcellhoprepattlteinterful
	 */
	public String getPmcellhoprepattlteinterful() {
		return pmcellhoprepattlteinterful;
	}
	/**
	 * @param pmcellhoprepattlteinterful the pmcellhoprepattlteinterful to set
	 */
	public void setPmcellhoprepattlteinterful(String pmcellhoprepattlteinterful) {
		this.pmcellhoprepattlteinterful = pmcellhoprepattlteinterful;
	}
	/**
	 * @return the pmcellhoprepattlteintraf
	 */
	public String getPmcellhoprepattlteintraf() {
		return pmcellhoprepattlteintraf;
	}
	/**
	 * @param pmcellhoprepattlteintraf the pmcellhoprepattlteintraf to set
	 */
	public void setPmcellhoprepattlteintraf(String pmcellhoprepattlteintraf) {
		this.pmcellhoprepattlteintraf = pmcellhoprepattlteintraf;
	}
	/**
	 * @return the pmcellhoprepattlteintrafcsg
	 */
	public String getPmcellhoprepattlteintrafcsg() {
		return pmcellhoprepattlteintrafcsg;
	}
	/**
	 * @param pmcellhoprepattlteintrafcsg the pmcellhoprepattlteintrafcsg to set
	 */
	public void setPmcellhoprepattlteintrafcsg(String pmcellhoprepattlteintrafcsg) {
		this.pmcellhoprepattlteintrafcsg = pmcellhoprepattlteintrafcsg;
	}
	/**
	 * @return the pmcellhoprepattlteintrafhybridcsg
	 */
	public String getPmcellhoprepattlteintrafhybridcsg() {
		return pmcellhoprepattlteintrafhybridcsg;
	}
	/**
	 * @param pmcellhoprepattlteintrafhybridcsg the pmcellhoprepattlteintrafhybridcsg to set
	 */
	public void setPmcellhoprepattlteintrafhybridcsg(
			String pmcellhoprepattlteintrafhybridcsg) {
		this.pmcellhoprepattlteintrafhybridcsg = pmcellhoprepattlteintrafhybridcsg;
	}
	/**
	 * @return the pmcellhoprepsucclowcovue
	 */
	public String getPmcellhoprepsucclowcovue() {
		return pmcellhoprepsucclowcovue;
	}
	/**
	 * @param pmcellhoprepsucclowcovue the pmcellhoprepsucclowcovue to set
	 */
	public void setPmcellhoprepsucclowcovue(String pmcellhoprepsucclowcovue) {
		this.pmcellhoprepsucclowcovue = pmcellhoprepsucclowcovue;
	}
	/**
	 * @return the pmcellhoprepsucclteinterf
	 */
	public String getPmcellhoprepsucclteinterf() {
		return pmcellhoprepsucclteinterf;
	}
	/**
	 * @param pmcellhoprepsucclteinterf the pmcellhoprepsucclteinterf to set
	 */
	public void setPmcellhoprepsucclteinterf(String pmcellhoprepsucclteinterf) {
		this.pmcellhoprepsucclteinterf = pmcellhoprepsucclteinterf;
	}
	/**
	 * @return the pmcellhoprepsucclteinterfcsg
	 */
	public String getPmcellhoprepsucclteinterfcsg() {
		return pmcellhoprepsucclteinterfcsg;
	}
	/**
	 * @param pmcellhoprepsucclteinterfcsg the pmcellhoprepsucclteinterfcsg to set
	 */
	public void setPmcellhoprepsucclteinterfcsg(String pmcellhoprepsucclteinterfcsg) {
		this.pmcellhoprepsucclteinterfcsg = pmcellhoprepsucclteinterfcsg;
	}
	/**
	 * @return the pmcellhoprepsucclteinterfhybridcsg
	 */
	public String getPmcellhoprepsucclteinterfhybridcsg() {
		return pmcellhoprepsucclteinterfhybridcsg;
	}
	/**
	 * @param pmcellhoprepsucclteinterfhybridcsg the pmcellhoprepsucclteinterfhybridcsg to set
	 */
	public void setPmcellhoprepsucclteinterfhybridcsg(
			String pmcellhoprepsucclteinterfhybridcsg) {
		this.pmcellhoprepsucclteinterfhybridcsg = pmcellhoprepsucclteinterfhybridcsg;
	}
	/**
	 * @return the pmcellhoprepsucclteinterfmbms
	 */
	public String getPmcellhoprepsucclteinterfmbms() {
		return pmcellhoprepsucclteinterfmbms;
	}
	/**
	 * @param pmcellhoprepsucclteinterfmbms the pmcellhoprepsucclteinterfmbms to set
	 */
	public void setPmcellhoprepsucclteinterfmbms(
			String pmcellhoprepsucclteinterfmbms) {
		this.pmcellhoprepsucclteinterfmbms = pmcellhoprepsucclteinterfmbms;
	}
	/**
	 * @return the pmcellhoprepsucclteinterful
	 */
	public String getPmcellhoprepsucclteinterful() {
		return pmcellhoprepsucclteinterful;
	}
	/**
	 * @param pmcellhoprepsucclteinterful the pmcellhoprepsucclteinterful to set
	 */
	public void setPmcellhoprepsucclteinterful(String pmcellhoprepsucclteinterful) {
		this.pmcellhoprepsucclteinterful = pmcellhoprepsucclteinterful;
	}
	/**
	 * @return the pmcellhoprepsucclteintraf
	 */
	public String getPmcellhoprepsucclteintraf() {
		return pmcellhoprepsucclteintraf;
	}
	/**
	 * @param pmcellhoprepsucclteintraf the pmcellhoprepsucclteintraf to set
	 */
	public void setPmcellhoprepsucclteintraf(String pmcellhoprepsucclteintraf) {
		this.pmcellhoprepsucclteintraf = pmcellhoprepsucclteintraf;
	}
	/**
	 * @return the pmcellhoprepsucclteintrafcsg
	 */
	public String getPmcellhoprepsucclteintrafcsg() {
		return pmcellhoprepsucclteintrafcsg;
	}
	/**
	 * @param pmcellhoprepsucclteintrafcsg the pmcellhoprepsucclteintrafcsg to set
	 */
	public void setPmcellhoprepsucclteintrafcsg(String pmcellhoprepsucclteintrafcsg) {
		this.pmcellhoprepsucclteintrafcsg = pmcellhoprepsucclteintrafcsg;
	}
	/**
	 * @return the pmcellhoprepsucclteintrafhybridcsg
	 */
	public String getPmcellhoprepsucclteintrafhybridcsg() {
		return pmcellhoprepsucclteintrafhybridcsg;
	}
	/**
	 * @param pmcellhoprepsucclteintrafhybridcsg the pmcellhoprepsucclteintrafhybridcsg to set
	 */
	public void setPmcellhoprepsucclteintrafhybridcsg(
			String pmcellhoprepsucclteintrafhybridcsg) {
		this.pmcellhoprepsucclteintrafhybridcsg = pmcellhoprepsucclteintrafhybridcsg;
	}
	/**
	 * @return the pmcellsleeptime
	 */
	public String getPmcellsleeptime() {
		return pmcellsleeptime;
	}
	/**
	 * @param pmcellsleeptime the pmcellsleeptime to set
	 */
	public void setPmcellsleeptime(String pmcellsleeptime) {
		this.pmcellsleeptime = pmcellsleeptime;
	}
	/**
	 * @return the pmconfigrejdlcomp
	 */
	public String getPmconfigrejdlcomp() {
		return pmconfigrejdlcomp;
	}
	/**
	 * @param pmconfigrejdlcomp the pmconfigrejdlcomp to set
	 */
	public void setPmconfigrejdlcomp(String pmconfigrejdlcomp) {
		this.pmconfigrejdlcomp = pmconfigrejdlcomp;
	}
	/**
	 * @return the pmconfirmeduerelreqpft
	 */
	public String getPmconfirmeduerelreqpft() {
		return pmconfirmeduerelreqpft;
	}
	/**
	 * @param pmconfirmeduerelreqpft the pmconfirmeduerelreqpft to set
	 */
	public void setPmconfirmeduerelreqpft(String pmconfirmeduerelreqpft) {
		this.pmconfirmeduerelreqpft = pmconfirmeduerelreqpft;
	}
	/**
	 * @return the pmcontdl
	 */
	public String getPmcontdl() {
		return pmcontdl;
	}
	/**
	 * @param pmcontdl the pmcontdl to set
	 */
	public void setPmcontdl(String pmcontdl) {
		this.pmcontdl = pmcontdl;
	}
	/**
	 * @return the pmcontdlcaplic
	 */
	public String getPmcontdlcaplic() {
		return pmcontdlcaplic;
	}
	/**
	 * @param pmcontdlcaplic the pmcontdlcaplic to set
	 */
	public void setPmcontdlcaplic(String pmcontdlcaplic) {
		this.pmcontdlcaplic = pmcontdlcaplic;
	}
	/**
	 * @return the pmcontdlhw
	 */
	public String getPmcontdlhw() {
		return pmcontdlhw;
	}
	/**
	 * @param pmcontdlhw the pmcontdlhw to set
	 */
	public void setPmcontdlhw(String pmcontdlhw) {
		this.pmcontdlhw = pmcontdlhw;
	}
	/**
	 * @return the pmcontdlpdcch
	 */
	public String getPmcontdlpdcch() {
		return pmcontdlpdcch;
	}
	/**
	 * @param pmcontdlpdcch the pmcontdlpdcch to set
	 */
	public void setPmcontdlpdcch(String pmcontdlpdcch) {
		this.pmcontdlpdcch = pmcontdlpdcch;
	}
	/**
	 * @return the pmcontul
	 */
	public String getPmcontul() {
		return pmcontul;
	}
	/**
	 * @param pmcontul the pmcontul to set
	 */
	public void setPmcontul(String pmcontul) {
		this.pmcontul = pmcontul;
	}
	/**
	 * @return the pmcontulcaplic
	 */
	public String getPmcontulcaplic() {
		return pmcontulcaplic;
	}
	/**
	 * @param pmcontulcaplic the pmcontulcaplic to set
	 */
	public void setPmcontulcaplic(String pmcontulcaplic) {
		this.pmcontulcaplic = pmcontulcaplic;
	}
	/**
	 * @return the pmcontulhw
	 */
	public String getPmcontulhw() {
		return pmcontulhw;
	}
	/**
	 * @param pmcontulhw the pmcontulhw to set
	 */
	public void setPmcontulhw(String pmcontulhw) {
		this.pmcontulhw = pmcontulhw;
	}
	/**
	 * @return the pmcontulpdcch
	 */
	public String getPmcontulpdcch() {
		return pmcontulpdcch;
	}
	/**
	 * @param pmcontulpdcch the pmcontulpdcch to set
	 */
	public void setPmcontulpdcch(String pmcontulpdcch) {
		this.pmcontulpdcch = pmcontulpdcch;
	}
	/**
	 * @return the pmcovgoodzonesamp
	 */
	public String getPmcovgoodzonesamp() {
		return pmcovgoodzonesamp;
	}
	/**
	 * @param pmcovgoodzonesamp the pmcovgoodzonesamp to set
	 */
	public void setPmcovgoodzonesamp(String pmcovgoodzonesamp) {
		this.pmcovgoodzonesamp = pmcovgoodzonesamp;
	}
	/**
	 * @return the pmcovgoodzonesum
	 */
	public String getPmcovgoodzonesum() {
		return pmcovgoodzonesum;
	}
	/**
	 * @param pmcovgoodzonesum the pmcovgoodzonesum to set
	 */
	public void setPmcovgoodzonesum(String pmcovgoodzonesum) {
		this.pmcovgoodzonesum = pmcovgoodzonesum;
	}
	/**
	 * @return the pmcovsearchzonesamp
	 */
	public String getPmcovsearchzonesamp() {
		return pmcovsearchzonesamp;
	}
	/**
	 * @param pmcovsearchzonesamp the pmcovsearchzonesamp to set
	 */
	public void setPmcovsearchzonesamp(String pmcovsearchzonesamp) {
		this.pmcovsearchzonesamp = pmcovsearchzonesamp;
	}
	/**
	 * @return the pmcovsearchzonesum
	 */
	public String getPmcovsearchzonesum() {
		return pmcovsearchzonesum;
	}
	/**
	 * @param pmcovsearchzonesum the pmcovsearchzonesum to set
	 */
	public void setPmcovsearchzonesum(String pmcovsearchzonesum) {
		this.pmcovsearchzonesum = pmcovsearchzonesum;
	}
	/**
	 * @return the pmcriticalborderevalreport
	 */
	public String getPmcriticalborderevalreport() {
		return pmcriticalborderevalreport;
	}
	/**
	 * @param pmcriticalborderevalreport the pmcriticalborderevalreport to set
	 */
	public void setPmcriticalborderevalreport(String pmcriticalborderevalreport) {
		this.pmcriticalborderevalreport = pmcriticalborderevalreport;
	}
	/**
	 * @return the pmcriticalborderevalreportrsrp
	 */
	public String getPmcriticalborderevalreportrsrp() {
		return pmcriticalborderevalreportrsrp;
	}
	/**
	 * @param pmcriticalborderevalreportrsrp the pmcriticalborderevalreportrsrp to set
	 */
	public void setPmcriticalborderevalreportrsrp(
			String pmcriticalborderevalreportrsrp) {
		this.pmcriticalborderevalreportrsrp = pmcriticalborderevalreportrsrp;
	}
	/**
	 * @return the pmcriticalborderevalreportul
	 */
	public String getPmcriticalborderevalreportul() {
		return pmcriticalborderevalreportul;
	}
	/**
	 * @param pmcriticalborderevalreportul the pmcriticalborderevalreportul to set
	 */
	public void setPmcriticalborderevalreportul(String pmcriticalborderevalreportul) {
		this.pmcriticalborderevalreportul = pmcriticalborderevalreportul;
	}
	/**
	 * @return the pmcrsiccapablesamp
	 */
	public String getPmcrsiccapablesamp() {
		return pmcrsiccapablesamp;
	}
	/**
	 * @param pmcrsiccapablesamp the pmcrsiccapablesamp to set
	 */
	public void setPmcrsiccapablesamp(String pmcrsiccapablesamp) {
		this.pmcrsiccapablesamp = pmcrsiccapablesamp;
	}
	/**
	 * @return the pmcrsiccapablesum
	 */
	public String getPmcrsiccapablesum() {
		return pmcrsiccapablesum;
	}
	/**
	 * @param pmcrsiccapablesum the pmcrsiccapablesum to set
	 */
	public void setPmcrsiccapablesum(String pmcrsiccapablesum) {
		this.pmcrsiccapablesum = pmcrsiccapablesum;
	}
	/**
	 * @return the pmdlassigsdetectedharqndo
	 */
	public String getPmdlassigsdetectedharqndo() {
		return pmdlassigsdetectedharqndo;
	}
	/**
	 * @param pmdlassigsdetectedharqndo the pmdlassigsdetectedharqndo to set
	 */
	public void setPmdlassigsdetectedharqndo(String pmdlassigsdetectedharqndo) {
		this.pmdlassigsdetectedharqndo = pmdlassigsdetectedharqndo;
	}
	/**
	 * @return the pmdlassigsdetectedharqvoltendo
	 */
	public String getPmdlassigsdetectedharqvoltendo() {
		return pmdlassigsdetectedharqvoltendo;
	}
	/**
	 * @param pmdlassigsdetectedharqvoltendo the pmdlassigsdetectedharqvoltendo to set
	 */
	public void setPmdlassigsdetectedharqvoltendo(
			String pmdlassigsdetectedharqvoltendo) {
		this.pmdlassigsdetectedharqvoltendo = pmdlassigsdetectedharqvoltendo;
	}
	/**
	 * @return the pmdlassigstrans
	 */
	public String getPmdlassigstrans() {
		return pmdlassigstrans;
	}
	/**
	 * @param pmdlassigstrans the pmdlassigstrans to set
	 */
	public void setPmdlassigstrans(String pmdlassigstrans) {
		this.pmdlassigstrans = pmdlassigstrans;
	}
	/**
	 * @return the pmdlassigstransndo
	 */
	public String getPmdlassigstransndo() {
		return pmdlassigstransndo;
	}
	/**
	 * @param pmdlassigstransndo the pmdlassigstransndo to set
	 */
	public void setPmdlassigstransndo(String pmdlassigstransndo) {
		this.pmdlassigstransndo = pmdlassigstransndo;
	}
	/**
	 * @return the pmdlassigstranspcell
	 */
	public String getPmdlassigstranspcell() {
		return pmdlassigstranspcell;
	}
	/**
	 * @param pmdlassigstranspcell the pmdlassigstranspcell to set
	 */
	public void setPmdlassigstranspcell(String pmdlassigstranspcell) {
		this.pmdlassigstranspcell = pmdlassigstranspcell;
	}
	/**
	 * @return the pmdlassigstransscell
	 */
	public String getPmdlassigstransscell() {
		return pmdlassigstransscell;
	}
	/**
	 * @param pmdlassigstransscell the pmdlassigstransscell to set
	 */
	public void setPmdlassigstransscell(String pmdlassigstransscell) {
		this.pmdlassigstransscell = pmdlassigstransscell;
	}
	/**
	 * @return the pmdlassigstransvolte
	 */
	public String getPmdlassigstransvolte() {
		return pmdlassigstransvolte;
	}
	/**
	 * @param pmdlassigstransvolte the pmdlassigstransvolte to set
	 */
	public void setPmdlassigstransvolte(String pmdlassigstransvolte) {
		this.pmdlassigstransvolte = pmdlassigstransvolte;
	}
	/**
	 * @return the pmdlassigstransvoltendo
	 */
	public String getPmdlassigstransvoltendo() {
		return pmdlassigstransvoltendo;
	}
	/**
	 * @param pmdlassigstransvoltendo the pmdlassigstransvoltendo to set
	 */
	public void setPmdlassigstransvoltendo(String pmdlassigstransvoltendo) {
		this.pmdlassigstransvoltendo = pmdlassigstransvoltendo;
	}
	/**
	 * @return the pmdlassigswithdetectedharqack
	 */
	public String getPmdlassigswithdetectedharqack() {
		return pmdlassigswithdetectedharqack;
	}
	/**
	 * @param pmdlassigswithdetectedharqack the pmdlassigswithdetectedharqack to set
	 */
	public void setPmdlassigswithdetectedharqack(
			String pmdlassigswithdetectedharqack) {
		this.pmdlassigswithdetectedharqack = pmdlassigswithdetectedharqack;
	}
	/**
	 * @return the pmdlassigswithdetectedharqackpcell
	 */
	public String getPmdlassigswithdetectedharqackpcell() {
		return pmdlassigswithdetectedharqackpcell;
	}
	/**
	 * @param pmdlassigswithdetectedharqackpcell the pmdlassigswithdetectedharqackpcell to set
	 */
	public void setPmdlassigswithdetectedharqackpcell(
			String pmdlassigswithdetectedharqackpcell) {
		this.pmdlassigswithdetectedharqackpcell = pmdlassigswithdetectedharqackpcell;
	}
	/**
	 * @return the pmdlassigswithdetectedharqackscell
	 */
	public String getPmdlassigswithdetectedharqackscell() {
		return pmdlassigswithdetectedharqackscell;
	}
	/**
	 * @param pmdlassigswithdetectedharqackscell the pmdlassigswithdetectedharqackscell to set
	 */
	public void setPmdlassigswithdetectedharqackscell(
			String pmdlassigswithdetectedharqackscell) {
		this.pmdlassigswithdetectedharqackscell = pmdlassigswithdetectedharqackscell;
	}
	/**
	 * @return the pmdlassigswithdetectedharqackvolte
	 */
	public String getPmdlassigswithdetectedharqackvolte() {
		return pmdlassigswithdetectedharqackvolte;
	}
	/**
	 * @param pmdlassigswithdetectedharqackvolte the pmdlassigswithdetectedharqackvolte to set
	 */
	public void setPmdlassigswithdetectedharqackvolte(
			String pmdlassigswithdetectedharqackvolte) {
		this.pmdlassigswithdetectedharqackvolte = pmdlassigswithdetectedharqackvolte;
	}
	/**
	 * @return the pmdlassigswithunknownreception
	 */
	public String getPmdlassigswithunknownreception() {
		return pmdlassigswithunknownreception;
	}
	/**
	 * @param pmdlassigswithunknownreception the pmdlassigswithunknownreception to set
	 */
	public void setPmdlassigswithunknownreception(
			String pmdlassigswithunknownreception) {
		this.pmdlassigswithunknownreception = pmdlassigswithunknownreception;
	}
	/**
	 * @return the pmdlassigswithunknownreceptionpcell
	 */
	public String getPmdlassigswithunknownreceptionpcell() {
		return pmdlassigswithunknownreceptionpcell;
	}
	/**
	 * @param pmdlassigswithunknownreceptionpcell the pmdlassigswithunknownreceptionpcell to set
	 */
	public void setPmdlassigswithunknownreceptionpcell(
			String pmdlassigswithunknownreceptionpcell) {
		this.pmdlassigswithunknownreceptionpcell = pmdlassigswithunknownreceptionpcell;
	}
	/**
	 * @return the pmdlassigswithunknownreceptionscell
	 */
	public String getPmdlassigswithunknownreceptionscell() {
		return pmdlassigswithunknownreceptionscell;
	}
	/**
	 * @param pmdlassigswithunknownreceptionscell the pmdlassigswithunknownreceptionscell to set
	 */
	public void setPmdlassigswithunknownreceptionscell(
			String pmdlassigswithunknownreceptionscell) {
		this.pmdlassigswithunknownreceptionscell = pmdlassigswithunknownreceptionscell;
	}
	/**
	 * @return the pmdlassigswithunknownreceptionvolte
	 */
	public String getPmdlassigswithunknownreceptionvolte() {
		return pmdlassigswithunknownreceptionvolte;
	}
	/**
	 * @param pmdlassigswithunknownreceptionvolte the pmdlassigswithunknownreceptionvolte to set
	 */
	public void setPmdlassigswithunknownreceptionvolte(
			String pmdlassigswithunknownreceptionvolte) {
		this.pmdlassigswithunknownreceptionvolte = pmdlassigswithunknownreceptionvolte;
	}
	/**
	 * @return the pmdrxcommandpft
	 */
	public String getPmdrxcommandpft() {
		return pmdrxcommandpft;
	}
	/**
	 * @param pmdrxcommandpft the pmdrxcommandpft to set
	 */
	public void setPmdrxcommandpft(String pmdrxcommandpft) {
		this.pmdrxcommandpft = pmdrxcommandpft;
	}
	/**
	 * @return the pmdrxsleeptime
	 */
	public String getPmdrxsleeptime() {
		return pmdrxsleeptime;
	}
	/**
	 * @param pmdrxsleeptime the pmdrxsleeptime to set
	 */
	public void setPmdrxsleeptime(String pmdrxsleeptime) {
		this.pmdrxsleeptime = pmdrxsleeptime;
	}
	/**
	 * @return the pmdrxsleeptimepft
	 */
	public String getPmdrxsleeptimepft() {
		return pmdrxsleeptimepft;
	}
	/**
	 * @param pmdrxsleeptimepft the pmdrxsleeptimepft to set
	 */
	public void setPmdrxsleeptimepft(String pmdrxsleeptimepft) {
		this.pmdrxsleeptimepft = pmdrxsleeptimepft;
	}
	/**
	 * @return the pmdrxtotaltime
	 */
	public String getPmdrxtotaltime() {
		return pmdrxtotaltime;
	}
	/**
	 * @param pmdrxtotaltime the pmdrxtotaltime to set
	 */
	public void setPmdrxtotaltime(String pmdrxtotaltime) {
		this.pmdrxtotaltime = pmdrxtotaltime;
	}
	/**
	 * @return the pmdrxtotaltimepft
	 */
	public String getPmdrxtotaltimepft() {
		return pmdrxtotaltimepft;
	}
	/**
	 * @param pmdrxtotaltimepft the pmdrxtotaltimepft to set
	 */
	public void setPmdrxtotaltimepft(String pmdrxtotaltimepft) {
		this.pmdrxtotaltimepft = pmdrxtotaltimepft;
	}
	/**
	 * @return the pmdsdreqpft
	 */
	public String getPmdsdreqpft() {
		return pmdsdreqpft;
	}
	/**
	 * @param pmdsdreqpft the pmdsdreqpft to set
	 */
	public void setPmdsdreqpft(String pmdsdreqpft) {
		this.pmdsdreqpft = pmdsdreqpft;
	}
	/**
	 * @return the pmdtdreqpft
	 */
	public String getPmdtdreqpft() {
		return pmdtdreqpft;
	}
	/**
	 * @param pmdtdreqpft the pmdtdreqpft to set
	 */
	public void setPmdtdreqpft(String pmdtdreqpft) {
		this.pmdtdreqpft = pmdtdreqpft;
	}
	/**
	 * @return the pmelcpdcchblankedtti
	 */
	public String getPmelcpdcchblankedtti() {
		return pmelcpdcchblankedtti;
	}
	/**
	 * @param pmelcpdcchblankedtti the pmelcpdcchblankedtti to set
	 */
	public void setPmelcpdcchblankedtti(String pmelcpdcchblankedtti) {
		this.pmelcpdcchblankedtti = pmelcpdcchblankedtti;
	}
	/**
	 * @return the pmelcpdschblankedtti
	 */
	public String getPmelcpdschblankedtti() {
		return pmelcpdschblankedtti;
	}
	/**
	 * @param pmelcpdschblankedtti the pmelcpdschblankedtti to set
	 */
	public void setPmelcpdschblankedtti(String pmelcpdschblankedtti) {
		this.pmelcpdschblankedtti = pmelcpdschblankedtti;
	}
	/**
	 * @return the pmerabadmissionattarp0
	 */
	public String getPmerabadmissionattarp0() {
		return pmerabadmissionattarp0;
	}
	/**
	 * @param pmerabadmissionattarp0 the pmerabadmissionattarp0 to set
	 */
	public void setPmerabadmissionattarp0(String pmerabadmissionattarp0) {
		this.pmerabadmissionattarp0 = pmerabadmissionattarp0;
	}
	/**
	 * @return the pmerabadmissionattarp1
	 */
	public String getPmerabadmissionattarp1() {
		return pmerabadmissionattarp1;
	}
	/**
	 * @param pmerabadmissionattarp1 the pmerabadmissionattarp1 to set
	 */
	public void setPmerabadmissionattarp1(String pmerabadmissionattarp1) {
		this.pmerabadmissionattarp1 = pmerabadmissionattarp1;
	}
	/**
	 * @return the pmerabadmissionattarp10
	 */
	public String getPmerabadmissionattarp10() {
		return pmerabadmissionattarp10;
	}
	/**
	 * @param pmerabadmissionattarp10 the pmerabadmissionattarp10 to set
	 */
	public void setPmerabadmissionattarp10(String pmerabadmissionattarp10) {
		this.pmerabadmissionattarp10 = pmerabadmissionattarp10;
	}
	/**
	 * @return the pmerabadmissionattarp11
	 */
	public String getPmerabadmissionattarp11() {
		return pmerabadmissionattarp11;
	}
	/**
	 * @param pmerabadmissionattarp11 the pmerabadmissionattarp11 to set
	 */
	public void setPmerabadmissionattarp11(String pmerabadmissionattarp11) {
		this.pmerabadmissionattarp11 = pmerabadmissionattarp11;
	}
	/**
	 * @return the pmerabadmissionattarp12
	 */
	public String getPmerabadmissionattarp12() {
		return pmerabadmissionattarp12;
	}
	/**
	 * @param pmerabadmissionattarp12 the pmerabadmissionattarp12 to set
	 */
	public void setPmerabadmissionattarp12(String pmerabadmissionattarp12) {
		this.pmerabadmissionattarp12 = pmerabadmissionattarp12;
	}
	/**
	 * @return the pmerabadmissionattarp13
	 */
	public String getPmerabadmissionattarp13() {
		return pmerabadmissionattarp13;
	}
	/**
	 * @param pmerabadmissionattarp13 the pmerabadmissionattarp13 to set
	 */
	public void setPmerabadmissionattarp13(String pmerabadmissionattarp13) {
		this.pmerabadmissionattarp13 = pmerabadmissionattarp13;
	}
	/**
	 * @return the pmerabadmissionattarp14
	 */
	public String getPmerabadmissionattarp14() {
		return pmerabadmissionattarp14;
	}
	/**
	 * @param pmerabadmissionattarp14 the pmerabadmissionattarp14 to set
	 */
	public void setPmerabadmissionattarp14(String pmerabadmissionattarp14) {
		this.pmerabadmissionattarp14 = pmerabadmissionattarp14;
	}
	/**
	 * @return the pmerabadmissionattarp15
	 */
	public String getPmerabadmissionattarp15() {
		return pmerabadmissionattarp15;
	}
	/**
	 * @param pmerabadmissionattarp15 the pmerabadmissionattarp15 to set
	 */
	public void setPmerabadmissionattarp15(String pmerabadmissionattarp15) {
		this.pmerabadmissionattarp15 = pmerabadmissionattarp15;
	}
	/**
	 * @return the pmerabadmissionattarp2
	 */
	public String getPmerabadmissionattarp2() {
		return pmerabadmissionattarp2;
	}
	/**
	 * @param pmerabadmissionattarp2 the pmerabadmissionattarp2 to set
	 */
	public void setPmerabadmissionattarp2(String pmerabadmissionattarp2) {
		this.pmerabadmissionattarp2 = pmerabadmissionattarp2;
	}
	/**
	 * @return the pmerabadmissionattarp3
	 */
	public String getPmerabadmissionattarp3() {
		return pmerabadmissionattarp3;
	}
	/**
	 * @param pmerabadmissionattarp3 the pmerabadmissionattarp3 to set
	 */
	public void setPmerabadmissionattarp3(String pmerabadmissionattarp3) {
		this.pmerabadmissionattarp3 = pmerabadmissionattarp3;
	}
	/**
	 * @return the pmerabadmissionattarp4
	 */
	public String getPmerabadmissionattarp4() {
		return pmerabadmissionattarp4;
	}
	/**
	 * @param pmerabadmissionattarp4 the pmerabadmissionattarp4 to set
	 */
	public void setPmerabadmissionattarp4(String pmerabadmissionattarp4) {
		this.pmerabadmissionattarp4 = pmerabadmissionattarp4;
	}
	/**
	 * @return the pmerabadmissionattarp5
	 */
	public String getPmerabadmissionattarp5() {
		return pmerabadmissionattarp5;
	}
	/**
	 * @param pmerabadmissionattarp5 the pmerabadmissionattarp5 to set
	 */
	public void setPmerabadmissionattarp5(String pmerabadmissionattarp5) {
		this.pmerabadmissionattarp5 = pmerabadmissionattarp5;
	}
	/**
	 * @return the pmerabadmissionattarp6
	 */
	public String getPmerabadmissionattarp6() {
		return pmerabadmissionattarp6;
	}
	/**
	 * @param pmerabadmissionattarp6 the pmerabadmissionattarp6 to set
	 */
	public void setPmerabadmissionattarp6(String pmerabadmissionattarp6) {
		this.pmerabadmissionattarp6 = pmerabadmissionattarp6;
	}
	/**
	 * @return the pmerabadmissionattarp7
	 */
	public String getPmerabadmissionattarp7() {
		return pmerabadmissionattarp7;
	}
	/**
	 * @param pmerabadmissionattarp7 the pmerabadmissionattarp7 to set
	 */
	public void setPmerabadmissionattarp7(String pmerabadmissionattarp7) {
		this.pmerabadmissionattarp7 = pmerabadmissionattarp7;
	}
	/**
	 * @return the pmerabadmissionattarp8
	 */
	public String getPmerabadmissionattarp8() {
		return pmerabadmissionattarp8;
	}
	/**
	 * @param pmerabadmissionattarp8 the pmerabadmissionattarp8 to set
	 */
	public void setPmerabadmissionattarp8(String pmerabadmissionattarp8) {
		this.pmerabadmissionattarp8 = pmerabadmissionattarp8;
	}
	/**
	 * @return the pmerabadmissionattarp9
	 */
	public String getPmerabadmissionattarp9() {
		return pmerabadmissionattarp9;
	}
	/**
	 * @param pmerabadmissionattarp9 the pmerabadmissionattarp9 to set
	 */
	public void setPmerabadmissionattarp9(String pmerabadmissionattarp9) {
		this.pmerabadmissionattarp9 = pmerabadmissionattarp9;
	}
	/**
	 * @return the pmerabadmissionsuccarp0
	 */
	public String getPmerabadmissionsuccarp0() {
		return pmerabadmissionsuccarp0;
	}
	/**
	 * @param pmerabadmissionsuccarp0 the pmerabadmissionsuccarp0 to set
	 */
	public void setPmerabadmissionsuccarp0(String pmerabadmissionsuccarp0) {
		this.pmerabadmissionsuccarp0 = pmerabadmissionsuccarp0;
	}
	/**
	 * @return the pmerabadmissionsuccarp1
	 */
	public String getPmerabadmissionsuccarp1() {
		return pmerabadmissionsuccarp1;
	}
	/**
	 * @param pmerabadmissionsuccarp1 the pmerabadmissionsuccarp1 to set
	 */
	public void setPmerabadmissionsuccarp1(String pmerabadmissionsuccarp1) {
		this.pmerabadmissionsuccarp1 = pmerabadmissionsuccarp1;
	}
	/**
	 * @return the pmerabadmissionsuccarp10
	 */
	public String getPmerabadmissionsuccarp10() {
		return pmerabadmissionsuccarp10;
	}
	/**
	 * @param pmerabadmissionsuccarp10 the pmerabadmissionsuccarp10 to set
	 */
	public void setPmerabadmissionsuccarp10(String pmerabadmissionsuccarp10) {
		this.pmerabadmissionsuccarp10 = pmerabadmissionsuccarp10;
	}
	/**
	 * @return the pmerabadmissionsuccarp11
	 */
	public String getPmerabadmissionsuccarp11() {
		return pmerabadmissionsuccarp11;
	}
	/**
	 * @param pmerabadmissionsuccarp11 the pmerabadmissionsuccarp11 to set
	 */
	public void setPmerabadmissionsuccarp11(String pmerabadmissionsuccarp11) {
		this.pmerabadmissionsuccarp11 = pmerabadmissionsuccarp11;
	}
	/**
	 * @return the pmerabadmissionsuccarp12
	 */
	public String getPmerabadmissionsuccarp12() {
		return pmerabadmissionsuccarp12;
	}
	/**
	 * @param pmerabadmissionsuccarp12 the pmerabadmissionsuccarp12 to set
	 */
	public void setPmerabadmissionsuccarp12(String pmerabadmissionsuccarp12) {
		this.pmerabadmissionsuccarp12 = pmerabadmissionsuccarp12;
	}
	/**
	 * @return the pmerabadmissionsuccarp13
	 */
	public String getPmerabadmissionsuccarp13() {
		return pmerabadmissionsuccarp13;
	}
	/**
	 * @param pmerabadmissionsuccarp13 the pmerabadmissionsuccarp13 to set
	 */
	public void setPmerabadmissionsuccarp13(String pmerabadmissionsuccarp13) {
		this.pmerabadmissionsuccarp13 = pmerabadmissionsuccarp13;
	}
	/**
	 * @return the pmerabadmissionsuccarp14
	 */
	public String getPmerabadmissionsuccarp14() {
		return pmerabadmissionsuccarp14;
	}
	/**
	 * @param pmerabadmissionsuccarp14 the pmerabadmissionsuccarp14 to set
	 */
	public void setPmerabadmissionsuccarp14(String pmerabadmissionsuccarp14) {
		this.pmerabadmissionsuccarp14 = pmerabadmissionsuccarp14;
	}
	/**
	 * @return the pmerabadmissionsuccarp15
	 */
	public String getPmerabadmissionsuccarp15() {
		return pmerabadmissionsuccarp15;
	}
	/**
	 * @param pmerabadmissionsuccarp15 the pmerabadmissionsuccarp15 to set
	 */
	public void setPmerabadmissionsuccarp15(String pmerabadmissionsuccarp15) {
		this.pmerabadmissionsuccarp15 = pmerabadmissionsuccarp15;
	}
	/**
	 * @return the pmerabadmissionsuccarp2
	 */
	public String getPmerabadmissionsuccarp2() {
		return pmerabadmissionsuccarp2;
	}
	/**
	 * @param pmerabadmissionsuccarp2 the pmerabadmissionsuccarp2 to set
	 */
	public void setPmerabadmissionsuccarp2(String pmerabadmissionsuccarp2) {
		this.pmerabadmissionsuccarp2 = pmerabadmissionsuccarp2;
	}
	/**
	 * @return the pmerabadmissionsuccarp3
	 */
	public String getPmerabadmissionsuccarp3() {
		return pmerabadmissionsuccarp3;
	}
	/**
	 * @param pmerabadmissionsuccarp3 the pmerabadmissionsuccarp3 to set
	 */
	public void setPmerabadmissionsuccarp3(String pmerabadmissionsuccarp3) {
		this.pmerabadmissionsuccarp3 = pmerabadmissionsuccarp3;
	}
	/**
	 * @return the pmerabadmissionsuccarp4
	 */
	public String getPmerabadmissionsuccarp4() {
		return pmerabadmissionsuccarp4;
	}
	/**
	 * @param pmerabadmissionsuccarp4 the pmerabadmissionsuccarp4 to set
	 */
	public void setPmerabadmissionsuccarp4(String pmerabadmissionsuccarp4) {
		this.pmerabadmissionsuccarp4 = pmerabadmissionsuccarp4;
	}
	/**
	 * @return the pmerabadmissionsuccarp5
	 */
	public String getPmerabadmissionsuccarp5() {
		return pmerabadmissionsuccarp5;
	}
	/**
	 * @param pmerabadmissionsuccarp5 the pmerabadmissionsuccarp5 to set
	 */
	public void setPmerabadmissionsuccarp5(String pmerabadmissionsuccarp5) {
		this.pmerabadmissionsuccarp5 = pmerabadmissionsuccarp5;
	}
	/**
	 * @return the pmerabadmissionsuccarp6
	 */
	public String getPmerabadmissionsuccarp6() {
		return pmerabadmissionsuccarp6;
	}
	/**
	 * @param pmerabadmissionsuccarp6 the pmerabadmissionsuccarp6 to set
	 */
	public void setPmerabadmissionsuccarp6(String pmerabadmissionsuccarp6) {
		this.pmerabadmissionsuccarp6 = pmerabadmissionsuccarp6;
	}
	/**
	 * @return the pmerabadmissionsuccarp7
	 */
	public String getPmerabadmissionsuccarp7() {
		return pmerabadmissionsuccarp7;
	}
	/**
	 * @param pmerabadmissionsuccarp7 the pmerabadmissionsuccarp7 to set
	 */
	public void setPmerabadmissionsuccarp7(String pmerabadmissionsuccarp7) {
		this.pmerabadmissionsuccarp7 = pmerabadmissionsuccarp7;
	}
	/**
	 * @return the pmerabadmissionsuccarp8
	 */
	public String getPmerabadmissionsuccarp8() {
		return pmerabadmissionsuccarp8;
	}
	/**
	 * @param pmerabadmissionsuccarp8 the pmerabadmissionsuccarp8 to set
	 */
	public void setPmerabadmissionsuccarp8(String pmerabadmissionsuccarp8) {
		this.pmerabadmissionsuccarp8 = pmerabadmissionsuccarp8;
	}
	/**
	 * @return the pmerabadmissionsuccarp9
	 */
	public String getPmerabadmissionsuccarp9() {
		return pmerabadmissionsuccarp9;
	}
	/**
	 * @param pmerabadmissionsuccarp9 the pmerabadmissionsuccarp9 to set
	 */
	public void setPmerabadmissionsuccarp9(String pmerabadmissionsuccarp9) {
		this.pmerabadmissionsuccarp9 = pmerabadmissionsuccarp9;
	}
	/**
	 * @return the pmerabestabattadded
	 */
	public String getPmerabestabattadded() {
		return pmerabestabattadded;
	}
	/**
	 * @param pmerabestabattadded the pmerabestabattadded to set
	 */
	public void setPmerabestabattadded(String pmerabestabattadded) {
		this.pmerabestabattadded = pmerabestabattadded;
	}
	/**
	 * @return the pmerabestabattaddedhoongoing
	 */
	public String getPmerabestabattaddedhoongoing() {
		return pmerabestabattaddedhoongoing;
	}
	/**
	 * @param pmerabestabattaddedhoongoing the pmerabestabattaddedhoongoing to set
	 */
	public void setPmerabestabattaddedhoongoing(String pmerabestabattaddedhoongoing) {
		this.pmerabestabattaddedhoongoing = pmerabestabattaddedhoongoing;
	}
	/**
	 * @return the pmerabestabattaddedpa
	 */
	public String getPmerabestabattaddedpa() {
		return pmerabestabattaddedpa;
	}
	/**
	 * @param pmerabestabattaddedpa the pmerabestabattaddedpa to set
	 */
	public void setPmerabestabattaddedpa(String pmerabestabattaddedpa) {
		this.pmerabestabattaddedpa = pmerabestabattaddedpa;
	}
	/**
	 * @return the pmerabestabattgbr
	 */
	public String getPmerabestabattgbr() {
		return pmerabestabattgbr;
	}
	/**
	 * @param pmerabestabattgbr the pmerabestabattgbr to set
	 */
	public void setPmerabestabattgbr(String pmerabestabattgbr) {
		this.pmerabestabattgbr = pmerabestabattgbr;
	}
	/**
	 * @return the pmErabEstabAttInit
	 */
	public String getPmErabEstabAttInit() {
		return pmErabEstabAttInit;
	}
	/**
	 * @param pmerabestabattinit the pmerabestabattinit to set
	 */
	public void setPmErabEstabAttInit(String pmErabEstabAttInit) {
		this.pmErabEstabAttInit = pmErabEstabAttInit;
	}
	/**
	 * @return the pmerabestabattinitpa
	 */
	public String getPmerabestabattinitpa() {
		return pmerabestabattinitpa;
	}
	/**
	 * @param pmerabestabattinitpa the pmerabestabattinitpa to set
	 */
	public void setPmerabestabattinitpa(String pmerabestabattinitpa) {
		this.pmerabestabattinitpa = pmerabestabattinitpa;
	}
	/**
	 * @return the pmerabestabfailaddedhoongoing
	 */
	public String getPmerabestabfailaddedhoongoing() {
		return pmerabestabfailaddedhoongoing;
	}
	/**
	 * @param pmerabestabfailaddedhoongoing the pmerabestabfailaddedhoongoing to set
	 */
	public void setPmerabestabfailaddedhoongoing(
			String pmerabestabfailaddedhoongoing) {
		this.pmerabestabfailaddedhoongoing = pmerabestabfailaddedhoongoing;
	}
	/**
	 * @return the pmerabestabfailaddedlic
	 */
	public String getPmerabestabfailaddedlic() {
		return pmerabestabfailaddedlic;
	}
	/**
	 * @param pmerabestabfailaddedlic the pmerabestabfailaddedlic to set
	 */
	public void setPmerabestabfailaddedlic(String pmerabestabfailaddedlic) {
		this.pmerabestabfailaddedlic = pmerabestabfailaddedlic;
	}
	/**
	 * @return the pmerabestabfailgbrdlcell
	 */
	public String getPmerabestabfailgbrdlcell() {
		return pmerabestabfailgbrdlcell;
	}
	/**
	 * @param pmerabestabfailgbrdlcell the pmerabestabfailgbrdlcell to set
	 */
	public void setPmerabestabfailgbrdlcell(String pmerabestabfailgbrdlcell) {
		this.pmerabestabfailgbrdlcell = pmerabestabfailgbrdlcell;
	}
	/**
	 * @return the pmerabestabfailgbrdlenb
	 */
	public String getPmerabestabfailgbrdlenb() {
		return pmerabestabfailgbrdlenb;
	}
	/**
	 * @param pmerabestabfailgbrdlenb the pmerabestabfailgbrdlenb to set
	 */
	public void setPmerabestabfailgbrdlenb(String pmerabestabfailgbrdlenb) {
		this.pmerabestabfailgbrdlenb = pmerabestabfailgbrdlenb;
	}
	/**
	 * @return the pmerabestabfailgbrulcell
	 */
	public String getPmerabestabfailgbrulcell() {
		return pmerabestabfailgbrulcell;
	}
	/**
	 * @param pmerabestabfailgbrulcell the pmerabestabfailgbrulcell to set
	 */
	public void setPmerabestabfailgbrulcell(String pmerabestabfailgbrulcell) {
		this.pmerabestabfailgbrulcell = pmerabestabfailgbrulcell;
	}
	/**
	 * @return the pmerabestabfailgbrulenb
	 */
	public String getPmerabestabfailgbrulenb() {
		return pmerabestabfailgbrulenb;
	}
	/**
	 * @param pmerabestabfailgbrulenb the pmerabestabfailgbrulenb to set
	 */
	public void setPmerabestabfailgbrulenb(String pmerabestabfailgbrulenb) {
		this.pmerabestabfailgbrulenb = pmerabestabfailgbrulenb;
	}
	/**
	 * @return the pmerabestabfailinitlic
	 */
	public String getPmerabestabfailinitlic() {
		return pmerabestabfailinitlic;
	}
	/**
	 * @param pmerabestabfailinitlic the pmerabestabfailinitlic to set
	 */
	public void setPmerabestabfailinitlic(String pmerabestabfailinitlic) {
		this.pmerabestabfailinitlic = pmerabestabfailinitlic;
	}
	/**
	 * @return the pmerabestabsuccadded
	 */
	public String getPmerabestabsuccadded() {
		return pmerabestabsuccadded;
	}
	/**
	 * @param pmerabestabsuccadded the pmerabestabsuccadded to set
	 */
	public void setPmerabestabsuccadded(String pmerabestabsuccadded) {
		this.pmerabestabsuccadded = pmerabestabsuccadded;
	}
	/**
	 * @return the pmerabestabsuccaddedpa
	 */
	public String getPmerabestabsuccaddedpa() {
		return pmerabestabsuccaddedpa;
	}
	/**
	 * @param pmerabestabsuccaddedpa the pmerabestabsuccaddedpa to set
	 */
	public void setPmerabestabsuccaddedpa(String pmerabestabsuccaddedpa) {
		this.pmerabestabsuccaddedpa = pmerabestabsuccaddedpa;
	}
	/**
	 * @return the pmerabestabsuccgbr
	 */
	public String getPmerabestabsuccgbr() {
		return pmerabestabsuccgbr;
	}
	/**
	 * @param pmerabestabsuccgbr the pmerabestabsuccgbr to set
	 */
	public void setPmerabestabsuccgbr(String pmerabestabsuccgbr) {
		this.pmerabestabsuccgbr = pmerabestabsuccgbr;
	}
	/**
	 * @return the pmErabEstabSuccInit
	 */
	public String getPmErabEstabSuccInit() {
		return pmErabEstabSuccInit;
	}
	/**
	 * @param pmerabestabsuccinit the pmerabestabsuccinit to set
	 */
	public void setPmErabEstabSuccInit(String pmErabEstabSuccInit) {
		this.pmErabEstabSuccInit = pmErabEstabSuccInit;
	}
	/**
	 * @return the pmerabestabsuccinitpa
	 */
	public String getPmerabestabsuccinitpa() {
		return pmerabestabsuccinitpa;
	}
	/**
	 * @param pmerabestabsuccinitpa the pmerabestabsuccinitpa to set
	 */
	public void setPmerabestabsuccinitpa(String pmerabestabsuccinitpa) {
		this.pmerabestabsuccinitpa = pmerabestabsuccinitpa;
	}
	/**
	 * @return the pmerablevsamp
	 */
	public String getPmerablevsamp() {
		return pmerablevsamp;
	}
	/**
	 * @param pmerablevsamp the pmerablevsamp to set
	 */
	public void setPmerablevsamp(String pmerablevsamp) {
		this.pmerablevsamp = pmerablevsamp;
	}
	/**
	 * @return the pmerablevsum
	 */
	public String getPmerablevsum() {
		return pmerablevsum;
	}
	/**
	 * @param pmerablevsum the pmerablevsum to set
	 */
	public void setPmerablevsum(String pmerablevsum) {
		this.pmerablevsum = pmerablevsum;
	}
	/**
	 * @return the pmerabmax
	 */
	public String getPmerabmax() {
		return pmerabmax;
	}
	/**
	 * @param pmerabmax the pmerabmax to set
	 */
	public void setPmerabmax(String pmerabmax) {
		this.pmerabmax = pmerabmax;
	}
	/**
	 * @return the pmerabmodfaillic
	 */
	public String getPmerabmodfaillic() {
		return pmerabmodfaillic;
	}
	/**
	 * @param pmerabmodfaillic the pmerabmodfaillic to set
	 */
	public void setPmerabmodfaillic(String pmerabmodfaillic) {
		this.pmerabmodfaillic = pmerabmodfaillic;
	}
	/**
	 * @return the pmErabRelAbnormalEnb
	 */
	public String getPmErabRelAbnormalEnb() {
		return pmErabRelAbnormalEnb;
	}
	/**
	 * @param pmerabrelabnormalenb the pmerabrelabnormalenb to set
	 */
	public void setPmErabRelAbnormalEnb(String pmErabRelAbnormalEnb) {
		this.pmErabRelAbnormalEnb = pmErabRelAbnormalEnb;
	}
	/**
	 * @return the pmErabRelAbnormalEnbAct
	 */
	public String getPmErabRelAbnormalEnbAct() {
		return pmErabRelAbnormalEnbAct;
	}
	/**
	 * @param pmerabrelabnormalenbact the pmerabrelabnormalenbact to set
	 */
	public void setPmErabRelAbnormalEnbAct(String pmErabRelAbnormalEnbAct) {
		this.pmErabRelAbnormalEnbAct = pmErabRelAbnormalEnbAct;
	}
	/**
	 * @return the pmerabrelabnormalenbactcdt
	 */
	public String getPmerabrelabnormalenbactcdt() {
		return pmerabrelabnormalenbactcdt;
	}
	/**
	 * @param pmerabrelabnormalenbactcdt the pmerabrelabnormalenbactcdt to set
	 */
	public void setPmerabrelabnormalenbactcdt(String pmerabrelabnormalenbactcdt) {
		this.pmerabrelabnormalenbactcdt = pmerabrelabnormalenbactcdt;
	}
	/**
	 * @return the pmerabrelabnormalenbactcdtauto
	 */
	public String getPmerabrelabnormalenbactcdtauto() {
		return pmerabrelabnormalenbactcdtauto;
	}
	/**
	 * @param pmerabrelabnormalenbactcdtauto the pmerabrelabnormalenbactcdtauto to set
	 */
	public void setPmerabrelabnormalenbactcdtauto(
			String pmerabrelabnormalenbactcdtauto) {
		this.pmerabrelabnormalenbactcdtauto = pmerabrelabnormalenbactcdtauto;
	}
	/**
	 * @return the pmerabrelabnormalenbactcdtautopnr
	 */
	public String getPmerabrelabnormalenbactcdtautopnr() {
		return pmerabrelabnormalenbactcdtautopnr;
	}
	/**
	 * @param pmerabrelabnormalenbactcdtautopnr the pmerabrelabnormalenbactcdtautopnr to set
	 */
	public void setPmerabrelabnormalenbactcdtautopnr(
			String pmerabrelabnormalenbactcdtautopnr) {
		this.pmerabrelabnormalenbactcdtautopnr = pmerabrelabnormalenbactcdtautopnr;
	}
	/**
	 * @return the pmerabrelabnormalenbactho
	 */
	public String getPmerabrelabnormalenbactho() {
		return pmerabrelabnormalenbactho;
	}
	/**
	 * @param pmerabrelabnormalenbactho the pmerabrelabnormalenbactho to set
	 */
	public void setPmerabrelabnormalenbactho(String pmerabrelabnormalenbactho) {
		this.pmerabrelabnormalenbactho = pmerabrelabnormalenbactho;
	}
	/**
	 * @return the pmerabrelabnormalenbacthooos
	 */
	public String getPmerabrelabnormalenbacthooos() {
		return pmerabrelabnormalenbacthooos;
	}
	/**
	 * @param pmerabrelabnormalenbacthooos the pmerabrelabnormalenbacthooos to set
	 */
	public void setPmerabrelabnormalenbacthooos(String pmerabrelabnormalenbacthooos) {
		this.pmerabrelabnormalenbacthooos = pmerabrelabnormalenbacthooos;
	}
	/**
	 * @return the pmerabrelabnormalenbacthooospft
	 */
	public String getPmerabrelabnormalenbacthooospft() {
		return pmerabrelabnormalenbacthooospft;
	}
	/**
	 * @param pmerabrelabnormalenbacthooospft the pmerabrelabnormalenbacthooospft to set
	 */
	public void setPmerabrelabnormalenbacthooospft(
			String pmerabrelabnormalenbacthooospft) {
		this.pmerabrelabnormalenbacthooospft = pmerabrelabnormalenbacthooospft;
	}
	/**
	 * @return the pmerabrelabnormalenbacthpr
	 */
	public String getPmerabrelabnormalenbacthpr() {
		return pmerabrelabnormalenbacthpr;
	}
	/**
	 * @param pmerabrelabnormalenbacthpr the pmerabrelabnormalenbacthpr to set
	 */
	public void setPmerabrelabnormalenbacthpr(String pmerabrelabnormalenbacthpr) {
		this.pmerabrelabnormalenbacthpr = pmerabrelabnormalenbacthpr;
	}
	/**
	 * @return the pmerabrelabnormalenbacthproos
	 */
	public String getPmerabrelabnormalenbacthproos() {
		return pmerabrelabnormalenbacthproos;
	}
	/**
	 * @param pmerabrelabnormalenbacthproos the pmerabrelabnormalenbacthproos to set
	 */
	public void setPmerabrelabnormalenbacthproos(
			String pmerabrelabnormalenbacthproos) {
		this.pmerabrelabnormalenbacthproos = pmerabrelabnormalenbacthproos;
	}
	/**
	 * @return the pmerabrelabnormalenbacthproospft
	 */
	public String getPmerabrelabnormalenbacthproospft() {
		return pmerabrelabnormalenbacthproospft;
	}
	/**
	 * @param pmerabrelabnormalenbacthproospft the pmerabrelabnormalenbacthproospft to set
	 */
	public void setPmerabrelabnormalenbacthproospft(
			String pmerabrelabnormalenbacthproospft) {
		this.pmerabrelabnormalenbacthproospft = pmerabrelabnormalenbacthproospft;
	}
	/**
	 * @return the pmerabrelabnormalenbactoos
	 */
	public String getPmerabrelabnormalenbactoos() {
		return pmerabrelabnormalenbactoos;
	}
	/**
	 * @param pmerabrelabnormalenbactoos the pmerabrelabnormalenbactoos to set
	 */
	public void setPmerabrelabnormalenbactoos(String pmerabrelabnormalenbactoos) {
		this.pmerabrelabnormalenbactoos = pmerabrelabnormalenbactoos;
	}
	/**
	 * @return the pmerabrelabnormalenbactoospft
	 */
	public String getPmerabrelabnormalenbactoospft() {
		return pmerabrelabnormalenbactoospft;
	}
	/**
	 * @param pmerabrelabnormalenbactoospft the pmerabrelabnormalenbactoospft to set
	 */
	public void setPmerabrelabnormalenbactoospft(
			String pmerabrelabnormalenbactoospft) {
		this.pmerabrelabnormalenbactoospft = pmerabrelabnormalenbactoospft;
	}
	/**
	 * @return the pmerabrelabnormalenbactpe
	 */
	public String getPmerabrelabnormalenbactpe() {
		return pmerabrelabnormalenbactpe;
	}
	/**
	 * @param pmerabrelabnormalenbactpe the pmerabrelabnormalenbactpe to set
	 */
	public void setPmerabrelabnormalenbactpe(String pmerabrelabnormalenbactpe) {
		this.pmerabrelabnormalenbactpe = pmerabrelabnormalenbactpe;
	}
	/**
	 * @return the pmerabrelabnormalenbacttnfail
	 */
	public String getPmerabrelabnormalenbacttnfail() {
		return pmerabrelabnormalenbacttnfail;
	}
	/**
	 * @param pmerabrelabnormalenbacttnfail the pmerabrelabnormalenbacttnfail to set
	 */
	public void setPmerabrelabnormalenbacttnfail(
			String pmerabrelabnormalenbacttnfail) {
		this.pmerabrelabnormalenbacttnfail = pmerabrelabnormalenbacttnfail;
	}
	/**
	 * @return the pmerabrelabnormalenbactuelost
	 */
	public String getPmerabrelabnormalenbactuelost() {
		return pmerabrelabnormalenbactuelost;
	}
	/**
	 * @param pmerabrelabnormalenbactuelost the pmerabrelabnormalenbactuelost to set
	 */
	public void setPmerabrelabnormalenbactuelost(
			String pmerabrelabnormalenbactuelost) {
		this.pmerabrelabnormalenbactuelost = pmerabrelabnormalenbactuelost;
	}
	/**
	 * @return the pmerabrelabnormalenbactuelostoos
	 */
	public String getPmerabrelabnormalenbactuelostoos() {
		return pmerabrelabnormalenbactuelostoos;
	}
	/**
	 * @param pmerabrelabnormalenbactuelostoos the pmerabrelabnormalenbactuelostoos to set
	 */
	public void setPmerabrelabnormalenbactuelostoos(
			String pmerabrelabnormalenbactuelostoos) {
		this.pmerabrelabnormalenbactuelostoos = pmerabrelabnormalenbactuelostoos;
	}
	/**
	 * @return the pmerabrelabnormalenbactuelostoospft
	 */
	public String getPmerabrelabnormalenbactuelostoospft() {
		return pmerabrelabnormalenbactuelostoospft;
	}
	/**
	 * @param pmerabrelabnormalenbactuelostoospft the pmerabrelabnormalenbactuelostoospft to set
	 */
	public void setPmerabrelabnormalenbactuelostoospft(
			String pmerabrelabnormalenbactuelostoospft) {
		this.pmerabrelabnormalenbactuelostoospft = pmerabrelabnormalenbactuelostoospft;
	}
	/**
	 * @return the pmerabrelabnormalenbcdt
	 */
	public String getPmerabrelabnormalenbcdt() {
		return pmerabrelabnormalenbcdt;
	}
	/**
	 * @param pmerabrelabnormalenbcdt the pmerabrelabnormalenbcdt to set
	 */
	public void setPmerabrelabnormalenbcdt(String pmerabrelabnormalenbcdt) {
		this.pmerabrelabnormalenbcdt = pmerabrelabnormalenbcdt;
	}
	/**
	 * @return the pmerabrelabnormalenbcdtauto
	 */
	public String getPmerabrelabnormalenbcdtauto() {
		return pmerabrelabnormalenbcdtauto;
	}
	/**
	 * @param pmerabrelabnormalenbcdtauto the pmerabrelabnormalenbcdtauto to set
	 */
	public void setPmerabrelabnormalenbcdtauto(String pmerabrelabnormalenbcdtauto) {
		this.pmerabrelabnormalenbcdtauto = pmerabrelabnormalenbcdtauto;
	}
	/**
	 * @return the pmerabrelabnormalenbcdtautopnr
	 */
	public String getPmerabrelabnormalenbcdtautopnr() {
		return pmerabrelabnormalenbcdtautopnr;
	}
	/**
	 * @param pmerabrelabnormalenbcdtautopnr the pmerabrelabnormalenbcdtautopnr to set
	 */
	public void setPmerabrelabnormalenbcdtautopnr(
			String pmerabrelabnormalenbcdtautopnr) {
		this.pmerabrelabnormalenbcdtautopnr = pmerabrelabnormalenbcdtautopnr;
	}
	/**
	 * @return the pmerabrelabnormalenbextiat
	 */
	public String getPmerabrelabnormalenbextiat() {
		return pmerabrelabnormalenbextiat;
	}
	/**
	 * @param pmerabrelabnormalenbextiat the pmerabrelabnormalenbextiat to set
	 */
	public void setPmerabrelabnormalenbextiat(String pmerabrelabnormalenbextiat) {
		this.pmerabrelabnormalenbextiat = pmerabrelabnormalenbextiat;
	}
	/**
	 * @return the pmerabrelabnormalenbho
	 */
	public String getPmerabrelabnormalenbho() {
		return pmerabrelabnormalenbho;
	}
	/**
	 * @param pmerabrelabnormalenbho the pmerabrelabnormalenbho to set
	 */
	public void setPmerabrelabnormalenbho(String pmerabrelabnormalenbho) {
		this.pmerabrelabnormalenbho = pmerabrelabnormalenbho;
	}
	/**
	 * @return the pmerabrelabnormalenbhooos
	 */
	public String getPmerabrelabnormalenbhooos() {
		return pmerabrelabnormalenbhooos;
	}
	/**
	 * @param pmerabrelabnormalenbhooos the pmerabrelabnormalenbhooos to set
	 */
	public void setPmerabrelabnormalenbhooos(String pmerabrelabnormalenbhooos) {
		this.pmerabrelabnormalenbhooos = pmerabrelabnormalenbhooos;
	}
	/**
	 * @return the pmerabrelabnormalenbhooospft
	 */
	public String getPmerabrelabnormalenbhooospft() {
		return pmerabrelabnormalenbhooospft;
	}
	/**
	 * @param pmerabrelabnormalenbhooospft the pmerabrelabnormalenbhooospft to set
	 */
	public void setPmerabrelabnormalenbhooospft(String pmerabrelabnormalenbhooospft) {
		this.pmerabrelabnormalenbhooospft = pmerabrelabnormalenbhooospft;
	}
	/**
	 * @return the pmerabrelabnormalenbhpr
	 */
	public String getPmerabrelabnormalenbhpr() {
		return pmerabrelabnormalenbhpr;
	}
	/**
	 * @param pmerabrelabnormalenbhpr the pmerabrelabnormalenbhpr to set
	 */
	public void setPmerabrelabnormalenbhpr(String pmerabrelabnormalenbhpr) {
		this.pmerabrelabnormalenbhpr = pmerabrelabnormalenbhpr;
	}
	/**
	 * @return the pmerabrelabnormalenbhproos
	 */
	public String getPmerabrelabnormalenbhproos() {
		return pmerabrelabnormalenbhproos;
	}
	/**
	 * @param pmerabrelabnormalenbhproos the pmerabrelabnormalenbhproos to set
	 */
	public void setPmerabrelabnormalenbhproos(String pmerabrelabnormalenbhproos) {
		this.pmerabrelabnormalenbhproos = pmerabrelabnormalenbhproos;
	}
	/**
	 * @return the pmerabrelabnormalenbhproospft
	 */
	public String getPmerabrelabnormalenbhproospft() {
		return pmerabrelabnormalenbhproospft;
	}
	/**
	 * @param pmerabrelabnormalenbhproospft the pmerabrelabnormalenbhproospft to set
	 */
	public void setPmerabrelabnormalenbhproospft(
			String pmerabrelabnormalenbhproospft) {
		this.pmerabrelabnormalenbhproospft = pmerabrelabnormalenbhproospft;
	}
	/**
	 * @return the pmerabrelabnormalenblic
	 */
	public String getPmerabrelabnormalenblic() {
		return pmerabrelabnormalenblic;
	}
	/**
	 * @param pmerabrelabnormalenblic the pmerabrelabnormalenblic to set
	 */
	public void setPmerabrelabnormalenblic(String pmerabrelabnormalenblic) {
		this.pmerabrelabnormalenblic = pmerabrelabnormalenblic;
	}
	/**
	 * @return the pmerabrelabnormalenboos
	 */
	public String getPmerabrelabnormalenboos() {
		return pmerabrelabnormalenboos;
	}
	/**
	 * @param pmerabrelabnormalenboos the pmerabrelabnormalenboos to set
	 */
	public void setPmerabrelabnormalenboos(String pmerabrelabnormalenboos) {
		this.pmerabrelabnormalenboos = pmerabrelabnormalenboos;
	}
	/**
	 * @return the pmerabrelabnormalenboospft
	 */
	public String getPmerabrelabnormalenboospft() {
		return pmerabrelabnormalenboospft;
	}
	/**
	 * @param pmerabrelabnormalenboospft the pmerabrelabnormalenboospft to set
	 */
	public void setPmerabrelabnormalenboospft(String pmerabrelabnormalenboospft) {
		this.pmerabrelabnormalenboospft = pmerabrelabnormalenboospft;
	}
	/**
	 * @return the pmerabrelabnormalenbpe
	 */
	public String getPmerabrelabnormalenbpe() {
		return pmerabrelabnormalenbpe;
	}
	/**
	 * @param pmerabrelabnormalenbpe the pmerabrelabnormalenbpe to set
	 */
	public void setPmerabrelabnormalenbpe(String pmerabrelabnormalenbpe) {
		this.pmerabrelabnormalenbpe = pmerabrelabnormalenbpe;
	}
	/**
	 * @return the pmerabrelabnormalenbsir
	 */
	public String getPmerabrelabnormalenbsir() {
		return pmerabrelabnormalenbsir;
	}
	/**
	 * @param pmerabrelabnormalenbsir the pmerabrelabnormalenbsir to set
	 */
	public void setPmerabrelabnormalenbsir(String pmerabrelabnormalenbsir) {
		this.pmerabrelabnormalenbsir = pmerabrelabnormalenbsir;
	}
	/**
	 * @return the pmerabrelabnormalenbtnfail
	 */
	public String getPmerabrelabnormalenbtnfail() {
		return pmerabrelabnormalenbtnfail;
	}
	/**
	 * @param pmerabrelabnormalenbtnfail the pmerabrelabnormalenbtnfail to set
	 */
	public void setPmerabrelabnormalenbtnfail(String pmerabrelabnormalenbtnfail) {
		this.pmerabrelabnormalenbtnfail = pmerabrelabnormalenbtnfail;
	}
	/**
	 * @return the pmerabrelabnormalenbuelost
	 */
	public String getPmerabrelabnormalenbuelost() {
		return pmerabrelabnormalenbuelost;
	}
	/**
	 * @param pmerabrelabnormalenbuelost the pmerabrelabnormalenbuelost to set
	 */
	public void setPmerabrelabnormalenbuelost(String pmerabrelabnormalenbuelost) {
		this.pmerabrelabnormalenbuelost = pmerabrelabnormalenbuelost;
	}
	/**
	 * @return the pmerabrelabnormalenbuelostoos
	 */
	public String getPmerabrelabnormalenbuelostoos() {
		return pmerabrelabnormalenbuelostoos;
	}
	/**
	 * @param pmerabrelabnormalenbuelostoos the pmerabrelabnormalenbuelostoos to set
	 */
	public void setPmerabrelabnormalenbuelostoos(
			String pmerabrelabnormalenbuelostoos) {
		this.pmerabrelabnormalenbuelostoos = pmerabrelabnormalenbuelostoos;
	}
	/**
	 * @return the pmerabrelabnormalenbuelostoospft
	 */
	public String getPmerabrelabnormalenbuelostoospft() {
		return pmerabrelabnormalenbuelostoospft;
	}
	/**
	 * @param pmerabrelabnormalenbuelostoospft the pmerabrelabnormalenbuelostoospft to set
	 */
	public void setPmerabrelabnormalenbuelostoospft(
			String pmerabrelabnormalenbuelostoospft) {
		this.pmerabrelabnormalenbuelostoospft = pmerabrelabnormalenbuelostoospft;
	}
	/**
	 * @return the pmerabrelabnormalmme
	 */
	public String getPmerabrelabnormalmme() {
		return pmerabrelabnormalmme;
	}
	/**
	 * @param pmerabrelabnormalmme the pmerabrelabnormalmme to set
	 */
	public void setPmerabrelabnormalmme(String pmerabrelabnormalmme) {
		this.pmerabrelabnormalmme = pmerabrelabnormalmme;
	}
	/**
	 * @return the pmErabRelAbnormalMmeAct
	 */
	public String getPmErabRelAbnormalMmeAct() {
		return pmErabRelAbnormalMmeAct;
	}
	/**
	 * @param pmerabrelabnormalmmeact the pmerabrelabnormalmmeact to set
	 */
	public void setPmErabRelAbnormalMmeAct(String pmErabRelAbnormalMmeAct) {
		this.pmErabRelAbnormalMmeAct = pmErabRelAbnormalMmeAct;
	}
	/**
	 * @return the pmerabrelabnormalmmeextiat
	 */
	public String getPmerabrelabnormalmmeextiat() {
		return pmerabrelabnormalmmeextiat;
	}
	/**
	 * @param pmerabrelabnormalmmeextiat the pmerabrelabnormalmmeextiat to set
	 */
	public void setPmerabrelabnormalmmeextiat(String pmerabrelabnormalmmeextiat) {
		this.pmerabrelabnormalmmeextiat = pmerabrelabnormalmmeextiat;
	}
	/**
	 * @return the pmErabRelMme
	 */
	public String getPmErabRelMme() {
		return pmErabRelMme;
	}
	/**
	 * @param pmerabrelmme the pmerabrelmme to set
	 */
	public void setPmErabRelMme(String pmErabRelMme) {
		this.pmErabRelMme = pmErabRelMme;
	}
	/**
	 * @return the pmerabrelmmeact
	 */
	public String getPmerabrelmmeact() {
		return pmerabrelmmeact;
	}
	/**
	 * @param pmerabrelmmeact the pmerabrelmmeact to set
	 */
	public void setPmerabrelmmeact(String pmerabrelmmeact) {
		this.pmerabrelmmeact = pmerabrelmmeact;
	}
	/**
	 * @return the pmerabrelmmeacteutra
	 */
	public String getPmErabRelMmeActEutra() {
		return pmErabRelMmeActEutra;
	}
	/**
	 * @param pmerabrelmmeacteutra the pmerabrelmmeacteutra to set
	 */
	public void setPmErabRelMmeActEutra(String pmErabRelMmeActEutra) {
		this.pmErabRelMmeActEutra = pmErabRelMmeActEutra;
	}
	/**
	 * @return the pmerabrelmmeactho
	 */
	public String getPmerabrelmmeactho() {
		return pmerabrelmmeactho;
	}
	/**
	 * @param pmerabrelmmeactho the pmerabrelmmeactho to set
	 */
	public void setPmerabrelmmeactho(String pmerabrelmmeactho) {
		this.pmerabrelmmeactho = pmerabrelmmeactho;
	}
	/**
	 * @return the pmerabrelmmeactunspecified
	 */
	public String getPmerabrelmmeactunspecified() {
		return pmerabrelmmeactunspecified;
	}
	/**
	 * @param pmerabrelmmeactunspecified the pmerabrelmmeactunspecified to set
	 */
	public void setPmerabrelmmeactunspecified(String pmerabrelmmeactunspecified) {
		this.pmerabrelmmeactunspecified = pmerabrelmmeactunspecified;
	}
	/**
	 * @return the pmerabrelmmeactuserinactivity
	 */
	public String getPmerabrelmmeactuserinactivity() {
		return pmerabrelmmeactuserinactivity;
	}
	/**
	 * @param pmerabrelmmeactuserinactivity the pmerabrelmmeactuserinactivity to set
	 */
	public void setPmerabrelmmeactuserinactivity(
			String pmerabrelmmeactuserinactivity) {
		this.pmerabrelmmeactuserinactivity = pmerabrelmmeactuserinactivity;
	}
	/**
	 * @return the pmerabrelmmecellunavail
	 */
	public String getPmerabrelmmecellunavail() {
		return pmerabrelmmecellunavail;
	}
	/**
	 * @param pmerabrelmmecellunavail the pmerabrelmmecellunavail to set
	 */
	public void setPmerabrelmmecellunavail(String pmerabrelmmecellunavail) {
		this.pmerabrelmmecellunavail = pmerabrelmmecellunavail;
	}
	/**
	 * @return the pmerabrelmmeho
	 */
	public String getPmerabrelmmeho() {
		return pmerabrelmmeho;
	}
	/**
	 * @param pmerabrelmmeho the pmerabrelmmeho to set
	 */
	public void setPmerabrelmmeho(String pmerabrelmmeho) {
		this.pmerabrelmmeho = pmerabrelmmeho;
	}
	/**
	 * @return the pmErabRelNormalEnb 
	 */
	public String getPmErabRelNormalEnb () {
		return pmErabRelNormalEnb ;
	}
	/**
	 * @param pmerabrelnormalenb the pmerabrelnormalenb to set
	 */
	public void setPmErabRelNormalEnb (String pmErabRelNormalEnb ) {
		this.pmErabRelNormalEnb  = pmErabRelNormalEnb ;
	}
	/**
	 * @return the pmerabrelnormalenbact
	 */
	public String getPmerabrelnormalenbact() {
		return pmerabrelnormalenbact;
	}
	/**
	 * @param pmerabrelnormalenbact the pmerabrelnormalenbact to set
	 */
	public void setPmerabrelnormalenbact(String pmerabrelnormalenbact) {
		this.pmerabrelnormalenbact = pmerabrelnormalenbact;
	}
	/**
	 * @return the pmerabrelnormalenbuserinactivity
	 */
	public String getPmerabrelnormalenbuserinactivity() {
		return pmerabrelnormalenbuserinactivity;
	}
	/**
	 * @param pmerabrelnormalenbuserinactivity the pmerabrelnormalenbuserinactivity to set
	 */
	public void setPmerabrelnormalenbuserinactivity(
			String pmerabrelnormalenbuserinactivity) {
		this.pmerabrelnormalenbuserinactivity = pmerabrelnormalenbuserinactivity;
	}
	/**
	 * @return the pmerabrelnormalmme
	 */
	public String getPmerabrelnormalmme() {
		return pmerabrelnormalmme;
	}
	/**
	 * @param pmerabrelnormalmme the pmerabrelnormalmme to set
	 */
	public void setPmerabrelnormalmme(String pmerabrelnormalmme) {
		this.pmerabrelnormalmme = pmerabrelnormalmme;
	}
	/**
	 * @return the pmerabresumearplow
	 */
	public String getPmerabresumearplow() {
		return pmerabresumearplow;
	}
	/**
	 * @param pmerabresumearplow the pmerabresumearplow to set
	 */
	public void setPmerabresumearplow(String pmerabresumearplow) {
		this.pmerabresumearplow = pmerabresumearplow;
	}
	/**
	 * @return the pmfastpucchassignpft
	 */
	public String getPmfastpucchassignpft() {
		return pmfastpucchassignpft;
	}
	/**
	 * @param pmfastpucchassignpft the pmfastpucchassignpft to set
	 */
	public void setPmfastpucchassignpft(String pmfastpucchassignpft) {
		this.pmfastpucchassignpft = pmfastpucchassignpft;
	}
	/**
	 * @return the pmgoodcovsearchevalreport
	 */
	public String getPmgoodcovsearchevalreport() {
		return pmgoodcovsearchevalreport;
	}
	/**
	 * @param pmgoodcovsearchevalreport the pmgoodcovsearchevalreport to set
	 */
	public void setPmgoodcovsearchevalreport(String pmgoodcovsearchevalreport) {
		this.pmgoodcovsearchevalreport = pmgoodcovsearchevalreport;
	}
	/**
	 * @return the pmgoodcovsearchevalreportrsrp
	 */
	public String getPmgoodcovsearchevalreportrsrp() {
		return pmgoodcovsearchevalreportrsrp;
	}
	/**
	 * @param pmgoodcovsearchevalreportrsrp the pmgoodcovsearchevalreportrsrp to set
	 */
	public void setPmgoodcovsearchevalreportrsrp(
			String pmgoodcovsearchevalreportrsrp) {
		this.pmgoodcovsearchevalreportrsrp = pmgoodcovsearchevalreportrsrp;
	}
	/**
	 * @return the pmgoodcovsearchevalreportul
	 */
	public String getPmgoodcovsearchevalreportul() {
		return pmgoodcovsearchevalreportul;
	}
	/**
	 * @param pmgoodcovsearchevalreportul the pmgoodcovsearchevalreportul to set
	 */
	public void setPmgoodcovsearchevalreportul(String pmgoodcovsearchevalreportul) {
		this.pmgoodcovsearchevalreportul = pmgoodcovsearchevalreportul;
	}
	/**
	 * @return the pmhoprepouts1rejinvalidinterfcsg
	 */
	public String getPmhoprepouts1rejinvalidinterfcsg() {
		return pmhoprepouts1rejinvalidinterfcsg;
	}
	/**
	 * @param pmhoprepouts1rejinvalidinterfcsg the pmhoprepouts1rejinvalidinterfcsg to set
	 */
	public void setPmhoprepouts1rejinvalidinterfcsg(
			String pmhoprepouts1rejinvalidinterfcsg) {
		this.pmhoprepouts1rejinvalidinterfcsg = pmhoprepouts1rejinvalidinterfcsg;
	}
	/**
	 * @return the pmhoprepouts1rejinvalidinterfhybridcsg
	 */
	public String getPmhoprepouts1rejinvalidinterfhybridcsg() {
		return pmhoprepouts1rejinvalidinterfhybridcsg;
	}
	/**
	 * @param pmhoprepouts1rejinvalidinterfhybridcsg the pmhoprepouts1rejinvalidinterfhybridcsg to set
	 */
	public void setPmhoprepouts1rejinvalidinterfhybridcsg(
			String pmhoprepouts1rejinvalidinterfhybridcsg) {
		this.pmhoprepouts1rejinvalidinterfhybridcsg = pmhoprepouts1rejinvalidinterfhybridcsg;
	}
	/**
	 * @return the pmhoprepouts1rejinvalidintrafcsg
	 */
	public String getPmhoprepouts1rejinvalidintrafcsg() {
		return pmhoprepouts1rejinvalidintrafcsg;
	}
	/**
	 * @param pmhoprepouts1rejinvalidintrafcsg the pmhoprepouts1rejinvalidintrafcsg to set
	 */
	public void setPmhoprepouts1rejinvalidintrafcsg(
			String pmhoprepouts1rejinvalidintrafcsg) {
		this.pmhoprepouts1rejinvalidintrafcsg = pmhoprepouts1rejinvalidintrafcsg;
	}
	/**
	 * @return the pmhoprepouts1rejinvalidintrafhybridcsg
	 */
	public String getPmhoprepouts1rejinvalidintrafhybridcsg() {
		return pmhoprepouts1rejinvalidintrafhybridcsg;
	}
	/**
	 * @param pmhoprepouts1rejinvalidintrafhybridcsg the pmhoprepouts1rejinvalidintrafhybridcsg to set
	 */
	public void setPmhoprepouts1rejinvalidintrafhybridcsg(
			String pmhoprepouts1rejinvalidintrafhybridcsg) {
		this.pmhoprepouts1rejinvalidintrafhybridcsg = pmhoprepouts1rejinvalidintrafhybridcsg;
	}
	/**
	 * @return the pmhopreprejinbeareradmissionrej
	 */
	public String getPmhopreprejinbeareradmissionrej() {
		return pmhopreprejinbeareradmissionrej;
	}
	/**
	 * @param pmhopreprejinbeareradmissionrej the pmhopreprejinbeareradmissionrej to set
	 */
	public void setPmhopreprejinbeareradmissionrej(
			String pmhopreprejinbeareradmissionrej) {
		this.pmhopreprejinbeareradmissionrej = pmhopreprejinbeareradmissionrej;
	}
	/**
	 * @return the pmhopreprejincellintensdlc
	 */
	public String getPmhopreprejincellintensdlc() {
		return pmhopreprejincellintensdlc;
	}
	/**
	 * @param pmhopreprejincellintensdlc the pmhopreprejincellintensdlc to set
	 */
	public void setPmhopreprejincellintensdlc(String pmhopreprejincellintensdlc) {
		this.pmhopreprejincellintensdlc = pmhopreprejincellintensdlc;
	}
	/**
	 * @return the pmhopreprejincellintensstat
	 */
	public String getPmhopreprejincellintensstat() {
		return pmhopreprejincellintensstat;
	}
	/**
	 * @param pmhopreprejincellintensstat the pmhopreprejincellintensstat to set
	 */
	public void setPmhopreprejincellintensstat(String pmhopreprejincellintensstat) {
		this.pmhopreprejincellintensstat = pmhopreprejincellintensstat;
	}
	/**
	 * @return the pmhopreprejincellintensswc
	 */
	public String getPmhopreprejincellintensswc() {
		return pmhopreprejincellintensswc;
	}
	/**
	 * @param pmhopreprejincellintensswc the pmhopreprejincellintensswc to set
	 */
	public void setPmhopreprejincellintensswc(String pmhopreprejincellintensswc) {
		this.pmhopreprejincellintensswc = pmhopreprejincellintensswc;
	}
	/**
	 * @return the pmhopreprejincelllatency
	 */
	public String getPmhopreprejincelllatency() {
		return pmhopreprejincelllatency;
	}
	/**
	 * @param pmhopreprejincelllatency the pmhopreprejincelllatency to set
	 */
	public void setPmhopreprejincelllatency(String pmhopreprejincelllatency) {
		this.pmhopreprejincelllatency = pmhopreprejincelllatency;
	}
	/**
	 * @return the pmhopreprejindlonlycell
	 */
	public String getPmhopreprejindlonlycell() {
		return pmhopreprejindlonlycell;
	}
	/**
	 * @param pmhopreprejindlonlycell the pmhopreprejindlonlycell to set
	 */
	public void setPmhopreprejindlonlycell(String pmhopreprejindlonlycell) {
		this.pmhopreprejindlonlycell = pmhopreprejindlonlycell;
	}
	/**
	 * @return the pmhopreprejinduintens
	 */
	public String getPmhopreprejinduintens() {
		return pmhopreprejinduintens;
	}
	/**
	 * @param pmhopreprejinduintens the pmhopreprejinduintens to set
	 */
	public void setPmhopreprejinduintens(String pmhopreprejinduintens) {
		this.pmhopreprejinduintens = pmhopreprejinduintens;
	}
	/**
	 * @return the pmhopreprejinduswc
	 */
	public String getPmhopreprejinduswc() {
		return pmhopreprejinduswc;
	}
	/**
	 * @param pmhopreprejinduswc the pmhopreprejinduswc to set
	 */
	public void setPmhopreprejinduswc(String pmhopreprejinduswc) {
		this.pmhopreprejinduswc = pmhopreprejinduswc;
	}
	/**
	 * @return the pmhopreprejindynueadmctrl
	 */
	public String getPmhopreprejindynueadmctrl() {
		return pmhopreprejindynueadmctrl;
	}
	/**
	 * @param pmhopreprejindynueadmctrl the pmhopreprejindynueadmctrl to set
	 */
	public void setPmhopreprejindynueadmctrl(String pmhopreprejindynueadmctrl) {
		this.pmhopreprejindynueadmctrl = pmhopreprejindynueadmctrl;
	}
	/**
	 * @return the pmhopreprejinhighload
	 */
	public String getPmhopreprejinhighload() {
		return pmhopreprejinhighload;
	}
	/**
	 * @param pmhopreprejinhighload the pmhopreprejinhighload to set
	 */
	public void setPmhopreprejinhighload(String pmhopreprejinhighload) {
		this.pmhopreprejinhighload = pmhopreprejinhighload;
	}
	/**
	 * @return the pmhopreprejinhighloadlong
	 */
	public String getPmhopreprejinhighloadlong() {
		return pmhopreprejinhighloadlong;
	}
	/**
	 * @param pmhopreprejinhighloadlong the pmhopreprejinhighloadlong to set
	 */
	public void setPmhopreprejinhighloadlong(String pmhopreprejinhighloadlong) {
		this.pmhopreprejinhighloadlong = pmhopreprejinhighloadlong;
	}
	/**
	 * @return the pmhopreprejinlicconnusers
	 */
	public String getPmhopreprejinlicconnusers() {
		return pmhopreprejinlicconnusers;
	}
	/**
	 * @param pmhopreprejinlicconnusers the pmhopreprejinlicconnusers to set
	 */
	public void setPmhopreprejinlicconnusers(String pmhopreprejinlicconnusers) {
		this.pmhopreprejinlicconnusers = pmhopreprejinlicconnusers;
	}
	/**
	 * @return the pmhopreprejinliclowcovue
	 */
	public String getPmhopreprejinliclowcovue() {
		return pmhopreprejinliclowcovue;
	}
	/**
	 * @param pmhopreprejinliclowcovue the pmhopreprejinliclowcovue to set
	 */
	public void setPmhopreprejinliclowcovue(String pmhopreprejinliclowcovue) {
		this.pmhopreprejinliclowcovue = pmhopreprejinliclowcovue;
	}
	/**
	 * @return the pmhopreprejinlicmob
	 */
	public String getPmhopreprejinlicmob() {
		return pmhopreprejinlicmob;
	}
	/**
	 * @param pmhopreprejinlicmob the pmhopreprejinlicmob to set
	 */
	public void setPmhopreprejinlicmob(String pmhopreprejinlicmob) {
		this.pmhopreprejinlicmob = pmhopreprejinlicmob;
	}
	/**
	 * @return the pmhopreprejinlicmultierab
	 */
	public String getPmhopreprejinlicmultierab() {
		return pmhopreprejinlicmultierab;
	}
	/**
	 * @param pmhopreprejinlicmultierab the pmhopreprejinlicmultierab to set
	 */
	public void setPmhopreprejinlicmultierab(String pmhopreprejinlicmultierab) {
		this.pmhopreprejinlicmultierab = pmhopreprejinlicmultierab;
	}
	/**
	 * @return the pmhopreprejinlicrlcum
	 */
	public String getPmhopreprejinlicrlcum() {
		return pmhopreprejinlicrlcum;
	}
	/**
	 * @param pmhopreprejinlicrlcum the pmhopreprejinlicrlcum to set
	 */
	public void setPmhopreprejinlicrlcum(String pmhopreprejinlicrlcum) {
		this.pmhopreprejinlicrlcum = pmhopreprejinlicrlcum;
	}
	/**
	 * @return the pmhopreprejinmisigqcong
	 */
	public String getPmhopreprejinmisigqcong() {
		return pmhopreprejinmisigqcong;
	}
	/**
	 * @param pmhopreprejinmisigqcong the pmhopreprejinmisigqcong to set
	 */
	public void setPmhopreprejinmisigqcong(String pmhopreprejinmisigqcong) {
		this.pmhopreprejinmisigqcong = pmhopreprejinmisigqcong;
	}
	/**
	 * @return the pmhopreprejinmpoverload
	 */
	public String getPmhopreprejinmpoverload() {
		return pmhopreprejinmpoverload;
	}
	/**
	 * @param pmhopreprejinmpoverload the pmhopreprejinmpoverload to set
	 */
	public void setPmhopreprejinmpoverload(String pmhopreprejinmpoverload) {
		this.pmhopreprejinmpoverload = pmhopreprejinmpoverload;
	}
	/**
	 * @return the pmhopreprejinoffloadadmission
	 */
	public String getPmhopreprejinoffloadadmission() {
		return pmhopreprejinoffloadadmission;
	}
	/**
	 * @param pmhopreprejinoffloadadmission the pmhopreprejinoffloadadmission to set
	 */
	public void setPmhopreprejinoffloadadmission(
			String pmhopreprejinoffloadadmission) {
		this.pmhopreprejinoffloadadmission = pmhopreprejinoffloadadmission;
	}
	/**
	 * @return the pmhopreprejinoverload
	 */
	public String getPmhopreprejinoverload() {
		return pmhopreprejinoverload;
	}
	/**
	 * @param pmhopreprejinoverload the pmhopreprejinoverload to set
	 */
	public void setPmhopreprejinoverload(String pmhopreprejinoverload) {
		this.pmhopreprejinoverload = pmhopreprejinoverload;
	}
	/**
	 * @return the pmhopreprejinsl
	 */
	public String getPmhopreprejinsl() {
		return pmhopreprejinsl;
	}
	/**
	 * @param pmhopreprejinsl the pmhopreprejinsl to set
	 */
	public void setPmhopreprejinsl(String pmhopreprejinsl) {
		this.pmhopreprejinsl = pmhopreprejinsl;
	}
	/**
	 * @return the pmhopreprejinulthres
	 */
	public String getPmhopreprejinulthres() {
		return pmhopreprejinulthres;
	}
	/**
	 * @param pmhopreprejinulthres the pmhopreprejinulthres to set
	 */
	public void setPmhopreprejinulthres(String pmhopreprejinulthres) {
		this.pmhopreprejinulthres = pmhopreprejinulthres;
	}
	/**
	 * @return the pmhopreprejinulthrescaredirect
	 */
	public String getPmhopreprejinulthrescaredirect() {
		return pmhopreprejinulthrescaredirect;
	}
	/**
	 * @param pmhopreprejinulthrescaredirect the pmhopreprejinulthrescaredirect to set
	 */
	public void setPmhopreprejinulthrescaredirect(
			String pmhopreprejinulthrescaredirect) {
		this.pmhopreprejinulthrescaredirect = pmhopreprejinulthrescaredirect;
	}
	/**
	 * @return the pmhopreventednotinplmnwl
	 */
	public String getPmhopreventednotinplmnwl() {
		return pmhopreventednotinplmnwl;
	}
	/**
	 * @param pmhopreventednotinplmnwl the pmhopreventednotinplmnwl to set
	 */
	public void setPmhopreventednotinplmnwl(String pmhopreventednotinplmnwl) {
		this.pmhopreventednotinplmnwl = pmhopreventednotinplmnwl;
	}
	/**
	 * @return the pmhopreventedproblematiccell
	 */
	public String getPmhopreventedproblematiccell() {
		return pmhopreventedproblematiccell;
	}
	/**
	 * @param pmhopreventedproblematiccell the pmhopreventedproblematiccell to set
	 */
	public void setPmhopreventedproblematiccell(String pmhopreventedproblematiccell) {
		this.pmhopreventedproblematiccell = pmhopreventedproblematiccell;
	}
	/**
	 * @return the pmidlemodereldistrhighload
	 */
	public String getPmidlemodereldistrhighload() {
		return pmidlemodereldistrhighload;
	}
	/**
	 * @param pmidlemodereldistrhighload the pmidlemodereldistrhighload to set
	 */
	public void setPmidlemodereldistrhighload(String pmidlemodereldistrhighload) {
		this.pmidlemodereldistrhighload = pmidlemodereldistrhighload;
	}
	/**
	 * @return the pmidlemodereldistrlowload
	 */
	public String getPmidlemodereldistrlowload() {
		return pmidlemodereldistrlowload;
	}
	/**
	 * @param pmidlemodereldistrlowload the pmidlemodereldistrlowload to set
	 */
	public void setPmidlemodereldistrlowload(String pmidlemodereldistrlowload) {
		this.pmidlemodereldistrlowload = pmidlemodereldistrlowload;
	}
	/**
	 * @return the pmidlemodereldistrlowmediumload
	 */
	public String getPmidlemodereldistrlowmediumload() {
		return pmidlemodereldistrlowmediumload;
	}
	/**
	 * @param pmidlemodereldistrlowmediumload the pmidlemodereldistrlowmediumload to set
	 */
	public void setPmidlemodereldistrlowmediumload(
			String pmidlemodereldistrlowmediumload) {
		this.pmidlemodereldistrlowmediumload = pmidlemodereldistrlowmediumload;
	}
	/**
	 * @return the pmidlemodereldistrmediumhighload
	 */
	public String getPmidlemodereldistrmediumhighload() {
		return pmidlemodereldistrmediumhighload;
	}
	/**
	 * @param pmidlemodereldistrmediumhighload the pmidlemodereldistrmediumhighload to set
	 */
	public void setPmidlemodereldistrmediumhighload(
			String pmidlemodereldistrmediumhighload) {
		this.pmidlemodereldistrmediumhighload = pmidlemodereldistrmediumhighload;
	}
	/**
	 * @return the pmidlemodereldistrmediumload
	 */
	public String getPmidlemodereldistrmediumload() {
		return pmidlemodereldistrmediumload;
	}
	/**
	 * @param pmidlemodereldistrmediumload the pmidlemodereldistrmediumload to set
	 */
	public void setPmidlemodereldistrmediumload(String pmidlemodereldistrmediumload) {
		this.pmidlemodereldistrmediumload = pmidlemodereldistrmediumload;
	}
	/**
	 * @return the pminactiveuerelinhighload
	 */
	public String getPminactiveuerelinhighload() {
		return pminactiveuerelinhighload;
	}
	/**
	 * @param pminactiveuerelinhighload the pminactiveuerelinhighload to set
	 */
	public void setPminactiveuerelinhighload(String pminactiveuerelinhighload) {
		this.pminactiveuerelinhighload = pminactiveuerelinhighload;
	}
	/**
	 * @return the pminsynctimepft
	 */
	public String getPminsynctimepft() {
		return pminsynctimepft;
	}
	/**
	 * @param pminsynctimepft the pminsynctimepft to set
	 */
	public void setPminsynctimepft(String pminsynctimepft) {
		this.pminsynctimepft = pminsynctimepft;
	}
	/**
	 * @return the pminvalidpftmsg
	 */
	public String getPminvalidpftmsg() {
		return pminvalidpftmsg;
	}
	/**
	 * @param pminvalidpftmsg the pminvalidpftmsg to set
	 */
	public void setPminvalidpftmsg(String pminvalidpftmsg) {
		this.pminvalidpftmsg = pminvalidpftmsg;
	}
	/**
	 * @return the pminvalidpftnum
	 */
	public String getPminvalidpftnum() {
		return pminvalidpftnum;
	}
	/**
	 * @param pminvalidpftnum the pminvalidpftnum to set
	 */
	public void setPminvalidpftnum(String pminvalidpftnum) {
		this.pminvalidpftnum = pminvalidpftnum;
	}
	/**
	 * @return the pmlbevalexpiredue
	 */
	public String getPmlbevalexpiredue() {
		return pmlbevalexpiredue;
	}
	/**
	 * @param pmlbevalexpiredue the pmlbevalexpiredue to set
	 */
	public void setPmlbevalexpiredue(String pmlbevalexpiredue) {
		this.pmlbevalexpiredue = pmlbevalexpiredue;
	}
	/**
	 * @return the pmlbsubratiosamp
	 */
	public String getPmlbsubratiosamp() {
		return pmlbsubratiosamp;
	}
	/**
	 * @param pmlbsubratiosamp the pmlbsubratiosamp to set
	 */
	public void setPmlbsubratiosamp(String pmlbsubratiosamp) {
		this.pmlbsubratiosamp = pmlbsubratiosamp;
	}
	/**
	 * @return the pmlbsubratiosum
	 */
	public String getPmlbsubratiosum() {
		return pmlbsubratiosum;
	}
	/**
	 * @param pmlbsubratiosum the pmlbsubratiosum to set
	 */
	public void setPmlbsubratiosum(String pmlbsubratiosum) {
		this.pmlbsubratiosum = pmlbsubratiosum;
	}
	/**
	 * @return the pmlongdrxcommandpft
	 */
	public String getPmlongdrxcommandpft() {
		return pmlongdrxcommandpft;
	}
	/**
	 * @param pmlongdrxcommandpft the pmlongdrxcommandpft to set
	 */
	public void setPmlongdrxcommandpft(String pmlongdrxcommandpft) {
		this.pmlongdrxcommandpft = pmlongdrxcommandpft;
	}
	/**
	 * @return the pmmaccellthptimedl
	 */
	public String getPmmaccellthptimedl() {
		return pmmaccellthptimedl;
	}
	/**
	 * @param pmmaccellthptimedl the pmmaccellthptimedl to set
	 */
	public void setPmmaccellthptimedl(String pmmaccellthptimedl) {
		this.pmmaccellthptimedl = pmmaccellthptimedl;
	}
	/**
	 * @return the pmmaccellthptimeul
	 */
	public String getPmmaccellthptimeul() {
		return pmmaccellthptimeul;
	}
	/**
	 * @param pmmaccellthptimeul the pmmaccellthptimeul to set
	 */
	public void setPmmaccellthptimeul(String pmmaccellthptimeul) {
		this.pmmaccellthptimeul = pmmaccellthptimeul;
	}
	/**
	 * @return the pmmacdelaytimedl
	 */
	public String getPmmacdelaytimedl() {
		return pmmacdelaytimedl;
	}
	/**
	 * @param pmmacdelaytimedl the pmmacdelaytimedl to set
	 */
	public void setPmmacdelaytimedl(String pmmacdelaytimedl) {
		this.pmmacdelaytimedl = pmmacdelaytimedl;
	}
	/**
	 * @return the pmmacharqdlack
	 */
	public String getPmmacharqdlack() {
		return pmmacharqdlack;
	}
	/**
	 * @param pmmacharqdlack the pmmacharqdlack to set
	 */
	public void setPmmacharqdlack(String pmmacharqdlack) {
		this.pmmacharqdlack = pmmacharqdlack;
	}
	/**
	 * @return the pmmacharqdlack16qam
	 */
	public String getPmmacharqdlack16qam() {
		return pmmacharqdlack16qam;
	}
	/**
	 * @param pmmacharqdlack16qam the pmmacharqdlack16qam to set
	 */
	public void setPmmacharqdlack16qam(String pmmacharqdlack16qam) {
		this.pmmacharqdlack16qam = pmmacharqdlack16qam;
	}
	/**
	 * @return the pmmacharqdlack256qam
	 */
	public String getPmmacharqdlack256qam() {
		return pmmacharqdlack256qam;
	}
	/**
	 * @param pmmacharqdlack256qam the pmmacharqdlack256qam to set
	 */
	public void setPmmacharqdlack256qam(String pmmacharqdlack256qam) {
		this.pmmacharqdlack256qam = pmmacharqdlack256qam;
	}
	/**
	 * @return the pmmacharqdlack64qam
	 */
	public String getPmmacharqdlack64qam() {
		return pmmacharqdlack64qam;
	}
	/**
	 * @param pmmacharqdlack64qam the pmmacharqdlack64qam to set
	 */
	public void setPmmacharqdlack64qam(String pmmacharqdlack64qam) {
		this.pmmacharqdlack64qam = pmmacharqdlack64qam;
	}
	/**
	 * @return the pmmacharqdlackcomp
	 */
	public String getPmmacharqdlackcomp() {
		return pmmacharqdlackcomp;
	}
	/**
	 * @param pmmacharqdlackcomp the pmmacharqdlackcomp to set
	 */
	public void setPmmacharqdlackcomp(String pmmacharqdlackcomp) {
		this.pmmacharqdlackcomp = pmmacharqdlackcomp;
	}
	/**
	 * @return the pmmacharqdlackqpsk
	 */
	public String getPmmacharqdlackqpsk() {
		return pmmacharqdlackqpsk;
	}
	/**
	 * @param pmmacharqdlackqpsk the pmmacharqdlackqpsk to set
	 */
	public void setPmmacharqdlackqpsk(String pmmacharqdlackqpsk) {
		this.pmmacharqdlackqpsk = pmmacharqdlackqpsk;
	}
	/**
	 * @return the pmmacharqdldtx
	 */
	public String getPmmacharqdldtx() {
		return pmmacharqdldtx;
	}
	/**
	 * @param pmmacharqdldtx the pmmacharqdldtx to set
	 */
	public void setPmmacharqdldtx(String pmmacharqdldtx) {
		this.pmmacharqdldtx = pmmacharqdldtx;
	}
	/**
	 * @return the pmmacharqdldtx16qam
	 */
	public String getPmmacharqdldtx16qam() {
		return pmmacharqdldtx16qam;
	}
	/**
	 * @param pmmacharqdldtx16qam the pmmacharqdldtx16qam to set
	 */
	public void setPmmacharqdldtx16qam(String pmmacharqdldtx16qam) {
		this.pmmacharqdldtx16qam = pmmacharqdldtx16qam;
	}
	/**
	 * @return the pmmacharqdldtx256qam
	 */
	public String getPmmacharqdldtx256qam() {
		return pmmacharqdldtx256qam;
	}
	/**
	 * @param pmmacharqdldtx256qam the pmmacharqdldtx256qam to set
	 */
	public void setPmmacharqdldtx256qam(String pmmacharqdldtx256qam) {
		this.pmmacharqdldtx256qam = pmmacharqdldtx256qam;
	}
	/**
	 * @return the pmmacharqdldtx64qam
	 */
	public String getPmmacharqdldtx64qam() {
		return pmmacharqdldtx64qam;
	}
	/**
	 * @param pmmacharqdldtx64qam the pmmacharqdldtx64qam to set
	 */
	public void setPmmacharqdldtx64qam(String pmmacharqdldtx64qam) {
		this.pmmacharqdldtx64qam = pmmacharqdldtx64qam;
	}
	/**
	 * @return the pmmacharqdldtxqpsk
	 */
	public String getPmmacharqdldtxqpsk() {
		return pmmacharqdldtxqpsk;
	}
	/**
	 * @param pmmacharqdldtxqpsk the pmmacharqdldtxqpsk to set
	 */
	public void setPmmacharqdldtxqpsk(String pmmacharqdldtxqpsk) {
		this.pmmacharqdldtxqpsk = pmmacharqdldtxqpsk;
	}
	/**
	 * @return the pmmacharqdlnack
	 */
	public String getPmmacharqdlnack() {
		return pmmacharqdlnack;
	}
	/**
	 * @param pmmacharqdlnack the pmmacharqdlnack to set
	 */
	public void setPmmacharqdlnack(String pmmacharqdlnack) {
		this.pmmacharqdlnack = pmmacharqdlnack;
	}
	/**
	 * @return the pmmacharqdlnack16qam
	 */
	public String getPmmacharqdlnack16qam() {
		return pmmacharqdlnack16qam;
	}
	/**
	 * @param pmmacharqdlnack16qam the pmmacharqdlnack16qam to set
	 */
	public void setPmmacharqdlnack16qam(String pmmacharqdlnack16qam) {
		this.pmmacharqdlnack16qam = pmmacharqdlnack16qam;
	}
	/**
	 * @return the pmmacharqdlnack256qam
	 */
	public String getPmmacharqdlnack256qam() {
		return pmmacharqdlnack256qam;
	}
	/**
	 * @param pmmacharqdlnack256qam the pmmacharqdlnack256qam to set
	 */
	public void setPmmacharqdlnack256qam(String pmmacharqdlnack256qam) {
		this.pmmacharqdlnack256qam = pmmacharqdlnack256qam;
	}
	/**
	 * @return the pmmacharqdlnack64qam
	 */
	public String getPmmacharqdlnack64qam() {
		return pmmacharqdlnack64qam;
	}
	/**
	 * @param pmmacharqdlnack64qam the pmmacharqdlnack64qam to set
	 */
	public void setPmmacharqdlnack64qam(String pmmacharqdlnack64qam) {
		this.pmmacharqdlnack64qam = pmmacharqdlnack64qam;
	}
	/**
	 * @return the pmmacharqdlnackcomp
	 */
	public String getPmmacharqdlnackcomp() {
		return pmmacharqdlnackcomp;
	}
	/**
	 * @param pmmacharqdlnackcomp the pmmacharqdlnackcomp to set
	 */
	public void setPmmacharqdlnackcomp(String pmmacharqdlnackcomp) {
		this.pmmacharqdlnackcomp = pmmacharqdlnackcomp;
	}
	/**
	 * @return the pmmacharqdlnackqpsk
	 */
	public String getPmmacharqdlnackqpsk() {
		return pmmacharqdlnackqpsk;
	}
	/**
	 * @param pmmacharqdlnackqpsk the pmmacharqdlnackqpsk to set
	 */
	public void setPmmacharqdlnackqpsk(String pmmacharqdlnackqpsk) {
		this.pmmacharqdlnackqpsk = pmmacharqdlnackqpsk;
	}
	/**
	 * @return the pmmacharqfail
	 */
	public String getPmmacharqfail() {
		return pmmacharqfail;
	}
	/**
	 * @param pmmacharqfail the pmmacharqfail to set
	 */
	public void setPmmacharqfail(String pmmacharqfail) {
		this.pmmacharqfail = pmmacharqfail;
	}
	/**
	 * @return the pmmacharqulack
	 */
	public String getPmmacharqulack() {
		return pmmacharqulack;
	}
	/**
	 * @param pmmacharqulack the pmmacharqulack to set
	 */
	public void setPmmacharqulack(String pmmacharqulack) {
		this.pmmacharqulack = pmmacharqulack;
	}
	/**
	 * @return the pmmacharquldtx
	 */
	public String getPmmacharquldtx() {
		return pmmacharquldtx;
	}
	/**
	 * @param pmmacharquldtx the pmmacharquldtx to set
	 */
	public void setPmmacharquldtx(String pmmacharquldtx) {
		this.pmmacharquldtx = pmmacharquldtx;
	}
	/**
	 * @return the pmmacharquldtx16qam
	 */
	public String getPmmacharquldtx16qam() {
		return pmmacharquldtx16qam;
	}
	/**
	 * @param pmmacharquldtx16qam the pmmacharquldtx16qam to set
	 */
	public void setPmmacharquldtx16qam(String pmmacharquldtx16qam) {
		this.pmmacharquldtx16qam = pmmacharquldtx16qam;
	}
	/**
	 * @return the pmmacharquldtx64qam
	 */
	public String getPmmacharquldtx64qam() {
		return pmmacharquldtx64qam;
	}
	/**
	 * @param pmmacharquldtx64qam the pmmacharquldtx64qam to set
	 */
	public void setPmmacharquldtx64qam(String pmmacharquldtx64qam) {
		this.pmmacharquldtx64qam = pmmacharquldtx64qam;
	}
	/**
	 * @return the pmmacharquldtxqpsk
	 */
	public String getPmmacharquldtxqpsk() {
		return pmmacharquldtxqpsk;
	}
	/**
	 * @param pmmacharquldtxqpsk the pmmacharquldtxqpsk to set
	 */
	public void setPmmacharquldtxqpsk(String pmmacharquldtxqpsk) {
		this.pmmacharquldtxqpsk = pmmacharquldtxqpsk;
	}
	/**
	 * @return the pmmacharqulfail16qam
	 */
	public String getPmmacharqulfail16qam() {
		return pmmacharqulfail16qam;
	}
	/**
	 * @param pmmacharqulfail16qam the pmmacharqulfail16qam to set
	 */
	public void setPmmacharqulfail16qam(String pmmacharqulfail16qam) {
		this.pmmacharqulfail16qam = pmmacharqulfail16qam;
	}
	/**
	 * @return the pmmacharqulfail64qam
	 */
	public String getPmmacharqulfail64qam() {
		return pmmacharqulfail64qam;
	}
	/**
	 * @param pmmacharqulfail64qam the pmmacharqulfail64qam to set
	 */
	public void setPmmacharqulfail64qam(String pmmacharqulfail64qam) {
		this.pmmacharqulfail64qam = pmmacharqulfail64qam;
	}
	/**
	 * @return the pmmacharqulfailqpsk
	 */
	public String getPmmacharqulfailqpsk() {
		return pmmacharqulfailqpsk;
	}
	/**
	 * @param pmmacharqulfailqpsk the pmmacharqulfailqpsk to set
	 */
	public void setPmmacharqulfailqpsk(String pmmacharqulfailqpsk) {
		this.pmmacharqulfailqpsk = pmmacharqulfailqpsk;
	}
	/**
	 * @return the pmmacharqulnack
	 */
	public String getPmmacharqulnack() {
		return pmmacharqulnack;
	}
	/**
	 * @param pmmacharqulnack the pmmacharqulnack to set
	 */
	public void setPmmacharqulnack(String pmmacharqulnack) {
		this.pmmacharqulnack = pmmacharqulnack;
	}
	/**
	 * @return the pmmacharqulsucc16qam
	 */
	public String getPmmacharqulsucc16qam() {
		return pmmacharqulsucc16qam;
	}
	/**
	 * @param pmmacharqulsucc16qam the pmmacharqulsucc16qam to set
	 */
	public void setPmmacharqulsucc16qam(String pmmacharqulsucc16qam) {
		this.pmmacharqulsucc16qam = pmmacharqulsucc16qam;
	}
	/**
	 * @return the pmmacharqulsucc64qam
	 */
	public String getPmmacharqulsucc64qam() {
		return pmmacharqulsucc64qam;
	}
	/**
	 * @param pmmacharqulsucc64qam the pmmacharqulsucc64qam to set
	 */
	public void setPmmacharqulsucc64qam(String pmmacharqulsucc64qam) {
		this.pmmacharqulsucc64qam = pmmacharqulsucc64qam;
	}
	/**
	 * @return the pmmacharqulsuccqpsk
	 */
	public String getPmmacharqulsuccqpsk() {
		return pmmacharqulsuccqpsk;
	}
	/**
	 * @param pmmacharqulsuccqpsk the pmmacharqulsuccqpsk to set
	 */
	public void setPmmacharqulsuccqpsk(String pmmacharqulsuccqpsk) {
		this.pmmacharqulsuccqpsk = pmmacharqulsuccqpsk;
	}
	/**
	 * @return the pmmaclattimeqcidldrxnosyncsamp
	 */
	public String getPmmaclattimeqcidldrxnosyncsamp() {
		return pmmaclattimeqcidldrxnosyncsamp;
	}
	/**
	 * @param pmmaclattimeqcidldrxnosyncsamp the pmmaclattimeqcidldrxnosyncsamp to set
	 */
	public void setPmmaclattimeqcidldrxnosyncsamp(
			String pmmaclattimeqcidldrxnosyncsamp) {
		this.pmmaclattimeqcidldrxnosyncsamp = pmmaclattimeqcidldrxnosyncsamp;
	}
	/**
	 * @return the pmmaclattimeqcidldrxnosyncsum
	 */
	public String getPmmaclattimeqcidldrxnosyncsum() {
		return pmmaclattimeqcidldrxnosyncsum;
	}
	/**
	 * @param pmmaclattimeqcidldrxnosyncsum the pmmaclattimeqcidldrxnosyncsum to set
	 */
	public void setPmmaclattimeqcidldrxnosyncsum(
			String pmmaclattimeqcidldrxnosyncsum) {
		this.pmmaclattimeqcidldrxnosyncsum = pmmaclattimeqcidldrxnosyncsum;
	}
	/**
	 * @return the pmmaclattimeqcidldrxsyncsamp
	 */
	public String getPmmaclattimeqcidldrxsyncsamp() {
		return pmmaclattimeqcidldrxsyncsamp;
	}
	/**
	 * @param pmmaclattimeqcidldrxsyncsamp the pmmaclattimeqcidldrxsyncsamp to set
	 */
	public void setPmmaclattimeqcidldrxsyncsamp(String pmmaclattimeqcidldrxsyncsamp) {
		this.pmmaclattimeqcidldrxsyncsamp = pmmaclattimeqcidldrxsyncsamp;
	}
	/**
	 * @return the pmmaclattimeqcidldrxsyncsum
	 */
	public String getPmmaclattimeqcidldrxsyncsum() {
		return pmmaclattimeqcidldrxsyncsum;
	}
	/**
	 * @param pmmaclattimeqcidldrxsyncsum the pmmaclattimeqcidldrxsyncsum to set
	 */
	public void setPmmaclattimeqcidldrxsyncsum(String pmmaclattimeqcidldrxsyncsum) {
		this.pmmaclattimeqcidldrxsyncsum = pmmaclattimeqcidldrxsyncsum;
	}
	/**
	 * @return the pmmaclattimeqcidlnodrxsyncsamp
	 */
	public String getPmmaclattimeqcidlnodrxsyncsamp() {
		return pmmaclattimeqcidlnodrxsyncsamp;
	}
	/**
	 * @param pmmaclattimeqcidlnodrxsyncsamp the pmmaclattimeqcidlnodrxsyncsamp to set
	 */
	public void setPmmaclattimeqcidlnodrxsyncsamp(
			String pmmaclattimeqcidlnodrxsyncsamp) {
		this.pmmaclattimeqcidlnodrxsyncsamp = pmmaclattimeqcidlnodrxsyncsamp;
	}
	/**
	 * @return the pmmaclattimeqcidlnodrxsyncsum
	 */
	public String getPmmaclattimeqcidlnodrxsyncsum() {
		return pmmaclattimeqcidlnodrxsyncsum;
	}
	/**
	 * @param pmmaclattimeqcidlnodrxsyncsum the pmmaclattimeqcidlnodrxsyncsum to set
	 */
	public void setPmmaclattimeqcidlnodrxsyncsum(
			String pmmaclattimeqcidlnodrxsyncsum) {
		this.pmmaclattimeqcidlnodrxsyncsum = pmmaclattimeqcidlnodrxsyncsum;
	}
	/**
	 * @return the pmmaclattimeqcidlsamp
	 */
	public String getPmmaclattimeqcidlsamp() {
		return pmmaclattimeqcidlsamp;
	}
	/**
	 * @param pmmaclattimeqcidlsamp the pmmaclattimeqcidlsamp to set
	 */
	public void setPmmaclattimeqcidlsamp(String pmmaclattimeqcidlsamp) {
		this.pmmaclattimeqcidlsamp = pmmaclattimeqcidlsamp;
	}
	/**
	 * @return the pmmaclattimeqcidlsum
	 */
	public String getPmmaclattimeqcidlsum() {
		return pmmaclattimeqcidlsum;
	}
	/**
	 * @param pmmaclattimeqcidlsum the pmmaclattimeqcidlsum to set
	 */
	public void setPmmaclattimeqcidlsum(String pmmaclattimeqcidlsum) {
		this.pmmaclattimeqcidlsum = pmmaclattimeqcidlsum;
	}
	/**
	 * @return the pmmacuethptimedl
	 */
	public String getPmmacuethptimedl() {
		return pmmacuethptimedl;
	}
	/**
	 * @param pmmacuethptimedl the pmmacuethptimedl to set
	 */
	public void setPmmacuethptimedl(String pmmacuethptimedl) {
		this.pmmacuethptimedl = pmmacuethptimedl;
	}
	/**
	 * @return the pmmacuethptimeul
	 */
	public String getPmmacuethptimeul() {
		return pmmacuethptimeul;
	}
	/**
	 * @param pmmacuethptimeul the pmmacuethptimeul to set
	 */
	public void setPmmacuethptimeul(String pmmacuethptimeul) {
		this.pmmacuethptimeul = pmmacuethptimeul;
	}
	/**
	 * @return the pmmacuethpvoldl
	 */
	public String getPmmacuethpvoldl() {
		return pmmacuethpvoldl;
	}
	/**
	 * @param pmmacuethpvoldl the pmmacuethpvoldl to set
	 */
	public void setPmmacuethpvoldl(String pmmacuethpvoldl) {
		this.pmmacuethpvoldl = pmmacuethpvoldl;
	}
	/**
	 * @return the pmmacuethpvolul
	 */
	public String getPmmacuethpvolul() {
		return pmmacuethpvolul;
	}
	/**
	 * @param pmmacuethpvolul the pmmacuethpvolul to set
	 */
	public void setPmmacuethpvolul(String pmmacuethpvolul) {
		this.pmmacuethpvolul = pmmacuethpvolul;
	}
	/**
	 * @return the pmmacvoldl
	 */
	public String getPmmacvoldl() {
		return pmmacvoldl;
	}
	/**
	 * @param pmmacvoldl the pmmacvoldl to set
	 */
	public void setPmmacvoldl(String pmmacvoldl) {
		this.pmmacvoldl = pmmacvoldl;
	}
	/**
	 * @return the pmmacvolul
	 */
	public String getPmmacvolul() {
		return pmmacvolul;
	}
	/**
	 * @param pmmacvolul the pmmacvolul to set
	 */
	public void setPmmacvolul(String pmmacvolul) {
		this.pmmacvolul = pmmacvolul;
	}
	/**
	 * @return the pmmeasgapfaillicinterfotdoa
	 */
	public String getPmmeasgapfaillicinterfotdoa() {
		return pmmeasgapfaillicinterfotdoa;
	}
	/**
	 * @param pmmeasgapfaillicinterfotdoa the pmmeasgapfaillicinterfotdoa to set
	 */
	public void setPmmeasgapfaillicinterfotdoa(String pmmeasgapfaillicinterfotdoa) {
		this.pmmeasgapfaillicinterfotdoa = pmmeasgapfaillicinterfotdoa;
	}
	/**
	 * @return the pmmeasmissingneighrel
	 */
	public String getPmmeasmissingneighrel() {
		return pmmeasmissingneighrel;
	}
	/**
	 * @param pmmeasmissingneighrel the pmmeasmissingneighrel to set
	 */
	public void setPmmeasmissingneighrel(String pmmeasmissingneighrel) {
		this.pmmeasmissingneighrel = pmmeasmissingneighrel;
	}
	/**
	 * @return the pmmeasrep
	 */
	public String getPmmeasrep() {
		return pmmeasrep;
	}
	/**
	 * @param pmmeasrep the pmmeasrep to set
	 */
	public void setPmmeasrep(String pmmeasrep) {
		this.pmmeasrep = pmmeasrep;
	}
	/**
	 * @return the pmmeasrepdiscdlcomp
	 */
	public String getPmmeasrepdiscdlcomp() {
		return pmmeasrepdiscdlcomp;
	}
	/**
	 * @param pmmeasrepdiscdlcomp the pmmeasrepdiscdlcomp to set
	 */
	public void setPmmeasrepdiscdlcomp(String pmmeasrepdiscdlcomp) {
		this.pmmeasrepdiscdlcomp = pmmeasrepdiscdlcomp;
	}
	/**
	 * @return the pmmeasrepdlcomp
	 */
	public String getPmmeasrepdlcomp() {
		return pmmeasrepdlcomp;
	}
	/**
	 * @param pmmeasrepdlcomp the pmmeasrepdlcomp to set
	 */
	public void setPmmeasrepdlcomp(String pmmeasrepdlcomp) {
		this.pmmeasrepdlcomp = pmmeasrepdlcomp;
	}
	/**
	 * @return the pmmimosleepopptime
	 */
	public String getPmmimosleepopptime() {
		return pmmimosleepopptime;
	}
	/**
	 * @param pmmimosleepopptime the pmmimosleepopptime to set
	 */
	public void setPmmimosleepopptime(String pmmimosleepopptime) {
		this.pmmimosleepopptime = pmmimosleepopptime;
	}
	/**
	 * @return the pmmimosleeptime
	 */
	public String getPmmimosleeptime() {
		return pmmimosleeptime;
	}
	/**
	 * @param pmmimosleeptime the pmmimosleeptime to set
	 */
	public void setPmmimosleeptime(String pmmimosleeptime) {
		this.pmmimosleeptime = pmmimosleeptime;
	}
	/**
	 * @return the pmnastransferattabortdlsrb2
	 */
	public String getPmnastransferattabortdlsrb2() {
		return pmnastransferattabortdlsrb2;
	}
	/**
	 * @param pmnastransferattabortdlsrb2 the pmnastransferattabortdlsrb2 to set
	 */
	public void setPmnastransferattabortdlsrb2(String pmnastransferattabortdlsrb2) {
		this.pmnastransferattabortdlsrb2 = pmnastransferattabortdlsrb2;
	}
	/**
	 * @return the pmnastransferattdlsrb2
	 */
	public String getPmnastransferattdlsrb2() {
		return pmnastransferattdlsrb2;
	}
	/**
	 * @param pmnastransferattdlsrb2 the pmnastransferattdlsrb2 to set
	 */
	public void setPmnastransferattdlsrb2(String pmnastransferattdlsrb2) {
		this.pmnastransferattdlsrb2 = pmnastransferattdlsrb2;
	}
	/**
	 * @return the pmnastransfersuccdlsrb2
	 */
	public String getPmnastransfersuccdlsrb2() {
		return pmnastransfersuccdlsrb2;
	}
	/**
	 * @param pmnastransfersuccdlsrb2 the pmnastransfersuccdlsrb2 to set
	 */
	public void setPmnastransfersuccdlsrb2(String pmnastransfersuccdlsrb2) {
		this.pmnastransfersuccdlsrb2 = pmnastransfersuccdlsrb2;
	}
	/**
	 * @return the pmoocnewdataulgrants
	 */
	public String getPmoocnewdataulgrants() {
		return pmoocnewdataulgrants;
	}
	/**
	 * @param pmoocnewdataulgrants the pmoocnewdataulgrants to set
	 */
	public void setPmoocnewdataulgrants(String pmoocnewdataulgrants) {
		this.pmoocnewdataulgrants = pmoocnewdataulgrants;
	}
	/**
	 * @return the pmoocstateentries
	 */
	public String getPmoocstateentries() {
		return pmoocstateentries;
	}
	/**
	 * @param pmoocstateentries the pmoocstateentries to set
	 */
	public void setPmoocstateentries(String pmoocstateentries) {
		this.pmoocstateentries = pmoocstateentries;
	}
	/**
	 * @return the pmoocstateexits
	 */
	public String getPmoocstateexits() {
		return pmoocstateexits;
	}
	/**
	 * @param pmoocstateexits the pmoocstateexits to set
	 */
	public void setPmoocstateexits(String pmoocstateexits) {
		this.pmoocstateexits = pmoocstateexits;
	}
	/**
	 * @return the pmoocstateexitsuerel
	 */
	public String getPmoocstateexitsuerel() {
		return pmoocstateexitsuerel;
	}
	/**
	 * @param pmoocstateexitsuerel the pmoocstateexitsuerel to set
	 */
	public void setPmoocstateexitsuerel(String pmoocstateexitsuerel) {
		this.pmoocstateexitsuerel = pmoocstateexitsuerel;
	}
	/**
	 * @return the pmoocueslevsum
	 */
	public String getPmoocueslevsum() {
		return pmoocueslevsum;
	}
	/**
	 * @param pmoocueslevsum the pmoocueslevsum to set
	 */
	public void setPmoocueslevsum(String pmoocueslevsum) {
		this.pmoocueslevsum = pmoocueslevsum;
	}
	/**
	 * @return the pmoutofsynctimepft
	 */
	public String getPmoutofsynctimepft() {
		return pmoutofsynctimepft;
	}
	/**
	 * @param pmoutofsynctimepft the pmoutofsynctimepft to set
	 */
	public void setPmoutofsynctimepft(String pmoutofsynctimepft) {
		this.pmoutofsynctimepft = pmoutofsynctimepft;
	}
	/**
	 * @return the pmpagdiscarded
	 */
	public String getPmpagdiscarded() {
		return pmpagdiscarded;
	}
	/**
	 * @param pmpagdiscarded the pmpagdiscarded to set
	 */
	public void setPmpagdiscarded(String pmpagdiscarded) {
		this.pmpagdiscarded = pmpagdiscarded;
	}
	/**
	 * @return the pmpagreceived
	 */
	public String getPmpagreceived() {
		return pmpagreceived;
	}
	/**
	 * @param pmpagreceived the pmpagreceived to set
	 */
	public void setPmpagreceived(String pmpagreceived) {
		this.pmpagreceived = pmpagreceived;
	}
	/**
	 * @return the pmpdcchcceactivity
	 */
	public String getPmpdcchcceactivity() {
		return pmpdcchcceactivity;
	}
	/**
	 * @param pmpdcchcceactivity the pmpdcchcceactivity to set
	 */
	public void setPmpdcchcceactivity(String pmpdcchcceactivity) {
		this.pmpdcchcceactivity = pmpdcchcceactivity;
	}
	/**
	 * @return the pmpdcchmaxcceavail
	 */
	public String getPmpdcchmaxcceavail() {
		return pmpdcchmaxcceavail;
	}
	/**
	 * @param pmpdcchmaxcceavail the pmpdcchmaxcceavail to set
	 */
	public void setPmpdcchmaxcceavail(String pmpdcchmaxcceavail) {
		this.pmpdcchmaxcceavail = pmpdcchmaxcceavail;
	}
	/**
	 * @return the pmpdcchresyncatt
	 */
	public String getPmpdcchresyncatt() {
		return pmpdcchresyncatt;
	}
	/**
	 * @param pmpdcchresyncatt the pmpdcchresyncatt to set
	 */
	public void setPmpdcchresyncatt(String pmpdcchresyncatt) {
		this.pmpdcchresyncatt = pmpdcchresyncatt;
	}
	/**
	 * @return the pmpdcchresyncfail
	 */
	public String getPmpdcchresyncfail() {
		return pmpdcchresyncfail;
	}
	/**
	 * @param pmpdcchresyncfail the pmpdcchresyncfail to set
	 */
	public void setPmpdcchresyncfail(String pmpdcchresyncfail) {
		this.pmpdcchresyncfail = pmpdcchresyncfail;
	}
	/**
	 * @return the pmpdcchresyncsucc
	 */
	public String getPmpdcchresyncsucc() {
		return pmpdcchresyncsucc;
	}
	/**
	 * @param pmpdcchresyncsucc the pmpdcchresyncsucc to set
	 */
	public void setPmpdcchresyncsucc(String pmpdcchresyncsucc) {
		this.pmpdcchresyncsucc = pmpdcchresyncsucc;
	}
	/**
	 * @return the pmpdcchtxaggressive
	 */
	public String getPmpdcchtxaggressive() {
		return pmpdcchtxaggressive;
	}
	/**
	 * @param pmpdcchtxaggressive the pmpdcchtxaggressive to set
	 */
	public void setPmpdcchtxaggressive(String pmpdcchtxaggressive) {
		this.pmpdcchtxaggressive = pmpdcchtxaggressive;
	}
	/**
	 * @return the pmpdcchtxconservative
	 */
	public String getPmpdcchtxconservative() {
		return pmpdcchtxconservative;
	}
	/**
	 * @param pmpdcchtxconservative the pmpdcchtxconservative to set
	 */
	public void setPmpdcchtxconservative(String pmpdcchtxconservative) {
		this.pmpdcchtxconservative = pmpdcchtxconservative;
	}
	/**
	 * @return the pmpdcpbitratedldrbmax
	 */
	public String getPmpdcpbitratedldrbmax() {
		return pmpdcpbitratedldrbmax;
	}
	/**
	 * @param pmpdcpbitratedldrbmax the pmpdcpbitratedldrbmax to set
	 */
	public void setPmpdcpbitratedldrbmax(String pmpdcpbitratedldrbmax) {
		this.pmpdcpbitratedldrbmax = pmpdcpbitratedldrbmax;
	}
	/**
	 * @return the pmpdcpbitratedldrbmin
	 */
	public String getPmpdcpbitratedldrbmin() {
		return pmpdcpbitratedldrbmin;
	}
	/**
	 * @param pmpdcpbitratedldrbmin the pmpdcpbitratedldrbmin to set
	 */
	public void setPmpdcpbitratedldrbmin(String pmpdcpbitratedldrbmin) {
		this.pmpdcpbitratedldrbmin = pmpdcpbitratedldrbmin;
	}
	/**
	 * @return the pmpdcpbitrateuldrbmax
	 */
	public String getPmpdcpbitrateuldrbmax() {
		return pmpdcpbitrateuldrbmax;
	}
	/**
	 * @param pmpdcpbitrateuldrbmax the pmpdcpbitrateuldrbmax to set
	 */
	public void setPmpdcpbitrateuldrbmax(String pmpdcpbitrateuldrbmax) {
		this.pmpdcpbitrateuldrbmax = pmpdcpbitrateuldrbmax;
	}
	/**
	 * @return the pmpdcpbitrateuldrbmin
	 */
	public String getPmpdcpbitrateuldrbmin() {
		return pmpdcpbitrateuldrbmin;
	}
	/**
	 * @param pmpdcpbitrateuldrbmin the pmpdcpbitrateuldrbmin to set
	 */
	public void setPmpdcpbitrateuldrbmin(String pmpdcpbitrateuldrbmin) {
		this.pmpdcpbitrateuldrbmin = pmpdcpbitrateuldrbmin;
	}
	/**
	 * @return the pmpdcpdelaytimedl
	 */
	public String getPmpdcpdelaytimedl() {
		return pmpdcpdelaytimedl;
	}
	/**
	 * @param pmpdcpdelaytimedl the pmpdcpdelaytimedl to set
	 */
	public void setPmpdcpdelaytimedl(String pmpdcpdelaytimedl) {
		this.pmpdcpdelaytimedl = pmpdcpdelaytimedl;
	}
	/**
	 * @return the pmPdcpLatPktTransDl
	 */
	public String getPmPdcpLatPktTransDl() {
		return pmPdcpLatPktTransDl;
	}
	/**
	 * @param pmpdcplatpkttransdl the pmpdcplatpkttransdl to set
	 */
	public void setPmPdcpLatPktTransDl(String pmPdcpLatPktTransDl) {
		this.pmPdcpLatPktTransDl = pmPdcpLatPktTransDl;
	}
	/**
	 * @return the pmpdcplatpkttransdldrxnosync
	 */
	public String getPmpdcplatpkttransdldrxnosync() {
		return pmpdcplatpkttransdldrxnosync;
	}
	/**
	 * @param pmpdcplatpkttransdldrxnosync the pmpdcplatpkttransdldrxnosync to set
	 */
	public void setPmpdcplatpkttransdldrxnosync(String pmpdcplatpkttransdldrxnosync) {
		this.pmpdcplatpkttransdldrxnosync = pmpdcplatpkttransdldrxnosync;
	}
	/**
	 * @return the pmpdcplatpkttransdldrxsync
	 */
	public String getPmpdcplatpkttransdldrxsync() {
		return pmpdcplatpkttransdldrxsync;
	}
	/**
	 * @param pmpdcplatpkttransdldrxsync the pmpdcplatpkttransdldrxsync to set
	 */
	public void setPmpdcplatpkttransdldrxsync(String pmpdcplatpkttransdldrxsync) {
		this.pmpdcplatpkttransdldrxsync = pmpdcplatpkttransdldrxsync;
	}
	/**
	 * @return the pmpdcplatpkttransdlnodrxsync
	 */
	public String getPmpdcplatpkttransdlnodrxsync() {
		return pmpdcplatpkttransdlnodrxsync;
	}
	/**
	 * @param pmpdcplatpkttransdlnodrxsync the pmpdcplatpkttransdlnodrxsync to set
	 */
	public void setPmpdcplatpkttransdlnodrxsync(String pmpdcplatpkttransdlnodrxsync) {
		this.pmpdcplatpkttransdlnodrxsync = pmpdcplatpkttransdlnodrxsync;
	}
	/**
	 * @return the pmPdcpLatTimeDl
	 */
	public String getPmPdcpLatTimeDl() {
		return pmPdcpLatTimeDl;
	}
	/**
	 * @param pmpdcplattimedl the pmpdcplattimedl to set
	 */
	public void setPmPdcpLatTimeDl(String pmPdcpLatTimeDl) {
		this.pmPdcpLatTimeDl = pmPdcpLatTimeDl;
	}
	/**
	 * @return the pmpdcplattimedldrxnosync
	 */
	public String getPmpdcplattimedldrxnosync() {
		return pmpdcplattimedldrxnosync;
	}
	/**
	 * @param pmpdcplattimedldrxnosync the pmpdcplattimedldrxnosync to set
	 */
	public void setPmpdcplattimedldrxnosync(String pmpdcplattimedldrxnosync) {
		this.pmpdcplattimedldrxnosync = pmpdcplattimedldrxnosync;
	}
	/**
	 * @return the pmpdcplattimedldrxsync
	 */
	public String getPmpdcplattimedldrxsync() {
		return pmpdcplattimedldrxsync;
	}
	/**
	 * @param pmpdcplattimedldrxsync the pmpdcplattimedldrxsync to set
	 */
	public void setPmpdcplattimedldrxsync(String pmpdcplattimedldrxsync) {
		this.pmpdcplattimedldrxsync = pmpdcplattimedldrxsync;
	}
	/**
	 * @return the pmpdcplattimedlnodrxsync
	 */
	public String getPmpdcplattimedlnodrxsync() {
		return pmpdcplattimedlnodrxsync;
	}
	/**
	 * @param pmpdcplattimedlnodrxsync the pmpdcplattimedlnodrxsync to set
	 */
	public void setPmpdcplattimedlnodrxsync(String pmpdcplattimedlnodrxsync) {
		this.pmpdcplattimedlnodrxsync = pmpdcplattimedlnodrxsync;
	}
	/**
	 * @return the pmpdcppktdiscdlaqm
	 */
	public String getPmpdcppktdiscdlaqm() {
		return pmpdcppktdiscdlaqm;
	}
	/**
	 * @param pmpdcppktdiscdlaqm the pmpdcppktdiscdlaqm to set
	 */
	public void setPmpdcppktdiscdlaqm(String pmpdcppktdiscdlaqm) {
		this.pmpdcppktdiscdlaqm = pmpdcppktdiscdlaqm;
	}
	/**
	 * @return the pmpdcppktdiscdlho
	 */
	public String getPmpdcppktdiscdlho() {
		return pmpdcppktdiscdlho;
	}
	/**
	 * @param pmpdcppktdiscdlho the pmpdcppktdiscdlho to set
	 */
	public void setPmpdcppktdiscdlho(String pmpdcppktdiscdlho) {
		this.pmpdcppktdiscdlho = pmpdcppktdiscdlho;
	}
	/**
	 * @return the pmpdcppktdiscdlpelr
	 */
	public String getPmpdcppktdiscdlpelr() {
		return pmpdcppktdiscdlpelr;
	}
	/**
	 * @param pmpdcppktdiscdlpelr the pmpdcppktdiscdlpelr to set
	 */
	public void setPmpdcppktdiscdlpelr(String pmpdcppktdiscdlpelr) {
		this.pmpdcppktdiscdlpelr = pmpdcppktdiscdlpelr;
	}
	/**
	 * @return the pmpdcppktdiscdlpelruu
	 */
	public String getPmpdcppktdiscdlpelruu() {
		return pmpdcppktdiscdlpelruu;
	}
	/**
	 * @param pmpdcppktdiscdlpelruu the pmpdcppktdiscdlpelruu to set
	 */
	public void setPmpdcppktdiscdlpelruu(String pmpdcppktdiscdlpelruu) {
		this.pmpdcppktdiscdlpelruu = pmpdcppktdiscdlpelruu;
	}
	/**
	 * @return the pmpdcppktfwddl
	 */
	public String getPmpdcppktfwddl() {
		return pmpdcppktfwddl;
	}
	/**
	 * @param pmpdcppktfwddl the pmpdcppktfwddl to set
	 */
	public void setPmpdcppktfwddl(String pmpdcppktfwddl) {
		this.pmpdcppktfwddl = pmpdcppktfwddl;
	}
	/**
	 * @return the pmPdcpPktLostUl
	 */
	public String getPmPdcpPktLostUl() {
		return pmPdcpPktLostUl;
	}
	/**
	 * @param pmpdcppktlostul the pmpdcppktlostul to set
	 */
	public void setPmPdcpPktLostUl(String pmPdcpPktLostUl) {
		this.pmPdcpPktLostUl = pmPdcpPktLostUl;
	}
	/**
	 * @return the pmpdcppktlostullimitations
	 */
	public String getPmpdcppktlostullimitations() {
		return pmpdcppktlostullimitations;
	}
	/**
	 * @param pmpdcppktlostullimitations the pmpdcppktlostullimitations to set
	 */
	public void setPmpdcppktlostullimitations(String pmpdcppktlostullimitations) {
		this.pmpdcppktlostullimitations = pmpdcppktlostullimitations;
	}
	/**
	 * @return the pmpdcppktpdbulokvoip
	 */
	public String getPmpdcppktpdbulokvoip() {
		return pmpdcppktpdbulokvoip;
	}
	/**
	 * @param pmpdcppktpdbulokvoip the pmpdcppktpdbulokvoip to set
	 */
	public void setPmpdcppktpdbulokvoip(String pmpdcppktpdbulokvoip) {
		this.pmpdcppktpdbulokvoip = pmpdcppktpdbulokvoip;
	}
	/**
	 * @return the pmpdcppktreceiveddl
	 */
	public String getPmpdcppktreceiveddl() {
		return pmpdcppktreceiveddl;
	}
	/**
	 * @param pmpdcppktreceiveddl the pmpdcppktreceiveddl to set
	 */
	public void setPmpdcppktreceiveddl(String pmpdcppktreceiveddl) {
		this.pmpdcppktreceiveddl = pmpdcppktreceiveddl;
	}
	/**
	 * @return the pmPdcpPktReceivedUl
	 */
	public String getPmPdcpPktReceivedUl() {
		return pmPdcpPktReceivedUl;
	}
	/**
	 * @param pmpdcppktreceivedul the pmpdcppktreceivedul to set
	 */
	public void setPmPdcpPktReceivedUl(String pmPdcpPktReceivedUl) {
		this.pmPdcpPktReceivedUl = pmPdcpPktReceivedUl;
	}
	/**
	 * @return the pmpdcppkttransdl
	 */
	public String getPmpdcppkttransdl() {
		return pmpdcppkttransdl;
	}
	/**
	 * @param pmpdcppkttransdl the pmpdcppkttransdl to set
	 */
	public void setPmpdcppkttransdl(String pmpdcppkttransdl) {
		this.pmpdcppkttransdl = pmpdcppkttransdl;
	}
	/**
	 * @return the pmPdcpVolDlDrb
	 */
	public String getPmPdcpVolDlDrb() {
		return pmPdcpVolDlDrb;
	}
	/**
	 * @param pmpdcpvoldldrb the pmpdcpvoldldrb to set
	 */
	public void setPmPdcpVolDlDrb(String pmPdcpVolDlDrb) {
		this.pmPdcpVolDlDrb = pmPdcpVolDlDrb;
	}
	/**
	 * @return the pmpdcpvoldldrbca
	 */
	public String getPmpdcpvoldldrbca() {
		return pmpdcpvoldldrbca;
	}
	/**
	 * @param pmpdcpvoldldrbca the pmpdcpvoldldrbca to set
	 */
	public void setPmpdcpvoldldrbca(String pmpdcpvoldldrbca) {
		this.pmpdcpvoldldrbca = pmpdcpvoldldrbca;
	}
	/**
	 * @return the pmPdcpVolDlDrbLastTTI
	 */
	public String getPmPdcpVolDlDrbLastTTI() {
		return pmPdcpVolDlDrbLastTTI;
	}
	/**
	 * @param pmpdcpvoldldrblasttti the pmpdcpvoldldrblasttti to set
	 */
	public void setPmPdcpVolDlDrbLastTTI(String pmPdcpVolDlDrbLastTTI) {
		this.pmPdcpVolDlDrbLastTTI = pmPdcpVolDlDrbLastTTI;
	}
	/**
	 * @return the pmpdcpvoldldrblastttica
	 */
	public String getPmpdcpvoldldrblastttica() {
		return pmpdcpvoldldrblastttica;
	}
	/**
	 * @param pmpdcpvoldldrblastttica the pmpdcpvoldldrblastttica to set
	 */
	public void setPmpdcpvoldldrblastttica(String pmpdcpvoldldrblastttica) {
		this.pmpdcpvoldldrblastttica = pmpdcpvoldldrblastttica;
	}
	/**
	 * @return the pmpdcpvoldldrbtrans
	 */
	public String getPmpdcpvoldldrbtrans() {
		return pmpdcpvoldldrbtrans;
	}
	/**
	 * @param pmpdcpvoldldrbtrans the pmpdcpvoldldrbtrans to set
	 */
	public void setPmpdcpvoldldrbtrans(String pmpdcpvoldldrbtrans) {
		this.pmpdcpvoldldrbtrans = pmpdcpvoldldrbtrans;
	}
	/**
	 * @return the pmpdcpvoldldrbtransplmn0
	 */
	public String getPmpdcpvoldldrbtransplmn0() {
		return pmpdcpvoldldrbtransplmn0;
	}
	/**
	 * @param pmpdcpvoldldrbtransplmn0 the pmpdcpvoldldrbtransplmn0 to set
	 */
	public void setPmpdcpvoldldrbtransplmn0(String pmpdcpvoldldrbtransplmn0) {
		this.pmpdcpvoldldrbtransplmn0 = pmpdcpvoldldrbtransplmn0;
	}
	/**
	 * @return the pmpdcpvoldldrbtransplmn1
	 */
	public String getPmpdcpvoldldrbtransplmn1() {
		return pmpdcpvoldldrbtransplmn1;
	}
	/**
	 * @param pmpdcpvoldldrbtransplmn1 the pmpdcpvoldldrbtransplmn1 to set
	 */
	public void setPmpdcpvoldldrbtransplmn1(String pmpdcpvoldldrbtransplmn1) {
		this.pmpdcpvoldldrbtransplmn1 = pmpdcpvoldldrbtransplmn1;
	}
	/**
	 * @return the pmpdcpvoldldrbtransplmn2
	 */
	public String getPmpdcpvoldldrbtransplmn2() {
		return pmpdcpvoldldrbtransplmn2;
	}
	/**
	 * @param pmpdcpvoldldrbtransplmn2 the pmpdcpvoldldrbtransplmn2 to set
	 */
	public void setPmpdcpvoldldrbtransplmn2(String pmpdcpvoldldrbtransplmn2) {
		this.pmpdcpvoldldrbtransplmn2 = pmpdcpvoldldrbtransplmn2;
	}
	/**
	 * @return the pmpdcpvoldldrbtransplmn3
	 */
	public String getPmpdcpvoldldrbtransplmn3() {
		return pmpdcpvoldldrbtransplmn3;
	}
	/**
	 * @param pmpdcpvoldldrbtransplmn3 the pmpdcpvoldldrbtransplmn3 to set
	 */
	public void setPmpdcpvoldldrbtransplmn3(String pmpdcpvoldldrbtransplmn3) {
		this.pmpdcpvoldldrbtransplmn3 = pmpdcpvoldldrbtransplmn3;
	}
	/**
	 * @return the pmpdcpvoldldrbtransplmn4
	 */
	public String getPmpdcpvoldldrbtransplmn4() {
		return pmpdcpvoldldrbtransplmn4;
	}
	/**
	 * @param pmpdcpvoldldrbtransplmn4 the pmpdcpvoldldrbtransplmn4 to set
	 */
	public void setPmpdcpvoldldrbtransplmn4(String pmpdcpvoldldrbtransplmn4) {
		this.pmpdcpvoldldrbtransplmn4 = pmpdcpvoldldrbtransplmn4;
	}
	/**
	 * @return the pmpdcpvoldldrbtransplmn5
	 */
	public String getPmpdcpvoldldrbtransplmn5() {
		return pmpdcpvoldldrbtransplmn5;
	}
	/**
	 * @param pmpdcpvoldldrbtransplmn5 the pmpdcpvoldldrbtransplmn5 to set
	 */
	public void setPmpdcpvoldldrbtransplmn5(String pmpdcpvoldldrbtransplmn5) {
		this.pmpdcpvoldldrbtransplmn5 = pmpdcpvoldldrbtransplmn5;
	}
	/**
	 * @return the pmpdcpvoldldrbtransplmn6
	 */
	public String getPmpdcpvoldldrbtransplmn6() {
		return pmpdcpvoldldrbtransplmn6;
	}
	/**
	 * @param pmpdcpvoldldrbtransplmn6 the pmpdcpvoldldrbtransplmn6 to set
	 */
	public void setPmpdcpvoldldrbtransplmn6(String pmpdcpvoldldrbtransplmn6) {
		this.pmpdcpvoldldrbtransplmn6 = pmpdcpvoldldrbtransplmn6;
	}
	/**
	 * @return the pmpdcpvoldldrbtransum
	 */
	public String getPmpdcpvoldldrbtransum() {
		return pmpdcpvoldldrbtransum;
	}
	/**
	 * @param pmpdcpvoldldrbtransum the pmpdcpvoldldrbtransum to set
	 */
	public void setPmpdcpvoldldrbtransum(String pmpdcpvoldldrbtransum) {
		this.pmpdcpvoldldrbtransum = pmpdcpvoldldrbtransum;
	}
	/**
	 * @return the pmpdcpvoldlsrb
	 */
	public String getPmpdcpvoldlsrb() {
		return pmpdcpvoldlsrb;
	}
	/**
	 * @param pmpdcpvoldlsrb the pmpdcpvoldlsrb to set
	 */
	public void setPmpdcpvoldlsrb(String pmpdcpvoldlsrb) {
		this.pmpdcpvoldlsrb = pmpdcpvoldlsrb;
	}
	/**
	 * @return the pmpdcpvoldlsrbtrans
	 */
	public String getPmpdcpvoldlsrbtrans() {
		return pmpdcpvoldlsrbtrans;
	}
	/**
	 * @param pmpdcpvoldlsrbtrans the pmpdcpvoldlsrbtrans to set
	 */
	public void setPmpdcpvoldlsrbtrans(String pmpdcpvoldlsrbtrans) {
		this.pmpdcpvoldlsrbtrans = pmpdcpvoldlsrbtrans;
	}
	/**
	 * @return the pmPdcpVolUlDrb
	 */
	public String getPmPdcpVolUlDrb() {
		return pmPdcpVolUlDrb;
	}
	/**
	 * @param pmpdcpvoluldrb the pmpdcpvoluldrb to set
	 */
	public void setPmPdcpVolUlDrb(String pmPdcpVolUlDrb) {
		this.pmPdcpVolUlDrb = pmPdcpVolUlDrb;
	}
	/**
	 * @return the pmpdcpvoluldrblasttti
	 */
	public String getPmpdcpvoluldrblasttti() {
		return pmpdcpvoluldrblasttti;
	}
	/**
	 * @param pmpdcpvoluldrblasttti the pmpdcpvoluldrblasttti to set
	 */
	public void setPmpdcpvoluldrblasttti(String pmpdcpvoluldrblasttti) {
		this.pmpdcpvoluldrblasttti = pmpdcpvoluldrblasttti;
	}
	/**
	 * @return the pmpdcpvoluldrbplmn0
	 */
	public String getPmpdcpvoluldrbplmn0() {
		return pmpdcpvoluldrbplmn0;
	}
	/**
	 * @param pmpdcpvoluldrbplmn0 the pmpdcpvoluldrbplmn0 to set
	 */
	public void setPmpdcpvoluldrbplmn0(String pmpdcpvoluldrbplmn0) {
		this.pmpdcpvoluldrbplmn0 = pmpdcpvoluldrbplmn0;
	}
	/**
	 * @return the pmpdcpvoluldrbplmn1
	 */
	public String getPmpdcpvoluldrbplmn1() {
		return pmpdcpvoluldrbplmn1;
	}
	/**
	 * @param pmpdcpvoluldrbplmn1 the pmpdcpvoluldrbplmn1 to set
	 */
	public void setPmpdcpvoluldrbplmn1(String pmpdcpvoluldrbplmn1) {
		this.pmpdcpvoluldrbplmn1 = pmpdcpvoluldrbplmn1;
	}
	/**
	 * @return the pmpdcpvoluldrbplmn2
	 */
	public String getPmpdcpvoluldrbplmn2() {
		return pmpdcpvoluldrbplmn2;
	}
	/**
	 * @param pmpdcpvoluldrbplmn2 the pmpdcpvoluldrbplmn2 to set
	 */
	public void setPmpdcpvoluldrbplmn2(String pmpdcpvoluldrbplmn2) {
		this.pmpdcpvoluldrbplmn2 = pmpdcpvoluldrbplmn2;
	}
	/**
	 * @return the pmpdcpvoluldrbplmn3
	 */
	public String getPmpdcpvoluldrbplmn3() {
		return pmpdcpvoluldrbplmn3;
	}
	/**
	 * @param pmpdcpvoluldrbplmn3 the pmpdcpvoluldrbplmn3 to set
	 */
	public void setPmpdcpvoluldrbplmn3(String pmpdcpvoluldrbplmn3) {
		this.pmpdcpvoluldrbplmn3 = pmpdcpvoluldrbplmn3;
	}
	/**
	 * @return the pmpdcpvoluldrbplmn4
	 */
	public String getPmpdcpvoluldrbplmn4() {
		return pmpdcpvoluldrbplmn4;
	}
	/**
	 * @param pmpdcpvoluldrbplmn4 the pmpdcpvoluldrbplmn4 to set
	 */
	public void setPmpdcpvoluldrbplmn4(String pmpdcpvoluldrbplmn4) {
		this.pmpdcpvoluldrbplmn4 = pmpdcpvoluldrbplmn4;
	}
	/**
	 * @return the pmpdcpvoluldrbplmn5
	 */
	public String getPmpdcpvoluldrbplmn5() {
		return pmpdcpvoluldrbplmn5;
	}
	/**
	 * @param pmpdcpvoluldrbplmn5 the pmpdcpvoluldrbplmn5 to set
	 */
	public void setPmpdcpvoluldrbplmn5(String pmpdcpvoluldrbplmn5) {
		this.pmpdcpvoluldrbplmn5 = pmpdcpvoluldrbplmn5;
	}
	/**
	 * @return the pmpdcpvoluldrbplmn6
	 */
	public String getPmpdcpvoluldrbplmn6() {
		return pmpdcpvoluldrbplmn6;
	}
	/**
	 * @param pmpdcpvoluldrbplmn6 the pmpdcpvoluldrbplmn6 to set
	 */
	public void setPmpdcpvoluldrbplmn6(String pmpdcpvoluldrbplmn6) {
		this.pmpdcpvoluldrbplmn6 = pmpdcpvoluldrbplmn6;
	}
	/**
	 * @return the pmpdcpvolulsrb
	 */
	public String getPmpdcpvolulsrb() {
		return pmpdcpvolulsrb;
	}
	/**
	 * @param pmpdcpvolulsrb the pmpdcpvolulsrb to set
	 */
	public void setPmpdcpvolulsrb(String pmpdcpvolulsrb) {
		this.pmpdcpvolulsrb = pmpdcpvolulsrb;
	}
	/**
	 * @return the pmpftestablishedsession
	 */
	public String getPmpftestablishedsession() {
		return pmpftestablishedsession;
	}
	/**
	 * @param pmpftestablishedsession the pmpftestablishedsession to set
	 */
	public void setPmpftestablishedsession(String pmpftestablishedsession) {
		this.pmpftestablishedsession = pmpftestablishedsession;
	}
	/**
	 * @return the pmprbavaildl
	 */
	public String getPmprbavaildl() {
		return pmprbavaildl;
	}
	/**
	 * @param pmprbavaildl the pmprbavaildl to set
	 */
	public void setPmprbavaildl(String pmprbavaildl) {
		this.pmprbavaildl = pmprbavaildl;
	}
	/**
	 * @return the pmprbavaildlmbms
	 */
	public String getPmprbavaildlmbms() {
		return pmprbavaildlmbms;
	}
	/**
	 * @param pmprbavaildlmbms the pmprbavaildlmbms to set
	 */
	public void setPmprbavaildlmbms(String pmprbavaildlmbms) {
		this.pmprbavaildlmbms = pmprbavaildlmbms;
	}
	/**
	 * @return the pmprbavailul
	 */
	public String getPmprbavailul() {
		return pmprbavailul;
	}
	/**
	 * @param pmprbavailul the pmprbavailul to set
	 */
	public void setPmprbavailul(String pmprbavailul) {
		this.pmprbavailul = pmprbavailul;
	}
	/**
	 * @return the pmprbuseddl
	 */
	public String getPmprbuseddl() {
		return pmprbuseddl;
	}
	/**
	 * @param pmprbuseddl the pmprbuseddl to set
	 */
	public void setPmprbuseddl(String pmprbuseddl) {
		this.pmprbuseddl = pmprbuseddl;
	}
	/**
	 * @return the pmprbuseddlailghighprio
	 */
	public String getPmprbuseddlailghighprio() {
		return pmprbuseddlailghighprio;
	}
	/**
	 * @param pmprbuseddlailghighprio the pmprbuseddlailghighprio to set
	 */
	public void setPmprbuseddlailghighprio(String pmprbuseddlailghighprio) {
		this.pmprbuseddlailghighprio = pmprbuseddlailghighprio;
	}
	/**
	 * @return the pmprbuseddlailgtot
	 */
	public String getPmprbuseddlailgtot() {
		return pmprbuseddlailgtot;
	}
	/**
	 * @param pmprbuseddlailgtot the pmprbuseddlailgtot to set
	 */
	public void setPmprbuseddlailgtot(String pmprbuseddlailgtot) {
		this.pmprbuseddlailgtot = pmprbuseddlailgtot;
	}
	/**
	 * @return the pmprbuseddlbcch
	 */
	public String getPmprbuseddlbcch() {
		return pmprbuseddlbcch;
	}
	/**
	 * @param pmprbuseddlbcch the pmprbuseddlbcch to set
	 */
	public void setPmprbuseddlbcch(String pmprbuseddlbcch) {
		this.pmprbuseddlbcch = pmprbuseddlbcch;
	}
	/**
	 * @return the pmprbuseddlccch
	 */
	public String getPmprbuseddlccch() {
		return pmprbuseddlccch;
	}
	/**
	 * @param pmprbuseddlccch the pmprbuseddlccch to set
	 */
	public void setPmprbuseddlccch(String pmprbuseddlccch) {
		this.pmprbuseddlccch = pmprbuseddlccch;
	}
	/**
	 * @return the pmprbuseddldtch
	 */
	public String getPmprbuseddldtch() {
		return pmprbuseddldtch;
	}
	/**
	 * @param pmprbuseddldtch the pmprbuseddldtch to set
	 */
	public void setPmprbuseddldtch(String pmprbuseddldtch) {
		this.pmprbuseddldtch = pmprbuseddldtch;
	}
	/**
	 * @return the pmprbuseddlfirsttrans
	 */
	public String getPmprbuseddlfirsttrans() {
		return pmprbuseddlfirsttrans;
	}
	/**
	 * @param pmprbuseddlfirsttrans the pmprbuseddlfirsttrans to set
	 */
	public void setPmprbuseddlfirsttrans(String pmprbuseddlfirsttrans) {
		this.pmprbuseddlfirsttrans = pmprbuseddlfirsttrans;
	}
	/**
	 * @return the pmprbuseddlmax
	 */
	public String getPmprbuseddlmax() {
		return pmprbuseddlmax;
	}
	/**
	 * @param pmprbuseddlmax the pmprbuseddlmax to set
	 */
	public void setPmprbuseddlmax(String pmprbuseddlmax) {
		this.pmprbuseddlmax = pmprbuseddlmax;
	}
	/**
	 * @return the pmprbuseddlmbms
	 */
	public String getPmprbuseddlmbms() {
		return pmprbuseddlmbms;
	}
	/**
	 * @param pmprbuseddlmbms the pmprbuseddlmbms to set
	 */
	public void setPmprbuseddlmbms(String pmprbuseddlmbms) {
		this.pmprbuseddlmbms = pmprbuseddlmbms;
	}
	/**
	 * @return the pmprbuseddlpcch
	 */
	public String getPmprbuseddlpcch() {
		return pmprbuseddlpcch;
	}
	/**
	 * @param pmprbuseddlpcch the pmprbuseddlpcch to set
	 */
	public void setPmprbuseddlpcch(String pmprbuseddlpcch) {
		this.pmprbuseddlpcch = pmprbuseddlpcch;
	}
	/**
	 * @return the pmprbuseddlretrans
	 */
	public String getPmprbuseddlretrans() {
		return pmprbuseddlretrans;
	}
	/**
	 * @param pmprbuseddlretrans the pmprbuseddlretrans to set
	 */
	public void setPmprbuseddlretrans(String pmprbuseddlretrans) {
		this.pmprbuseddlretrans = pmprbuseddlretrans;
	}
	/**
	 * @return the pmprbuseddlsamp
	 */
	public String getPmprbuseddlsamp() {
		return pmprbuseddlsamp;
	}
	/**
	 * @param pmprbuseddlsamp the pmprbuseddlsamp to set
	 */
	public void setPmprbuseddlsamp(String pmprbuseddlsamp) {
		this.pmprbuseddlsamp = pmprbuseddlsamp;
	}
	/**
	 * @return the pmprbuseddlsrb
	 */
	public String getPmprbuseddlsrb() {
		return pmprbuseddlsrb;
	}
	/**
	 * @param pmprbuseddlsrb the pmprbuseddlsrb to set
	 */
	public void setPmprbuseddlsrb(String pmprbuseddlsrb) {
		this.pmprbuseddlsrb = pmprbuseddlsrb;
	}
	/**
	 * @return the pmprbuseddlsrbfirsttrans
	 */
	public String getPmprbuseddlsrbfirsttrans() {
		return pmprbuseddlsrbfirsttrans;
	}
	/**
	 * @param pmprbuseddlsrbfirsttrans the pmprbuseddlsrbfirsttrans to set
	 */
	public void setPmprbuseddlsrbfirsttrans(String pmprbuseddlsrbfirsttrans) {
		this.pmprbuseddlsrbfirsttrans = pmprbuseddlsrbfirsttrans;
	}
	/**
	 * @return the pmprbuseddlsum
	 */
	public String getPmprbuseddlsum() {
		return pmprbuseddlsum;
	}
	/**
	 * @param pmprbuseddlsum the pmprbuseddlsum to set
	 */
	public void setPmprbuseddlsum(String pmprbuseddlsum) {
		this.pmprbuseddlsum = pmprbuseddlsum;
	}
	/**
	 * @return the pmprbusedul
	 */
	public String getPmprbusedul() {
		return pmprbusedul;
	}
	/**
	 * @param pmprbusedul the pmprbusedul to set
	 */
	public void setPmprbusedul(String pmprbusedul) {
		this.pmprbusedul = pmprbusedul;
	}
	/**
	 * @return the pmprbusedulailgtot
	 */
	public String getPmprbusedulailgtot() {
		return pmprbusedulailgtot;
	}
	/**
	 * @param pmprbusedulailgtot the pmprbusedulailgtot to set
	 */
	public void setPmprbusedulailgtot(String pmprbusedulailgtot) {
		this.pmprbusedulailgtot = pmprbusedulailgtot;
	}
	/**
	 * @return the pmprbusedulccch
	 */
	public String getPmprbusedulccch() {
		return pmprbusedulccch;
	}
	/**
	 * @param pmprbusedulccch the pmprbusedulccch to set
	 */
	public void setPmprbusedulccch(String pmprbusedulccch) {
		this.pmprbusedulccch = pmprbusedulccch;
	}
	/**
	 * @return the pmprbuseduldtch
	 */
	public String getPmprbuseduldtch() {
		return pmprbuseduldtch;
	}
	/**
	 * @param pmprbuseduldtch the pmprbuseduldtch to set
	 */
	public void setPmprbuseduldtch(String pmprbuseduldtch) {
		this.pmprbuseduldtch = pmprbuseduldtch;
	}
	/**
	 * @return the pmprbusedulmax
	 */
	public String getPmprbusedulmax() {
		return pmprbusedulmax;
	}
	/**
	 * @param pmprbusedulmax the pmprbusedulmax to set
	 */
	public void setPmprbusedulmax(String pmprbusedulmax) {
		this.pmprbusedulmax = pmprbusedulmax;
	}
	/**
	 * @return the pmprbusedulsamp
	 */
	public String getPmprbusedulsamp() {
		return pmprbusedulsamp;
	}
	/**
	 * @param pmprbusedulsamp the pmprbusedulsamp to set
	 */
	public void setPmprbusedulsamp(String pmprbusedulsamp) {
		this.pmprbusedulsamp = pmprbusedulsamp;
	}
	/**
	 * @return the pmprbusedulsrb
	 */
	public String getPmprbusedulsrb() {
		return pmprbusedulsrb;
	}
	/**
	 * @param pmprbusedulsrb the pmprbusedulsrb to set
	 */
	public void setPmprbusedulsrb(String pmprbusedulsrb) {
		this.pmprbusedulsrb = pmprbusedulsrb;
	}
	/**
	 * @return the pmprbusedulsum
	 */
	public String getPmprbusedulsum() {
		return pmprbusedulsum;
	}
	/**
	 * @param pmprbusedulsum the pmprbusedulsum to set
	 */
	public void setPmprbusedulsum(String pmprbusedulsum) {
		this.pmprbusedulsum = pmprbusedulsum;
	}
	/**
	 * @return the pmpucchcqireslongutilcell
	 */
	public String getPmpucchcqireslongutilcell() {
		return pmpucchcqireslongutilcell;
	}
	/**
	 * @param pmpucchcqireslongutilcell the pmpucchcqireslongutilcell to set
	 */
	public void setPmpucchcqireslongutilcell(String pmpucchcqireslongutilcell) {
		this.pmpucchcqireslongutilcell = pmpucchcqireslongutilcell;
	}
	/**
	 * @return the pmpucchcqiresmediumutilcell
	 */
	public String getPmpucchcqiresmediumutilcell() {
		return pmpucchcqiresmediumutilcell;
	}
	/**
	 * @param pmpucchcqiresmediumutilcell the pmpucchcqiresmediumutilcell to set
	 */
	public void setPmpucchcqiresmediumutilcell(String pmpucchcqiresmediumutilcell) {
		this.pmpucchcqiresmediumutilcell = pmpucchcqiresmediumutilcell;
	}
	/**
	 * @return the pmpucchcqiresshortutilcell
	 */
	public String getPmpucchcqiresshortutilcell() {
		return pmpucchcqiresshortutilcell;
	}
	/**
	 * @param pmpucchcqiresshortutilcell the pmpucchcqiresshortutilcell to set
	 */
	public void setPmpucchcqiresshortutilcell(String pmpucchcqiresshortutilcell) {
		this.pmpucchcqiresshortutilcell = pmpucchcqiresshortutilcell;
	}
	/**
	 * @return the pmpucchfailsr
	 */
	public String getPmpucchfailsr() {
		return pmpucchfailsr;
	}
	/**
	 * @param pmpucchfailsr the pmpucchfailsr to set
	 */
	public void setPmpucchfailsr(String pmpucchfailsr) {
		this.pmpucchfailsr = pmpucchfailsr;
	}
	/**
	 * @return the pmpucchsr
	 */
	public String getPmpucchsr() {
		return pmpucchsr;
	}
	/**
	 * @param pmpucchsr the pmpucchsr to set
	 */
	public void setPmpucchsr(String pmpucchsr) {
		this.pmpucchsr = pmpucchsr;
	}
	/**
	 * @return the pmpucchsrcqiresallocatt
	 */
	public String getPmpucchsrcqiresallocatt() {
		return pmpucchsrcqiresallocatt;
	}
	/**
	 * @param pmpucchsrcqiresallocatt the pmpucchsrcqiresallocatt to set
	 */
	public void setPmpucchsrcqiresallocatt(String pmpucchsrcqiresallocatt) {
		this.pmpucchsrcqiresallocatt = pmpucchsrcqiresallocatt;
	}
	/**
	 * @return the pmpucchsrcqirescongcqi
	 */
	public String getPmpucchsrcqirescongcqi() {
		return pmpucchsrcqirescongcqi;
	}
	/**
	 * @param pmpucchsrcqirescongcqi the pmpucchsrcqirescongcqi to set
	 */
	public void setPmpucchsrcqirescongcqi(String pmpucchsrcqirescongcqi) {
		this.pmpucchsrcqirescongcqi = pmpucchsrcqirescongcqi;
	}
	/**
	 * @return the pmpucchsrcqirescongsr
	 */
	public String getPmpucchsrcqirescongsr() {
		return pmpucchsrcqirescongsr;
	}
	/**
	 * @param pmpucchsrcqirescongsr the pmpucchsrcqirescongsr to set
	 */
	public void setPmpucchsrcqirescongsr(String pmpucchsrcqirescongsr) {
		this.pmpucchsrcqirescongsr = pmpucchsrcqirescongsr;
	}
	/**
	 * @return the pmpucchsrmax
	 */
	public String getPmpucchsrmax() {
		return pmpucchsrmax;
	}
	/**
	 * @param pmpucchsrmax the pmpucchsrmax to set
	 */
	public void setPmpucchsrmax(String pmpucchsrmax) {
		this.pmpucchsrmax = pmpucchsrmax;
	}
	/**
	 * @return the pmpucchsrreslongutilcell
	 */
	public String getPmpucchsrreslongutilcell() {
		return pmpucchsrreslongutilcell;
	}
	/**
	 * @param pmpucchsrreslongutilcell the pmpucchsrreslongutilcell to set
	 */
	public void setPmpucchsrreslongutilcell(String pmpucchsrreslongutilcell) {
		this.pmpucchsrreslongutilcell = pmpucchsrreslongutilcell;
	}
	/**
	 * @return the pmpucchsrresmediumutilcell
	 */
	public String getPmpucchsrresmediumutilcell() {
		return pmpucchsrresmediumutilcell;
	}
	/**
	 * @param pmpucchsrresmediumutilcell the pmpucchsrresmediumutilcell to set
	 */
	public void setPmpucchsrresmediumutilcell(String pmpucchsrresmediumutilcell) {
		this.pmpucchsrresmediumutilcell = pmpucchsrresmediumutilcell;
	}
	/**
	 * @return the pmpucchsrresshortutilcell
	 */
	public String getPmpucchsrresshortutilcell() {
		return pmpucchsrresshortutilcell;
	}
	/**
	 * @param pmpucchsrresshortutilcell the pmpucchsrresshortutilcell to set
	 */
	public void setPmpucchsrresshortutilcell(String pmpucchsrresshortutilcell) {
		this.pmpucchsrresshortutilcell = pmpucchsrresshortutilcell;
	}
	/**
	 * @return the pmpwrboostattlowcovue
	 */
	public String getPmpwrboostattlowcovue() {
		return pmpwrboostattlowcovue;
	}
	/**
	 * @param pmpwrboostattlowcovue the pmpwrboostattlowcovue to set
	 */
	public void setPmpwrboostattlowcovue(String pmpwrboostattlowcovue) {
		this.pmpwrboostattlowcovue = pmpwrboostattlowcovue;
	}
	/**
	 * @return the pmpwrboostsucclowcovue
	 */
	public String getPmpwrboostsucclowcovue() {
		return pmpwrboostsucclowcovue;
	}
	/**
	 * @param pmpwrboostsucclowcovue the pmpwrboostsucclowcovue to set
	 */
	public void setPmpwrboostsucclowcovue(String pmpwrboostsucclowcovue) {
		this.pmpwrboostsucclowcovue = pmpwrboostsucclowcovue;
	}
	/**
	 * @return the pmraaccharqfailaftercontres
	 */
	public String getPmraaccharqfailaftercontres() {
		return pmraaccharqfailaftercontres;
	}
	/**
	 * @param pmraaccharqfailaftercontres the pmraaccharqfailaftercontres to set
	 */
	public void setPmraaccharqfailaftercontres(String pmraaccharqfailaftercontres) {
		this.pmraaccharqfailaftercontres = pmraaccharqfailaftercontres;
	}
	/**
	 * @return the pmraaccharqfailwithincontres
	 */
	public String getPmraaccharqfailwithincontres() {
		return pmraaccharqfailwithincontres;
	}
	/**
	 * @param pmraaccharqfailwithincontres the pmraaccharqfailwithincontres to set
	 */
	public void setPmraaccharqfailwithincontres(String pmraaccharqfailwithincontres) {
		this.pmraaccharqfailwithincontres = pmraaccharqfailwithincontres;
	}
	/**
	 * @return the pmraalloccfra
	 */
	public String getPmraalloccfra() {
		return pmraalloccfra;
	}
	/**
	 * @param pmraalloccfra the pmraalloccfra to set
	 */
	public void setPmraalloccfra(String pmraalloccfra) {
		this.pmraalloccfra = pmraalloccfra;
	}
	/**
	 * @return the pmraattcbra
	 */
	public String getPmraattcbra() {
		return pmraattcbra;
	}
	/**
	 * @param pmraattcbra the pmraattcbra to set
	 */
	public void setPmraattcbra(String pmraattcbra) {
		this.pmraattcbra = pmraattcbra;
	}
	/**
	 * @return the pmraattcfra
	 */
	public String getPmraattcfra() {
		return pmraattcfra;
	}
	/**
	 * @param pmraattcfra the pmraattcfra to set
	 */
	public void setPmraattcfra(String pmraattcfra) {
		this.pmraattcfra = pmraattcfra;
	}
	/**
	 * @return the pmrachnumcontentionreport
	 */
	public String getPmrachnumcontentionreport() {
		return pmrachnumcontentionreport;
	}
	/**
	 * @param pmrachnumcontentionreport the pmrachnumcontentionreport to set
	 */
	public void setPmrachnumcontentionreport(String pmrachnumcontentionreport) {
		this.pmrachnumcontentionreport = pmrachnumcontentionreport;
	}
	/**
	 * @return the pmracontresandrrcrsp
	 */
	public String getPmracontresandrrcrsp() {
		return pmracontresandrrcrsp;
	}
	/**
	 * @param pmracontresandrrcrsp the pmracontresandrrcrsp to set
	 */
	public void setPmracontresandrrcrsp(String pmracontresandrrcrsp) {
		this.pmracontresandrrcrsp = pmracontresandrrcrsp;
	}
	/**
	 * @return the pmracontresonly
	 */
	public String getPmracontresonly() {
		return pmracontresonly;
	}
	/**
	 * @param pmracontresonly the pmracontresonly to set
	 */
	public void setPmracontresonly(String pmracontresonly) {
		this.pmracontresonly = pmracontresonly;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb1
	 */
	public String getPmradiorecinterferencepwrprb1() {
		return pmradiorecinterferencepwrprb1;
	}
	/**
	 * @param pmradiorecinterferencepwrprb1 the pmradiorecinterferencepwrprb1 to set
	 */
	public void setPmradiorecinterferencepwrprb1(
			String pmradiorecinterferencepwrprb1) {
		this.pmradiorecinterferencepwrprb1 = pmradiorecinterferencepwrprb1;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb10
	 */
	public String getPmradiorecinterferencepwrprb10() {
		return pmradiorecinterferencepwrprb10;
	}
	/**
	 * @param pmradiorecinterferencepwrprb10 the pmradiorecinterferencepwrprb10 to set
	 */
	public void setPmradiorecinterferencepwrprb10(
			String pmradiorecinterferencepwrprb10) {
		this.pmradiorecinterferencepwrprb10 = pmradiorecinterferencepwrprb10;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb100
	 */
	public String getPmradiorecinterferencepwrprb100() {
		return pmradiorecinterferencepwrprb100;
	}
	/**
	 * @param pmradiorecinterferencepwrprb100 the pmradiorecinterferencepwrprb100 to set
	 */
	public void setPmradiorecinterferencepwrprb100(
			String pmradiorecinterferencepwrprb100) {
		this.pmradiorecinterferencepwrprb100 = pmradiorecinterferencepwrprb100;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb11
	 */
	public String getPmradiorecinterferencepwrprb11() {
		return pmradiorecinterferencepwrprb11;
	}
	/**
	 * @param pmradiorecinterferencepwrprb11 the pmradiorecinterferencepwrprb11 to set
	 */
	public void setPmradiorecinterferencepwrprb11(
			String pmradiorecinterferencepwrprb11) {
		this.pmradiorecinterferencepwrprb11 = pmradiorecinterferencepwrprb11;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb12
	 */
	public String getPmradiorecinterferencepwrprb12() {
		return pmradiorecinterferencepwrprb12;
	}
	/**
	 * @param pmradiorecinterferencepwrprb12 the pmradiorecinterferencepwrprb12 to set
	 */
	public void setPmradiorecinterferencepwrprb12(
			String pmradiorecinterferencepwrprb12) {
		this.pmradiorecinterferencepwrprb12 = pmradiorecinterferencepwrprb12;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb13
	 */
	public String getPmradiorecinterferencepwrprb13() {
		return pmradiorecinterferencepwrprb13;
	}
	/**
	 * @param pmradiorecinterferencepwrprb13 the pmradiorecinterferencepwrprb13 to set
	 */
	public void setPmradiorecinterferencepwrprb13(
			String pmradiorecinterferencepwrprb13) {
		this.pmradiorecinterferencepwrprb13 = pmradiorecinterferencepwrprb13;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb14
	 */
	public String getPmradiorecinterferencepwrprb14() {
		return pmradiorecinterferencepwrprb14;
	}
	/**
	 * @param pmradiorecinterferencepwrprb14 the pmradiorecinterferencepwrprb14 to set
	 */
	public void setPmradiorecinterferencepwrprb14(
			String pmradiorecinterferencepwrprb14) {
		this.pmradiorecinterferencepwrprb14 = pmradiorecinterferencepwrprb14;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb15
	 */
	public String getPmradiorecinterferencepwrprb15() {
		return pmradiorecinterferencepwrprb15;
	}
	/**
	 * @param pmradiorecinterferencepwrprb15 the pmradiorecinterferencepwrprb15 to set
	 */
	public void setPmradiorecinterferencepwrprb15(
			String pmradiorecinterferencepwrprb15) {
		this.pmradiorecinterferencepwrprb15 = pmradiorecinterferencepwrprb15;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb16
	 */
	public String getPmradiorecinterferencepwrprb16() {
		return pmradiorecinterferencepwrprb16;
	}
	/**
	 * @param pmradiorecinterferencepwrprb16 the pmradiorecinterferencepwrprb16 to set
	 */
	public void setPmradiorecinterferencepwrprb16(
			String pmradiorecinterferencepwrprb16) {
		this.pmradiorecinterferencepwrprb16 = pmradiorecinterferencepwrprb16;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb17
	 */
	public String getPmradiorecinterferencepwrprb17() {
		return pmradiorecinterferencepwrprb17;
	}
	/**
	 * @param pmradiorecinterferencepwrprb17 the pmradiorecinterferencepwrprb17 to set
	 */
	public void setPmradiorecinterferencepwrprb17(
			String pmradiorecinterferencepwrprb17) {
		this.pmradiorecinterferencepwrprb17 = pmradiorecinterferencepwrprb17;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb18
	 */
	public String getPmradiorecinterferencepwrprb18() {
		return pmradiorecinterferencepwrprb18;
	}
	/**
	 * @param pmradiorecinterferencepwrprb18 the pmradiorecinterferencepwrprb18 to set
	 */
	public void setPmradiorecinterferencepwrprb18(
			String pmradiorecinterferencepwrprb18) {
		this.pmradiorecinterferencepwrprb18 = pmradiorecinterferencepwrprb18;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb19
	 */
	public String getPmradiorecinterferencepwrprb19() {
		return pmradiorecinterferencepwrprb19;
	}
	/**
	 * @param pmradiorecinterferencepwrprb19 the pmradiorecinterferencepwrprb19 to set
	 */
	public void setPmradiorecinterferencepwrprb19(
			String pmradiorecinterferencepwrprb19) {
		this.pmradiorecinterferencepwrprb19 = pmradiorecinterferencepwrprb19;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb2
	 */
	public String getPmradiorecinterferencepwrprb2() {
		return pmradiorecinterferencepwrprb2;
	}
	/**
	 * @param pmradiorecinterferencepwrprb2 the pmradiorecinterferencepwrprb2 to set
	 */
	public void setPmradiorecinterferencepwrprb2(
			String pmradiorecinterferencepwrprb2) {
		this.pmradiorecinterferencepwrprb2 = pmradiorecinterferencepwrprb2;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb20
	 */
	public String getPmradiorecinterferencepwrprb20() {
		return pmradiorecinterferencepwrprb20;
	}
	/**
	 * @param pmradiorecinterferencepwrprb20 the pmradiorecinterferencepwrprb20 to set
	 */
	public void setPmradiorecinterferencepwrprb20(
			String pmradiorecinterferencepwrprb20) {
		this.pmradiorecinterferencepwrprb20 = pmradiorecinterferencepwrprb20;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb21
	 */
	public String getPmradiorecinterferencepwrprb21() {
		return pmradiorecinterferencepwrprb21;
	}
	/**
	 * @param pmradiorecinterferencepwrprb21 the pmradiorecinterferencepwrprb21 to set
	 */
	public void setPmradiorecinterferencepwrprb21(
			String pmradiorecinterferencepwrprb21) {
		this.pmradiorecinterferencepwrprb21 = pmradiorecinterferencepwrprb21;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb22
	 */
	public String getPmradiorecinterferencepwrprb22() {
		return pmradiorecinterferencepwrprb22;
	}
	/**
	 * @param pmradiorecinterferencepwrprb22 the pmradiorecinterferencepwrprb22 to set
	 */
	public void setPmradiorecinterferencepwrprb22(
			String pmradiorecinterferencepwrprb22) {
		this.pmradiorecinterferencepwrprb22 = pmradiorecinterferencepwrprb22;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb23
	 */
	public String getPmradiorecinterferencepwrprb23() {
		return pmradiorecinterferencepwrprb23;
	}
	/**
	 * @param pmradiorecinterferencepwrprb23 the pmradiorecinterferencepwrprb23 to set
	 */
	public void setPmradiorecinterferencepwrprb23(
			String pmradiorecinterferencepwrprb23) {
		this.pmradiorecinterferencepwrprb23 = pmradiorecinterferencepwrprb23;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb24
	 */
	public String getPmradiorecinterferencepwrprb24() {
		return pmradiorecinterferencepwrprb24;
	}
	/**
	 * @param pmradiorecinterferencepwrprb24 the pmradiorecinterferencepwrprb24 to set
	 */
	public void setPmradiorecinterferencepwrprb24(
			String pmradiorecinterferencepwrprb24) {
		this.pmradiorecinterferencepwrprb24 = pmradiorecinterferencepwrprb24;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb25
	 */
	public String getPmradiorecinterferencepwrprb25() {
		return pmradiorecinterferencepwrprb25;
	}
	/**
	 * @param pmradiorecinterferencepwrprb25 the pmradiorecinterferencepwrprb25 to set
	 */
	public void setPmradiorecinterferencepwrprb25(
			String pmradiorecinterferencepwrprb25) {
		this.pmradiorecinterferencepwrprb25 = pmradiorecinterferencepwrprb25;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb26
	 */
	public String getPmradiorecinterferencepwrprb26() {
		return pmradiorecinterferencepwrprb26;
	}
	/**
	 * @param pmradiorecinterferencepwrprb26 the pmradiorecinterferencepwrprb26 to set
	 */
	public void setPmradiorecinterferencepwrprb26(
			String pmradiorecinterferencepwrprb26) {
		this.pmradiorecinterferencepwrprb26 = pmradiorecinterferencepwrprb26;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb27
	 */
	public String getPmradiorecinterferencepwrprb27() {
		return pmradiorecinterferencepwrprb27;
	}
	/**
	 * @param pmradiorecinterferencepwrprb27 the pmradiorecinterferencepwrprb27 to set
	 */
	public void setPmradiorecinterferencepwrprb27(
			String pmradiorecinterferencepwrprb27) {
		this.pmradiorecinterferencepwrprb27 = pmradiorecinterferencepwrprb27;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb28
	 */
	public String getPmradiorecinterferencepwrprb28() {
		return pmradiorecinterferencepwrprb28;
	}
	/**
	 * @param pmradiorecinterferencepwrprb28 the pmradiorecinterferencepwrprb28 to set
	 */
	public void setPmradiorecinterferencepwrprb28(
			String pmradiorecinterferencepwrprb28) {
		this.pmradiorecinterferencepwrprb28 = pmradiorecinterferencepwrprb28;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb29
	 */
	public String getPmradiorecinterferencepwrprb29() {
		return pmradiorecinterferencepwrprb29;
	}
	/**
	 * @param pmradiorecinterferencepwrprb29 the pmradiorecinterferencepwrprb29 to set
	 */
	public void setPmradiorecinterferencepwrprb29(
			String pmradiorecinterferencepwrprb29) {
		this.pmradiorecinterferencepwrprb29 = pmradiorecinterferencepwrprb29;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb3
	 */
	public String getPmradiorecinterferencepwrprb3() {
		return pmradiorecinterferencepwrprb3;
	}
	/**
	 * @param pmradiorecinterferencepwrprb3 the pmradiorecinterferencepwrprb3 to set
	 */
	public void setPmradiorecinterferencepwrprb3(
			String pmradiorecinterferencepwrprb3) {
		this.pmradiorecinterferencepwrprb3 = pmradiorecinterferencepwrprb3;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb30
	 */
	public String getPmradiorecinterferencepwrprb30() {
		return pmradiorecinterferencepwrprb30;
	}
	/**
	 * @param pmradiorecinterferencepwrprb30 the pmradiorecinterferencepwrprb30 to set
	 */
	public void setPmradiorecinterferencepwrprb30(
			String pmradiorecinterferencepwrprb30) {
		this.pmradiorecinterferencepwrprb30 = pmradiorecinterferencepwrprb30;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb31
	 */
	public String getPmradiorecinterferencepwrprb31() {
		return pmradiorecinterferencepwrprb31;
	}
	/**
	 * @param pmradiorecinterferencepwrprb31 the pmradiorecinterferencepwrprb31 to set
	 */
	public void setPmradiorecinterferencepwrprb31(
			String pmradiorecinterferencepwrprb31) {
		this.pmradiorecinterferencepwrprb31 = pmradiorecinterferencepwrprb31;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb32
	 */
	public String getPmradiorecinterferencepwrprb32() {
		return pmradiorecinterferencepwrprb32;
	}
	/**
	 * @param pmradiorecinterferencepwrprb32 the pmradiorecinterferencepwrprb32 to set
	 */
	public void setPmradiorecinterferencepwrprb32(
			String pmradiorecinterferencepwrprb32) {
		this.pmradiorecinterferencepwrprb32 = pmradiorecinterferencepwrprb32;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb33
	 */
	public String getPmradiorecinterferencepwrprb33() {
		return pmradiorecinterferencepwrprb33;
	}
	/**
	 * @param pmradiorecinterferencepwrprb33 the pmradiorecinterferencepwrprb33 to set
	 */
	public void setPmradiorecinterferencepwrprb33(
			String pmradiorecinterferencepwrprb33) {
		this.pmradiorecinterferencepwrprb33 = pmradiorecinterferencepwrprb33;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb34
	 */
	public String getPmradiorecinterferencepwrprb34() {
		return pmradiorecinterferencepwrprb34;
	}
	/**
	 * @param pmradiorecinterferencepwrprb34 the pmradiorecinterferencepwrprb34 to set
	 */
	public void setPmradiorecinterferencepwrprb34(
			String pmradiorecinterferencepwrprb34) {
		this.pmradiorecinterferencepwrprb34 = pmradiorecinterferencepwrprb34;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb35
	 */
	public String getPmradiorecinterferencepwrprb35() {
		return pmradiorecinterferencepwrprb35;
	}
	/**
	 * @param pmradiorecinterferencepwrprb35 the pmradiorecinterferencepwrprb35 to set
	 */
	public void setPmradiorecinterferencepwrprb35(
			String pmradiorecinterferencepwrprb35) {
		this.pmradiorecinterferencepwrprb35 = pmradiorecinterferencepwrprb35;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb36
	 */
	public String getPmradiorecinterferencepwrprb36() {
		return pmradiorecinterferencepwrprb36;
	}
	/**
	 * @param pmradiorecinterferencepwrprb36 the pmradiorecinterferencepwrprb36 to set
	 */
	public void setPmradiorecinterferencepwrprb36(
			String pmradiorecinterferencepwrprb36) {
		this.pmradiorecinterferencepwrprb36 = pmradiorecinterferencepwrprb36;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb37
	 */
	public String getPmradiorecinterferencepwrprb37() {
		return pmradiorecinterferencepwrprb37;
	}
	/**
	 * @param pmradiorecinterferencepwrprb37 the pmradiorecinterferencepwrprb37 to set
	 */
	public void setPmradiorecinterferencepwrprb37(
			String pmradiorecinterferencepwrprb37) {
		this.pmradiorecinterferencepwrprb37 = pmradiorecinterferencepwrprb37;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb38
	 */
	public String getPmradiorecinterferencepwrprb38() {
		return pmradiorecinterferencepwrprb38;
	}
	/**
	 * @param pmradiorecinterferencepwrprb38 the pmradiorecinterferencepwrprb38 to set
	 */
	public void setPmradiorecinterferencepwrprb38(
			String pmradiorecinterferencepwrprb38) {
		this.pmradiorecinterferencepwrprb38 = pmradiorecinterferencepwrprb38;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb39
	 */
	public String getPmradiorecinterferencepwrprb39() {
		return pmradiorecinterferencepwrprb39;
	}
	/**
	 * @param pmradiorecinterferencepwrprb39 the pmradiorecinterferencepwrprb39 to set
	 */
	public void setPmradiorecinterferencepwrprb39(
			String pmradiorecinterferencepwrprb39) {
		this.pmradiorecinterferencepwrprb39 = pmradiorecinterferencepwrprb39;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb4
	 */
	public String getPmradiorecinterferencepwrprb4() {
		return pmradiorecinterferencepwrprb4;
	}
	/**
	 * @param pmradiorecinterferencepwrprb4 the pmradiorecinterferencepwrprb4 to set
	 */
	public void setPmradiorecinterferencepwrprb4(
			String pmradiorecinterferencepwrprb4) {
		this.pmradiorecinterferencepwrprb4 = pmradiorecinterferencepwrprb4;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb40
	 */
	public String getPmradiorecinterferencepwrprb40() {
		return pmradiorecinterferencepwrprb40;
	}
	/**
	 * @param pmradiorecinterferencepwrprb40 the pmradiorecinterferencepwrprb40 to set
	 */
	public void setPmradiorecinterferencepwrprb40(
			String pmradiorecinterferencepwrprb40) {
		this.pmradiorecinterferencepwrprb40 = pmradiorecinterferencepwrprb40;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb41
	 */
	public String getPmradiorecinterferencepwrprb41() {
		return pmradiorecinterferencepwrprb41;
	}
	/**
	 * @param pmradiorecinterferencepwrprb41 the pmradiorecinterferencepwrprb41 to set
	 */
	public void setPmradiorecinterferencepwrprb41(
			String pmradiorecinterferencepwrprb41) {
		this.pmradiorecinterferencepwrprb41 = pmradiorecinterferencepwrprb41;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb42
	 */
	public String getPmradiorecinterferencepwrprb42() {
		return pmradiorecinterferencepwrprb42;
	}
	/**
	 * @param pmradiorecinterferencepwrprb42 the pmradiorecinterferencepwrprb42 to set
	 */
	public void setPmradiorecinterferencepwrprb42(
			String pmradiorecinterferencepwrprb42) {
		this.pmradiorecinterferencepwrprb42 = pmradiorecinterferencepwrprb42;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb43
	 */
	public String getPmradiorecinterferencepwrprb43() {
		return pmradiorecinterferencepwrprb43;
	}
	/**
	 * @param pmradiorecinterferencepwrprb43 the pmradiorecinterferencepwrprb43 to set
	 */
	public void setPmradiorecinterferencepwrprb43(
			String pmradiorecinterferencepwrprb43) {
		this.pmradiorecinterferencepwrprb43 = pmradiorecinterferencepwrprb43;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb44
	 */
	public String getPmradiorecinterferencepwrprb44() {
		return pmradiorecinterferencepwrprb44;
	}
	/**
	 * @param pmradiorecinterferencepwrprb44 the pmradiorecinterferencepwrprb44 to set
	 */
	public void setPmradiorecinterferencepwrprb44(
			String pmradiorecinterferencepwrprb44) {
		this.pmradiorecinterferencepwrprb44 = pmradiorecinterferencepwrprb44;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb45
	 */
	public String getPmradiorecinterferencepwrprb45() {
		return pmradiorecinterferencepwrprb45;
	}
	/**
	 * @param pmradiorecinterferencepwrprb45 the pmradiorecinterferencepwrprb45 to set
	 */
	public void setPmradiorecinterferencepwrprb45(
			String pmradiorecinterferencepwrprb45) {
		this.pmradiorecinterferencepwrprb45 = pmradiorecinterferencepwrprb45;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb46
	 */
	public String getPmradiorecinterferencepwrprb46() {
		return pmradiorecinterferencepwrprb46;
	}
	/**
	 * @param pmradiorecinterferencepwrprb46 the pmradiorecinterferencepwrprb46 to set
	 */
	public void setPmradiorecinterferencepwrprb46(
			String pmradiorecinterferencepwrprb46) {
		this.pmradiorecinterferencepwrprb46 = pmradiorecinterferencepwrprb46;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb47
	 */
	public String getPmradiorecinterferencepwrprb47() {
		return pmradiorecinterferencepwrprb47;
	}
	/**
	 * @param pmradiorecinterferencepwrprb47 the pmradiorecinterferencepwrprb47 to set
	 */
	public void setPmradiorecinterferencepwrprb47(
			String pmradiorecinterferencepwrprb47) {
		this.pmradiorecinterferencepwrprb47 = pmradiorecinterferencepwrprb47;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb48
	 */
	public String getPmradiorecinterferencepwrprb48() {
		return pmradiorecinterferencepwrprb48;
	}
	/**
	 * @param pmradiorecinterferencepwrprb48 the pmradiorecinterferencepwrprb48 to set
	 */
	public void setPmradiorecinterferencepwrprb48(
			String pmradiorecinterferencepwrprb48) {
		this.pmradiorecinterferencepwrprb48 = pmradiorecinterferencepwrprb48;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb49
	 */
	public String getPmradiorecinterferencepwrprb49() {
		return pmradiorecinterferencepwrprb49;
	}
	/**
	 * @param pmradiorecinterferencepwrprb49 the pmradiorecinterferencepwrprb49 to set
	 */
	public void setPmradiorecinterferencepwrprb49(
			String pmradiorecinterferencepwrprb49) {
		this.pmradiorecinterferencepwrprb49 = pmradiorecinterferencepwrprb49;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb5
	 */
	public String getPmradiorecinterferencepwrprb5() {
		return pmradiorecinterferencepwrprb5;
	}
	/**
	 * @param pmradiorecinterferencepwrprb5 the pmradiorecinterferencepwrprb5 to set
	 */
	public void setPmradiorecinterferencepwrprb5(
			String pmradiorecinterferencepwrprb5) {
		this.pmradiorecinterferencepwrprb5 = pmradiorecinterferencepwrprb5;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb50
	 */
	public String getPmradiorecinterferencepwrprb50() {
		return pmradiorecinterferencepwrprb50;
	}
	/**
	 * @param pmradiorecinterferencepwrprb50 the pmradiorecinterferencepwrprb50 to set
	 */
	public void setPmradiorecinterferencepwrprb50(
			String pmradiorecinterferencepwrprb50) {
		this.pmradiorecinterferencepwrprb50 = pmradiorecinterferencepwrprb50;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb51
	 */
	public String getPmradiorecinterferencepwrprb51() {
		return pmradiorecinterferencepwrprb51;
	}
	/**
	 * @param pmradiorecinterferencepwrprb51 the pmradiorecinterferencepwrprb51 to set
	 */
	public void setPmradiorecinterferencepwrprb51(
			String pmradiorecinterferencepwrprb51) {
		this.pmradiorecinterferencepwrprb51 = pmradiorecinterferencepwrprb51;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb52
	 */
	public String getPmradiorecinterferencepwrprb52() {
		return pmradiorecinterferencepwrprb52;
	}
	/**
	 * @param pmradiorecinterferencepwrprb52 the pmradiorecinterferencepwrprb52 to set
	 */
	public void setPmradiorecinterferencepwrprb52(
			String pmradiorecinterferencepwrprb52) {
		this.pmradiorecinterferencepwrprb52 = pmradiorecinterferencepwrprb52;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb53
	 */
	public String getPmradiorecinterferencepwrprb53() {
		return pmradiorecinterferencepwrprb53;
	}
	/**
	 * @param pmradiorecinterferencepwrprb53 the pmradiorecinterferencepwrprb53 to set
	 */
	public void setPmradiorecinterferencepwrprb53(
			String pmradiorecinterferencepwrprb53) {
		this.pmradiorecinterferencepwrprb53 = pmradiorecinterferencepwrprb53;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb54
	 */
	public String getPmradiorecinterferencepwrprb54() {
		return pmradiorecinterferencepwrprb54;
	}
	/**
	 * @param pmradiorecinterferencepwrprb54 the pmradiorecinterferencepwrprb54 to set
	 */
	public void setPmradiorecinterferencepwrprb54(
			String pmradiorecinterferencepwrprb54) {
		this.pmradiorecinterferencepwrprb54 = pmradiorecinterferencepwrprb54;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb55
	 */
	public String getPmradiorecinterferencepwrprb55() {
		return pmradiorecinterferencepwrprb55;
	}
	/**
	 * @param pmradiorecinterferencepwrprb55 the pmradiorecinterferencepwrprb55 to set
	 */
	public void setPmradiorecinterferencepwrprb55(
			String pmradiorecinterferencepwrprb55) {
		this.pmradiorecinterferencepwrprb55 = pmradiorecinterferencepwrprb55;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb56
	 */
	public String getPmradiorecinterferencepwrprb56() {
		return pmradiorecinterferencepwrprb56;
	}
	/**
	 * @param pmradiorecinterferencepwrprb56 the pmradiorecinterferencepwrprb56 to set
	 */
	public void setPmradiorecinterferencepwrprb56(
			String pmradiorecinterferencepwrprb56) {
		this.pmradiorecinterferencepwrprb56 = pmradiorecinterferencepwrprb56;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb57
	 */
	public String getPmradiorecinterferencepwrprb57() {
		return pmradiorecinterferencepwrprb57;
	}
	/**
	 * @param pmradiorecinterferencepwrprb57 the pmradiorecinterferencepwrprb57 to set
	 */
	public void setPmradiorecinterferencepwrprb57(
			String pmradiorecinterferencepwrprb57) {
		this.pmradiorecinterferencepwrprb57 = pmradiorecinterferencepwrprb57;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb58
	 */
	public String getPmradiorecinterferencepwrprb58() {
		return pmradiorecinterferencepwrprb58;
	}
	/**
	 * @param pmradiorecinterferencepwrprb58 the pmradiorecinterferencepwrprb58 to set
	 */
	public void setPmradiorecinterferencepwrprb58(
			String pmradiorecinterferencepwrprb58) {
		this.pmradiorecinterferencepwrprb58 = pmradiorecinterferencepwrprb58;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb59
	 */
	public String getPmradiorecinterferencepwrprb59() {
		return pmradiorecinterferencepwrprb59;
	}
	/**
	 * @param pmradiorecinterferencepwrprb59 the pmradiorecinterferencepwrprb59 to set
	 */
	public void setPmradiorecinterferencepwrprb59(
			String pmradiorecinterferencepwrprb59) {
		this.pmradiorecinterferencepwrprb59 = pmradiorecinterferencepwrprb59;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb6
	 */
	public String getPmradiorecinterferencepwrprb6() {
		return pmradiorecinterferencepwrprb6;
	}
	/**
	 * @param pmradiorecinterferencepwrprb6 the pmradiorecinterferencepwrprb6 to set
	 */
	public void setPmradiorecinterferencepwrprb6(
			String pmradiorecinterferencepwrprb6) {
		this.pmradiorecinterferencepwrprb6 = pmradiorecinterferencepwrprb6;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb60
	 */
	public String getPmradiorecinterferencepwrprb60() {
		return pmradiorecinterferencepwrprb60;
	}
	/**
	 * @param pmradiorecinterferencepwrprb60 the pmradiorecinterferencepwrprb60 to set
	 */
	public void setPmradiorecinterferencepwrprb60(
			String pmradiorecinterferencepwrprb60) {
		this.pmradiorecinterferencepwrprb60 = pmradiorecinterferencepwrprb60;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb61
	 */
	public String getPmradiorecinterferencepwrprb61() {
		return pmradiorecinterferencepwrprb61;
	}
	/**
	 * @param pmradiorecinterferencepwrprb61 the pmradiorecinterferencepwrprb61 to set
	 */
	public void setPmradiorecinterferencepwrprb61(
			String pmradiorecinterferencepwrprb61) {
		this.pmradiorecinterferencepwrprb61 = pmradiorecinterferencepwrprb61;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb62
	 */
	public String getPmradiorecinterferencepwrprb62() {
		return pmradiorecinterferencepwrprb62;
	}
	/**
	 * @param pmradiorecinterferencepwrprb62 the pmradiorecinterferencepwrprb62 to set
	 */
	public void setPmradiorecinterferencepwrprb62(
			String pmradiorecinterferencepwrprb62) {
		this.pmradiorecinterferencepwrprb62 = pmradiorecinterferencepwrprb62;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb63
	 */
	public String getPmradiorecinterferencepwrprb63() {
		return pmradiorecinterferencepwrprb63;
	}
	/**
	 * @param pmradiorecinterferencepwrprb63 the pmradiorecinterferencepwrprb63 to set
	 */
	public void setPmradiorecinterferencepwrprb63(
			String pmradiorecinterferencepwrprb63) {
		this.pmradiorecinterferencepwrprb63 = pmradiorecinterferencepwrprb63;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb64
	 */
	public String getPmradiorecinterferencepwrprb64() {
		return pmradiorecinterferencepwrprb64;
	}
	/**
	 * @param pmradiorecinterferencepwrprb64 the pmradiorecinterferencepwrprb64 to set
	 */
	public void setPmradiorecinterferencepwrprb64(
			String pmradiorecinterferencepwrprb64) {
		this.pmradiorecinterferencepwrprb64 = pmradiorecinterferencepwrprb64;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb65
	 */
	public String getPmradiorecinterferencepwrprb65() {
		return pmradiorecinterferencepwrprb65;
	}
	/**
	 * @param pmradiorecinterferencepwrprb65 the pmradiorecinterferencepwrprb65 to set
	 */
	public void setPmradiorecinterferencepwrprb65(
			String pmradiorecinterferencepwrprb65) {
		this.pmradiorecinterferencepwrprb65 = pmradiorecinterferencepwrprb65;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb66
	 */
	public String getPmradiorecinterferencepwrprb66() {
		return pmradiorecinterferencepwrprb66;
	}
	/**
	 * @param pmradiorecinterferencepwrprb66 the pmradiorecinterferencepwrprb66 to set
	 */
	public void setPmradiorecinterferencepwrprb66(
			String pmradiorecinterferencepwrprb66) {
		this.pmradiorecinterferencepwrprb66 = pmradiorecinterferencepwrprb66;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb67
	 */
	public String getPmradiorecinterferencepwrprb67() {
		return pmradiorecinterferencepwrprb67;
	}
	/**
	 * @param pmradiorecinterferencepwrprb67 the pmradiorecinterferencepwrprb67 to set
	 */
	public void setPmradiorecinterferencepwrprb67(
			String pmradiorecinterferencepwrprb67) {
		this.pmradiorecinterferencepwrprb67 = pmradiorecinterferencepwrprb67;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb68
	 */
	public String getPmradiorecinterferencepwrprb68() {
		return pmradiorecinterferencepwrprb68;
	}
	/**
	 * @param pmradiorecinterferencepwrprb68 the pmradiorecinterferencepwrprb68 to set
	 */
	public void setPmradiorecinterferencepwrprb68(
			String pmradiorecinterferencepwrprb68) {
		this.pmradiorecinterferencepwrprb68 = pmradiorecinterferencepwrprb68;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb69
	 */
	public String getPmradiorecinterferencepwrprb69() {
		return pmradiorecinterferencepwrprb69;
	}
	/**
	 * @param pmradiorecinterferencepwrprb69 the pmradiorecinterferencepwrprb69 to set
	 */
	public void setPmradiorecinterferencepwrprb69(
			String pmradiorecinterferencepwrprb69) {
		this.pmradiorecinterferencepwrprb69 = pmradiorecinterferencepwrprb69;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb7
	 */
	public String getPmradiorecinterferencepwrprb7() {
		return pmradiorecinterferencepwrprb7;
	}
	/**
	 * @param pmradiorecinterferencepwrprb7 the pmradiorecinterferencepwrprb7 to set
	 */
	public void setPmradiorecinterferencepwrprb7(
			String pmradiorecinterferencepwrprb7) {
		this.pmradiorecinterferencepwrprb7 = pmradiorecinterferencepwrprb7;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb70
	 */
	public String getPmradiorecinterferencepwrprb70() {
		return pmradiorecinterferencepwrprb70;
	}
	/**
	 * @param pmradiorecinterferencepwrprb70 the pmradiorecinterferencepwrprb70 to set
	 */
	public void setPmradiorecinterferencepwrprb70(
			String pmradiorecinterferencepwrprb70) {
		this.pmradiorecinterferencepwrprb70 = pmradiorecinterferencepwrprb70;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb71
	 */
	public String getPmradiorecinterferencepwrprb71() {
		return pmradiorecinterferencepwrprb71;
	}
	/**
	 * @param pmradiorecinterferencepwrprb71 the pmradiorecinterferencepwrprb71 to set
	 */
	public void setPmradiorecinterferencepwrprb71(
			String pmradiorecinterferencepwrprb71) {
		this.pmradiorecinterferencepwrprb71 = pmradiorecinterferencepwrprb71;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb72
	 */
	public String getPmradiorecinterferencepwrprb72() {
		return pmradiorecinterferencepwrprb72;
	}
	/**
	 * @param pmradiorecinterferencepwrprb72 the pmradiorecinterferencepwrprb72 to set
	 */
	public void setPmradiorecinterferencepwrprb72(
			String pmradiorecinterferencepwrprb72) {
		this.pmradiorecinterferencepwrprb72 = pmradiorecinterferencepwrprb72;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb73
	 */
	public String getPmradiorecinterferencepwrprb73() {
		return pmradiorecinterferencepwrprb73;
	}
	/**
	 * @param pmradiorecinterferencepwrprb73 the pmradiorecinterferencepwrprb73 to set
	 */
	public void setPmradiorecinterferencepwrprb73(
			String pmradiorecinterferencepwrprb73) {
		this.pmradiorecinterferencepwrprb73 = pmradiorecinterferencepwrprb73;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb74
	 */
	public String getPmradiorecinterferencepwrprb74() {
		return pmradiorecinterferencepwrprb74;
	}
	/**
	 * @param pmradiorecinterferencepwrprb74 the pmradiorecinterferencepwrprb74 to set
	 */
	public void setPmradiorecinterferencepwrprb74(
			String pmradiorecinterferencepwrprb74) {
		this.pmradiorecinterferencepwrprb74 = pmradiorecinterferencepwrprb74;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb75
	 */
	public String getPmradiorecinterferencepwrprb75() {
		return pmradiorecinterferencepwrprb75;
	}
	/**
	 * @param pmradiorecinterferencepwrprb75 the pmradiorecinterferencepwrprb75 to set
	 */
	public void setPmradiorecinterferencepwrprb75(
			String pmradiorecinterferencepwrprb75) {
		this.pmradiorecinterferencepwrprb75 = pmradiorecinterferencepwrprb75;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb76
	 */
	public String getPmradiorecinterferencepwrprb76() {
		return pmradiorecinterferencepwrprb76;
	}
	/**
	 * @param pmradiorecinterferencepwrprb76 the pmradiorecinterferencepwrprb76 to set
	 */
	public void setPmradiorecinterferencepwrprb76(
			String pmradiorecinterferencepwrprb76) {
		this.pmradiorecinterferencepwrprb76 = pmradiorecinterferencepwrprb76;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb77
	 */
	public String getPmradiorecinterferencepwrprb77() {
		return pmradiorecinterferencepwrprb77;
	}
	/**
	 * @param pmradiorecinterferencepwrprb77 the pmradiorecinterferencepwrprb77 to set
	 */
	public void setPmradiorecinterferencepwrprb77(
			String pmradiorecinterferencepwrprb77) {
		this.pmradiorecinterferencepwrprb77 = pmradiorecinterferencepwrprb77;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb78
	 */
	public String getPmradiorecinterferencepwrprb78() {
		return pmradiorecinterferencepwrprb78;
	}
	/**
	 * @param pmradiorecinterferencepwrprb78 the pmradiorecinterferencepwrprb78 to set
	 */
	public void setPmradiorecinterferencepwrprb78(
			String pmradiorecinterferencepwrprb78) {
		this.pmradiorecinterferencepwrprb78 = pmradiorecinterferencepwrprb78;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb79
	 */
	public String getPmradiorecinterferencepwrprb79() {
		return pmradiorecinterferencepwrprb79;
	}
	/**
	 * @param pmradiorecinterferencepwrprb79 the pmradiorecinterferencepwrprb79 to set
	 */
	public void setPmradiorecinterferencepwrprb79(
			String pmradiorecinterferencepwrprb79) {
		this.pmradiorecinterferencepwrprb79 = pmradiorecinterferencepwrprb79;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb8
	 */
	public String getPmradiorecinterferencepwrprb8() {
		return pmradiorecinterferencepwrprb8;
	}
	/**
	 * @param pmradiorecinterferencepwrprb8 the pmradiorecinterferencepwrprb8 to set
	 */
	public void setPmradiorecinterferencepwrprb8(
			String pmradiorecinterferencepwrprb8) {
		this.pmradiorecinterferencepwrprb8 = pmradiorecinterferencepwrprb8;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb80
	 */
	public String getPmradiorecinterferencepwrprb80() {
		return pmradiorecinterferencepwrprb80;
	}
	/**
	 * @param pmradiorecinterferencepwrprb80 the pmradiorecinterferencepwrprb80 to set
	 */
	public void setPmradiorecinterferencepwrprb80(
			String pmradiorecinterferencepwrprb80) {
		this.pmradiorecinterferencepwrprb80 = pmradiorecinterferencepwrprb80;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb81
	 */
	public String getPmradiorecinterferencepwrprb81() {
		return pmradiorecinterferencepwrprb81;
	}
	/**
	 * @param pmradiorecinterferencepwrprb81 the pmradiorecinterferencepwrprb81 to set
	 */
	public void setPmradiorecinterferencepwrprb81(
			String pmradiorecinterferencepwrprb81) {
		this.pmradiorecinterferencepwrprb81 = pmradiorecinterferencepwrprb81;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb82
	 */
	public String getPmradiorecinterferencepwrprb82() {
		return pmradiorecinterferencepwrprb82;
	}
	/**
	 * @param pmradiorecinterferencepwrprb82 the pmradiorecinterferencepwrprb82 to set
	 */
	public void setPmradiorecinterferencepwrprb82(
			String pmradiorecinterferencepwrprb82) {
		this.pmradiorecinterferencepwrprb82 = pmradiorecinterferencepwrprb82;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb83
	 */
	public String getPmradiorecinterferencepwrprb83() {
		return pmradiorecinterferencepwrprb83;
	}
	/**
	 * @param pmradiorecinterferencepwrprb83 the pmradiorecinterferencepwrprb83 to set
	 */
	public void setPmradiorecinterferencepwrprb83(
			String pmradiorecinterferencepwrprb83) {
		this.pmradiorecinterferencepwrprb83 = pmradiorecinterferencepwrprb83;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb84
	 */
	public String getPmradiorecinterferencepwrprb84() {
		return pmradiorecinterferencepwrprb84;
	}
	/**
	 * @param pmradiorecinterferencepwrprb84 the pmradiorecinterferencepwrprb84 to set
	 */
	public void setPmradiorecinterferencepwrprb84(
			String pmradiorecinterferencepwrprb84) {
		this.pmradiorecinterferencepwrprb84 = pmradiorecinterferencepwrprb84;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb85
	 */
	public String getPmradiorecinterferencepwrprb85() {
		return pmradiorecinterferencepwrprb85;
	}
	/**
	 * @param pmradiorecinterferencepwrprb85 the pmradiorecinterferencepwrprb85 to set
	 */
	public void setPmradiorecinterferencepwrprb85(
			String pmradiorecinterferencepwrprb85) {
		this.pmradiorecinterferencepwrprb85 = pmradiorecinterferencepwrprb85;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb86
	 */
	public String getPmradiorecinterferencepwrprb86() {
		return pmradiorecinterferencepwrprb86;
	}
	/**
	 * @param pmradiorecinterferencepwrprb86 the pmradiorecinterferencepwrprb86 to set
	 */
	public void setPmradiorecinterferencepwrprb86(
			String pmradiorecinterferencepwrprb86) {
		this.pmradiorecinterferencepwrprb86 = pmradiorecinterferencepwrprb86;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb87
	 */
	public String getPmradiorecinterferencepwrprb87() {
		return pmradiorecinterferencepwrprb87;
	}
	/**
	 * @param pmradiorecinterferencepwrprb87 the pmradiorecinterferencepwrprb87 to set
	 */
	public void setPmradiorecinterferencepwrprb87(
			String pmradiorecinterferencepwrprb87) {
		this.pmradiorecinterferencepwrprb87 = pmradiorecinterferencepwrprb87;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb88
	 */
	public String getPmradiorecinterferencepwrprb88() {
		return pmradiorecinterferencepwrprb88;
	}
	/**
	 * @param pmradiorecinterferencepwrprb88 the pmradiorecinterferencepwrprb88 to set
	 */
	public void setPmradiorecinterferencepwrprb88(
			String pmradiorecinterferencepwrprb88) {
		this.pmradiorecinterferencepwrprb88 = pmradiorecinterferencepwrprb88;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb89
	 */
	public String getPmradiorecinterferencepwrprb89() {
		return pmradiorecinterferencepwrprb89;
	}
	/**
	 * @param pmradiorecinterferencepwrprb89 the pmradiorecinterferencepwrprb89 to set
	 */
	public void setPmradiorecinterferencepwrprb89(
			String pmradiorecinterferencepwrprb89) {
		this.pmradiorecinterferencepwrprb89 = pmradiorecinterferencepwrprb89;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb9
	 */
	public String getPmradiorecinterferencepwrprb9() {
		return pmradiorecinterferencepwrprb9;
	}
	/**
	 * @param pmradiorecinterferencepwrprb9 the pmradiorecinterferencepwrprb9 to set
	 */
	public void setPmradiorecinterferencepwrprb9(
			String pmradiorecinterferencepwrprb9) {
		this.pmradiorecinterferencepwrprb9 = pmradiorecinterferencepwrprb9;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb90
	 */
	public String getPmradiorecinterferencepwrprb90() {
		return pmradiorecinterferencepwrprb90;
	}
	/**
	 * @param pmradiorecinterferencepwrprb90 the pmradiorecinterferencepwrprb90 to set
	 */
	public void setPmradiorecinterferencepwrprb90(
			String pmradiorecinterferencepwrprb90) {
		this.pmradiorecinterferencepwrprb90 = pmradiorecinterferencepwrprb90;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb91
	 */
	public String getPmradiorecinterferencepwrprb91() {
		return pmradiorecinterferencepwrprb91;
	}
	/**
	 * @param pmradiorecinterferencepwrprb91 the pmradiorecinterferencepwrprb91 to set
	 */
	public void setPmradiorecinterferencepwrprb91(
			String pmradiorecinterferencepwrprb91) {
		this.pmradiorecinterferencepwrprb91 = pmradiorecinterferencepwrprb91;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb92
	 */
	public String getPmradiorecinterferencepwrprb92() {
		return pmradiorecinterferencepwrprb92;
	}
	/**
	 * @param pmradiorecinterferencepwrprb92 the pmradiorecinterferencepwrprb92 to set
	 */
	public void setPmradiorecinterferencepwrprb92(
			String pmradiorecinterferencepwrprb92) {
		this.pmradiorecinterferencepwrprb92 = pmradiorecinterferencepwrprb92;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb93
	 */
	public String getPmradiorecinterferencepwrprb93() {
		return pmradiorecinterferencepwrprb93;
	}
	/**
	 * @param pmradiorecinterferencepwrprb93 the pmradiorecinterferencepwrprb93 to set
	 */
	public void setPmradiorecinterferencepwrprb93(
			String pmradiorecinterferencepwrprb93) {
		this.pmradiorecinterferencepwrprb93 = pmradiorecinterferencepwrprb93;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb94
	 */
	public String getPmradiorecinterferencepwrprb94() {
		return pmradiorecinterferencepwrprb94;
	}
	/**
	 * @param pmradiorecinterferencepwrprb94 the pmradiorecinterferencepwrprb94 to set
	 */
	public void setPmradiorecinterferencepwrprb94(
			String pmradiorecinterferencepwrprb94) {
		this.pmradiorecinterferencepwrprb94 = pmradiorecinterferencepwrprb94;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb95
	 */
	public String getPmradiorecinterferencepwrprb95() {
		return pmradiorecinterferencepwrprb95;
	}
	/**
	 * @param pmradiorecinterferencepwrprb95 the pmradiorecinterferencepwrprb95 to set
	 */
	public void setPmradiorecinterferencepwrprb95(
			String pmradiorecinterferencepwrprb95) {
		this.pmradiorecinterferencepwrprb95 = pmradiorecinterferencepwrprb95;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb96
	 */
	public String getPmradiorecinterferencepwrprb96() {
		return pmradiorecinterferencepwrprb96;
	}
	/**
	 * @param pmradiorecinterferencepwrprb96 the pmradiorecinterferencepwrprb96 to set
	 */
	public void setPmradiorecinterferencepwrprb96(
			String pmradiorecinterferencepwrprb96) {
		this.pmradiorecinterferencepwrprb96 = pmradiorecinterferencepwrprb96;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb97
	 */
	public String getPmradiorecinterferencepwrprb97() {
		return pmradiorecinterferencepwrprb97;
	}
	/**
	 * @param pmradiorecinterferencepwrprb97 the pmradiorecinterferencepwrprb97 to set
	 */
	public void setPmradiorecinterferencepwrprb97(
			String pmradiorecinterferencepwrprb97) {
		this.pmradiorecinterferencepwrprb97 = pmradiorecinterferencepwrprb97;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb98
	 */
	public String getPmradiorecinterferencepwrprb98() {
		return pmradiorecinterferencepwrprb98;
	}
	/**
	 * @param pmradiorecinterferencepwrprb98 the pmradiorecinterferencepwrprb98 to set
	 */
	public void setPmradiorecinterferencepwrprb98(
			String pmradiorecinterferencepwrprb98) {
		this.pmradiorecinterferencepwrprb98 = pmradiorecinterferencepwrprb98;
	}
	/**
	 * @return the pmradiorecinterferencepwrprb99
	 */
	public String getPmradiorecinterferencepwrprb99() {
		return pmradiorecinterferencepwrprb99;
	}
	/**
	 * @param pmradiorecinterferencepwrprb99 the pmradiorecinterferencepwrprb99 to set
	 */
	public void setPmradiorecinterferencepwrprb99(
			String pmradiorecinterferencepwrprb99) {
		this.pmradiorecinterferencepwrprb99 = pmradiorecinterferencepwrprb99;
	}
	/**
	 * @return the pmradiotbspwrrestricted
	 */
	public String getPmradiotbspwrrestricted() {
		return pmradiotbspwrrestricted;
	}
	/**
	 * @param pmradiotbspwrrestricted the pmradiotbspwrrestricted to set
	 */
	public void setPmradiotbspwrrestricted(String pmradiotbspwrrestricted) {
		this.pmradiotbspwrrestricted = pmradiotbspwrrestricted;
	}
	/**
	 * @return the pmradiotbspwrunrestricted
	 */
	public String getPmradiotbspwrunrestricted() {
		return pmradiotbspwrunrestricted;
	}
	/**
	 * @param pmradiotbspwrunrestricted the pmradiotbspwrunrestricted to set
	 */
	public void setPmradiotbspwrunrestricted(String pmradiotbspwrunrestricted) {
		this.pmradiotbspwrunrestricted = pmradiotbspwrunrestricted;
	}
	/**
	 * @return the pmradiothpresdl
	 */
	public String getPmradiothpresdl() {
		return pmradiothpresdl;
	}
	/**
	 * @param pmradiothpresdl the pmradiothpresdl to set
	 */
	public void setPmradiothpresdl(String pmradiothpresdl) {
		this.pmradiothpresdl = pmradiothpresdl;
	}
	/**
	 * @return the pmradiothpresdlseltbs
	 */
	public String getPmradiothpresdlseltbs() {
		return pmradiothpresdlseltbs;
	}
	/**
	 * @param pmradiothpresdlseltbs the pmradiothpresdlseltbs to set
	 */
	public void setPmradiothpresdlseltbs(String pmradiothpresdlseltbs) {
		this.pmradiothpresdlseltbs = pmradiothpresdlseltbs;
	}
	/**
	 * @return the pmradiothpresul
	 */
	public String getPmradiothpresul() {
		return pmradiothpresul;
	}
	/**
	 * @param pmradiothpresul the pmradiothpresul to set
	 */
	public void setPmradiothpresul(String pmradiothpresul) {
		this.pmradiothpresul = pmradiothpresul;
	}
	/**
	 * @return the pmradiothpresulseltbs
	 */
	public String getPmradiothpresulseltbs() {
		return pmradiothpresulseltbs;
	}
	/**
	 * @param pmradiothpresulseltbs the pmradiothpresulseltbs to set
	 */
	public void setPmradiothpresulseltbs(String pmradiothpresulseltbs) {
		this.pmradiothpresulseltbs = pmradiothpresulseltbs;
	}
	/**
	 * @return the pmRadioThpVolDl
	 */
	public String getPmRadioThpVolDl() {
		return pmRadioThpVolDl;
	}
	/**
	 * @param pmradiothpvoldl the pmradiothpvoldl to set
	 */
	public void setPmRadioThpVolDl(String pmRadioThpVolDl) {
		this.pmRadioThpVolDl = pmRadioThpVolDl;
	}
	/**
	 * @return the pmradiothpvoldlscell
	 */
	public String getPmradiothpvoldlscell() {
		return pmradiothpvoldlscell;
	}
	/**
	 * @param pmradiothpvoldlscell the pmradiothpvoldlscell to set
	 */
	public void setPmradiothpvoldlscell(String pmradiothpvoldlscell) {
		this.pmradiothpvoldlscell = pmradiothpvoldlscell;
	}
	/**
	 * @return the pmradiothpvoldlscellext
	 */
	public String getPmradiothpvoldlscellext() {
		return pmradiothpvoldlscellext;
	}
	/**
	 * @param pmradiothpvoldlscellext the pmradiothpvoldlscellext to set
	 */
	public void setPmradiothpvoldlscellext(String pmradiothpvoldlscellext) {
		this.pmradiothpvoldlscellext = pmradiothpvoldlscellext;
	}
	/**
	 * @return the pmradiothpvoldlseltbs
	 */
	public String getPmradiothpvoldlseltbs() {
		return pmradiothpvoldlseltbs;
	}
	/**
	 * @param pmradiothpvoldlseltbs the pmradiothpvoldlseltbs to set
	 */
	public void setPmradiothpvoldlseltbs(String pmradiothpvoldlseltbs) {
		this.pmradiothpvoldlseltbs = pmradiothpvoldlseltbs;
	}
	/**
	 * @return the pmradiothpvoltxdlscell
	 */
	public String getPmradiothpvoltxdlscell() {
		return pmradiothpvoltxdlscell;
	}
	/**
	 * @param pmradiothpvoltxdlscell the pmradiothpvoltxdlscell to set
	 */
	public void setPmradiothpvoltxdlscell(String pmradiothpvoltxdlscell) {
		this.pmradiothpvoltxdlscell = pmradiothpvoltxdlscell;
	}
	/**
	 * @return the pmradiothpvoltxdlscellext
	 */
	public String getPmradiothpvoltxdlscellext() {
		return pmradiothpvoltxdlscellext;
	}
	/**
	 * @param pmradiothpvoltxdlscellext the pmradiothpvoltxdlscellext to set
	 */
	public void setPmradiothpvoltxdlscellext(String pmradiothpvoltxdlscellext) {
		this.pmradiothpvoltxdlscellext = pmradiothpvoltxdlscellext;
	}
	/**
	 * @return the pmRadioThpVolUl
	 */
	public String getPmRadioThpVolUl() {
		return pmRadioThpVolUl;
	}
	/**
	 * @param pmradiothpvolul the pmradiothpvolul to set
	 */
	public void setPmRadioThpVolUl(String pmRadioThpVolUl) {
		this.pmRadioThpVolUl = pmRadioThpVolUl;
	}
	/**
	 * @return the pmradiothpvolulscell
	 */
	public String getPmradiothpvolulscell() {
		return pmradiothpvolulscell;
	}
	/**
	 * @param pmradiothpvolulscell the pmradiothpvolulscell to set
	 */
	public void setPmradiothpvolulscell(String pmradiothpvolulscell) {
		this.pmradiothpvolulscell = pmradiothpvolulscell;
	}
	/**
	 * @return the pmradiothpvolulseltbs
	 */
	public String getPmradiothpvolulseltbs() {
		return pmradiothpvolulseltbs;
	}
	/**
	 * @param pmradiothpvolulseltbs the pmradiothpvolulseltbs to set
	 */
	public void setPmradiothpvolulseltbs(String pmradiothpvolulseltbs) {
		this.pmradiothpvolulseltbs = pmradiothpvolulseltbs;
	}
	/**
	 * @return the pmradiouerepcqi2subband0sum
	 */
	public String getPmradiouerepcqi2subband0sum() {
		return pmradiouerepcqi2subband0sum;
	}
	/**
	 * @param pmradiouerepcqi2subband0sum the pmradiouerepcqi2subband0sum to set
	 */
	public void setPmradiouerepcqi2subband0sum(String pmradiouerepcqi2subband0sum) {
		this.pmradiouerepcqi2subband0sum = pmradiouerepcqi2subband0sum;
	}
	/**
	 * @return the pmradiouerepcqi2subband10sum
	 */
	public String getPmradiouerepcqi2subband10sum() {
		return pmradiouerepcqi2subband10sum;
	}
	/**
	 * @param pmradiouerepcqi2subband10sum the pmradiouerepcqi2subband10sum to set
	 */
	public void setPmradiouerepcqi2subband10sum(String pmradiouerepcqi2subband10sum) {
		this.pmradiouerepcqi2subband10sum = pmradiouerepcqi2subband10sum;
	}
	/**
	 * @return the pmradiouerepcqi2subband11sum
	 */
	public String getPmradiouerepcqi2subband11sum() {
		return pmradiouerepcqi2subband11sum;
	}
	/**
	 * @param pmradiouerepcqi2subband11sum the pmradiouerepcqi2subband11sum to set
	 */
	public void setPmradiouerepcqi2subband11sum(String pmradiouerepcqi2subband11sum) {
		this.pmradiouerepcqi2subband11sum = pmradiouerepcqi2subband11sum;
	}
	/**
	 * @return the pmradiouerepcqi2subband12sum
	 */
	public String getPmradiouerepcqi2subband12sum() {
		return pmradiouerepcqi2subband12sum;
	}
	/**
	 * @param pmradiouerepcqi2subband12sum the pmradiouerepcqi2subband12sum to set
	 */
	public void setPmradiouerepcqi2subband12sum(String pmradiouerepcqi2subband12sum) {
		this.pmradiouerepcqi2subband12sum = pmradiouerepcqi2subband12sum;
	}
	/**
	 * @return the pmradiouerepcqi2subband1sum
	 */
	public String getPmradiouerepcqi2subband1sum() {
		return pmradiouerepcqi2subband1sum;
	}
	/**
	 * @param pmradiouerepcqi2subband1sum the pmradiouerepcqi2subband1sum to set
	 */
	public void setPmradiouerepcqi2subband1sum(String pmradiouerepcqi2subband1sum) {
		this.pmradiouerepcqi2subband1sum = pmradiouerepcqi2subband1sum;
	}
	/**
	 * @return the pmradiouerepcqi2subband2sum
	 */
	public String getPmradiouerepcqi2subband2sum() {
		return pmradiouerepcqi2subband2sum;
	}
	/**
	 * @param pmradiouerepcqi2subband2sum the pmradiouerepcqi2subband2sum to set
	 */
	public void setPmradiouerepcqi2subband2sum(String pmradiouerepcqi2subband2sum) {
		this.pmradiouerepcqi2subband2sum = pmradiouerepcqi2subband2sum;
	}
	/**
	 * @return the pmradiouerepcqi2subband3sum
	 */
	public String getPmradiouerepcqi2subband3sum() {
		return pmradiouerepcqi2subband3sum;
	}
	/**
	 * @param pmradiouerepcqi2subband3sum the pmradiouerepcqi2subband3sum to set
	 */
	public void setPmradiouerepcqi2subband3sum(String pmradiouerepcqi2subband3sum) {
		this.pmradiouerepcqi2subband3sum = pmradiouerepcqi2subband3sum;
	}
	/**
	 * @return the pmradiouerepcqi2subband4sum
	 */
	public String getPmradiouerepcqi2subband4sum() {
		return pmradiouerepcqi2subband4sum;
	}
	/**
	 * @param pmradiouerepcqi2subband4sum the pmradiouerepcqi2subband4sum to set
	 */
	public void setPmradiouerepcqi2subband4sum(String pmradiouerepcqi2subband4sum) {
		this.pmradiouerepcqi2subband4sum = pmradiouerepcqi2subband4sum;
	}
	/**
	 * @return the pmradiouerepcqi2subband5sum
	 */
	public String getPmradiouerepcqi2subband5sum() {
		return pmradiouerepcqi2subband5sum;
	}
	/**
	 * @param pmradiouerepcqi2subband5sum the pmradiouerepcqi2subband5sum to set
	 */
	public void setPmradiouerepcqi2subband5sum(String pmradiouerepcqi2subband5sum) {
		this.pmradiouerepcqi2subband5sum = pmradiouerepcqi2subband5sum;
	}
	/**
	 * @return the pmradiouerepcqi2subband6sum
	 */
	public String getPmradiouerepcqi2subband6sum() {
		return pmradiouerepcqi2subband6sum;
	}
	/**
	 * @param pmradiouerepcqi2subband6sum the pmradiouerepcqi2subband6sum to set
	 */
	public void setPmradiouerepcqi2subband6sum(String pmradiouerepcqi2subband6sum) {
		this.pmradiouerepcqi2subband6sum = pmradiouerepcqi2subband6sum;
	}
	/**
	 * @return the pmradiouerepcqi2subband7sum
	 */
	public String getPmradiouerepcqi2subband7sum() {
		return pmradiouerepcqi2subband7sum;
	}
	/**
	 * @param pmradiouerepcqi2subband7sum the pmradiouerepcqi2subband7sum to set
	 */
	public void setPmradiouerepcqi2subband7sum(String pmradiouerepcqi2subband7sum) {
		this.pmradiouerepcqi2subband7sum = pmradiouerepcqi2subband7sum;
	}
	/**
	 * @return the pmradiouerepcqi2subband8sum
	 */
	public String getPmradiouerepcqi2subband8sum() {
		return pmradiouerepcqi2subband8sum;
	}
	/**
	 * @param pmradiouerepcqi2subband8sum the pmradiouerepcqi2subband8sum to set
	 */
	public void setPmradiouerepcqi2subband8sum(String pmradiouerepcqi2subband8sum) {
		this.pmradiouerepcqi2subband8sum = pmradiouerepcqi2subband8sum;
	}
	/**
	 * @return the pmradiouerepcqi2subband9sum
	 */
	public String getPmradiouerepcqi2subband9sum() {
		return pmradiouerepcqi2subband9sum;
	}
	/**
	 * @param pmradiouerepcqi2subband9sum the pmradiouerepcqi2subband9sum to set
	 */
	public void setPmradiouerepcqi2subband9sum(String pmradiouerepcqi2subband9sum) {
		this.pmradiouerepcqi2subband9sum = pmradiouerepcqi2subband9sum;
	}
	/**
	 * @return the pmradiouerepcqi2subbandsamp
	 */
	public String getPmradiouerepcqi2subbandsamp() {
		return pmradiouerepcqi2subbandsamp;
	}
	/**
	 * @param pmradiouerepcqi2subbandsamp the pmradiouerepcqi2subbandsamp to set
	 */
	public void setPmradiouerepcqi2subbandsamp(String pmradiouerepcqi2subbandsamp) {
		this.pmradiouerepcqi2subbandsamp = pmradiouerepcqi2subbandsamp;
	}
	/**
	 * @return the pmradiouerepcqisubband0sum
	 */
	public String getPmradiouerepcqisubband0sum() {
		return pmradiouerepcqisubband0sum;
	}
	/**
	 * @param pmradiouerepcqisubband0sum the pmradiouerepcqisubband0sum to set
	 */
	public void setPmradiouerepcqisubband0sum(String pmradiouerepcqisubband0sum) {
		this.pmradiouerepcqisubband0sum = pmradiouerepcqisubband0sum;
	}
	/**
	 * @return the pmradiouerepcqisubband10sum
	 */
	public String getPmradiouerepcqisubband10sum() {
		return pmradiouerepcqisubband10sum;
	}
	/**
	 * @param pmradiouerepcqisubband10sum the pmradiouerepcqisubband10sum to set
	 */
	public void setPmradiouerepcqisubband10sum(String pmradiouerepcqisubband10sum) {
		this.pmradiouerepcqisubband10sum = pmradiouerepcqisubband10sum;
	}
	/**
	 * @return the pmradiouerepcqisubband11sum
	 */
	public String getPmradiouerepcqisubband11sum() {
		return pmradiouerepcqisubband11sum;
	}
	/**
	 * @param pmradiouerepcqisubband11sum the pmradiouerepcqisubband11sum to set
	 */
	public void setPmradiouerepcqisubband11sum(String pmradiouerepcqisubband11sum) {
		this.pmradiouerepcqisubband11sum = pmradiouerepcqisubband11sum;
	}
	/**
	 * @return the pmradiouerepcqisubband12sum
	 */
	public String getPmradiouerepcqisubband12sum() {
		return pmradiouerepcqisubband12sum;
	}
	/**
	 * @param pmradiouerepcqisubband12sum the pmradiouerepcqisubband12sum to set
	 */
	public void setPmradiouerepcqisubband12sum(String pmradiouerepcqisubband12sum) {
		this.pmradiouerepcqisubband12sum = pmradiouerepcqisubband12sum;
	}
	/**
	 * @return the pmradiouerepcqisubband1sum
	 */
	public String getPmradiouerepcqisubband1sum() {
		return pmradiouerepcqisubband1sum;
	}
	/**
	 * @param pmradiouerepcqisubband1sum the pmradiouerepcqisubband1sum to set
	 */
	public void setPmradiouerepcqisubband1sum(String pmradiouerepcqisubband1sum) {
		this.pmradiouerepcqisubband1sum = pmradiouerepcqisubband1sum;
	}
	/**
	 * @return the pmradiouerepcqisubband2sum
	 */
	public String getPmradiouerepcqisubband2sum() {
		return pmradiouerepcqisubband2sum;
	}
	/**
	 * @param pmradiouerepcqisubband2sum the pmradiouerepcqisubband2sum to set
	 */
	public void setPmradiouerepcqisubband2sum(String pmradiouerepcqisubband2sum) {
		this.pmradiouerepcqisubband2sum = pmradiouerepcqisubband2sum;
	}
	/**
	 * @return the pmradiouerepcqisubband3sum
	 */
	public String getPmradiouerepcqisubband3sum() {
		return pmradiouerepcqisubband3sum;
	}
	/**
	 * @param pmradiouerepcqisubband3sum the pmradiouerepcqisubband3sum to set
	 */
	public void setPmradiouerepcqisubband3sum(String pmradiouerepcqisubband3sum) {
		this.pmradiouerepcqisubband3sum = pmradiouerepcqisubband3sum;
	}
	/**
	 * @return the pmradiouerepcqisubband4sum
	 */
	public String getPmradiouerepcqisubband4sum() {
		return pmradiouerepcqisubband4sum;
	}
	/**
	 * @param pmradiouerepcqisubband4sum the pmradiouerepcqisubband4sum to set
	 */
	public void setPmradiouerepcqisubband4sum(String pmradiouerepcqisubband4sum) {
		this.pmradiouerepcqisubband4sum = pmradiouerepcqisubband4sum;
	}
	/**
	 * @return the pmradiouerepcqisubband5sum
	 */
	public String getPmradiouerepcqisubband5sum() {
		return pmradiouerepcqisubband5sum;
	}
	/**
	 * @param pmradiouerepcqisubband5sum the pmradiouerepcqisubband5sum to set
	 */
	public void setPmradiouerepcqisubband5sum(String pmradiouerepcqisubband5sum) {
		this.pmradiouerepcqisubband5sum = pmradiouerepcqisubband5sum;
	}
	/**
	 * @return the pmradiouerepcqisubband6sum
	 */
	public String getPmradiouerepcqisubband6sum() {
		return pmradiouerepcqisubband6sum;
	}
	/**
	 * @param pmradiouerepcqisubband6sum the pmradiouerepcqisubband6sum to set
	 */
	public void setPmradiouerepcqisubband6sum(String pmradiouerepcqisubband6sum) {
		this.pmradiouerepcqisubband6sum = pmradiouerepcqisubband6sum;
	}
	/**
	 * @return the pmradiouerepcqisubband7sum
	 */
	public String getPmradiouerepcqisubband7sum() {
		return pmradiouerepcqisubband7sum;
	}
	/**
	 * @param pmradiouerepcqisubband7sum the pmradiouerepcqisubband7sum to set
	 */
	public void setPmradiouerepcqisubband7sum(String pmradiouerepcqisubband7sum) {
		this.pmradiouerepcqisubband7sum = pmradiouerepcqisubband7sum;
	}
	/**
	 * @return the pmradiouerepcqisubband8sum
	 */
	public String getPmradiouerepcqisubband8sum() {
		return pmradiouerepcqisubband8sum;
	}
	/**
	 * @param pmradiouerepcqisubband8sum the pmradiouerepcqisubband8sum to set
	 */
	public void setPmradiouerepcqisubband8sum(String pmradiouerepcqisubband8sum) {
		this.pmradiouerepcqisubband8sum = pmradiouerepcqisubband8sum;
	}
	/**
	 * @return the pmradiouerepcqisubband9sum
	 */
	public String getPmradiouerepcqisubband9sum() {
		return pmradiouerepcqisubband9sum;
	}
	/**
	 * @param pmradiouerepcqisubband9sum the pmradiouerepcqisubband9sum to set
	 */
	public void setPmradiouerepcqisubband9sum(String pmradiouerepcqisubband9sum) {
		this.pmradiouerepcqisubband9sum = pmradiouerepcqisubband9sum;
	}
	/**
	 * @return the pmradiouerepcqisubbandsamp
	 */
	public String getPmradiouerepcqisubbandsamp() {
		return pmradiouerepcqisubbandsamp;
	}
	/**
	 * @param pmradiouerepcqisubbandsamp the pmradiouerepcqisubbandsamp to set
	 */
	public void setPmradiouerepcqisubbandsamp(String pmradiouerepcqisubbandsamp) {
		this.pmradiouerepcqisubbandsamp = pmradiouerepcqisubbandsamp;
	}
	/**
	 * @return the pmrafailcbramsg1discooc
	 */
	public String getPmrafailcbramsg1discooc() {
		return pmrafailcbramsg1discooc;
	}
	/**
	 * @param pmrafailcbramsg1discooc the pmrafailcbramsg1discooc to set
	 */
	public void setPmrafailcbramsg1discooc(String pmrafailcbramsg1discooc) {
		this.pmrafailcbramsg1discooc = pmrafailcbramsg1discooc;
	}
	/**
	 * @return the pmrafailcbramsg1discsched
	 */
	public String getPmrafailcbramsg1discsched() {
		return pmrafailcbramsg1discsched;
	}
	/**
	 * @param pmrafailcbramsg1discsched the pmrafailcbramsg1discsched to set
	 */
	public void setPmrafailcbramsg1discsched(String pmrafailcbramsg1discsched) {
		this.pmrafailcbramsg1discsched = pmrafailcbramsg1discsched;
	}
	/**
	 * @return the pmrafailcbramsg2disc
	 */
	public String getPmrafailcbramsg2disc() {
		return pmrafailcbramsg2disc;
	}
	/**
	 * @param pmrafailcbramsg2disc the pmrafailcbramsg2disc to set
	 */
	public void setPmrafailcbramsg2disc(String pmrafailcbramsg2disc) {
		this.pmrafailcbramsg2disc = pmrafailcbramsg2disc;
	}
	/**
	 * @return the pmrafailcframsg1discooc
	 */
	public String getPmrafailcframsg1discooc() {
		return pmrafailcframsg1discooc;
	}
	/**
	 * @param pmrafailcframsg1discooc the pmrafailcframsg1discooc to set
	 */
	public void setPmrafailcframsg1discooc(String pmrafailcframsg1discooc) {
		this.pmrafailcframsg1discooc = pmrafailcframsg1discooc;
	}
	/**
	 * @return the pmrafailcframsg1discsched
	 */
	public String getPmrafailcframsg1discsched() {
		return pmrafailcframsg1discsched;
	}
	/**
	 * @param pmrafailcframsg1discsched the pmrafailcframsg1discsched to set
	 */
	public void setPmrafailcframsg1discsched(String pmrafailcframsg1discsched) {
		this.pmrafailcframsg1discsched = pmrafailcframsg1discsched;
	}
	/**
	 * @return the pmrafailcframsg2disc
	 */
	public String getPmrafailcframsg2disc() {
		return pmrafailcframsg2disc;
	}
	/**
	 * @param pmrafailcframsg2disc the pmrafailcframsg2disc to set
	 */
	public void setPmrafailcframsg2disc(String pmrafailcframsg2disc) {
		this.pmrafailcframsg2disc = pmrafailcframsg2disc;
	}
	/**
	 * @return the pmramsg2attcbra
	 */
	public String getPmramsg2attcbra() {
		return pmramsg2attcbra;
	}
	/**
	 * @param pmramsg2attcbra the pmramsg2attcbra to set
	 */
	public void setPmramsg2attcbra(String pmramsg2attcbra) {
		this.pmramsg2attcbra = pmramsg2attcbra;
	}
	/**
	 * @return the pmrarejharqfailaftercontres
	 */
	public String getPmrarejharqfailaftercontres() {
		return pmrarejharqfailaftercontres;
	}
	/**
	 * @param pmrarejharqfailaftercontres the pmrarejharqfailaftercontres to set
	 */
	public void setPmrarejharqfailaftercontres(String pmrarejharqfailaftercontres) {
		this.pmrarejharqfailaftercontres = pmrarejharqfailaftercontres;
	}
	/**
	 * @return the pmrarejharqfailwithincontres
	 */
	public String getPmrarejharqfailwithincontres() {
		return pmrarejharqfailwithincontres;
	}
	/**
	 * @param pmrarejharqfailwithincontres the pmrarejharqfailwithincontres to set
	 */
	public void setPmrarejharqfailwithincontres(String pmrarejharqfailwithincontres) {
		this.pmrarejharqfailwithincontres = pmrarejharqfailwithincontres;
	}
	/**
	 * @return the pmrasucccbra
	 */
	public String getPmrasucccbra() {
		return pmrasucccbra;
	}
	/**
	 * @param pmrasucccbra the pmrasucccbra to set
	 */
	public void setPmrasucccbra(String pmrasucccbra) {
		this.pmrasucccbra = pmrasucccbra;
	}
	/**
	 * @return the pmrasucccfra
	 */
	public String getPmrasucccfra() {
		return pmrasucccfra;
	}
	/**
	 * @param pmrasucccfra the pmrasucccfra to set
	 */
	public void setPmrasucccfra(String pmrasucccfra) {
		this.pmrasucccfra = pmrasucccfra;
	}
	/**
	 * @return the pmrasuccsrinsync
	 */
	public String getPmrasuccsrinsync() {
		return pmrasuccsrinsync;
	}
	/**
	 * @param pmrasuccsrinsync the pmrasuccsrinsync to set
	 */
	public void setPmrasuccsrinsync(String pmrasuccsrinsync) {
		this.pmrasuccsrinsync = pmrasuccsrinsync;
	}
	/**
	 * @return the pmrasuccsroutofsync
	 */
	public String getPmrasuccsroutofsync() {
		return pmrasuccsroutofsync;
	}
	/**
	 * @param pmrasuccsroutofsync the pmrasuccsroutofsync to set
	 */
	public void setPmrasuccsroutofsync(String pmrasuccsroutofsync) {
		this.pmrasuccsroutofsync = pmrasuccsroutofsync;
	}
	/**
	 * @return the pmrasuccsroutofsyncpft
	 */
	public String getPmrasuccsroutofsyncpft() {
		return pmrasuccsroutofsyncpft;
	}
	/**
	 * @param pmrasuccsroutofsyncpft the pmrasuccsroutofsyncpft to set
	 */
	public void setPmrasuccsroutofsyncpft(String pmrasuccsroutofsyncpft) {
		this.pmrasuccsroutofsyncpft = pmrasuccsroutofsyncpft;
	}
	/**
	 * @return the pmrateshapetimeul
	 */
	public String getPmrateshapetimeul() {
		return pmrateshapetimeul;
	}
	/**
	 * @param pmrateshapetimeul the pmrateshapetimeul to set
	 */
	public void setPmrateshapetimeul(String pmrateshapetimeul) {
		this.pmrateshapetimeul = pmrateshapetimeul;
	}
	/**
	 * @return the pmraunassignedcfrafalse
	 */
	public String getPmraunassignedcfrafalse() {
		return pmraunassignedcfrafalse;
	}
	/**
	 * @param pmraunassignedcfrafalse the pmraunassignedcfrafalse to set
	 */
	public void setPmraunassignedcfrafalse(String pmraunassignedcfrafalse) {
		this.pmraunassignedcfrafalse = pmraunassignedcfrafalse;
	}
	/**
	 * @return the pmraunassignedcfrasum
	 */
	public String getPmraunassignedcfrasum() {
		return pmraunassignedcfrasum;
	}
	/**
	 * @param pmraunassignedcfrasum the pmraunassignedcfrasum to set
	 */
	public void setPmraunassignedcfrasum(String pmraunassignedcfrasum) {
		this.pmraunassignedcfrasum = pmraunassignedcfrasum;
	}
	/**
	 * @return the pmrlcarqdlack
	 */
	public String getPmrlcarqdlack() {
		return pmrlcarqdlack;
	}
	/**
	 * @param pmrlcarqdlack the pmrlcarqdlack to set
	 */
	public void setPmrlcarqdlack(String pmrlcarqdlack) {
		this.pmrlcarqdlack = pmrlcarqdlack;
	}
	/**
	 * @return the pmrlcarqdlnack
	 */
	public String getPmrlcarqdlnack() {
		return pmrlcarqdlnack;
	}
	/**
	 * @param pmrlcarqdlnack the pmrlcarqdlnack to set
	 */
	public void setPmrlcarqdlnack(String pmrlcarqdlnack) {
		this.pmrlcarqdlnack = pmrlcarqdlnack;
	}
	/**
	 * @return the pmrlcarqulack
	 */
	public String getPmrlcarqulack() {
		return pmrlcarqulack;
	}
	/**
	 * @param pmrlcarqulack the pmrlcarqulack to set
	 */
	public void setPmrlcarqulack(String pmrlcarqulack) {
		this.pmrlcarqulack = pmrlcarqulack;
	}
	/**
	 * @return the pmrlcarqulnack
	 */
	public String getPmrlcarqulnack() {
		return pmrlcarqulnack;
	}
	/**
	 * @param pmrlcarqulnack the pmrlcarqulnack to set
	 */
	public void setPmrlcarqulnack(String pmrlcarqulnack) {
		this.pmrlcarqulnack = pmrlcarqulnack;
	}
	/**
	 * @return the pmrlcarqvoldlretrans
	 */
	public String getPmrlcarqvoldlretrans() {
		return pmrlcarqvoldlretrans;
	}
	/**
	 * @param pmrlcarqvoldlretrans the pmrlcarqvoldlretrans to set
	 */
	public void setPmrlcarqvoldlretrans(String pmrlcarqvoldlretrans) {
		this.pmrlcarqvoldlretrans = pmrlcarqvoldlretrans;
	}
	/**
	 * @return the pmrlcarqvolulnack
	 */
	public String getPmrlcarqvolulnack() {
		return pmrlcarqvolulnack;
	}
	/**
	 * @param pmrlcarqvolulnack the pmrlcarqvolulnack to set
	 */
	public void setPmrlcarqvolulnack(String pmrlcarqvolulnack) {
		this.pmrlcarqvolulnack = pmrlcarqvolulnack;
	}
	/**
	 * @return the pmrlcarqvolulreceived
	 */
	public String getPmrlcarqvolulreceived() {
		return pmrlcarqvolulreceived;
	}
	/**
	 * @param pmrlcarqvolulreceived the pmrlcarqvolulreceived to set
	 */
	public void setPmrlcarqvolulreceived(String pmrlcarqvolulreceived) {
		this.pmrlcarqvolulreceived = pmrlcarqvolulreceived;
	}
	/**
	 * @return the pmrlcdelaypkttransdl
	 */
	public String getPmrlcdelaypkttransdl() {
		return pmrlcdelaypkttransdl;
	}
	/**
	 * @param pmrlcdelaypkttransdl the pmrlcdelaypkttransdl to set
	 */
	public void setPmrlcdelaypkttransdl(String pmrlcdelaypkttransdl) {
		this.pmrlcdelaypkttransdl = pmrlcdelaypkttransdl;
	}
	/**
	 * @return the pmrlcdelaytimedl
	 */
	public String getPmrlcdelaytimedl() {
		return pmrlcdelaytimedl;
	}
	/**
	 * @param pmrlcdelaytimedl the pmrlcdelaytimedl to set
	 */
	public void setPmrlcdelaytimedl(String pmrlcdelaytimedl) {
		this.pmrlcdelaytimedl = pmrlcdelaytimedl;
	}
	/**
	 * @return the pmrlcpollretxdl
	 */
	public String getPmrlcpollretxdl() {
		return pmrlcpollretxdl;
	}
	/**
	 * @param pmrlcpollretxdl the pmrlcpollretxdl to set
	 */
	public void setPmrlcpollretxdl(String pmrlcpollretxdl) {
		this.pmrlcpollretxdl = pmrlcpollretxdl;
	}
	/**
	 * @return the pmrlcpollretxul
	 */
	public String getPmrlcpollretxul() {
		return pmrlcpollretxul;
	}
	/**
	 * @param pmrlcpollretxul the pmrlcpollretxul to set
	 */
	public void setPmrlcpollretxul(String pmrlcpollretxul) {
		this.pmrlcpollretxul = pmrlcpollretxul;
	}
	/**
	 * @return the pmrlcvoldl
	 */
	public String getPmrlcvoldl() {
		return pmrlcvoldl;
	}
	/**
	 * @param pmrlcvoldl the pmrlcvoldl to set
	 */
	public void setPmrlcvoldl(String pmrlcvoldl) {
		this.pmrlcvoldl = pmrlcvoldl;
	}
	/**
	 * @return the pmrlcvolul
	 */
	public String getPmrlcvolul() {
		return pmrlcvolul;
	}
	/**
	 * @param pmrlcvolul the pmrlcvolul to set
	 */
	public void setPmrlcvolul(String pmrlcvolul) {
		this.pmrlcvolul = pmrlcvolul;
	}
	/**
	 * @return the pmrohcestabfailcid
	 */
	public String getPmrohcestabfailcid() {
		return pmrohcestabfailcid;
	}
	/**
	 * @param pmrohcestabfailcid the pmrohcestabfailcid to set
	 */
	public void setPmrohcestabfailcid(String pmrohcestabfailcid) {
		this.pmrohcestabfailcid = pmrohcestabfailcid;
	}
	/**
	 * @return the pmrohcestabfaillic
	 */
	public String getPmrohcestabfaillic() {
		return pmrohcestabfaillic;
	}
	/**
	 * @param pmrohcestabfaillic the pmrohcestabfaillic to set
	 */
	public void setPmrohcestabfaillic(String pmrohcestabfaillic) {
		this.pmrohcestabfaillic = pmrohcestabfaillic;
	}
	/**
	 * @return the pmrohcestabfailuecap
	 */
	public String getPmrohcestabfailuecap() {
		return pmrohcestabfailuecap;
	}
	/**
	 * @param pmrohcestabfailuecap the pmrohcestabfailuecap to set
	 */
	public void setPmrohcestabfailuecap(String pmrohcestabfailuecap) {
		this.pmrohcestabfailuecap = pmrohcestabfailuecap;
	}
	/**
	 * @return the pmRrcConnEstabAtt
	 */
	public String getPmRrcConnEstabAtt() {
		return pmRrcConnEstabAtt;
	}
	/**
	 * @param pmrrcconnestabatt the pmrrcconnestabatt to set
	 */
	public void setPmRrcConnEstabAtt(String pmRrcConnEstabAtt) {
		this.pmRrcConnEstabAtt = pmRrcConnEstabAtt;
	}
	/**
	 * @return the pmrrcconnestabattdta
	 */
	public String getPmrrcconnestabattdta() {
		return pmrrcconnestabattdta;
	}
	/**
	 * @param pmrrcconnestabattdta the pmrrcconnestabattdta to set
	 */
	public void setPmrrcconnestabattdta(String pmrrcconnestabattdta) {
		this.pmrrcconnestabattdta = pmrrcconnestabattdta;
	}
	/**
	 * @return the pmrrcconnestabattem
	 */
	public String getPmrrcconnestabattem() {
		return pmrrcconnestabattem;
	}
	/**
	 * @param pmrrcconnestabattem the pmrrcconnestabattem to set
	 */
	public void setPmrrcconnestabattem(String pmrrcconnestabattem) {
		this.pmrrcconnestabattem = pmrrcconnestabattem;
	}
	/**
	 * @return the pmrrcconnestabatthpa
	 */
	public String getPmrrcconnestabatthpa() {
		return pmrrcconnestabatthpa;
	}
	/**
	 * @param pmrrcconnestabatthpa the pmrrcconnestabatthpa to set
	 */
	public void setPmrrcconnestabatthpa(String pmrrcconnestabatthpa) {
		this.pmrrcconnestabatthpa = pmrrcconnestabatthpa;
	}
	/**
	 * @return the pmrrcconnestabattmod
	 */
	public String getPmrrcconnestabattmod() {
		return pmrrcconnestabattmod;
	}
	/**
	 * @param pmrrcconnestabattmod the pmrrcconnestabattmod to set
	 */
	public void setPmrrcconnestabattmod(String pmrrcconnestabattmod) {
		this.pmrrcconnestabattmod = pmrrcconnestabattmod;
	}
	/**
	 * @return the pmrrcconnestabattmos
	 */
	public String getPmrrcconnestabattmos() {
		return pmrrcconnestabattmos;
	}
	/**
	 * @param pmrrcconnestabattmos the pmrrcconnestabattmos to set
	 */
	public void setPmrrcconnestabattmos(String pmrrcconnestabattmos) {
		this.pmrrcconnestabattmos = pmrrcconnestabattmos;
	}
	/**
	 * @return the pmrrcconnestabattmta
	 */
	public String getPmrrcconnestabattmta() {
		return pmrrcconnestabattmta;
	}
	/**
	 * @param pmrrcconnestabattmta the pmrrcconnestabattmta to set
	 */
	public void setPmrrcconnestabattmta(String pmrrcconnestabattmta) {
		this.pmrrcconnestabattmta = pmrrcconnestabattmta;
	}
	/**
	 * @return the pmRrcConnEstabAttReatt
	 */
	public String getPmRrcConnEstabAttReatt() {
		return pmRrcConnEstabAttReatt;
	}
	/**
	 * @param pmrrcconnestabattreatt the pmrrcconnestabattreatt to set
	 */
	public void setPmRrcConnEstabAttReatt(String pmRrcConnEstabAttReatt) {
		this.pmRrcConnEstabAttReatt = pmRrcConnEstabAttReatt;
	}
	/**
	 * @return the pmrrcconnestabattreattdta
	 */
	public String getPmrrcconnestabattreattdta() {
		return pmrrcconnestabattreattdta;
	}
	/**
	 * @param pmrrcconnestabattreattdta the pmrrcconnestabattreattdta to set
	 */
	public void setPmrrcconnestabattreattdta(String pmrrcconnestabattreattdta) {
		this.pmrrcconnestabattreattdta = pmrrcconnestabattreattdta;
	}
	/**
	 * @return the pmrrcconnestabattreattem
	 */
	public String getPmrrcconnestabattreattem() {
		return pmrrcconnestabattreattem;
	}
	/**
	 * @param pmrrcconnestabattreattem the pmrrcconnestabattreattem to set
	 */
	public void setPmrrcconnestabattreattem(String pmrrcconnestabattreattem) {
		this.pmrrcconnestabattreattem = pmrrcconnestabattreattem;
	}
	/**
	 * @return the pmrrcconnestabattreatthpa
	 */
	public String getPmrrcconnestabattreatthpa() {
		return pmrrcconnestabattreatthpa;
	}
	/**
	 * @param pmrrcconnestabattreatthpa the pmrrcconnestabattreatthpa to set
	 */
	public void setPmrrcconnestabattreatthpa(String pmrrcconnestabattreatthpa) {
		this.pmrrcconnestabattreatthpa = pmrrcconnestabattreatthpa;
	}
	/**
	 * @return the pmrrcconnestabattreattmod
	 */
	public String getPmrrcconnestabattreattmod() {
		return pmrrcconnestabattreattmod;
	}
	/**
	 * @param pmrrcconnestabattreattmod the pmrrcconnestabattreattmod to set
	 */
	public void setPmrrcconnestabattreattmod(String pmrrcconnestabattreattmod) {
		this.pmrrcconnestabattreattmod = pmrrcconnestabattreattmod;
	}
	/**
	 * @return the pmrrcconnestabattreattmos
	 */
	public String getPmrrcconnestabattreattmos() {
		return pmrrcconnestabattreattmos;
	}
	/**
	 * @param pmrrcconnestabattreattmos the pmrrcconnestabattreattmos to set
	 */
	public void setPmrrcconnestabattreattmos(String pmrrcconnestabattreattmos) {
		this.pmrrcconnestabattreattmos = pmrrcconnestabattreattmos;
	}
	/**
	 * @return the pmrrcconnestabattreattmta
	 */
	public String getPmrrcconnestabattreattmta() {
		return pmrrcconnestabattreattmta;
	}
	/**
	 * @param pmrrcconnestabattreattmta the pmrrcconnestabattreattmta to set
	 */
	public void setPmrrcconnestabattreattmta(String pmrrcconnestabattreattmta) {
		this.pmrrcconnestabattreattmta = pmrrcconnestabattreattmta;
	}
	/**
	 * @return the pmrrcconnestabfailbeareradmissionrej
	 */
	public String getPmrrcconnestabfailbeareradmissionrej() {
		return pmrrcconnestabfailbeareradmissionrej;
	}
	/**
	 * @param pmrrcconnestabfailbeareradmissionrej the pmrrcconnestabfailbeareradmissionrej to set
	 */
	public void setPmrrcconnestabfailbeareradmissionrej(
			String pmrrcconnestabfailbeareradmissionrej) {
		this.pmrrcconnestabfailbeareradmissionrej = pmrrcconnestabfailbeareradmissionrej;
	}
	/**
	 * @return the pmrrcconnestabfailcellintensdlc
	 */
	public String getPmrrcconnestabfailcellintensdlc() {
		return pmrrcconnestabfailcellintensdlc;
	}
	/**
	 * @param pmrrcconnestabfailcellintensdlc the pmrrcconnestabfailcellintensdlc to set
	 */
	public void setPmrrcconnestabfailcellintensdlc(
			String pmrrcconnestabfailcellintensdlc) {
		this.pmrrcconnestabfailcellintensdlc = pmrrcconnestabfailcellintensdlc;
	}
	/**
	 * @return the pmrrcconnestabfailcellintensstat
	 */
	public String getPmrrcconnestabfailcellintensstat() {
		return pmrrcconnestabfailcellintensstat;
	}
	/**
	 * @param pmrrcconnestabfailcellintensstat the pmrrcconnestabfailcellintensstat to set
	 */
	public void setPmrrcconnestabfailcellintensstat(
			String pmrrcconnestabfailcellintensstat) {
		this.pmrrcconnestabfailcellintensstat = pmrrcconnestabfailcellintensstat;
	}
	/**
	 * @return the pmrrcconnestabfailcellintensswc
	 */
	public String getPmrrcconnestabfailcellintensswc() {
		return pmrrcconnestabfailcellintensswc;
	}
	/**
	 * @param pmrrcconnestabfailcellintensswc the pmrrcconnestabfailcellintensswc to set
	 */
	public void setPmrrcconnestabfailcellintensswc(
			String pmrrcconnestabfailcellintensswc) {
		this.pmrrcconnestabfailcellintensswc = pmrrcconnestabfailcellintensswc;
	}
	/**
	 * @return the pmrrcconnestabfailcelllatency
	 */
	public String getPmrrcconnestabfailcelllatency() {
		return pmrrcconnestabfailcelllatency;
	}
	/**
	 * @param pmrrcconnestabfailcelllatency the pmrrcconnestabfailcelllatency to set
	 */
	public void setPmrrcconnestabfailcelllatency(
			String pmrrcconnestabfailcelllatency) {
		this.pmrrcconnestabfailcelllatency = pmrrcconnestabfailcelllatency;
	}
	/**
	 * @return the pmrrcconnestabfailduintens
	 */
	public String getPmrrcconnestabfailduintens() {
		return pmrrcconnestabfailduintens;
	}
	/**
	 * @param pmrrcconnestabfailduintens the pmrrcconnestabfailduintens to set
	 */
	public void setPmrrcconnestabfailduintens(String pmrrcconnestabfailduintens) {
		this.pmrrcconnestabfailduintens = pmrrcconnestabfailduintens;
	}
	/**
	 * @return the pmrrcconnestabfailduswc
	 */
	public String getPmrrcconnestabfailduswc() {
		return pmrrcconnestabfailduswc;
	}
	/**
	 * @param pmrrcconnestabfailduswc the pmrrcconnestabfailduswc to set
	 */
	public void setPmrrcconnestabfailduswc(String pmrrcconnestabfailduswc) {
		this.pmrrcconnestabfailduswc = pmrrcconnestabfailduswc;
	}
	/**
	 * @return the pmrrcconnestabfaildynueadmctrl
	 */
	public String getPmrrcconnestabfaildynueadmctrl() {
		return pmrrcconnestabfaildynueadmctrl;
	}
	/**
	 * @param pmrrcconnestabfaildynueadmctrl the pmrrcconnestabfaildynueadmctrl to set
	 */
	public void setPmrrcconnestabfaildynueadmctrl(
			String pmrrcconnestabfaildynueadmctrl) {
		this.pmrrcconnestabfaildynueadmctrl = pmrrcconnestabfaildynueadmctrl;
	}
	/**
	 * @return the pmrrcconnestabfailhighload
	 */
	public String getPmrrcconnestabfailhighload() {
		return pmrrcconnestabfailhighload;
	}
	/**
	 * @param pmrrcconnestabfailhighload the pmrrcconnestabfailhighload to set
	 */
	public void setPmrrcconnestabfailhighload(String pmrrcconnestabfailhighload) {
		this.pmrrcconnestabfailhighload = pmrrcconnestabfailhighload;
	}
	/**
	 * @return the pmrrcconnestabfailhighloadlong
	 */
	public String getPmrrcconnestabfailhighloadlong() {
		return pmrrcconnestabfailhighloadlong;
	}
	/**
	 * @param pmrrcconnestabfailhighloadlong the pmrrcconnestabfailhighloadlong to set
	 */
	public void setPmrrcconnestabfailhighloadlong(
			String pmrrcconnestabfailhighloadlong) {
		this.pmrrcconnestabfailhighloadlong = pmrrcconnestabfailhighloadlong;
	}
	/**
	 * @return the pmrrcconnestabfaillic
	 */
	public String getPmrrcconnestabfaillic() {
		return pmrrcconnestabfaillic;
	}
	/**
	 * @param pmrrcconnestabfaillic the pmrrcconnestabfaillic to set
	 */
	public void setPmrrcconnestabfaillic(String pmrrcconnestabfaillic) {
		this.pmrrcconnestabfaillic = pmrrcconnestabfaillic;
	}
	/**
	 * @return the pmrrcconnestabfaillicactiveusers
	 */
	public String getPmrrcconnestabfaillicactiveusers() {
		return pmrrcconnestabfaillicactiveusers;
	}
	/**
	 * @param pmrrcconnestabfaillicactiveusers the pmrrcconnestabfaillicactiveusers to set
	 */
	public void setPmrrcconnestabfaillicactiveusers(
			String pmrrcconnestabfaillicactiveusers) {
		this.pmrrcconnestabfaillicactiveusers = pmrrcconnestabfaillicactiveusers;
	}
	/**
	 * @return the pmrrcconnestabfaillowcovueadmctrl
	 */
	public String getPmrrcconnestabfaillowcovueadmctrl() {
		return pmrrcconnestabfaillowcovueadmctrl;
	}
	/**
	 * @param pmrrcconnestabfaillowcovueadmctrl the pmrrcconnestabfaillowcovueadmctrl to set
	 */
	public void setPmrrcconnestabfaillowcovueadmctrl(
			String pmrrcconnestabfaillowcovueadmctrl) {
		this.pmrrcconnestabfaillowcovueadmctrl = pmrrcconnestabfaillowcovueadmctrl;
	}
	/**
	 * @return the pmrrcconnestabfaillowcovuelic
	 */
	public String getPmrrcconnestabfaillowcovuelic() {
		return pmrrcconnestabfaillowcovuelic;
	}
	/**
	 * @param pmrrcconnestabfaillowcovuelic the pmrrcconnestabfaillowcovuelic to set
	 */
	public void setPmrrcconnestabfaillowcovuelic(
			String pmrrcconnestabfaillowcovuelic) {
		this.pmrrcconnestabfaillowcovuelic = pmrrcconnestabfaillowcovuelic;
	}
	/**
	 * @return the pmrrcconnestabfailmisigqcong
	 */
	public String getPmrrcconnestabfailmisigqcong() {
		return pmrrcconnestabfailmisigqcong;
	}
	/**
	 * @param pmrrcconnestabfailmisigqcong the pmrrcconnestabfailmisigqcong to set
	 */
	public void setPmrrcconnestabfailmisigqcong(String pmrrcconnestabfailmisigqcong) {
		this.pmrrcconnestabfailmisigqcong = pmrrcconnestabfailmisigqcong;
	}
	/**
	 * @return the pmrrcconnestabfailmmeovlmod
	 */
	public String getPmrrcconnestabfailmmeovlmod() {
		return pmrrcconnestabfailmmeovlmod;
	}
	/**
	 * @param pmrrcconnestabfailmmeovlmod the pmrrcconnestabfailmmeovlmod to set
	 */
	public void setPmrrcconnestabfailmmeovlmod(String pmrrcconnestabfailmmeovlmod) {
		this.pmrrcconnestabfailmmeovlmod = pmrrcconnestabfailmmeovlmod;
	}
	/**
	 * @return the pmrrcconnestabfailmmeovlmos
	 */
	public String getPmrrcconnestabfailmmeovlmos() {
		return pmrrcconnestabfailmmeovlmos;
	}
	/**
	 * @param pmrrcconnestabfailmmeovlmos the pmrrcconnestabfailmmeovlmos to set
	 */
	public void setPmrrcconnestabfailmmeovlmos(String pmrrcconnestabfailmmeovlmos) {
		this.pmrrcconnestabfailmmeovlmos = pmrrcconnestabfailmmeovlmos;
	}
	/**
	 * @return the pmrrcconnestabfailmpoverload
	 */
	public String getPmrrcconnestabfailmpoverload() {
		return pmrrcconnestabfailmpoverload;
	}
	/**
	 * @param pmrrcconnestabfailmpoverload the pmrrcconnestabfailmpoverload to set
	 */
	public void setPmrrcconnestabfailmpoverload(String pmrrcconnestabfailmpoverload) {
		this.pmrrcconnestabfailmpoverload = pmrrcconnestabfailmpoverload;
	}
	/**
	 * @return the pmrrcconnestabfailoverload
	 */
	public String getPmrrcconnestabfailoverload() {
		return pmrrcconnestabfailoverload;
	}
	/**
	 * @param pmrrcconnestabfailoverload the pmrrcconnestabfailoverload to set
	 */
	public void setPmrrcconnestabfailoverload(String pmrrcconnestabfailoverload) {
		this.pmrrcconnestabfailoverload = pmrrcconnestabfailoverload;
	}
	/**
	 * @return the pmrrcconnestablowcovueatt
	 */
	public String getPmrrcconnestablowcovueatt() {
		return pmrrcconnestablowcovueatt;
	}
	/**
	 * @param pmrrcconnestablowcovueatt the pmrrcconnestablowcovueatt to set
	 */
	public void setPmrrcconnestablowcovueatt(String pmrrcconnestablowcovueatt) {
		this.pmrrcconnestablowcovueatt = pmrrcconnestablowcovueatt;
	}
	/**
	 * @return the pmrrcconnestablowcovuesucc
	 */
	public String getPmrrcconnestablowcovuesucc() {
		return pmrrcconnestablowcovuesucc;
	}
	/**
	 * @param pmrrcconnestablowcovuesucc the pmrrcconnestablowcovuesucc to set
	 */
	public void setPmrrcconnestablowcovuesucc(String pmrrcconnestablowcovuesucc) {
		this.pmrrcconnestablowcovuesucc = pmrrcconnestablowcovuesucc;
	}
	/**
	 * @return the pmRrcConnEstabSucc
	 */
	public String getPmRrcConnEstabSucc() {
		return pmRrcConnEstabSucc;
	}
	/**
	 * @param pmrrcconnestabsucc the pmrrcconnestabsucc to set
	 */
	public void setPmRrcConnEstabSucc(String pmRrcConnEstabSucc) {
		this.pmRrcConnEstabSucc = pmRrcConnEstabSucc;
	}
	/**
	 * @return the pmrrcconnestabsuccdta
	 */
	public String getPmrrcconnestabsuccdta() {
		return pmrrcconnestabsuccdta;
	}
	/**
	 * @param pmrrcconnestabsuccdta the pmrrcconnestabsuccdta to set
	 */
	public void setPmrrcconnestabsuccdta(String pmrrcconnestabsuccdta) {
		this.pmrrcconnestabsuccdta = pmrrcconnestabsuccdta;
	}
	/**
	 * @return the pmrrcconnestabsuccem
	 */
	public String getPmrrcconnestabsuccem() {
		return pmrrcconnestabsuccem;
	}
	/**
	 * @param pmrrcconnestabsuccem the pmrrcconnestabsuccem to set
	 */
	public void setPmrrcconnestabsuccem(String pmrrcconnestabsuccem) {
		this.pmrrcconnestabsuccem = pmrrcconnestabsuccem;
	}
	/**
	 * @return the pmrrcconnestabsuccgummeinative
	 */
	public String getPmrrcconnestabsuccgummeinative() {
		return pmrrcconnestabsuccgummeinative;
	}
	/**
	 * @param pmrrcconnestabsuccgummeinative the pmrrcconnestabsuccgummeinative to set
	 */
	public void setPmrrcconnestabsuccgummeinative(
			String pmrrcconnestabsuccgummeinative) {
		this.pmrrcconnestabsuccgummeinative = pmrrcconnestabsuccgummeinative;
	}
	/**
	 * @return the pmrrcconnestabsucchpa
	 */
	public String getPmrrcconnestabsucchpa() {
		return pmrrcconnestabsucchpa;
	}
	/**
	 * @param pmrrcconnestabsucchpa the pmrrcconnestabsucchpa to set
	 */
	public void setPmrrcconnestabsucchpa(String pmrrcconnestabsucchpa) {
		this.pmrrcconnestabsucchpa = pmrrcconnestabsucchpa;
	}
	/**
	 * @return the pmrrcconnestabsuccmod
	 */
	public String getPmrrcconnestabsuccmod() {
		return pmrrcconnestabsuccmod;
	}
	/**
	 * @param pmrrcconnestabsuccmod the pmrrcconnestabsuccmod to set
	 */
	public void setPmrrcconnestabsuccmod(String pmrrcconnestabsuccmod) {
		this.pmrrcconnestabsuccmod = pmrrcconnestabsuccmod;
	}
	/**
	 * @return the pmrrcconnestabsuccmos
	 */
	public String getPmrrcconnestabsuccmos() {
		return pmrrcconnestabsuccmos;
	}
	/**
	 * @param pmrrcconnestabsuccmos the pmrrcconnestabsuccmos to set
	 */
	public void setPmrrcconnestabsuccmos(String pmrrcconnestabsuccmos) {
		this.pmrrcconnestabsuccmos = pmrrcconnestabsuccmos;
	}
	/**
	 * @return the pmrrcconnestabsuccmta
	 */
	public String getPmrrcconnestabsuccmta() {
		return pmrrcconnestabsuccmta;
	}
	/**
	 * @param pmrrcconnestabsuccmta the pmrrcconnestabsuccmta to set
	 */
	public void setPmrrcconnestabsuccmta(String pmrrcconnestabsuccmta) {
		this.pmrrcconnestabsuccmta = pmrrcconnestabsuccmta;
	}
	/**
	 * @return the pmrrcconnlevsamp
	 */
	public String getPmrrcconnlevsamp() {
		return pmrrcconnlevsamp;
	}
	/**
	 * @param pmrrcconnlevsamp the pmrrcconnlevsamp to set
	 */
	public void setPmrrcconnlevsamp(String pmrrcconnlevsamp) {
		this.pmrrcconnlevsamp = pmrrcconnlevsamp;
	}
	/**
	 * @return the pmrrcconnlevsum
	 */
	public String getPmrrcconnlevsum() {
		return pmrrcconnlevsum;
	}
	/**
	 * @param pmrrcconnlevsum the pmrrcconnlevsum to set
	 */
	public void setPmrrcconnlevsum(String pmrrcconnlevsum) {
		this.pmrrcconnlevsum = pmrrcconnlevsum;
	}
	/**
	 * @return the pmrrcconnlevsumuloutofsync
	 */
	public String getPmrrcconnlevsumuloutofsync() {
		return pmrrcconnlevsumuloutofsync;
	}
	/**
	 * @param pmrrcconnlevsumuloutofsync the pmrrcconnlevsumuloutofsync to set
	 */
	public void setPmrrcconnlevsumuloutofsync(String pmrrcconnlevsumuloutofsync) {
		this.pmrrcconnlevsumuloutofsync = pmrrcconnlevsumuloutofsync;
	}
	/**
	 * @return the pmrrcconnmax
	 */
	public String getPmrrcconnmax() {
		return pmrrcconnmax;
	}
	/**
	 * @param pmrrcconnmax the pmrrcconnmax to set
	 */
	public void setPmrrcconnmax(String pmrrcconnmax) {
		this.pmrrcconnmax = pmrrcconnmax;
	}
	/**
	 * @return the pmrrcconnreconfattnomob
	 */
	public String getPmrrcconnreconfattnomob() {
		return pmrrcconnreconfattnomob;
	}
	/**
	 * @param pmrrcconnreconfattnomob the pmrrcconnreconfattnomob to set
	 */
	public void setPmrrcconnreconfattnomob(String pmrrcconnreconfattnomob) {
		this.pmrrcconnreconfattnomob = pmrrcconnreconfattnomob;
	}
	/**
	 * @return the pmrrcconnreconfattnomobdlcomp
	 */
	public String getPmrrcconnreconfattnomobdlcomp() {
		return pmrrcconnreconfattnomobdlcomp;
	}
	/**
	 * @param pmrrcconnreconfattnomobdlcomp the pmrrcconnreconfattnomobdlcomp to set
	 */
	public void setPmrrcconnreconfattnomobdlcomp(
			String pmrrcconnreconfattnomobdlcomp) {
		this.pmrrcconnreconfattnomobdlcomp = pmrrcconnreconfattnomobdlcomp;
	}
	/**
	 * @return the pmrrcconnreconfattnomobearfcnca
	 */
	public String getPmrrcconnreconfattnomobearfcnca() {
		return pmrrcconnreconfattnomobearfcnca;
	}
	/**
	 * @param pmrrcconnreconfattnomobearfcnca the pmrrcconnreconfattnomobearfcnca to set
	 */
	public void setPmrrcconnreconfattnomobearfcnca(
			String pmrrcconnreconfattnomobearfcnca) {
		this.pmrrcconnreconfattnomobearfcnca = pmrrcconnreconfattnomobearfcnca;
	}
	/**
	 * @return the pmrrcconnreconfsuccnomob
	 */
	public String getPmrrcconnreconfsuccnomob() {
		return pmrrcconnreconfsuccnomob;
	}
	/**
	 * @param pmrrcconnreconfsuccnomob the pmrrcconnreconfsuccnomob to set
	 */
	public void setPmrrcconnreconfsuccnomob(String pmrrcconnreconfsuccnomob) {
		this.pmrrcconnreconfsuccnomob = pmrrcconnreconfsuccnomob;
	}
	/**
	 * @return the pmrrcconnreconfsuccnomobdlcomp
	 */
	public String getPmrrcconnreconfsuccnomobdlcomp() {
		return pmrrcconnreconfsuccnomobdlcomp;
	}
	/**
	 * @param pmrrcconnreconfsuccnomobdlcomp the pmrrcconnreconfsuccnomobdlcomp to set
	 */
	public void setPmrrcconnreconfsuccnomobdlcomp(
			String pmrrcconnreconfsuccnomobdlcomp) {
		this.pmrrcconnreconfsuccnomobdlcomp = pmrrcconnreconfsuccnomobdlcomp;
	}
	/**
	 * @return the pmrrcconnreconfsuccnomobearfcnca
	 */
	public String getPmrrcconnreconfsuccnomobearfcnca() {
		return pmrrcconnreconfsuccnomobearfcnca;
	}
	/**
	 * @param pmrrcconnreconfsuccnomobearfcnca the pmrrcconnreconfsuccnomobearfcnca to set
	 */
	public void setPmrrcconnreconfsuccnomobearfcnca(
			String pmrrcconnreconfsuccnomobearfcnca) {
		this.pmrrcconnreconfsuccnomobearfcnca = pmrrcconnreconfsuccnomobearfcnca;
	}
	/**
	 * @return the pmrrcconnreestatt
	 */
	public String getPmrrcconnreestatt() {
		return pmrrcconnreestatt;
	}
	/**
	 * @param pmrrcconnreestatt the pmrrcconnreestatt to set
	 */
	public void setPmrrcconnreestatt(String pmrrcconnreestatt) {
		this.pmrrcconnreestatt = pmrrcconnreestatt;
	}
	/**
	 * @return the pmrrcconnreestattho
	 */
	public String getPmrrcconnreestattho() {
		return pmrrcconnreestattho;
	}
	/**
	 * @param pmrrcconnreestattho the pmrrcconnreestattho to set
	 */
	public void setPmrrcconnreestattho(String pmrrcconnreestattho) {
		this.pmrrcconnreestattho = pmrrcconnreestattho;
	}
	/**
	 * @return the pmrrcconnreestfaildynueadmctrl
	 */
	public String getPmrrcconnreestfaildynueadmctrl() {
		return pmrrcconnreestfaildynueadmctrl;
	}
	/**
	 * @param pmrrcconnreestfaildynueadmctrl the pmrrcconnreestfaildynueadmctrl to set
	 */
	public void setPmrrcconnreestfaildynueadmctrl(
			String pmrrcconnreestfaildynueadmctrl) {
		this.pmrrcconnreestfaildynueadmctrl = pmrrcconnreestfaildynueadmctrl;
	}
	/**
	 * @return the pmrrcconnreestfaillicmtreest
	 */
	public String getPmrrcconnreestfaillicmtreest() {
		return pmrrcconnreestfaillicmtreest;
	}
	/**
	 * @param pmrrcconnreestfaillicmtreest the pmrrcconnreestfaillicmtreest to set
	 */
	public void setPmrrcconnreestfaillicmtreest(String pmrrcconnreestfaillicmtreest) {
		this.pmrrcconnreestfaillicmtreest = pmrrcconnreestfaillicmtreest;
	}
	/**
	 * @return the pmrrcconnreestfailmisigqcong
	 */
	public String getPmrrcconnreestfailmisigqcong() {
		return pmrrcconnreestfailmisigqcong;
	}
	/**
	 * @param pmrrcconnreestfailmisigqcong the pmrrcconnreestfailmisigqcong to set
	 */
	public void setPmrrcconnreestfailmisigqcong(String pmrrcconnreestfailmisigqcong) {
		this.pmrrcconnreestfailmisigqcong = pmrrcconnreestfailmisigqcong;
	}
	/**
	 * @return the pmrrcconnreestsucc
	 */
	public String getPmrrcconnreestsucc() {
		return pmrrcconnreestsucc;
	}
	/**
	 * @param pmrrcconnreestsucc the pmrrcconnreestsucc to set
	 */
	public void setPmrrcconnreestsucc(String pmrrcconnreestsucc) {
		this.pmrrcconnreestsucc = pmrrcconnreestsucc;
	}
	/**
	 * @return the pmrrcconnreestsuccho
	 */
	public String getPmrrcconnreestsuccho() {
		return pmrrcconnreestsuccho;
	}
	/**
	 * @param pmrrcconnreestsuccho the pmrrcconnreestsuccho to set
	 */
	public void setPmrrcconnreestsuccho(String pmrrcconnreestsuccho) {
		this.pmrrcconnreestsuccho = pmrrcconnreestsuccho;
	}
	/**
	 * @return the pmrrcconnrelabnormalenb
	 */
	public String getPmrrcconnrelabnormalenb() {
		return pmrrcconnrelabnormalenb;
	}
	/**
	 * @param pmrrcconnrelabnormalenb the pmrrcconnrelabnormalenb to set
	 */
	public void setPmrrcconnrelabnormalenb(String pmrrcconnrelabnormalenb) {
		this.pmrrcconnrelabnormalenb = pmrrcconnrelabnormalenb;
	}
	/**
	 * @return the pmrrcconnrelabnormalenbact
	 */
	public String getPmrrcconnrelabnormalenbact() {
		return pmrrcconnrelabnormalenbact;
	}
	/**
	 * @param pmrrcconnrelabnormalenbact the pmrrcconnrelabnormalenbact to set
	 */
	public void setPmrrcconnrelabnormalenbact(String pmrrcconnrelabnormalenbact) {
		this.pmrrcconnrelabnormalenbact = pmrrcconnrelabnormalenbact;
	}
	/**
	 * @return the pmrrcconnrelabnormalenbacttnfail
	 */
	public String getPmrrcconnrelabnormalenbacttnfail() {
		return pmrrcconnrelabnormalenbacttnfail;
	}
	/**
	 * @param pmrrcconnrelabnormalenbacttnfail the pmrrcconnrelabnormalenbacttnfail to set
	 */
	public void setPmrrcconnrelabnormalenbacttnfail(
			String pmrrcconnrelabnormalenbacttnfail) {
		this.pmrrcconnrelabnormalenbacttnfail = pmrrcconnrelabnormalenbacttnfail;
	}
	/**
	 * @return the pmrrcconnrelnormalenb
	 */
	public String getPmrrcconnrelnormalenb() {
		return pmrrcconnrelnormalenb;
	}
	/**
	 * @param pmrrcconnrelnormalenb the pmrrcconnrelnormalenb to set
	 */
	public void setPmrrcconnrelnormalenb(String pmrrcconnrelnormalenb) {
		this.pmrrcconnrelnormalenb = pmrrcconnrelnormalenb;
	}
	/**
	 * @return the pmrrcconnrelnormalmme
	 */
	public String getPmrrcconnrelnormalmme() {
		return pmrrcconnrelnormalmme;
	}
	/**
	 * @param pmrrcconnrelnormalmme the pmrrcconnrelnormalmme to set
	 */
	public void setPmrrcconnrelnormalmme(String pmrrcconnrelnormalmme) {
		this.pmrrcconnrelnormalmme = pmrrcconnrelnormalmme;
	}
	/**
	 * @return the pmrrcconntuneoutlevsamp
	 */
	public String getPmrrcconntuneoutlevsamp() {
		return pmrrcconntuneoutlevsamp;
	}
	/**
	 * @param pmrrcconntuneoutlevsamp the pmrrcconntuneoutlevsamp to set
	 */
	public void setPmrrcconntuneoutlevsamp(String pmrrcconntuneoutlevsamp) {
		this.pmrrcconntuneoutlevsamp = pmrrcconntuneoutlevsamp;
	}
	/**
	 * @return the pmrrcconntuneoutlevsum
	 */
	public String getPmrrcconntuneoutlevsum() {
		return pmrrcconntuneoutlevsum;
	}
	/**
	 * @param pmrrcconntuneoutlevsum the pmrrcconntuneoutlevsum to set
	 */
	public void setPmrrcconntuneoutlevsum(String pmrrcconntuneoutlevsum) {
		this.pmrrcconntuneoutlevsum = pmrrcconntuneoutlevsum;
	}
	/**
	 * @return the pmS1SigConnEstabAtt
	 */
	public String getPmS1SigConnEstabAtt() {
		return pmS1SigConnEstabAtt;
	}
	/**
	 * @param pms1sigconnestabatt the pms1sigconnestabatt to set
	 */
	public void setPmS1SigConnEstabAtt(String pmS1SigConnEstabAtt) {
		this.pmS1SigConnEstabAtt = pmS1SigConnEstabAtt;
	}
	/**
	 * @return the pms1sigconnestabattdta
	 */
	public String getPms1sigconnestabattdta() {
		return pms1sigconnestabattdta;
	}
	/**
	 * @param pms1sigconnestabattdta the pms1sigconnestabattdta to set
	 */
	public void setPms1sigconnestabattdta(String pms1sigconnestabattdta) {
		this.pms1sigconnestabattdta = pms1sigconnestabattdta;
	}
	/**
	 * @return the pms1sigconnestabattem
	 */
	public String getPms1sigconnestabattem() {
		return pms1sigconnestabattem;
	}
	/**
	 * @param pms1sigconnestabattem the pms1sigconnestabattem to set
	 */
	public void setPms1sigconnestabattem(String pms1sigconnestabattem) {
		this.pms1sigconnestabattem = pms1sigconnestabattem;
	}
	/**
	 * @return the pms1sigconnestabatthpa
	 */
	public String getPms1sigconnestabatthpa() {
		return pms1sigconnestabatthpa;
	}
	/**
	 * @param pms1sigconnestabatthpa the pms1sigconnestabatthpa to set
	 */
	public void setPms1sigconnestabatthpa(String pms1sigconnestabatthpa) {
		this.pms1sigconnestabatthpa = pms1sigconnestabatthpa;
	}
	/**
	 * @return the pms1sigconnestabattmod
	 */
	public String getPms1sigconnestabattmod() {
		return pms1sigconnestabattmod;
	}
	/**
	 * @param pms1sigconnestabattmod the pms1sigconnestabattmod to set
	 */
	public void setPms1sigconnestabattmod(String pms1sigconnestabattmod) {
		this.pms1sigconnestabattmod = pms1sigconnestabattmod;
	}
	/**
	 * @return the pms1sigconnestabattmos
	 */
	public String getPms1sigconnestabattmos() {
		return pms1sigconnestabattmos;
	}
	/**
	 * @param pms1sigconnestabattmos the pms1sigconnestabattmos to set
	 */
	public void setPms1sigconnestabattmos(String pms1sigconnestabattmos) {
		this.pms1sigconnestabattmos = pms1sigconnestabattmos;
	}
	/**
	 * @return the pms1sigconnestabattmta
	 */
	public String getPms1sigconnestabattmta() {
		return pms1sigconnestabattmta;
	}
	/**
	 * @param pms1sigconnestabattmta the pms1sigconnestabattmta to set
	 */
	public void setPms1sigconnestabattmta(String pms1sigconnestabattmta) {
		this.pms1sigconnestabattmta = pms1sigconnestabattmta;
	}
	/**
	 * @return the pms1sigconnestabfailmmeovlmos
	 */
	public String getPms1sigconnestabfailmmeovlmos() {
		return pms1sigconnestabfailmmeovlmos;
	}
	/**
	 * @param pms1sigconnestabfailmmeovlmos the pms1sigconnestabfailmmeovlmos to set
	 */
	public void setPms1sigconnestabfailmmeovlmos(
			String pms1sigconnestabfailmmeovlmos) {
		this.pms1sigconnestabfailmmeovlmos = pms1sigconnestabfailmmeovlmos;
	}
	/**
	 * @return the pmS1SigConnEstabSucc
	 */
	public String getPmS1SigConnEstabSucc() {
		return pmS1SigConnEstabSucc;
	}
	/**
	 * @param pms1sigconnestabsucc the pms1sigconnestabsucc to set
	 */
	public void setPmS1SigConnEstabSucc(String pmS1SigConnEstabSucc) {
		this.pmS1SigConnEstabSucc = pmS1SigConnEstabSucc;
	}
	/**
	 * @return the pms1sigconnestabsuccdta
	 */
	public String getPms1sigconnestabsuccdta() {
		return pms1sigconnestabsuccdta;
	}
	/**
	 * @param pms1sigconnestabsuccdta the pms1sigconnestabsuccdta to set
	 */
	public void setPms1sigconnestabsuccdta(String pms1sigconnestabsuccdta) {
		this.pms1sigconnestabsuccdta = pms1sigconnestabsuccdta;
	}
	/**
	 * @return the pms1sigconnestabsuccem
	 */
	public String getPms1sigconnestabsuccem() {
		return pms1sigconnestabsuccem;
	}
	/**
	 * @param pms1sigconnestabsuccem the pms1sigconnestabsuccem to set
	 */
	public void setPms1sigconnestabsuccem(String pms1sigconnestabsuccem) {
		this.pms1sigconnestabsuccem = pms1sigconnestabsuccem;
	}
	/**
	 * @return the pms1sigconnestabsucchpa
	 */
	public String getPms1sigconnestabsucchpa() {
		return pms1sigconnestabsucchpa;
	}
	/**
	 * @param pms1sigconnestabsucchpa the pms1sigconnestabsucchpa to set
	 */
	public void setPms1sigconnestabsucchpa(String pms1sigconnestabsucchpa) {
		this.pms1sigconnestabsucchpa = pms1sigconnestabsucchpa;
	}
	/**
	 * @return the pms1sigconnestabsuccmod
	 */
	public String getPms1sigconnestabsuccmod() {
		return pms1sigconnestabsuccmod;
	}
	/**
	 * @param pms1sigconnestabsuccmod the pms1sigconnestabsuccmod to set
	 */
	public void setPms1sigconnestabsuccmod(String pms1sigconnestabsuccmod) {
		this.pms1sigconnestabsuccmod = pms1sigconnestabsuccmod;
	}
	/**
	 * @return the pms1sigconnestabsuccmos
	 */
	public String getPms1sigconnestabsuccmos() {
		return pms1sigconnestabsuccmos;
	}
	/**
	 * @param pms1sigconnestabsuccmos the pms1sigconnestabsuccmos to set
	 */
	public void setPms1sigconnestabsuccmos(String pms1sigconnestabsuccmos) {
		this.pms1sigconnestabsuccmos = pms1sigconnestabsuccmos;
	}
	/**
	 * @return the pms1sigconnestabsuccmta
	 */
	public String getPms1sigconnestabsuccmta() {
		return pms1sigconnestabsuccmta;
	}
	/**
	 * @param pms1sigconnestabsuccmta the pms1sigconnestabsuccmta to set
	 */
	public void setPms1sigconnestabsuccmta(String pms1sigconnestabsuccmta) {
		this.pms1sigconnestabsuccmta = pms1sigconnestabsuccmta;
	}
	/**
	 * @return the pmSchedActivityCellDl
	 */
	public String getPmSchedActivityCellDl() {
		return pmSchedActivityCellDl;
	}
	/**
	 * @param pmschedactivitycelldl the pmschedactivitycelldl to set
	 */
	public void setPmSchedActivityCellDl(String pmSchedActivityCellDl) {
		this.pmSchedActivityCellDl = pmSchedActivityCellDl;
	}
	/**
	 * @return the pmSchedActivityCellUl
	 */
	public String getPmSchedActivityCellUl() {
		return pmSchedActivityCellUl;
	}
	/**
	 * @param pmschedactivitycellul the pmschedactivitycellul to set
	 */
	public void setPmSchedActivityCellUl(String pmSchedActivityCellUl) {
		this.pmSchedActivityCellUl = pmSchedActivityCellUl;
	}
	/**
	 * @return the pmschedactivityuedl
	 */
	public String getPmschedactivityuedl() {
		return pmschedactivityuedl;
	}
	/**
	 * @param pmschedactivityuedl the pmschedactivityuedl to set
	 */
	public void setPmschedactivityuedl(String pmschedactivityuedl) {
		this.pmschedactivityuedl = pmschedactivityuedl;
	}
	/**
	 * @return the pmschedactivityueul
	 */
	public String getPmschedactivityueul() {
		return pmschedactivityueul;
	}
	/**
	 * @param pmschedactivityueul the pmschedactivityueul to set
	 */
	public void setPmschedactivityueul(String pmschedactivityueul) {
		this.pmschedactivityueul = pmschedactivityueul;
	}
	/**
	 * @return the pmschedactivityultti
	 */
	public String getPmschedactivityultti() {
		return pmschedactivityultti;
	}
	/**
	 * @param pmschedactivityultti the pmschedactivityultti to set
	 */
	public void setPmschedactivityultti(String pmschedactivityultti) {
		this.pmschedactivityultti = pmschedactivityultti;
	}
	/**
	 * @return the pmschedrestrictuecatdl
	 */
	public String getPmschedrestrictuecatdl() {
		return pmschedrestrictuecatdl;
	}
	/**
	 * @param pmschedrestrictuecatdl the pmschedrestrictuecatdl to set
	 */
	public void setPmschedrestrictuecatdl(String pmschedrestrictuecatdl) {
		this.pmschedrestrictuecatdl = pmschedrestrictuecatdl;
	}
	/**
	 * @return the pmschedrestrictuecatul
	 */
	public String getPmschedrestrictuecatul() {
		return pmschedrestrictuecatul;
	}
	/**
	 * @param pmschedrestrictuecatul the pmschedrestrictuecatul to set
	 */
	public void setPmschedrestrictuecatul(String pmschedrestrictuecatul) {
		this.pmschedrestrictuecatul = pmschedrestrictuecatul;
	}
	/**
	 * @return the pmservicetimedrb
	 */
	public String getPmservicetimedrb() {
		return pmservicetimedrb;
	}
	/**
	 * @param pmservicetimedrb the pmservicetimedrb to set
	 */
	public void setPmservicetimedrb(String pmservicetimedrb) {
		this.pmservicetimedrb = pmservicetimedrb;
	}
	/**
	 * @return the pmservicetimeue
	 */
	public String getPmservicetimeue() {
		return pmservicetimeue;
	}
	/**
	 * @param pmservicetimeue the pmservicetimeue to set
	 */
	public void setPmservicetimeue(String pmservicetimeue) {
		this.pmservicetimeue = pmservicetimeue;
	}
	/**
	 * @return the pmsessiontimedrb
	 */
	public String getPmsessiontimedrb() {
		return pmsessiontimedrb;
	}
	/**
	 * @param pmsessiontimedrb the pmsessiontimedrb to set
	 */
	public void setPmsessiontimedrb(String pmsessiontimedrb) {
		this.pmsessiontimedrb = pmsessiontimedrb;
	}
	/**
	 * @return the pmSessionTimeUe
	 */
	public String getPmSessionTimeUe() {
		return pmSessionTimeUe;
	}
	/**
	 * @param pmsessiontimeue the pmsessiontimeue to set
	 */
	public void setPmSessionTimeUe(String pmSessionTimeUe) {
		this.pmSessionTimeUe = pmSessionTimeUe;
	}
	/**
	 * @return the pmttibundlingdisable
	 */
	public String getPmttibundlingdisable() {
		return pmttibundlingdisable;
	}
	/**
	 * @param pmttibundlingdisable the pmttibundlingdisable to set
	 */
	public void setPmttibundlingdisable(String pmttibundlingdisable) {
		this.pmttibundlingdisable = pmttibundlingdisable;
	}
	/**
	 * @return the pmttibundlingenable
	 */
	public String getPmttibundlingenable() {
		return pmttibundlingenable;
	}
	/**
	 * @param pmttibundlingenable the pmttibundlingenable to set
	 */
	public void setPmttibundlingenable(String pmttibundlingenable) {
		this.pmttibundlingenable = pmttibundlingenable;
	}
	/**
	 * @return the pmttibundlingfailto
	 */
	public String getPmttibundlingfailto() {
		return pmttibundlingfailto;
	}
	/**
	 * @param pmttibundlingfailto the pmttibundlingfailto to set
	 */
	public void setPmttibundlingfailto(String pmttibundlingfailto) {
		this.pmttibundlingfailto = pmttibundlingfailto;
	}
	/**
	 * @return the pmttibundlinguemax
	 */
	public String getPmttibundlinguemax() {
		return pmttibundlinguemax;
	}
	/**
	 * @param pmttibundlinguemax the pmttibundlinguemax to set
	 */
	public void setPmttibundlinguemax(String pmttibundlinguemax) {
		this.pmttibundlinguemax = pmttibundlinguemax;
	}
	/**
	 * @return the pmttibundlinguesamp
	 */
	public String getPmttibundlinguesamp() {
		return pmttibundlinguesamp;
	}
	/**
	 * @param pmttibundlinguesamp the pmttibundlinguesamp to set
	 */
	public void setPmttibundlinguesamp(String pmttibundlinguesamp) {
		this.pmttibundlinguesamp = pmttibundlinguesamp;
	}
	/**
	 * @return the pmttibundlinguesum
	 */
	public String getPmttibundlinguesum() {
		return pmttibundlinguesum;
	}
	/**
	 * @param pmttibundlinguesum the pmttibundlinguesum to set
	 */
	public void setPmttibundlinguesum(String pmttibundlinguesum) {
		this.pmttibundlinguesum = pmttibundlinguesum;
	}
	/**
	 * @return the pmuectxtestabatt
	 */
	public String getPmuectxtestabatt() {
		return pmuectxtestabatt;
	}
	/**
	 * @param pmuectxtestabatt the pmuectxtestabatt to set
	 */
	public void setPmuectxtestabatt(String pmuectxtestabatt) {
		this.pmuectxtestabatt = pmuectxtestabatt;
	}
	/**
	 * @return the pmuectxtestabattcsfb
	 */
	public String getPmuectxtestabattcsfb() {
		return pmuectxtestabattcsfb;
	}
	/**
	 * @param pmuectxtestabattcsfb the pmuectxtestabattcsfb to set
	 */
	public void setPmuectxtestabattcsfb(String pmuectxtestabattcsfb) {
		this.pmuectxtestabattcsfb = pmuectxtestabattcsfb;
	}
	/**
	 * @return the pmuectxtestabsucc
	 */
	public String getPmuectxtestabsucc() {
		return pmuectxtestabsucc;
	}
	/**
	 * @param pmuectxtestabsucc the pmuectxtestabsucc to set
	 */
	public void setPmuectxtestabsucc(String pmuectxtestabsucc) {
		this.pmuectxtestabsucc = pmuectxtestabsucc;
	}
	/**
	 * @return the pmuectxtfetchatt
	 */
	public String getPmuectxtfetchatt() {
		return pmuectxtfetchatt;
	}
	/**
	 * @param pmuectxtfetchatt the pmuectxtfetchatt to set
	 */
	public void setPmuectxtfetchatt(String pmuectxtfetchatt) {
		this.pmuectxtfetchatt = pmuectxtfetchatt;
	}
	/**
	 * @return the pmuectxtfetchattintraenbhoexe
	 */
	public String getPmuectxtfetchattintraenbhoexe() {
		return pmuectxtfetchattintraenbhoexe;
	}
	/**
	 * @param pmuectxtfetchattintraenbhoexe the pmuectxtfetchattintraenbhoexe to set
	 */
	public void setPmuectxtfetchattintraenbhoexe(
			String pmuectxtfetchattintraenbhoexe) {
		this.pmuectxtfetchattintraenbhoexe = pmuectxtfetchattintraenbhoexe;
	}
	/**
	 * @return the pmuectxtfetchattintraenbhoprep
	 */
	public String getPmuectxtfetchattintraenbhoprep() {
		return pmuectxtfetchattintraenbhoprep;
	}
	/**
	 * @param pmuectxtfetchattintraenbhoprep the pmuectxtfetchattintraenbhoprep to set
	 */
	public void setPmuectxtfetchattintraenbhoprep(
			String pmuectxtfetchattintraenbhoprep) {
		this.pmuectxtfetchattintraenbhoprep = pmuectxtfetchattintraenbhoprep;
	}
	/**
	 * @return the pmuectxtfetchattnastransferdl
	 */
	public String getPmuectxtfetchattnastransferdl() {
		return pmuectxtfetchattnastransferdl;
	}
	/**
	 * @param pmuectxtfetchattnastransferdl the pmuectxtfetchattnastransferdl to set
	 */
	public void setPmuectxtfetchattnastransferdl(
			String pmuectxtfetchattnastransferdl) {
		this.pmuectxtfetchattnastransferdl = pmuectxtfetchattnastransferdl;
	}
	/**
	 * @return the pmuectxtfetchattnoneighrel
	 */
	public String getPmuectxtfetchattnoneighrel() {
		return pmuectxtfetchattnoneighrel;
	}
	/**
	 * @param pmuectxtfetchattnoneighrel the pmuectxtfetchattnoneighrel to set
	 */
	public void setPmuectxtfetchattnoneighrel(String pmuectxtfetchattnoneighrel) {
		this.pmuectxtfetchattnoneighrel = pmuectxtfetchattnoneighrel;
	}
	/**
	 * @return the pmuectxtfetchattreconf
	 */
	public String getPmuectxtfetchattreconf() {
		return pmuectxtfetchattreconf;
	}
	/**
	 * @param pmuectxtfetchattreconf the pmuectxtfetchattreconf to set
	 */
	public void setPmuectxtfetchattreconf(String pmuectxtfetchattreconf) {
		this.pmuectxtfetchattreconf = pmuectxtfetchattreconf;
	}
	/**
	 * @return the pmuectxtfetchatts1hoexe
	 */
	public String getPmuectxtfetchatts1hoexe() {
		return pmuectxtfetchatts1hoexe;
	}
	/**
	 * @param pmuectxtfetchatts1hoexe the pmuectxtfetchatts1hoexe to set
	 */
	public void setPmuectxtfetchatts1hoexe(String pmuectxtfetchatts1hoexe) {
		this.pmuectxtfetchatts1hoexe = pmuectxtfetchatts1hoexe;
	}
	/**
	 * @return the pmuectxtfetchatts1hoexesrvccgeran
	 */
	public String getPmuectxtfetchatts1hoexesrvccgeran() {
		return pmuectxtfetchatts1hoexesrvccgeran;
	}
	/**
	 * @param pmuectxtfetchatts1hoexesrvccgeran the pmuectxtfetchatts1hoexesrvccgeran to set
	 */
	public void setPmuectxtfetchatts1hoexesrvccgeran(
			String pmuectxtfetchatts1hoexesrvccgeran) {
		this.pmuectxtfetchatts1hoexesrvccgeran = pmuectxtfetchatts1hoexesrvccgeran;
	}
	/**
	 * @return the pmuectxtfetchatts1hoexesrvccutran
	 */
	public String getPmuectxtfetchatts1hoexesrvccutran() {
		return pmuectxtfetchatts1hoexesrvccutran;
	}
	/**
	 * @param pmuectxtfetchatts1hoexesrvccutran the pmuectxtfetchatts1hoexesrvccutran to set
	 */
	public void setPmuectxtfetchatts1hoexesrvccutran(
			String pmuectxtfetchatts1hoexesrvccutran) {
		this.pmuectxtfetchatts1hoexesrvccutran = pmuectxtfetchatts1hoexesrvccutran;
	}
	/**
	 * @return the pmuectxtfetchatts1hoprep
	 */
	public String getPmuectxtfetchatts1hoprep() {
		return pmuectxtfetchatts1hoprep;
	}
	/**
	 * @param pmuectxtfetchatts1hoprep the pmuectxtfetchatts1hoprep to set
	 */
	public void setPmuectxtfetchatts1hoprep(String pmuectxtfetchatts1hoprep) {
		this.pmuectxtfetchatts1hoprep = pmuectxtfetchatts1hoprep;
	}
	/**
	 * @return the pmuectxtfetchatts1hoprepsrvccgeran
	 */
	public String getPmuectxtfetchatts1hoprepsrvccgeran() {
		return pmuectxtfetchatts1hoprepsrvccgeran;
	}
	/**
	 * @param pmuectxtfetchatts1hoprepsrvccgeran the pmuectxtfetchatts1hoprepsrvccgeran to set
	 */
	public void setPmuectxtfetchatts1hoprepsrvccgeran(
			String pmuectxtfetchatts1hoprepsrvccgeran) {
		this.pmuectxtfetchatts1hoprepsrvccgeran = pmuectxtfetchatts1hoprepsrvccgeran;
	}
	/**
	 * @return the pmuectxtfetchatts1hoprepsrvccutran
	 */
	public String getPmuectxtfetchatts1hoprepsrvccutran() {
		return pmuectxtfetchatts1hoprepsrvccutran;
	}
	/**
	 * @param pmuectxtfetchatts1hoprepsrvccutran the pmuectxtfetchatts1hoprepsrvccutran to set
	 */
	public void setPmuectxtfetchatts1hoprepsrvccutran(
			String pmuectxtfetchatts1hoprepsrvccutran) {
		this.pmuectxtfetchatts1hoprepsrvccutran = pmuectxtfetchatts1hoprepsrvccutran;
	}
	/**
	 * @return the pmuectxtfetchattx2hoexe
	 */
	public String getPmuectxtfetchattx2hoexe() {
		return pmuectxtfetchattx2hoexe;
	}
	/**
	 * @param pmuectxtfetchattx2hoexe the pmuectxtfetchattx2hoexe to set
	 */
	public void setPmuectxtfetchattx2hoexe(String pmuectxtfetchattx2hoexe) {
		this.pmuectxtfetchattx2hoexe = pmuectxtfetchattx2hoexe;
	}
	/**
	 * @return the pmuectxtfetchattx2hoprep
	 */
	public String getPmuectxtfetchattx2hoprep() {
		return pmuectxtfetchattx2hoprep;
	}
	/**
	 * @param pmuectxtfetchattx2hoprep the pmuectxtfetchattx2hoprep to set
	 */
	public void setPmuectxtfetchattx2hoprep(String pmuectxtfetchattx2hoprep) {
		this.pmuectxtfetchattx2hoprep = pmuectxtfetchattx2hoprep;
	}
	/**
	 * @return the pmuectxtfetchsucc
	 */
	public String getPmuectxtfetchsucc() {
		return pmuectxtfetchsucc;
	}
	/**
	 * @param pmuectxtfetchsucc the pmuectxtfetchsucc to set
	 */
	public void setPmuectxtfetchsucc(String pmuectxtfetchsucc) {
		this.pmuectxtfetchsucc = pmuectxtfetchsucc;
	}
	/**
	 * @return the pmuectxtfetchsuccintraenbhoexe
	 */
	public String getPmuectxtfetchsuccintraenbhoexe() {
		return pmuectxtfetchsuccintraenbhoexe;
	}
	/**
	 * @param pmuectxtfetchsuccintraenbhoexe the pmuectxtfetchsuccintraenbhoexe to set
	 */
	public void setPmuectxtfetchsuccintraenbhoexe(
			String pmuectxtfetchsuccintraenbhoexe) {
		this.pmuectxtfetchsuccintraenbhoexe = pmuectxtfetchsuccintraenbhoexe;
	}
	/**
	 * @return the pmuectxtfetchsuccintraenbhoprep
	 */
	public String getPmuectxtfetchsuccintraenbhoprep() {
		return pmuectxtfetchsuccintraenbhoprep;
	}
	/**
	 * @param pmuectxtfetchsuccintraenbhoprep the pmuectxtfetchsuccintraenbhoprep to set
	 */
	public void setPmuectxtfetchsuccintraenbhoprep(
			String pmuectxtfetchsuccintraenbhoprep) {
		this.pmuectxtfetchsuccintraenbhoprep = pmuectxtfetchsuccintraenbhoprep;
	}
	/**
	 * @return the pmuectxtfetchsuccnastransferdl
	 */
	public String getPmuectxtfetchsuccnastransferdl() {
		return pmuectxtfetchsuccnastransferdl;
	}
	/**
	 * @param pmuectxtfetchsuccnastransferdl the pmuectxtfetchsuccnastransferdl to set
	 */
	public void setPmuectxtfetchsuccnastransferdl(
			String pmuectxtfetchsuccnastransferdl) {
		this.pmuectxtfetchsuccnastransferdl = pmuectxtfetchsuccnastransferdl;
	}
	/**
	 * @return the pmuectxtfetchsuccnoneighrel
	 */
	public String getPmuectxtfetchsuccnoneighrel() {
		return pmuectxtfetchsuccnoneighrel;
	}
	/**
	 * @param pmuectxtfetchsuccnoneighrel the pmuectxtfetchsuccnoneighrel to set
	 */
	public void setPmuectxtfetchsuccnoneighrel(String pmuectxtfetchsuccnoneighrel) {
		this.pmuectxtfetchsuccnoneighrel = pmuectxtfetchsuccnoneighrel;
	}
	/**
	 * @return the pmuectxtfetchsuccreconf
	 */
	public String getPmuectxtfetchsuccreconf() {
		return pmuectxtfetchsuccreconf;
	}
	/**
	 * @param pmuectxtfetchsuccreconf the pmuectxtfetchsuccreconf to set
	 */
	public void setPmuectxtfetchsuccreconf(String pmuectxtfetchsuccreconf) {
		this.pmuectxtfetchsuccreconf = pmuectxtfetchsuccreconf;
	}
	/**
	 * @return the pmuectxtfetchsuccs1hoexe
	 */
	public String getPmuectxtfetchsuccs1hoexe() {
		return pmuectxtfetchsuccs1hoexe;
	}
	/**
	 * @param pmuectxtfetchsuccs1hoexe the pmuectxtfetchsuccs1hoexe to set
	 */
	public void setPmuectxtfetchsuccs1hoexe(String pmuectxtfetchsuccs1hoexe) {
		this.pmuectxtfetchsuccs1hoexe = pmuectxtfetchsuccs1hoexe;
	}
	/**
	 * @return the pmuectxtfetchsuccs1hoexesrvccgeran
	 */
	public String getPmuectxtfetchsuccs1hoexesrvccgeran() {
		return pmuectxtfetchsuccs1hoexesrvccgeran;
	}
	/**
	 * @param pmuectxtfetchsuccs1hoexesrvccgeran the pmuectxtfetchsuccs1hoexesrvccgeran to set
	 */
	public void setPmuectxtfetchsuccs1hoexesrvccgeran(
			String pmuectxtfetchsuccs1hoexesrvccgeran) {
		this.pmuectxtfetchsuccs1hoexesrvccgeran = pmuectxtfetchsuccs1hoexesrvccgeran;
	}
	/**
	 * @return the pmuectxtfetchsuccs1hoexesrvccutran
	 */
	public String getPmuectxtfetchsuccs1hoexesrvccutran() {
		return pmuectxtfetchsuccs1hoexesrvccutran;
	}
	/**
	 * @param pmuectxtfetchsuccs1hoexesrvccutran the pmuectxtfetchsuccs1hoexesrvccutran to set
	 */
	public void setPmuectxtfetchsuccs1hoexesrvccutran(
			String pmuectxtfetchsuccs1hoexesrvccutran) {
		this.pmuectxtfetchsuccs1hoexesrvccutran = pmuectxtfetchsuccs1hoexesrvccutran;
	}
	/**
	 * @return the pmuectxtfetchsuccs1hoprep
	 */
	public String getPmuectxtfetchsuccs1hoprep() {
		return pmuectxtfetchsuccs1hoprep;
	}
	/**
	 * @param pmuectxtfetchsuccs1hoprep the pmuectxtfetchsuccs1hoprep to set
	 */
	public void setPmuectxtfetchsuccs1hoprep(String pmuectxtfetchsuccs1hoprep) {
		this.pmuectxtfetchsuccs1hoprep = pmuectxtfetchsuccs1hoprep;
	}
	/**
	 * @return the pmuectxtfetchsuccs1hoprepsrvccgeran
	 */
	public String getPmuectxtfetchsuccs1hoprepsrvccgeran() {
		return pmuectxtfetchsuccs1hoprepsrvccgeran;
	}
	/**
	 * @param pmuectxtfetchsuccs1hoprepsrvccgeran the pmuectxtfetchsuccs1hoprepsrvccgeran to set
	 */
	public void setPmuectxtfetchsuccs1hoprepsrvccgeran(
			String pmuectxtfetchsuccs1hoprepsrvccgeran) {
		this.pmuectxtfetchsuccs1hoprepsrvccgeran = pmuectxtfetchsuccs1hoprepsrvccgeran;
	}
	/**
	 * @return the pmuectxtfetchsuccs1hoprepsrvccutran
	 */
	public String getPmuectxtfetchsuccs1hoprepsrvccutran() {
		return pmuectxtfetchsuccs1hoprepsrvccutran;
	}
	/**
	 * @param pmuectxtfetchsuccs1hoprepsrvccutran the pmuectxtfetchsuccs1hoprepsrvccutran to set
	 */
	public void setPmuectxtfetchsuccs1hoprepsrvccutran(
			String pmuectxtfetchsuccs1hoprepsrvccutran) {
		this.pmuectxtfetchsuccs1hoprepsrvccutran = pmuectxtfetchsuccs1hoprepsrvccutran;
	}
	/**
	 * @return the pmuectxtfetchsuccx2hoexe
	 */
	public String getPmuectxtfetchsuccx2hoexe() {
		return pmuectxtfetchsuccx2hoexe;
	}
	/**
	 * @param pmuectxtfetchsuccx2hoexe the pmuectxtfetchsuccx2hoexe to set
	 */
	public void setPmuectxtfetchsuccx2hoexe(String pmuectxtfetchsuccx2hoexe) {
		this.pmuectxtfetchsuccx2hoexe = pmuectxtfetchsuccx2hoexe;
	}
	/**
	 * @return the pmuectxtfetchsuccx2hoprep
	 */
	public String getPmuectxtfetchsuccx2hoprep() {
		return pmuectxtfetchsuccx2hoprep;
	}
	/**
	 * @param pmuectxtfetchsuccx2hoprep the pmuectxtfetchsuccx2hoprep to set
	 */
	public void setPmuectxtfetchsuccx2hoprep(String pmuectxtfetchsuccx2hoprep) {
		this.pmuectxtfetchsuccx2hoprep = pmuectxtfetchsuccx2hoprep;
	}
	/**
	 * @return the pmuectxtmodattcsfb
	 */
	public String getPmuectxtmodattcsfb() {
		return pmuectxtmodattcsfb;
	}
	/**
	 * @param pmuectxtmodattcsfb the pmuectxtmodattcsfb to set
	 */
	public void setPmuectxtmodattcsfb(String pmuectxtmodattcsfb) {
		this.pmuectxtmodattcsfb = pmuectxtmodattcsfb;
	}
	/**
	 * @return the pmuectxtrelabnormalenb
	 */
	public String getPmuectxtrelabnormalenb() {
		return pmuectxtrelabnormalenb;
	}
	/**
	 * @param pmuectxtrelabnormalenb the pmuectxtrelabnormalenb to set
	 */
	public void setPmuectxtrelabnormalenb(String pmuectxtrelabnormalenb) {
		this.pmuectxtrelabnormalenb = pmuectxtrelabnormalenb;
	}
	/**
	 * @return the pmuectxtrelabnormalenbact
	 */
	public String getPmuectxtrelabnormalenbact() {
		return pmuectxtrelabnormalenbact;
	}
	/**
	 * @param pmuectxtrelabnormalenbact the pmuectxtrelabnormalenbact to set
	 */
	public void setPmuectxtrelabnormalenbact(String pmuectxtrelabnormalenbact) {
		this.pmuectxtrelabnormalenbact = pmuectxtrelabnormalenbact;
	}
	/**
	 * @return the pmuectxtrelabnormalenbactcdt
	 */
	public String getPmuectxtrelabnormalenbactcdt() {
		return pmuectxtrelabnormalenbactcdt;
	}
	/**
	 * @param pmuectxtrelabnormalenbactcdt the pmuectxtrelabnormalenbactcdt to set
	 */
	public void setPmuectxtrelabnormalenbactcdt(String pmuectxtrelabnormalenbactcdt) {
		this.pmuectxtrelabnormalenbactcdt = pmuectxtrelabnormalenbactcdt;
	}
	/**
	 * @return the pmuectxtrelabnormalenbactcdtauto
	 */
	public String getPmuectxtrelabnormalenbactcdtauto() {
		return pmuectxtrelabnormalenbactcdtauto;
	}
	/**
	 * @param pmuectxtrelabnormalenbactcdtauto the pmuectxtrelabnormalenbactcdtauto to set
	 */
	public void setPmuectxtrelabnormalenbactcdtauto(
			String pmuectxtrelabnormalenbactcdtauto) {
		this.pmuectxtrelabnormalenbactcdtauto = pmuectxtrelabnormalenbactcdtauto;
	}
	/**
	 * @return the pmuectxtrelabnormalenbactcdtautopnr
	 */
	public String getPmuectxtrelabnormalenbactcdtautopnr() {
		return pmuectxtrelabnormalenbactcdtautopnr;
	}
	/**
	 * @param pmuectxtrelabnormalenbactcdtautopnr the pmuectxtrelabnormalenbactcdtautopnr to set
	 */
	public void setPmuectxtrelabnormalenbactcdtautopnr(
			String pmuectxtrelabnormalenbactcdtautopnr) {
		this.pmuectxtrelabnormalenbactcdtautopnr = pmuectxtrelabnormalenbactcdtautopnr;
	}
	/**
	 * @return the pmuectxtrelabnormalenbactho
	 */
	public String getPmuectxtrelabnormalenbactho() {
		return pmuectxtrelabnormalenbactho;
	}
	/**
	 * @param pmuectxtrelabnormalenbactho the pmuectxtrelabnormalenbactho to set
	 */
	public void setPmuectxtrelabnormalenbactho(String pmuectxtrelabnormalenbactho) {
		this.pmuectxtrelabnormalenbactho = pmuectxtrelabnormalenbactho;
	}
	/**
	 * @return the pmuectxtrelabnormalenbacthooos
	 */
	public String getPmuectxtrelabnormalenbacthooos() {
		return pmuectxtrelabnormalenbacthooos;
	}
	/**
	 * @param pmuectxtrelabnormalenbacthooos the pmuectxtrelabnormalenbacthooos to set
	 */
	public void setPmuectxtrelabnormalenbacthooos(
			String pmuectxtrelabnormalenbacthooos) {
		this.pmuectxtrelabnormalenbacthooos = pmuectxtrelabnormalenbacthooos;
	}
	/**
	 * @return the pmuectxtrelabnormalenbacthooospft
	 */
	public String getPmuectxtrelabnormalenbacthooospft() {
		return pmuectxtrelabnormalenbacthooospft;
	}
	/**
	 * @param pmuectxtrelabnormalenbacthooospft the pmuectxtrelabnormalenbacthooospft to set
	 */
	public void setPmuectxtrelabnormalenbacthooospft(
			String pmuectxtrelabnormalenbacthooospft) {
		this.pmuectxtrelabnormalenbacthooospft = pmuectxtrelabnormalenbacthooospft;
	}
	/**
	 * @return the pmuectxtrelabnormalenbactoos
	 */
	public String getPmuectxtrelabnormalenbactoos() {
		return pmuectxtrelabnormalenbactoos;
	}
	/**
	 * @param pmuectxtrelabnormalenbactoos the pmuectxtrelabnormalenbactoos to set
	 */
	public void setPmuectxtrelabnormalenbactoos(String pmuectxtrelabnormalenbactoos) {
		this.pmuectxtrelabnormalenbactoos = pmuectxtrelabnormalenbactoos;
	}
	/**
	 * @return the pmuectxtrelabnormalenbactoospft
	 */
	public String getPmuectxtrelabnormalenbactoospft() {
		return pmuectxtrelabnormalenbactoospft;
	}
	/**
	 * @param pmuectxtrelabnormalenbactoospft the pmuectxtrelabnormalenbactoospft to set
	 */
	public void setPmuectxtrelabnormalenbactoospft(
			String pmuectxtrelabnormalenbactoospft) {
		this.pmuectxtrelabnormalenbactoospft = pmuectxtrelabnormalenbactoospft;
	}
	/**
	 * @return the pmuectxtrelabnormalenbactpe
	 */
	public String getPmuectxtrelabnormalenbactpe() {
		return pmuectxtrelabnormalenbactpe;
	}
	/**
	 * @param pmuectxtrelabnormalenbactpe the pmuectxtrelabnormalenbactpe to set
	 */
	public void setPmuectxtrelabnormalenbactpe(String pmuectxtrelabnormalenbactpe) {
		this.pmuectxtrelabnormalenbactpe = pmuectxtrelabnormalenbactpe;
	}
	/**
	 * @return the pmuectxtrelabnormalenbacttnfail
	 */
	public String getPmuectxtrelabnormalenbacttnfail() {
		return pmuectxtrelabnormalenbacttnfail;
	}
	/**
	 * @param pmuectxtrelabnormalenbacttnfail the pmuectxtrelabnormalenbacttnfail to set
	 */
	public void setPmuectxtrelabnormalenbacttnfail(
			String pmuectxtrelabnormalenbacttnfail) {
		this.pmuectxtrelabnormalenbacttnfail = pmuectxtrelabnormalenbacttnfail;
	}
	/**
	 * @return the pmuectxtrelabnormalenbactuelost
	 */
	public String getPmuectxtrelabnormalenbactuelost() {
		return pmuectxtrelabnormalenbactuelost;
	}
	/**
	 * @param pmuectxtrelabnormalenbactuelost the pmuectxtrelabnormalenbactuelost to set
	 */
	public void setPmuectxtrelabnormalenbactuelost(
			String pmuectxtrelabnormalenbactuelost) {
		this.pmuectxtrelabnormalenbactuelost = pmuectxtrelabnormalenbactuelost;
	}
	/**
	 * @return the pmuectxtrelabnormalenbactuelostoos
	 */
	public String getPmuectxtrelabnormalenbactuelostoos() {
		return pmuectxtrelabnormalenbactuelostoos;
	}
	/**
	 * @param pmuectxtrelabnormalenbactuelostoos the pmuectxtrelabnormalenbactuelostoos to set
	 */
	public void setPmuectxtrelabnormalenbactuelostoos(
			String pmuectxtrelabnormalenbactuelostoos) {
		this.pmuectxtrelabnormalenbactuelostoos = pmuectxtrelabnormalenbactuelostoos;
	}
	/**
	 * @return the pmuectxtrelabnormalenbactuelostoospft
	 */
	public String getPmuectxtrelabnormalenbactuelostoospft() {
		return pmuectxtrelabnormalenbactuelostoospft;
	}
	/**
	 * @param pmuectxtrelabnormalenbactuelostoospft the pmuectxtrelabnormalenbactuelostoospft to set
	 */
	public void setPmuectxtrelabnormalenbactuelostoospft(
			String pmuectxtrelabnormalenbactuelostoospft) {
		this.pmuectxtrelabnormalenbactuelostoospft = pmuectxtrelabnormalenbactuelostoospft;
	}
	/**
	 * @return the pmuectxtrelabnormalenbcdt
	 */
	public String getPmuectxtrelabnormalenbcdt() {
		return pmuectxtrelabnormalenbcdt;
	}
	/**
	 * @param pmuectxtrelabnormalenbcdt the pmuectxtrelabnormalenbcdt to set
	 */
	public void setPmuectxtrelabnormalenbcdt(String pmuectxtrelabnormalenbcdt) {
		this.pmuectxtrelabnormalenbcdt = pmuectxtrelabnormalenbcdt;
	}
	/**
	 * @return the pmuectxtrelabnormalenbcdtauto
	 */
	public String getPmuectxtrelabnormalenbcdtauto() {
		return pmuectxtrelabnormalenbcdtauto;
	}
	/**
	 * @param pmuectxtrelabnormalenbcdtauto the pmuectxtrelabnormalenbcdtauto to set
	 */
	public void setPmuectxtrelabnormalenbcdtauto(
			String pmuectxtrelabnormalenbcdtauto) {
		this.pmuectxtrelabnormalenbcdtauto = pmuectxtrelabnormalenbcdtauto;
	}
	/**
	 * @return the pmuectxtrelabnormalenbcdtautopnr
	 */
	public String getPmuectxtrelabnormalenbcdtautopnr() {
		return pmuectxtrelabnormalenbcdtautopnr;
	}
	/**
	 * @param pmuectxtrelabnormalenbcdtautopnr the pmuectxtrelabnormalenbcdtautopnr to set
	 */
	public void setPmuectxtrelabnormalenbcdtautopnr(
			String pmuectxtrelabnormalenbcdtautopnr) {
		this.pmuectxtrelabnormalenbcdtautopnr = pmuectxtrelabnormalenbcdtautopnr;
	}
	/**
	 * @return the pmuectxtrelabnormalenbho
	 */
	public String getPmuectxtrelabnormalenbho() {
		return pmuectxtrelabnormalenbho;
	}
	/**
	 * @param pmuectxtrelabnormalenbho the pmuectxtrelabnormalenbho to set
	 */
	public void setPmuectxtrelabnormalenbho(String pmuectxtrelabnormalenbho) {
		this.pmuectxtrelabnormalenbho = pmuectxtrelabnormalenbho;
	}
	/**
	 * @return the pmuectxtrelabnormalenbhooos
	 */
	public String getPmuectxtrelabnormalenbhooos() {
		return pmuectxtrelabnormalenbhooos;
	}
	/**
	 * @param pmuectxtrelabnormalenbhooos the pmuectxtrelabnormalenbhooos to set
	 */
	public void setPmuectxtrelabnormalenbhooos(String pmuectxtrelabnormalenbhooos) {
		this.pmuectxtrelabnormalenbhooos = pmuectxtrelabnormalenbhooos;
	}
	/**
	 * @return the pmuectxtrelabnormalenbhooospft
	 */
	public String getPmuectxtrelabnormalenbhooospft() {
		return pmuectxtrelabnormalenbhooospft;
	}
	/**
	 * @param pmuectxtrelabnormalenbhooospft the pmuectxtrelabnormalenbhooospft to set
	 */
	public void setPmuectxtrelabnormalenbhooospft(
			String pmuectxtrelabnormalenbhooospft) {
		this.pmuectxtrelabnormalenbhooospft = pmuectxtrelabnormalenbhooospft;
	}
	/**
	 * @return the pmuectxtrelabnormalenblic
	 */
	public String getPmuectxtrelabnormalenblic() {
		return pmuectxtrelabnormalenblic;
	}
	/**
	 * @param pmuectxtrelabnormalenblic the pmuectxtrelabnormalenblic to set
	 */
	public void setPmuectxtrelabnormalenblic(String pmuectxtrelabnormalenblic) {
		this.pmuectxtrelabnormalenblic = pmuectxtrelabnormalenblic;
	}
	/**
	 * @return the pmuectxtrelabnormalenboos
	 */
	public String getPmuectxtrelabnormalenboos() {
		return pmuectxtrelabnormalenboos;
	}
	/**
	 * @param pmuectxtrelabnormalenboos the pmuectxtrelabnormalenboos to set
	 */
	public void setPmuectxtrelabnormalenboos(String pmuectxtrelabnormalenboos) {
		this.pmuectxtrelabnormalenboos = pmuectxtrelabnormalenboos;
	}
	/**
	 * @return the pmuectxtrelabnormalenboospft
	 */
	public String getPmuectxtrelabnormalenboospft() {
		return pmuectxtrelabnormalenboospft;
	}
	/**
	 * @param pmuectxtrelabnormalenboospft the pmuectxtrelabnormalenboospft to set
	 */
	public void setPmuectxtrelabnormalenboospft(String pmuectxtrelabnormalenboospft) {
		this.pmuectxtrelabnormalenboospft = pmuectxtrelabnormalenboospft;
	}
	/**
	 * @return the pmuectxtrelabnormalenbpe
	 */
	public String getPmuectxtrelabnormalenbpe() {
		return pmuectxtrelabnormalenbpe;
	}
	/**
	 * @param pmuectxtrelabnormalenbpe the pmuectxtrelabnormalenbpe to set
	 */
	public void setPmuectxtrelabnormalenbpe(String pmuectxtrelabnormalenbpe) {
		this.pmuectxtrelabnormalenbpe = pmuectxtrelabnormalenbpe;
	}
	/**
	 * @return the pmuectxtrelabnormalenbsir
	 */
	public String getPmuectxtrelabnormalenbsir() {
		return pmuectxtrelabnormalenbsir;
	}
	/**
	 * @param pmuectxtrelabnormalenbsir the pmuectxtrelabnormalenbsir to set
	 */
	public void setPmuectxtrelabnormalenbsir(String pmuectxtrelabnormalenbsir) {
		this.pmuectxtrelabnormalenbsir = pmuectxtrelabnormalenbsir;
	}
	/**
	 * @return the pmuectxtrelabnormalenbtuneout
	 */
	public String getPmuectxtrelabnormalenbtuneout() {
		return pmuectxtrelabnormalenbtuneout;
	}
	/**
	 * @param pmuectxtrelabnormalenbtuneout the pmuectxtrelabnormalenbtuneout to set
	 */
	public void setPmuectxtrelabnormalenbtuneout(
			String pmuectxtrelabnormalenbtuneout) {
		this.pmuectxtrelabnormalenbtuneout = pmuectxtrelabnormalenbtuneout;
	}
	/**
	 * @return the pmuectxtrelabnormalenbuelost
	 */
	public String getPmuectxtrelabnormalenbuelost() {
		return pmuectxtrelabnormalenbuelost;
	}
	/**
	 * @param pmuectxtrelabnormalenbuelost the pmuectxtrelabnormalenbuelost to set
	 */
	public void setPmuectxtrelabnormalenbuelost(String pmuectxtrelabnormalenbuelost) {
		this.pmuectxtrelabnormalenbuelost = pmuectxtrelabnormalenbuelost;
	}
	/**
	 * @return the pmuectxtrelabnormalenbuelostoos
	 */
	public String getPmuectxtrelabnormalenbuelostoos() {
		return pmuectxtrelabnormalenbuelostoos;
	}
	/**
	 * @param pmuectxtrelabnormalenbuelostoos the pmuectxtrelabnormalenbuelostoos to set
	 */
	public void setPmuectxtrelabnormalenbuelostoos(
			String pmuectxtrelabnormalenbuelostoos) {
		this.pmuectxtrelabnormalenbuelostoos = pmuectxtrelabnormalenbuelostoos;
	}
	/**
	 * @return the pmuectxtrelabnormalenbuelostoospft
	 */
	public String getPmuectxtrelabnormalenbuelostoospft() {
		return pmuectxtrelabnormalenbuelostoospft;
	}
	/**
	 * @param pmuectxtrelabnormalenbuelostoospft the pmuectxtrelabnormalenbuelostoospft to set
	 */
	public void setPmuectxtrelabnormalenbuelostoospft(
			String pmuectxtrelabnormalenbuelostoospft) {
		this.pmuectxtrelabnormalenbuelostoospft = pmuectxtrelabnormalenbuelostoospft;
	}
	/**
	 * @return the pmuectxtrelabnormalmme
	 */
	public String getPmuectxtrelabnormalmme() {
		return pmuectxtrelabnormalmme;
	}
	/**
	 * @param pmuectxtrelabnormalmme the pmuectxtrelabnormalmme to set
	 */
	public void setPmuectxtrelabnormalmme(String pmuectxtrelabnormalmme) {
		this.pmuectxtrelabnormalmme = pmuectxtrelabnormalmme;
	}
	/**
	 * @return the pmuectxtrelabnormalmmeact
	 */
	public String getPmuectxtrelabnormalmmeact() {
		return pmuectxtrelabnormalmmeact;
	}
	/**
	 * @param pmuectxtrelabnormalmmeact the pmuectxtrelabnormalmmeact to set
	 */
	public void setPmuectxtrelabnormalmmeact(String pmuectxtrelabnormalmmeact) {
		this.pmuectxtrelabnormalmmeact = pmuectxtrelabnormalmmeact;
	}
	/**
	 * @return the pmuectxtrelcsfbcdma1xrtt
	 */
	public String getPmuectxtrelcsfbcdma1xrtt() {
		return pmuectxtrelcsfbcdma1xrtt;
	}
	/**
	 * @param pmuectxtrelcsfbcdma1xrtt the pmuectxtrelcsfbcdma1xrtt to set
	 */
	public void setPmuectxtrelcsfbcdma1xrtt(String pmuectxtrelcsfbcdma1xrtt) {
		this.pmuectxtrelcsfbcdma1xrtt = pmuectxtrelcsfbcdma1xrtt;
	}
	/**
	 * @return the pmuectxtrelcsfbcdma1xrttem
	 */
	public String getPmuectxtrelcsfbcdma1xrttem() {
		return pmuectxtrelcsfbcdma1xrttem;
	}
	/**
	 * @param pmuectxtrelcsfbcdma1xrttem the pmuectxtrelcsfbcdma1xrttem to set
	 */
	public void setPmuectxtrelcsfbcdma1xrttem(String pmuectxtrelcsfbcdma1xrttem) {
		this.pmuectxtrelcsfbcdma1xrttem = pmuectxtrelcsfbcdma1xrttem;
	}
	/**
	 * @return the pmuectxtrelcsfbgsm
	 */
	public String getPmuectxtrelcsfbgsm() {
		return pmuectxtrelcsfbgsm;
	}
	/**
	 * @param pmuectxtrelcsfbgsm the pmuectxtrelcsfbgsm to set
	 */
	public void setPmuectxtrelcsfbgsm(String pmuectxtrelcsfbgsm) {
		this.pmuectxtrelcsfbgsm = pmuectxtrelcsfbgsm;
	}
	/**
	 * @return the pmuectxtrelcsfbgsmem
	 */
	public String getPmuectxtrelcsfbgsmem() {
		return pmuectxtrelcsfbgsmem;
	}
	/**
	 * @param pmuectxtrelcsfbgsmem the pmuectxtrelcsfbgsmem to set
	 */
	public void setPmuectxtrelcsfbgsmem(String pmuectxtrelcsfbgsmem) {
		this.pmuectxtrelcsfbgsmem = pmuectxtrelcsfbgsmem;
	}
	/**
	 * @return the pmuectxtrelcsfbhoprepfail1xrtt
	 */
	public String getPmuectxtrelcsfbhoprepfail1xrtt() {
		return pmuectxtrelcsfbhoprepfail1xrtt;
	}
	/**
	 * @param pmuectxtrelcsfbhoprepfail1xrtt the pmuectxtrelcsfbhoprepfail1xrtt to set
	 */
	public void setPmuectxtrelcsfbhoprepfail1xrtt(
			String pmuectxtrelcsfbhoprepfail1xrtt) {
		this.pmuectxtrelcsfbhoprepfail1xrtt = pmuectxtrelcsfbhoprepfail1xrtt;
	}
	/**
	 * @return the pmuectxtrelcsfbhoprepfail1xrttem
	 */
	public String getPmuectxtrelcsfbhoprepfail1xrttem() {
		return pmuectxtrelcsfbhoprepfail1xrttem;
	}
	/**
	 * @param pmuectxtrelcsfbhoprepfail1xrttem the pmuectxtrelcsfbhoprepfail1xrttem to set
	 */
	public void setPmuectxtrelcsfbhoprepfail1xrttem(
			String pmuectxtrelcsfbhoprepfail1xrttem) {
		this.pmuectxtrelcsfbhoprepfail1xrttem = pmuectxtrelcsfbhoprepfail1xrttem;
	}
	/**
	 * @return the pmuectxtrelcsfblimiteddualradiouecdma
	 */
	public String getPmuectxtrelcsfblimiteddualradiouecdma() {
		return pmuectxtrelcsfblimiteddualradiouecdma;
	}
	/**
	 * @param pmuectxtrelcsfblimiteddualradiouecdma the pmuectxtrelcsfblimiteddualradiouecdma to set
	 */
	public void setPmuectxtrelcsfblimiteddualradiouecdma(
			String pmuectxtrelcsfblimiteddualradiouecdma) {
		this.pmuectxtrelcsfblimiteddualradiouecdma = pmuectxtrelcsfblimiteddualradiouecdma;
	}
	/**
	 * @return the pmuectxtrelcsfbmeasto1xrtt
	 */
	public String getPmuectxtrelcsfbmeasto1xrtt() {
		return pmuectxtrelcsfbmeasto1xrtt;
	}
	/**
	 * @param pmuectxtrelcsfbmeasto1xrtt the pmuectxtrelcsfbmeasto1xrtt to set
	 */
	public void setPmuectxtrelcsfbmeasto1xrtt(String pmuectxtrelcsfbmeasto1xrtt) {
		this.pmuectxtrelcsfbmeasto1xrtt = pmuectxtrelcsfbmeasto1xrtt;
	}
	/**
	 * @return the pmuectxtrelcsfbmeasto1xrttem
	 */
	public String getPmuectxtrelcsfbmeasto1xrttem() {
		return pmuectxtrelcsfbmeasto1xrttem;
	}
	/**
	 * @param pmuectxtrelcsfbmeasto1xrttem the pmuectxtrelcsfbmeasto1xrttem to set
	 */
	public void setPmuectxtrelcsfbmeasto1xrttem(String pmuectxtrelcsfbmeasto1xrttem) {
		this.pmuectxtrelcsfbmeasto1xrttem = pmuectxtrelcsfbmeasto1xrttem;
	}
	/**
	 * @return the pmuectxtrelcsfbtdscdma
	 */
	public String getPmuectxtrelcsfbtdscdma() {
		return pmuectxtrelcsfbtdscdma;
	}
	/**
	 * @param pmuectxtrelcsfbtdscdma the pmuectxtrelcsfbtdscdma to set
	 */
	public void setPmuectxtrelcsfbtdscdma(String pmuectxtrelcsfbtdscdma) {
		this.pmuectxtrelcsfbtdscdma = pmuectxtrelcsfbtdscdma;
	}
	/**
	 * @return the pmuectxtrelcsfbtdscdmaem
	 */
	public String getPmuectxtrelcsfbtdscdmaem() {
		return pmuectxtrelcsfbtdscdmaem;
	}
	/**
	 * @param pmuectxtrelcsfbtdscdmaem the pmuectxtrelcsfbtdscdmaem to set
	 */
	public void setPmuectxtrelcsfbtdscdmaem(String pmuectxtrelcsfbtdscdmaem) {
		this.pmuectxtrelcsfbtdscdmaem = pmuectxtrelcsfbtdscdmaem;
	}
	/**
	 * @return the pmuectxtrelcsfbulhopreptxto1xrtt
	 */
	public String getPmuectxtrelcsfbulhopreptxto1xrtt() {
		return pmuectxtrelcsfbulhopreptxto1xrtt;
	}
	/**
	 * @param pmuectxtrelcsfbulhopreptxto1xrtt the pmuectxtrelcsfbulhopreptxto1xrtt to set
	 */
	public void setPmuectxtrelcsfbulhopreptxto1xrtt(
			String pmuectxtrelcsfbulhopreptxto1xrtt) {
		this.pmuectxtrelcsfbulhopreptxto1xrtt = pmuectxtrelcsfbulhopreptxto1xrtt;
	}
	/**
	 * @return the pmuectxtrelcsfbulhopreptxto1xrttem
	 */
	public String getPmuectxtrelcsfbulhopreptxto1xrttem() {
		return pmuectxtrelcsfbulhopreptxto1xrttem;
	}
	/**
	 * @param pmuectxtrelcsfbulhopreptxto1xrttem the pmuectxtrelcsfbulhopreptxto1xrttem to set
	 */
	public void setPmuectxtrelcsfbulhopreptxto1xrttem(
			String pmuectxtrelcsfbulhopreptxto1xrttem) {
		this.pmuectxtrelcsfbulhopreptxto1xrttem = pmuectxtrelcsfbulhopreptxto1xrttem;
	}
	/**
	 * @return the pmuectxtrelcsfbwcdma
	 */
	public String getPmuectxtrelcsfbwcdma() {
		return pmuectxtrelcsfbwcdma;
	}
	/**
	 * @param pmuectxtrelcsfbwcdma the pmuectxtrelcsfbwcdma to set
	 */
	public void setPmuectxtrelcsfbwcdma(String pmuectxtrelcsfbwcdma) {
		this.pmuectxtrelcsfbwcdma = pmuectxtrelcsfbwcdma;
	}
	/**
	 * @return the pmuectxtrelcsfbwcdmaem
	 */
	public String getPmuectxtrelcsfbwcdmaem() {
		return pmuectxtrelcsfbwcdmaem;
	}
	/**
	 * @param pmuectxtrelcsfbwcdmaem the pmuectxtrelcsfbwcdmaem to set
	 */
	public void setPmuectxtrelcsfbwcdmaem(String pmuectxtrelcsfbwcdmaem) {
		this.pmuectxtrelcsfbwcdmaem = pmuectxtrelcsfbwcdmaem;
	}
	/**
	 * @return the pmuectxtrelmme
	 */
	public String getPmuectxtrelmme() {
		return pmuectxtrelmme;
	}
	/**
	 * @param pmuectxtrelmme the pmuectxtrelmme to set
	 */
	public void setPmuectxtrelmme(String pmuectxtrelmme) {
		this.pmuectxtrelmme = pmuectxtrelmme;
	}
	/**
	 * @return the pmuectxtrelmmeact
	 */
	public String getPmuectxtrelmmeact() {
		return pmuectxtrelmmeact;
	}
	/**
	 * @param pmuectxtrelmmeact the pmuectxtrelmmeact to set
	 */
	public void setPmuectxtrelmmeact(String pmuectxtrelmmeact) {
		this.pmuectxtrelmmeact = pmuectxtrelmmeact;
	}
	/**
	 * @return the pmuectxtrelmmeactho
	 */
	public String getPmuectxtrelmmeactho() {
		return pmuectxtrelmmeactho;
	}
	/**
	 * @param pmuectxtrelmmeactho the pmuectxtrelmmeactho to set
	 */
	public void setPmuectxtrelmmeactho(String pmuectxtrelmmeactho) {
		this.pmuectxtrelmmeactho = pmuectxtrelmmeactho;
	}
	/**
	 * @return the pmuectxtrelmmeho
	 */
	public String getPmuectxtrelmmeho() {
		return pmuectxtrelmmeho;
	}
	/**
	 * @param pmuectxtrelmmeho the pmuectxtrelmmeho to set
	 */
	public void setPmuectxtrelmmeho(String pmuectxtrelmmeho) {
		this.pmuectxtrelmmeho = pmuectxtrelmmeho;
	}
	/**
	 * @return the pmuectxtrelnacccsfbgsm
	 */
	public String getPmuectxtrelnacccsfbgsm() {
		return pmuectxtrelnacccsfbgsm;
	}
	/**
	 * @param pmuectxtrelnacccsfbgsm the pmuectxtrelnacccsfbgsm to set
	 */
	public void setPmuectxtrelnacccsfbgsm(String pmuectxtrelnacccsfbgsm) {
		this.pmuectxtrelnacccsfbgsm = pmuectxtrelnacccsfbgsm;
	}
	/**
	 * @return the pmuectxtrelnacccsfbgsmem
	 */
	public String getPmuectxtrelnacccsfbgsmem() {
		return pmuectxtrelnacccsfbgsmem;
	}
	/**
	 * @param pmuectxtrelnacccsfbgsmem the pmuectxtrelnacccsfbgsmem to set
	 */
	public void setPmuectxtrelnacccsfbgsmem(String pmuectxtrelnacccsfbgsmem) {
		this.pmuectxtrelnacccsfbgsmem = pmuectxtrelnacccsfbgsmem;
	}
	/**
	 * @return the pmuectxtrelnacccsfbwcdma
	 */
	public String getPmuectxtrelnacccsfbwcdma() {
		return pmuectxtrelnacccsfbwcdma;
	}
	/**
	 * @param pmuectxtrelnacccsfbwcdma the pmuectxtrelnacccsfbwcdma to set
	 */
	public void setPmuectxtrelnacccsfbwcdma(String pmuectxtrelnacccsfbwcdma) {
		this.pmuectxtrelnacccsfbwcdma = pmuectxtrelnacccsfbwcdma;
	}
	/**
	 * @return the pmuectxtrelnacccsfbwcdmaem
	 */
	public String getPmuectxtrelnacccsfbwcdmaem() {
		return pmuectxtrelnacccsfbwcdmaem;
	}
	/**
	 * @param pmuectxtrelnacccsfbwcdmaem the pmuectxtrelnacccsfbwcdmaem to set
	 */
	public void setPmuectxtrelnacccsfbwcdmaem(String pmuectxtrelnacccsfbwcdmaem) {
		this.pmuectxtrelnacccsfbwcdmaem = pmuectxtrelnacccsfbwcdmaem;
	}
	/**
	 * @return the pmuectxtrelnaccscgsm
	 */
	public String getPmuectxtrelnaccscgsm() {
		return pmuectxtrelnaccscgsm;
	}
	/**
	 * @param pmuectxtrelnaccscgsm the pmuectxtrelnaccscgsm to set
	 */
	public void setPmuectxtrelnaccscgsm(String pmuectxtrelnaccscgsm) {
		this.pmuectxtrelnaccscgsm = pmuectxtrelnaccscgsm;
	}
	/**
	 * @return the pmuectxtrelnaccscwcdma
	 */
	public String getPmuectxtrelnaccscwcdma() {
		return pmuectxtrelnaccscwcdma;
	}
	/**
	 * @param pmuectxtrelnaccscwcdma the pmuectxtrelnaccscwcdma to set
	 */
	public void setPmuectxtrelnaccscwcdma(String pmuectxtrelnaccscwcdma) {
		this.pmuectxtrelnaccscwcdma = pmuectxtrelnaccscwcdma;
	}
	/**
	 * @return the pmuectxtrelnormalenb
	 */
	public String getPmuectxtrelnormalenb() {
		return pmuectxtrelnormalenb;
	}
	/**
	 * @param pmuectxtrelnormalenb the pmuectxtrelnormalenb to set
	 */
	public void setPmuectxtrelnormalenb(String pmuectxtrelnormalenb) {
		this.pmuectxtrelnormalenb = pmuectxtrelnormalenb;
	}
	/**
	 * @return the pmuectxtrelnormalenbact
	 */
	public String getPmuectxtrelnormalenbact() {
		return pmuectxtrelnormalenbact;
	}
	/**
	 * @param pmuectxtrelnormalenbact the pmuectxtrelnormalenbact to set
	 */
	public void setPmuectxtrelnormalenbact(String pmuectxtrelnormalenbact) {
		this.pmuectxtrelnormalenbact = pmuectxtrelnormalenbact;
	}
	/**
	 * @return the pmuectxtrelnormalenbtuneout
	 */
	public String getPmuectxtrelnormalenbtuneout() {
		return pmuectxtrelnormalenbtuneout;
	}
	/**
	 * @param pmuectxtrelnormalenbtuneout the pmuectxtrelnormalenbtuneout to set
	 */
	public void setPmuectxtrelnormalenbtuneout(String pmuectxtrelnormalenbtuneout) {
		this.pmuectxtrelnormalenbtuneout = pmuectxtrelnormalenbtuneout;
	}
	/**
	 * @return the pmuectxtrelsc1xrttulsinr
	 */
	public String getPmuectxtrelsc1xrttulsinr() {
		return pmuectxtrelsc1xrttulsinr;
	}
	/**
	 * @param pmuectxtrelsc1xrttulsinr the pmuectxtrelsc1xrttulsinr to set
	 */
	public void setPmuectxtrelsc1xrttulsinr(String pmuectxtrelsc1xrttulsinr) {
		this.pmuectxtrelsc1xrttulsinr = pmuectxtrelsc1xrttulsinr;
	}
	/**
	 * @return the pmuectxtrelsccdma
	 */
	public String getPmuectxtrelsccdma() {
		return pmuectxtrelsccdma;
	}
	/**
	 * @param pmuectxtrelsccdma the pmuectxtrelsccdma to set
	 */
	public void setPmuectxtrelsccdma(String pmuectxtrelsccdma) {
		this.pmuectxtrelsccdma = pmuectxtrelsccdma;
	}
	/**
	 * @return the pmuectxtrelsccdmaa2rsrp
	 */
	public String getPmuectxtrelsccdmaa2rsrp() {
		return pmuectxtrelsccdmaa2rsrp;
	}
	/**
	 * @param pmuectxtrelsccdmaa2rsrp the pmuectxtrelsccdmaa2rsrp to set
	 */
	public void setPmuectxtrelsccdmaa2rsrp(String pmuectxtrelsccdmaa2rsrp) {
		this.pmuectxtrelsccdmaa2rsrp = pmuectxtrelsccdmaa2rsrp;
	}
	/**
	 * @return the pmuectxtrelsccdmaa2rsrq
	 */
	public String getPmuectxtrelsccdmaa2rsrq() {
		return pmuectxtrelsccdmaa2rsrq;
	}
	/**
	 * @param pmuectxtrelsccdmaa2rsrq the pmuectxtrelsccdmaa2rsrq to set
	 */
	public void setPmuectxtrelsccdmaa2rsrq(String pmuectxtrelsccdmaa2rsrq) {
		this.pmuectxtrelsccdmaa2rsrq = pmuectxtrelsccdmaa2rsrq;
	}
	/**
	 * @return the pmuectxtrelsccdmab2rsrp
	 */
	public String getPmuectxtrelsccdmab2rsrp() {
		return pmuectxtrelsccdmab2rsrp;
	}
	/**
	 * @param pmuectxtrelsccdmab2rsrp the pmuectxtrelsccdmab2rsrp to set
	 */
	public void setPmuectxtrelsccdmab2rsrp(String pmuectxtrelsccdmab2rsrp) {
		this.pmuectxtrelsccdmab2rsrp = pmuectxtrelsccdmab2rsrp;
	}
	/**
	 * @return the pmuectxtrelsccdmab2rsrq
	 */
	public String getPmuectxtrelsccdmab2rsrq() {
		return pmuectxtrelsccdmab2rsrq;
	}
	/**
	 * @param pmuectxtrelsccdmab2rsrq the pmuectxtrelsccdmab2rsrq to set
	 */
	public void setPmuectxtrelsccdmab2rsrq(String pmuectxtrelsccdmab2rsrq) {
		this.pmuectxtrelsccdmab2rsrq = pmuectxtrelsccdmab2rsrq;
	}
	/**
	 * @return the pmuectxtrelsccdmaulsinr
	 */
	public String getPmuectxtrelsccdmaulsinr() {
		return pmuectxtrelsccdmaulsinr;
	}
	/**
	 * @param pmuectxtrelsccdmaulsinr the pmuectxtrelsccdmaulsinr to set
	 */
	public void setPmuectxtrelsccdmaulsinr(String pmuectxtrelsccdmaulsinr) {
		this.pmuectxtrelsccdmaulsinr = pmuectxtrelsccdmaulsinr;
	}
	/**
	 * @return the pmuectxtrelsceutra
	 */
	public String getPmuectxtrelsceutra() {
		return pmuectxtrelsceutra;
	}
	/**
	 * @param pmuectxtrelsceutra the pmuectxtrelsceutra to set
	 */
	public void setPmuectxtrelsceutra(String pmuectxtrelsceutra) {
		this.pmuectxtrelsceutra = pmuectxtrelsceutra;
	}
	/**
	 * @return the pmuectxtrelsceutraa2rsrp
	 */
	public String getPmuectxtrelsceutraa2rsrp() {
		return pmuectxtrelsceutraa2rsrp;
	}
	/**
	 * @param pmuectxtrelsceutraa2rsrp the pmuectxtrelsceutraa2rsrp to set
	 */
	public void setPmuectxtrelsceutraa2rsrp(String pmuectxtrelsceutraa2rsrp) {
		this.pmuectxtrelsceutraa2rsrp = pmuectxtrelsceutraa2rsrp;
	}
	/**
	 * @return the pmuectxtrelsceutraa2rsrq
	 */
	public String getPmuectxtrelsceutraa2rsrq() {
		return pmuectxtrelsceutraa2rsrq;
	}
	/**
	 * @param pmuectxtrelsceutraa2rsrq the pmuectxtrelsceutraa2rsrq to set
	 */
	public void setPmuectxtrelsceutraa2rsrq(String pmuectxtrelsceutraa2rsrq) {
		this.pmuectxtrelsceutraa2rsrq = pmuectxtrelsceutraa2rsrq;
	}
	/**
	 * @return the pmuectxtrelsceutrabestcellrsrp
	 */
	public String getPmuectxtrelsceutrabestcellrsrp() {
		return pmuectxtrelsceutrabestcellrsrp;
	}
	/**
	 * @param pmuectxtrelsceutrabestcellrsrp the pmuectxtrelsceutrabestcellrsrp to set
	 */
	public void setPmuectxtrelsceutrabestcellrsrp(
			String pmuectxtrelsceutrabestcellrsrp) {
		this.pmuectxtrelsceutrabestcellrsrp = pmuectxtrelsceutrabestcellrsrp;
	}
	/**
	 * @return the pmuectxtrelsceutrabestcellrsrq
	 */
	public String getPmuectxtrelsceutrabestcellrsrq() {
		return pmuectxtrelsceutrabestcellrsrq;
	}
	/**
	 * @param pmuectxtrelsceutrabestcellrsrq the pmuectxtrelsceutrabestcellrsrq to set
	 */
	public void setPmuectxtrelsceutrabestcellrsrq(
			String pmuectxtrelsceutrabestcellrsrq) {
		this.pmuectxtrelsceutrabestcellrsrq = pmuectxtrelsceutrabestcellrsrq;
	}
	/**
	 * @return the pmuectxtrelsceutraulsinr
	 */
	public String getPmuectxtrelsceutraulsinr() {
		return pmuectxtrelsceutraulsinr;
	}
	/**
	 * @param pmuectxtrelsceutraulsinr the pmuectxtrelsceutraulsinr to set
	 */
	public void setPmuectxtrelsceutraulsinr(String pmuectxtrelsceutraulsinr) {
		this.pmuectxtrelsceutraulsinr = pmuectxtrelsceutraulsinr;
	}
	/**
	 * @return the pmuectxtrelscgsm
	 */
	public String getPmuectxtrelscgsm() {
		return pmuectxtrelscgsm;
	}
	/**
	 * @param pmuectxtrelscgsm the pmuectxtrelscgsm to set
	 */
	public void setPmuectxtrelscgsm(String pmuectxtrelscgsm) {
		this.pmuectxtrelscgsm = pmuectxtrelscgsm;
	}
	/**
	 * @return the pmuectxtrelscgsma2rsrp
	 */
	public String getPmuectxtrelscgsma2rsrp() {
		return pmuectxtrelscgsma2rsrp;
	}
	/**
	 * @param pmuectxtrelscgsma2rsrp the pmuectxtrelscgsma2rsrp to set
	 */
	public void setPmuectxtrelscgsma2rsrp(String pmuectxtrelscgsma2rsrp) {
		this.pmuectxtrelscgsma2rsrp = pmuectxtrelscgsma2rsrp;
	}
	/**
	 * @return the pmuectxtrelscgsma2rsrq
	 */
	public String getPmuectxtrelscgsma2rsrq() {
		return pmuectxtrelscgsma2rsrq;
	}
	/**
	 * @param pmuectxtrelscgsma2rsrq the pmuectxtrelscgsma2rsrq to set
	 */
	public void setPmuectxtrelscgsma2rsrq(String pmuectxtrelscgsma2rsrq) {
		this.pmuectxtrelscgsma2rsrq = pmuectxtrelscgsma2rsrq;
	}
	/**
	 * @return the pmuectxtrelscgsmb2rsrp
	 */
	public String getPmuectxtrelscgsmb2rsrp() {
		return pmuectxtrelscgsmb2rsrp;
	}
	/**
	 * @param pmuectxtrelscgsmb2rsrp the pmuectxtrelscgsmb2rsrp to set
	 */
	public void setPmuectxtrelscgsmb2rsrp(String pmuectxtrelscgsmb2rsrp) {
		this.pmuectxtrelscgsmb2rsrp = pmuectxtrelscgsmb2rsrp;
	}
	/**
	 * @return the pmuectxtrelscgsmb2rsrq
	 */
	public String getPmuectxtrelscgsmb2rsrq() {
		return pmuectxtrelscgsmb2rsrq;
	}
	/**
	 * @param pmuectxtrelscgsmb2rsrq the pmuectxtrelscgsmb2rsrq to set
	 */
	public void setPmuectxtrelscgsmb2rsrq(String pmuectxtrelscgsmb2rsrq) {
		this.pmuectxtrelscgsmb2rsrq = pmuectxtrelscgsmb2rsrq;
	}
	/**
	 * @return the pmuectxtrelscgsmulsinr
	 */
	public String getPmuectxtrelscgsmulsinr() {
		return pmuectxtrelscgsmulsinr;
	}
	/**
	 * @param pmuectxtrelscgsmulsinr the pmuectxtrelscgsmulsinr to set
	 */
	public void setPmuectxtrelscgsmulsinr(String pmuectxtrelscgsmulsinr) {
		this.pmuectxtrelscgsmulsinr = pmuectxtrelscgsmulsinr;
	}
	/**
	 * @return the pmuectxtrelsctdscdma
	 */
	public String getPmuectxtrelsctdscdma() {
		return pmuectxtrelsctdscdma;
	}
	/**
	 * @param pmuectxtrelsctdscdma the pmuectxtrelsctdscdma to set
	 */
	public void setPmuectxtrelsctdscdma(String pmuectxtrelsctdscdma) {
		this.pmuectxtrelsctdscdma = pmuectxtrelsctdscdma;
	}
	/**
	 * @return the pmuectxtrelscutrana2rsrp
	 */
	public String getPmuectxtrelscutrana2rsrp() {
		return pmuectxtrelscutrana2rsrp;
	}
	/**
	 * @param pmuectxtrelscutrana2rsrp the pmuectxtrelscutrana2rsrp to set
	 */
	public void setPmuectxtrelscutrana2rsrp(String pmuectxtrelscutrana2rsrp) {
		this.pmuectxtrelscutrana2rsrp = pmuectxtrelscutrana2rsrp;
	}
	/**
	 * @return the pmuectxtrelscutrana2rsrq
	 */
	public String getPmuectxtrelscutrana2rsrq() {
		return pmuectxtrelscutrana2rsrq;
	}
	/**
	 * @param pmuectxtrelscutrana2rsrq the pmuectxtrelscutrana2rsrq to set
	 */
	public void setPmuectxtrelscutrana2rsrq(String pmuectxtrelscutrana2rsrq) {
		this.pmuectxtrelscutrana2rsrq = pmuectxtrelscutrana2rsrq;
	}
	/**
	 * @return the pmuectxtrelscutranb2rsrp
	 */
	public String getPmuectxtrelscutranb2rsrp() {
		return pmuectxtrelscutranb2rsrp;
	}
	/**
	 * @param pmuectxtrelscutranb2rsrp the pmuectxtrelscutranb2rsrp to set
	 */
	public void setPmuectxtrelscutranb2rsrp(String pmuectxtrelscutranb2rsrp) {
		this.pmuectxtrelscutranb2rsrp = pmuectxtrelscutranb2rsrp;
	}
	/**
	 * @return the pmuectxtrelscutranb2rsrq
	 */
	public String getPmuectxtrelscutranb2rsrq() {
		return pmuectxtrelscutranb2rsrq;
	}
	/**
	 * @param pmuectxtrelscutranb2rsrq the pmuectxtrelscutranb2rsrq to set
	 */
	public void setPmuectxtrelscutranb2rsrq(String pmuectxtrelscutranb2rsrq) {
		this.pmuectxtrelscutranb2rsrq = pmuectxtrelscutranb2rsrq;
	}
	/**
	 * @return the pmuectxtrelscutraulsinr
	 */
	public String getPmuectxtrelscutraulsinr() {
		return pmuectxtrelscutraulsinr;
	}
	/**
	 * @param pmuectxtrelscutraulsinr the pmuectxtrelscutraulsinr to set
	 */
	public void setPmuectxtrelscutraulsinr(String pmuectxtrelscutraulsinr) {
		this.pmuectxtrelscutraulsinr = pmuectxtrelscutraulsinr;
	}
	/**
	 * @return the pmuectxtrelscwcdma
	 */
	public String getPmuectxtrelscwcdma() {
		return pmuectxtrelscwcdma;
	}
	/**
	 * @param pmuectxtrelscwcdma the pmuectxtrelscwcdma to set
	 */
	public void setPmuectxtrelscwcdma(String pmuectxtrelscwcdma) {
		this.pmuectxtrelscwcdma = pmuectxtrelscwcdma;
	}
	/**
	 * @return the pmuectxtrelsrvcca2critical1xrtt
	 */
	public String getPmuectxtrelsrvcca2critical1xrtt() {
		return pmuectxtrelsrvcca2critical1xrtt;
	}
	/**
	 * @param pmuectxtrelsrvcca2critical1xrtt the pmuectxtrelsrvcca2critical1xrtt to set
	 */
	public void setPmuectxtrelsrvcca2critical1xrtt(
			String pmuectxtrelsrvcca2critical1xrtt) {
		this.pmuectxtrelsrvcca2critical1xrtt = pmuectxtrelsrvcca2critical1xrtt;
	}
	/**
	 * @return the pmuectxtrelsrvccmeasto1xrtt
	 */
	public String getPmuectxtrelsrvccmeasto1xrtt() {
		return pmuectxtrelsrvccmeasto1xrtt;
	}
	/**
	 * @param pmuectxtrelsrvccmeasto1xrtt the pmuectxtrelsrvccmeasto1xrtt to set
	 */
	public void setPmuectxtrelsrvccmeasto1xrtt(String pmuectxtrelsrvccmeasto1xrtt) {
		this.pmuectxtrelsrvccmeasto1xrtt = pmuectxtrelsrvccmeasto1xrtt;
	}
	/**
	 * @return the pmuectxtretainarphigh
	 */
	public String getPmuectxtretainarphigh() {
		return pmuectxtretainarphigh;
	}
	/**
	 * @param pmuectxtretainarphigh the pmuectxtretainarphigh to set
	 */
	public void setPmuectxtretainarphigh(String pmuectxtretainarphigh) {
		this.pmuectxtretainarphigh = pmuectxtretainarphigh;
	}
	/**
	 * @return the pmuemeasattcsfb1xrtt
	 */
	public String getPmuemeasattcsfb1xrtt() {
		return pmuemeasattcsfb1xrtt;
	}
	/**
	 * @param pmuemeasattcsfb1xrtt the pmuemeasattcsfb1xrtt to set
	 */
	public void setPmuemeasattcsfb1xrtt(String pmuemeasattcsfb1xrtt) {
		this.pmuemeasattcsfb1xrtt = pmuemeasattcsfb1xrtt;
	}
	/**
	 * @return the pmuemeasattcsfb1xrttem
	 */
	public String getPmuemeasattcsfb1xrttem() {
		return pmuemeasattcsfb1xrttem;
	}
	/**
	 * @param pmuemeasattcsfb1xrttem the pmuemeasattcsfb1xrttem to set
	 */
	public void setPmuemeasattcsfb1xrttem(String pmuemeasattcsfb1xrttem) {
		this.pmuemeasattcsfb1xrttem = pmuemeasattcsfb1xrttem;
	}
	/**
	 * @return the pmUeThpTimeDl
	 */
	public String getPmUeThpTimeDl() {
		return pmUeThpTimeDl;
	}
	/**
	 * @param pmuethptimedl the pmuethptimedl to set
	 */
	public void setPmUeThpTimeDl(String pmUeThpTimeDl) {
		this.pmUeThpTimeDl = pmUeThpTimeDl;
	}
	/**
	 * @return the pmuethptimedlca
	 */
	public String getPmuethptimedlca() {
		return pmuethptimedlca;
	}
	/**
	 * @param pmuethptimedlca the pmuethptimedlca to set
	 */
	public void setPmuethptimedlca(String pmuethptimedlca) {
		this.pmuethptimedlca = pmuethptimedlca;
	}
	/**
	 * @return the pmUeThpTimeUl
	 */
	public String getPmUeThpTimeUl() {
		return pmUeThpTimeUl;
	}
	/**
	 * @param pmuethptimeul the pmuethptimeul to set
	 */
	public void setPmUeThpTimeUl(String pmUeThpTimeUl) {
		this.pmUeThpTimeUl = pmUeThpTimeUl;
	}
	/**
	 * @return the pmuethptimeulca
	 */
	public String getPmuethptimeulca() {
		return pmuethptimeulca;
	}
	/**
	 * @param pmuethptimeulca the pmuethptimeulca to set
	 */
	public void setPmuethptimeulca(String pmuethptimeulca) {
		this.pmuethptimeulca = pmuethptimeulca;
	}
	/**
	 * @return the pmuethptimeulrs
	 */
	public String getPmuethptimeulrs() {
		return pmuethptimeulrs;
	}
	/**
	 * @param pmuethptimeulrs the pmuethptimeulrs to set
	 */
	public void setPmuethptimeulrs(String pmuethptimeulrs) {
		this.pmuethptimeulrs = pmuethptimeulrs;
	}
	/**
	 * @return the pmUeThpVolUl
	 */
	public String getPmUeThpVolUl() {
		return pmUeThpVolUl;
	}
	/**
	 * @param pmuethpvolul the pmuethpvolul to set
	 */
	public void setPmUeThpVolUl(String pmUeThpVolUl) {
		this.pmUeThpVolUl = pmUeThpVolUl;
	}
	/**
	 * @return the pmuethpvolulca
	 */
	public String getPmuethpvolulca() {
		return pmuethpvolulca;
	}
	/**
	 * @param pmuethpvolulca the pmuethpvolulca to set
	 */
	public void setPmuethpvolulca(String pmuethpvolulca) {
		this.pmuethpvolulca = pmuethpvolulca;
	}
	/**
	 * @return the pmulgrantsdetectedpuschndo
	 */
	public String getPmulgrantsdetectedpuschndo() {
		return pmulgrantsdetectedpuschndo;
	}
	/**
	 * @param pmulgrantsdetectedpuschndo the pmulgrantsdetectedpuschndo to set
	 */
	public void setPmulgrantsdetectedpuschndo(String pmulgrantsdetectedpuschndo) {
		this.pmulgrantsdetectedpuschndo = pmulgrantsdetectedpuschndo;
	}
	/**
	 * @return the pmulgrantsdetectedpuschvoltendo
	 */
	public String getPmulgrantsdetectedpuschvoltendo() {
		return pmulgrantsdetectedpuschvoltendo;
	}
	/**
	 * @param pmulgrantsdetectedpuschvoltendo the pmulgrantsdetectedpuschvoltendo to set
	 */
	public void setPmulgrantsdetectedpuschvoltendo(
			String pmulgrantsdetectedpuschvoltendo) {
		this.pmulgrantsdetectedpuschvoltendo = pmulgrantsdetectedpuschvoltendo;
	}
	/**
	 * @return the pmulgrantstrans
	 */
	public String getPmulgrantstrans() {
		return pmulgrantstrans;
	}
	/**
	 * @param pmulgrantstrans the pmulgrantstrans to set
	 */
	public void setPmulgrantstrans(String pmulgrantstrans) {
		this.pmulgrantstrans = pmulgrantstrans;
	}
	/**
	 * @return the pmulgrantstransndo
	 */
	public String getPmulgrantstransndo() {
		return pmulgrantstransndo;
	}
	/**
	 * @param pmulgrantstransndo the pmulgrantstransndo to set
	 */
	public void setPmulgrantstransndo(String pmulgrantstransndo) {
		this.pmulgrantstransndo = pmulgrantstransndo;
	}
	/**
	 * @return the pmulgrantstransnoack
	 */
	public String getPmulgrantstransnoack() {
		return pmulgrantstransnoack;
	}
	/**
	 * @param pmulgrantstransnoack the pmulgrantstransnoack to set
	 */
	public void setPmulgrantstransnoack(String pmulgrantstransnoack) {
		this.pmulgrantstransnoack = pmulgrantstransnoack;
	}
	/**
	 * @return the pmulgrantstranspcell
	 */
	public String getPmulgrantstranspcell() {
		return pmulgrantstranspcell;
	}
	/**
	 * @param pmulgrantstranspcell the pmulgrantstranspcell to set
	 */
	public void setPmulgrantstranspcell(String pmulgrantstranspcell) {
		this.pmulgrantstranspcell = pmulgrantstranspcell;
	}
	/**
	 * @return the pmulgrantstranspcellnoack
	 */
	public String getPmulgrantstranspcellnoack() {
		return pmulgrantstranspcellnoack;
	}
	/**
	 * @param pmulgrantstranspcellnoack the pmulgrantstranspcellnoack to set
	 */
	public void setPmulgrantstranspcellnoack(String pmulgrantstranspcellnoack) {
		this.pmulgrantstranspcellnoack = pmulgrantstranspcellnoack;
	}
	/**
	 * @return the pmulgrantstransvolte
	 */
	public String getPmulgrantstransvolte() {
		return pmulgrantstransvolte;
	}
	/**
	 * @param pmulgrantstransvolte the pmulgrantstransvolte to set
	 */
	public void setPmulgrantstransvolte(String pmulgrantstransvolte) {
		this.pmulgrantstransvolte = pmulgrantstransvolte;
	}
	/**
	 * @return the pmulgrantstransvoltendo
	 */
	public String getPmulgrantstransvoltendo() {
		return pmulgrantstransvoltendo;
	}
	/**
	 * @param pmulgrantstransvoltendo the pmulgrantstransvoltendo to set
	 */
	public void setPmulgrantstransvoltendo(String pmulgrantstransvoltendo) {
		this.pmulgrantstransvoltendo = pmulgrantstransvoltendo;
	}
	/**
	 * @return the pmulgrantstransvoltenoack
	 */
	public String getPmulgrantstransvoltenoack() {
		return pmulgrantstransvoltenoack;
	}
	/**
	 * @param pmulgrantstransvoltenoack the pmulgrantstransvoltenoack to set
	 */
	public void setPmulgrantstransvoltenoack(String pmulgrantstransvoltenoack) {
		this.pmulgrantstransvoltenoack = pmulgrantstransvoltenoack;
	}
	/**
	 * @return the pmulgrantswithdetectedpusch
	 */
	public String getPmulgrantswithdetectedpusch() {
		return pmulgrantswithdetectedpusch;
	}
	/**
	 * @param pmulgrantswithdetectedpusch the pmulgrantswithdetectedpusch to set
	 */
	public void setPmulgrantswithdetectedpusch(String pmulgrantswithdetectedpusch) {
		this.pmulgrantswithdetectedpusch = pmulgrantswithdetectedpusch;
	}
	/**
	 * @return the pmulgrantswithdetectedpuschpcell
	 */
	public String getPmulgrantswithdetectedpuschpcell() {
		return pmulgrantswithdetectedpuschpcell;
	}
	/**
	 * @param pmulgrantswithdetectedpuschpcell the pmulgrantswithdetectedpuschpcell to set
	 */
	public void setPmulgrantswithdetectedpuschpcell(
			String pmulgrantswithdetectedpuschpcell) {
		this.pmulgrantswithdetectedpuschpcell = pmulgrantswithdetectedpuschpcell;
	}
	/**
	 * @return the pmulgrantswithdetectedpuschvolte
	 */
	public String getPmulgrantswithdetectedpuschvolte() {
		return pmulgrantswithdetectedpuschvolte;
	}
	/**
	 * @param pmulgrantswithdetectedpuschvolte the pmulgrantswithdetectedpuschvolte to set
	 */
	public void setPmulgrantswithdetectedpuschvolte(
			String pmulgrantswithdetectedpuschvolte) {
		this.pmulgrantswithdetectedpuschvolte = pmulgrantswithdetectedpuschvolte;
	}
	/**
	 * @return the pmunackeduerelease
	 */
	public String getPmunackeduerelease() {
		return pmunackeduerelease;
	}
	/**
	 * @param pmunackeduerelease the pmunackeduerelease to set
	 */
	public void setPmunackeduerelease(String pmunackeduerelease) {
		this.pmunackeduerelease = pmunackeduerelease;
	}
	/**
	 * @return the pmvoipqualityrbullowsampl
	 */
	public String getPmvoipqualityrbullowsampl() {
		return pmvoipqualityrbullowsampl;
	}
	/**
	 * @param pmvoipqualityrbullowsampl the pmvoipqualityrbullowsampl to set
	 */
	public void setPmvoipqualityrbullowsampl(String pmvoipqualityrbullowsampl) {
		this.pmvoipqualityrbullowsampl = pmvoipqualityrbullowsampl;
	}
	/**
	 * @return the pmvoipqualityrbulnok
	 */
	public String getPmvoipqualityrbulnok() {
		return pmvoipqualityrbulnok;
	}
	/**
	 * @param pmvoipqualityrbulnok the pmvoipqualityrbulnok to set
	 */
	public void setPmvoipqualityrbulnok(String pmvoipqualityrbulnok) {
		this.pmvoipqualityrbulnok = pmvoipqualityrbulnok;
	}
	/**
	 * @return the pmvoipqualityrbulok
	 */
	public String getPmvoipqualityrbulok() {
		return pmvoipqualityrbulok;
	}
	/**
	 * @param pmvoipqualityrbulok the pmvoipqualityrbulok to set
	 */
	public void setPmvoipqualityrbulok(String pmvoipqualityrbulok) {
		this.pmvoipqualityrbulok = pmvoipqualityrbulok;
	}
	/**
	 * @return the pmvoipqualityueullowsampl
	 */
	public String getPmvoipqualityueullowsampl() {
		return pmvoipqualityueullowsampl;
	}
	/**
	 * @param pmvoipqualityueullowsampl the pmvoipqualityueullowsampl to set
	 */
	public void setPmvoipqualityueullowsampl(String pmvoipqualityueullowsampl) {
		this.pmvoipqualityueullowsampl = pmvoipqualityueullowsampl;
	}
	/**
	 * @return the pmVoipQualityUeUlNok
	 */
	public String getPmVoipQualityUeUlNok() {
		return pmVoipQualityUeUlNok;
	}
	/**
	 * @param pmvoipqualityueulnok the pmvoipqualityueulnok to set
	 */
	public void setPmVoipQualityUeUlNok(String pmVoipQualityUeUlNok) {
		this.pmVoipQualityUeUlNok = pmVoipQualityUeUlNok;
	}
	/**
	 * @return the pmVoipQualityUeUlOk
	 */
	public String getPmVoipQualityUeUlOk() {
		return pmVoipQualityUeUlOk;
	}
	/**
	 * @param pmvoipqualityueulok the pmvoipqualityueulok to set
	 */
	public void setPmVoipQualityUeUlOk(String pmVoipQualityUeUlOk) {
		this.pmVoipQualityUeUlOk = pmVoipQualityUeUlOk;
	}
	/**
	 * @return the pmwifiaccessallowed
	 */
	public String getPmwifiaccessallowed() {
		return pmwifiaccessallowed;
	}
	/**
	 * @param pmwifiaccessallowed the pmwifiaccessallowed to set
	 */
	public void setPmwifiaccessallowed(String pmwifiaccessallowed) {
		this.pmwifiaccessallowed = pmwifiaccessallowed;
	}
	/**
	 * @return the pmwifiaccessdecisionbywic
	 */
	public String getPmwifiaccessdecisionbywic() {
		return pmwifiaccessdecisionbywic;
	}
	/**
	 * @param pmwifiaccessdecisionbywic the pmwifiaccessdecisionbywic to set
	 */
	public void setPmwifiaccessdecisionbywic(String pmwifiaccessdecisionbywic) {
		this.pmwifiaccessdecisionbywic = pmwifiaccessdecisionbywic;
	}
	/**
	 * @return the pmwifiaccesseval
	 */
	public String getPmwifiaccesseval() {
		return pmwifiaccesseval;
	}
	/**
	 * @param pmwifiaccesseval the pmwifiaccesseval to set
	 */
	public void setPmwifiaccesseval(String pmwifiaccesseval) {
		this.pmwifiaccesseval = pmwifiaccesseval;
	}
	/**
	 * @return the pmwifiaccessevalfaillic
	 */
	public String getPmwifiaccessevalfaillic() {
		return pmwifiaccessevalfaillic;
	}
	/**
	 * @param pmwifiaccessevalfaillic the pmwifiaccessevalfaillic to set
	 */
	public void setPmwifiaccessevalfaillic(String pmwifiaccessevalfaillic) {
		this.pmwifiaccessevalfaillic = pmwifiaccessevalfaillic;
	}
	/**
	 * @return the pmwifiaccessrej
	 */
	public String getPmwifiaccessrej() {
		return pmwifiaccessrej;
	}
	/**
	 * @param pmwifiaccessrej the pmwifiaccessrej to set
	 */
	public void setPmwifiaccessrej(String pmwifiaccessrej) {
		this.pmwifiaccessrej = pmwifiaccessrej;
	}
	/**
	 * @return the pmztemporary1
	 */
	public String getPmztemporary1() {
		return pmztemporary1;
	}
	/**
	 * @param pmztemporary1 the pmztemporary1 to set
	 */
	public void setPmztemporary1(String pmztemporary1) {
		this.pmztemporary1 = pmztemporary1;
	}
	/**
	 * @return the pmztemporary10
	 */
	public String getPmztemporary10() {
		return pmztemporary10;
	}
	/**
	 * @param pmztemporary10 the pmztemporary10 to set
	 */
	public void setPmztemporary10(String pmztemporary10) {
		this.pmztemporary10 = pmztemporary10;
	}
	/**
	 * @return the pmztemporary11
	 */
	public String getPmztemporary11() {
		return pmztemporary11;
	}
	/**
	 * @param pmztemporary11 the pmztemporary11 to set
	 */
	public void setPmztemporary11(String pmztemporary11) {
		this.pmztemporary11 = pmztemporary11;
	}
	/**
	 * @return the pmztemporary110
	 */
	public String getPmztemporary110() {
		return pmztemporary110;
	}
	/**
	 * @param pmztemporary110 the pmztemporary110 to set
	 */
	public void setPmztemporary110(String pmztemporary110) {
		this.pmztemporary110 = pmztemporary110;
	}
	/**
	 * @return the pmztemporary111
	 */
	public String getPmztemporary111() {
		return pmztemporary111;
	}
	/**
	 * @param pmztemporary111 the pmztemporary111 to set
	 */
	public void setPmztemporary111(String pmztemporary111) {
		this.pmztemporary111 = pmztemporary111;
	}
	/**
	 * @return the pmztemporary112
	 */
	public String getPmztemporary112() {
		return pmztemporary112;
	}
	/**
	 * @param pmztemporary112 the pmztemporary112 to set
	 */
	public void setPmztemporary112(String pmztemporary112) {
		this.pmztemporary112 = pmztemporary112;
	}
	/**
	 * @return the pmztemporary113
	 */
	public String getPmztemporary113() {
		return pmztemporary113;
	}
	/**
	 * @param pmztemporary113 the pmztemporary113 to set
	 */
	public void setPmztemporary113(String pmztemporary113) {
		this.pmztemporary113 = pmztemporary113;
	}
	/**
	 * @return the pmztemporary114
	 */
	public String getPmztemporary114() {
		return pmztemporary114;
	}
	/**
	 * @param pmztemporary114 the pmztemporary114 to set
	 */
	public void setPmztemporary114(String pmztemporary114) {
		this.pmztemporary114 = pmztemporary114;
	}
	/**
	 * @return the pmztemporary115
	 */
	public String getPmztemporary115() {
		return pmztemporary115;
	}
	/**
	 * @param pmztemporary115 the pmztemporary115 to set
	 */
	public void setPmztemporary115(String pmztemporary115) {
		this.pmztemporary115 = pmztemporary115;
	}
	/**
	 * @return the pmztemporary116
	 */
	public String getPmztemporary116() {
		return pmztemporary116;
	}
	/**
	 * @param pmztemporary116 the pmztemporary116 to set
	 */
	public void setPmztemporary116(String pmztemporary116) {
		this.pmztemporary116 = pmztemporary116;
	}
	/**
	 * @return the pmztemporary117
	 */
	public String getPmztemporary117() {
		return pmztemporary117;
	}
	/**
	 * @param pmztemporary117 the pmztemporary117 to set
	 */
	public void setPmztemporary117(String pmztemporary117) {
		this.pmztemporary117 = pmztemporary117;
	}
	/**
	 * @return the pmztemporary118
	 */
	public String getPmztemporary118() {
		return pmztemporary118;
	}
	/**
	 * @param pmztemporary118 the pmztemporary118 to set
	 */
	public void setPmztemporary118(String pmztemporary118) {
		this.pmztemporary118 = pmztemporary118;
	}
	/**
	 * @return the pmztemporary119
	 */
	public String getPmztemporary119() {
		return pmztemporary119;
	}
	/**
	 * @param pmztemporary119 the pmztemporary119 to set
	 */
	public void setPmztemporary119(String pmztemporary119) {
		this.pmztemporary119 = pmztemporary119;
	}
	/**
	 * @return the pmztemporary12
	 */
	public String getPmztemporary12() {
		return pmztemporary12;
	}
	/**
	 * @param pmztemporary12 the pmztemporary12 to set
	 */
	public void setPmztemporary12(String pmztemporary12) {
		this.pmztemporary12 = pmztemporary12;
	}
	/**
	 * @return the pmztemporary120
	 */
	public String getPmztemporary120() {
		return pmztemporary120;
	}
	/**
	 * @param pmztemporary120 the pmztemporary120 to set
	 */
	public void setPmztemporary120(String pmztemporary120) {
		this.pmztemporary120 = pmztemporary120;
	}
	/**
	 * @return the pmztemporary121
	 */
	public String getPmztemporary121() {
		return pmztemporary121;
	}
	/**
	 * @param pmztemporary121 the pmztemporary121 to set
	 */
	public void setPmztemporary121(String pmztemporary121) {
		this.pmztemporary121 = pmztemporary121;
	}
	/**
	 * @return the pmztemporary122
	 */
	public String getPmztemporary122() {
		return pmztemporary122;
	}
	/**
	 * @param pmztemporary122 the pmztemporary122 to set
	 */
	public void setPmztemporary122(String pmztemporary122) {
		this.pmztemporary122 = pmztemporary122;
	}
	/**
	 * @return the pmztemporary123
	 */
	public String getPmztemporary123() {
		return pmztemporary123;
	}
	/**
	 * @param pmztemporary123 the pmztemporary123 to set
	 */
	public void setPmztemporary123(String pmztemporary123) {
		this.pmztemporary123 = pmztemporary123;
	}
	/**
	 * @return the pmztemporary124
	 */
	public String getPmztemporary124() {
		return pmztemporary124;
	}
	/**
	 * @param pmztemporary124 the pmztemporary124 to set
	 */
	public void setPmztemporary124(String pmztemporary124) {
		this.pmztemporary124 = pmztemporary124;
	}
	/**
	 * @return the pmztemporary125
	 */
	public String getPmztemporary125() {
		return pmztemporary125;
	}
	/**
	 * @param pmztemporary125 the pmztemporary125 to set
	 */
	public void setPmztemporary125(String pmztemporary125) {
		this.pmztemporary125 = pmztemporary125;
	}
	/**
	 * @return the pmztemporary126
	 */
	public String getPmztemporary126() {
		return pmztemporary126;
	}
	/**
	 * @param pmztemporary126 the pmztemporary126 to set
	 */
	public void setPmztemporary126(String pmztemporary126) {
		this.pmztemporary126 = pmztemporary126;
	}
	/**
	 * @return the pmztemporary127
	 */
	public String getPmztemporary127() {
		return pmztemporary127;
	}
	/**
	 * @param pmztemporary127 the pmztemporary127 to set
	 */
	public void setPmztemporary127(String pmztemporary127) {
		this.pmztemporary127 = pmztemporary127;
	}
	/**
	 * @return the pmztemporary128
	 */
	public String getPmztemporary128() {
		return pmztemporary128;
	}
	/**
	 * @param pmztemporary128 the pmztemporary128 to set
	 */
	public void setPmztemporary128(String pmztemporary128) {
		this.pmztemporary128 = pmztemporary128;
	}
	/**
	 * @return the pmztemporary129
	 */
	public String getPmztemporary129() {
		return pmztemporary129;
	}
	/**
	 * @param pmztemporary129 the pmztemporary129 to set
	 */
	public void setPmztemporary129(String pmztemporary129) {
		this.pmztemporary129 = pmztemporary129;
	}
	/**
	 * @return the pmztemporary13
	 */
	public String getPmztemporary13() {
		return pmztemporary13;
	}
	/**
	 * @param pmztemporary13 the pmztemporary13 to set
	 */
	public void setPmztemporary13(String pmztemporary13) {
		this.pmztemporary13 = pmztemporary13;
	}
	/**
	 * @return the pmztemporary130
	 */
	public String getPmztemporary130() {
		return pmztemporary130;
	}
	/**
	 * @param pmztemporary130 the pmztemporary130 to set
	 */
	public void setPmztemporary130(String pmztemporary130) {
		this.pmztemporary130 = pmztemporary130;
	}
	/**
	 * @return the pmztemporary136
	 */
	public String getPmztemporary136() {
		return pmztemporary136;
	}
	/**
	 * @param pmztemporary136 the pmztemporary136 to set
	 */
	public void setPmztemporary136(String pmztemporary136) {
		this.pmztemporary136 = pmztemporary136;
	}
	/**
	 * @return the pmztemporary137
	 */
	public String getPmztemporary137() {
		return pmztemporary137;
	}
	/**
	 * @param pmztemporary137 the pmztemporary137 to set
	 */
	public void setPmztemporary137(String pmztemporary137) {
		this.pmztemporary137 = pmztemporary137;
	}
	/**
	 * @return the pmztemporary138
	 */
	public String getPmztemporary138() {
		return pmztemporary138;
	}
	/**
	 * @param pmztemporary138 the pmztemporary138 to set
	 */
	public void setPmztemporary138(String pmztemporary138) {
		this.pmztemporary138 = pmztemporary138;
	}
	/**
	 * @return the pmztemporary139
	 */
	public String getPmztemporary139() {
		return pmztemporary139;
	}
	/**
	 * @param pmztemporary139 the pmztemporary139 to set
	 */
	public void setPmztemporary139(String pmztemporary139) {
		this.pmztemporary139 = pmztemporary139;
	}
	/**
	 * @return the pmztemporary14
	 */
	public String getPmztemporary14() {
		return pmztemporary14;
	}
	/**
	 * @param pmztemporary14 the pmztemporary14 to set
	 */
	public void setPmztemporary14(String pmztemporary14) {
		this.pmztemporary14 = pmztemporary14;
	}
	/**
	 * @return the pmztemporary140
	 */
	public String getPmztemporary140() {
		return pmztemporary140;
	}
	/**
	 * @param pmztemporary140 the pmztemporary140 to set
	 */
	public void setPmztemporary140(String pmztemporary140) {
		this.pmztemporary140 = pmztemporary140;
	}
	/**
	 * @return the pmztemporary141
	 */
	public String getPmztemporary141() {
		return pmztemporary141;
	}
	/**
	 * @param pmztemporary141 the pmztemporary141 to set
	 */
	public void setPmztemporary141(String pmztemporary141) {
		this.pmztemporary141 = pmztemporary141;
	}
	/**
	 * @return the pmztemporary142
	 */
	public String getPmztemporary142() {
		return pmztemporary142;
	}
	/**
	 * @param pmztemporary142 the pmztemporary142 to set
	 */
	public void setPmztemporary142(String pmztemporary142) {
		this.pmztemporary142 = pmztemporary142;
	}
	/**
	 * @return the pmztemporary143
	 */
	public String getPmztemporary143() {
		return pmztemporary143;
	}
	/**
	 * @param pmztemporary143 the pmztemporary143 to set
	 */
	public void setPmztemporary143(String pmztemporary143) {
		this.pmztemporary143 = pmztemporary143;
	}
	/**
	 * @return the pmztemporary144
	 */
	public String getPmztemporary144() {
		return pmztemporary144;
	}
	/**
	 * @param pmztemporary144 the pmztemporary144 to set
	 */
	public void setPmztemporary144(String pmztemporary144) {
		this.pmztemporary144 = pmztemporary144;
	}
	/**
	 * @return the pmztemporary145
	 */
	public String getPmztemporary145() {
		return pmztemporary145;
	}
	/**
	 * @param pmztemporary145 the pmztemporary145 to set
	 */
	public void setPmztemporary145(String pmztemporary145) {
		this.pmztemporary145 = pmztemporary145;
	}
	/**
	 * @return the pmztemporary146
	 */
	public String getPmztemporary146() {
		return pmztemporary146;
	}
	/**
	 * @param pmztemporary146 the pmztemporary146 to set
	 */
	public void setPmztemporary146(String pmztemporary146) {
		this.pmztemporary146 = pmztemporary146;
	}
	/**
	 * @return the pmztemporary147
	 */
	public String getPmztemporary147() {
		return pmztemporary147;
	}
	/**
	 * @param pmztemporary147 the pmztemporary147 to set
	 */
	public void setPmztemporary147(String pmztemporary147) {
		this.pmztemporary147 = pmztemporary147;
	}
	/**
	 * @return the pmztemporary148
	 */
	public String getPmztemporary148() {
		return pmztemporary148;
	}
	/**
	 * @param pmztemporary148 the pmztemporary148 to set
	 */
	public void setPmztemporary148(String pmztemporary148) {
		this.pmztemporary148 = pmztemporary148;
	}
	/**
	 * @return the pmztemporary149
	 */
	public String getPmztemporary149() {
		return pmztemporary149;
	}
	/**
	 * @param pmztemporary149 the pmztemporary149 to set
	 */
	public void setPmztemporary149(String pmztemporary149) {
		this.pmztemporary149 = pmztemporary149;
	}
	/**
	 * @return the pmztemporary15
	 */
	public String getPmztemporary15() {
		return pmztemporary15;
	}
	/**
	 * @param pmztemporary15 the pmztemporary15 to set
	 */
	public void setPmztemporary15(String pmztemporary15) {
		this.pmztemporary15 = pmztemporary15;
	}
	/**
	 * @return the pmztemporary150
	 */
	public String getPmztemporary150() {
		return pmztemporary150;
	}
	/**
	 * @param pmztemporary150 the pmztemporary150 to set
	 */
	public void setPmztemporary150(String pmztemporary150) {
		this.pmztemporary150 = pmztemporary150;
	}
	/**
	 * @return the pmztemporary160
	 */
	public String getPmztemporary160() {
		return pmztemporary160;
	}
	/**
	 * @param pmztemporary160 the pmztemporary160 to set
	 */
	public void setPmztemporary160(String pmztemporary160) {
		this.pmztemporary160 = pmztemporary160;
	}
	/**
	 * @return the pmztemporary161
	 */
	public String getPmztemporary161() {
		return pmztemporary161;
	}
	/**
	 * @param pmztemporary161 the pmztemporary161 to set
	 */
	public void setPmztemporary161(String pmztemporary161) {
		this.pmztemporary161 = pmztemporary161;
	}
	/**
	 * @return the pmztemporary167
	 */
	public String getPmztemporary167() {
		return pmztemporary167;
	}
	/**
	 * @param pmztemporary167 the pmztemporary167 to set
	 */
	public void setPmztemporary167(String pmztemporary167) {
		this.pmztemporary167 = pmztemporary167;
	}
	/**
	 * @return the pmztemporary170
	 */
	public String getPmztemporary170() {
		return pmztemporary170;
	}
	/**
	 * @param pmztemporary170 the pmztemporary170 to set
	 */
	public void setPmztemporary170(String pmztemporary170) {
		this.pmztemporary170 = pmztemporary170;
	}
	/**
	 * @return the pmztemporary171
	 */
	public String getPmztemporary171() {
		return pmztemporary171;
	}
	/**
	 * @param pmztemporary171 the pmztemporary171 to set
	 */
	public void setPmztemporary171(String pmztemporary171) {
		this.pmztemporary171 = pmztemporary171;
	}
	/**
	 * @return the pmztemporary172
	 */
	public String getPmztemporary172() {
		return pmztemporary172;
	}
	/**
	 * @param pmztemporary172 the pmztemporary172 to set
	 */
	public void setPmztemporary172(String pmztemporary172) {
		this.pmztemporary172 = pmztemporary172;
	}
	/**
	 * @return the pmztemporary173
	 */
	public String getPmztemporary173() {
		return pmztemporary173;
	}
	/**
	 * @param pmztemporary173 the pmztemporary173 to set
	 */
	public void setPmztemporary173(String pmztemporary173) {
		this.pmztemporary173 = pmztemporary173;
	}
	/**
	 * @return the pmztemporary19
	 */
	public String getPmztemporary19() {
		return pmztemporary19;
	}
	/**
	 * @param pmztemporary19 the pmztemporary19 to set
	 */
	public void setPmztemporary19(String pmztemporary19) {
		this.pmztemporary19 = pmztemporary19;
	}
	/**
	 * @return the pmztemporary2
	 */
	public String getPmztemporary2() {
		return pmztemporary2;
	}
	/**
	 * @param pmztemporary2 the pmztemporary2 to set
	 */
	public void setPmztemporary2(String pmztemporary2) {
		this.pmztemporary2 = pmztemporary2;
	}
	/**
	 * @return the pmztemporary20
	 */
	public String getPmztemporary20() {
		return pmztemporary20;
	}
	/**
	 * @param pmztemporary20 the pmztemporary20 to set
	 */
	public void setPmztemporary20(String pmztemporary20) {
		this.pmztemporary20 = pmztemporary20;
	}
	/**
	 * @return the pmztemporary21
	 */
	public String getPmztemporary21() {
		return pmztemporary21;
	}
	/**
	 * @param pmztemporary21 the pmztemporary21 to set
	 */
	public void setPmztemporary21(String pmztemporary21) {
		this.pmztemporary21 = pmztemporary21;
	}
	/**
	 * @return the pmztemporary22
	 */
	public String getPmztemporary22() {
		return pmztemporary22;
	}
	/**
	 * @param pmztemporary22 the pmztemporary22 to set
	 */
	public void setPmztemporary22(String pmztemporary22) {
		this.pmztemporary22 = pmztemporary22;
	}
	/**
	 * @return the pmztemporary23
	 */
	public String getPmztemporary23() {
		return pmztemporary23;
	}
	/**
	 * @param pmztemporary23 the pmztemporary23 to set
	 */
	public void setPmztemporary23(String pmztemporary23) {
		this.pmztemporary23 = pmztemporary23;
	}
	/**
	 * @return the pmztemporary24
	 */
	public String getPmztemporary24() {
		return pmztemporary24;
	}
	/**
	 * @param pmztemporary24 the pmztemporary24 to set
	 */
	public void setPmztemporary24(String pmztemporary24) {
		this.pmztemporary24 = pmztemporary24;
	}
	/**
	 * @return the pmztemporary25
	 */
	public String getPmztemporary25() {
		return pmztemporary25;
	}
	/**
	 * @param pmztemporary25 the pmztemporary25 to set
	 */
	public void setPmztemporary25(String pmztemporary25) {
		this.pmztemporary25 = pmztemporary25;
	}
	/**
	 * @return the pmztemporary26
	 */
	public String getPmztemporary26() {
		return pmztemporary26;
	}
	/**
	 * @param pmztemporary26 the pmztemporary26 to set
	 */
	public void setPmztemporary26(String pmztemporary26) {
		this.pmztemporary26 = pmztemporary26;
	}
	/**
	 * @return the pmztemporary27
	 */
	public String getPmztemporary27() {
		return pmztemporary27;
	}
	/**
	 * @param pmztemporary27 the pmztemporary27 to set
	 */
	public void setPmztemporary27(String pmztemporary27) {
		this.pmztemporary27 = pmztemporary27;
	}
	/**
	 * @return the pmztemporary28
	 */
	public String getPmztemporary28() {
		return pmztemporary28;
	}
	/**
	 * @param pmztemporary28 the pmztemporary28 to set
	 */
	public void setPmztemporary28(String pmztemporary28) {
		this.pmztemporary28 = pmztemporary28;
	}
	/**
	 * @return the pmztemporary29
	 */
	public String getPmztemporary29() {
		return pmztemporary29;
	}
	/**
	 * @param pmztemporary29 the pmztemporary29 to set
	 */
	public void setPmztemporary29(String pmztemporary29) {
		this.pmztemporary29 = pmztemporary29;
	}
	/**
	 * @return the pmztemporary3
	 */
	public String getPmztemporary3() {
		return pmztemporary3;
	}
	/**
	 * @param pmztemporary3 the pmztemporary3 to set
	 */
	public void setPmztemporary3(String pmztemporary3) {
		this.pmztemporary3 = pmztemporary3;
	}
	/**
	 * @return the pmztemporary30
	 */
	public String getPmztemporary30() {
		return pmztemporary30;
	}
	/**
	 * @param pmztemporary30 the pmztemporary30 to set
	 */
	public void setPmztemporary30(String pmztemporary30) {
		this.pmztemporary30 = pmztemporary30;
	}
	/**
	 * @return the pmztemporary31
	 */
	public String getPmztemporary31() {
		return pmztemporary31;
	}
	/**
	 * @param pmztemporary31 the pmztemporary31 to set
	 */
	public void setPmztemporary31(String pmztemporary31) {
		this.pmztemporary31 = pmztemporary31;
	}
	/**
	 * @return the pmztemporary32
	 */
	public String getPmztemporary32() {
		return pmztemporary32;
	}
	/**
	 * @param pmztemporary32 the pmztemporary32 to set
	 */
	public void setPmztemporary32(String pmztemporary32) {
		this.pmztemporary32 = pmztemporary32;
	}
	/**
	 * @return the pmztemporary33
	 */
	public String getPmztemporary33() {
		return pmztemporary33;
	}
	/**
	 * @param pmztemporary33 the pmztemporary33 to set
	 */
	public void setPmztemporary33(String pmztemporary33) {
		this.pmztemporary33 = pmztemporary33;
	}
	/**
	 * @return the pmztemporary4
	 */
	public String getPmztemporary4() {
		return pmztemporary4;
	}
	/**
	 * @param pmztemporary4 the pmztemporary4 to set
	 */
	public void setPmztemporary4(String pmztemporary4) {
		this.pmztemporary4 = pmztemporary4;
	}
	/**
	 * @return the pmztemporary5
	 */
	public String getPmztemporary5() {
		return pmztemporary5;
	}
	/**
	 * @param pmztemporary5 the pmztemporary5 to set
	 */
	public void setPmztemporary5(String pmztemporary5) {
		this.pmztemporary5 = pmztemporary5;
	}
	/**
	 * @return the pmztemporary57
	 */
	public String getPmztemporary57() {
		return pmztemporary57;
	}
	/**
	 * @param pmztemporary57 the pmztemporary57 to set
	 */
	public void setPmztemporary57(String pmztemporary57) {
		this.pmztemporary57 = pmztemporary57;
	}
	/**
	 * @return the pmztemporary6
	 */
	public String getPmztemporary6() {
		return pmztemporary6;
	}
	/**
	 * @param pmztemporary6 the pmztemporary6 to set
	 */
	public void setPmztemporary6(String pmztemporary6) {
		this.pmztemporary6 = pmztemporary6;
	}
	/**
	 * @return the pmztemporary60
	 */
	public String getPmztemporary60() {
		return pmztemporary60;
	}
	/**
	 * @param pmztemporary60 the pmztemporary60 to set
	 */
	public void setPmztemporary60(String pmztemporary60) {
		this.pmztemporary60 = pmztemporary60;
	}
	/**
	 * @return the pmztemporary61
	 */
	public String getPmztemporary61() {
		return pmztemporary61;
	}
	/**
	 * @param pmztemporary61 the pmztemporary61 to set
	 */
	public void setPmztemporary61(String pmztemporary61) {
		this.pmztemporary61 = pmztemporary61;
	}
	/**
	 * @return the pmztemporary62
	 */
	public String getPmztemporary62() {
		return pmztemporary62;
	}
	/**
	 * @param pmztemporary62 the pmztemporary62 to set
	 */
	public void setPmztemporary62(String pmztemporary62) {
		this.pmztemporary62 = pmztemporary62;
	}
	/**
	 * @return the pmztemporary63
	 */
	public String getPmztemporary63() {
		return pmztemporary63;
	}
	/**
	 * @param pmztemporary63 the pmztemporary63 to set
	 */
	public void setPmztemporary63(String pmztemporary63) {
		this.pmztemporary63 = pmztemporary63;
	}
	/**
	 * @return the pmztemporary64
	 */
	public String getPmztemporary64() {
		return pmztemporary64;
	}
	/**
	 * @param pmztemporary64 the pmztemporary64 to set
	 */
	public void setPmztemporary64(String pmztemporary64) {
		this.pmztemporary64 = pmztemporary64;
	}
	/**
	 * @return the pmztemporary65
	 */
	public String getPmztemporary65() {
		return pmztemporary65;
	}
	/**
	 * @param pmztemporary65 the pmztemporary65 to set
	 */
	public void setPmztemporary65(String pmztemporary65) {
		this.pmztemporary65 = pmztemporary65;
	}
	/**
	 * @return the pmztemporary66
	 */
	public String getPmztemporary66() {
		return pmztemporary66;
	}
	/**
	 * @param pmztemporary66 the pmztemporary66 to set
	 */
	public void setPmztemporary66(String pmztemporary66) {
		this.pmztemporary66 = pmztemporary66;
	}
	/**
	 * @return the pmztemporary67
	 */
	public String getPmztemporary67() {
		return pmztemporary67;
	}
	/**
	 * @param pmztemporary67 the pmztemporary67 to set
	 */
	public void setPmztemporary67(String pmztemporary67) {
		this.pmztemporary67 = pmztemporary67;
	}
	/**
	 * @return the pmztemporary68
	 */
	public String getPmztemporary68() {
		return pmztemporary68;
	}
	/**
	 * @param pmztemporary68 the pmztemporary68 to set
	 */
	public void setPmztemporary68(String pmztemporary68) {
		this.pmztemporary68 = pmztemporary68;
	}
	/**
	 * @return the pmztemporary69
	 */
	public String getPmztemporary69() {
		return pmztemporary69;
	}
	/**
	 * @param pmztemporary69 the pmztemporary69 to set
	 */
	public void setPmztemporary69(String pmztemporary69) {
		this.pmztemporary69 = pmztemporary69;
	}
	/**
	 * @return the pmztemporary7
	 */
	public String getPmztemporary7() {
		return pmztemporary7;
	}
	/**
	 * @param pmztemporary7 the pmztemporary7 to set
	 */
	public void setPmztemporary7(String pmztemporary7) {
		this.pmztemporary7 = pmztemporary7;
	}
	/**
	 * @return the pmztemporary70
	 */
	public String getPmztemporary70() {
		return pmztemporary70;
	}
	/**
	 * @param pmztemporary70 the pmztemporary70 to set
	 */
	public void setPmztemporary70(String pmztemporary70) {
		this.pmztemporary70 = pmztemporary70;
	}
	/**
	 * @return the pmztemporary71
	 */
	public String getPmztemporary71() {
		return pmztemporary71;
	}
	/**
	 * @param pmztemporary71 the pmztemporary71 to set
	 */
	public void setPmztemporary71(String pmztemporary71) {
		this.pmztemporary71 = pmztemporary71;
	}
	/**
	 * @return the pmztemporary8
	 */
	public String getPmztemporary8() {
		return pmztemporary8;
	}
	/**
	 * @param pmztemporary8 the pmztemporary8 to set
	 */
	public void setPmztemporary8(String pmztemporary8) {
		this.pmztemporary8 = pmztemporary8;
	}
	/**
	 * @return the pmztemporary84
	 */
	public String getPmztemporary84() {
		return pmztemporary84;
	}
	/**
	 * @param pmztemporary84 the pmztemporary84 to set
	 */
	public void setPmztemporary84(String pmztemporary84) {
		this.pmztemporary84 = pmztemporary84;
	}
	/**
	 * @return the pmztemporary85
	 */
	public String getPmztemporary85() {
		return pmztemporary85;
	}
	/**
	 * @param pmztemporary85 the pmztemporary85 to set
	 */
	public void setPmztemporary85(String pmztemporary85) {
		this.pmztemporary85 = pmztemporary85;
	}
	/**
	 * @return the pmztemporary86
	 */
	public String getPmztemporary86() {
		return pmztemporary86;
	}
	/**
	 * @param pmztemporary86 the pmztemporary86 to set
	 */
	public void setPmztemporary86(String pmztemporary86) {
		this.pmztemporary86 = pmztemporary86;
	}
	/**
	 * @return the pmztemporary87
	 */
	public String getPmztemporary87() {
		return pmztemporary87;
	}
	/**
	 * @param pmztemporary87 the pmztemporary87 to set
	 */
	public void setPmztemporary87(String pmztemporary87) {
		this.pmztemporary87 = pmztemporary87;
	}
	/**
	 * @return the pmztemporary88
	 */
	public String getPmztemporary88() {
		return pmztemporary88;
	}
	/**
	 * @param pmztemporary88 the pmztemporary88 to set
	 */
	public void setPmztemporary88(String pmztemporary88) {
		this.pmztemporary88 = pmztemporary88;
	}
	/**
	 * @return the pmztemporary89
	 */
	public String getPmztemporary89() {
		return pmztemporary89;
	}
	/**
	 * @param pmztemporary89 the pmztemporary89 to set
	 */
	public void setPmztemporary89(String pmztemporary89) {
		this.pmztemporary89 = pmztemporary89;
	}
	/**
	 * @return the pmztemporary9
	 */
	public String getPmztemporary9() {
		return pmztemporary9;
	}
	/**
	 * @param pmztemporary9 the pmztemporary9 to set
	 */
	public void setPmztemporary9(String pmztemporary9) {
		this.pmztemporary9 = pmztemporary9;
	}
	/**
	 * @return the pmztemporary90
	 */
	public String getPmztemporary90() {
		return pmztemporary90;
	}
	/**
	 * @param pmztemporary90 the pmztemporary90 to set
	 */
	public void setPmztemporary90(String pmztemporary90) {
		this.pmztemporary90 = pmztemporary90;
	}
	/**
	 * @return the pmztemporary91
	 */
	public String getPmztemporary91() {
		return pmztemporary91;
	}
	/**
	 * @param pmztemporary91 the pmztemporary91 to set
	 */
	public void setPmztemporary91(String pmztemporary91) {
		this.pmztemporary91 = pmztemporary91;
	}
	/**
	 * @return the pmztemporary92
	 */
	public String getPmztemporary92() {
		return pmztemporary92;
	}
	/**
	 * @param pmztemporary92 the pmztemporary92 to set
	 */
	public void setPmztemporary92(String pmztemporary92) {
		this.pmztemporary92 = pmztemporary92;
	}
	/**
	 * @return the pmztemporary93
	 */
	public String getPmztemporary93() {
		return pmztemporary93;
	}
	/**
	 * @param pmztemporary93 the pmztemporary93 to set
	 */
	public void setPmztemporary93(String pmztemporary93) {
		this.pmztemporary93 = pmztemporary93;
	}
	/**
	 * @return the rowstatus
	 */
	public String getRowstatus() {
		return rowstatus;
	}
	/**
	 * @param rowstatus the rowstatus to set
	 */
	public void setRowstatus(String rowstatus) {
		this.rowstatus = rowstatus;
	}
	/**
	 * @return the session_id
	 */
	public String getSession_id() {
		return session_id;
	}
	/**
	 * @param session_id the session_id to set
	 */
	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}
	/**
	 * @return the sn
	 */
	public String getSn() {
		return sn;
	}
	/**
	 * @param sn the sn to set
	 */
	public void setSn(String sn) {
		this.sn = sn;
	}
	/**
	 * @return the timelevel
	 */
	public String getTimelevel() {
		return timelevel;
	}
	/**
	 * @param timelevel the timelevel to set
	 */
	public void setTimelevel(String timelevel) {
		this.timelevel = timelevel;
	}
	/**
	 * @return the utc_datetime_id
	 */
	public String getUtc_datetime_id() {
		return utc_datetime_id;
	}
	/**
	 * @param utc_datetime_id the utc_datetime_id to set
	 */
	public void setUtc_datetime_id(String utc_datetime_id) {
		this.utc_datetime_id = utc_datetime_id;
	}
	/**
	 * @return the year_id
	 */
	public String getYear_id() {
		return year_id;
	}
	/**
	 * @param year_id the year_id to set
	 */
	public void setYear_id(String year_id) {
		this.year_id = year_id;
	}

	
}