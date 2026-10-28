package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lzf extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public lzf() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final lyh a() {
        return new lyh(getMessage());
    }
}
