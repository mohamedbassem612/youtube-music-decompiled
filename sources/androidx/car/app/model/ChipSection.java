package androidx.car.app.model;

import defpackage.aal;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class ChipSection extends Section {
    private final ChipStyle mStyle;

    ChipSection(aal aalVar) {
        super(aalVar);
        ChipStyle chipStyle = aalVar.a;
        this.mStyle = null;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChipSection) {
            ChipSection chipSection = (ChipSection) obj;
            if (super.equals(chipSection) && Objects.equals(this.mStyle, chipSection.mStyle)) {
                return true;
            }
        }
        return false;
    }

    public ChipStyle getStyle() {
        return this.mStyle;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.mStyle);
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "ChipSection{items=" + getItemsDelegate() + ", title=" + getTitle() + ", style=" + this.mStyle + '}';
    }

    private ChipSection() {
        this.mStyle = null;
    }
}
