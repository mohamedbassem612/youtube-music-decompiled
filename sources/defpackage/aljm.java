package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aljm extends aihn implements aiis {
    public static final aljm a;
    public int b;
    public akhb c;
    public int d;

    static {
        aljm aljmVar = new aljm();
        a = aljmVar;
        aihn.registerDefaultInstance(aljm.class, aljmVar);
    }

    private aljm() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003᠌\u0001", new Object[]{"b", "c", "d", anbz.m});
        }
        if (iOrdinal == 3) {
            return new aljm();
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
        return aihn.getParserForClass(aljm.class);
    }
}
