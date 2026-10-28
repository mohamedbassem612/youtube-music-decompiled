package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class son {
    public int a;
    public Object b;
    private boolean c;
    private byte d;

    public final soo a() {
        Object obj;
        if (this.d == 3 && (obj = this.b) != null) {
            return new soo(this.a, this.c, (sgn) obj);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" timeRemainingMillis");
        }
        if ((this.d & 2) == 0) {
            sb.append(" showAdChoices");
        }
        if (this.b == null) {
            sb.append(" adCountMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(sgn sgnVar) {
        if (sgnVar == null) {
            throw new NullPointerException("Null adCountMetadata");
        }
        this.b = sgnVar;
    }

    public final void c(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 2);
    }

    public final void d(int i) {
        this.a = i;
        this.d = (byte) (this.d | 1);
    }

    public final qeq e() {
        int i;
        Object obj;
        if (this.d == 1 && (i = this.a) != 0 && (obj = this.b) != null) {
            return new qeq(i, this.c, (qnl) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" enablement");
        }
        if (this.d == 0) {
            sb.append(" chargeCounterEnabled");
        }
        if (this.b == null) {
            sb.append(" metricExtensionProvider");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }
}
