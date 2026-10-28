package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class waf {
    public final asbr a;
    public final String b;
    private final vzz c;

    public waf(asbr asbrVar, String str, vzz vzzVar) {
        if (asbrVar == null) {
            throw new NullPointerException("Null containerManifest");
        }
        this.a = asbrVar;
        if (str == null) {
            throw new NullPointerException("Null resourceId");
        }
        this.b = str;
        if (vzzVar == null) {
            throw new NullPointerException("Null fileGroup");
        }
        this.c = vzzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof waf) {
            waf wafVar = (waf) obj;
            if (this.a.equals(wafVar.a) && this.b.equals(wafVar.b) && this.c.equals(wafVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        vzz vzzVar = this.c;
        return "ContainerVersionInfo{containerManifest=" + this.a.toString() + ", resourceId=" + this.b + ", fileGroup=" + vzzVar.toString() + '}';
    }

    public waf() {
        throw null;
    }
}
