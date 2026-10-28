package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aocw extends aihn implements aiis {
    public static final aocw a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajwo g;
    private ajwo h;
    private ajwo i;
    private apji j;
    private ajwo k;
    private byte l = 2;

    static {
        aocw aocwVar = new aocw();
        a = aocwVar;
        aihn.registerDefaultInstance(aocw.class, aocwVar);
    }

    private aocw() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0003\u001d\t\u0000\u0000\t\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\nᐉ\u0007\u000eᐉ\r\u000fᐉ\u0003\u001bᐉ\u0012\u001dᐉ\u0013", new Object[]{"b", "c", "e", "f", "g", "h", "i", "d", "j", "k"});
            case 3:
                return new aocw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aocw.class);
            default:
                return null;
        }
    }
}
