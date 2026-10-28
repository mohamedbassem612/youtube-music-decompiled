package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class absh {
    public static final absh a = new absh(1, null);
    private static final absh d = new absh(3, null);
    public final aboe b;
    public final int c;

    private absh(int i, aboe aboeVar) {
        this.c = i;
        this.b = aboeVar;
    }

    public static void a(sxu sxuVar, aboe aboeVar) {
        sxuVar.b(null, new absh(2, aboeVar));
    }

    public static void b(sxu sxuVar) {
        sxuVar.b(null, d);
    }
}
