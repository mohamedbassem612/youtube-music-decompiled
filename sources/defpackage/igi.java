package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igi {
    public static final igi a;
    public static final igi b;
    public static final igi c;
    private static final /* synthetic */ igi[] d;

    static {
        igi igiVar = new igi("INACTIVE", 0);
        a = igiVar;
        igi igiVar2 = new igi("ACTIVE_TIMER", 1);
        b = igiVar2;
        igi igiVar3 = new igi("ACTIVE_END_OF_TRACK", 2);
        c = igiVar3;
        d = new igi[]{igiVar, igiVar2, igiVar3};
    }

    public static igi[] values() {
        return (igi[]) d.clone();
    }
}
