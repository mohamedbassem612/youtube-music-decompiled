package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avla {
    public static final avla a;
    public static final avla b;
    public static final avla c;
    public static final avla d;
    public static final avla e;
    private static final /* synthetic */ avla[] f;

    static {
        avla avlaVar = new avla("MISSING", 0);
        a = avlaVar;
        avla avlaVar2 = new avla("ERROR", 1);
        b = avlaVar2;
        avla avlaVar3 = new avla("BUFFER", 2);
        c = avlaVar3;
        avla avlaVar4 = new avla("DROP", 3);
        d = avlaVar4;
        avla avlaVar5 = new avla("LATEST", 4);
        e = avlaVar5;
        f = new avla[]{avlaVar, avlaVar2, avlaVar3, avlaVar4, avlaVar5};
    }

    public static avla[] values() {
        return (avla[]) f.clone();
    }
}
