package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajgu extends aihn implements aiis {
    public static final ajgu a;
    public int b;
    public Object d;
    public ajgt f;
    public int g;
    public int c = 0;
    public String e = "";

    static {
        ajgu ajguVar = new ajgu();
        a = ajguVar;
        aihn.registerDefaultInstance(ajgu.class, ajguVar);
    }

    private ajgu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002;\u0000\u0003;\u0000\u0004=\u0000\u0005᠌\u0004\u0007ဉ\u0001", new Object[]{"d", "c", "b", "e", "g", aixp.u, "f"});
        }
        if (iOrdinal == 3) {
            return new ajgu();
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
        return aihn.getParserForClass(ajgu.class);
    }
}
