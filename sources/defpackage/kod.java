package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kod extends afkg {
    public kod(Looper looper) {
        super(looper, (byte[]) null);
    }

    public final void a(knj knjVar, kni kniVar) {
        ThreadLocal threadLocal = BasePendingResult.e;
        sendMessage(obtainMessage(1, new Pair(knjVar, kniVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                ((BasePendingResult) message.obj).j(Status.d);
                return;
            }
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        Pair pair = (Pair) message.obj;
        knj knjVar = (knj) pair.first;
        kni kniVar = (kni) pair.second;
        try {
            knjVar.a(kniVar);
        } catch (RuntimeException e) {
            BasePendingResult.k(kniVar);
            throw e;
        }
    }
}
