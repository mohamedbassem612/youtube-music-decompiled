package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class airj extends aihn implements aiis {
    public static final airj a;
    public int b;
    public aiie d;
    public apji e;
    public akrq f;
    private byte g = 2;
    public aiie c = emptyProtobufList();

    static {
        airj airjVar = new airj();
        a = airjVar;
        aihn.registerDefaultInstance(airj.class, airjVar);
    }

    private airj() {
        emptyProtobufList();
        this.d = emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0003\u0001Л\u0004Л\u0005ᐉ\u0000\u0006ဉ\u0002", new Object[]{"b", "c", airi.class, "d", airh.class, "e", "f"});
            case 3:
                return new airj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(airj.class);
            default:
                return null;
        }
    }
}
