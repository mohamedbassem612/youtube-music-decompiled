package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alwk extends aihn implements aiis {
    public static final alwk a;
    public alop b;
    private int c;
    private ajwo d;
    private byte e = 2;

    static {
        alwk alwkVar = new alwk();
        a = alwkVar;
        aihn.registerDefaultInstance(alwk.class, alwkVar);
    }

    private alwk() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0004ᐉ\u0001", new Object[]{"c", "b", "d"});
            case 3:
                return new alwk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alwk.class);
            default:
                return null;
        }
    }
}
