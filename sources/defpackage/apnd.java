package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class apnd extends aihn implements aiis {
    public static final apnd a;
    public static final aihl b;
    public static final aihl c;

    static {
        apnd apndVar = new apnd();
        a = apndVar;
        aihn.registerDefaultInstance(apnd.class, apndVar);
        apng apngVar = apng.a;
        alxu alxuVar = alxu.a;
        b = aihn.newSingularGeneratedExtension(apngVar, alxuVar, alxuVar, null, 114131258, aika.MESSAGE, alxu.class);
        c = aihn.newSingularGeneratedExtension(apng.a, "", null, null, 216881973, aika.STRING, String.class);
    }

    private apnd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new apnd();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(apnd.class);
        }
        return null;
    }
}
