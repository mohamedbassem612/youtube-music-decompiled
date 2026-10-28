package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aobv extends aihn implements aiis {
    public static final aobv a;
    private int b;
    private aobu c;
    private aobt d;
    private byte e = 2;

    static {
        aobv aobvVar = new aobv();
        a = aobvVar;
        aihn.registerDefaultInstance(aobv.class, aobvVar);
    }

    private aobv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uec51ᡎ\ue86c᱒\u0002\u0000\u0000\u0002\uec51ᡎᐉ\u0000\ue86c᱒ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aobv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aobv.class);
            default:
                return null;
        }
    }
}
