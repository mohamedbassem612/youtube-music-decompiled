package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiyr extends aihn implements aiis {
    public static final aiyr a;
    public int b;
    public int c;
    public aiyq d;
    public int e;

    static {
        aiyr aiyrVar = new aiyr();
        a = aiyrVar;
        aihn.registerDefaultInstance(aiyr.class, aiyrVar);
    }

    private aiyr() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002᠌\u0000\u0003ဉ\u0001\u0004᠌\u0002", new Object[]{"b", "c", aiwd.k, "d", "e", aiwd.i});
        }
        if (iOrdinal == 3) {
            return new aiyr();
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
        return aihn.getParserForClass(aiyr.class);
    }
}
