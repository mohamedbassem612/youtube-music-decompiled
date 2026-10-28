package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alyr extends aihn implements aiis {
    public static final alyr a;
    public aiie b = emptyProtobufList();
    public aiie c = emptyProtobufList();

    static {
        alyr alyrVar = new alyr();
        a = alyrVar;
        aihn.registerDefaultInstance(alyr.class, alyrVar);
    }

    private alyr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", alyq.class, "c", alyq.class});
        }
        if (iOrdinal == 3) {
            return new alyr();
        }
        if (iOrdinal == 4) {
            return new aihf((char[][][]) null, (short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(alyr.class);
        }
        return null;
    }
}
