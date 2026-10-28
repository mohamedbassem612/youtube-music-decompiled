package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajge extends aihn implements aiis {
    public static final ajge a;
    public static final aihl b;
    public int c;
    public String d = "";
    public String e = "";
    public int f;

    static {
        ajge ajgeVar = new ajge();
        a = ajgeVar;
        aihn.registerDefaultInstance(ajge.class, ajgeVar);
        b = aihn.newSingularGeneratedExtension(akvi.a, ajgeVar, ajgeVar, null, 474, aika.MESSAGE, ajge.class);
    }

    private ajge() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"c", "d", "e", "f", aixp.r});
        }
        if (iOrdinal == 3) {
            return new ajge();
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
        return aihn.getParserForClass(ajge.class);
    }
}
