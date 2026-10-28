package androidx.car.app.navigation.model;

import androidx.car.app.model.CarText;
import defpackage.aad;
import defpackage.aei;
import defpackage.yf;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Trip {
    private final CarText mCurrentRoad;
    private final List mDestinationTravelEstimates;
    private final List mDestinations;
    private final boolean mIsLoading;
    private final List mStepTravelEstimates;
    private final List mSteps;

    Trip(aei aeiVar) {
        List list = aeiVar.a;
        this.mDestinations = aad.b(null);
        List list2 = aeiVar.b;
        this.mSteps = aad.b(null);
        List list3 = aeiVar.c;
        this.mDestinationTravelEstimates = aad.b(null);
        List list4 = aeiVar.d;
        this.mStepTravelEstimates = aad.b(null);
        CarText carText = aeiVar.e;
        this.mCurrentRoad = null;
        boolean z = aeiVar.f;
        this.mIsLoading = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Trip) {
            Trip trip = (Trip) obj;
            if (Objects.equals(this.mDestinations, trip.mDestinations) && Objects.equals(this.mSteps, trip.mSteps) && Objects.equals(this.mDestinationTravelEstimates, trip.mDestinationTravelEstimates) && Objects.equals(this.mStepTravelEstimates, trip.mStepTravelEstimates) && Objects.equals(this.mCurrentRoad, trip.mCurrentRoad) && Objects.equals(Boolean.valueOf(this.mIsLoading), Boolean.valueOf(trip.mIsLoading))) {
                return true;
            }
        }
        return false;
    }

    public CarText getCurrentRoad() {
        return this.mCurrentRoad;
    }

    public List getDestinationTravelEstimates() {
        return aad.a(this.mDestinationTravelEstimates);
    }

    public List getDestinations() {
        return aad.a(this.mDestinations);
    }

    public List getStepTravelEstimates() {
        return aad.a(this.mStepTravelEstimates);
    }

    public List getSteps() {
        return aad.a(this.mSteps);
    }

    public int hashCode() {
        return Objects.hash(this.mDestinations, this.mSteps, this.mDestinationTravelEstimates, this.mStepTravelEstimates, this.mCurrentRoad);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "[ destinations : " + this.mDestinations.toString() + ", steps: " + this.mSteps.toString() + ", dest estimates: " + this.mDestinationTravelEstimates.toString() + ", step estimates: " + this.mStepTravelEstimates.toString() + ", road: " + CarText.toShortString(this.mCurrentRoad) + ", isLoading: " + this.mIsLoading + ']';
    }

    private Trip() {
        this.mDestinations = Collections.EMPTY_LIST;
        this.mSteps = Collections.EMPTY_LIST;
        this.mDestinationTravelEstimates = Collections.EMPTY_LIST;
        this.mStepTravelEstimates = Collections.EMPTY_LIST;
        this.mCurrentRoad = null;
        this.mIsLoading = false;
    }
}
