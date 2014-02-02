package responsibility;

import java.io.File;
import responsibility.exception.HandlerFaliureException;

/**
 *
 * @author kanishka
 */
public class ZipProcessHandler extends DBBackupHandler {

    public ZipProcessHandler(DBBackupHandler handler) {
        setNextHandler(handler);
    }

    @Override
    void processRequest(BackupRequest request) throws HandlerFaliureException {
        if (request.getStatus() == BackupStatus.DUMPED) {
            System.out.println("Successfully ziped database : " + request.getDumpFile());
            request.setStatus(BackupStatus.ZIPED);
            request.setZipedDumpFile(new File("001.sql.zip"));
            getNextHandler().processRequest(request);
        } else {
            throw new HandlerFaliureException("Invalid backup state!, valid backup status shoule be [" + BackupStatus.DUMPED + "] in this stage.");
        }
    }
}
