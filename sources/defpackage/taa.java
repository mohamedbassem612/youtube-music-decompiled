package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class taa implements aheh {
    final /* synthetic */ tae a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ tab c;

    public taa(tae taeVar, Runnable runnable, tab tabVar) {
        this.a = taeVar;
        this.b = runnable;
        this.c = tabVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        Runnable runnable = this.b;
        if (runnable == null || !(th instanceof CancellationException)) {
            this.c.b(th);
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.aheh
    public final void b(Object obj) {
        this.a.a(obj);
    }
}
