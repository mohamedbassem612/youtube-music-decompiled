package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lfu {
    public final lfv a;
    public int b = 1;
    public long c = a();

    public lfu(lfv lfvVar) {
        this.a = lfvVar;
    }

    public final long a() {
        long jLongValue = ((Long) lcl.w.b(null)).longValue();
        long jLongValue2 = ((Long) lcl.x.b(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            jLongValue <<= 1;
            if (jLongValue >= jLongValue2 || jLongValue < 0) {
                jLongValue = jLongValue2;
                break;
            }
        }
        this.a.aV();
        return System.currentTimeMillis() + Math.min(jLongValue, jLongValue2);
    }
}
