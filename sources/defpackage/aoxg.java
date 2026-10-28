package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoxg extends aihn implements aiis {
    public static final aoxg a;
    public int b;
    public String c = "";
    public argn d;
    public int e;
    public float f;
    public int g;

    static {
        aoxg aoxgVar = new aoxg();
        a = aoxgVar;
        aihn.registerDefaultInstance(aoxg.class, aoxgVar);
    }

    private aoxg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ခ\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", aotj.f, "f", "g"});
        }
        if (iOrdinal == 3) {
            return new aoxg();
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
        return aihn.getParserForClass(aoxg.class);
    }
}
