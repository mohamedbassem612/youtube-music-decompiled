package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aivm extends aihn implements aiis {
    public static final aivm a;
    private aiip b = aiip.a;

    static {
        aivm aivmVar = new aivm();
        a = aivmVar;
        aihn.registerDefaultInstance(aivm.class, aivmVar);
    }

    private aivm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ahud(aika.STRING, "", aika.MESSAGE, aivl.a)});
        }
        if (iOrdinal == 3) {
            return new aivm();
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
        return aihn.getParserForClass(aivm.class);
    }
}
