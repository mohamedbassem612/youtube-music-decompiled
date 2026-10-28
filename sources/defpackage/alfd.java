package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alfd extends aihn implements aiis {
    public static final alfd a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private ajwo h;
    private apji i;
    private angb j;
    private alcj k;
    private byte l = 2;

    static {
        alfd alfdVar = new alfd();
        a = alfdVar;
        aihn.registerDefaultInstance(alfd.class, alfdVar);
    }

    private alfd() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0004\u0016\t\u0000\u0000\t\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0007\tᐉ\u0002\u0010ᐉ\n\u0011ᐉ\u000b\u0014ᐉ\u0005\u0015ᐉ\u0006\u0016ᐉ\t", new Object[]{"b", "d", "e", "h", "c", "j", "k", "f", "g", "i"});
            case 3:
                return new alfd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alfd.class);
            default:
                return null;
        }
    }
}
