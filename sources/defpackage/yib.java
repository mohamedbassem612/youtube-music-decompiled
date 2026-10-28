package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yib {
    public static final yib a;
    public static final yib b;
    public static final yib c;
    public static final yib d;
    private static final /* synthetic */ yib[] e;

    static {
        yib yibVar = new yib("PQ", 0);
        a = yibVar;
        yib yibVar2 = new yib("HLG", 1);
        b = yibVar2;
        yib yibVar3 = new yib("GAMMA22", 2);
        c = yibVar3;
        yib yibVar4 = new yib("LINEAR", 3);
        d = yibVar4;
        e = new yib[]{yibVar, yibVar2, yibVar3, yibVar4};
    }

    public static yib[] values() {
        return (yib[]) e.clone();
    }
}
