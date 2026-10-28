package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoep extends aihn implements aiis {
    public static final aoep a;
    private int b;
    private alde c;
    private byte d = 2;

    static {
        aoep aoepVar = new aoep();
        a = aoepVar;
        aihn.registerDefaultInstance(aoep.class, aoepVar);
    }

    private aoep() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001﮼\u1f4f﮼\u1f4f\u0001\u0000\u0000\u0001﮼\u1f4fᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aoep();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoep.class);
            default:
                return null;
        }
    }
}
