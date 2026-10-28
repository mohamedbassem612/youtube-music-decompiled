package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoqp extends aihn implements aiis {
    public static final aoqp a;
    public int b;
    public alay c;
    public ajng d;
    private alay e;
    private alay f;
    private ajng g;
    private alay h;
    private byte i = 2;

    static {
        aoqp aoqpVar = new aoqp();
        a = aoqpVar;
        aihn.registerDefaultInstance(aoqp.class, aoqpVar);
    }

    private aoqp() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0006\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0000\u0004ᐉ\u0003\u0007ᐉ\u0004\nᐉ\t", new Object[]{"b", "e", "f", "c", "d", "g", "h"});
            case 3:
                return new aoqp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoqp.class);
            default:
                return null;
        }
    }
}
