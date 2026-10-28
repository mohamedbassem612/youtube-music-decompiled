package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asjk extends aihn implements aiis {
    public static final asjk a;
    public int d;
    private int f;
    public String b = "";
    public String c = "";
    public aiie e = emptyProtobufList();

    static {
        asjk asjkVar = new asjk();
        a = asjkVar;
        aihn.registerDefaultInstance(asjk.class, asjkVar);
    }

    private asjk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004\u001a", new Object[]{"f", "b", "c", "d", aqvi.e, "e"});
        }
        if (iOrdinal == 3) {
            return new asjk();
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
        return aihn.getParserForClass(asjk.class);
    }
}
