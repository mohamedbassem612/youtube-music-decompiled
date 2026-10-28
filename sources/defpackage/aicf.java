package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aicf extends aihn implements aiis {
    public static final aicf a;
    public int b;
    public Object d;
    public Object f;
    public aiff i;
    public aifv j;
    public int c = 0;
    public int e = 0;
    public String g = "";
    public String h = "";

    static {
        aicf aicfVar = new aicf();
        a = aicfVar;
        aihn.registerDefaultInstance(aicf.class, aicfVar);
    }

    private aicf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0002\u0001\u0002\n\t\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004;\u0000\u0005ဉ\u0003\u0006ဉ\u0004\u0007\u083f\u0000\b;\u0001\t<\u0001\n<\u0001", new Object[]{"d", "c", "f", "e", "b", "g", "h", "i", "j", ahzf.s, aial.class, aigu.class});
        }
        if (iOrdinal == 3) {
            return new aicf();
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
        return aihn.getParserForClass(aicf.class);
    }
}
