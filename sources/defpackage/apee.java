package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apee extends aihn implements aiis {
    public static final apee a;
    public static final aihl b;

    static {
        apee apeeVar = new apee();
        a = apeeVar;
        aihn.registerDefaultInstance(apee.class, apeeVar);
        b = aihn.newSingularGeneratedExtension(apeg.a, apeeVar, apeeVar, null, 400250658, aika.MESSAGE, apee.class);
    }

    private apee() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new apee();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(apee.class);
        }
        return null;
    }
}
