package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qwk {
    public static final qwk a;
    public static final qwk b;
    public static final qwk c;
    public static final qwk d;
    public static final qwk e;
    private static final /* synthetic */ qwk[] f;

    static {
        qwk qwkVar = new qwk("SOLID", 0);
        a = qwkVar;
        qwk qwkVar2 = new qwk("DOUBLE", 1);
        b = qwkVar2;
        qwk qwkVar3 = new qwk("DOTTED", 2);
        c = qwkVar3;
        qwk qwkVar4 = new qwk("DASHED", 3);
        d = qwkVar4;
        qwk qwkVar5 = new qwk("WAVY", 4);
        e = qwkVar5;
        f = new qwk[]{qwkVar, qwkVar2, qwkVar3, qwkVar4, qwkVar5};
    }

    public static qwk[] values() {
        return (qwk[]) f.clone();
    }
}
