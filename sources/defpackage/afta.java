package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class afta implements afvn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public afta(afvn afvnVar, int i) {
        this.$cid = i;
        this.a = afvnVar;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [afvl, java.lang.Object] */
    @Override // defpackage.afvn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.$cid;
        if (i == 0) {
            aftc aftcVar = (aftc) this.a;
            aftcVar.s();
            aftcVar.q();
            aftcVar.a = null;
            return;
        }
        if (i == 1) {
            aftc aftcVar2 = (aftc) this.a;
            aftcVar2.s();
            aftcVar2.q();
        } else if (i != 2) {
            afty.d(this.a);
        } else {
            qpj.d(new afjc(this, 6), 10000L);
        }
    }

    public /* synthetic */ afta(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
