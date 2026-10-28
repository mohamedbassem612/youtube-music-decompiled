package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import defpackage.ads;
import defpackage.aeb;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class MapController {
    private final ActionStrip mMapActionStrip;
    private final aeb mPanModeDelegate;

    MapController(ads adsVar) {
        aeb aebVar = adsVar.a;
        this.mPanModeDelegate = null;
        ActionStrip actionStrip = adsVar.b;
        this.mMapActionStrip = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MapController) {
            MapController mapController = (MapController) obj;
            if (Objects.equals(Boolean.valueOf(this.mPanModeDelegate == null), Boolean.valueOf(mapController.mPanModeDelegate == null)) && Objects.equals(this.mMapActionStrip, mapController.mMapActionStrip)) {
                return true;
            }
        }
        return false;
    }

    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public aeb getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    public int hashCode() {
        return Objects.hash(this.mPanModeDelegate, this.mMapActionStrip);
    }

    private MapController() {
        this.mPanModeDelegate = null;
        this.mMapActionStrip = null;
    }
}
