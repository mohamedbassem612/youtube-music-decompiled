package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqcr extends aihn implements aiis {
    public static final aqcr a;
    public int b;
    public int c;
    public alay d;
    private byte e = 2;

    static {
        aqcr aqcrVar = new aqcr();
        a = aqcrVar;
        aihn.registerDefaultInstance(aqcr.class, aqcrVar);
    }

    private aqcr() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001᠌\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", akjs.n, "d"});
            case 3:
                return new aqcr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqcr.class);
            default:
                return null;
        }
    }
}
