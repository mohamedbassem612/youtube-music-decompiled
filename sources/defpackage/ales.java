package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ales extends aihn implements aiis {
    public static final ales a;
    public int b;
    public int c;
    public int d;
    public int e;
    public aiie f = emptyProtobufList();
    public boolean g;

    static {
        ales alesVar = new ales();
        a = alesVar;
        aihn.registerDefaultInstance(ales.class, alesVar);
    }

    private ales() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b\u0005ဇ\u0003", new Object[]{"b", "c", "d", "e", "f", aler.class, "g"});
        }
        if (iOrdinal == 3) {
            return new ales();
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
        return aihn.getParserForClass(ales.class);
    }
}
