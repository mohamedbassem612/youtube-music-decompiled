package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.aad;
import defpackage.adf;
import defpackage.yf;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Step {
    private final CarText mCue;
    private final List mLanes;
    private final CarIcon mLanesImage;
    private final Maneuver mManeuver;
    private final CarText mRoad;

    Step(Maneuver maneuver, List list, CarIcon carIcon, CarText carText, CarText carText2) {
        this.mManeuver = maneuver;
        this.mLanes = aad.b(list);
        adf.b.a(carIcon);
        this.mLanesImage = carIcon;
        this.mCue = carText;
        this.mRoad = carText2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Step) {
            Step step = (Step) obj;
            if (Objects.equals(this.mManeuver, step.mManeuver) && Objects.equals(this.mLanes, step.mLanes) && Objects.equals(this.mLanesImage, step.mLanesImage) && Objects.equals(this.mCue, step.mCue) && Objects.equals(this.mRoad, step.mRoad)) {
                return true;
            }
        }
        return false;
    }

    public CarText getCue() {
        return this.mCue;
    }

    public List getLanes() {
        return aad.a(this.mLanes);
    }

    public CarIcon getLanesImage() {
        return this.mLanesImage;
    }

    public Maneuver getManeuver() {
        return this.mManeuver;
    }

    public CarText getRoad() {
        return this.mRoad;
    }

    public int hashCode() {
        return Objects.hash(this.mManeuver, this.mLanes, this.mLanesImage, this.mCue, this.mRoad);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[maneuver: ");
        sb.append(this.mManeuver);
        sb.append(", lane count: ");
        List list = this.mLanes;
        sb.append(list != null ? list.size() : 0);
        sb.append(", lanes image: ");
        sb.append(this.mLanesImage);
        sb.append(", cue: ");
        sb.append(CarText.toShortString(this.mCue));
        sb.append(", road: ");
        sb.append(CarText.toShortString(this.mRoad));
        sb.append(']');
        return sb.toString();
    }

    private Step() {
        this.mManeuver = null;
        this.mLanes = Collections.EMPTY_LIST;
        this.mLanesImage = null;
        this.mCue = null;
        this.mRoad = null;
    }
}
