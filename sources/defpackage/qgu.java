package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qgu {
    public int a;
    public byte b;
    public int c;
    private boolean d;

    public final qgv a() {
        int i;
        if (this.b == 3 && (i = this.c) != 0) {
            return new qgv(i, this.a, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if ((this.b & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.b & 2) == 0) {
            sb.append(" perfettoMustBeExplicitlyTriggered");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.d = z;
        this.b = (byte) (this.b | 2);
    }
}
