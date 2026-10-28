package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mbn implements Runnable {
    final Runnable a = this;
    final /* synthetic */ Runnable b;
    final /* synthetic */ SettableFuture c;
    final /* synthetic */ mbp d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ mbr g;

    public mbn(mbr mbrVar, Runnable runnable, SettableFuture settableFuture, mbp mbpVar, long j, TimeUnit timeUnit) {
        this.b = runnable;
        this.c = settableFuture;
        this.d = mbpVar;
        this.e = j;
        this.f = timeUnit;
        this.g = mbrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Runnable runnable = this.b;
        final SettableFuture settableFuture = this.c;
        final mbp mbpVar = this.d;
        final long j = this.e;
        final TimeUnit timeUnit = this.f;
        this.g.execute(new Runnable() { // from class: mbm
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                mbn mbnVar = this.a;
                Runnable runnable2 = runnable;
                SettableFuture settableFuture2 = settableFuture;
                mbp mbpVar2 = mbpVar;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (settableFuture2.isDone()) {
                        return;
                    }
                    ahew ahewVarSchedule = mbnVar.g.a.schedule(mbnVar.a, j2, timeUnit2);
                    mbpVar2.a = ahewVarSchedule;
                    if (mbpVar2.isDone()) {
                        ahewVarSchedule.cancel(false);
                    }
                } catch (Throwable th) {
                    settableFuture2.setException(th);
                }
            }
        });
    }
}
