package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiqh extends aihn implements aiis {
    public static final aiqh a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        aiqh aiqhVar = new aiqh();
        a = aiqhVar;
        aihn.registerDefaultInstance(aiqh.class, aiqhVar);
    }

    private aiqh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0006\u000e\u0004\u0000\u0000\u0000\u0006င\u0003\nဇ\u0006\rဇ\t\u000eဇ\n", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aiqh();
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
        return aihn.getParserForClass(aiqh.class);
    }
}
