package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class Time implements Comparable {
    public static final Time a = new Time(0, 1);
    public static final Time b = new Time(1, 0);
    public final long ticks;
    public final long timescale;

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes4.dex */
    final class Bridge {
        private Bridge() {
        }
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes4.dex */
    public enum RoundingMode {
        APPROX_NEAREST(0),
        APPROX_TOWARD_ZERO(1),
        APPROX_TOWARD_INFINITY(2),
        APPROX_UP(3),
        APPROX_DOWN(4),
        NEAREST(8),
        TOWARD_ZERO(9),
        TOWARD_INFINITY(10),
        UP(11),
        DOWN(12);

        public final int l;
        public static final RoundingMode k = APPROX_NEAREST;

        RoundingMode(int i) {
            this.l = i;
        }
    }

    public Time(long j, long j2) {
        this.ticks = j;
        this.timescale = j2;
    }

    public final double a() {
        long j = this.timescale;
        long j2 = this.ticks;
        if (j != 0) {
            return j2 / (((j >>> 32) * 4.294967296E9d) + j);
        }
        if (j2 < 0) {
            return Double.NEGATIVE_INFINITY;
        }
        return j2 <= 0 ? Double.NaN : Double.POSITIVE_INFINITY;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    final double b() {
        long j = this.ticks;
        if (j < -9007199254740991L || j > 9007199254740991L) {
            this = TimeJniBridge.reduce(this);
        } else {
            long j2 = this.timescale;
            if (j2 < 0 || j2 > 9007199254740991L) {
                this = TimeJniBridge.reduce(this);
            }
        }
        return this.a();
    }

    public final long c() {
        Time timeE = e(1000000L);
        if (timeE.g()) {
            return timeE.ticks <= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return timeE.ticks;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return TimeJniBridge.compare(this, (Time) obj);
    }

    public final long d() {
        Time timeE = e(1000L);
        if (timeE.g()) {
            return timeE.ticks <= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return timeE.ticks;
    }

    public final Time e(long j) {
        return TimeJniBridge.convertTimescale(this, j, RoundingMode.k.l);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Time) {
            return TimeJniBridge.equals(this, (Time) obj);
        }
        return false;
    }

    public final boolean f() {
        return this.timescale != 0;
    }

    public final boolean g() {
        return this.ticks == 0 && this.timescale == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(b());
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        return this.ticks + " / " + this.timescale + " = " + a() + " s";
    }
}
