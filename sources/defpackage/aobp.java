package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aobp extends aihn implements aiis {
    public static final aobp a;
    public int b;
    public ajwo d;
    private byte e = 2;
    public aiie c = emptyProtobufList();

    static {
        aobp aobpVar = new aobp();
        a = aobpVar;
        aihn.registerDefaultInstance(aobp.class, aobpVar);
    }

    private aobp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u001b\u0002ᐉ\u0000", new Object[]{"b", "c", aobo.class, "d"});
            case 3:
                return new aobp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aobp.class);
            default:
                return null;
        }
    }
}
