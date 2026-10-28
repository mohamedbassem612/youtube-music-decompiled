package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xlg {
    public final String a;
    public final String b;
    public final int c;
    public final xyv d;
    public final int e;

    public xlg(String str, int i, String str2, int i2, xyv xyvVar) {
        this.a = str;
        this.e = i;
        this.b = str2;
        this.c = i2;
        this.d = xyvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xlg) {
            xlg xlgVar = (xlg) obj;
            if (this.a.equals(xlgVar.a)) {
                int i = this.e;
                int i2 = xlgVar.e;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(xlgVar.b) && this.c == xlgVar.c && this.d.equals(xlgVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ a.bm(this.e)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.e;
        return "MdxBackgroundPlaybackRequest{routeId=" + this.a + ", sessionType=" + (i != 0 ? Integer.toString(i - 1) : "null") + ", deviceName=" + this.b + ", timeoutSeconds=" + this.c + ", playbackDescriptor=" + String.valueOf(this.d) + '}';
    }

    public xlg() {
        throw null;
    }
}
