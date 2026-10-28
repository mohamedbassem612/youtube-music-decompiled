package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahh extends IllegalStateException {
    private final String a = "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (Unexpected call to default provider). Please report to Google or use https://goo.gle/compose-feedback";

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
