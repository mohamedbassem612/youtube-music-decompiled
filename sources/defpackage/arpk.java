package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arpk extends aihn implements aiis {
    public static final arpk a;
    private int b;
    private arpc c;
    private byte d = 2;

    static {
        arpk arpkVar = new arpk();
        a = arpkVar;
        aihn.registerDefaultInstance(arpk.class, arpkVar);
    }

    private arpk() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf6fdᶤ\uf6fdᶤ\u0001\u0000\u0000\u0001\uf6fdᶤᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new arpk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arpk.class);
            default:
                return null;
        }
    }
}
