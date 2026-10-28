package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axrk extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public axrk() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final axqm a() {
        return new axqm(getMessage());
    }
}
