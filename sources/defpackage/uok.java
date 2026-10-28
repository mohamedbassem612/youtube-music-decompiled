package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uok {
    public final String a;
    private final String b;

    public uok(String str, String str2) {
        this.b = str;
        this.a = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uok) {
            uok uokVar = (uok) obj;
            if (awrc.c(this.b, uokVar.b) && awrc.c(this.a, uokVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "UploadedImage(encryptedBlobId=" + this.b + ", postId=" + this.a + ')';
    }
}
