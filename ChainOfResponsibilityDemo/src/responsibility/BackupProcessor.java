package responsibility;

import responsibility.exception.HandlerFaliureException;

/**
 *
 * @author kanishka
 */
public class BackupProcessor {

    DBBackupHandler initialHandler;

    public BackupProcessor() {
        buildChainOfResponsibility();
    }

    private void buildChainOfResponsibility() {
        initialHandler =
                new DumpProcessHandler(
                new ZipProcessHandler(
                new UploadToDropboxHandler(
                new CleanUpHandler())));
    }

    public void startBackup(BackupRequest reqest) throws HandlerFaliureException {
        initialHandler.processRequest(reqest);
    }
}
