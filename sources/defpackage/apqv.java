package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class apqv extends aihn implements aiis {
    public static final apqv a;
    public int b;
    public alay c;
    public int d;
    private ajwo f;
    private ajwo g;
    private alay h;
    private byte i = 2;
    public aigj e = aigj.d;

    static {
        apqv apqvVar = new apqv();
        a = apqvVar;
        aihn.registerDefaultInstance(apqv.class, apqvVar);
    }

    private apqv() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004᠌\u0005\u0006ည\u0007\u0007ᐉ\u0001\tᐉ\u0004", new Object[]{"b", "f", "c", "d", apdr.o, "e", "g", "h"});
            case 3:
                return new apqv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apqv.class);
            default:
                return null;
        }
    }
}
