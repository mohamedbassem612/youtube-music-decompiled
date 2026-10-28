package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qzg {
    public static final qzg a;
    public static final qzg b;
    public static final qzg c;
    public static final qzg d;
    private static final /* synthetic */ qzg[] e;

    static {
        qzg qzgVar = new qzg("UNSET", 0);
        a = qzgVar;
        qzg qzgVar2 = new qzg("SET", 1);
        b = qzgVar2;
        qzg qzgVar3 = new qzg("UPDATE", 2);
        c = qzgVar3;
        qzg qzgVar4 = new qzg("DO_NOTHING", 3);
        d = qzgVar4;
        e = new qzg[]{qzgVar, qzgVar2, qzgVar3, qzgVar4};
    }

    public static qzg[] values() {
        return (qzg[]) e.clone();
    }
}
