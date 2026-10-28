package androidx.car.app.model;

import defpackage.abz;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Place {
    private final CarLocation mLocation;
    private final PlaceMarker mMarker;

    Place(abz abzVar) {
        CarLocation carLocation = abzVar.a;
        this.mLocation = null;
        PlaceMarker placeMarker = abzVar.b;
        this.mMarker = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Place) {
            Place place = (Place) obj;
            if (Objects.equals(this.mLocation, place.mLocation) && Objects.equals(this.mMarker, place.mMarker)) {
                return true;
            }
        }
        return false;
    }

    public CarLocation getLocation() {
        CarLocation carLocation = this.mLocation;
        carLocation.getClass();
        return carLocation;
    }

    public PlaceMarker getMarker() {
        return this.mMarker;
    }

    public int hashCode() {
        return Objects.hash(this.mLocation, this.mMarker);
    }

    public String toString() {
        return "[ location: " + this.mLocation + ", marker: " + this.mMarker + ']';
    }

    private Place() {
        this.mLocation = null;
        this.mMarker = null;
    }
}
