package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gck extends gcr {
    private final StackTraceElement[] h;

    public gck(gbg gbgVar, fxg fxgVar, int i, StackTraceElement[] stackTraceElementArr) {
        super(gbgVar, "36m7R5+OgafAlxXiAkEoQQR21WKyBWJKAZod6Nq18rJJQpmXQNjnRy3s9QWSnihX", "EKoIpn4E+7rk/EjAoawlji56NltS6dGID5hzxPIsPH4=", fxgVar, i, 45);
        this.h = stackTraceElementArr;
    }

    @Override // defpackage.gcr
    protected final void a() {
        StackTraceElement[] stackTraceElementArr = this.h;
        if (stackTraceElementArr != null) {
            gbc gbcVar = new gbc((String) this.e.invoke(null, stackTraceElementArr));
            fxg fxgVar = this.d;
            synchronized (fxgVar) {
                long jLongValue = gbcVar.a.longValue();
                fxgVar.copyOnWrite();
                fxl fxlVar = (fxl) fxgVar.instance;
                fxl fxlVar2 = fxl.a;
                fxlVar.c |= 64;
                fxlVar.H = jLongValue;
                if (gbcVar.b.booleanValue()) {
                    int i = true != gbcVar.c.booleanValue() ? 2 : 1;
                    fxgVar.copyOnWrite();
                    fxl fxlVar3 = (fxl) fxgVar.instance;
                    fxlVar3.P = i - 1;
                    fxlVar3.c |= 131072;
                } else {
                    fxgVar.copyOnWrite();
                    fxl fxlVar4 = (fxl) fxgVar.instance;
                    fxlVar4.P = 2;
                    fxlVar4.c |= 131072;
                }
            }
        }
    }
}
