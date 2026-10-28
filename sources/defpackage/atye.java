package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atye extends aihn implements aiis {
    public static final atye a;
    private aiip b;
    private aiip c;
    private aiip d;

    static {
        atye atyeVar = new atye();
        a = atyeVar;
        aihn.registerDefaultInstance(atye.class, atyeVar);
    }

    private atye() {
        aiip aiipVar = aiip.a;
        this.b = aiipVar;
        this.c = aiipVar;
        this.d = aiipVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.STRING;
            return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u00022\u00032", new Object[]{"b", new ahud(aikaVar, "", aika.BOOL, Boolean.FALSE), "c", new ahud(aikaVar, (Object) "", aika.INT32, (Object) 0), "d", new ahud(aikaVar, "", aikaVar, "")});
        }
        if (iOrdinal == 3) {
            return new atye();
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
        return aihn.getParserForClass(atye.class);
    }
}
