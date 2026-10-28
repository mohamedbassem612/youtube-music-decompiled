package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asmh extends aihn implements aiis {
    public static final asmh a;
    public int b;
    public String c = "";
    public int d;
    public int e;

    static {
        asmh asmhVar = new asmh();
        a = asmhVar;
        aihn.registerDefaultInstance(asmh.class, asmhVar);
    }

    private asmh() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0006᠌\u0004", new Object[]{"b", "c", "d", "e", asmm.l});
        }
        if (iOrdinal == 3) {
            return new asmh();
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
        return aihn.getParserForClass(asmh.class);
    }
}
