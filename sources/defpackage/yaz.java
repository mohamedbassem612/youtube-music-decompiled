package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yaz extends yab {
    public static final agrf n = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/DialSessionRecoverer");
    public final xns o;
    public ListenableFuture p;
    private final Executor q;
    private final ahex r;
    private final xla s;
    private final yar t;

    public yaz(dij dijVar, did didVar, xru xruVar, tfq tfqVar, xns xnsVar, tbt tbtVar, Executor executor, ahex ahexVar, yar yarVar, xla xlaVar, avlh avlhVar, avmb avmbVar, ycd ycdVar, vxz vxzVar) {
        super(dijVar, didVar, xruVar, tfqVar, tbtVar, 3, true, avlhVar, avmbVar, xlaVar, ycdVar, vxzVar);
        this.o = xnsVar;
        this.q = executor;
        this.r = ahexVar;
        this.t = yarVar;
        this.s = xlaVar;
    }

    @Override // defpackage.yab
    protected final void a() {
        ListenableFuture listenableFuture = this.p;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
            this.p = null;
        }
    }

    @Override // defpackage.yab
    public final void b(dii diiVar) {
        xvr xvrVarC = this.t.c(diiVar.s);
        if (!(xvrVarC instanceof xvn)) {
            ((agrc) ((agrc) n.c().i(agso.a, "MDX.DialRecoverer")).k("com/google/android/libraries/youtube/mdx/remote/internal/DialSessionRecoverer", "onRouteFound", 91, "DialSessionRecoverer.java")).t("Non DIAL route was passed in for recovery.");
            return;
        }
        if (this.s.Y()) {
            c(diiVar);
            return;
        }
        xvn xvnVar = (xvn) xvrVarC;
        if (xvnVar.a == null) {
            ((agrc) ((agrc) n.c().i(agso.a, "MDX.DialRecoverer")).k("com/google/android/libraries/youtube/mdx/remote/internal/DialSessionRecoverer", "onRouteFound", 102, "DialSessionRecoverer.java")).t("dial app uri is null");
            return;
        }
        ListenableFuture listenableFuture = this.p;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
            agrx agrxVar = agso.a;
        }
        ListenableFuture listenableFutureSubmit = this.r.submit(new wci(this, xvnVar, 12, null));
        this.p = listenableFutureSubmit;
        taf.i(listenableFutureSubmit, this.q, new wuy(this, 9), new xwl(this, diiVar, 9), null);
    }
}
