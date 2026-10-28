package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alfk extends aihn implements aiis {
    public static final alfk a;
    private int b;
    private aovv c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private ajwo j;
    private ajwo k;
    private alay l;
    private angb m;
    private alay n;
    private alfj o;
    private amkt p;
    private alcj q;
    private byte r = 2;

    static {
        alfk alfkVar = new alfk();
        a = alfkVar;
        aihn.registerDefaultInstance(alfk.class, alfkVar);
    }

    private alfk() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0003\u001a\u000f\u0000\u0000\u000f\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ᐉ\u0007\u0006ᐉ\t\bᐉ\u000b\tᐉ\b\u000eᐉ\u0012\u0010ᐉ\u0001\u0011ᐉ\u0006\u0012ᐉ\f\u0013ᐉ\u0013\u0014ᐉ\u0014\u0016ᐉ\u0015\u0019ᐉ\n\u001aᐉ\u0004", new Object[]{"b", "d", "f", "h", "j", "l", "i", "n", "c", "g", "m", "o", "p", "q", "k", "e"});
            case 3:
                return new alfk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alfk.class);
            default:
                return null;
        }
    }
}
