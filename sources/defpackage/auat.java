package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auat extends aihn implements auau {
    public static final auat a;
    public int b;
    public int c;
    public int d;
    public auas e;
    public aimy f;
    public long g;

    static {
        auat auatVar = new auat();
        a = auatVar;
        aihn.registerDefaultInstance(auat.class, auatVar);
    }

    private auat() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0007ဂ\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new auat();
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
        return aihn.getParserForClass(auat.class);
    }
}
