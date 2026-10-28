package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arjd extends aihn implements aiis {
    public static final arjd a;
    private int b;
    private ajwo c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private ajwo j;
    private apji k;
    private byte l = 2;

    static {
        arjd arjdVar = new arjd();
        a = arjdVar;
        aihn.registerDefaultInstance(arjd.class, arjdVar);
    }

    private arjd() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\r\t\u0000\u0000\t\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0007ᐉ\b\bᐉ\n\u000bᐉ\u0006\fᐉ\t\rᐉ\u0000", new Object[]{"b", "d", "e", "f", "g", "i", "k", "h", "j", "c"});
            case 3:
                return new arjd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arjd.class);
            default:
                return null;
        }
    }
}
