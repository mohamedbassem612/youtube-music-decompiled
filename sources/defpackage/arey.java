package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arey extends aihn implements aiis {
    public static final arey a;
    private int b;
    private arcd c;
    private anfy d;
    private byte e = 2;

    static {
        arey areyVar = new arey();
        a = areyVar;
        aihn.registerDefaultInstance(arey.class, areyVar);
    }

    private arey() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ueaaaᾮ\uf6ae\u2fd9\u0002\u0000\u0000\u0002\ueaaaᾮᐉ\u0001\uf6ae\u2fd9ᐉ\u0000", new Object[]{"b", "d", "c"});
            case 3:
                return new arey();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arey.class);
            default:
                return null;
        }
    }
}
