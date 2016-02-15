package week5.facade;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class ServerFacade {

    private ScheduleServer scheduleServer;

    public ServerFacade() {
        this.scheduleServer = new ScheduleServerImpl();
    }

    public void start() {
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
        System.out.println("Start working......");
        System.out.println("After work done.........");
    }

    public void close() {
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }
}
