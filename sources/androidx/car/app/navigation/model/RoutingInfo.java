package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Distance;
import defpackage.ady;
import defpackage.aeg;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class RoutingInfo implements ady {
    private final Distance mCurrentDistance;
    private final Step mCurrentStep;
    private final boolean mIsLoading;
    private final CarIcon mJunctionImage;
    private final Step mNextStep;

    RoutingInfo(aeg aegVar) {
        Object obj = aegVar.b;
        this.mCurrentStep = null;
        Object obj2 = aegVar.c;
        this.mCurrentDistance = null;
        Object obj3 = aegVar.d;
        this.mNextStep = null;
        Object obj4 = aegVar.e;
        this.mJunctionImage = null;
        boolean z = aegVar.a;
        this.mIsLoading = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoutingInfo) {
            RoutingInfo routingInfo = (RoutingInfo) obj;
            if (this.mIsLoading == routingInfo.mIsLoading && Objects.equals(this.mCurrentStep, routingInfo.mCurrentStep) && Objects.equals(this.mCurrentDistance, routingInfo.mCurrentDistance) && Objects.equals(this.mNextStep, routingInfo.mNextStep) && Objects.equals(this.mJunctionImage, routingInfo.mJunctionImage)) {
                return true;
            }
        }
        return false;
    }

    public Distance getCurrentDistance() {
        return this.mCurrentDistance;
    }

    public Step getCurrentStep() {
        return this.mCurrentStep;
    }

    public CarIcon getJunctionImage() {
        return this.mJunctionImage;
    }

    public Step getNextStep() {
        return this.mNextStep;
    }

    public int hashCode() {
        return Objects.hash(this.mCurrentStep, this.mCurrentDistance, this.mNextStep, this.mJunctionImage, Boolean.valueOf(this.mIsLoading));
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "RoutingInfo";
    }

    private RoutingInfo() {
        this.mCurrentStep = null;
        this.mCurrentDistance = null;
        this.mNextStep = null;
        this.mJunctionImage = null;
        this.mIsLoading = false;
    }
}
