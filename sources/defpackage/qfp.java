package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qfp {
    public int a;
    public byte b;
    public int c;
    private float d;
    private final agev e = agdf.a;

    public final qfq a() {
        int i;
        if (this.b == 3 && (i = this.c) != 0) {
            qfq qfqVar = new qfq(i, this.d, this.a, this.e);
            float f = qfqVar.a;
            ahno.G(f > 0.0f && f <= 100.0f, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
            return qfqVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if ((this.b & 1) == 0) {
            sb.append(" startupSamplePercentage");
        }
        if ((this.b & 2) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(float f) {
        this.d = f;
        this.b = (byte) (this.b | 1);
    }
}
