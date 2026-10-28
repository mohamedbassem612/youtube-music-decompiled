package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajeq extends aihn implements aiis {
    public static final ajeq a;
    public int b;
    public aiua e;
    private ajep f;
    private ajeo g;
    private byte h = 2;
    public aiie c = emptyProtobufList();
    public aigj d = aigj.d;

    static {
        ajeq ajeqVar = new ajeq();
        a = ajeqVar;
        aihn.registerDefaultInstance(ajeq.class, ajeqVar);
    }

    private ajeq() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0001\u0002\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004\u001b\u0006ည\u0004\tဉ\u0006", new Object[]{"b", "f", "g", "c", aitj.class, "d", "e"});
            case 3:
                return new ajeq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajeq.class);
            default:
                return null;
        }
    }
}
