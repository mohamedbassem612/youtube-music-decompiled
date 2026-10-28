package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class airu extends aihn implements aiis {
    public static final airu a;
    public int b;
    public aisn c;
    public boolean d;
    public String e = "";

    static {
        airu airuVar = new airu();
        a = airuVar;
        aihn.registerDefaultInstance(airu.class, airuVar);
    }

    private airu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0004ለ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new airu();
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
        return aihn.getParserForClass(airu.class);
    }
}
