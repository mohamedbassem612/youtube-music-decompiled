package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abfl implements yxe {
    public final abfc a;
    public final abez b;
    public final abfa c;
    public volatile yxe d;
    private final avmm e;

    public abfl(abfc abfcVar, abez abezVar, abfa abfaVar, avlh avlhVar) {
        this.a = abfcVar;
        this.b = abezVar;
        this.c = abfaVar;
        avmm avmmVar = new avmm();
        this.e = avmmVar;
        avmmVar.c(aawb.w(avlhVar, new abfb(2)).i(new abwr(1)).ak(new abae(this, 16)));
    }

    @Override // defpackage.yxe
    public final yxd a(long j) {
        yxe yxeVar = this.d;
        return yxeVar == null ? abfk.a.j : yxeVar.a(j);
    }

    @Override // defpackage.yxe
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.yxe
    public final /* synthetic */ void c() {
    }
}
