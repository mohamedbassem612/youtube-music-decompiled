package defpackage;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avxl implements Runnable {
    private final /* synthetic */ int $cid;
    final long a;
    final Object b;

    public avxl(long j, Object obj, int i) {
        this.$cid = i;
        this.a = j;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [axsq, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            avxk avxkVar = (avxk) this.b;
            if (avxkVar.compareAndSet(this.a, Long.MAX_VALUE)) {
                awka.f(avxkVar.f);
                avxkVar.a.b(new TimeoutException(awkh.c(avxkVar.b, avxkVar.c)));
                avxkVar.d.dispose();
                return;
            }
            return;
        }
        ?? r3 = this.b;
        if (i == 1) {
            r3.ko(this.a);
            return;
        }
        awfm awfmVar = (awfm) r3;
        if (awfmVar.f.compareAndSet(this.a, Long.MAX_VALUE)) {
            avnr.b(awfmVar.g);
            avlu avluVar = awfmVar.h;
            awfmVar.h = null;
            avluVar.ak(new awfl(awfmVar.a, (AtomicReference) r3));
            awfmVar.d.dispose();
        }
    }

    public avxl(axsq axsqVar, long j, int i) {
        this.$cid = i;
        this.b = axsqVar;
        this.a = j;
    }
}
