package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class amsz extends aihn implements aiis {
    public static final amsz a;
    public static final aihl b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        amsz amszVar = new amsz();
        a = amszVar;
        aihn.registerDefaultInstance(amsz.class, amszVar);
        b = aihn.newSingularGeneratedExtension(aofg.b, amszVar, amszVar, null, 318835310, aika.MESSAGE, amsz.class);
    }

    private amsz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0006ဈ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new amsz();
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
        return aihn.getParserForClass(amsz.class);
    }
}
