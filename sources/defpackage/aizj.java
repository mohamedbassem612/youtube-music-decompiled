package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aizj extends aihn implements aiis {
    public static final aizj a;
    public int b;
    public String c = "";
    public boolean d;
    public aizm e;
    public aiie f;
    public aiie g;

    static {
        aizj aizjVar = new aizj();
        a = aizjVar;
        aihn.registerDefaultInstance(aizj.class, aizjVar);
    }

    private aizj() {
        emptyIntList();
        emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0005\u001b\u0006\u001b\u0007ဉ\u0002", new Object[]{"b", "c", "d", "f", aizm.class, "g", aizm.class, "e"});
        }
        if (iOrdinal == 3) {
            return new aizj();
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
        return aihn.getParserForClass(aizj.class);
    }
}
