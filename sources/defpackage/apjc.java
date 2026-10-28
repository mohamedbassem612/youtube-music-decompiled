package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apjc extends aihn implements aiis {
    public static final apjc a;
    public static final aihl b;

    static {
        apjc apjcVar = new apjc();
        a = apjcVar;
        aihn.registerDefaultInstance(apjc.class, apjcVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apjcVar, apjcVar, null, 1656, aika.MESSAGE, apjc.class);
    }

    private apjc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new apjc();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(apjc.class);
        }
        return null;
    }
}
