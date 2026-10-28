package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akqn extends aihn implements aiis {
    public static final akqn a;
    public int b;
    public int c;
    public aqlb d;

    static {
        akqn akqnVar = new akqn();
        a = akqnVar;
        aihn.registerDefaultInstance(akqn.class, akqnVar);
    }

    private akqn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"b", "c", arfr.h, "d"});
        }
        if (iOrdinal == 3) {
            return new akqn();
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
        return aihn.getParserForClass(akqn.class);
    }
}
