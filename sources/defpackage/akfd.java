package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akfd extends aihn implements aiis {
    public static final akfd a;
    private int b;
    private akfj c;
    private akff d;
    private akfk e;
    private akfh f;
    private akew g;
    private akfg h;
    private akfi i;
    private byte j = 2;

    static {
        akfd akfdVar = new akfd();
        a = akfdVar;
        aihn.registerDefaultInstance(akfd.class, akfdVar);
    }

    private akfd() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\ufbd0⏝\uf6dd搜\u0007\u0000\u0000\u0007\ufbd0⏝ᐉ\u0005\uf354␆ᐉ\u0000\uf379␆ᐉ\u0002\uf2ec⻊ᐉ\u0006\ued84䃲ᐉ\u0001\ue1ea拿ᐉ\u0003\uf6dd搜ᐉ\u0004", new Object[]{"b", "h", "c", "e", "i", "d", "f", "g"});
            case 3:
                return new akfd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akfd.class);
            default:
                return null;
        }
    }
}
