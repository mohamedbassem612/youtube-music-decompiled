package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aulu extends aihi implements aihj {
    public static final aulu a;
    public int b;
    public double c;
    public double d;
    private byte e = 2;

    static {
        aulu auluVar = new aulu();
        a = auluVar;
        aihn.registerDefaultInstance(aulu.class, auluVar);
    }

    private aulu() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aulu();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aulu.class);
            default:
                return null;
        }
    }
}
