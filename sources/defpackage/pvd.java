package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pvd extends Exception {
    public pvd() {
        super("Failed inserting account");
    }

    public pvd(Throwable th) {
        super("Error inserting account", th);
    }
}
