package responsibility;

import java.io.File;
import responsibility.exception.HandlerFaliureException;

/**
 *
 * @author kanishka
 */
public class DumpProcessHandler extends DBBackupHandler {

    public DumpProcessHandler(DBBackupHandler handler) {
        setNextHandler(handler);
    }

    @Override
    void processRequest(BackupRequest request) throws HandlerFaliureException {
        if (request.getStatus() == BackupStatus.INITIALIZED) {
            System.out.println("Successfully dumped database : " + request.getDbName());
            request.setStatus(BackupStatus.DUMPED);
            request.setDumpFile(new File("001.sql"));

            getNextHandler().processRequest(request);
        } else {
            throw new HandlerFaliureException("Invalid backup state!, valid backup status shoule be [" + BackupStatus.INITIALIZED + "] in this stage.");
        }
    }
}
