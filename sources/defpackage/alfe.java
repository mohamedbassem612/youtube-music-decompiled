package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alfe extends aihn implements aiis {
    public static final alfe a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private ajwo h;
    private alay i;
    private angb j;
    private alay k;
    private byte l = 2;

    static {
        alfe alfeVar = new alfe();
        a = alfeVar;
        aihn.registerDefaultInstance(alfe.class, alfeVar);
    }

    private alfe() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0003\u0010\t\u0000\u0000\t\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\u000eᐉ\r\u000fᐉ\u0004\u0010ᐉ\t", new Object[]{"b", "c", "d", "f", "g", "h", "i", "k", "e", "j"});
            case 3:
                return new alfe();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alfe.class);
            default:
                return null;
        }
    }
}
