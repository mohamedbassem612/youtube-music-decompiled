package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akzj extends aihn implements aiis {
    public static final akzj a;
    public int b;
    public String c = "";
    public akzl d;
    public akzk e;
    public int f;
    public int g;

    static {
        akzj akzjVar = new akzj();
        a = akzjVar;
        aihn.registerDefaultInstance(akzj.class, akzjVar);
    }

    private akzj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", akvb.m, "g"});
        }
        if (iOrdinal == 3) {
            return new akzj();
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
        return aihn.getParserForClass(akzj.class);
    }
}
