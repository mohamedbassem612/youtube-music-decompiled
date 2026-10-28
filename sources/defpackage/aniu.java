package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aniu extends aihn implements aiis {
    public static final aniu a;
    public int b;
    public String c = "";
    public long d;
    public String e;

    static {
        aniu aniuVar = new aniu();
        a = aniuVar;
        aihn.registerDefaultInstance(aniu.class, aniuVar);
    }

    private aniu() {
        emptyProtobufList();
        this.e = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u000115\u0003\u0000\u0000\u00001ဈ\u00003ဂ\u00015ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aniu();
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
        return aihn.getParserForClass(aniu.class);
    }
}
