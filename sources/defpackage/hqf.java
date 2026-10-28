package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class hqf implements aheh {
    final /* synthetic */ zwa a;
    final /* synthetic */ aahb b;
    final /* synthetic */ hqg c;

    public hqf(hqg hqgVar, zwa zwaVar, aahb aahbVar) {
        this.a = zwaVar;
        this.b = aahbVar;
        this.c = hqgVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        ((agrc) ((agrc) ((agrc) hqg.a.b()).j(th)).k("com/google/android/apps/youtube/music/offline/compat/legacy/OfflineStoreObserver$4", "onFailure", (char) 840, "OfflineStoreObserver.java")).t("Failed to fetch core offline entities in callback");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, zwa] */
    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        zwa zwaVar = this.a;
        aahb aahbVar = this.b;
        Optional optionalB = this.c.b();
        hqe hqeVar = new hqe(this, optional, zwaVar, aahbVar, 0);
        if (true == optionalB.isPresent()) {
            Object obj2 = optionalB.get();
            Object obj3 = hqeVar.a;
            Object obj4 = hqeVar.b;
            Optional optional2 = (Optional) obj4;
            hqf hqfVar = (hqf) obj3;
            hqfVar.c(optional2, hqeVar.c, (aahb) hqeVar.d, (wer) obj2);
        }
    }

    public final /* synthetic */ void c(Optional optional, zwa zwaVar, aahb aahbVar, wer werVar) {
        boolean zIsPresent = optional.isPresent();
        hqg hqgVar = this.c;
        if (zIsPresent) {
            hqgVar.f(werVar, ((tzk) optional.get()).I(hqgVar.g.e(zwaVar)));
        } else {
            String strD = aahbVar.d();
            int iA = aahbVar.a();
            ahno.F(hpv.a.containsKey(Integer.valueOf(iA)));
            String strG = wfs.g(iA, strD);
            werVar.j(strG);
            aaun aaunVar = new aaun();
            aaunVar.d(strG);
            aaunVar.b = null;
            hqgVar.e.kk(aaunVar.b());
        }
        hqg.o(werVar);
    }
}
