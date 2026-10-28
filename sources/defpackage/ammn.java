package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ammn extends aihn implements aiis {
    public static final ammn a;
    public static final aihl b;

    static {
        ammn ammnVar = new ammn();
        a = ammnVar;
        aihn.registerDefaultInstance(ammn.class, ammnVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ammnVar, ammnVar, null, 430167970, aika.MESSAGE, ammn.class);
    }

    private ammn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ammn();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(ammn.class);
        }
        return null;
    }
}
