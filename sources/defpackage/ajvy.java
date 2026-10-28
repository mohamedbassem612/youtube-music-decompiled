package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajvy extends aihn implements aiis {
    public static final ajvy a;
    public int b;
    public apji c;
    public alay d;
    private alay e;
    private alay f;
    private byte g = 2;

    static {
        ajvy ajvyVar = new ajvy();
        a = ajvyVar;
        aihn.registerDefaultInstance(ajvy.class, ajvyVar);
    }

    private ajvy() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0004\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0000\bᐉ\u0004", new Object[]{"b", "d", "e", "c", "f"});
            case 3:
                return new ajvy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajvy.class);
            default:
                return null;
        }
    }
}
