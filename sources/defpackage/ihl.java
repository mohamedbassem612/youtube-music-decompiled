package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ihl {
    STATE_INDIFFERENT(0),
    STATE_LIKED(1),
    STATE_DISLIKED(2),
    STATE_HIDDEN(3);

    public static final agkj e;
    public final int f;

    static {
        ihl ihlVar = STATE_INDIFFERENT;
        ihl ihlVar2 = STATE_LIKED;
        ihl ihlVar3 = STATE_DISLIKED;
        ihl ihlVar4 = STATE_HIDDEN;
        e = agkj.m(Integer.valueOf(ihlVar.f), ihlVar, Integer.valueOf(ihlVar2.f), ihlVar2, Integer.valueOf(ihlVar3.f), ihlVar3, Integer.valueOf(ihlVar4.f), ihlVar4);
    }

    ihl(int i) {
        this.f = i;
    }
}
