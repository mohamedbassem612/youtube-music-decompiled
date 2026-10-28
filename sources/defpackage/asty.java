package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asty extends aihn implements aiis {
    public static final asty a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        asty astyVar = new asty();
        a = astyVar;
        aihn.registerDefaultInstance(asty.class, astyVar);
    }

    private asty() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new asty();
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
        return aihn.getParserForClass(asty.class);
    }
}
