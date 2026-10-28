package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aopz extends aihn implements aiis {
    public static final aopz a;
    public int e;
    private int g;
    private aopu h;
    private ajwo i;
    private byte j = 2;
    public aiie b = emptyProtobufList();
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();
    public aihv f = emptyIntList();

    static {
        aopz aopzVar = new aopz();
        a = aopzVar;
        aihn.registerDefaultInstance(aopz.class, aopzVar);
    }

    private aopz() {
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0004\u0001Л\u0002\u001b\u0003Л\u0004င\u0000\u0005ᐉ\u0001\u0006\u0016\u0007ᐉ\u0002", new Object[]{"g", "b", aopy.class, "c", aopx.class, "d", aoqa.class, "e", "h", "f", "i"});
            case 3:
                return new aopz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aopz.class);
            default:
                return null;
        }
    }
}
