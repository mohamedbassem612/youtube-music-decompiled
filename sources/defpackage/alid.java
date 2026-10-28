package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alid extends aihn implements aiis {
    public static final alid a;
    private int b;
    private alif c;
    private byte d = 2;

    static {
        alid alidVar = new alid();
        a = alidVar;
        aihn.registerDefaultInstance(alid.class, alidVar);
    }

    private alid() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue1c8㕰\ue1c8㕰\u0001\u0000\u0000\u0001\ue1c8㕰ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new alid();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alid.class);
            default:
                return null;
        }
    }
}
