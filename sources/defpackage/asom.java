package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asom extends aihn implements aiis {
    public static final asom a;
    public static final aihl b;
    public int c;
    public int d;
    public float e;
    public float f;
    public float g;

    static {
        asom asomVar = new asom();
        a = asomVar;
        aihn.registerDefaultInstance(asom.class, asomVar);
        b = aihn.newSingularGeneratedExtension(asod.a, asomVar, asomVar, null, 200077771, aika.MESSAGE, asom.class);
    }

    private asom() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new asom();
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
        return aihn.getParserForClass(asom.class);
    }
}
