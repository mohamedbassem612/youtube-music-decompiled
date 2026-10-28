package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aisd extends aihn implements aiis {
    public static final aisd a;
    public int b;
    public aise c;
    public aisf d;
    public aisg e;
    public aish f;
    public aisc g;
    public aisi h;
    public akkd i;
    private byte j = 2;

    static {
        aisd aisdVar = new aisd();
        a = aisdVar;
        aihn.registerDefaultInstance(aisd.class, aisdVar);
    }

    private aisd() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\ueec5Ⓩ\ue7d0䥠\u0007\u0000\u0000\u0001\ueec5Ⓩဉ\u0001\uef11Ⓩဉ\u0002ﮎⓐဉ\u0000\uf120⤣ᐉ\u0006２䕛ဉ\t\ue3b9䜗ဉ\u0003\ue7d0䥠ဉ\n", new Object[]{"b", "d", "e", "c", "g", "h", "f", "i"});
            case 3:
                return new aisd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aisd.class);
            default:
                return null;
        }
    }
}
