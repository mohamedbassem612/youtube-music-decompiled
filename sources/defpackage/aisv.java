package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aisv extends aihn implements aiis {
    public static final aisv a;
    public int b;
    public arcg c;
    public alam d;
    public aqfv e;
    public arci f;
    private ambp g;
    private aiwa h;
    private arcf i;
    private byte j = 2;

    static {
        aisv aisvVar = new aisv();
        a = aisvVar;
        aihn.registerDefaultInstance(aisv.class, aisvVar);
    }

    private aisv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001ﵡᵙﲱꌪ\u0007\u0000\u0000\u0006ﵡᵙᐉ\u0000諾⡱ဉ\u0001\uf09c⢠ᐉ\u0002\ue162⪂ᐉ\u0004\ue879㋶ᐉ\u0003\ue4bfꋚᐉ\u0005ﲱꌪᐉ\u0006", new Object[]{"b", "c", "d", "e", "h", "g", "f", "i"});
            case 3:
                return new aisv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aisv.class);
            default:
                return null;
        }
    }
}
