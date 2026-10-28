package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amqg extends aihn implements aiis {
    public static final amqg a;
    private int b;
    private alay c;
    private ajwo d;
    private apji e;
    private apji f;
    private byte g = 2;

    static {
        amqg amqgVar = new amqg();
        a = amqgVar;
        aihn.registerDefaultInstance(amqg.class, amqgVar);
    }

    private amqg() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0003\u000b\u0004\u0000\u0000\u0004\u0003ᐉ\u0002\u0005ᐉ\u0006\nᐉ\u0007\u000bᐉ\b", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new amqg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amqg.class);
            default:
                return null;
        }
    }
}
