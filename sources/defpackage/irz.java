package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class irz implements zrg {
    private final boolean a = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irz)) {
            return false;
        }
        boolean z = ((irz) obj).a;
        return true;
    }

    @Override // defpackage.zrg
    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "SideloadedPlaylistRoute(unused=false)";
    }
}
