package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aiph extends aihn implements aiis {
    public static final aiph a;
    public int b;
    public int g;
    public String c = "";
    public String d = "";
    public aiie e = emptyProtobufList();
    public String f = "";
    public aigj h = aigj.d;

    static {
        aiph aiphVar = new aiph();
        a = aiphVar;
        aihn.registerDefaultInstance(aiph.class, aiphVar);
    }

    private aiph() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ည\u0004\u0006\u001a", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
        }
        if (iOrdinal == 3) {
            return new aiph();
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
        return aihn.getParserForClass(aiph.class);
    }
}
