package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asoh extends aihn implements aiis {
    public static final asoh a;
    public static final aihl b;
    public int c;
    public int d;
    public boolean e = true;
    private int f;

    static {
        asoh asohVar = new asoh();
        a = asohVar;
        aihn.registerDefaultInstance(asoh.class, asohVar);
        b = aihn.newSingularGeneratedExtension(asoo.a, asohVar, asohVar, null, 188911708, aika.MESSAGE, asoh.class);
    }

    private asoh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"f", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new asoh();
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
        return aihn.getParserForClass(asoh.class);
    }
}
