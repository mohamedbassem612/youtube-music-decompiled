package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amuo extends aihn implements aiis {
    public static final amuo a;
    public int b;
    public String c = "";
    public aiie d = emptyProtobufList();

    static {
        amuo amuoVar = new amuo();
        a = amuoVar;
        aihn.registerDefaultInstance(amuo.class, amuoVar);
    }

    private amuo() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"b", "c", "d", amun.class});
        }
        if (iOrdinal == 3) {
            return new amuo();
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
        return aihn.getParserForClass(amuo.class);
    }
}
