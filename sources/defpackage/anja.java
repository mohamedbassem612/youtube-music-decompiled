package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anja extends aihn implements aiis {
    public static final anja a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private alay f;
    private alay g;
    private alay h;
    private byte i = 2;

    static {
        anja anjaVar = new anja();
        a = anjaVar;
        aihn.registerDefaultInstance(anja.class, anjaVar);
    }

    private anja() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\r\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\nᐉ\u0007\fᐉ\b\rᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new anja();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anja.class);
            default:
                return null;
        }
    }
}
