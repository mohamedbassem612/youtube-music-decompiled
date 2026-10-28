package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xrl implements avlw {
    final /* synthetic */ xrn a;

    public xrl(xrn xrnVar) {
        this.a = xrnVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        ((agrc) ((agrc) ((agrc) xrn.a.b().i(agso.a, "MDX.MediaRouteButtonController")).j(th)).k("com/google/android/libraries/youtube/mdx/mediaroute/MediaRouteButtonController$3", "onError", (char) 270, "MediaRouteButtonController.java")).t("Received error observing isCastingEnabled.");
        this.a.d();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        this.a.m = avmnVar;
    }

    @Override // defpackage.avlw
    public final /* bridge */ /* synthetic */ void kk(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        xrn xrnVar = this.a;
        xrnVar.l = zBooleanValue;
        xrnVar.c();
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.a.d();
    }
}
