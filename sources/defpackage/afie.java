package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afie extends aihn implements aiis {
    public static final afie a;
    public int b;
    public long c;
    public long d;
    public long e;

    static {
        afie afieVar = new afie();
        a = afieVar;
        aihn.registerDefaultInstance(afie.class, afieVar);
    }

    private afie() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0002\u0003ဂ\u0001", new Object[]{"b", "c", "e", "d"});
        }
        if (iOrdinal == 3) {
            return new afie();
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
        return aihn.getParserForClass(afie.class);
    }
}
