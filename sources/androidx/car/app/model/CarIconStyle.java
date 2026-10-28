package androidx.car.app.model;

import defpackage.aaf;
import defpackage.aag;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class CarIconStyle {
    private final Shape mShape;
    private final CarColor mTint;
    public static final CarIconStyle TINTED = new CarIconStyle(CarColor.DEFAULT, (Shape) null);
    public static final CarIconStyle ORIGINAL = new CarIconStyle((CarColor) null, (Shape) null);

    private CarIconStyle(aaf aafVar) {
        this.mTint = (CarColor) aafVar.a;
        this.mShape = (Shape) aafVar.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarIconStyle) {
            CarIconStyle carIconStyle = (CarIconStyle) obj;
            if (Objects.equals(this.mTint, carIconStyle.mTint) && Objects.equals(this.mShape, carIconStyle.mShape)) {
                return true;
            }
        }
        return false;
    }

    public Shape getShape() {
        return this.mShape;
    }

    public CarColor getTint() {
        return this.mTint;
    }

    public int hashCode() {
        return Objects.hash(this.mTint, this.mShape);
    }

    public String toString() {
        return "CarIconStyle { tint: " + this.mTint + ", shape: " + this.mShape + " }";
    }

    public /* synthetic */ CarIconStyle(aaf aafVar, aag aagVar) {
        this(aafVar);
    }

    public CarIconStyle(CarColor carColor, Shape shape) {
        this.mTint = carColor;
        this.mShape = shape;
    }

    private CarIconStyle() {
        this.mShape = null;
        this.mTint = null;
    }
}
