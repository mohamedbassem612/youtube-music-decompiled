package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class anmy extends aihn implements aiis {
    public static final anmy a;
    public int b;
    public aigu c;
    private ajwo d;
    private byte e = 2;

    static {
        anmy anmyVar = new anmy();
        a = anmyVar;
        aihn.registerDefaultInstance(anmy.class, anmyVar);
    }

    private anmy() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"b", "d", "c"});
            case 3:
                return new anmy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anmy.class);
            default:
                return null;
        }
    }
}
