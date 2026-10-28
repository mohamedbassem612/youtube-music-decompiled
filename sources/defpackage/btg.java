package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class btg {
    public final Object a;
    public final int b;
    public final bss c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        int i = bwp.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public btg(Object obj, int i, bss bssVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        ahno.F((i ^ (-1)) >>> 31);
        ahno.F((i2 ^ (-1)) >>> 31);
        this.a = obj;
        this.b = i;
        this.c = bssVar;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            btg btgVar = (btg) obj;
            if (this.b == btgVar.b && this.e == btgVar.e && this.f == btgVar.f && this.g == btgVar.g && this.h == btgVar.h && this.i == btgVar.i && Objects.equals(this.c, btgVar.c) && Objects.equals(this.a, btgVar.a) && Objects.equals(this.d, btgVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int i = this.h;
        if (i == -1) {
            return str;
        }
        return str + ", contentPos=" + this.g + ", adGroup=" + i + ", ad=" + this.i;
    }
}
