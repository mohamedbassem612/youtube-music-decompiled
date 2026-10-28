package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahue {
    public final String a;
    public final String b;

    public ahue(String str, String str2) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahue) {
            ahue ahueVar = (ahue) obj;
            if (this.a.equals(ahueVar.a) && this.b.equals(ahueVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + '}';
    }

    public ahue() {
        throw null;
    }
}
