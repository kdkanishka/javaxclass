/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package responsibility;

import responsibility.exception.HandlerFaliureException;

/**
 *
 * @author kanishka
 */
public class CleanUpHandler extends DBBackupHandler {

    @Override
    void processRequest(BackupRequest request) throws HandlerFaliureException {
        if (request.getStatus() == BackupStatus.UPLOADED) {
            System.out.println("Successfully clean up tmp files : " + request.getDumpFile() + "," + request.getZipedDumpFile());
            request.setStatus(BackupStatus.COMPLETED);
        } else {
            throw new HandlerFaliureException("Invalid backup state!, valid backup status shoule be [" + BackupStatus.UPLOADED + "] in this stage.");
        }
    }
}
