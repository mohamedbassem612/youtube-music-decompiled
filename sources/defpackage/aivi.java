package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aivi extends aihn implements aiis {
    public static final aivi a;
    public int b;
    public aodo c;

    static {
        aivi aiviVar = new aivi();
        a = aiviVar;
        aihn.registerDefaultInstance(aivi.class, aiviVar);
    }

    private aivi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf2d9₰\uf2d9₰\u0001\u0000\u0000\u0000\uf2d9₰ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aivi();
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
        return aihn.getParserForClass(aivi.class);
    }
}
