package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yaf extends yab {
    private static final agrf n = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/CastSessionRecoverer");
    private final xsa o;

    public yaf(dij dijVar, did didVar, xru xruVar, tfq tfqVar, tbt tbtVar, xsa xsaVar, avlh avlhVar, avmb avmbVar, xla xlaVar, ycd ycdVar, vxz vxzVar) {
        super(dijVar, didVar, xruVar, tfqVar, tbtVar, 2, true, avlhVar, avmbVar, xlaVar, ycdVar, vxzVar);
        this.o = xsaVar;
    }

    @Override // defpackage.yab
    public final void b(dii diiVar) {
        if (this.o.d(diiVar)) {
            c(diiVar);
        } else {
            ((agrc) ((agrc) n.c().i(agso.a, "MDX.CastRecoverer")).k("com/google/android/libraries/youtube/mdx/remote/internal/CastSessionRecoverer", "onRouteFound", 60, "CastSessionRecoverer.java")).t("Non cast route was passed in for recovery.");
        }
    }

    @Override // defpackage.yab
    protected final void a() {
    }
}
