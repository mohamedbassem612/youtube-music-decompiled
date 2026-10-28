package defpackage;

import android.os.Bundle;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aul extends auk {
    public final Instant a;
    public final Long b;
    public final Duration c;
    public final boolean d;
    public final int e;

    public aul(Instant instant, Long l, Duration duration, boolean z, int i) {
        azs.g(((instant != null ? 1 : 0) + (l != null ? 1 : 0)) + (duration != null ? 1 : 0) == 1, "Exactly one of zeroTime, zeroElapsedRealtime, or pausedDuration must be present; received %s,%s,%s", instant, l, duration);
        azs.g(i > 0 && i <= 2, "Invalid format: %s", Integer.valueOf(i));
        this.a = instant;
        this.b = l;
        this.c = duration;
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.auk
    public final void a(Bundle bundle) {
        Instant instant = this.a;
        if (instant != null) {
            bundle.putLong("zeroTime", instant.toEpochMilli());
        } else {
            Long l = this.b;
            if (l != null) {
                bundle.putLong("zeroElapsedRealtime", l.longValue());
            } else {
                Duration duration = this.c;
                if (duration != null) {
                    bundle.putLong("pausedDuration", duration.toMillis());
                }
            }
        }
        bundle.putBoolean("countDown", this.d);
        bundle.putInt("format", this.e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aul)) {
            return false;
        }
        aul aulVar = (aul) obj;
        return this == aulVar || (Objects.equals(this.a, aulVar.a) && Objects.equals(this.b, aulVar.b) && Objects.equals(this.c, aulVar.c) && this.d == aulVar.d && this.e == aulVar.e);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeDifference{");
        Instant instant = this.a;
        if (instant != null) {
            sb.append("mZeroTime=");
            sb.append(instant);
        } else {
            Long l = this.b;
            if (l != null) {
                sb.append("mZeroElapsedRealtime=");
                sb.append(l);
            } else {
                Duration duration = this.c;
                if (duration != null) {
                    sb.append("mPausedDuration=");
                    sb.append(duration);
                }
            }
        }
        sb.append(", mCountDown=");
        sb.append(this.d);
        sb.append(", mFormat=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
