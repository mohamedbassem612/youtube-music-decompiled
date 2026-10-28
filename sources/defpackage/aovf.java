package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aovf extends aihn implements aiis {
    public static final aovf a;
    private int b;
    private alay c;
    private aovv d;
    private aovm e;
    private aovm f;
    private apji g;
    private aovn h;
    private byte i = 2;

    static {
        aovf aovfVar = new aovf();
        a = aovfVar;
        aihn.registerDefaultInstance(aovf.class, aovfVar);
    }

    private aovf() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0005ᐉ\u0001\u0007ᐉ\u0004\bᐉ\u0005", new Object[]{"b", "c", "e", "f", "d", "g", "h"});
            case 3:
                return new aovf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aovf.class);
            default:
                return null;
        }
    }
}
