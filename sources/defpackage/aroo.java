package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aroo extends aihn implements aiis {
    public static final aroo a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";

    static {
        aroo arooVar = new aroo();
        a = arooVar;
        aihn.registerDefaultInstance(aroo.class, arooVar);
    }

    private aroo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004᠌\u0001", new Object[]{"b", "d", "e", "c", arke.h});
        }
        if (iOrdinal == 3) {
            return new aroo();
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
        return aihn.getParserForClass(aroo.class);
    }
}
