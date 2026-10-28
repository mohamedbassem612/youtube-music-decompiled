package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.yf;
import defpackage.yz;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class TollCard {
    public static final int TOLLCARD_STATE_INVALID = 2;
    public static final int TOLLCARD_STATE_NOT_INSERTED = 3;
    public static final int TOLLCARD_STATE_UNKNOWN = 0;
    public static final int TOLLCARD_STATE_VALID = 1;
    private final CarValue mCardState;

    private TollCard() {
        this.mCardState = CarValue.UNKNOWN_INTEGER;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TollCard) {
            return Objects.equals(this.mCardState, ((TollCard) obj).mCardState);
        }
        return false;
    }

    public CarValue getCardState() {
        CarValue carValue = this.mCardState;
        carValue.getClass();
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mCardState);
    }

    public String toString() {
        return "[ tollcard state: " + this.mCardState + ']';
    }

    TollCard(yz yzVar) {
        Object obj = yzVar.a;
        throw null;
    }
}
