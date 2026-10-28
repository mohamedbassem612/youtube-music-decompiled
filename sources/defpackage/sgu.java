package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sgu {
    public final String a;

    public sgu(String str) {
        if (str == null) {
            throw new NullPointerException("Null adVideoCpn");
        }
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sgu) {
            return this.a.equals(((sgu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AdVideoPlaybackContextModel{adVideoCpn=" + this.a + '}';
    }

    public sgu() {
        throw null;
    }
}
