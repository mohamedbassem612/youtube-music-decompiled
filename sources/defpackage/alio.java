package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alio extends aihn implements aiis {
    public static final alio a;
    private aiip b = aiip.a;

    static {
        alio alioVar = new alio();
        a = alioVar;
        aihn.registerDefaultInstance(alio.class, alioVar);
    }

    private alio() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.STRING;
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ahud(aikaVar, "", aikaVar, "")});
        }
        if (iOrdinal == 3) {
            return new alio();
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
        return aihn.getParserForClass(alio.class);
    }
}
