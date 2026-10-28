package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class armo extends aihn implements aiis {
    public static final armo a;
    public Object c;
    private int e;
    public int b = 0;
    public String d = "";

    static {
        armo armoVar = new armo();
        a = armoVar;
        aihn.registerDefaultInstance(armo.class, armoVar);
    }

    private armo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u00027\u0000\u00034\u0000\u0004:\u0000\u0005;\u0000\u0006=\u0000\u0007<\u0000\b=\u0000\t<\u0000", new Object[]{"c", "b", "e", "d", arlk.class, arln.class});
        }
        if (iOrdinal == 3) {
            return new armo();
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
        return aihn.getParserForClass(armo.class);
    }
}
