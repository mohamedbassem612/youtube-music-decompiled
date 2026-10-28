package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arim extends aihn implements aiis {
    public static final arim a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";

    static {
        arim arimVar = new arim();
        a = arimVar;
        aihn.registerDefaultInstance(arim.class, arimVar);
    }

    private arim() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", arfr.p, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new arim();
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
        return aihn.getParserForClass(arim.class);
    }
}
