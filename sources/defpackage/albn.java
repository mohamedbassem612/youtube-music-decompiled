package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class albn extends aihn implements aiis {
    public static final albn a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private albo g;
    private alcl h;
    private byte i = 2;

    static {
        albn albnVar = new albn();
        a = albnVar;
        aihn.registerDefaultInstance(albn.class, albnVar);
    }

    private albn() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\tᐉ\u0005\nᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new albn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(albn.class);
            default:
                return null;
        }
    }
}
