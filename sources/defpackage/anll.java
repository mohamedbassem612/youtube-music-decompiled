package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anll extends aihn implements aiis {
    public static final anll a;
    public int b;
    public alay c;
    public alay d;
    public aiqe e;
    public ajwo f;
    public int h;
    public apji i;
    public apji j;
    public apji l;
    private byte m = 2;
    public aiie g = emptyProtobufList();
    public aiie k = emptyProtobufList();

    static {
        anll anllVar = new anll();
        a = anllVar;
        aihn.registerDefaultInstance(anll.class, anllVar);
    }

    private anll() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0002\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005Л\u0006᠌\u0004\u0007ᐉ\u0006\nᐉ\u0005\rЛ\u000eᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", apji.class, "h", anbz.u, "j", "i", "k", apji.class, "l"});
            case 3:
                return new anll();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anll.class);
            default:
                return null;
        }
    }
}
