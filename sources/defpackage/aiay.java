package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiay extends aihn implements aiis {
    public static final aiay a;
    public int b;
    public aica d;
    public aibw f;
    public int g;
    public String c = "";
    public aiie e = emptyProtobufList();
    public String h = "";
    public String i = "";

    static {
        aiay aiayVar = new aiay();
        a = aiayVar;
        aihn.registerDefaultInstance(aiay.class, aiayVar);
    }

    private aiay() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဉ\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဉ\u0001\u0007ဈ\u0005", new Object[]{"b", "c", "e", "f", "g", "h", "d", "i"});
        }
        if (iOrdinal == 3) {
            return new aiay();
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
        return aihn.getParserForClass(aiay.class);
    }
}
