package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zxo extends zug {
    public zxj e;
    public zrx f;
    public zxi g;
    public tng h;

    public zxo(zup zupVar, zxq zxqVar) {
        super(zupVar, zxqVar);
    }

    @Override // defpackage.zug
    protected final aigj c() {
        zxn zxnVar = (zxn) this.k.f;
        zxj zxjVar = this.e;
        zxjVar.getClass();
        zxi zxiVar = this.g;
        zxiVar.getClass();
        tng tngVar = this.h;
        if (tngVar == null) {
            tngVar = zzl.b;
        }
        zxiVar.g = zxnVar.b.f(this.n);
        zxiVar.h = this.o;
        byte[] bArr = null;
        try {
            zxf zxfVarA = zxjVar.a(this.f, zxiVar, tngVar);
            jrh jrhVarS = zxfVarA != null ? zxfVarA.S() : null;
            if (jrhVarS != null) {
                return jrhVarS.toByteString();
            }
            return null;
        } catch (tmg e) {
            zxnVar.c.execute(new zgc(tngVar, e, 15, bArr));
            return null;
        }
    }

    @Override // defpackage.zug
    public final void l(long j, long j2) {
        zwa zwaVar;
        super.l(j, j2);
        zxi zxiVar = this.g;
        zxiVar.getClass();
        if (this.n == null && (zwaVar = zxiVar.g) != null) {
            this.n = zwaVar.k();
            this.p = zwaVar.m();
        }
        String str = this.o;
        if (str == null) {
            str = zxiVar.h;
        }
        this.o = str;
        tng tngVar = this.h;
        if (tngVar == null) {
            tngVar = zzl.b;
        }
        this.h = tngVar;
    }
}
