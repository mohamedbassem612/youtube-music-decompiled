package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class areh extends aihn implements aiis {
    public static final areh a;
    private int b;
    private ajol c;
    private byte d = 2;

    static {
        areh arehVar = new areh();
        a = arehVar;
        aihn.registerDefaultInstance(areh.class, arehVar);
    }

    private areh() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf151₋\uf151₋\u0001\u0000\u0000\u0001\uf151₋ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new areh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(areh.class);
            default:
                return null;
        }
    }
}
