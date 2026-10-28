package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acgb {
    public final long a;
    public final long b;

    public acgb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static acgb a(long j, long j2) {
        ahno.F(j <= j2);
        return new acgb(j, j2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acgb) {
            acgb acgbVar = (acgb) obj;
            if (this.a == acgbVar.a && this.b == acgbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "Bounds{startMillis=" + this.a + ", endMillis=" + this.b + '}';
    }

    public acgb() {
        throw null;
    }
}
