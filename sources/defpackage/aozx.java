package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aozx extends aihn implements aiis {
    public static final aozx a;
    private int b;
    private apaf c;
    private aozu d;
    private aivc e;
    private byte f = 2;

    static {
        aozx aozxVar = new aozx();
        a = aozxVar;
        aihn.registerDefaultInstance(aozx.class, aozxVar);
    }

    private aozx() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0006ᐉ\u0001\u0007ᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aozx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aozx.class);
            default:
                return null;
        }
    }
}
