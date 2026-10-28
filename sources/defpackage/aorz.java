package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aorz extends aihn implements aiis {
    public static final aorz a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajwo g;
    private alay h;
    private alay i;
    private byte j = 2;

    static {
        aorz aorzVar = new aorz();
        a = aorzVar;
        aihn.registerDefaultInstance(aorz.class, aorzVar);
    }

    private aorz() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0007ᐉ\u0007\bᐉ\b\u000bᐉ\u0001", new Object[]{"b", "c", "e", "f", "g", "h", "i", "d"});
            case 3:
                return new aorz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aorz.class);
            default:
                return null;
        }
    }
}
