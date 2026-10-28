package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ujv extends nuo {
    public final String a;

    public ujv(String str) {
        super(null);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ujv) && awrc.c(this.a, ((ujv) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Local(path=" + this.a + ')';
    }
}
