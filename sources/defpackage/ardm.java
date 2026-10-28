package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ardm extends aihn implements aiis {
    public static final ardm a;
    public boolean b;
    public boolean c;
    private int d;

    static {
        ardm ardmVar = new ardm();
        a = ardmVar;
        aihn.registerDefaultInstance(ardm.class, ardmVar);
    }

    private ardm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0005\u001c\u0002\u0000\u0000\u0000\u0005ဇ\u0004\u001cဇ\u001b", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new ardm();
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
        return aihn.getParserForClass(ardm.class);
    }
}
