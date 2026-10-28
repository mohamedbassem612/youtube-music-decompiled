package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class umw {
    private final umv a;
    private final String b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    public /* synthetic */ umw(String str, boolean z, int i) {
        this((i & 1) != 0 ? umv.b : null, (i & 2) != 0 ? null : str, ((i & 8) == 0) & z, false);
    }

    public static /* synthetic */ umw a(umw umwVar, boolean z) {
        umv umvVar = umwVar.a;
        String str = umwVar.b;
        int i = umwVar.c;
        boolean z2 = umwVar.d;
        boolean z3 = umwVar.e;
        boolean z4 = umwVar.f;
        return new umw(umvVar, str, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof umw) {
            umw umwVar = (umw) obj;
            if (this.a == umwVar.a && awrc.c(this.b, umwVar.b)) {
                int i = umwVar.c;
                if (this.d == umwVar.d) {
                    boolean z = umwVar.e;
                    boolean z2 = umwVar.f;
                    if (this.g == umwVar.g) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 961) + a.aj(this.d)) * 31) + a.aj(false)) * 31) + a.aj(false)) * 31) + a.aj(this.g);
    }

    public final String toString() {
        return "ViewModel(scrimState=" + this.a + ", activeTaskId=" + this.b + ", progress=0, isLoading=" + this.d + ", isDeterminate=false, isCancellable=false, isEngagementPanelVisible=" + this.g + ')';
    }

    public umw(umv umvVar, String str, boolean z, boolean z2) {
        umvVar.getClass();
        this.a = umvVar;
        this.b = str;
        this.c = 0;
        this.d = z;
        this.e = false;
        this.f = false;
        this.g = z2;
    }

    public umw() {
        this(null, false, 127);
    }
}
