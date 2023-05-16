public class Main {
    public static void main(String[] args) {
        OnTaskDoneListen listen = System.out ::println;
        OnTaskErrorListen errorListen = () -> System.out.println("ERROR");
        Worker worker = new Worker(listen, errorListen);
        worker.Start();
    }
}
