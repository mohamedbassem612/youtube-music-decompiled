package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fln {
    public static final fln a;
    public static final fln b;
    private static final /* synthetic */ fln[] c;

    static {
        fln flnVar = new fln("GLOBAL", 0);
        a = flnVar;
        fln flnVar2 = new fln("LOCAL", 1);
        b = flnVar2;
        c = new fln[]{flnVar, flnVar2};
    }

    public static fln[] values() {
        return (fln[]) c.clone();
    }
}
