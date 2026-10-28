package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqcs extends aihn implements aiis {
    public static final aqcs a;
    public int b;
    public aqmh c;
    public aiie d;
    private byte e = 2;

    static {
        aqcs aqcsVar = new aqcs();
        a = aqcsVar;
        aihn.registerDefaultInstance(aqcs.class, aqcsVar);
    }

    private aqcs() {
        aigj aigjVar = aigj.d;
        this.d = emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0004Л", new Object[]{"b", "c", "d", aqmh.class});
            case 3:
                return new aqcs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqcs.class);
            default:
                return null;
        }
    }
}
