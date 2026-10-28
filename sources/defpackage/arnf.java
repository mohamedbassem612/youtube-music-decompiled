package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arnf extends aihn implements aiis {
    public static final arnf a;
    public int b;
    public int c;
    public long d;
    public int f;
    public int g;
    public long h;
    public int i;
    public String e = "";
    public String j = "";

    static {
        arnf arnfVar = new arnf();
        a = arnfVar;
        aihn.registerDefaultInstance(arnf.class, arnfVar);
    }

    private arnf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0004ဈ\u0003\u0005င\u0004\u0006ဂ\u0006\b᠌\b\tဈ\t\nင\u0005", new Object[]{"b", "c", arke.f, "d", "e", "f", "h", "i", arke.g, "j", "g"});
        }
        if (iOrdinal == 3) {
            return new arnf();
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
        return aihn.getParserForClass(arnf.class);
    }
}
