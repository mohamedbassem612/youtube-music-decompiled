package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aovd extends aihn implements aiis {
    public static final aovd a;
    private int b;
    private alay c;
    private aovm d;
    private aovm e;
    private ajlx f;
    private aovn g;
    private aovn h;
    private ajlx i;
    private ajlx j;
    private ajlx k;
    private ajlx l;
    private byte m = 2;

    static {
        aovd aovdVar = new aovd();
        a = aovdVar;
        aihn.registerDefaultInstance(aovd.class, aovdVar);
    }

    private aovd() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0004\u0003ᐉ\u0005\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\b\bᐉ\u0001\tᐉ\u0002\nᐉ\u0003\u000bᐉ\t", new Object[]{"b", "c", "g", "h", "i", "j", "k", "d", "e", "f", "l"});
            case 3:
                return new aovd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aovd.class);
            default:
                return null;
        }
    }
}
