package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amax extends aihn implements aiis {
    public static final amax a;
    public int b;
    public alop c;
    public amar d;
    public ambc e;
    public int h;
    private albe i;
    private byte j = 2;
    public aiie f = emptyProtobufList();
    public aigj g = aigj.d;

    static {
        amax amaxVar = new amax();
        a = amaxVar;
        aihn.registerDefaultInstance(amax.class, amaxVar);
    }

    private amax() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001̉\u0007\u0000\u0001\u0005\u0001ᐉ\u0000\u0003ᐉ\u0001\u0005ᐉ\u0002\u0006ည\u0003\u0007Л\n᠌\u0005̉ᐉ\u0006", new Object[]{"b", "c", "d", "e", "g", "f", ajwo.class, "h", arke.n, "i"});
            case 3:
                return new amax();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amax.class);
            default:
                return null;
        }
    }
}
