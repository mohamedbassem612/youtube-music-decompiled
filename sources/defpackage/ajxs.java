package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajxs extends aihn implements aiis {
    public static final ajxs a;
    public static final aihl b;
    public int c;
    public String d = "";
    public String e = "";
    public long f;
    public boolean g;

    static {
        ajxs ajxsVar = new ajxs();
        a = ajxsVar;
        aihn.registerDefaultInstance(ajxs.class, ajxsVar);
        b = aihn.newSingularGeneratedExtension(akvi.a, ajxsVar, ajxsVar, null, 220, aika.MESSAGE, ajxs.class);
    }

    private ajxs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ajxs();
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
        return aihn.getParserForClass(ajxs.class);
    }
}
