package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqvw extends aihn implements aiis {
    public static final aqvw a;
    private int b;
    private ajkc c;
    private ajkc d;
    private ajkc e;
    private ajkc f;
    private ajkc g;
    private byte h = 2;

    static {
        aqvw aqvwVar = new aqvw();
        a = aqvwVar;
        aihn.registerDefaultInstance(aqvw.class, aqvwVar);
    }

    private aqvw() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0016\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0016ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aqvw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqvw.class);
            default:
                return null;
        }
    }
}
