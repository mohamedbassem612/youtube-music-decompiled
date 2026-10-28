package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoxm extends aihn implements aiis {
    public static final aoxm a;
    private int b;
    private alay c;
    private ajwo d;
    private alay e;
    private apji f;
    private apji g;
    private apji h;
    private alay i;
    private alay j;
    private apji k;
    private apji l;
    private apji m;
    private apji n;
    private ajwo o;
    private alay p;
    private askp q;
    private apji r;
    private byte s = 2;

    static {
        aoxm aoxmVar = new aoxm();
        a = aoxmVar;
        aihn.registerDefaultInstance(aoxm.class, aoxmVar);
    }

    private aoxm() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0003\u001c\u0010\u0000\u0000\u0010\u0003ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\u000eᐉ\r\u000fᐉ\u000e\u0011ᐉ\u000f\u0016ᐉ\u0014\u0017ᐉ\u0015\u001aᐉ\u0017\u001bᐉ\u0018\u001cᐉ\u0019", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
            case 3:
                return new aoxm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoxm.class);
            default:
                return null;
        }
    }
}
