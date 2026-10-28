package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.yf;
import defpackage.yw;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Mileage {
    private final CarValue mDistanceDisplayUnit;
    private final CarValue mOdometerMeters;

    private Mileage() {
        this.mOdometerMeters = CarValue.UNKNOWN_FLOAT;
        this.mDistanceDisplayUnit = CarValue.UNKNOWN_INTEGER;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Mileage) {
            Mileage mileage = (Mileage) obj;
            if (Objects.equals(getOdometerInKilometers(), mileage.getOdometerInKilometers()) && Objects.equals(this.mDistanceDisplayUnit, mileage.mDistanceDisplayUnit)) {
                return true;
            }
        }
        return false;
    }

    public CarValue getDistanceDisplayUnit() {
        CarValue carValue = this.mDistanceDisplayUnit;
        carValue.getClass();
        return carValue;
    }

    public CarValue getOdometerInKilometers() {
        CarValue carValue = this.mOdometerMeters;
        carValue.getClass();
        return carValue;
    }

    @Deprecated
    public CarValue getOdometerMeters() {
        return getOdometerInKilometers();
    }

    public int hashCode() {
        return Objects.hash(getOdometerInKilometers(), this.mDistanceDisplayUnit);
    }

    public String toString() {
        return "[ odometer: " + getOdometerInKilometers() + ", distance display unit: " + this.mDistanceDisplayUnit + ']';
    }

    Mileage(yw ywVar) {
        Object obj = ywVar.a;
        throw null;
    }
}
