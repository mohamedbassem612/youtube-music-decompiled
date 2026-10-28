package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rjn {
    private final String a;
    private final double b;
    private final double c;
    private final Duration d;

    public rjn(String str, double d, double d2, Duration duration) {
        this.a = str;
        this.b = d;
        this.c = d2;
        if (duration == null) {
            throw new NullPointerException("Null alignmentStartTime");
        }
        this.d = duration;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rjn) {
            rjn rjnVar = (rjn) obj;
            if (this.a.equals(rjnVar.a)) {
                if (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(rjnVar.b)) {
                    if (Double.doubleToLongBits(this.c) == Double.doubleToLongBits(rjnVar.c) && this.d.equals(rjnVar.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        double d = this.b;
        long jDoubleToLongBits = (Double.doubleToLongBits(d) >>> 32) ^ Double.doubleToLongBits(d);
        double d2 = this.c;
        return (((((((iHashCode * 1000003) ^ ((int) jDoubleToLongBits)) * 1000003) ^ ((int) ((Double.doubleToLongBits(d2) >>> 32) ^ Double.doubleToLongBits(d2)))) * 1000003) ^ this.d.hashCode()) * (-721379959)) ^ 1237;
    }

    public final String toString() {
        return "MergedAudioSegmentKey{uri=" + this.a + ", volume=" + this.b + ", playbackRate=" + this.c + ", alignmentStartTime=" + this.d.toString() + ", automation=null, shouldUseDataSourceFactoryProcessor=false}";
    }

    public rjn() {
        throw null;
    }
}
