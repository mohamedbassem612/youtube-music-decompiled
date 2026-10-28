package androidx.car.app.model;

import defpackage.ade;
import defpackage.yf;
import defpackage.zy;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Background {
    public static final Background TRANSPARENT;
    private final CarColor mColor;
    private final CarIcon mImage;

    static {
        zy zyVar = new zy();
        CarColor carColorCreateCustom = CarColor.createCustom(0, 0);
        ade.a.a(carColorCreateCustom);
        zyVar.b = carColorCreateCustom;
        if (zyVar.b == null) {
            throw new IllegalStateException("Background must have exactly one property set: either Image or Color.");
        }
        TRANSPARENT = new Background(zyVar);
    }

    public Background(zy zyVar) {
        this.mColor = zyVar.b;
        CarIcon carIcon = zyVar.a;
        this.mImage = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Background) {
            Background background = (Background) obj;
            if (Objects.equals(this.mImage, background.mImage) && Objects.equals(this.mColor, background.mColor)) {
                return true;
            }
        }
        return false;
    }

    public CarColor getColor() {
        return this.mColor;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public int hashCode() {
        return Objects.hashCode(this.mImage);
    }

    public String toString() {
        return "Background [image: " + this.mImage + ", color: " + this.mColor + ']';
    }

    private Background() {
        this.mColor = null;
        this.mImage = null;
    }
}
