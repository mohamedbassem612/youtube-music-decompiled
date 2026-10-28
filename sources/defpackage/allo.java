package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class allo extends aihn implements aiis {
    public static final allo a;
    public int b;
    public allt c;
    public allp d;
    private byte e = 2;

    static {
        allo alloVar = new allo();
        a = alloVar;
        aihn.registerDefaultInstance(allo.class, alloVar);
    }

    private allo() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\ue7cb㙌\ue3dc喠\u0002\u0000\u0000\u0002\ue7cb㙌ᐉ\u0000\ue3dc喠ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new allo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(allo.class);
            default:
                return null;
        }
    }
}
