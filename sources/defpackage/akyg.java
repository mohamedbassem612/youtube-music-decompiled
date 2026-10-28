package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akyg extends aihi implements aihj {
    public static final akyg a;
    private int b;
    private ajwo c;
    private alay d;
    private alay e;
    private alay f;
    private akyh g;
    private angb h;
    private akyf i;
    private byte k = 2;

    static {
        akyg akygVar = new akyg();
        a = akygVar;
        aihn.registerDefaultInstance(akyg.class, akygVar);
    }

    private akyg() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\r\u0007\u0000\u0000\u0007\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\bᐉ\u0007\nᐉ\u0005\rᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "i", "g", "h"});
            case 3:
                return new akyg();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akyg.class);
            default:
                return null;
        }
    }
}
