package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class piz {
    public double a = 1000.0d;
    public Long b;

    public final double a(long j) {
        Long l = this.b;
        if (l == null) {
            throw new IllegalArgumentException("lastEventTime is null");
        }
        return (this.a * 0.7d) + (Math.max((j - l.longValue()) / 1000.0d, 5.0E-4d) * 0.30000000000000004d);
    }

    public final float b(long j) {
        if (this.b == null) {
            return 0.0f;
        }
        return (float) (1.0d / a(j));
    }
}
