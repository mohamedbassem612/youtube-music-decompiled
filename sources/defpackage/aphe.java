package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aphe extends aihn implements aiis {
    public static final aphe a;
    public static final aihl b;
    public int c;
    public boolean d;

    static {
        aphe apheVar = new aphe();
        a = apheVar;
        aihn.registerDefaultInstance(aphe.class, apheVar);
        b = aihn.newSingularGeneratedExtension(aofg.b, apheVar, apheVar, null, 398807183, aika.MESSAGE, aphe.class);
    }

    private aphe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new aphe();
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
        return aihn.getParserForClass(aphe.class);
    }
}
