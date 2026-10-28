package defpackage;

import j$.time.Duration;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vfz {
    public final long a;
    public final Duration b;
    public final Duration c;
    private final Duration d;
    private final Duration e;
    private final Duration f;
    private final Duration g = null;
    private final Long h = null;

    public vfz(long j, Duration duration, Duration duration2, Duration duration3, Duration duration4) {
        this.a = j;
        this.b = duration;
        this.d = duration2;
        this.e = duration3;
        this.f = duration4;
        if (duration2.isNegative()) {
            Objects.toString(duration2);
            throw new IllegalStateException("Duration must be non-negative. Got ".concat(duration2.toString()));
        }
        Duration durationPlus = duration.plus(duration2);
        durationPlus.getClass();
        this.c = durationPlus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vfz) {
            vfz vfzVar = (vfz) obj;
            if (this.a == vfzVar.a && awrc.c(this.b, vfzVar.b) && awrc.c(this.d, vfzVar.d) && awrc.c(this.e, vfzVar.e) && awrc.c(this.f, vfzVar.f)) {
                Duration duration = vfzVar.g;
                if (awrc.c(null, null)) {
                    Long l = vfzVar.h;
                    if (awrc.c(null, null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iAk = (((a.ak(this.a) * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
        Duration duration = this.e;
        int iHashCode = ((iAk * 31) + (duration == null ? 0 : duration.hashCode())) * 31;
        Duration duration2 = this.f;
        return (iHashCode + (duration2 != null ? duration2.hashCode() : 0)) * 961;
    }

    public final String toString() {
        return "TimeSpan(id=" + this.a + ", start=" + this.b + ", duration=" + this.d + ", sourceStart=" + this.e + ", sourceDuration=" + this.f + ", maxDuration=null, trackId=null)";
    }
}
