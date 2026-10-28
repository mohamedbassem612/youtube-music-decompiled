package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cwe extends cvo {
    private final long a;

    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    public cwe(cvj cvjVar, long j) {
        super(cvjVar);
        ahno.F(((((cvb) cvjVar).b > j ? 1 : (((cvb) cvjVar).b == j ? 0 : -1)) ^ (-1)) >>> 31);
        this.a = j;
    }

    @Override // defpackage.cvo, defpackage.cvj
    public final long d() {
        return super.d() - this.a;
    }

    @Override // defpackage.cvo, defpackage.cvj
    public final long e() {
        return super.e() - this.a;
    }

    @Override // defpackage.cvo, defpackage.cvj
    public final long f() {
        return super.f() - this.a;
    }
}
