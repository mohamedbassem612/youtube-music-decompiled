package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class abkh {
    public static final abkh a;
    public static final abkh b;
    public static final abkh c;
    public static final abkh d;
    public static final abkh e;
    public static final abkh f;
    public static final abkh g;
    public static final abkh h;
    public static final abkh i;
    private static final /* synthetic */ abkh[] j;

    static {
        abkh abkhVar = new abkh("UNKNOWN", 0);
        a = abkhVar;
        abkh abkhVar2 = new abkh("REORDER", 1);
        b = abkhVar2;
        abkh abkhVar3 = new abkh("DELETE", 2);
        c = abkhVar3;
        abkh abkhVar4 = new abkh("PLAY_NEXT", 3);
        d = abkhVar4;
        abkh abkhVar5 = new abkh("ADD_TO_QUEUE", 4);
        e = abkhVar5;
        abkh abkhVar6 = new abkh("ADD_AFTER", 5);
        f = abkhVar6;
        abkh abkhVar7 = new abkh("PROMOTE_FROM_AUTOPLAY", 6);
        g = abkhVar7;
        abkh abkhVar8 = new abkh("SHUFFLE", 7);
        h = abkhVar8;
        abkh abkhVar9 = new abkh("UNSHUFFLE", 8);
        i = abkhVar9;
        j = new abkh[]{abkhVar, abkhVar2, abkhVar3, abkhVar4, abkhVar5, abkhVar6, abkhVar7, abkhVar8, abkhVar9};
    }

    public static abkh[] values() {
        return (abkh[]) j.clone();
    }
}
