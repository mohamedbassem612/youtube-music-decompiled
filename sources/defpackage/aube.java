package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aube extends aihn implements aiis {
    public static final aube a;
    public static final aihl b;
    public int c;
    public int d;
    public float e;
    public atyv f;

    static {
        aube aubeVar = new aube();
        a = aubeVar;
        aihn.registerDefaultInstance(aube.class, aubeVar);
        b = aihn.newSingularGeneratedExtension(atwa.a, aubeVar, aubeVar, null, 525000003, aika.MESSAGE, aube.class);
    }

    private aube() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ဉ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aube();
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
        return aihn.getParserForClass(aube.class);
    }
}
