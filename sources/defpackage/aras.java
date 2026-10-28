package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aras extends aihn implements aiis {
    public static final aras a;
    public static final aihl b;
    public int c;
    public akiu d;
    public boolean h;
    private int j;
    public String e = "";
    public String f = "";
    public String g = "";
    public String i = "";

    static {
        aras arasVar = new aras();
        a = arasVar;
        aihn.registerDefaultInstance(aras.class, arasVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, arasVar, arasVar, null, 1380, aika.MESSAGE, aras.class);
    }

    private aras() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဈ\u0006", new Object[]{"j", "c", alip.l, "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new aras();
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
        return aihn.getParserForClass(aras.class);
    }
}
