package androidx.car.app.navigation.model;

import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.DateTimeWithZone;
import androidx.car.app.model.Distance;
import defpackage.aeh;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class TravelEstimate {
    public static final long REMAINING_TIME_UNKNOWN = -1;
    private final DateTimeWithZone mArrivalTimeAtDestination;
    private final Distance mRemainingDistance;
    private final CarColor mRemainingDistanceColor;
    private final CarColor mRemainingTimeColor;
    private final long mRemainingTimeSeconds;
    private final CarIcon mTripIcon;
    private final CarText mTripText;

    TravelEstimate(aeh aehVar) {
        Distance distance = aehVar.a;
        this.mRemainingDistance = null;
        long j = aehVar.b;
        this.mRemainingTimeSeconds = 0L;
        DateTimeWithZone dateTimeWithZone = aehVar.c;
        this.mArrivalTimeAtDestination = null;
        CarColor carColor = aehVar.d;
        this.mRemainingTimeColor = null;
        CarColor carColor2 = aehVar.e;
        this.mRemainingDistanceColor = null;
        CarText carText = aehVar.f;
        this.mTripText = null;
        CarIcon carIcon = aehVar.g;
        this.mTripIcon = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TravelEstimate) {
            TravelEstimate travelEstimate = (TravelEstimate) obj;
            if (Objects.equals(this.mRemainingDistance, travelEstimate.mRemainingDistance) && this.mRemainingTimeSeconds == travelEstimate.mRemainingTimeSeconds && Objects.equals(this.mArrivalTimeAtDestination, travelEstimate.mArrivalTimeAtDestination) && Objects.equals(this.mRemainingTimeColor, travelEstimate.mRemainingTimeColor) && Objects.equals(this.mRemainingDistanceColor, travelEstimate.mRemainingDistanceColor) && Objects.equals(this.mTripText, travelEstimate.mTripText) && Objects.equals(this.mTripIcon, travelEstimate.mTripIcon)) {
                return true;
            }
        }
        return false;
    }

    public DateTimeWithZone getArrivalTimeAtDestination() {
        return this.mArrivalTimeAtDestination;
    }

    public Distance getRemainingDistance() {
        return this.mRemainingDistance;
    }

    public CarColor getRemainingDistanceColor() {
        return this.mRemainingDistanceColor;
    }

    public CarColor getRemainingTimeColor() {
        return this.mRemainingTimeColor;
    }

    public long getRemainingTimeSeconds() {
        long j = this.mRemainingTimeSeconds;
        if (j < 0) {
            return -1L;
        }
        return j;
    }

    public CarIcon getTripIcon() {
        return this.mTripIcon;
    }

    public CarText getTripText() {
        return this.mTripText;
    }

    public int hashCode() {
        return Objects.hash(this.mRemainingDistance, Long.valueOf(this.mRemainingTimeSeconds), this.mArrivalTimeAtDestination, this.mRemainingTimeColor, this.mRemainingDistanceColor, this.mTripText, this.mTripIcon);
    }

    public String toString() {
        return "[ remaining distance: " + this.mRemainingDistance + ", time (s): " + this.mRemainingTimeSeconds + ", ETA: " + this.mArrivalTimeAtDestination + ']';
    }

    private TravelEstimate() {
        this.mRemainingDistance = null;
        this.mRemainingTimeSeconds = 0L;
        this.mArrivalTimeAtDestination = null;
        CarColor carColor = CarColor.DEFAULT;
        this.mRemainingTimeColor = carColor;
        this.mRemainingDistanceColor = carColor;
        this.mTripText = null;
        this.mTripIcon = null;
    }
}
