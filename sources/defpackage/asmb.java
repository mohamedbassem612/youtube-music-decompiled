package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asmb extends aihn implements aiis {
    public static final asmb a;
    public static final aihl b;

    static {
        asmb asmbVar = new asmb();
        a = asmbVar;
        aihn.registerDefaultInstance(asmb.class, asmbVar);
        b = aihn.newSingularGeneratedExtension(asow.a, asmbVar, asmbVar, null, 158796327, aika.MESSAGE, asmb.class);
    }

    private asmb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new asmb();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(asmb.class);
        }
        return null;
    }
}
