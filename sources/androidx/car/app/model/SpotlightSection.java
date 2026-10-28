package androidx.car.app.model;

import defpackage.acp;
import defpackage.acq;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class SpotlightSection extends Section {
    public static final int INCOMPLETE_LAST_COLUMN_AS_IS = 0;
    public static final int INCOMPLETE_LAST_COLUMN_TRUNCATE = 1;
    private final CarIcon mImage;
    private final int mIncompleteLastColumnStrategy;

    private SpotlightSection(acp acpVar) {
        super(acpVar);
        CarIcon carIcon = acpVar.a;
        this.mImage = null;
        int i = acpVar.b;
        this.mIncompleteLastColumnStrategy = 0;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj != this) {
            if (!(obj instanceof SpotlightSection)) {
                return false;
            }
            SpotlightSection spotlightSection = (SpotlightSection) obj;
            if (!super.equals(spotlightSection) || !Objects.equals(this.mImage, spotlightSection.mImage) || this.mIncompleteLastColumnStrategy != spotlightSection.mIncompleteLastColumnStrategy) {
                return false;
            }
        }
        return true;
    }

    public CarIcon getImage() {
        CarIcon carIcon = this.mImage;
        carIcon.getClass();
        return carIcon;
    }

    public int getIncompleteLastColumnStrategy() {
        return this.mIncompleteLastColumnStrategy;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.mImage, Integer.valueOf(this.mIncompleteLastColumnStrategy));
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "SpotlightSection { image: " + this.mImage + ", , incompleteLastColumn: " + this.mIncompleteLastColumnStrategy + super.toString() + " }";
    }

    private SpotlightSection() {
        this.mImage = null;
        this.mIncompleteLastColumnStrategy = 1;
    }

    /* synthetic */ SpotlightSection(acp acpVar, acq acqVar) {
        this(acpVar);
    }
}
