package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abhd implements abhp {
    public final abhq a;
    final /* synthetic */ abhe b;

    public abhd(abhe abheVar, abhq abhqVar) {
        this.b = abheVar;
        this.a = abhqVar;
    }

    @Override // defpackage.abhp
    public final void f(int i, long j) {
        float fJ = this.a.j();
        if (i == 1 || i == 2) {
            this.b.k.f(j, fJ);
        }
    }
}
