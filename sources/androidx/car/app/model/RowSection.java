package androidx.car.app.model;

import defpackage.acd;
import defpackage.ace;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class RowSection extends Section {
    private final int mInitialSelectedIndex;

    private RowSection(acd acdVar) {
        super(acdVar);
        int i = acdVar.a;
        this.mInitialSelectedIndex = 0;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj != this) {
            if (!(obj instanceof RowSection)) {
                return false;
            }
            RowSection rowSection = (RowSection) obj;
            if (!super.equals(rowSection) || this.mInitialSelectedIndex != rowSection.mInitialSelectedIndex) {
                return false;
            }
        }
        return true;
    }

    public int getInitialSelectedIndex() {
        return this.mInitialSelectedIndex;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.mInitialSelectedIndex));
    }

    public boolean isSelectionGroup() {
        return this.mInitialSelectedIndex >= 0;
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "RowSection { initialSelectedIndex: " + this.mInitialSelectedIndex + ", " + super.toString() + " }";
    }

    private RowSection() {
        this.mInitialSelectedIndex = -1;
    }

    /* synthetic */ RowSection(acd acdVar, ace aceVar) {
        this(acdVar);
    }
}
