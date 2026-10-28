package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.yf;
import defpackage.yv;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class EvStatus {
    private final CarValue mEvChargePortConnected;
    private final CarValue mEvChargePortOpen;

    EvStatus(yv yvVar) {
        Object obj = yvVar.b;
        this.mEvChargePortConnected = null;
        Object obj2 = yvVar.a;
        this.mEvChargePortOpen = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EvStatus) {
            EvStatus evStatus = (EvStatus) obj;
            if (Objects.equals(this.mEvChargePortConnected, evStatus.mEvChargePortConnected) && Objects.equals(this.mEvChargePortOpen, evStatus.mEvChargePortOpen)) {
                return true;
            }
        }
        return false;
    }

    public CarValue getEvChargePortConnected() {
        CarValue carValue = this.mEvChargePortConnected;
        carValue.getClass();
        return carValue;
    }

    public CarValue getEvChargePortOpen() {
        CarValue carValue = this.mEvChargePortOpen;
        carValue.getClass();
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mEvChargePortOpen, this.mEvChargePortConnected);
    }

    public String toString() {
        return "[ EV charge port open: " + this.mEvChargePortOpen + ", EV charge port connected: " + this.mEvChargePortConnected + ']';
    }

    private EvStatus() {
        CarValue carValue = CarValue.UNKNOWN_BOOLEAN;
        this.mEvChargePortOpen = carValue;
        this.mEvChargePortConnected = carValue;
    }
}
