package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evf extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public evf(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
