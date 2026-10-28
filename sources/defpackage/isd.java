package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class isd implements zrg {
    public final byte[] a;
    public final String b;
    public final int c;

    public isd(byte[] bArr, String str, int i) {
        this.a = bArr;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof isd) {
            isd isdVar = (isd) obj;
            if (awrc.c(this.a, isdVar.a) && awrc.c(this.b, isdVar.b) && this.c == isdVar.c) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zrg
    public final int hashCode() {
        return (((Arrays.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "VoiceSearchRoute(searchBoxStats=" + Arrays.toString(this.a) + ", parentCsn=" + this.b + ", parentVeType=" + this.c + ')';
    }
}
