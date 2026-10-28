package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atwl extends aihn implements aiis {
    public static final atwl a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        atwl atwlVar = new atwl();
        a = atwlVar;
        aihn.registerDefaultInstance(atwl.class, atwlVar);
    }

    private atwl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"d", "c", "b", "e", "f", atts.class, attp.class, attm.class, attx.class, atto.class});
        }
        if (iOrdinal == 3) {
            return new atwl();
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
        return aihn.getParserForClass(atwl.class);
    }
}
