package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asfa extends aihn implements aiis {
    public static final asfa a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";

    static {
        asfa asfaVar = new asfa();
        a = asfaVar;
        aihn.registerDefaultInstance(asfa.class, asfaVar);
    }

    private asfa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0004\u000e\u000b\u0000\u0000\u0000\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fဈ\n\rဈ\u000b\u000eဈ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (iOrdinal == 3) {
            return new asfa();
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
        return aihn.getParserForClass(asfa.class);
    }
}
