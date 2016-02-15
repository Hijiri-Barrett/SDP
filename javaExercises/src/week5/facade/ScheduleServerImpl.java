package week5.facade;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class ScheduleServerImpl implements ScheduleServer {

    @Override
    public void startBooting() {
        System.out.println("Booting...");
    }

    @Override
    public void readSystemConfigFile() {
        System.out.println("Reading system config file...");
    }

    @Override
    public void init() {
        System.out.println("Initialising...");
    }

    @Override
    public void initializeContext() {
        System.out.println("Initialising context...");
    }

    @Override
    public void initializeListeners() {
        System.out.println("Initialising listeners...");
    }

    @Override
    public void createSystemObjects() {
        System.out.println("Creaating system objects...");
    }

    @Override
    public void releaseProcesses() {
        System.out.println("Releasing processes...");
    }

    @Override
    public void destory() {
        System.out.println("Destroying...");
    }

    @Override
    public void destroySystemObjects() {
        System.out.println("Destroying system objects...");
    }

    @Override
    public void destoryListeners() {
        System.out.println("Destroying listeners...");
    }

    @Override
    public void destoryContext() {
        System.out.println("Destroying context...");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down...");
    }
}
