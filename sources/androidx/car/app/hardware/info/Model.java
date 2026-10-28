package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.yf;
import defpackage.yx;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Model {
    private final CarValue mManufacturer;
    private final CarValue mName;
    private final CarValue mYear;

    private Model() {
        CarValue carValue = CarValue.UNKNOWN_STRING;
        this.mName = carValue;
        this.mManufacturer = carValue;
        this.mYear = CarValue.UNKNOWN_INTEGER;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Model) {
            Model model = (Model) obj;
            if (Objects.equals(this.mName, model.mName) && Objects.equals(this.mYear, model.mYear) && Objects.equals(this.mManufacturer, model.mManufacturer)) {
                return true;
            }
        }
        return false;
    }

    public CarValue getManufacturer() {
        CarValue carValue = this.mManufacturer;
        carValue.getClass();
        return carValue;
    }

    public CarValue getName() {
        CarValue carValue = this.mName;
        carValue.getClass();
        return carValue;
    }

    public CarValue getYear() {
        CarValue carValue = this.mYear;
        carValue.getClass();
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mName, this.mYear, this.mManufacturer);
    }

    public String toString() {
        return "[ name: " + this.mName + ", year: " + this.mYear + ", manufacturer: " + this.mManufacturer + ']';
    }

    Model(yx yxVar) {
        Object obj = yxVar.a;
        throw null;
    }
}
