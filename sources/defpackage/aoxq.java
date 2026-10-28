package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoxq extends aihn implements aiis {
    public static final aoxq a;
    private int b;
    private aoxr c;
    private byte d = 2;

    static {
        aoxq aoxqVar = new aoxq();
        a = aoxqVar;
        aihn.registerDefaultInstance(aoxq.class, aoxqVar);
    }

    private aoxq() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aoxq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoxq.class);
            default:
                return null;
        }
    }
}
