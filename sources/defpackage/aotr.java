package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aotr extends aihn implements aiis {
    public static final aotr a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public aiie f = emptyProtobufList();
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";

    static {
        aotr aotrVar = new aotr();
        a = aotrVar;
        aihn.registerDefaultInstance(aotr.class, aotrVar);
    }

    private aotr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new aotr();
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
        return aihn.getParserForClass(aotr.class);
    }
}
