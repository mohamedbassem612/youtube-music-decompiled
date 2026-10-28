package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pk {
    public static final axr a = new axs(20);
    public int b;
    public cwp c;
    public cwp d;

    private pk() {
    }

    public static pk a() {
        pk pkVar = (pk) a.a();
        return pkVar == null ? new pk() : pkVar;
    }

    public static void b(pk pkVar) {
        pkVar.b = 0;
        pkVar.c = null;
        pkVar.d = null;
        a.b(pkVar);
    }
}
