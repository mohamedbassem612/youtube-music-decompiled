package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajou extends aihn implements aiis {
    public static final ajou a;
    private int b;
    private apji c;
    private apji d;
    private byte e = 2;

    static {
        ajou ajouVar = new ajou();
        a = ajouVar;
        aihn.registerDefaultInstance(ajou.class, ajouVar);
    }

    private ajou() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new ajou();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajou.class);
            default:
                return null;
        }
    }
}
