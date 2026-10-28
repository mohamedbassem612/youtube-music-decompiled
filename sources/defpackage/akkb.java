package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akkb extends aihn implements aiis {
    public static final akkb a;
    public static final aihl b;
    public int c;
    public Object e;
    public int d = 0;
    public String f = "";

    static {
        akkb akkbVar = new akkb();
        a = akkbVar;
        aihn.registerDefaultInstance(akkb.class, akkbVar);
        b = aihn.newSingularGeneratedExtension(akvi.a, akkbVar, akkbVar, null, 303, aika.MESSAGE, akkb.class);
    }

    private akkb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u00027\u0000\u0003\u083f\u0000", new Object[]{"e", "d", "c", "f", aqvi.c});
        }
        if (iOrdinal == 3) {
            return new akkb();
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
        return aihn.getParserForClass(akkb.class);
    }
}
