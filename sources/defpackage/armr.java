package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class armr extends aihn implements aiis {
    public static final armr a;
    public int b = 0;
    private Object c;

    static {
        armr armrVar = new armr();
        a = armrVar;
        aihn.registerDefaultInstance(armr.class, armrVar);
    }

    private armr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", armq.class, arlx.class});
        }
        if (iOrdinal == 3) {
            return new armr();
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
        return aihn.getParserForClass(armr.class);
    }
}
