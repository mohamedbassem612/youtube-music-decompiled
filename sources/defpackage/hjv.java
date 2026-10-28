package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hjv extends hjx {
    private final znf a;

    public hjv(znf znfVar) {
        super("Parent mediaId not found: '" + znfVar.l + '\'');
        this.a = znfVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hjv) && awrc.c(this.a, ((hjv) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ParentNotFoundError(mediaId=" + this.a + ')';
    }
}
