package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hjp extends hjx {
    private final znf a;

    public hjp(znf znfVar) {
        super("Children expired in cache for mediaId: '" + znfVar.l + '\'');
        this.a = znfVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hjp) && awrc.c(this.a, ((hjp) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ChildrenCacheExpiredError(mediaId=" + this.a + ')';
    }
}
