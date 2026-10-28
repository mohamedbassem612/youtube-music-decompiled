package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apaz extends aihn implements aiis {
    public static final apaz a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private apji g;
    private apji h;
    private apji i;
    private byte j = 2;

    static {
        apaz apazVar = new apaz();
        a = apazVar;
        aihn.registerDefaultInstance(apaz.class, apazVar);
    }

    private apaz() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0004\u000bᐉ\b\u000eᐉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new apaz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apaz.class);
            default:
                return null;
        }
    }
}
