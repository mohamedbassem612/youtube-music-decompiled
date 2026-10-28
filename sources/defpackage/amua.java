package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amua extends aihn implements aiis {
    public static final amua a;
    public static final aihl b;
    public Object d;
    public int e;
    private int g;
    public int c = 0;
    public String f = "";

    static {
        amua amuaVar = new amua();
        a = amuaVar;
        aihn.registerDefaultInstance(amua.class, amuaVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amuaVar, amuaVar, null, 427587276, aika.MESSAGE, amua.class);
    }

    private amua() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001=\u0000\u0002᠌\u0000\u0003ဈ\u0001", new Object[]{"d", "c", "g", "e", arke.j, "f"});
        }
        if (iOrdinal == 3) {
            return new amua();
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
        return aihn.getParserForClass(amua.class);
    }
}
