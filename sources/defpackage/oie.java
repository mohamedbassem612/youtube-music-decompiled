package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oie extends aihn implements aiis {
    public static final oie a;
    public static final aihl b;
    public int c;
    public long d;
    public long e;

    static {
        oie oieVar = new oie();
        a = oieVar;
        aihn.registerDefaultInstance(oie.class, oieVar);
        b = aihn.newSingularGeneratedExtension(ohy.a, oieVar, oieVar, null, 1000, aika.MESSAGE, oie.class);
    }

    private oie() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new oie();
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
        return aihn.getParserForClass(oie.class);
    }
}
