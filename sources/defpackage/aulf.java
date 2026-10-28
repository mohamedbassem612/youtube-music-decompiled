package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aulf extends aihn implements aiis {
    public static final aulf a;
    public String b = "";
    public String c = "";
    public aiie d = emptyProtobufList();
    private int e;

    static {
        aulf aulfVar = new aulf();
        a = aulfVar;
        aihn.registerDefaultInstance(aulf.class, aulfVar);
    }

    private aulf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"e", "b", "c", "d", aule.class});
        }
        if (iOrdinal == 3) {
            return new aulf();
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
        return aihn.getParserForClass(aulf.class);
    }
}
