package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gcm extends gcr {
    private final gbm h;
    private long i;

    public gcm(gbg gbgVar, fxg fxgVar, int i, gbm gbmVar) {
        super(gbgVar, "XO5i/0wDN9HqQegTjenf7ERhMfSZEPMxooGMY4pn2WO+4nZYY36+aT9w/XWj/Cws", "4IjL1kWH0N7BHAfJanI6Zxa2rCt8/vvZPg8dlhK0cII=", fxgVar, i, 53);
        this.h = gbmVar;
        if (gbmVar != null) {
            this.i = gbmVar.a();
        }
    }

    @Override // defpackage.gcr
    protected final void a() {
        if (this.h != null) {
            fxg fxgVar = this.d;
            long jLongValue = ((Long) this.e.invoke(null, Long.valueOf(this.i))).longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.c |= 16384;
            fxlVar.O = jLongValue;
        }
    }
}
