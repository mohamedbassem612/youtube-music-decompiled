package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aoie extends aihn implements aiis {
    public static final aoie a;
    public int b;
    public aoid c;
    public aoif d;

    static {
        aoie aoieVar = new aoie();
        a = aoieVar;
        aihn.registerDefaultInstance(aoie.class, aoieVar);
    }

    private aoie() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\ue51e䒑\ued25馢\u0002\u0000\u0000\u0000\ue51e䒑ဉ\u0000\ued25馢ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aoie();
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
        return aihn.getParserForClass(aoie.class);
    }
}
