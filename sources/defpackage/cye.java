package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cye extends cyh {
    public final String a;
    public final String b;
    public final String c;
    public final byte[] d;

    public cye(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cye cyeVar = (cye) obj;
            if (Objects.equals(this.a, cyeVar.a) && Objects.equals(this.b, cyeVar.b) && Objects.equals(this.c, cyeVar.c) && Arrays.equals(this.d, cyeVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((((((str != null ? str.hashCode() : 0) + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Arrays.hashCode(this.d);
    }

    @Override // defpackage.cyh
    public final String toString() {
        return this.f + ": mimeType=" + this.a + ", filename=" + this.b + ", description=" + this.c;
    }
}
