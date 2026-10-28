package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yrf implements yqt {
    public final ysm a;
    public final String b;
    private final yqo c;

    public yrf(ysm ysmVar, yqo yqoVar, String str) {
        this.a = ysmVar;
        this.c = yqoVar;
        this.b = str;
    }

    @Override // defpackage.yqt
    public final void g() {
        this.c.c();
    }

    @Override // defpackage.yqt
    public final void h() {
        ygz ygzVar = new ygz(this, 5);
        yqo yqoVar = this.c;
        yno.S(yqoVar.d, ygzVar, 0L, yqoVar.n.a(), yqoVar.p, "Failed to handle eviction.");
    }

    @Override // defpackage.yqt
    public final boolean i() {
        yqo yqoVar = this.c;
        long j = yqoVar.l.get();
        return j == 0 || j > yqoVar.k.b();
    }

    @Override // defpackage.yqt
    public final ysl j() {
        return new ysg(this.a);
    }
}
