package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pud extends Exception {
    public pud() {
        super("Failed to access GNP API");
    }

    public pud(Throwable th) {
        super("Failed to parse the response returned from GNP API", th);
    }
}
