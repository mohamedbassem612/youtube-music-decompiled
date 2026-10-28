package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aptt extends aihn implements aiis {
    public static final aptt a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private apty i;
    private alay j;
    private alay k;
    private alay l;
    private byte m = 2;

    static {
        aptt apttVar = new aptt();
        a = apttVar;
        aihn.registerDefaultInstance(aptt.class, apttVar);
    }

    private aptt() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\n\u0001ᐉ\u0000\u0003ᐉ\u0005\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\b\u0007ᐉ\t\bᐉ\n\tᐉ\u000b\nᐉ\f\u000bᐉ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new aptt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aptt.class);
            default:
                return null;
        }
    }
}
