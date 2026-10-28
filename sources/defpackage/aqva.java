package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqva extends aihn implements aiis {
    public static final aqva a;
    private int b;
    private aquu c;
    private aqxn d;
    private byte e = 2;

    static {
        aqva aqvaVar = new aqva();
        a = aqvaVar;
        aihn.registerDefaultInstance(aqva.class, aqvaVar);
    }

    private aqva() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ue82a㢛\ue5f1㢩\u0002\u0000\u0000\u0002\ue82a㢛ᐉ\u0000\ue5f1㢩ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aqva();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqva.class);
            default:
                return null;
        }
    }
}
