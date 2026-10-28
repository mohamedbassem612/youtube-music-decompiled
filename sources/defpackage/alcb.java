package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alcb extends aihn implements aiis {
    public static final alcb a;
    private int b;
    private alcj c;
    private alay d;
    private alcl e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private byte j = 2;

    static {
        alcb alcbVar = new alcb();
        a = alcbVar;
        aihn.registerDefaultInstance(alcb.class, alcbVar);
    }

    private alcb() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000f\u0007\u0000\u0000\u0007\u0001ᐉ\n\u0002ᐉ\u000f\u0003ᐉ\u0010\u0004ᐉ\u0011\bᐉ\u0004\fᐉ\u0000\u000fᐉ\u0003", new Object[]{"b", "f", "g", "h", "i", "e", "c", "d"});
            case 3:
                return new alcb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alcb.class);
            default:
                return null;
        }
    }
}
