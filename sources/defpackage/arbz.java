package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arbz extends aihn implements aiis {
    public static final arbz a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private byte f = 2;

    static {
        arbz arbzVar = new arbz();
        a = arbzVar;
        aihn.registerDefaultInstance(arbz.class, arbzVar);
    }

    private arbz() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0007\u000b\u0003\u0000\u0000\u0003\u0007ᐉ\u0005\tᐉ\u0007\u000bᐉ\t", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new arbz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arbz.class);
            default:
                return null;
        }
    }
}
