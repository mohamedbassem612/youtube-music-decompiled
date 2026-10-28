package androidx.car.app.hardware.climate;

import defpackage.yf;
import defpackage.yr;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class CarClimateFeature {
    private final List mCarZones;
    private final int mFeature;

    CarClimateFeature(yr yrVar) {
        Object obj = yrVar.b;
        this.mCarZones = DesugarCollections.unmodifiableList(null);
        int i = yrVar.a;
        this.mFeature = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CarClimateFeature carClimateFeature = (CarClimateFeature) obj;
            if (Objects.equals(Integer.valueOf(this.mFeature), Integer.valueOf(carClimateFeature.mFeature)) && Objects.equals(this.mCarZones, carClimateFeature.mCarZones)) {
                return true;
            }
        }
        return false;
    }

    public List getCarZones() {
        return this.mCarZones;
    }

    public int getFeature() {
        return this.mFeature;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mFeature), this.mCarZones);
    }

    public String toString() {
        return "ClimateProfileFeature{mFeature='" + this.mFeature + "', mCarZones=" + this.mCarZones + '}';
    }
}
