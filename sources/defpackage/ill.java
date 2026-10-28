package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ill {
    public final String a;
    public final String b;
    public final String c;

    public ill(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ill) {
            ill illVar = (ill) obj;
            if (awrc.c(this.a, illVar.a) && awrc.c(this.b, illVar.b) && awrc.c(this.c, illVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "VideoIdentifier(videoId=" + this.a + ", setVideoId=" + this.b + ", originalVideoId=" + this.c + ')';
    }
}
