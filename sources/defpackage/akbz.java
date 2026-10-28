package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akbz extends aihn implements aiis {
    public static final akbz a;
    public int b;
    public long c;

    static {
        akbz akbzVar = new akbz();
        a = akbzVar;
        aihn.registerDefaultInstance(akbz.class, akbzVar);
    }

    private akbz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new akbz();
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
        return aihn.getParserForClass(akbz.class);
    }
}
