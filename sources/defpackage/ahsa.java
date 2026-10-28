package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahsa {
    public final String a;
    private final long b;
    private final long c;

    public ahsa(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahsa) {
            ahsa ahsaVar = (ahsa) obj;
            if (this.a.equals(ahsaVar.a) && this.b == ahsaVar.b && this.c == ahsaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.c;
        long j2 = (j >>> 32) ^ j;
        long j3 = this.b;
        return (((iHashCode * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) j2);
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + '}';
    }

    public ahsa() {
        throw null;
    }
}
