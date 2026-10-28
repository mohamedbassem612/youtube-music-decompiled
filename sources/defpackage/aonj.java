package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aonj extends aihn implements aiis {
    public static final aonj a;
    public static final aihl b;

    static {
        aonj aonjVar = new aonj();
        a = aonjVar;
        aihn.registerDefaultInstance(aonj.class, aonjVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aonjVar, aonjVar, null, 98444775, aika.MESSAGE, aonj.class);
    }

    private aonj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aonj();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aonj.class);
        }
        return null;
    }
}
