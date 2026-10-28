package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class liu extends aihn implements aiis {
    public static final liu a;
    public int b;
    public int c;
    public aihy d = emptyLongList();

    static {
        liu liuVar = new liu();
        a = liuVar;
        aihn.registerDefaultInstance(liu.class, liuVar);
    }

    private liu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new liu();
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
        return aihn.getParserForClass(liu.class);
    }
}
