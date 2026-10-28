package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alls extends aihn implements aiis {
    public static final alls a;
    public int b;
    public int c;
    public int d;

    static {
        alls allsVar = new alls();
        a = allsVar;
        aihn.registerDefaultInstance(alls.class, allsVar);
    }

    private alls() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0004ဋ\u0003", new Object[]{"b", "c", alip.u, "d"});
        }
        if (iOrdinal == 3) {
            return new alls();
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
        return aihn.getParserForClass(alls.class);
    }
}
