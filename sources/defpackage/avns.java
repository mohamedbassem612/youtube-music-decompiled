package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avns implements avoo {
    public static final avns a;
    public static final avns b;
    private static final /* synthetic */ avns[] c;

    static {
        avns avnsVar = new avns("INSTANCE", 0);
        a = avnsVar;
        avns avnsVar2 = new avns("NEVER", 1);
        b = avnsVar2;
        c = new avns[]{avnsVar, avnsVar2};
    }

    public static void d(avlw avlwVar) {
        avlwVar.d(a);
        avlwVar.kn();
    }

    public static void e(Throwable th, avlc avlcVar) {
        avlcVar.d(a);
        avlcVar.b(th);
    }

    public static void g(Throwable th, avlw avlwVar) {
        avlwVar.d(a);
        avlwVar.b(th);
    }

    public static void h(Throwable th, avmd avmdVar) {
        avmdVar.d(a);
        avmdVar.b(th);
    }

    public static avns[] values() {
        return (avns[]) c.clone();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this == a;
    }

    @Override // defpackage.avot
    public final boolean i() {
        return true;
    }

    @Override // defpackage.avot
    public final boolean j(Object obj) {
        return a.aD();
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        return i & 2;
    }

    @Override // defpackage.avot
    public final Object km() {
        return null;
    }

    @Override // defpackage.avot
    public final void c() {
    }

    @Override // defpackage.avmn
    public final void dispose() {
    }
}
