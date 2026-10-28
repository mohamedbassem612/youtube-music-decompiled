package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajfc extends aihn implements aiis {
    public static final ajfc a;
    public int b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        ajfc ajfcVar = new ajfc();
        a = ajfcVar;
        aihn.registerDefaultInstance(ajfc.class, ajfcVar);
    }

    private ajfc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0003\u0007\u0003\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0007᠌\u0004", new Object[]{"b", "c", "d", "e", apdr.o});
        }
        if (iOrdinal == 3) {
            return new ajfc();
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
        return aihn.getParserForClass(ajfc.class);
    }
}
