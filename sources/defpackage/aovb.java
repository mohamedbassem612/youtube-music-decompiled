package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aovb extends aihn implements aiis {
    public static final aovb a;
    public int b;
    public alay d;
    private alay e;
    private byte f = 2;
    public aiie c = emptyProtobufList();

    static {
        aovb aovbVar = new aovb();
        a = aovbVar;
        aihn.registerDefaultInstance(aovb.class, aovbVar);
    }

    private aovb() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0006ᐉ\u0001", new Object[]{"b", "e", "c", aouy.class, "d"});
            case 3:
                return new aovb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aovb.class);
            default:
                return null;
        }
    }
}
