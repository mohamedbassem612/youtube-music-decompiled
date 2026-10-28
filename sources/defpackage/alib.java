package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alib extends aihn implements aiis {
    public static final alib a;
    public int b;
    public alja d;
    public ajwo e;
    public ajwo f;
    public int g;
    private byte h = 2;
    public String c = "";

    static {
        alib alibVar = new alib();
        a = alibVar;
        aihn.registerDefaultInstance(alib.class, alibVar);
    }

    private alib() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0003\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\b᠌\u0005", new Object[]{"b", "c", "d", "e", "f", "g", apdr.b});
            case 3:
                return new alib();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alib.class);
            default:
                return null;
        }
    }
}
