package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqpj extends aihn implements aiis {
    public static final aqpj a;
    public int b;
    public aigu c;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        aqpj aqpjVar = new aqpj();
        a = aqpjVar;
        aihn.registerDefaultInstance(aqpj.class, aqpjVar);
    }

    private aqpj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aqpj();
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
        return aihn.getParserForClass(aqpj.class);
    }
}
