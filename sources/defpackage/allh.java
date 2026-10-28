package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class allh extends aihn implements aiis {
    public static final allh a;
    public int b;
    public String c;
    public String d;
    public boolean e;

    static {
        allh allhVar = new allh();
        a = allhVar;
        aihn.registerDefaultInstance(allh.class, allhVar);
    }

    private allh() {
        emptyProtobufList();
        this.c = "";
        this.d = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new allh();
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
        return aihn.getParserForClass(allh.class);
    }
}
