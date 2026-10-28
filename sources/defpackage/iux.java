package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iux {
    public final long a;
    public final String b;
    public final agke c;

    public iux(long j, String str, agke agkeVar) {
        this.a = j;
        this.b = str;
        this.c = agkeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iux) {
            iux iuxVar = (iux) obj;
            if (this.a == iuxVar.a && this.b.equals(iuxVar.b) && aguu.v(this.c, iuxVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "SideloadedPlaylist{id=" + this.a + ", title=" + this.b + ", tracks=" + String.valueOf(this.c) + '}';
    }

    public iux() {
        throw null;
    }
}
