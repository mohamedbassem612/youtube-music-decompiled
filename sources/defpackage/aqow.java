package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqow extends aihn implements aiis {
    public static final aqow a;
    private int b;
    private int c;
    private aqov d;
    private ajwo e;
    private aqbg f;
    private asjq g;
    private byte h = 2;

    static {
        aqow aqowVar = new aqow();
        a = aqowVar;
        aihn.registerDefaultInstance(aqow.class, aqowVar);
    }

    private aqow() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0002\u00131\u0004\u0000\u0000\u0003\u0013ဉ\u0011$ᐉ 'ᐉ\"1ᐉ*", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aqow();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqow.class);
            default:
                return null;
        }
    }
}
