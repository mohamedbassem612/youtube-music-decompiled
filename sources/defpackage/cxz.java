package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cxz extends cyh {
    public final String a;
    public final String b;
    public final int c;
    public final byte[] d;

    public cxz(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = bArr;
    }

    @Override // defpackage.cyh, defpackage.bsw
    public final void b(bsu bsuVar) {
        bsuVar.a(this.d, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cxz cxzVar = (cxz) obj;
            if (this.c == cxzVar.c && Objects.equals(this.a, cxzVar.a) && Objects.equals(this.b, cxzVar.b) && Arrays.equals(this.d, cxzVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.c;
        String str2 = this.b;
        return ((((((i + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.d);
    }

    @Override // defpackage.cyh
    public final String toString() {
        return this.f + ": mimeType=" + this.a + ", description=" + this.b;
    }
}
