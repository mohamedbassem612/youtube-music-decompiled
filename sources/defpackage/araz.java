package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class araz extends aihn implements aiis {
    public static final araz a;
    public aiie b = emptyProtobufList();
    public String c = "";
    private int d;

    static {
        araz arazVar = new araz();
        a = arazVar;
        aihn.registerDefaultInstance(araz.class, arazVar);
    }

    private araz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"d", "b", arba.class, "c"});
        }
        if (iOrdinal == 3) {
            return new araz();
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
        return aihn.getParserForClass(araz.class);
    }
}
