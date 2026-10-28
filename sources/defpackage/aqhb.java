package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class aqhb extends aihn implements aiis {
    public static final aqhb a;
    private int b;
    private alay c;
    private aqhd d;
    private alay e;
    private aqhc f;
    private byte g = 2;

    static {
        aqhb aqhbVar = new aqhb();
        a = aqhbVar;
        aihn.registerDefaultInstance(aqhb.class, aqhbVar);
    }

    private aqhb() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqhb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqhb.class);
            default:
                return null;
        }
    }
}
