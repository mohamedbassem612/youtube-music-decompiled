package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ieb {
    public static final ieb a;
    public static final ieb b;
    public static final ieb c;
    public static final ieb d;
    private static final /* synthetic */ ieb[] e;

    static {
        ieb iebVar = new ieb("START_PAUSED", 0);
        a = iebVar;
        ieb iebVar2 = new ieb("START_PLAYING", 1);
        b = iebVar2;
        ieb iebVar3 = new ieb("SKIP_TO_NEXT", 2);
        c = iebVar3;
        ieb iebVar4 = new ieb("SKIP_TO_PREV", 3);
        d = iebVar4;
        e = new ieb[]{iebVar, iebVar2, iebVar3, iebVar4};
    }

    public static ieb[] values() {
        return (ieb[]) e.clone();
    }
}
