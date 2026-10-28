package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class afsy implements afvn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ afvn a;
    public final /* synthetic */ afvn b;

    public /* synthetic */ afsy(afvn afvnVar, afvl afvlVar, int i) {
        this.$cid = i;
        this.a = afvnVar;
        this.b = afvlVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [afvl, afvn] */
    @Override // defpackage.afvn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.$cid;
        if (i == 0) {
            this.a.close();
            afty.d(this.b);
            return;
        }
        if (i == 1) {
            this.b.close();
            this.a.close();
            return;
        }
        afvn afvnVar = this.b;
        if (i == 2) {
            afvnVar.close();
            this.a.close();
        } else {
            afvnVar.close();
            this.a.close();
            afty.k();
        }
    }

    public /* synthetic */ afsy(afvn afvnVar, afvn afvnVar2, int i) {
        this.$cid = i;
        this.b = afvnVar;
        this.a = afvnVar2;
    }
}
