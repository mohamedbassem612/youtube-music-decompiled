package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajsj extends aihn implements aiis {
    public static final ajsj a;
    private int b;
    private ajsm c;
    private ajsl d;
    private ajwo e;
    private ajlx f;
    private ajsk g;
    private byte h = 2;

    static {
        ajsj ajsjVar = new ajsj();
        a = ajsjVar;
        aihn.registerDefaultInstance(ajsj.class, ajsjVar);
    }

    private ajsj() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0003", new Object[]{"b", "c", "d", "e", "g", "f"});
            case 3:
                return new ajsj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajsj.class);
            default:
                return null;
        }
    }
}
