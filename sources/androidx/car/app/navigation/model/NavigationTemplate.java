package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.Toggle;
import defpackage.acz;
import defpackage.adx;
import defpackage.ady;
import defpackage.aeb;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class NavigationTemplate implements acz {
    private final ActionStrip mActionStrip;
    private final CarColor mBackgroundColor;
    private final TravelEstimate mDestinationTravelEstimate;
    private final ActionStrip mMapActionStrip;
    private final ady mNavigationInfo;
    private final aeb mPanModeDelegate;
    private final Toggle mPanModeToggle;

    NavigationTemplate(adx adxVar) {
        ady adyVar = adxVar.a;
        this.mNavigationInfo = null;
        CarColor carColor = adxVar.b;
        this.mBackgroundColor = null;
        TravelEstimate travelEstimate = adxVar.c;
        this.mDestinationTravelEstimate = null;
        ActionStrip actionStrip = adxVar.d;
        this.mActionStrip = null;
        ActionStrip actionStrip2 = adxVar.e;
        this.mMapActionStrip = null;
        Toggle toggle = adxVar.f;
        this.mPanModeToggle = null;
        aeb aebVar = adxVar.g;
        this.mPanModeDelegate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NavigationTemplate) {
            NavigationTemplate navigationTemplate = (NavigationTemplate) obj;
            if (Objects.equals(this.mNavigationInfo, navigationTemplate.mNavigationInfo) && Objects.equals(this.mBackgroundColor, navigationTemplate.mBackgroundColor) && Objects.equals(this.mDestinationTravelEstimate, navigationTemplate.mDestinationTravelEstimate) && Objects.equals(this.mActionStrip, navigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, navigationTemplate.mMapActionStrip) && Objects.equals(this.mPanModeToggle, navigationTemplate.mPanModeToggle)) {
                if (Objects.equals(Boolean.valueOf(this.mPanModeDelegate == null), Boolean.valueOf(navigationTemplate.mPanModeDelegate == null))) {
                    return true;
                }
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        ActionStrip actionStrip = this.mActionStrip;
        actionStrip.getClass();
        return actionStrip;
    }

    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public TravelEstimate getDestinationTravelEstimate() {
        return this.mDestinationTravelEstimate;
    }

    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public ady getNavigationInfo() {
        return this.mNavigationInfo;
    }

    public aeb getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @Deprecated
    public Toggle getPanModeToggle() {
        return this.mPanModeToggle;
    }

    public int hashCode() {
        return Objects.hash(this.mNavigationInfo, this.mBackgroundColor, this.mDestinationTravelEstimate, this.mActionStrip, this.mMapActionStrip, this.mPanModeToggle, Boolean.valueOf(this.mPanModeDelegate == null));
    }

    public String toString() {
        return "NavigationTemplate";
    }

    private NavigationTemplate() {
        this.mNavigationInfo = null;
        this.mBackgroundColor = null;
        this.mDestinationTravelEstimate = null;
        this.mActionStrip = null;
        this.mMapActionStrip = null;
        this.mPanModeToggle = null;
        this.mPanModeDelegate = null;
    }
}
