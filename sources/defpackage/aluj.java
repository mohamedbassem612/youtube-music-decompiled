package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aluj extends aihn implements aiis {
    public static final aluj a;
    public alop b;
    private int d;
    private byte e = 2;
    public aiie c = emptyProtobufList();

    static {
        aluj alujVar = new aluj();
        a = alujVar;
        aihn.registerDefaultInstance(aluj.class, alujVar);
    }

    private aluj() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"d", "b", "c", ajwo.class});
            case 3:
                return new aluj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aluj.class);
            default:
                return null;
        }
    }
}
