package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aptv extends aihn implements aiis {
    public static final aptv a;
    private int b;
    private alay c;
    private alay d;
    private apto e;
    private ajwo f;
    private apty g;
    private aptu h;
    private byte i = 2;

    static {
        aptv aptvVar = new aptv();
        a = aptvVar;
        aihn.registerDefaultInstance(aptv.class, aptvVar);
    }

    private aptv() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0005\u0011\u0006\u0000\u0000\u0006\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0005\u000bᐉ\u0004\u0010ᐉ\f\u0011ᐉ\r", new Object[]{"b", "c", "d", "f", "e", "g", "h"});
            case 3:
                return new aptv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aptv.class);
            default:
                return null;
        }
    }
}
