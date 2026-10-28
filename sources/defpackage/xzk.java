package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xzk extends Handler {
    final /* synthetic */ xzl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzk(xzl xzlVar) {
        super(Looper.getMainLooper());
        this.a = xzlVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.a.b();
        } else if (i == 1) {
            this.a.a(message.arg1);
        }
    }
}
