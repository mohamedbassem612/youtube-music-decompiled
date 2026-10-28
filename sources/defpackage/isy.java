package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class isy {
    public final String a;
    public final long b;
    public final String c;
    public final String d;

    public isy(String str, long j, String str2, String str3) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof isy) {
            isy isyVar = (isy) obj;
            if (this.a.equals(isyVar.a) && this.b == isyVar.b && this.c.equals(isyVar.c) && this.d.equals(isyVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "PlaylistFileTrackMetadata{title=" + this.a + ", durationSec=" + this.b + ", artist=" + this.c + ", absoluteFilePath=" + this.d + '}';
    }

    public isy() {
        throw null;
    }
}
