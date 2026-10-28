package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cxx implements bsw {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public cxx(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        ahno.F(z2);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ bse a() {
        return null;
    }

    @Override // defpackage.bsw
    public final void b(bsu bsuVar) {
        String str = this.c;
        if (str != null) {
            bsuVar.y = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            bsuVar.x = str2;
        }
    }

    @Override // defpackage.bsw
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cxx cxxVar = (cxx) obj;
            if (this.a == cxxVar.a && Objects.equals(this.b, cxxVar.b) && Objects.equals(this.c, cxxVar.c) && Objects.equals(this.d, cxxVar.d) && this.e == cxxVar.e && this.f == cxxVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.a;
        String str2 = this.c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = ((i + 527) * 31) + iHashCode;
        String str3 = this.d;
        return (((((((i2 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f;
    }
}
