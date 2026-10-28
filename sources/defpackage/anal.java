package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anal extends aihn implements aiis {
    public static final anal a;
    public int b;
    public aigu c;
    public aigu d;
    public boolean e;
    public aiie f = emptyProtobufList();
    public anaj g;

    static {
        anal analVar = new anal();
        a = analVar;
        aihn.registerDefaultInstance(anal.class, analVar);
    }

    private anal() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004\u001b\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e", "f", anam.class, "g"});
        }
        if (iOrdinal == 3) {
            return new anal();
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
        return aihn.getParserForClass(anal.class);
    }
}
