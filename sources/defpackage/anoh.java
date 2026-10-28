package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anoh extends aihn implements aiis {
    public static final anoh a;
    public apji b;
    public int c;
    public long e;
    public apji f;
    private int h;
    private byte i = 2;
    public aiie d = emptyProtobufList();
    public aigj g = aigj.d;

    static {
        anoh anohVar = new anoh();
        a = anohVar;
        aihn.registerDefaultInstance(anoh.class, anohVar);
    }

    private anoh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001ᐉ\u0000\u0002င\u0001\u0003Л\u0004ဂ\u0002\u0005ᐉ\u0003\u0007ည\u0005", new Object[]{"h", "b", "c", "d", apji.class, "e", "f", "g"});
            case 3:
                return new anoh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anoh.class);
            default:
                return null;
        }
    }
}
