package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqvg extends aihn implements aiis {
    public static final aqvg a;
    private int b;
    private alay c;
    private alay d;
    private ajkc e;
    private apji f;
    private apji g;
    private byte h = 2;

    static {
        aqvg aqvgVar = new aqvg();
        a = aqvgVar;
        aihn.registerDefaultInstance(aqvg.class, aqvgVar);
    }

    private aqvg() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\u0010\u0005\u0000\u0000\u0005\u0003ᐉ\u0004\u0004ᐉ\u0005\u000bᐉ\b\fᐉ\t\u0010ᐉ\u0006", new Object[]{"b", "c", "d", "f", "g", "e"});
            case 3:
                return new aqvg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqvg.class);
            default:
                return null;
        }
    }
}
