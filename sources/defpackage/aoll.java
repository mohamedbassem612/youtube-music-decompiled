package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoll extends aihn implements aiis {
    public static final aoll a;
    public int b;
    public alop c;
    public aoln d;
    public apjh e;
    public ajwo f;
    public albe h;
    private aqzr i;
    private byte j = 2;
    public aigj g = aigj.d;

    static {
        aoll aollVar = new aoll();
        a = aollVar;
        aihn.registerDefaultInstance(aoll.class, aollVar);
    }

    private aoll() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001̉\u0007\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ည\u0005\u0006ᐉ\u0003\u0007ဉ\u0006̉ᐉ\u0007", new Object[]{"b", "c", "d", "e", "g", "f", "i", "h"});
            case 3:
                return new aoll();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoll.class);
            default:
                return null;
        }
    }
}
