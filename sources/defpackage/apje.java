package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apje extends aihn implements aiis {
    public static final apje a;
    public static final aihl b;
    public String c = "";
    public int d;
    private int e;

    static {
        apje apjeVar = new apje();
        a = apjeVar;
        aihn.registerDefaultInstance(apje.class, apjeVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apjeVar, apjeVar, null, 99968691, aika.MESSAGE, apje.class);
    }

    private apje() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"e", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new apje();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(apje.class);
    }
}
