package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqae extends aihn implements aiis {
    public static final aqae a;
    public aiip b = aiip.a;

    static {
        aqae aqaeVar = new aqae();
        a = aqaeVar;
        aihn.registerDefaultInstance(aqae.class, aqaeVar);
    }

    private aqae() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ahud(aika.STRING, "", aika.MESSAGE, akcy.a)});
        }
        if (iOrdinal == 3) {
            return new aqae();
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
        return aihn.getParserForClass(aqae.class);
    }
}
