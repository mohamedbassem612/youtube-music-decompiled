package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arna extends aihn implements aiis {
    public static final arna a;
    public aiie b = emptyProtobufList();
    public String c = "";
    private int d;

    static {
        arna arnaVar = new arna();
        a = arnaVar;
        aihn.registerDefaultInstance(arna.class, arnaVar);
    }

    private arna() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"d", "b", army.class, "c"});
        }
        if (iOrdinal == 3) {
            return new arna();
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
        return aihn.getParserForClass(arna.class);
    }
}
