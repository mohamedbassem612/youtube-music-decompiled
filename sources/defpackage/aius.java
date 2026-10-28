package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aius extends aihn implements aiis {
    public static final aius a;
    public static final aihl b;
    public int c;
    public String d = "";
    public boolean e;

    static {
        aius aiusVar = new aius();
        a = aiusVar;
        aihn.registerDefaultInstance(aius.class, aiusVar);
        b = aihn.newSingularGeneratedExtension(akvi.a, aiusVar, aiusVar, null, 282, aika.MESSAGE, aius.class);
    }

    private aius() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aius();
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
        return aihn.getParserForClass(aius.class);
    }
}
