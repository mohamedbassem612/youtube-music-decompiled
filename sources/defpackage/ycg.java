package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ycg extends yab {
    private static final agrf n = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/MdxRemoteSessionRecoverer");

    public ycg(dij dijVar, did didVar, xru xruVar, tfq tfqVar, tbt tbtVar, avlh avlhVar, avmb avmbVar, xla xlaVar, ycd ycdVar, vxz vxzVar) {
        super(dijVar, didVar, xruVar, tfqVar, tbtVar, 6, false, avlhVar, avmbVar, xlaVar, ycdVar, vxzVar);
    }

    @Override // defpackage.yab
    public final void b(dii diiVar) {
        if (xsa.i(diiVar)) {
            c(diiVar);
        } else {
            ((agrc) ((agrc) n.c().i(agso.a, "MDX.MdxRemoteRecoverer")).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxRemoteSessionRecoverer", "onRouteFound", 53, "MdxRemoteSessionRecoverer.java")).t("Non REMOTE route was passed in for recovery");
        }
    }

    @Override // defpackage.yab
    protected final void a() {
    }
}
