package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajdk extends aihn implements aiis {
    public static final ajdk a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        ajdk ajdkVar = new ajdk();
        a = ajdkVar;
        aihn.registerDefaultInstance(ajdk.class, ajdkVar);
    }

    private ajdk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ajdk();
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
        return aihn.getParserForClass(ajdk.class);
    }
}
