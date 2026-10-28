package androidx.car.app.model;

import defpackage.a;
import defpackage.adf;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class CarIconSpan extends CarSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int mAlignment;
    private final CarIcon mIcon;

    private CarIconSpan() {
        this.mIcon = null;
        this.mAlignment = 1;
    }

    private static String alignmentToString(int i) {
        if (i == 0) {
            return "bottom";
        }
        if (i != 1) {
            return i != 2 ? "unknown" : "center";
        }
        return "baseline";
    }

    public static CarIconSpan create(CarIcon carIcon, int i) {
        adf.b.a(carIcon);
        if (i != 1 && i != 0 && i != 2) {
            throw new IllegalStateException(a.bR(i, "Invalid alignment value: "));
        }
        carIcon.getClass();
        return new CarIconSpan(carIcon, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarIconSpan) {
            return Objects.equals(this.mIcon, ((CarIconSpan) obj).mIcon);
        }
        return false;
    }

    public int getAlignment() {
        return this.mAlignment;
    }

    public CarIcon getIcon() {
        CarIcon carIcon = this.mIcon;
        carIcon.getClass();
        return carIcon;
    }

    public int hashCode() {
        return Objects.hashCode(this.mIcon);
    }

    public String toString() {
        return "[icon: " + this.mIcon + ", alignment: " + alignmentToString(this.mAlignment) + ']';
    }

    private CarIconSpan(CarIcon carIcon, int i) {
        this.mIcon = carIcon;
        this.mAlignment = i;
    }

    public static CarIconSpan create(CarIcon carIcon) {
        return create(carIcon, 1);
    }
}
