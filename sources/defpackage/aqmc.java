package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqmc extends aihn implements aiis {
    public static final aqmc a;
    private int b;
    private ajwo c;
    private ajwo d;
    private byte e = 2;

    static {
        aqmc aqmcVar = new aqmc();
        a = aqmcVar;
        aihn.registerDefaultInstance(aqmc.class, aqmcVar);
    }

    private aqmc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0002\u0006ᐉ\u0006\u0007ᐉ\u0007", new Object[]{"b", "c", "d"});
            case 3:
                return new aqmc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqmc.class);
            default:
                return null;
        }
    }
}
