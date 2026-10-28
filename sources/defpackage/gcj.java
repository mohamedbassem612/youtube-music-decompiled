package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gcj extends gcr {
    private final boolean h;

    public gcj(gbg gbgVar, fxg fxgVar, int i) {
        super(gbgVar, "oM6Bx5XwATIp+mbr3vlJrJNQk/at9J7WRvdkNqooo5Oy+1T5rH5nUpgVpKKJdcHF", "hnpmSZMBPYMzYsPjN9tNfe5/9LG1v02OYDAJ2u5L+Wg=", fxgVar, i, 61);
        this.h = gbgVar.m.a;
    }

    @Override // defpackage.gcr
    protected final void a() {
        long jLongValue = ((Long) this.e.invoke(null, this.a.a, Boolean.valueOf(this.h))).longValue();
        fxg fxgVar = this.d;
        synchronized (fxgVar) {
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.c |= 8388608;
            fxlVar.W = jLongValue;
        }
    }
}
