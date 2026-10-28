package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abgh {
    public static final abgh a;
    public static final abgh b;
    public static final abgh c;
    public static final abgh d;
    public static final abgh e;
    public static final abgh f;
    private static final /* synthetic */ abgh[] g;

    static {
        abgh abghVar = new abgh("NEW", 0);
        a = abghVar;
        abgh abghVar2 = new abgh("PLAYING", 1);
        b = abghVar2;
        abgh abghVar3 = new abgh("PAUSED", 2);
        c = abghVar3;
        abgh abghVar4 = new abgh("RECOVERABLE_ERROR", 3);
        d = abghVar4;
        abgh abghVar5 = new abgh("UNRECOVERABLE_ERROR", 4);
        e = abghVar5;
        abgh abghVar6 = new abgh("ENDED", 5);
        f = abghVar6;
        g = new abgh[]{abghVar, abghVar2, abghVar3, abghVar4, abghVar5, abghVar6};
    }

    public static abgh[] values() {
        return (abgh[]) g.clone();
    }
}
