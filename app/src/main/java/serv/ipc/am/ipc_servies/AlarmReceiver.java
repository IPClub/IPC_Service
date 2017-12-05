package serv.ipc.am.ipc_servies;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context,AlarmActivity.class);
        context.startActivity(i);

    }
}