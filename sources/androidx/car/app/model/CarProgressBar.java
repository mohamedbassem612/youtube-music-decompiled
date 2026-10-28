package androidx.car.app.model;

import defpackage.aah;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class CarProgressBar {
    private final float mProgress;
    private final CarProgressBarStyle mStyle;

    CarProgressBar(aah aahVar) {
        float f = aahVar.a;
        this.mProgress = 0.0f;
        CarProgressBarStyle carProgressBarStyle = aahVar.b;
        this.mStyle = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarProgressBar) {
            CarProgressBar carProgressBar = (CarProgressBar) obj;
            if (this.mProgress == carProgressBar.mProgress && Objects.equals(this.mStyle, carProgressBar.mStyle)) {
                return true;
            }
        }
        return false;
    }

    public float getProgress() {
        return this.mProgress;
    }

    public CarProgressBarStyle getStyle() {
        return this.mStyle;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.mProgress), this.mStyle);
    }

    public String toString() {
        return "[progress: " + this.mProgress + ", style: " + this.mStyle + ']';
    }

    private CarProgressBar() {
        this.mProgress = 0.0f;
        this.mStyle = null;
    }
}
