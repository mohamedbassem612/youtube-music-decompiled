package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apcf extends aihn implements aiis {
    public static final apcf a;
    public int b;
    public Object d;
    public int e;
    public boolean f;
    public int g;
    public int c = 0;
    private byte h = 2;

    static {
        apcf apcfVar = new apcf();
        a = apcfVar;
        aihn.registerDefaultInstance(apcf.class, apcfVar);
    }

    private apcf() {
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
                return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001᠌\u0000\u0002м\u0000\u0003м\u0000\u0004ဇ\u0001\u0005᠌\u0002", new Object[]{"d", "c", "b", "e", aobi.t, ajwo.class, apji.class, "f", "g", aobi.u});
            case 3:
                return new apcf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apcf.class);
            default:
                return null;
        }
    }
}
