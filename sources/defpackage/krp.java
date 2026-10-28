package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class krp extends Exception {
    public final klo a;

    public krp(klo kloVar) {
        kro.d(kloVar.c(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.a = kloVar;
    }
}
