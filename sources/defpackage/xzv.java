package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xzv {
    public final String a;
    public final Optional b;

    public xzv(String str, Optional optional) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.a = str;
        this.b = optional;
    }

    public static xzv a(String str, String str2) {
        return ahno.aa(str2) ? new xzv(str, Optional.empty()) : new xzv(str, Optional.of(str2));
    }

    public final boolean b() {
        return this.b.isPresent();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xzv) {
            xzv xzvVar = (xzv) obj;
            if (this.a.equals(xzvVar.a) && this.b.equals(xzvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "VideoEntry{videoId=" + this.a + ", sourceContainerPlaylistId=" + this.b.toString() + '}';
    }

    public xzv() {
        throw null;
    }
}
