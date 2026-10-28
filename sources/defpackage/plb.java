package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class plb {
    private final Long a;
    private final long b;

    public plb(Long l, long j) {
        this.a = l;
        this.b = j;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public static plb b(long j) {
        ahno.F(((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        pkt pktVar = new pkt();
        pktVar.a = Long.valueOf(j);
        pktVar.b(SystemClock.uptimeMillis());
        return pktVar.a();
    }

    public static plb c() {
        pkt pktVar = new pkt();
        pktVar.a = null;
        pktVar.b(SystemClock.uptimeMillis());
        return pktVar.a();
    }

    public final long a() {
        Long l = this.a;
        l.getClass();
        return Math.max(0L, l.longValue() - (SystemClock.uptimeMillis() - this.b));
    }

    public final plb d(long j) {
        if (f()) {
            return this;
        }
        pkt pktVar = new pkt();
        pktVar.a = Long.valueOf(Math.max(0L, this.a.longValue() - j));
        pktVar.b(this.b);
        return pktVar.a();
    }

    public final boolean e() {
        return !f() && a() <= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof plb) {
            plb plbVar = (plb) obj;
            Long l = this.a;
            if (l != null ? l.equals(plbVar.a) : plbVar.a == null) {
                if (this.b == plbVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f() {
        return this.a == null;
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = l == null ? 0 : l.hashCode();
        long j = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "Timeout{value=" + this.a + ", startTime=" + this.b + '}';
    }

    public plb() {
        throw null;
    }
}
