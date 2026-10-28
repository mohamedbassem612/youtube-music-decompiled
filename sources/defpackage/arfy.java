package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arfy extends aihn implements aiis {
    public static final arfy a;
    public long b;
    private int c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private byte j = 2;

    static {
        arfy arfyVar = new arfy();
        a = arfyVar;
        aihn.registerDefaultInstance(arfy.class, arfyVar);
    }

    private arfy() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0003\u0004ᐉ\u0001\u0005ᐉ\u0002\u0007ᐉ\u0006\bᐉ\u0007\tဂ\b", new Object[]{"c", "d", "g", "e", "f", "h", "i", "b"});
            case 3:
                return new arfy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arfy.class);
            default:
                return null;
        }
    }
}
