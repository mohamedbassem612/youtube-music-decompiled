package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rlw {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/account/identity/AccountServiceRequestAggregator");
    public final wnw b;
    public final rre c;
    public final zwn d;
    public final zwb e;
    public final rqu f;
    public final rmu g;
    public final aunn h;
    public final tfq i;
    public final rpa j;
    public final vxz k;
    public final omj l;
    private final Executor m;
    private final Executor n;

    public rlw(wnw wnwVar, rre rreVar, zwn zwnVar, Executor executor, Executor executor2, omj omjVar, zwb zwbVar, rpa rpaVar, vxz vxzVar, tfq tfqVar, rqu rquVar, rmu rmuVar, aunn aunnVar) {
        wnwVar.getClass();
        this.b = wnwVar;
        rreVar.getClass();
        this.c = rreVar;
        zwnVar.getClass();
        this.d = zwnVar;
        executor.getClass();
        this.m = executor;
        executor2.getClass();
        this.n = executor2;
        omjVar.getClass();
        this.l = omjVar;
        this.e = zwbVar;
        this.j = rpaVar;
        this.k = vxzVar;
        this.i = tfqVar;
        this.f = rquVar;
        this.g = rmuVar;
        this.h = aunnVar;
    }

    public static boolean b(ovo ovoVar) {
        for (wnq wnqVar : ovoVar.i()) {
            if (wnqVar.k() && (wnqVar.o() || wnqVar.m())) {
                wnx wnxVar = wnqVar.b;
                if (wnxVar.h == null) {
                    wnxVar.b();
                }
                Boolean bool = wnxVar.h;
                if (bool == null) {
                    return true;
                }
                bool.booleanValue();
            }
        }
        return false;
    }

    public final void a(rlt rltVar, tnh tnhVar) {
        this.m.execute(new rlu(this, rltVar, new WeakReference(tnhVar)));
    }

    public final void c(WeakReference weakReference, xsc xscVar) {
        this.n.execute(new rhz(weakReference, xscVar, 9));
    }
}
