package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alfi extends aihn implements aiis {
    public static final alfi a;
    private int b;
    private alay c;
    private angb d;
    private ajwo e;
    private alay f;
    private alay g;
    private alay h;
    private ajkl i;
    private ajkl j;
    private ajkl k;
    private ajng l;
    private byte m = 2;

    static {
        alfi alfiVar = new alfi();
        a = alfiVar;
        aihn.registerDefaultInstance(alfi.class, alfiVar);
    }

    private alfi() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0003\u0012\n\u0000\u0000\n\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0007ᐉ\u0006\bᐉ\b\fᐉ\f\rᐉ\u0007\u0010ᐉ\t\u0011ᐉ\n\u0012ᐉ\u000b", new Object[]{"b", "c", "d", "e", "f", "h", "l", "g", "i", "j", "k"});
            case 3:
                return new alfi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alfi.class);
            default:
                return null;
        }
    }
}
