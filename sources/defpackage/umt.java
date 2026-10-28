package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class umt {
    public final boolean a;
    public final boolean b;

    public umt(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof umt) {
            umt umtVar = (umt) obj;
            if (this.a == umtVar.a && this.b == umtVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "FiltersViewControllerConfig{initFiltersForEditorV2=" + this.a + ", getAssetBasedFilterPickerEnabled=" + this.b + '}';
    }

    public umt() {
        throw null;
    }
}
