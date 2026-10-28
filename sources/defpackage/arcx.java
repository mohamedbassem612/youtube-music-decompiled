package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arcx extends aihn implements aiis {
    public static final arcx a;
    private int b;
    private alay c;
    private askp d;
    private alay e;
    private alay f;
    private alay g;
    private apji h;
    private ajwo i;
    private ajkc j;
    private byte k = 2;

    static {
        arcx arcxVar = new arcx();
        a = arcxVar;
        aihn.registerDefaultInstance(arcx.class, arcxVar);
    }

    private arcx() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0011\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ᐉ\u0005\u0006ᐉ\b\nᐉ\u0001\u0010ᐉ\u0006\u0011ᐉ\u000b", new Object[]{"b", "c", "e", "f", "g", "i", "d", "h", "j"});
            case 3:
                return new arcx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arcx.class);
            default:
                return null;
        }
    }
}
