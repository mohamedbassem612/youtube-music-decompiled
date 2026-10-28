package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zjg implements mbc, twi {
    private final mbc a;
    private Long b;
    private final agfr c;
    private final double d;
    private final boolean e;

    public zjg(mbc mbcVar, double d, boolean z) {
        zkf.d(mbcVar);
        zkf.a(d > 0.0d);
        this.a = mbcVar;
        this.c = null;
        this.d = 1.0d - Math.exp((-0.6931471805599453d) / d);
        this.e = z;
    }

    @Override // defpackage.twi
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Long l = (Long) obj;
        if (l != null) {
            if (this.c == null) {
                synchronized (this) {
                    long jLongValue = l.longValue() - this.a.b();
                    Long l2 = this.b;
                    if (l2 == null) {
                        this.b = Long.valueOf(jLongValue);
                    } else {
                        double d = this.d;
                        this.b = Long.valueOf(Math.round(((1.0d - d) * l2.longValue()) + (d * jLongValue)));
                    }
                }
                return;
            }
            long jLongValue2 = l.longValue() - this.a.b();
            synchronized (this) {
                if (this.b == null) {
                    this.b = Long.valueOf(jLongValue2);
                } else {
                    double d2 = ((zjf) this.c.io()).a;
                    synchronized (this) {
                        this.b = Long.valueOf(Math.round(((1.0d - d2) * this.b.longValue()) + (d2 * jLongValue2)));
                    }
                }
            }
        }
    }

    @Override // defpackage.mbc
    public final long b() {
        return this.a.b();
    }

    @Override // defpackage.mbc
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.mbc
    public final long d() {
        return System.nanoTime();
    }

    @Override // defpackage.mbc
    public final Duration e() {
        return this.a.e();
    }

    @Override // defpackage.mbc
    public final Instant f() {
        Long l;
        Instant instantOfEpochMilli;
        if (this.c == null) {
            synchronized (this) {
                if (this.b != null) {
                    instantOfEpochMilli = Instant.ofEpochMilli(this.a.b()).plusMillis(this.b.longValue());
                } else {
                    instantOfEpochMilli = this.e ? Instant.ofEpochMilli(-1L) : this.a.f().truncatedTo(ChronoUnit.MILLIS);
                }
            }
            return instantOfEpochMilli;
        }
        synchronized (this) {
            l = this.b;
        }
        if (l != null) {
            return Instant.ofEpochMilli(this.a.b()).plusMillis(l.longValue());
        }
        return ((zjf) this.c.io()).b ? Instant.ofEpochMilli(-1L) : this.a.f().truncatedTo(ChronoUnit.MILLIS);
    }

    public zjg(mbc mbcVar, agfr agfrVar) {
        this.a = mbcVar;
        this.c = aguu.al(new zaz(agfrVar, 9));
        this.d = 0.0d;
        this.e = false;
    }
}
