package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zfe {
    public final String a;
    public final int b;

    public zfe(String str, int i) {
        if (i == 0) {
            throw null;
        }
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zfe) {
            zfe zfeVar = (zfe) obj;
            if (awrc.c(this.a, zfeVar.a) && this.b == zfeVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentBindingSpec(videoId=");
        sb.append(this.a);
        sb.append(", bindingMode=");
        sb.append((Object) (this.b != 1 ? "VIDEOID" : "UNKNOWN"));
        sb.append(')');
        return sb.toString();
    }
}
