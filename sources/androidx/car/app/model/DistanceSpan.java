package androidx.car.app.model;

import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class DistanceSpan extends CarSpan {
    private final Distance mDistance;

    private DistanceSpan() {
        this.mDistance = null;
    }

    public static DistanceSpan create(Distance distance) {
        distance.getClass();
        return new DistanceSpan(distance);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DistanceSpan) {
            return Objects.equals(this.mDistance, ((DistanceSpan) obj).mDistance);
        }
        return false;
    }

    public Distance getDistance() {
        Distance distance = this.mDistance;
        distance.getClass();
        return distance;
    }

    public int hashCode() {
        return Objects.hashCode(this.mDistance);
    }

    public String toString() {
        return "[distance: " + this.mDistance + ']';
    }

    private DistanceSpan(Distance distance) {
        this.mDistance = distance;
    }
}
