package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aule extends aihn implements aiis {
    public static final aule a;
    public int b;
    public String c = "";
    public aihp d = emptyBooleanList();
    public aihy e = emptyLongList();
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();
    public aigj h = aigj.d;

    static {
        aule auleVar = new aule();
        a = auleVar;
        aihn.registerDefaultInstance(aule.class, auleVar);
    }

    private aule() {
        emptyDoubleList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0004\u0000\u0001ဈ\u0000\u0002\u0019\u0003\u0014\u0004\u001a\u0005\u001b\u0006ည\u0001", new Object[]{"b", "c", "d", "e", "f", "g", aulf.class, "h"});
        }
        if (iOrdinal == 3) {
            return new aule();
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
        return aihn.getParserForClass(aule.class);
    }
}
