package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qwe {
    public static final qwe a;
    public static final qwe b;
    public static final qwe c;
    private static final /* synthetic */ qwe[] d;

    static {
        qwe qweVar = new qwe("MITER", 0);
        a = qweVar;
        qwe qweVar2 = new qwe("ROUND", 1);
        b = qweVar2;
        qwe qweVar3 = new qwe("BEVEL", 2);
        c = qweVar3;
        d = new qwe[]{qweVar, qweVar2, qweVar3};
    }

    public static qwe[] values() {
        return (qwe[]) d.clone();
    }
}
