package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aphb extends aihn implements aiis {
    public static final aphb a;
    public static final aihl b;
    public int c;
    private int d;

    static {
        aphb aphbVar = new aphb();
        a = aphbVar;
        aihn.registerDefaultInstance(aphb.class, aphbVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aphbVar, aphbVar, null, 177327295, aika.MESSAGE, aphb.class);
    }

    private aphb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "c", apep.n});
        }
        if (iOrdinal == 3) {
            return new aphb();
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
        return aihn.getParserForClass(aphb.class);
    }
}
