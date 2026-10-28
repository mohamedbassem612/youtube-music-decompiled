package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hjw extends hjx {
    private final amzq a;

    /* JADX WARN: Illegal instructions before constructor call */
    public hjw(amzq amzqVar) {
        amzp amzpVarA = amzp.a(amzqVar.c);
        amzpVarA = amzpVarA == null ? amzp.MEDIA_BROWSER_ERROR_CODE_UNKNOWN : amzpVarA;
        super("code: " + amzpVarA + ": " + amzqVar.b);
        this.a = amzqVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hjw) && awrc.c(this.a, ((hjw) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ServerError(error=" + this.a + ')';
    }
}
