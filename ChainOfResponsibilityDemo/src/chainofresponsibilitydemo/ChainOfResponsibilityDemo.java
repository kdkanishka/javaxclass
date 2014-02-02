/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilitydemo;

import responsibility.BackupClient;
import responsibility.BackupRequest;
import responsibility.BackupStatus;
import responsibility.exception.HandlerFaliureException;

/**
 *
 * @author kanishka
 */
public class ChainOfResponsibilityDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws HandlerFaliureException {
        BackupClient client=new BackupClient();
        BackupRequest request=new BackupRequest();
        request.setStatus(BackupStatus.INITIALIZED);
        request.setDbName("paymentDB");
        client.startBackup(request);
    }
}
