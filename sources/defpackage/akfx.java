package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akfx extends aihn implements aiis {
    public static final akfx a;
    public int b;
    public alay c;
    public alay d;
    public ajwo e;
    public alay f;
    public alay g;
    public ajwo h;
    private byte j = 2;
    public aigj i = aigj.d;

    static {
        akfx akfxVar = new akfx();
        a = akfxVar;
        aihn.registerDefaultInstance(akfx.class, akfxVar);
    }

    private akfx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bည\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new akfx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akfx.class);
            default:
                return null;
        }
    }
}
