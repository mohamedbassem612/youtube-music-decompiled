package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rel {
    public static final rel a;
    public static final rel b;
    public static final rel c;
    public static final rel d;
    public static final rel e;
    private static final /* synthetic */ rel[] f;

    static {
        rel relVar = new rel("OK", 0);
        a = relVar;
        rel relVar2 = new rel("INSTRUCTION", 1);
        b = relVar2;
        rel relVar3 = new rel("WAIT", 2);
        c = relVar3;
        rel relVar4 = new rel("SKIP", 3);
        d = relVar4;
        rel relVar5 = new rel("END", 4);
        e = relVar5;
        f = new rel[]{relVar, relVar2, relVar3, relVar4, relVar5};
    }

    public static rel[] values() {
        return (rel[]) f.clone();
    }
}
