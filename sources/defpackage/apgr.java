package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apgr extends aihn implements aiis {
    public static final apgr a;
    public int b;
    public alay d;
    public alay e;
    public apgz f;
    public apgs g;
    private apgq h;
    private byte i = 2;
    public String c = "";

    static {
        apgr apgrVar = new apgr();
        a = apgrVar;
        aihn.registerDefaultInstance(apgr.class, apgrVar);
    }

    private apgr() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0004\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004\u0007ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new apgr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apgr.class);
            default:
                return null;
        }
    }
}
