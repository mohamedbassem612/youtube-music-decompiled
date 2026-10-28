package androidx.car.app.model;

import defpackage.aai;
import defpackage.aaj;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class CarProgressBarStyle {
    private final CarColor mColor;
    private final int mStrokeCap;
    private final CarColor mTrackColor;

    private CarProgressBarStyle(aai aaiVar) {
        Object obj = aaiVar.b;
        this.mColor = null;
        Object obj2 = aaiVar.c;
        this.mTrackColor = null;
        int i = aaiVar.a;
        this.mStrokeCap = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarProgressBarStyle) {
            CarProgressBarStyle carProgressBarStyle = (CarProgressBarStyle) obj;
            if (Objects.equals(this.mColor, carProgressBarStyle.mColor) && Objects.equals(this.mTrackColor, carProgressBarStyle.mTrackColor) && this.mStrokeCap == carProgressBarStyle.mStrokeCap) {
                return true;
            }
        }
        return false;
    }

    public CarColor getColor() {
        return this.mColor;
    }

    public int getStrokeCap() {
        return this.mStrokeCap;
    }

    public CarColor getTrackColor() {
        return this.mTrackColor;
    }

    public int hashCode() {
        return Objects.hash(this.mColor, this.mTrackColor, Integer.valueOf(this.mStrokeCap));
    }

    public String toString() {
        return "CarProgressBarStyle{color=" + this.mColor + ", trackColor=" + this.mTrackColor + ", strokeCap=" + this.mStrokeCap + '}';
    }

    /* synthetic */ CarProgressBarStyle(aai aaiVar, aaj aajVar) {
        this(aaiVar);
    }

    private CarProgressBarStyle() {
        this.mColor = null;
        this.mTrackColor = null;
        this.mStrokeCap = 0;
    }
}
