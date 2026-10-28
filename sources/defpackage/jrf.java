package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrf extends aihn implements aiis {
    public static final jrf a;
    public int b;
    public int c;
    public jre d;
    private byte e = 2;

    static {
        jrf jrfVar = new jrf();
        a = jrfVar;
        aihn.registerDefaultInstance(jrf.class, jrfVar);
    }

    private jrf() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0001\u0002င\u0001\u0004ᐉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new jrf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(jrf.class);
            default:
                return null;
        }
    }
}
