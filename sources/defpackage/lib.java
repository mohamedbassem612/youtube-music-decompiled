package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lib extends aihn implements aiis {
    public static final lib a;
    public int b;
    public boolean f;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();
    public aiie g = emptyProtobufList();

    static {
        lib libVar = new lib();
        a = libVar;
        aihn.registerDefaultInstance(lib.class, libVar);
    }

    private lib() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"b", "c", lhy.class, "d", lhz.class, "e", lia.class, "f", "g", lhy.class});
        }
        if (iOrdinal == 3) {
            return new lib();
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
        return aihn.getParserForClass(lib.class);
    }
}
