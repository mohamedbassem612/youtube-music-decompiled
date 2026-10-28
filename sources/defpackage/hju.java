package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hju extends hjx {
    private final znf a;

    public hju(znf znfVar) {
        super(a.bV(znfVar, "Parent mediaId ", " is not browsable"));
        this.a = znfVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hju) && awrc.c(this.a, ((hju) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ParentNotBrowsableError(mediaId=" + this.a + ')';
    }
}
