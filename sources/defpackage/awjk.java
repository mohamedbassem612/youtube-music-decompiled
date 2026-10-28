package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awjk extends avmb {
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.avmb
    public final avma a() {
        return new awjj();
    }

    @Override // defpackage.avmb
    public final avmn c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            atqp.m(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            atqp.n(e);
        }
        return avns.a;
    }

    @Override // defpackage.avmb
    public final avmn e(Runnable runnable) {
        atqp.m(runnable).run();
        return avns.a;
    }
}
