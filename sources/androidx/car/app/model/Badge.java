package androidx.car.app.model;

import defpackage.yf;
import defpackage.zz;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class Badge {
    private final CarColor mDotColor;
    private final boolean mHasDot;
    private final CarIcon mIcon;
    private final CarColor mIconBackgroundColor;

    Badge(zz zzVar) {
        boolean z = zzVar.a;
        this.mHasDot = false;
        Object obj = zzVar.b;
        this.mDotColor = null;
        Object obj2 = zzVar.c;
        this.mIcon = null;
        Object obj3 = zzVar.d;
        this.mIconBackgroundColor = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Badge) {
            Badge badge = (Badge) obj;
            if (this.mHasDot == badge.mHasDot && Objects.equals(this.mDotColor, badge.mDotColor) && Objects.equals(this.mIcon, badge.mIcon) && Objects.equals(this.mIconBackgroundColor, badge.mIconBackgroundColor)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public CarColor getBackgroundColor() {
        return this.mDotColor;
    }

    public CarColor getDotColor() {
        return this.mDotColor;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public CarColor getIconBackgroundColor() {
        return this.mIconBackgroundColor;
    }

    public boolean hasDot() {
        return this.mHasDot;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mHasDot), this.mDotColor, this.mIcon, this.mIconBackgroundColor);
    }

    public String toString() {
        return "[hasDot: " + this.mHasDot + ", dotColor: " + this.mDotColor + ", icon: " + this.mIcon + ", iconBackgroundColor: " + this.mIconBackgroundColor + ']';
    }

    private Badge() {
        this.mHasDot = false;
        this.mDotColor = null;
        this.mIcon = null;
        this.mIconBackgroundColor = null;
    }
}
