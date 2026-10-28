package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anpj extends aihn implements aiis {
    public static final anpj a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private apji f;
    private apji g;
    private apji h;
    private apji i;
    private apji j;
    private byte k = 2;

    static {
        anpj anpjVar = new anpj();
        a = anpjVar;
        aihn.registerDefaultInstance(anpj.class, anpjVar);
    }

    private anpj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\nᐉ\u0007", new Object[]{"b", "c", "e", "d", "f", "g", "h", "i", "j"});
            case 3:
                return new anpj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anpj.class);
            default:
                return null;
        }
    }
}
