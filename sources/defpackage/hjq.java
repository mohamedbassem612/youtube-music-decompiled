package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hjq extends hjx {
    private final znf a;

    public hjq(znf znfVar) {
        super("Children not in cache for mediaId: '" + znfVar.l + '\'');
        this.a = znfVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hjq) && awrc.c(this.a, ((hjq) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ChildrenNotCachedError(mediaId=" + this.a + ')';
    }
}
