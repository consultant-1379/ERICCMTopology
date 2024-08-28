/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.bulk.utilities;

import java.io.*;
import java.util.zip.GZIPOutputStream;

import org.apache.log4j.Logger;

public class ZipUtility {
    static Logger log = Logger.getLogger(ZipUtility.class);

    public static void zipUtility(final String path) {
        final String filePath = path;
        final String gzFilePath = filePath + ".gz";
        final byte[] arrayOfByte = new byte['?'];
        try {
            final GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(new FileOutputStream(gzFilePath));
            final FileInputStream localFileInputStream = new FileInputStream(filePath);
            int i;
            while ((i = localFileInputStream.read(arrayOfByte)) > 0) {
                localGZIPOutputStream.write(arrayOfByte, 0, i);
            }
            localFileInputStream.close();
            localGZIPOutputStream.finish();
            localGZIPOutputStream.close();
            final File localFile = new File(path);
            if (localFile.exists()) {
                localFile.delete();
            }
        } catch (final IllegalArgumentException localIllegalArgumentException) {
            log.error(localIllegalArgumentException);
            System.exit(0);
        } catch (final FileNotFoundException localFileNotFoundException) {
            log.error(localFileNotFoundException);
            System.exit(0);
        } catch (final IOException localIOException) {
            log.error(localIOException);
            System.exit(0);
        }
    }
}
