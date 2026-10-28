package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apad extends aihn implements aiis {
    public static final apad a;
    private int b;
    private apji c;
    private apji d;
    private ajwo e;
    private ajwo f;
    private alay g;
    private byte h = 2;

    static {
        apad apadVar = new apad();
        a = apadVar;
        aihn.registerDefaultInstance(apad.class, apadVar);
    }

    private apad() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0006\u0006ᐉ\u0007\bᐉ\u0004", new Object[]{"b", "c", "d", "f", "g", "e"});
            case 3:
                return new apad();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apad.class);
            default:
                return null;
        }
    }
}
