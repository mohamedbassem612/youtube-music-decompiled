package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class moo {
    public static final moo a = new moo();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof moo)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1774303173;
    }

    public final String toString() {
        return "FlowLayoutManagerConfig{sectionApiEnabled=false, sectionApiImprovementsEnabled=false, sectionRowFixEnabled=false, reserveSpaceFor0x0ItemsEnabled=false, ignorePaddingForSingleFullSpanItem=false, interSectionSpacingEnabled=false}";
    }
}
