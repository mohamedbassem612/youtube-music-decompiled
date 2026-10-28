package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqbw extends aihn implements aiis {
    public static final aqbw a;
    private int b;
    private ajwo c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private apji h;
    private apji i;
    private apji j;
    private apji k;
    private byte l = 2;

    static {
        aqbw aqbwVar = new aqbw();
        a = aqbwVar;
        aihn.registerDefaultInstance(aqbw.class, aqbwVar);
    }

    private aqbw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0004\u000f\t\u0000\u0000\t\u0004ᐉ\t\u0005ᐉ\n\u0006ᐉ\f\bᐉ\u000b\tᐉ\r\nᐉ\u000e\u000bᐉ\b\rᐉ\u000f\u000fᐉ\u0006", new Object[]{"b", "e", "f", "h", "g", "i", "j", "d", "k", "c"});
            case 3:
                return new aqbw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqbw.class);
            default:
                return null;
        }
    }
}
