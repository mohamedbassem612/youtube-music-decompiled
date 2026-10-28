package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import defpackage.acz;
import defpackage.adu;
import defpackage.adv;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class MapWithContentTemplate implements acz {
    private final ActionStrip mActionStrip;
    private final acz mContentTemplate;
    private final MapController mMapController;

    MapWithContentTemplate(adv advVar) {
        MapController mapController = advVar.a;
        this.mMapController = null;
        acz aczVar = advVar.b;
        this.mContentTemplate = null;
        ActionStrip actionStrip = advVar.c;
        this.mActionStrip = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MapWithContentTemplate) {
            MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
            if (Objects.equals(this.mContentTemplate, mapWithContentTemplate.mContentTemplate) && Objects.equals(this.mMapController, mapWithContentTemplate.mMapController) && Objects.equals(this.mActionStrip, mapWithContentTemplate.mActionStrip)) {
                return true;
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public acz getContentTemplate() {
        return this.mContentTemplate;
    }

    public MapController getMapController() {
        return this.mMapController;
    }

    public int hashCode() {
        return Objects.hash(this.mMapController, this.mContentTemplate, this.mActionStrip);
    }

    private MapWithContentTemplate() {
        this.mMapController = null;
        this.mContentTemplate = new adu();
        this.mActionStrip = null;
    }
}
