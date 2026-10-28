package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agxz {
    public final String a;

    public agxz(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof agxz) {
            return this.a.equals(((agxz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1809505057;
    }

    public final String toString() {
        return "TrustedResourceUrl{" + this.a + '}';
    }
}
