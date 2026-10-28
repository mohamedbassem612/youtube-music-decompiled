package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avmi extends avma {
    private final Handler a;
    private volatile boolean b;

    public avmi(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.avma
    public final avmn b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        if (this.b) {
            return avns.a;
        }
        Runnable runnableM = atqp.m(runnable);
        Handler handler = this.a;
        avmj avmjVar = new avmj(handler, runnableM);
        Message messageObtain = Message.obtain(handler, avmjVar);
        messageObtain.obj = this;
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        if (!this.b) {
            return avmjVar;
        }
        handler.removeCallbacks(avmjVar);
        return avns.a;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.b = true;
        this.a.removeCallbacksAndMessages(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b;
    }
}
