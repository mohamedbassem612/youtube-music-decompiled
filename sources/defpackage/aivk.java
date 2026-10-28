package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aivk extends aihn implements aiis {
    public static final aivk a;
    public int b;
    public int d;
    public boolean f;
    public int h;
    public int i;
    public String c = "";
    public aiie e = emptyProtobufList();
    public aigj g = aigj.d;

    static {
        aivk aivkVar = new aivk();
        a = aivkVar;
        aihn.registerDefaultInstance(aivk.class, aivkVar);
    }

    private aivk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001b\u0004ဇ\u0002\u0005ည\u0003\u0006᠌\u0004\u0007င\u0005", new Object[]{"b", "c", "d", "e", amun.class, "f", "g", "h", ajhd.b, "i"});
        }
        if (iOrdinal == 3) {
            return new aivk();
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
        return aihn.getParserForClass(aivk.class);
    }
}
