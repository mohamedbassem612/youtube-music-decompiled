package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ujw extends nuo {
    public final String a;

    public ujw(String str) {
        super(null);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ujw) && awrc.c(this.a, ((ujw) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Remote(uri=" + this.a + ')';
    }
}
