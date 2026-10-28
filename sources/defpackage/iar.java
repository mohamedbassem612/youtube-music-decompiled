package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iar {
    public final String a;
    public final String b;
    public final boolean c;

    public iar(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public static iar a(String str) {
        jkj jkjVar = new jkj();
        jkjVar.a = "";
        jkjVar.g(str);
        jkjVar.f(false);
        return jkjVar.e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iar) {
            iar iarVar = (iar) obj;
            if (this.a.equals(iarVar.a) && this.b.equals(iarVar.b) && this.c == iarVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "OfflinePlaylistDescriptor{id=" + this.a + ", title=" + this.b + ", isAlbum=" + this.c + '}';
    }

    public iar() {
        throw null;
    }
}
