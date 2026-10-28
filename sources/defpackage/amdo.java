package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amdo extends aihn implements aiis {
    public static final amdo a;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        amdo amdoVar = new amdo();
        a = amdoVar;
        aihn.registerDefaultInstance(amdo.class, amdoVar);
    }

    private amdo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002᠌\u0001\u0004᠌\u0003\u0005ဈ\u0004", new Object[]{"b", "c", amed.g, "d", apdr.i, "e"});
        }
        if (iOrdinal == 3) {
            return new amdo();
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
        return aihn.getParserForClass(amdo.class);
    }
}
