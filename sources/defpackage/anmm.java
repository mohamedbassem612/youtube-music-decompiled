package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anmm extends aihn implements aiis {
    public static final anmm a;
    public int c;
    private int d;
    private byte e = 2;
    public aiie b = emptyProtobufList();

    static {
        anmm anmmVar = new anmm();
        a = anmmVar;
        aihn.registerDefaultInstance(anmm.class, anmmVar);
    }

    private anmm() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0001\u0001Л\u0004᠌\u0002", new Object[]{"d", "b", aqmh.class, "c", anms.b});
            case 3:
                return new anmm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anmm.class);
            default:
                return null;
        }
    }
}
