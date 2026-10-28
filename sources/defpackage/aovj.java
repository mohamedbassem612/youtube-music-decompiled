package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aovj extends aihn implements aiis {
    public static final aovj a;
    private int b;
    private aovi c;
    private byte d = 2;

    static {
        aovj aovjVar = new aovj();
        a = aovjVar;
        aihn.registerDefaultInstance(aovj.class, aovjVar);
    }

    private aovj() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue25fⴂ\ue25fⴂ\u0001\u0000\u0000\u0001\ue25fⴂᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aovj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aovj.class);
            default:
                return null;
        }
    }
}
