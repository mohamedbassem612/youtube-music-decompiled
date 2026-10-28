package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajby extends aihn implements aiis {
    public static final ajby a;
    public int b;
    public ajca c;
    public ajbz d;
    public ajca e;
    public int f = 1;

    static {
        ajby ajbyVar = new ajby();
        a = ajbyVar;
        aihn.registerDefaultInstance(ajby.class, ajbyVar);
    }

    private ajby() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", aibu.o});
        }
        if (iOrdinal == 3) {
            return new ajby();
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
        return aihn.getParserForClass(ajby.class);
    }
}
