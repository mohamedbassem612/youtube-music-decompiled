package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class seh implements xjn {
    private final /* synthetic */ int $cid;
    private final aawh a;
    private final agfr b;
    private final abnc c;

    public seh(abnc abncVar, zho zhoVar, agfr agfrVar, int i, byte[] bArr) {
        this.$cid = i;
        this.c = abncVar;
        aawh aawhVar = new aawh();
        this.a = aawhVar;
        this.b = agfrVar;
        zhoVar.d(aawhVar);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.xjn
    public final xjm a(xkd xkdVar) {
        int i = this.$cid;
        aawh aawhVar = this.a;
        if (i != 0) {
            aawhVar.h();
            return new sef(aawhVar, this.c.c().a, this.b.io(), xkdVar);
        }
        aawhVar.h();
        return new sei(aawhVar, this.c.c().a, this.b.io(), xkdVar);
    }

    public seh(abnc abncVar, zho zhoVar, agfr agfrVar, int i) {
        this.$cid = i;
        this.c = abncVar;
        aawh aawhVar = new aawh();
        this.a = aawhVar;
        this.b = agfrVar;
        zhoVar.d(aawhVar);
    }
}
