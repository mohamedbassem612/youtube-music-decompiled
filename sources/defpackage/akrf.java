package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akrf extends aihn implements aiis {
    public static final akrf a;
    public alay c;
    public aqmh d;
    private int e;
    private byte f = 2;
    public String b = "";

    static {
        akrf akrfVar = new akrf();
        a = akrfVar;
        aihn.registerDefaultInstance(akrf.class, akrfVar);
    }

    private akrf() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"e", "b", "c", "d"});
            case 3:
                return new akrf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akrf.class);
            default:
                return null;
        }
    }
}
