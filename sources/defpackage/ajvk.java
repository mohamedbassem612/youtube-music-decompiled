package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajvk extends aihn implements aiis {
    public static final ajvk a;
    public String b = "";
    public int c;
    public int d;
    public int e;
    private int f;

    static {
        ajvk ajvkVar = new ajvk();
        a = ajvkVar;
        aihn.registerDefaultInstance(ajvk.class, ajvkVar);
    }

    private ajvk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"f", "b", "c", alip.m, "d", aiwd.r, "e", aram.b});
        }
        if (iOrdinal == 3) {
            return new ajvk();
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
        return aihn.getParserForClass(ajvk.class);
    }
}
