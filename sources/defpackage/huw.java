package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class huw {
    public final agke a;
    public final int b;
    private final String c;
    private final boolean d;

    public huw(agke agkeVar, int i, String str, boolean z) {
        this.a = agkeVar;
        this.b = i;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof huw) {
            huw huwVar = (huw) obj;
            if (aguu.v(this.a, huwVar.a) && this.b == huwVar.b && this.c.equals(huwVar.c) && this.d == huwVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "PlaylistSyncRequest{playlistConfigs=" + String.valueOf(this.a) + ", actionTriggerParam=" + this.b + ", initiator=" + this.c + ", forceSync=" + this.d + '}';
    }

    public huw() {
        throw null;
    }
}
