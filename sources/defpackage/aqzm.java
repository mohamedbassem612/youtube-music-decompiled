package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqzm extends aihn implements aiis {
    public static final aqzm a;
    public static final aihl b;
    public int c;
    public String d = "";
    private int e;

    static {
        aqzm aqzmVar = new aqzm();
        a = aqzmVar;
        aihn.registerDefaultInstance(aqzm.class, aqzmVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqzmVar, aqzmVar, null, 1071, aika.MESSAGE, aqzm.class);
    }

    private aqzm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0002\u0003င\u0001", new Object[]{"e", "d", "c"});
        }
        if (iOrdinal == 3) {
            return new aqzm();
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
        return aihn.getParserForClass(aqzm.class);
    }
}
