package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apfd extends aihn implements aiis {
    public static final apfd a;
    public int b;
    public boolean c;
    public float d;
    public float e;

    static {
        apfd apfdVar = new apfd();
        a = apfdVar;
        aihn.registerDefaultInstance(apfd.class, apfdVar);
    }

    private apfd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0004ခ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new apfd();
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
        return aihn.getParserForClass(apfd.class);
    }
}
