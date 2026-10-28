package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aovv extends aihn implements aiis {
    public static final aovv a;
    private int b;
    private aovw c;
    private anyi d;
    private byte e = 2;

    static {
        aovv aovvVar = new aovv();
        a = aovvVar;
        aihn.registerDefaultInstance(aovv.class, aovvVar);
    }

    private aovv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ue365⊉\ue69a乮\u0002\u0000\u0000\u0002\ue365⊉ᐉ\u0000\ue69a乮ᐉ\u0003", new Object[]{"b", "c", "d"});
            case 3:
                return new aovv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aovv.class);
            default:
                return null;
        }
    }
}
