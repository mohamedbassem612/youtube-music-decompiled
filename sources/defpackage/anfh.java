package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class anfh extends aihn implements aiis {
    public static final anfh a;
    public int b;
    public long c;
    public long d;
    public boolean e;
    public aosr f;

    static {
        anfh anfhVar = new anfh();
        a = anfhVar;
        aihn.registerDefaultInstance(anfh.class, anfhVar);
    }

    private anfh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0004ဇ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new anfh();
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
        return aihn.getParserForClass(anfh.class);
    }
}
