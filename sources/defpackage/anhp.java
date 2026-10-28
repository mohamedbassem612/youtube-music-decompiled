package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anhp extends aihn implements aiis {
    public static final anhp a;
    private aiip b;
    private aiip c;

    static {
        anhp anhpVar = new anhp();
        a = anhpVar;
        aihn.registerDefaultInstance(anhp.class, anhpVar);
    }

    private anhp() {
        aiip aiipVar = aiip.a;
        this.b = aiipVar;
        this.c = aiipVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.INT32;
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0004\u0005\u0002\u0002\u0000\u0000\u00042\u00052", new Object[]{"b", new ahud(aikaVar, (Object) 0, aikaVar, (Object) 0), "c", new ahud(aikaVar, (Object) 0, aikaVar, (Object) 0)});
        }
        if (iOrdinal == 3) {
            return new anhp();
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
        return aihn.getParserForClass(anhp.class);
    }
}
