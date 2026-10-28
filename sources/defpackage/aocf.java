package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aocf extends aihn implements aiis {
    public static final aocf a;
    public int b;
    public int c;
    public long d;

    static {
        aocf aocfVar = new aocf();
        a = aocfVar;
        aihn.registerDefaultInstance(aocf.class, aocfVar);
    }

    private aocf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"b", "c", aobi.c, "d"});
        }
        if (iOrdinal == 3) {
            return new aocf();
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
        return aihn.getParserForClass(aocf.class);
    }
}
