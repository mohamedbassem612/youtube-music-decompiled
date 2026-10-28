package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cyl extends cyh {
    public final String a;
    public final byte[] b;

    public cyl(String str, byte[] bArr) {
        super("PRIV");
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cyl cylVar = (cyl) obj;
            if (Objects.equals(this.a, cylVar.a) && Arrays.equals(this.b, cylVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + Arrays.hashCode(this.b);
    }

    @Override // defpackage.cyh
    public final String toString() {
        return this.f + ": owner=" + this.a;
    }
}
