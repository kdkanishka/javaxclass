package responsibility;

import responsibility.exception.HandlerFaliureException;

/**
 *
 * @author kanishka
 */
public class BackupClient {

    BackupProcessor processor = new BackupProcessor();

    public void startBackup(BackupRequest request) throws HandlerFaliureException {
        processor.startBackup(request);
    }
}
