package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arms extends aihn implements aiis {
    public static final arms a;
    public int b;
    public armt g;
    public int h;
    public arlz i;
    public aigj c = aigj.d;
    public aiie d = emptyProtobufList();
    public String e = "";
    public aiie f = emptyProtobufList();
    public aiie j = emptyProtobufList();

    static {
        arms armsVar = new arms();
        a = armsVar;
        aihn.registerDefaultInstance(arms.class, armsVar);
    }

    private arms() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ည\u0000\u0002\u001b\u0003ဈ\u0001\u0004\u001b\u0005ဉ\u0002\u0006င\u0003\u0007ဉ\u0004\b\u001a", new Object[]{"b", "c", "d", armi.class, "e", "f", armx.class, "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new arms();
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
        return aihn.getParserForClass(arms.class);
    }
}
