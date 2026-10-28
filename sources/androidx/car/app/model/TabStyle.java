package androidx.car.app.model;

import defpackage.acv;
import defpackage.acw;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class TabStyle {
    private final CarColor mSelectedBackgroundColor;
    private final Shape mShape;
    private final CarColor mTextColor;

    private TabStyle(acv acvVar) {
        Object obj = acvVar.a;
        this.mShape = null;
        Object obj2 = acvVar.b;
        this.mSelectedBackgroundColor = null;
        Object obj3 = acvVar.c;
        this.mTextColor = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabStyle) {
            TabStyle tabStyle = (TabStyle) obj;
            if (Objects.equals(this.mShape, tabStyle.mShape) && Objects.equals(this.mSelectedBackgroundColor, tabStyle.mSelectedBackgroundColor) && Objects.equals(this.mTextColor, tabStyle.mTextColor)) {
                return true;
            }
        }
        return false;
    }

    public CarColor getSelectedBackgroundColor() {
        return this.mSelectedBackgroundColor;
    }

    public Shape getShape() {
        return this.mShape;
    }

    public CarColor getTextColor() {
        return this.mTextColor;
    }

    public int hashCode() {
        return Objects.hash(this.mShape, this.mSelectedBackgroundColor, this.mTextColor);
    }

    public String toString() {
        return "TabStyle { shape: " + this.mShape + ", selectedBackgroundColor: " + this.mSelectedBackgroundColor + ", textColor: " + this.mTextColor + " }";
    }

    /* synthetic */ TabStyle(acv acvVar, acw acwVar) {
        this(acvVar);
    }

    private TabStyle() {
        this.mShape = null;
        this.mSelectedBackgroundColor = null;
        this.mTextColor = null;
    }
}
