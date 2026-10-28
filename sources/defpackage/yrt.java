package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yrt implements aheh {
    final /* synthetic */ wlo a;
    final /* synthetic */ yrr b;
    final /* synthetic */ boolean c;
    final /* synthetic */ tgg d;
    final /* synthetic */ yrv e;

    public yrt(yrv yrvVar, wlo wloVar, yrr yrrVar, boolean z, tgg tggVar) {
        this.a = wloVar;
        this.b = yrrVar;
        this.c = z;
        this.d = tggVar;
        this.e = yrvVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        yrr yrrVar = this.b;
        boolean z = true;
        if ((!yrrVar.e() || this.e.d.i.l(328, 45750598L, false)) && (!yrrVar.d() || !this.e.d.ao())) {
            z = false;
        }
        if (this.c && z) {
            this.a.y(taq.z(th));
        } else {
            this.e.c(this.d, yrrVar.b, this.a, new Exception(th));
        }
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        alvt alvtVar = (alvt) obj;
        zkf.d(alvtVar);
        this.a.ad(alvtVar);
    }
}
