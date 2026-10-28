package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qwb {
    public static final qwb a;
    public static final qwb b;
    public static final qwb c;
    public static final qwb d;
    private static final /* synthetic */ qwb[] e;

    static {
        qwb qwbVar = new qwb("UNSPECIFIED", 0);
        a = qwbVar;
        qwb qwbVar2 = new qwb("FILL", 1);
        b = qwbVar2;
        qwb qwbVar3 = new qwb("STROKE", 2);
        c = qwbVar3;
        qwb qwbVar4 = new qwb("STROKE_FILL", 3);
        d = qwbVar4;
        e = new qwb[]{qwbVar, qwbVar2, qwbVar3, qwbVar4};
    }

    public static qwb[] values() {
        return (qwb[]) e.clone();
    }
}
