package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axgg extends aihn implements aiis {
    public static final axgg a;
    public int b;
    public int c;
    public aigu d;
    public long e;
    public int f;
    public aiie g = emptyProtobufList();

    static {
        axgg axggVar = new axgg();
        a = axggVar;
        aihn.registerDefaultInstance(axgg.class, axggVar);
    }

    private axgg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003စ\u0002\u0004᠌\u0003\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", audg.m, "g", axgf.class});
        }
        if (iOrdinal == 3) {
            return new axgg();
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
        return aihn.getParserForClass(axgg.class);
    }
}
