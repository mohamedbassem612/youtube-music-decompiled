package androidx.car.app.model;

import defpackage.ade;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class ForegroundCarColorSpan extends CarSpan {
    private final CarColor mCarColor;

    private ForegroundCarColorSpan() {
        this.mCarColor = CarColor.DEFAULT;
    }

    public static ForegroundCarColorSpan create(CarColor carColor) {
        ade.a.a(carColor);
        carColor.getClass();
        return new ForegroundCarColorSpan(carColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForegroundCarColorSpan) {
            return Objects.equals(this.mCarColor, ((ForegroundCarColorSpan) obj).mCarColor);
        }
        return false;
    }

    public CarColor getColor() {
        return this.mCarColor;
    }

    public int hashCode() {
        return Objects.hashCode(this.mCarColor);
    }

    public String toString() {
        return "[color: " + this.mCarColor + ']';
    }

    private ForegroundCarColorSpan(CarColor carColor) {
        this.mCarColor = carColor;
    }
}
