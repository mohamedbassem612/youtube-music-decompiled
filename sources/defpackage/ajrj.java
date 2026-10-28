package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajrj extends aihn implements aiis {
    public static final ajrj a;
    private int b;
    private ajwo c;
    private ajri d;
    private ajwo e;
    private ajng f;
    private alay g;
    private alay h;
    private byte i = 2;

    static {
        ajrj ajrjVar = new ajrj();
        a = ajrjVar;
        aihn.registerDefaultInstance(ajrj.class, ajrjVar);
    }

    private ajrj() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\nᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new ajrj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajrj.class);
            default:
                return null;
        }
    }
}
