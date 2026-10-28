package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aisn extends aihn implements aiis {
    public static final aisn a;
    public int b = 0;
    public Object c;
    public int d;
    public long e;
    private int f;

    static {
        aisn aisnVar = new aisn();
        a = aisnVar;
        aihn.registerDefaultInstance(aisn.class, aisnVar);
    }

    private aisn() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001<\u0000\u0002᠌\u0000\u0003ဂ\u0001\u0006;\u0000", new Object[]{"c", "b", "f", aiso.class, "d", aiod.r, "e"});
        }
        if (iOrdinal == 3) {
            return new aisn();
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
        return aihn.getParserForClass(aisn.class);
    }
}
