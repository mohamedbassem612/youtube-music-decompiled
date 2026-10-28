package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqym extends aihn implements aiis {
    public static final aqym a;
    private int b;
    private alay c;
    private alay d;
    private ajng e;
    private byte f = 2;

    static {
        aqym aqymVar = new aqym();
        a = aqymVar;
        aihn.registerDefaultInstance(aqym.class, aqymVar);
    }

    private aqym() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0003\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aqym();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqym.class);
            default:
                return null;
        }
    }
}
