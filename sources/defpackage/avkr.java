package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avkr {
    public static final avkr a;
    public static final avkr b;
    public static final avkr c;
    private static final /* synthetic */ avkr[] d;

    static {
        avkr avkrVar = new avkr("BLOCKING", 0);
        a = avkrVar;
        avkr avkrVar2 = new avkr("FUTURE", 1);
        b = avkrVar2;
        avkr avkrVar3 = new avkr("ASYNC", 2);
        c = avkrVar3;
        d = new avkr[]{avkrVar, avkrVar2, avkrVar3};
    }

    public static avkr[] values() {
        return (avkr[]) d.clone();
    }
}
