package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atpn extends aihn implements aiis {
    public static final atpn a;
    public int b;
    public aiip c;
    public aiip d;
    public aiip e;
    public aiip f;
    public aiip g;
    public aiip h;
    public aiip i;
    public int j;

    static {
        atpn atpnVar = new atpn();
        a = atpnVar;
        aihn.registerDefaultInstance(atpn.class, atpnVar);
    }

    private atpn() {
        aiip aiipVar = aiip.a;
        this.c = aiipVar;
        this.d = aiipVar;
        this.e = aiipVar;
        this.f = aiipVar;
        this.g = aiipVar;
        this.h = aiipVar;
        this.i = aiipVar;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.STRING;
            ahud ahudVar = new ahud(aikaVar, "", aika.BOOL, Boolean.FALSE);
            aika aikaVar2 = aika.INT32;
            ahud ahudVar2 = new ahud(aikaVar, (Object) "", aikaVar2, (Object) 0);
            ahud ahudVar3 = new ahud(aikaVar, (Object) "", aikaVar2, (Object) 0);
            aika aikaVar3 = aika.INT64;
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0006\r\b\u0007\u0000\u0000\u00062\u00072\b2\t2\n2\u000b2\f2\rင\u0000", new Object[]{"b", "c", ahudVar, "d", ahudVar2, "e", ahudVar3, "f", new ahud(aikaVar, (Object) "", aikaVar3, (Object) 0L), "g", new ahud(aikaVar, (Object) "", aikaVar2, (Object) 0), "h", new ahud(aikaVar, (Object) "", aikaVar3, (Object) 0L), "i", new ahud(aikaVar, (Object) "", aikaVar2, (Object) 0), "j"});
        }
        if (iOrdinal == 3) {
            return new atpn();
        }
        if (iOrdinal == 4) {
            return new jrq((char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(atpn.class);
        }
        return null;
    }
}
