package androidx.car.app.model;

import android.location.Location;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class CarLocation {
    private final double mLat;
    private final double mLng;

    private CarLocation(double d, double d2) {
        this.mLat = d;
        this.mLng = d2;
    }

    public static CarLocation create(Location location) {
        location.getClass();
        return create(location.getLatitude(), location.getLongitude());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarLocation) {
            CarLocation carLocation = (CarLocation) obj;
            if (Double.doubleToLongBits(this.mLat) == Double.doubleToLongBits(carLocation.mLat) && Double.doubleToLongBits(this.mLng) == Double.doubleToLongBits(carLocation.mLng)) {
                return true;
            }
        }
        return false;
    }

    public double getLatitude() {
        return this.mLat;
    }

    public double getLongitude() {
        return this.mLng;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.mLat), Double.valueOf(this.mLng));
    }

    public String toString() {
        return "[" + getLatitude() + ", " + getLongitude() + ']';
    }

    private CarLocation() {
        this(0.0d, 0.0d);
    }

    public static CarLocation create(double d, double d2) {
        return new CarLocation(d, d2);
    }
}
