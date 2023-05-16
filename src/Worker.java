import java.util.Random;

public class Worker {
    private Random random = new Random();
    private OnTaskDoneListen callBack;
    private OnTaskErrorListen errorCallback;
    public Worker(OnTaskDoneListen callBack, OnTaskErrorListen errorCallback) {
        this.callBack = callBack;
        this.errorCallback = errorCallback;
    }

    public void Start(){
        for (int i = 0; i < 100; i++) {
            if(random.nextInt(100)>33){
                callBack.onDone("Task " + i + " is done");
            } else {
                errorCallback.onError();
            }

        }
    }
}
