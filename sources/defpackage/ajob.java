package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajob extends aihn implements aiis {
    public static final ajob a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private ajwo g;
    private ajng h;
    private ajng i;
    private ajng j;
    private ajwo k;
    private ajwo l;
    private ajwo m;
    private byte n = 2;

    static {
        ajob ajobVar = new ajob();
        a = ajobVar;
        aihn.registerDefaultInstance(ajob.class, ajobVar);
    }

    private ajob() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0016\u000b\u0000\u0000\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\bᐉ\b\tᐉ\t\nᐉ\n\u000bᐉ\u000b\rᐉ\u0010\u0013ᐉ\u0011\u0014ᐉ\u0012\u0016ᐉ\u0006", new Object[]{"b", "c", "d", "e", "g", "h", "i", "j", "k", "l", "m", "f"});
            case 3:
                return new ajob();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajob.class);
            default:
                return null;
        }
    }
}
