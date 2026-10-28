package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ex extends Handler {
    final /* synthetic */ ez a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(ez ezVar, Looper looper) {
        super(looper);
        this.a = ezVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        fb fbVar;
        ex exVar;
        ez ezVar;
        if (message.what == 1) {
            ez ezVar2 = this.a;
            synchronized (ezVar2.a) {
                fbVar = (fb) ezVar2.c.get();
                exVar = ezVar2.d;
            }
            if (fbVar == null || (ezVar = this.a) != fbVar.a() || exVar == null) {
                return;
            }
            fbVar.e((brf) message.obj);
            ezVar.v(fbVar, exVar);
            fbVar.e(null);
        }
    }
}
