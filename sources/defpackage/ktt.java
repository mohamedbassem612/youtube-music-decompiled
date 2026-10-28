package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ktt {
    public static final ktt a;
    public static final ktt b;
    public static final ktt c;
    private static final /* synthetic */ ktt[] d;

    static {
        ktt kttVar = new ktt("NOTHING", 0);
        a = kttVar;
        ktt kttVar2 = new ktt("COARSE", 1);
        b = kttVar2;
        ktt kttVar3 = new ktt("FINE", 2);
        c = kttVar3;
        d = new ktt[]{kttVar, kttVar2, kttVar3};
    }

    public static ktt[] values() {
        return (ktt[]) d.clone();
    }
}
