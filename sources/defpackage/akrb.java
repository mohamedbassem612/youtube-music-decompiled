package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akrb extends aihn implements aiis {
    public static final akrb a;
    public int b;
    public String c = "";
    public String d = "";
    public aiie e = emptyProtobufList();
    public akra f;

    static {
        akrb akrbVar = new akrb();
        a = akrbVar;
        aihn.registerDefaultInstance(akrb.class, akrbVar);
    }

    private akrb() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0007ဉ\u0005", new Object[]{"b", "c", "d", "e", ajfi.class, "f"});
        }
        if (iOrdinal == 3) {
            return new akrb();
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
        return aihn.getParserForClass(akrb.class);
    }
}
