package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajzf extends aihn implements aiis {
    public static final ajzf a;
    private int b;
    private ajng c;
    private ajng d;
    private alay e;
    private ajwo f;
    private ajwo g;
    private ajjt h;
    private ajjs i;
    private ajjr j;
    private ajng k;
    private arri l;
    private ajng m;
    private apji n;
    private apji o;
    private ajwo p;
    private ajwo q;
    private byte r = 2;

    static {
        ajzf ajzfVar = new ajzf();
        a = ajzfVar;
        aihn.registerDefaultInstance(ajzf.class, ajzfVar);
    }

    private ajzf() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0018\u000f\u0000\u0000\u000f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0004\u0005ᐉ\u0005\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\u000b\rᐉ\n\u000eᐉ\u0006\u0010ᐉ\f\u0012ᐉ\r\u0015ᐉ\u0012\u0016ᐉ\u0013\u0018ᐉ\u0015", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "l", "k", "g", "m", "n", "o", "p", "q"});
            case 3:
                return new ajzf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajzf.class);
            default:
                return null;
        }
    }
}
