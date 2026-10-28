package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akrq extends aihn implements aiis {
    public static final akrq a;
    public int b;
    public boolean c;
    public float d;
    public float e;
    public float f;
    public boolean g;

    static {
        akrq akrqVar = new akrq();
        a = akrqVar;
        aihn.registerDefaultInstance(akrq.class, akrqVar);
    }

    private akrq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new akrq();
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
        return aihn.getParserForClass(akrq.class);
    }
}
