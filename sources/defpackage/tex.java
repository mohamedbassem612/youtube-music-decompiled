package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tex {
    public boolean a;
    public byte b;
    private int c;
    private int d;
    private boolean e;

    public final tfu a() {
        if (this.b == 15) {
            return new tfu(this.c, this.d, this.e, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" connectionTimeoutMs");
        }
        if ((this.b & 2) == 0) {
            sb.append(" readTimeoutMs");
        }
        if ((this.b & 4) == 0) {
            sb.append(" installSecureRequestEnforcer");
        }
        if ((this.b & 8) == 0) {
            sb.append(" followRedirects");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.c = i;
        this.b = (byte) (this.b | 1);
    }

    public final void c(boolean z) {
        this.e = z;
        this.b = (byte) (this.b | 4);
    }

    public final void d(int i) {
        this.d = i;
        this.b = (byte) (this.b | 2);
    }
}
