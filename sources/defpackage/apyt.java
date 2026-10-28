package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apyt extends aihn implements aiis {
    public static final apyt a;
    public static final aihl b;

    static {
        apyt apytVar = new apyt();
        a = apytVar;
        aihn.registerDefaultInstance(apyt.class, apytVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apytVar, apytVar, null, 240885378, aika.MESSAGE, apyt.class);
    }

    private apyt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new apyt();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(apyt.class);
        }
        return null;
    }
}
