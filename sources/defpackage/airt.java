package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class airt extends aihn implements aiis {
    public static final airt a;
    private int b;
    private ajwo c;
    private byte d = 2;

    static {
        airt airtVar = new airt();
        a = airtVar;
        aihn.registerDefaultInstance(airt.class, airtVar);
    }

    private airt() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", "c"});
            case 3:
                return new airt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(airt.class);
            default:
                return null;
        }
    }
}
