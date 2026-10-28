package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apwz extends aihn implements aiis {
    public static final apwz a;
    public static final aihl b;

    static {
        apwz apwzVar = new apwz();
        a = apwzVar;
        aihn.registerDefaultInstance(apwz.class, apwzVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apwzVar, apwzVar, null, 1650, aika.MESSAGE, apwz.class);
    }

    private apwz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new apwz();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(apwz.class);
        }
        return null;
    }
}
