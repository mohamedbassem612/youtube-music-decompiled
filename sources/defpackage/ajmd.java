package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajmd extends aihn implements aiis {
    public static final ajmd a;
    private int b;
    private apji c;
    private alay d;
    private alay e;
    private ajng f;
    private ajng g;
    private alay h;
    private ajwo i;
    private apji j;
    private apji k;
    private apji l;
    private apji m;
    private byte n = 2;

    static {
        ajmd ajmdVar = new ajmd();
        a = ajmdVar;
        aihn.registerDefaultInstance(ajmd.class, ajmdVar);
    }

    private ajmd() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\b\u0019\u000b\u0000\u0000\u000b\bᐉ\u0007\nᐉ\t\u000bᐉ\n\fᐉ\u000b\rᐉ\f\u000eᐉ\u0010\u0011ᐉ\u0011\u0015ᐉ\u0002\u0017ᐉ\u0015\u0018ᐉ\u0016\u0019ᐉ\u0017", new Object[]{"b", "d", "e", "f", "g", "h", "i", "j", "c", "k", "l", "m"});
            case 3:
                return new ajmd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajmd.class);
            default:
                return null;
        }
    }
}
