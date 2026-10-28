package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amvn extends aihn implements aiis {
    public static final amvn a;
    public static final aihl b;

    static {
        amvn amvnVar = new amvn();
        a = amvnVar;
        aihn.registerDefaultInstance(amvn.class, amvnVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amvnVar, amvnVar, null, 100256872, aika.MESSAGE, amvn.class);
    }

    private amvn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new amvn();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(amvn.class);
        }
        return null;
    }
}
