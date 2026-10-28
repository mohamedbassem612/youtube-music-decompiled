package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class attx extends aihn implements aiis {
    public static final attx a;
    public int b;
    public String c = "";
    public aiie d = emptyProtobufList();

    static {
        attx attxVar = new attx();
        a = attxVar;
        aihn.registerDefaultInstance(attx.class, attxVar);
    }

    private attx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new attx();
        }
        if (iOrdinal == 4) {
            return new jrq((char[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(attx.class);
        }
        return null;
    }
}
