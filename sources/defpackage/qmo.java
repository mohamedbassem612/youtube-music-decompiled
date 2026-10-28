package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qmo extends aihn implements aiis {
    public static final qmo a;
    public String b = "";
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    private int h;

    static {
        qmo qmoVar = new qmo();
        a = qmoVar;
        aihn.registerDefaultInstance(qmo.class, qmoVar);
    }

    private qmo() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"h", "b", "c", "d", fxi.o, "e", "g", "f"});
        }
        if (iOrdinal == 3) {
            return new qmo();
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
        return aihn.getParserForClass(qmo.class);
    }
}
