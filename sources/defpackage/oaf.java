package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oaf implements ett {
    private final oab b;
    private final int c;
    private final int d;

    public oaf(oab oabVar, int i, int i2) {
        this.b = oabVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        throw null;
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        if (!(obj instanceof oaf)) {
            return false;
        }
        oab oabVar = ((oaf) obj).b;
        throw null;
    }

    @Override // defpackage.ett
    public final int hashCode() {
        char[] cArr = ffs.a;
        return ffs.c(this.b, ((this.d + 527) * 31) + this.c);
    }

    public final String toString() {
        return "FifeUrlKey{fifeModel='" + String.valueOf(this.b) + "', width='" + this.c + "', height='" + this.d + "'}";
    }
}
