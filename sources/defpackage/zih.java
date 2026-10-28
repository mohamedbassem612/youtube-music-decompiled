package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zih {
    public final int a;
    public final int b;
    public final long c;
    public final boolean d;
    public final String e;

    public zih(int i, int i2, long j, boolean z, String str) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zih) {
            zih zihVar = (zih) obj;
            if (zihVar.a == this.a && zihVar.b == this.b && zihVar.c == this.c && Objects.equals(zihVar.e, this.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return "RawBandwidthSample(" + this.a + ", " + this.b + ", " + this.c + ", cpn=" + this.e + ')';
    }
}
