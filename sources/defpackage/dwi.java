package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dwi extends dwj {
    private final Object a;
    private final String b;
    private final dwm c;
    private final int d;

    public dwi(Object obj, String str, int i) {
        this.a = obj;
        this.b = str;
        this.d = i;
        dwm dwmVar = new dwm(c(obj, str));
        StackTraceElement[] stackTrace = dwmVar.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length;
        int iF = awro.f(length - 2, 0);
        if (iF < 0) {
            throw new IllegalArgumentException(a.bP(iF, "Requested element count ", " is less than zero."));
        }
        dwmVar.setStackTrace((StackTraceElement[]) (iF == 0 ? awno.a : iF >= length ? atqq.aR(stackTrace) : iF == 1 ? atqq.H(stackTrace[length - 1]) : atqq.aL(atqq.aN(stackTrace, length - iF, length))).toArray(new StackTraceElement[0]));
        this.c = dwmVar;
    }

    @Override // defpackage.dwj
    public final Object b() throws dwm {
        int i = this.d - 1;
        if (i == 0) {
            throw this.c;
        }
        if (i != 1) {
            return null;
        }
        c(this.a, this.b);
        return null;
    }

    @Override // defpackage.dwj
    public final dwj a(String str, awqg awqgVar) {
        return this;
    }
}
