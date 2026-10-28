package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agzx extends aihn implements aiis {
    public static final agzx a;
    private int b;
    private int c;
    private byte d = 2;

    static {
        agzx agzxVar = new agzx();
        a = agzxVar;
        aihn.registerDefaultInstance(agzx.class, agzxVar);
    }

    private agzx() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᴌ\u0000", new Object[]{"b", "c", agzi.d});
            case 3:
                return new agzx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(agzx.class);
            default:
                return null;
        }
    }
}
