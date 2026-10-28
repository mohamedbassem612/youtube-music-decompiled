package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arih extends aihn implements aiis {
    public static final arih a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public ajwo g;
    private byte h = 2;

    static {
        arih arihVar = new arih();
        a = arihVar;
        aihn.registerDefaultInstance(arih.class, arihVar);
    }

    private arih() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", amyr.u, "e", amyr.o, "f", aobi.b, "g"});
            case 3:
                return new arih();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arih.class);
            default:
                return null;
        }
    }
}
