package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjx extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public bjx() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final bja a() {
        return new bja(getMessage());
    }
}
