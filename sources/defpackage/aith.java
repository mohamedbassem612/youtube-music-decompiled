package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aith extends aihn implements aiis {
    public static final aith a;
    public alay b;
    private int c;
    private ajwo d;
    private byte e = 2;

    static {
        aith aithVar = new aith();
        a = aithVar;
        aihn.registerDefaultInstance(aith.class, aithVar);
    }

    private aith() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0005ᐉ\b", new Object[]{"c", "b", "d"});
            case 3:
                return new aith();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aith.class);
            default:
                return null;
        }
    }
}
