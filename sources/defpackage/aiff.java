package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aiff extends aihn implements aiis {
    public static final aiff a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        aiff aiffVar = new aiff();
        a = aiffVar;
        aihn.registerDefaultInstance(aiff.class, aiffVar);
    }

    private aiff() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", aidl.j, "d", aidl.e, "e", aidl.d, "f", aidl.o, "g", aidl.f});
        }
        if (iOrdinal == 3) {
            return new aiff();
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
        return aihn.getParserForClass(aiff.class);
    }
}
