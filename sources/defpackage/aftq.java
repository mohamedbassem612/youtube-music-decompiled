package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aftq implements afvn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ afvn a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aftq(afts aftsVar, afvn afvnVar, int i) {
        this.$cid = i;
        this.b = aftsVar;
        this.a = afvnVar;
    }

    @Override // defpackage.afvn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.$cid;
        afvn afvnVar = this.a;
        if (i == 0) {
            afvnVar.close();
            afts aftsVar = (afts) this.b;
            aftsVar.c = null;
            aftsVar.d = null;
            return;
        }
        afvnVar.close();
        aftc aftcVar = (aftc) this.b;
        aftcVar.a = null;
        aftcVar.b = false;
        afty.e((afvh) afty.d.get(), aftcVar.c);
        aftcVar.c = null;
    }

    public /* synthetic */ aftq(afvn afvnVar, aftc aftcVar, int i) {
        this.$cid = i;
        this.a = afvnVar;
        this.b = aftcVar;
    }
}
