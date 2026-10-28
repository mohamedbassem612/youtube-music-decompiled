package androidx.car.app.model;

import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Shape {
    public static final int TYPE_CORNER_EXTRA_LARGE = 6;
    public static final int TYPE_CORNER_EXTRA_SMALL = 2;
    public static final int TYPE_CORNER_FULL = 7;
    public static final int TYPE_CORNER_LARGE = 5;
    public static final int TYPE_CORNER_MEDIUM = 4;
    public static final int TYPE_CORNER_SMALL = 3;
    public static final int TYPE_NONE = 1;
    private final int mShapeType;
    public static final Shape NONE = new Shape(1);
    public static final Shape CORNER_EXTRA_SMALL = new Shape(2);
    public static final Shape CORNER_SMALL = new Shape(3);
    public static final Shape CORNER_MEDIUM = new Shape(4);
    public static final Shape CORNER_LARGE = new Shape(5);
    public static final Shape CORNER_EXTRA_LARGE = new Shape(6);
    public static final Shape CORNER_FULL = new Shape(7);

    private Shape() {
        this.mShapeType = 1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Shape) && this.mShapeType == ((Shape) obj).mShapeType;
        }
        return true;
    }

    public int getShapeType() {
        return this.mShapeType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mShapeType));
    }

    public String toString() {
        return "Shape { shapeType: " + this.mShapeType + " }";
    }

    private Shape(int i) {
        this.mShapeType = i;
    }
}
