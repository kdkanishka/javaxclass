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
public class BackupClient {
    BackupProcessor processor=new BackupProcessor();
    
    public void startBackup(BackupRequest request) throws HandlerFaliureException{
        processor.startBackup(request);
    }
}
