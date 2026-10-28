package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pzg {
    public final aieg a;
    public final int b;
    public final int c;

    public pzg(aieg aiegVar, int i, int i2) {
        this.a = aiegVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pzg) {
            pzg pzgVar = (pzg) obj;
            if (awrc.c(this.a, pzgVar.a) && this.b == pzgVar.b && this.c == pzgVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "LargeIconData(image=" + this.a + ", widthPx=" + this.b + ", heightPx=" + this.c + ')';
    }
}
