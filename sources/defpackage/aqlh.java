package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqlh extends aihn implements aiis {
    public static final aqlh a;
    public int b;
    public int c;
    public String d = "";

    static {
        aqlh aqlhVar = new aqlh();
        a = aqlhVar;
        aihn.registerDefaultInstance(aqlh.class, aqlhVar);
    }

    private aqlh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003ဈ\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aqlh();
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
        return aihn.getParserForClass(aqlh.class);
    }
}
