package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apwx extends aihn implements aiis {
    public static final apwx a;
    public static final aihl b;

    static {
        apwx apwxVar = new apwx();
        a = apwxVar;
        aihn.registerDefaultInstance(apwx.class, apwxVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apwxVar, apwxVar, null, 1582, aika.MESSAGE, apwx.class);
    }

    private apwx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new apwx();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(apwx.class);
        }
        return null;
    }
}
