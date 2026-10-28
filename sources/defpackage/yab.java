package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class yab implements ycs {
    private static final agrf n = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/BaseSessionRecoverer");
    public final dij a;
    public final tbt b;
    public final Handler c;
    public final yaa d;
    public final boolean e;
    public int f;
    public xze g;
    public boolean h;
    public final avlh i;
    public final avmm j;
    public final avmb k;
    public final xla l;
    public final tfq m;
    private final did o;
    private final xru p;
    private final ycd q;
    private final Handler.Callback r;
    private final vxz s;
    private final int t;
    private xxy u;
    private final azs v = new xzz(this);

    public yab(dij dijVar, did didVar, xru xruVar, tfq tfqVar, tbt tbtVar, int i, boolean z, avlh avlhVar, avmb avmbVar, xla xlaVar, ycd ycdVar, vxz vxzVar) {
        ogb ogbVar = new ogb(this, 2);
        this.r = ogbVar;
        taq.d();
        this.a = dijVar;
        this.o = didVar;
        this.p = xruVar;
        this.m = tfqVar;
        this.b = tbtVar;
        this.t = i;
        this.e = z;
        this.c = new Handler(Looper.getMainLooper(), ogbVar);
        this.d = new yaa(this);
        this.i = avlhVar;
        this.j = new avmm();
        this.k = avmbVar;
        this.l = xlaVar;
        this.q = ycdVar;
        this.s = vxzVar;
    }

    private final void k() {
        taq.d();
        a();
        this.b.l(this.d);
        this.h = false;
        this.u = null;
        this.a.q(this.v);
        this.c.removeCallbacksAndMessages(null);
        this.p.I(this);
        avmm avmmVar = this.j;
        if (avmmVar.a() != 0) {
            avmmVar.b();
        }
    }

    protected abstract void a();

    public abstract void b(dii diiVar);

    public final void c(dii diiVar) {
        if (this.f != 1) {
            ((agrc) ((agrc) n.b().i(agso.a, "MDX.BaseSessionRecoverer")).k("com/google/android/libraries/youtube/mdx/remote/internal/BaseSessionRecoverer", "recoverRoute", 212, "BaseSessionRecoverer.java")).t("recoverRoute() called when recoverer is not in STARTED state.");
            return;
        }
        this.f = 4;
        xxy xxyVar = this.u;
        if (xxyVar != null) {
            yat yatVar = (yat) xxyVar.a;
            xze xzeVar = yatVar.f;
            if (xzeVar == null) {
                ((agrc) ((agrc) yat.a.c().i(agso.a, "MDX.SessionRecoveryController")).k("com/google/android/libraries/youtube/mdx/remote/internal/DefaultSessionRecoveryController$2", "onRecoveryCompleted", 360, "DefaultSessionRecoveryController.java")).t("mdxSessionInRecovery is null when onRecoverCompleted() is called, abort.");
                yatVar.a(3);
            } else {
                String str = diiVar.d;
                if (xsa.b(str, xzeVar.c)) {
                    yatVar.h = str;
                    yatVar.g = xzeVar;
                    diiVar.i(true);
                    yatVar.a(4);
                } else {
                    ((agrc) ((agrc) yat.a.c().i(agso.a, "MDX.SessionRecoveryController")).k("com/google/android/libraries/youtube/mdx/remote/internal/DefaultSessionRecoveryController$2", "onRecoveryCompleted", 369, "DefaultSessionRecoveryController.java")).t("recovered route id does not match previously stored in progress route id, abort");
                    yatVar.a(3);
                }
            }
        }
        k();
    }

    @Override // defpackage.ycs
    public final void d() {
        taq.d();
        if (this.f == 1) {
            this.f = 3;
            k();
        }
    }

    @Override // defpackage.ycs
    public final boolean e() {
        boolean z = this.e;
        tfq tfqVar = this.m;
        if (z) {
            if (!tfqVar.j(1)) {
                return false;
            }
        } else if (!tfqVar.i()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ycs
    public final boolean f(xzc xzcVar) {
        taq.d();
        xze xzeVar = this.g;
        if (xzeVar != null && this.f == 1 && xzcVar.n().k == this.t) {
            return xqz.f(xzcVar.j()).equals(xzeVar.c);
        }
        return false;
    }

    public final void h() {
        Handler handler = this.c;
        if (handler.hasMessages(1)) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, 1000L);
    }

    public final void i(int i) {
        if (this.f != 1) {
            ((agrc) ((agrc) n.b().i(agso.a, "MDX.BaseSessionRecoverer")).k("com/google/android/libraries/youtube/mdx/remote/internal/BaseSessionRecoverer", "abortRecovery", 234, "BaseSessionRecoverer.java")).u("abortRecovery() called when recoverer is not in STARTED state with reason: %d", i - 1);
            return;
        }
        this.f = 2;
        xxy xxyVar = this.u;
        if (xxyVar != null) {
            ((yat) xxyVar.a).a(3);
        }
        k();
    }

    @Override // defpackage.ycs
    public final void j(xze xzeVar, xxy xxyVar) {
        taq.d();
        xxyVar.getClass();
        this.u = xxyVar;
        this.f = 1;
        this.a.p(this.o, this.v, 0);
        this.g = xzeVar;
        this.p.N(this);
        if (this.s.l(164, 45673420L, false)) {
            this.q.g(amyh.MDX_POLLING_FREQUENCY_PING, null);
        }
        this.c.sendEmptyMessage(1);
    }
}
