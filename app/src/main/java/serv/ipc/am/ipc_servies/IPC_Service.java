package serv.ipc.am.ipc_servies;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class IPC_Service extends Service {

    public IPC_Service() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        Intent in = new Intent(this, ResultActivity.class);
        in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(in);
        stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }
}
