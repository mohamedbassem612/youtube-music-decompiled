package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajrl extends aihn implements aiis {
    public static final ajrl a;
    private int b;
    private alay c;
    private alay d;
    private ajrm e;
    private ajwo f;
    private alay g;
    private alay h;
    private byte i = 2;

    static {
        ajrl ajrlVar = new ajrl();
        a = ajrlVar;
        aihn.registerDefaultInstance(ajrl.class, ajrlVar);
    }

    private ajrl() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new ajrl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajrl.class);
            default:
                return null;
        }
    }
}
