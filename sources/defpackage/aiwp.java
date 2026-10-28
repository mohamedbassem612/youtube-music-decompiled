package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiwp extends aihn implements aiis {
    public static final aiwp a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private ajwo j;
    private ajng k;
    private byte l = 2;

    static {
        aiwp aiwpVar = new aiwp();
        a = aiwpVar;
        aihn.registerDefaultInstance(aiwp.class, aiwpVar);
    }

    private aiwp() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0005\u0004ᐉ\u0006\u0005ᐉ\u0007\bᐉ\t\tᐉ\u0002\nᐉ\u0003\rᐉ\u0004", new Object[]{"b", "c", "d", "h", "i", "j", "k", "e", "f", "g"});
            case 3:
                return new aiwp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiwp.class);
            default:
                return null;
        }
    }
}
