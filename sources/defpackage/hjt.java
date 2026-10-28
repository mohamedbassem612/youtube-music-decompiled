package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hjt extends hjx {
    private final znf a;

    public hjt(znf znfVar) {
        super("Parent media item not in cache for mediaId '" + znfVar.l + '\'');
        this.a = znfVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hjt) && awrc.c(this.a, ((hjt) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ParentMediaItemNotCachedError(mediaId=" + this.a + ')';
    }
}
