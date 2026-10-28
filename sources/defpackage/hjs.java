package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hjs extends hjx {
    private final znf a;

    public hjs(znf znfVar) {
        super("Failed to create media item for mediaId '" + znfVar.l + '\'');
        this.a = znfVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hjs) && awrc.c(this.a, ((hjs) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "MediaItemCreationError(mediaId=" + this.a + ')';
    }
}
