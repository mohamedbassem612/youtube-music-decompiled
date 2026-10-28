package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afye extends aihn implements aiis {
    public static final afye a;
    public int b;
    public aihv c = emptyIntList();
    public String d = "";
    public String e = "";
    public int f;

    static {
        afye afyeVar = new afye();
        a = afyeVar;
        aihn.registerDefaultInstance(afye.class, afyeVar);
    }

    private afye() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\r\u0004\u0000\u0001\u0000\u0002ࠞ\u0004ဈ\u0002\u0007ဈ\u0007\r᠌\b", new Object[]{"b", "c", oia.r, "d", "e", "f", oia.q});
        }
        if (iOrdinal == 3) {
            return new afye();
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
        return aihn.getParserForClass(afye.class);
    }
}
