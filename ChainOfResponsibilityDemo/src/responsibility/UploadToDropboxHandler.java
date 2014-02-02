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
public class UploadToDropboxHandler extends DBBackupHandler {
    
    public UploadToDropboxHandler(DBBackupHandler handler){
        setNextHandler(handler);
    }

    @Override
    void processRequest(BackupRequest request) throws HandlerFaliureException{
        if (request.getStatus() == BackupStatus.ZIPED) {
            System.out.println("Successfully uploaded backup file : " + request.getZipedDumpFile());
            request.setStatus(BackupStatus.UPLOADED);
            
            getNextHandler().processRequest(request);
        }else{
            throw new HandlerFaliureException("Invalid backup state!, valid backup status shoule be [" +BackupStatus.ZIPED+"] in this stage.");
        }
    }
}
