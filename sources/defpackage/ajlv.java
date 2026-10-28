package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajlv extends aihn implements aiis {
    public static final ajlv a;
    public static final aihl b;
    public int c;
    public String d = "";
    public boolean e;

    static {
        ajlv ajlvVar = new ajlv();
        a = ajlvVar;
        aihn.registerDefaultInstance(ajlv.class, ajlvVar);
        b = aihn.newSingularGeneratedExtension(akvi.a, ajlvVar, ajlvVar, null, 307, aika.MESSAGE, ajlv.class);
    }

    private ajlv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ajlv();
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
        return aihn.getParserForClass(ajlv.class);
    }
}
