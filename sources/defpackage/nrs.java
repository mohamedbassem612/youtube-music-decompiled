package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nrs extends nud {
    public final int a;

    public nrs(int i, Throwable th) {
        super("Command execution failed for extension ID: " + i + (th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : ""), th);
        this.a = i;
    }
}
