package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbv extends gcr {
    private final long h;

    public gbv(gbg gbgVar, fxg fxgVar, long j, int i) {
        super(gbgVar, "oUx7gRUfjLbYTFQxx0y/5RD+F4PUp1zpOQ0dzFFvRFY2x4ioVCn3ywDjpOcCQUpR", "V7Cu9MtUHod/U+bO4UdVng2NzhXFeWTpHvFMG8bmBWY=", fxgVar, i, 25);
        this.h = j;
    }

    @Override // defpackage.gcr
    protected final void a() {
        long jLongValue = ((Long) this.e.invoke(null, null)).longValue();
        fxg fxgVar = this.d;
        synchronized (fxgVar) {
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.e |= 32;
            fxlVar.am = jLongValue;
            long j = this.h;
            if (j != 0) {
                fxgVar.copyOnWrite();
                fxl fxlVar3 = (fxl) fxgVar.instance;
                fxlVar3.b |= 65536;
                fxlVar3.p = jLongValue - j;
                fxgVar.copyOnWrite();
                fxl fxlVar4 = (fxl) fxgVar.instance;
                fxlVar4.b |= 2097152;
                fxlVar4.s = j;
            }
        }
    }
}
