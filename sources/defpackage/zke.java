package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zke {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public zke(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zke)) {
            return false;
        }
        zke zkeVar = (zke) obj;
        return this.a == zkeVar.a && this.b == zkeVar.b && this.c == zkeVar.c && this.d == zkeVar.d;
    }

    public final int hashCode() {
        return (((((((this.a * 101) + 5363) * 31) + (this.b * 103)) * 31) + (this.c * 107)) * 31) + (this.d * 109);
    }

    public final String toString() {
        return "minh." + this.a + ";maxh." + this.b + ";minw." + this.c + ";maxw." + this.d;
    }
}
