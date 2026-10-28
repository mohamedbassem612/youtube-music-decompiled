package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qks extends aihn implements aiis {
    public static final qks a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        qks qksVar = new qks();
        a = qksVar;
        aihn.registerDefaultInstance(qks.class, qksVar);
    }

    private qks() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (iOrdinal == 3) {
            return new qks();
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
        return aihn.getParserForClass(qks.class);
    }
}
