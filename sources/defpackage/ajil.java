package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajil extends aihn implements aiis {
    public static final ajil a;
    public int b;
    public ajwo c;
    public int d;
    private alay e;
    private alay f;
    private byte g = 2;

    static {
        ajil ajilVar = new ajil();
        a = ajilVar;
        aihn.registerDefaultInstance(ajil.class, ajilVar);
    }

    private ajil() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\b᠌\u0007", new Object[]{"b", "e", "f", "c", "d", ajhd.f});
            case 3:
                return new ajil();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajil.class);
            default:
                return null;
        }
    }
}
