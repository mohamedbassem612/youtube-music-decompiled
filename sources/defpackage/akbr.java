package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akbr extends aihn implements aiis {
    public static final akbr a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajwo g;
    private angb h;
    private byte i = 2;

    static {
        akbr akbrVar = new akbr();
        a = akbrVar;
        aihn.registerDefaultInstance(akbr.class, akbrVar);
    }

    private akbr() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\u000f\u0006\u0000\u0000\u0006\u0003ᐉ\u0002\u0005ᐉ\u0003\u0007ᐉ\u0004\nᐉ\u0005\u000bᐉ\u0006\u000fᐉ\u0001", new Object[]{"b", "d", "e", "f", "g", "h", "c"});
            case 3:
                return new akbr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akbr.class);
            default:
                return null;
        }
    }
}
