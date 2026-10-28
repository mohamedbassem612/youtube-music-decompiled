package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akbm extends aihn implements aiis {
    public static final akbm a;
    private int b;
    private alay c;
    private alay d;
    private byte e = 2;

    static {
        akbm akbmVar = new akbm();
        a = akbmVar;
        aihn.registerDefaultInstance(akbm.class, akbmVar);
    }

    private akbm() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0002\u0006ᐉ\u0000\u0007ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new akbm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akbm.class);
            default:
                return null;
        }
    }
}
