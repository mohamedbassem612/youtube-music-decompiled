package androidx.car.app.model;

import defpackage.yf;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class DurationSpan extends CarSpan {
    private final long mDurationSeconds;

    private DurationSpan() {
        this.mDurationSeconds = 0L;
    }

    public static DurationSpan create(Duration duration) {
        duration.getClass();
        return new DurationSpan(duration.getSeconds());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DurationSpan) && this.mDurationSeconds == ((DurationSpan) obj).mDurationSeconds;
        }
        return true;
    }

    public long getDurationSeconds() {
        return this.mDurationSeconds;
    }

    public int hashCode() {
        long j = this.mDurationSeconds;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "[seconds: " + this.mDurationSeconds + ']';
    }

    public DurationSpan(long j) {
        this.mDurationSeconds = j;
    }

    public static DurationSpan create(long j) {
        return new DurationSpan(j);
    }
}
