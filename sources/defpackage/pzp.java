package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pzp {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final boolean g;
    public final boolean h;

    public pzp(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, boolean z) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = bool4;
        this.e = bool5;
        this.f = bool6;
        this.g = z;
        boolean z2 = false;
        if ((bool == null || bool.booleanValue()) && ((bool2 == null || bool2.booleanValue()) && ((bool3 == null || bool3.booleanValue()) && ((bool4 == null || bool4.booleanValue()) && ((bool5 == null || bool5.booleanValue()) && (bool6 == null || bool6.booleanValue())))))) {
            z2 = true;
        }
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pzp) {
            pzp pzpVar = (pzp) obj;
            if (awrc.c(this.a, pzpVar.a) && awrc.c(this.b, pzpVar.b) && awrc.c(this.c, pzpVar.c) && awrc.c(this.d, pzpVar.d) && awrc.c(this.e, pzpVar.e) && awrc.c(this.f, pzpVar.f) && this.g == pzpVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.b;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        int i = iHashCode * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.e;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f;
        return ((iHashCode5 + (bool6 != null ? bool6.hashCode() : 0)) * 31) + a.aj(this.g);
    }

    public final String toString() {
        return "ImageLoadingOutcome(collapsedViewIconLoadingOutcome=" + this.a + ", expandedViewImageLoadingOutcome=" + this.b + ", expandedViewIconLoadingOutcome=" + this.c + ", messagingStyleAvatarLoadingOutcome=" + this.d + ", messagingStyleImagesLoadingOutcome=" + this.e + ", shortcutIconLoadingOutcome=" + this.f + ", loadingTimedOut=" + this.g + ')';
    }
}
