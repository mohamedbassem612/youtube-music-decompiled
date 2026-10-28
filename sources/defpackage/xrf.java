package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xrf extends dhn {
    static final /* synthetic */ awsj[] a = {new awrf(xrf.class, "routeSelector", "getRouteSelector()Lcom/google/android/libraries/youtube/mdx/mediaroute/MdxRouteSelector;"), new awrf(xrf.class, "mdxVolumeManager", "getMdxVolumeManager()Lcom/google/android/libraries/youtube/mdx/remote/MdxVolumeManager;")};
    private final xla b;
    private final xvr c;
    private final String d;
    private final aunn e;
    private final aunn f;

    public xrf(aunn aunnVar, aunn aunnVar2, xla xlaVar, xvr xvrVar, String str) {
        aunnVar.getClass();
        aunnVar2.getClass();
        xlaVar.getClass();
        str.getClass();
        this.b = xlaVar;
        this.c = xvrVar;
        this.d = str;
        this.e = aunnVar;
        this.f = aunnVar2;
    }

    private final xzm a() {
        return (xzm) taq.i(this.f, a[1]);
    }

    private final xsc c() {
        return (xsc) taq.i(this.e, a[0]);
    }

    @Override // defpackage.dhn
    public final void b() {
        if (this.b.az()) {
            agrx agrxVar = agso.a;
            c().c(this.d);
        }
    }

    @Override // defpackage.dhn
    public final void d(int i) {
        agrx agrxVar = agso.a;
        a().b(i);
    }

    @Override // defpackage.dhn
    public final void f(int i) {
        agrx agrxVar = agso.a;
        xzm xzmVarA = a();
        if (i > 0) {
            xzl xzlVar = xzmVarA.b;
            if (xzlVar.d()) {
                xzlVar.c(3);
                return;
            } else {
                ((agrc) ((agrc) xzm.a.b().i(agrxVar, "MDX.remote")).k("com/google/android/libraries/youtube/mdx/remote/MdxVolumeManager$MdxVolumeDelegateImpl", "onIncreaseVolume", 195, "MdxVolumeManager.java")).t("Remote control is not connected, cannot change volume");
                return;
            }
        }
        xzl xzlVar2 = xzmVarA.b;
        if (xzlVar2.d()) {
            xzlVar2.c(-3);
        } else {
            ((agrc) ((agrc) xzm.a.b().i(agrxVar, "MDX.remote")).k("com/google/android/libraries/youtube/mdx/remote/MdxVolumeManager$MdxVolumeDelegateImpl", "onDecreaseVolume", 204, "MdxVolumeManager.java")).t("Remote control is not connected, cannot change volume");
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    @Override // defpackage.dhn
    public final void p() {
        agrx agrxVar = agso.a;
        xsc xscVarC = c();
        ?? r1 = xscVarC.b;
        xrj xrjVar = (xrj) r1.io();
        String str = this.d;
        xrg xrgVarA = xrjVar.a(str);
        ((ycp) xscVarC.c.io()).e(this.c, xrgVarA.a, xrgVarA.b, xrgVarA.c);
        ((xrj) r1.io()).d(str, null);
    }

    @Override // defpackage.dhn
    public final void q(int i) {
        agrx agrxVar = agso.a;
        if (this.b.az()) {
            c().c(this.d);
        } else {
            c().b(this.d, Optional.of(Integer.valueOf(i)));
        }
    }
}
