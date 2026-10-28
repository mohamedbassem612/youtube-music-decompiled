package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anem extends aihn implements aiis {
    public static final anem a;
    public int b;
    public int f;
    public aijp g;
    public ajwo i;
    private byte j = 2;
    public String c = "";
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();
    public String h = "";

    static {
        anem anemVar = new anem();
        a = anemVar;
        aihn.registerDefaultInstance(anem.class, anemVar);
    }

    private anem() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0001\u0001ለ\u0000\u0002\u001b\u0003ဉ\u0002\u0004\u001b\u0005င\u0001\u0006ለ\u0003\u0007ᐉ\u0004", new Object[]{"b", "c", "d", anel.class, "g", "e", anel.class, "f", "h", "i"});
            case 3:
                return new anem();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anem.class);
            default:
                return null;
        }
    }
}
