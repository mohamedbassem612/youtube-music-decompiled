package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arks extends aihn implements aiis {
    public static final arks a;
    private int b;
    private alay c;
    private alay d;
    private apji e;
    private apji f;
    private alay g;
    private apji h;
    private byte i = 2;

    static {
        arks arksVar = new arks();
        a = arksVar;
        aihn.registerDefaultInstance(arks.class, arksVar);
    }

    private arks() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "h", "g"});
            case 3:
                return new arks();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arks.class);
            default:
                return null;
        }
    }
}
