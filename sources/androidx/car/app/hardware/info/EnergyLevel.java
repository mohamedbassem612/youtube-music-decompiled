package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.yf;
import defpackage.yt;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class EnergyLevel {
    private final CarValue mBatteryPercent;
    private final CarValue mDistanceDisplayUnit;
    private final CarValue mEnergyIsLow;
    private final CarValue mFuelPercent;
    private final CarValue mFuelVolumeDisplayUnit;
    private final CarValue mRangeRemainingMeters;

    private EnergyLevel() {
        CarValue carValue = CarValue.UNKNOWN_FLOAT;
        this.mBatteryPercent = carValue;
        this.mFuelPercent = carValue;
        this.mEnergyIsLow = CarValue.UNKNOWN_BOOLEAN;
        this.mRangeRemainingMeters = carValue;
        CarValue carValue2 = CarValue.UNKNOWN_INTEGER;
        this.mDistanceDisplayUnit = carValue2;
        this.mFuelVolumeDisplayUnit = carValue2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EnergyLevel) {
            EnergyLevel energyLevel = (EnergyLevel) obj;
            if (Objects.equals(this.mBatteryPercent, energyLevel.mBatteryPercent) && Objects.equals(this.mFuelPercent, energyLevel.mFuelPercent) && Objects.equals(this.mEnergyIsLow, energyLevel.mEnergyIsLow) && Objects.equals(getRangeRemainingMeters(), energyLevel.getRangeRemainingMeters()) && Objects.equals(this.mDistanceDisplayUnit, energyLevel.mDistanceDisplayUnit) && Objects.equals(this.mFuelVolumeDisplayUnit, energyLevel.mFuelVolumeDisplayUnit)) {
                return true;
            }
        }
        return false;
    }

    public CarValue getBatteryPercent() {
        CarValue carValue = this.mBatteryPercent;
        carValue.getClass();
        return carValue;
    }

    public CarValue getDistanceDisplayUnit() {
        CarValue carValue = this.mDistanceDisplayUnit;
        carValue.getClass();
        return carValue;
    }

    public CarValue getEnergyIsLow() {
        CarValue carValue = this.mEnergyIsLow;
        carValue.getClass();
        return carValue;
    }

    public CarValue getFuelPercent() {
        CarValue carValue = this.mFuelPercent;
        carValue.getClass();
        return carValue;
    }

    public CarValue getFuelVolumeDisplayUnit() {
        CarValue carValue = this.mFuelVolumeDisplayUnit;
        carValue.getClass();
        return carValue;
    }

    public CarValue getRangeRemainingMeters() {
        CarValue carValue = this.mRangeRemainingMeters;
        carValue.getClass();
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mBatteryPercent, this.mFuelPercent, this.mEnergyIsLow, getRangeRemainingMeters(), this.mDistanceDisplayUnit, this.mFuelVolumeDisplayUnit);
    }

    public String toString() {
        return "[ battery percent: " + this.mBatteryPercent + ", fuel percent: " + this.mFuelPercent + ", energyIsLow: " + this.mEnergyIsLow + ", range remaining: " + getRangeRemainingMeters() + ", distance display unit: " + this.mDistanceDisplayUnit + ", fuel volume display unit: " + this.mFuelVolumeDisplayUnit + ']';
    }

    EnergyLevel(yt ytVar) {
        Object obj = ytVar.a;
        throw null;
    }
}
