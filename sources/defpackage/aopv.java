package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aopv extends aihn implements aiis {
    public static final aopv a;
    private int b;
    private aopu c;
    private byte d = 2;

    static {
        aopv aopvVar = new aopv();
        a = aopvVar;
        aihn.registerDefaultInstance(aopv.class, aopvVar);
    }

    private aopv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0003", new Object[]{"b", "c"});
            case 3:
                return new aopv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aopv.class);
            default:
                return null;
        }
    }
}
