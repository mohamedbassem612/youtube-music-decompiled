package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apks extends aihn implements aiis {
    public static final apks a;
    public int b;
    public Object d;
    public ajnv f;
    public int c = 0;
    public String e = "";

    static {
        apks apksVar = new apks();
        a = apksVar;
        aihn.registerDefaultInstance(apks.class, apksVar);
    }

    private apks() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003ဉ\u0001\u0004<\u0000\u0005:\u0000", new Object[]{"d", "c", "b", "e", ajeg.class, "f", atxp.class});
        }
        if (iOrdinal == 3) {
            return new apks();
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
        return aihn.getParserForClass(apks.class);
    }
}
