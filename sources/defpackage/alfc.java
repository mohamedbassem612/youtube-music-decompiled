package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alfc extends aihn implements aiis {
    public static final alfc a;
    private int b;
    private alay c;
    private alay d;
    private byte e = 2;

    static {
        alfc alfcVar = new alfc();
        a = alfcVar;
        aihn.registerDefaultInstance(alfc.class, alfcVar);
    }

    private alfc() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new alfc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alfc.class);
            default:
                return null;
        }
    }
}
