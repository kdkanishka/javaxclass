package responsibility;

import responsibility.exception.HandlerFaliureException;

/**
 *
 * @author kanishka
 */
public abstract class DBBackupHandler {

    private DBBackupHandler nextHandler;

    protected DBBackupHandler getNextHandler() {
        return nextHandler;
    }

    protected void setNextHandler(DBBackupHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract void processRequest(BackupRequest request) throws HandlerFaliureException;
}
