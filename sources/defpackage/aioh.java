package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aioh extends aihn implements aiis {
    public static final aioh a;
    public int b;
    public boolean c;

    static {
        aioh aiohVar = new aioh();
        a = aiohVar;
        aihn.registerDefaultInstance(aioh.class, aiohVar);
    }

    private aioh() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0001", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aioh();
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
        return aihn.getParserForClass(aioh.class);
    }
}
