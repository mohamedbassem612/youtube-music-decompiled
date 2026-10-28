package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aobo extends aihn implements aiis {
    public static final aihw a = new aiat(15);
    public static final aobo b;
    public aihv c = emptyIntList();

    static {
        aobo aoboVar = new aobo();
        b = aoboVar;
        aihn.registerDefaultInstance(aobo.class, aoboVar);
    }

    private aobo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"c"});
        }
        if (iOrdinal == 3) {
            return new aobo();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(aobo.class);
    }
}
