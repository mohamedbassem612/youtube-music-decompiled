package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class irr implements zrg {
    private final boolean a = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irr)) {
            return false;
        }
        boolean z = ((irr) obj).a;
        return true;
    }

    @Override // defpackage.zrg
    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "OnboardingBrowseRoute(unused=false)";
    }
}
