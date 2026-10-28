package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqye extends aihn implements aiis {
    public static final aqye a;
    private int b;
    private alay c;
    private alay d;
    private aoam e;
    private byte f = 2;

    static {
        aqye aqyeVar = new aqye();
        a = aqyeVar;
        aihn.registerDefaultInstance(aqye.class, aqyeVar);
    }

    private aqye() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\bᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aqye();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqye.class);
            default:
                return null;
        }
    }
}
