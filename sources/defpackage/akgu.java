package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akgu extends aihn implements aiis {
    public static final akgu a;
    public int b;
    public float c;
    public int d;

    static {
        akgu akguVar = new akgu();
        a = akguVar;
        aihn.registerDefaultInstance(akgu.class, akguVar);
    }

    private akgu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ဋ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new akgu();
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
        return aihn.getParserForClass(akgu.class);
    }
}
