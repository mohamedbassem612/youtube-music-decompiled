package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asmd extends aihn implements aiis {
    public static final asmd a;
    public static final aihl b;
    public int c;
    public String d = "";
    public String e = "";
    public asmc f;

    static {
        asmd asmdVar = new asmd();
        a = asmdVar;
        aihn.registerDefaultInstance(asmd.class, asmdVar);
        b = aihn.newSingularGeneratedExtension(asod.a, asmdVar, asmdVar, null, 525000015, aika.MESSAGE, asmd.class);
    }

    private asmd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new asmd();
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
        return aihn.getParserForClass(asmd.class);
    }
}
