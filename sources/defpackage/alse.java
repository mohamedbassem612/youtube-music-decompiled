package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alse extends aihn implements aiis {
    public static final alse a;
    private aiip b;
    private aiip c;
    private aiip d;

    static {
        alse alseVar = new alse();
        a = alseVar;
        aihn.registerDefaultInstance(alse.class, alseVar);
    }

    private alse() {
        aiip aiipVar = aiip.a;
        this.b = aiipVar;
        this.c = aiipVar;
        this.d = aiipVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.UINT32;
            aika aikaVar2 = aika.MESSAGE;
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u00022\u00032", new Object[]{"b", new ahud(aikaVar, (Object) 0, aikaVar2, (Object) alsf.a), "c", new ahud(aikaVar, (Object) 0, aikaVar2, (Object) aqnk.a), "d", new ahud(aikaVar, (Object) 0, aikaVar2, (Object) alsd.a)});
        }
        if (iOrdinal == 3) {
            return new alse();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(alse.class);
    }
}
