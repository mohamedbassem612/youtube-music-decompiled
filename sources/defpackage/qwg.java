package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qwg {
    public static final qwg a;
    public static final qwg b;
    public static final qwg c;
    private static final /* synthetic */ qwg[] d;

    static {
        qwg qwgVar = new qwg("LEFT", 0);
        a = qwgVar;
        qwg qwgVar2 = new qwg("RIGHT", 1);
        b = qwgVar2;
        qwg qwgVar3 = new qwg("CENTER", 2);
        c = qwgVar3;
        d = new qwg[]{qwgVar, qwgVar2, qwgVar3};
    }

    public static qwg[] values() {
        return (qwg[]) d.clone();
    }
}
