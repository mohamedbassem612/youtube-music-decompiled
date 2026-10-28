package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqjk extends aihn implements aiis {
    public static final aqjk a;
    private int b;
    private apoq c;
    private byte d = 2;

    static {
        aqjk aqjkVar = new aqjk();
        a = aqjkVar;
        aihn.registerDefaultInstance(aqjk.class, aqjkVar);
    }

    private aqjk() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue7f5ណ\ue7f5ណ\u0001\u0000\u0000\u0001\ue7f5ណᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aqjk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqjk.class);
            default:
                return null;
        }
    }
}
