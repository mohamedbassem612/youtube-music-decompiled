package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aobz extends aihn implements aiis {
    public static final aobz a;
    public int b;
    private alay e;
    private byte f = 2;
    public String c = "";
    public aigj d = aigj.d;

    static {
        aobz aobzVar = new aobz();
        a = aobzVar;
        aihn.registerDefaultInstance(aobz.class, aobzVar);
    }

    private aobz() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ည\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aobz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aobz.class);
            default:
                return null;
        }
    }
}
