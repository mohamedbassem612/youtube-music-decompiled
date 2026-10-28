package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class knm extends UnsupportedOperationException {
    private final klq a;

    public knm(klq klqVar) {
        this.a = klqVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.a)));
    }
}
