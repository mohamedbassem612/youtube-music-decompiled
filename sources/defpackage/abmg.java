package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abmg {
    public static final abmg a;
    public static final abmg b;
    public static final abmg c;
    public static final abmg d;
    public static final abmg e;
    public static final abmg f;
    public static final abmg g;
    public static final abmg h;
    private static final /* synthetic */ abmg[] i;

    static {
        abmg abmgVar = new abmg("START", 0);
        a = abmgVar;
        abmg abmgVar2 = new abmg("NEXT", 1);
        b = abmgVar2;
        abmg abmgVar3 = new abmg("PREVIOUS", 2);
        c = abmgVar3;
        abmg abmgVar4 = new abmg("AUTOPLAY", 3);
        d = abmgVar4;
        abmg abmgVar5 = new abmg("AUTONAV", 4);
        e = abmgVar5;
        abmg abmgVar6 = new abmg("RETRY", 5);
        f = abmgVar6;
        abmg abmgVar7 = new abmg("JUMP", 6);
        g = abmgVar7;
        abmg abmgVar8 = new abmg("INSERT", 7);
        h = abmgVar8;
        i = new abmg[]{abmgVar, abmgVar2, abmgVar3, abmgVar4, abmgVar5, abmgVar6, abmgVar7, abmgVar8};
    }

    public static abmg[] values() {
        return (abmg[]) i.clone();
    }
}
