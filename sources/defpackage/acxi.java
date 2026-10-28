package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acxi extends aeep {
    public asmv a;
    public xgn b;
    public aeem c;
    public nrv d;
    public byte e;
    public int f;
    private int g;
    private aigj h;
    private int i;
    private int j;

    public acxi() {
        super(null);
    }

    @Override // defpackage.aeep
    public final /* bridge */ /* synthetic */ aeeq a() {
        aigj aigjVar;
        int i;
        if (this.e == 63 && (aigjVar = this.h) != null && (i = this.f) != 0) {
            return new aeeq(this.g, this.a, this.b, aigjVar, this.c, this.i, this.j, i, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" counterfactual");
        }
        if ((this.e & 2) == 0) {
            sb.append(" duration");
        }
        if (this.h == null) {
            sb.append(" clickTrackingParams");
        }
        if ((this.e & 4) == 0) {
            sb.append(" rateLimited");
        }
        if ((this.e & 8) == 0) {
            sb.append(" bottomUiType");
        }
        if ((this.e & 16) == 0) {
            sb.append(" largeFormFactorWidthDp");
        }
        if (this.f == 0) {
            sb.append(" snackbarAnimationStyle");
        }
        if ((this.e & 32) == 0) {
            sb.append(" shownOnFullscreen");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.i = i;
        this.e = (byte) (this.e | 8);
    }

    public final void c(aigj aigjVar) {
        if (aigjVar == null) {
            throw new NullPointerException("Null clickTrackingParams");
        }
        this.h = aigjVar;
    }

    public final void d(int i) {
        this.g = i;
        this.e = (byte) (this.e | 2);
    }

    public final void e(int i) {
        this.j = i;
        this.e = (byte) (this.e | 16);
    }

    @Override // defpackage.aeen
    public final /* bridge */ /* synthetic */ void i(int i) {
        throw null;
    }
}
