package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atpv extends aihn implements aiis {
    public static final atpv a;
    public int b;
    public int c;
    public aiip d;
    public aiip e;

    static {
        atpv atpvVar = new atpv();
        a = atpvVar;
        aihn.registerDefaultInstance(atpv.class, atpvVar);
    }

    private atpv() {
        aiip aiipVar = aiip.a;
        this.d = aiipVar;
        this.e = aiipVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.STRING;
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0002\u0000\u0000\u0001င\u0000\u00022\u00032", new Object[]{"b", "c", "d", new ahud(aikaVar, "", aika.BOOL, Boolean.FALSE), "e", new ahud(aikaVar, (Object) "", aika.INT64, (Object) 0L)});
        }
        if (iOrdinal == 3) {
            return new atpv();
        }
        if (iOrdinal == 4) {
            return new aihf((short[]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(atpv.class);
        }
        return null;
    }
}
