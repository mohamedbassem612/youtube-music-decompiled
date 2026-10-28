package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class CarHardwareLocation {
    public static final CarValue UNIMPLEMENTED_LOCATION = new CarValue(null, 0, 2);
    public static final CarValue UNKNOWN_LOCATION = new CarValue(null, 0, 0);
    private final CarValue mLocation;

    public CarHardwareLocation(CarValue carValue) {
        carValue.getClass();
        this.mLocation = carValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarHardwareLocation) {
            return Objects.equals(this.mLocation, ((CarHardwareLocation) obj).mLocation);
        }
        return false;
    }

    public CarValue getLocation() {
        return this.mLocation;
    }

    public int hashCode() {
        return Objects.hash(this.mLocation);
    }

    public String toString() {
        return "[ location: " + this.mLocation + " ]";
    }

    private CarHardwareLocation() {
        this.mLocation = UNKNOWN_LOCATION;
    }
}
