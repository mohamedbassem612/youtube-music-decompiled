package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anvz extends aihn implements aiis {
    public static final anvz a;
    public static final aihl b;
    public String c = "";
    public String d = "";
    public String e = "";
    private int f;

    static {
        anvz anvzVar = new anvz();
        a = anvzVar;
        aihn.registerDefaultInstance(anvz.class, anvzVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, anvzVar, anvzVar, null, 1109, aika.MESSAGE, anvz.class);
    }

    private anvz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"f", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new anvz();
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
        return aihn.getParserForClass(anvz.class);
    }
}
