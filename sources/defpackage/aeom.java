package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeom {
    public final String a;
    public final String b;
    public final String c;

    public aeom(String str) {
        this.a = "search_namespace";
        this.b = str;
        this.c = "voice_language";
    }

    public static aeom a(String str) {
        ahno.K(!"AppGlobalScope".equals(str), "userId cannot be %s. Use createAppGlobalKey to generate an app scoped key.", "AppGlobalScope");
        ahno.K(!"SignedOutID".equals(str), "userId cannot be %s. Use createSignedOutUserKey to generate a key for signed out user.", "SignedOutID");
        return b(str);
    }

    public static aeom b(String str) {
        aeom aeomVar = new aeom(str);
        ahno.G(!aeomVar.b.isEmpty(), "userId cannot be empty");
        aeomVar.c.isEmpty();
        aeomVar.a.isEmpty();
        return aeomVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeom) {
            aeom aeomVar = (aeom) obj;
            if (this.a.equals(aeomVar.a) && this.b.equals(aeomVar.b) && this.c.equals(aeomVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "BlobStorageKey{namespace=" + this.a + ", userId=" + this.b + ", key=" + this.c + '}';
    }

    public aeom() {
        throw null;
    }
}
