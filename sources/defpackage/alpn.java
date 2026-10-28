package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alpn extends aihn implements aiis {
    public static final alpn a;
    public int b;
    public alop c;
    public aisa d;
    public akeh e;
    public aqmx f;
    private ajwo g;
    private albe h;
    private byte i = 2;

    static {
        alpn alpnVar = new alpn();
        a = alpnVar;
        aihn.registerDefaultInstance(alpn.class, alpnVar);
    }

    private alpn() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001̉\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005̉ᐉ\u0004", new Object[]{"b", "c", "d", "e", "g", "f", "h"});
            case 3:
                return new alpn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alpn.class);
            default:
                return null;
        }
    }
}
