package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ailr extends aihn implements aiis {
    public static final ailr a;
    public aiip b = aiip.a;

    static {
        ailr ailrVar = new ailr();
        a = ailrVar;
        aihn.registerDefaultInstance(ailr.class, ailrVar);
    }

    private ailr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ahud(aika.STRING, "", aika.MESSAGE, aile.a)});
        }
        if (iOrdinal == 3) {
            return new ailr();
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
        return aihn.getParserForClass(ailr.class);
    }
}
