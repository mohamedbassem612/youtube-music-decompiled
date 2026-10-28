package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ybo extends yab {
    private static final agrf n = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/MdxCloudSessionRecoverer");

    public ybo(dij dijVar, did didVar, xru xruVar, tfq tfqVar, tbt tbtVar, avlh avlhVar, avmb avmbVar, xla xlaVar, ycd ycdVar, vxz vxzVar) {
        super(dijVar, didVar, xruVar, tfqVar, tbtVar, 4, false, avlhVar, avmbVar, xlaVar, ycdVar, vxzVar);
    }

    @Override // defpackage.yab
    public final void b(dii diiVar) {
        if (xsa.e(diiVar)) {
            c(diiVar);
        } else {
            ((agrc) ((agrc) n.c().i(agso.a, "MDX.MdxCloudRecoverer")).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxCloudSessionRecoverer", "onRouteFound", 53, "MdxCloudSessionRecoverer.java")).t("Non CLOUD route was passed in for recovery");
        }
    }

    @Override // defpackage.yab
    protected final void a() {
    }
}
