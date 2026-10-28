package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class afkg extends Handler {
    public afkg(Looper looper, byte[] bArr) {
        super(looper);
        Looper.getMainLooper();
    }

    public afkg() {
    }

    public afkg(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
