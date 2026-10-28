package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atww extends aihn implements aiis {
    public static final atww a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        atww atwwVar = new atww();
        a = atwwVar;
        aihn.registerDefaultInstance(atww.class, atwwVar);
    }

    private atww() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new atww();
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
        return aihn.getParserForClass(atww.class);
    }
}
