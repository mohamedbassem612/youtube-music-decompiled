package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aolk extends aihn implements aiis {
    public static final aolk a;
    public int b;
    public String c = "";
    public String d = "";
    public boolean e;

    static {
        aolk aolkVar = new aolk();
        a = aolkVar;
        aihn.registerDefaultInstance(aolk.class, aolkVar);
    }

    private aolk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\b\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\bဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aolk();
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
        return aihn.getParserForClass(aolk.class);
    }
}
