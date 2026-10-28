package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.yf;
import defpackage.yy;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Speed {
    private final CarValue mDisplaySpeedMetersPerSecond;
    private final CarValue mRawSpeedMetersPerSecond;
    private final CarValue mSpeedDisplayUnit;

    private Speed() {
        CarValue carValue = CarValue.UNKNOWN_FLOAT;
        this.mRawSpeedMetersPerSecond = carValue;
        this.mDisplaySpeedMetersPerSecond = carValue;
        this.mSpeedDisplayUnit = CarValue.UNKNOWN_INTEGER;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Speed) {
            Speed speed = (Speed) obj;
            if (Objects.equals(getRawSpeedMetersPerSecond(), speed.getRawSpeedMetersPerSecond()) && Objects.equals(getDisplaySpeedMetersPerSecond(), speed.getDisplaySpeedMetersPerSecond()) && Objects.equals(this.mSpeedDisplayUnit, speed.mSpeedDisplayUnit)) {
                return true;
            }
        }
        return false;
    }

    public CarValue getDisplaySpeedMetersPerSecond() {
        CarValue carValue = this.mDisplaySpeedMetersPerSecond;
        carValue.getClass();
        return carValue;
    }

    public CarValue getRawSpeedMetersPerSecond() {
        CarValue carValue = this.mRawSpeedMetersPerSecond;
        carValue.getClass();
        return carValue;
    }

    public CarValue getSpeedDisplayUnit() {
        CarValue carValue = this.mSpeedDisplayUnit;
        carValue.getClass();
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(getRawSpeedMetersPerSecond(), getDisplaySpeedMetersPerSecond(), this.mSpeedDisplayUnit);
    }

    public String toString() {
        return "[ raw speed: " + getRawSpeedMetersPerSecond() + ", display speed: " + getDisplaySpeedMetersPerSecond() + ", speed display unit: " + this.mSpeedDisplayUnit + ']';
    }

    Speed(yy yyVar) {
        Object obj = yyVar.a;
        throw null;
    }
}
