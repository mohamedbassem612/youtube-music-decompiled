package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class anlg extends aihn implements aiis {
    public static final anlg a;
    public static final aihl b;
    public int c;
    public String d = "";

    static {
        anlg anlgVar = new anlg();
        a = anlgVar;
        aihn.registerDefaultInstance(anlg.class, anlgVar);
        b = aihn.newSingularGeneratedExtension(almb.a, anlgVar, anlgVar, null, 231809697, aika.MESSAGE, anlg.class);
    }

    private anlg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new anlg();
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
        return aihn.getParserForClass(anlg.class);
    }
}
