package androidx.car.app.model;

import defpackage.aab;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class BannerSection extends Section {
    BannerSection() {
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof BannerSection) {
            return super.equals((BannerSection) obj);
        }
        return false;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()));
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "BannerSection { " + super.toString() + " }";
    }

    BannerSection(aab aabVar) {
        super(aabVar);
    }
}
