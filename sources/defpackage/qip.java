package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qip {
    public int a;
    public float b;
    public agev c = agdf.a;
    public byte d;
    public int e;

    public final qiq a() {
        int i;
        if (this.d == 3 && (i = this.e) != 0) {
            qiq qiqVar = new qiq(i, this.a, this.b, this.c);
            float f = qiqVar.a;
            ahno.P(f > 0.0f && f <= 1.0f, "Sampling Probability shall be > 0 and <= 1");
            return qiqVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" enablement");
        }
        if ((this.d & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.d & 2) == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
