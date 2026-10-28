package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alck extends aihn implements aiis {
    public static final alck a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private alay f;
    private alay g;
    private alay h;
    private byte i = 2;

    static {
        alck alckVar = new alck();
        a = alckVar;
        aihn.registerDefaultInstance(alck.class, alckVar);
    }

    private alck() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0003ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\tᐉ\u0007\fᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new alck();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alck.class);
            default:
                return null;
        }
    }
}
