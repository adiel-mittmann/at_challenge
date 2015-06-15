package at_challenge.deaguiar.daniel.atchalleng;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.Handler;

/**
 * Created by daniel on 15/06/15.
 */
public class FetchServerResultReceiver extends ResultReceiver {

    private Receiver mReceiver;

    public FetchServerResultReceiver(Handler handler) {
        super(handler);
    }

    public void setReceiver(Receiver receiver) {
        mReceiver = receiver;
    }

    public interface Receiver {
        public void onReceiveResult(int resultCode, Bundle resultData);
    }

    @Override
    protected void onReceiveResult(int resultCode, Bundle resultData) {
        if (mReceiver != null) {
            mReceiver.onReceiveResult(resultCode, resultData);
        }
    }
}
