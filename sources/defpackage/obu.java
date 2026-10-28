package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class obu {
    public final aunn a;
    public final aunn b;
    public final aunn c;
    public final aunn d;
    public final int e;
    public final omj f;
    private final ExecutorService g;

    public obu(aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, oaq oaqVar, ExecutorService executorService, omj omjVar) {
        this.a = aunnVar;
        this.b = aunnVar2;
        this.c = aunnVar3;
        this.d = aunnVar4;
        this.g = executorService;
        this.f = omjVar;
        int iBc = a.bc(oaqVar.d);
        this.e = iBc == 0 ? 2 : iBc;
    }

    public final ListenableFuture a(final int i) {
        ahfo ahfoVar = new ahfo(new Callable() { // from class: obs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                obu obuVar = this.a;
                int i3 = i2 - 1;
                if (i3 == 1) {
                    return (obq) obuVar.a.io();
                }
                if (i3 == 2) {
                    return (obq) obuVar.b.io();
                }
                if (i3 == 3) {
                    return (obq) obuVar.c.io();
                }
                if (i3 == 4) {
                    return (obq) obuVar.d.io();
                }
                throw new IllegalArgumentException();
            }
        });
        this.g.execute(ahfoVar);
        return aheo.p(ahfoVar).r(new hqn(5), MoreExecutors.directExecutor());
    }
}
