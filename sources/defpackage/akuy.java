package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akuy extends aihn implements aiis {
    public static final akuy a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        akuy akuyVar = new akuy();
        a = akuyVar;
        aihn.registerDefaultInstance(akuy.class, akuyVar);
    }

    private akuy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0007᠌\u0006", new Object[]{"b", "c", akux.d, "d", "e", akux.a, "f", akux.c, "g", aixp.m});
        }
        if (iOrdinal == 3) {
            return new akuy();
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
        return aihn.getParserForClass(akuy.class);
    }
}
