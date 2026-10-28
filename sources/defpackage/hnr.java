package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class hnr implements aheh {
    final /* synthetic */ boolean a;
    final /* synthetic */ hnt b;

    public hnr(hnt hntVar, boolean z) {
        this.a = z;
        this.b = hntVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        ((agrc) ((agrc) ((agrc) hnt.a.b().i(agso.a, "AutoOfflineToggleCtlr")).j(th)).k("com/google/android/apps/youtube/music/offline/autooffline/AutoOfflineToggleController$2", "onFailure", (char) 231, "AutoOfflineToggleController.java")).t("Failure to get enableSmartDownloadRecentMusic");
        boolean z = this.a;
        hnt hntVar = this.b;
        if (z) {
            hntVar.c();
        } else {
            hntVar.f.f();
            hntVar.a();
        }
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean z = this.a;
        if (!z) {
            this.b.f.f();
        }
        if (!bool.booleanValue()) {
            this.b.f.g();
        }
        if (z || bool.booleanValue()) {
            this.b.c();
        } else {
            this.b.a();
        }
    }
}
