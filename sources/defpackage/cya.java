package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cya extends cyh {
    public final byte[] a;

    public cya(String str, byte[] bArr) {
        super(str);
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cya cyaVar = (cya) obj;
            if (this.f.equals(cyaVar.f) && Arrays.equals(this.a, cyaVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + Arrays.hashCode(this.a);
    }
}
