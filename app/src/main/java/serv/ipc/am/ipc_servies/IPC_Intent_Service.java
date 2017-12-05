package serv.ipc.am.ipc_servies;


import android.app.IntentService;
import android.app.Notification;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class IPC_Intent_Service extends IntentService{


    public IPC_Intent_Service() {
        super("IPC Service");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        Notification.Builder builder = new Notification.Builder(getBaseContext())
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Your content title") // use something from something from
                .setContentText("Your content text"); // use something from something from

        startForeground(1, builder.build());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        Intent in = new Intent(this, ResultActivity.class);
        in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(in);
    }
}
