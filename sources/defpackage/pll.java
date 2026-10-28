package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pll implements Runnable {
    final Runnable a = this;
    final /* synthetic */ Runnable b;
    final /* synthetic */ SettableFuture c;
    final /* synthetic */ plm d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ plo g;

    public pll(plo ploVar, Runnable runnable, SettableFuture settableFuture, plm plmVar, long j, TimeUnit timeUnit) {
        this.b = runnable;
        this.c = settableFuture;
        this.d = plmVar;
        this.e = j;
        this.f = timeUnit;
        this.g = ploVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Runnable runnable = this.b;
        final SettableFuture settableFuture = this.c;
        final plm plmVar = this.d;
        final long j = this.e;
        final TimeUnit timeUnit = this.f;
        this.g.execute(new Runnable() { // from class: plk
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                pll pllVar = this.a;
                Runnable runnable2 = runnable;
                SettableFuture settableFuture2 = settableFuture;
                plm plmVar2 = plmVar;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (settableFuture2.isDone()) {
                        return;
                    }
                    ahew ahewVarSchedule = pllVar.g.a.schedule(pllVar.a, j2, timeUnit2);
                    plmVar2.a = ahewVarSchedule;
                    if (plmVar2.isDone()) {
                        ahewVarSchedule.cancel(false);
                    }
                } catch (Throwable th) {
                    settableFuture2.setException(th);
                }
            }
        });
    }
}
