package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class albv extends aihn implements aiis {
    public static final albv a;
    private int b;
    private apji c;
    private apji d;
    private byte e = 2;

    static {
        albv albvVar = new albv();
        a = albvVar;
        aihn.registerDefaultInstance(albv.class, albvVar);
    }

    private albv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new albv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(albv.class);
            default:
                return null;
        }
    }
}
