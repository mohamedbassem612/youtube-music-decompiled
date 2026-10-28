package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaup {
    public final String a;
    private final String b;
    private final aofb c;
    private final byte[] d;
    private final byte[] e;

    public aaup(String str, String str2, aofb aofbVar, byte[] bArr) {
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null videoId");
        }
        this.a = str2;
        if (aofbVar == null) {
            throw new NullPointerException("Null offlineModeType");
        }
        this.c = aofbVar;
        this.d = bArr;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaup) {
            aaup aaupVar = (aaup) obj;
            if (this.b.equals(aaupVar.b) && this.a.equals(aaupVar.a) && this.c.equals(aaupVar.c)) {
                boolean z = aaupVar instanceof aaup;
                if (Arrays.equals(this.d, z ? aaupVar.d : aaupVar.d)) {
                    if (!z) {
                        return true;
                    }
                    byte[] bArr = aaupVar.e;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003) ^ Arrays.hashCode((byte[]) null);
    }

    public final String toString() {
        byte[] bArr = this.d;
        return "OfflinePlayerRequestParams{identityId=" + this.b + ", videoId=" + this.a + ", offlineModeType=" + this.c.toString() + ", trackingParams=" + Arrays.toString(bArr) + ", offlineSharingWrappedKey=" + Arrays.toString((byte[]) null) + '}';
    }

    public aaup() {
        throw null;
    }
}
