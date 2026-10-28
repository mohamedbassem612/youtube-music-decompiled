package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aloh extends aihn implements aiis {
    public static final aloh a;
    public alop b;
    private int c;
    private alej d;
    private ajvu e;
    private alik f;
    private byte g = 2;

    static {
        aloh alohVar = new aloh();
        a = alohVar;
        aihn.registerDefaultInstance(aloh.class, alohVar);
    }

    private aloh() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"c", "b", "d", "e", "f"});
            case 3:
                return new aloh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aloh.class);
            default:
                return null;
        }
    }
}
