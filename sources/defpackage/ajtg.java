package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajtg extends aihi implements aihj {
    public static final ajtg a;
    private int b;
    private alay c;
    private ajwo d;
    private angb e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private ajwo k;
    private alay l;
    private ajng m;
    private alay n;
    private byte o = 2;

    static {
        ajtg ajtgVar = new ajtg();
        a = ajtgVar;
        aihn.registerDefaultInstance(ajtg.class, ajtgVar);
    }

    private ajtg() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0014\u000b\u0000\u0000\u000b\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\nᐉ\u0006\u000bᐉ\u0007\rᐉ\u0011\u000eᐉ\n\u0010ᐉ\r\u0012ᐉ\u000b\u0014ᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "n", "k", "m", "l", "i"});
            case 3:
                return new ajtg();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajtg.class);
            default:
                return null;
        }
    }
}
