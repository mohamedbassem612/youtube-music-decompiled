package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajtb extends aihn implements aiis {
    public static final ajtb a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        ajtb ajtbVar = new ajtb();
        a = ajtbVar;
        aihn.registerDefaultInstance(ajtb.class, ajtbVar);
    }

    private ajtb() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\ueb11ἑ\ue743魩\u0004\u0000\u0000\u0003\ueb11ἑм\u0000\ue952⒡м\u0000\uf0b0⮔м\u0000\ue743魩<\u0000", new Object[]{"c", "b", ajnf.class, aqaw.class, ajsy.class, ajtc.class});
            case 3:
                return new ajtb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajtb.class);
            default:
                return null;
        }
    }
}
