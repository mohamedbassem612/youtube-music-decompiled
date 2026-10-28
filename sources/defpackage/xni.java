package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xni extends aihn implements aiis {
    public static final xni a;
    public int b;
    public int c;
    public String d = "";

    static {
        xni xniVar = new xni();
        a = xniVar;
        aihn.registerDefaultInstance(xni.class, xniVar);
    }

    private xni() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002᠌\u0000\u0003ለ\u0001", new Object[]{"b", "c", amys.d, "d"});
        }
        if (iOrdinal == 3) {
            return new xni();
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
        return aihn.getParserForClass(xni.class);
    }
}
