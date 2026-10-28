package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alfw extends aihn implements aiis {
    public static final alfw a;
    private int b;
    private askp c;
    private apji d;
    private apji e;
    private apji f;
    private apji g;
    private byte h = 2;

    static {
        alfw alfwVar = new alfw();
        a = alfwVar;
        aihn.registerDefaultInstance(alfw.class, alfwVar);
    }

    private alfw() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\r\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0004ᐉ\u0002\u0007ᐉ\u0006\bᐉ\u0007\rᐉ\f", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new alfw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alfw.class);
            default:
                return null;
        }
    }
}
