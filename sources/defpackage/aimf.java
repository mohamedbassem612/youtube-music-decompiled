package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aimf extends aihn implements aiis {
    public static final aimf a;
    public aiip b = aiip.a;

    static {
        aimf aimfVar = new aimf();
        a = aimfVar;
        aihn.registerDefaultInstance(aimf.class, aimfVar);
    }

    private aimf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ahud(aika.STRING, "", aika.MESSAGE, ailx.a)});
        }
        if (iOrdinal == 3) {
            return new aimf();
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
        return aihn.getParserForClass(aimf.class);
    }
}
