package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vdx {
    private final String a;
    private final String b;

    public vdx(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vdx) {
            vdx vdxVar = (vdx) obj;
            if (awrc.c(this.a, vdxVar.a) && awrc.c(this.b, vdxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PlayerCacheKey(videoId=" + this.a + ", playerParams=" + this.b + ')';
    }
}
