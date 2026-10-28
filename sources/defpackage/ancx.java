package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ancx extends aihn implements aiis {
    public static final ancx a;
    public int b;
    public ancz c;
    public ancz e;
    public String d = "";
    public aiie f = emptyProtobufList();

    static {
        ancx ancxVar = new ancx();
        a = ancxVar;
        aihn.registerDefaultInstance(ancx.class, ancxVar);
    }

    private ancx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", ancw.class});
        }
        if (iOrdinal == 3) {
            return new ancx();
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
        return aihn.getParserForClass(ancx.class);
    }
}
