package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akfs extends aihn implements aiis {
    public static final akfs a;
    public int b;
    public alay c;
    public alay d;
    public ajwo e;
    private byte g = 2;
    public aigj f = aigj.d;

    static {
        akfs akfsVar = new akfs();
        a = akfsVar;
        aihn.registerDefaultInstance(akfs.class, akfsVar);
    }

    private akfs() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ည\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new akfs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akfs.class);
            default:
                return null;
        }
    }
}
