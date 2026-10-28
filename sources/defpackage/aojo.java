package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aojo extends aihn implements aiis {
    public static final aojo a;
    public int b;
    public int c;
    public int e;
    public aiie d = emptyProtobufList();
    public aiie f = emptyProtobufList();

    static {
        aojo aojoVar = new aojo();
        a = aojoVar;
        aihn.registerDefaultInstance(aojo.class, aojoVar);
    }

    private aojo() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\f\u0004\u0000\u0002\u0000\u0001င\u0000\u0003င\u0002\t\u001a\f\u001a", new Object[]{"b", "c", "e", "f", "d"});
        }
        if (iOrdinal == 3) {
            return new aojo();
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
        return aihn.getParserForClass(aojo.class);
    }
}
