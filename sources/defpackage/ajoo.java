package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajoo extends aihn implements aiis {
    public static final ajoo a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private apji f;
    private apji g;
    private ajwo h;
    private byte i = 2;

    static {
        ajoo ajooVar = new ajoo();
        a = ajooVar;
        aihn.registerDefaultInstance(ajoo.class, ajooVar);
    }

    private ajoo() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0017\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0003ᐉ\u0001\bᐉ\u0007\nᐉ\u0005\u0015ᐉ\u0002\u0017ᐉ\u0004", new Object[]{"b", "c", "d", "h", "g", "e", "f"});
            case 3:
                return new ajoo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajoo.class);
            default:
                return null;
        }
    }
}
