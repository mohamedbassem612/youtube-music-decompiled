package androidx.car.app.model;

import defpackage.aam;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class ChipStyle {
    private final CarColor mBackgroundColor;
    private final CarColor mContentColor;
    private final CarColor mOutlineColor;
    private final Shape mShape;

    ChipStyle(aam aamVar) {
        CarColor carColor = aamVar.a;
        this.mBackgroundColor = null;
        CarColor carColor2 = aamVar.b;
        this.mContentColor = null;
        CarColor carColor3 = aamVar.c;
        this.mOutlineColor = null;
        Shape shape = aamVar.d;
        this.mShape = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChipStyle) {
            ChipStyle chipStyle = (ChipStyle) obj;
            if (Objects.equals(this.mBackgroundColor, chipStyle.mBackgroundColor) && Objects.equals(this.mContentColor, chipStyle.mContentColor) && Objects.equals(this.mOutlineColor, chipStyle.mOutlineColor) && Objects.equals(this.mShape, chipStyle.mShape)) {
                return true;
            }
        }
        return false;
    }

    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public CarColor getContentColor() {
        return this.mContentColor;
    }

    public CarColor getOutlineColor() {
        return this.mOutlineColor;
    }

    public Shape getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return Objects.hash(this.mBackgroundColor, this.mContentColor, this.mOutlineColor, this.mShape);
    }

    public String toString() {
        return "ChipStyle{backgroundColor=" + this.mBackgroundColor + ", contentColor=" + this.mContentColor + ", outlineColor=" + this.mOutlineColor + ", shape=" + this.mShape + '}';
    }

    private ChipStyle() {
        this.mBackgroundColor = null;
        this.mContentColor = null;
        this.mOutlineColor = null;
        this.mShape = null;
    }
}
