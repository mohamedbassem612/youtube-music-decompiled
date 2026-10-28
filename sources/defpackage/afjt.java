package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afjt {
    public static final afjt a;
    public static final afjt b;
    public static final afjt c;
    private static final /* synthetic */ afjt[] d;

    static {
        afjt afjtVar = new afjt("STOPPED", 0);
        a = afjtVar;
        afjt afjtVar2 = new afjt("STARTING", 1);
        b = afjtVar2;
        afjt afjtVar3 = new afjt("STARTED", 2);
        c = afjtVar3;
        d = new afjt[]{afjtVar, afjtVar2, afjtVar3};
    }

    public static afjt[] values() {
        return (afjt[]) d.clone();
    }
}
