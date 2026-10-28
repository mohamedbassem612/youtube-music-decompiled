package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiuz extends aihn implements aiis {
    public static final aiuz a;
    private int c;
    private aivw d;
    private aiuy e;
    private aitu f;
    private aivw g;
    private aivf h;
    private byte i = 2;
    public aigj b = aigj.d;

    static {
        aiuz aiuzVar = new aiuz();
        a = aiuzVar;
        aihn.registerDefaultInstance(aiuz.class, aiuzVar);
    }

    private aiuz() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0002\n\u0006\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ᐉ\u0003\u0006ည\b\u0007ᐉ\u0002\bᐉ\u0004\nᐉ\t", new Object[]{"c", "d", "f", "b", "e", "g", "h"});
            case 3:
                return new aiuz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiuz.class);
            default:
                return null;
        }
    }
}
