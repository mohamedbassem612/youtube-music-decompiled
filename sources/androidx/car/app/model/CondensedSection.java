package androidx.car.app.model;

import defpackage.aar;
import defpackage.aas;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class CondensedSection extends Section {
    public static final int INCOMPLETE_LAST_ROW_AS_IS = 0;
    public static final int INCOMPLETE_LAST_ROW_TRUNCATE = 1;
    private final int mIncompleteLastRowStrategy;

    private CondensedSection(aar aarVar) {
        super(aarVar);
        int i = aarVar.a;
        this.mIncompleteLastRowStrategy = 0;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CondensedSection) {
            CondensedSection condensedSection = (CondensedSection) obj;
            if (super.equals(obj) && this.mIncompleteLastRowStrategy == condensedSection.mIncompleteLastRowStrategy) {
                return true;
            }
        }
        return false;
    }

    public int getIncompleteLastRowStrategy() {
        return this.mIncompleteLastRowStrategy;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.mIncompleteLastRowStrategy));
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "CondensedSection { incompleteLastRowStrategy: " + this.mIncompleteLastRowStrategy + ", " + super.toString() + " }";
    }

    private CondensedSection() {
        this.mIncompleteLastRowStrategy = 0;
    }

    /* synthetic */ CondensedSection(aar aarVar, aas aasVar) {
        this(aarVar);
    }
}
