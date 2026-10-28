package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arao extends aihn implements aiis {
    public static final arao a;
    private int b;
    private aoxx c;
    private byte d = 2;

    static {
        arao araoVar = new arao();
        a = araoVar;
        aihn.registerDefaultInstance(arao.class, araoVar);
    }

    private arao() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u0006ᐉ\u0006", new Object[]{"b", "c"});
            case 3:
                return new arao();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arao.class);
            default:
                return null;
        }
    }
}
