package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alxx extends aihn implements aiis {
    public static final alxx a;
    public alop b;
    public long d;
    public alxv e;
    private int f;
    private albe g;
    private byte h = 2;
    public aiie c = emptyProtobufList();

    static {
        alxx alxxVar = new alxx();
        a = alxxVar;
        aihn.registerDefaultInstance(alxx.class, alxxVar);
    }

    private alxx() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001̉\u0005\u0000\u0001\u0004\u0001ᐉ\u0000\u0003Л\u0004ဃ\u0001\u0005ᐉ\u0002̉ᐉ\u0003", new Object[]{"f", "b", "c", ajwo.class, "d", "e", "g"});
            case 3:
                return new alxx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alxx.class);
            default:
                return null;
        }
    }
}
