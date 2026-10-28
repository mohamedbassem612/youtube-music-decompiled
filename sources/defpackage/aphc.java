package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aphc extends aihn implements aiis {
    public static final aphc a;
    public static final aihl b;

    static {
        aphc aphcVar = new aphc();
        a = aphcVar;
        aihn.registerDefaultInstance(aphc.class, aphcVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aphcVar, aphcVar, null, 191373512, aika.MESSAGE, aphc.class);
    }

    private aphc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aphc();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aphc.class);
        }
        return null;
    }
}
