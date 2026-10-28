package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aobm extends aihn implements aiis {
    public static final aobm a;
    public int b;
    public int c;

    static {
        aobm aobmVar = new aobm();
        a = aobmVar;
        aihn.registerDefaultInstance(aobm.class, aobmVar);
    }

    private aobm() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aobm();
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
        return aihn.getParserForClass(aobm.class);
    }
}
