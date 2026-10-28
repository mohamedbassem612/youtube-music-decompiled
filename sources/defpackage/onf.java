package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class onf implements aheh {
    final /* synthetic */ ong a;
    final /* synthetic */ int b;
    final /* synthetic */ aihf c;

    public onf(ong ongVar, int i, aihf aihfVar) {
        this.b = i;
        this.c = aihfVar;
        this.a = ongVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        onb.g(th, "%s: failure when sampling log!", "MddEventLogger");
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        agev agevVar = (agev) obj;
        if (agevVar.g()) {
            this.a.p(this.b, this.c, 100L, (ahaz) agevVar.c());
        }
    }
}
