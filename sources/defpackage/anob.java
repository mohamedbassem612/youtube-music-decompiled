package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anob extends aihn implements aiis {
    public static final anob a;
    public int b;
    public apji c;
    public boolean d;
    public alay e;
    public anoa f;
    private byte g = 2;

    static {
        anob anobVar = new anob();
        a = anobVar;
        aihn.registerDefaultInstance(anob.class, anobVar);
    }

    private anob() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0002\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new anob();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anob.class);
            default:
                return null;
        }
    }
}
