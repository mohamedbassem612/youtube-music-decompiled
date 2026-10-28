package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avmk extends avmb {
    private final Handler b;

    public avmk(Handler handler) {
        this.b = handler;
    }

    @Override // defpackage.avmb
    public final avma a() {
        return new avmi(this.b);
    }

    @Override // defpackage.avmb
    public final avmn c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Runnable runnableM = atqp.m(runnable);
        Handler handler = this.b;
        avmj avmjVar = new avmj(handler, runnableM);
        handler.sendMessageDelayed(Message.obtain(handler, avmjVar), timeUnit.toMillis(j));
        return avmjVar;
    }
}
