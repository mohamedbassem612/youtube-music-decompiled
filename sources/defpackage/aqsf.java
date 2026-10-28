package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqsf extends aihn implements aiis {
    public static final aqsf a;
    private int b;
    private alay c;
    private aqsh d;
    private byte e = 2;

    static {
        aqsf aqsfVar = new aqsf();
        a = aqsfVar;
        aihn.registerDefaultInstance(aqsf.class, aqsfVar);
    }

    private aqsf() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new aqsf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqsf.class);
            default:
                return null;
        }
    }
}
