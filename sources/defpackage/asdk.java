package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asdk extends aihn implements aiis {
    public static final asdk a;
    public int b;
    public Object d;
    public int f;
    public int g;
    public float h;
    public int i;
    public boolean j;
    public int c = 0;
    public String e = "";

    static {
        asdk asdkVar = new asdk();
        a = asdkVar;
        aihn.registerDefaultInstance(asdk.class, asdkVar);
    }

    private asdk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0001\u0001\u0001\t\b\u0000\u0000\u0000\u0001;\u0000\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002\u0006ဇ\u0006\u0007=\u0000\bခ\u0003\tင\u0004", new Object[]{"d", "c", "b", "e", "f", "g", "j", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new asdk();
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
        return aihn.getParserForClass(asdk.class);
    }
}
