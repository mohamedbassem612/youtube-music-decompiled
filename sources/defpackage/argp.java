package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class argp extends aihn implements aiis {
    public static final argp a;
    private aiip b = aiip.a;

    static {
        argp argpVar = new argp();
        a = argpVar;
        aihn.registerDefaultInstance(argp.class, argpVar);
    }

    private argp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0001\u0000\u0000\u00042", new Object[]{"b", new ahud(aika.STRING, "", aika.MESSAGE, argo.a)});
        }
        if (iOrdinal == 3) {
            return new argp();
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
        return aihn.getParserForClass(argp.class);
    }
}
