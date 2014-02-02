package responsibility;

import java.io.File;

/**
 *
 * @author kanishka
 */
public class BackupRequest {

    private BackupStatus status;
    private String dbName;
    private File dumpFile;
    private File zipedDumpFile;

    public BackupStatus getStatus() {
        return status;
    }

    public void setStatus(BackupStatus status) {
        this.status = status;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public File getDumpFile() {
        return dumpFile;
    }

    public void setDumpFile(File dumpFile) {
        this.dumpFile = dumpFile;
    }

    public File getZipedDumpFile() {
        return zipedDumpFile;
    }

    public void setZipedDumpFile(File zipedDumpFile) {
        this.zipedDumpFile = zipedDumpFile;
    }
}
