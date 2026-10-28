package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anwp extends aihn implements aiis {
    public static final anwp a;
    public int b;
    public akwo c;
    private byte d = 2;

    static {
        anwp anwpVar = new anwp();
        a = anwpVar;
        aihn.registerDefaultInstance(anwp.class, anwpVar);
    }

    private anwp() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uedeaⶔ\uedeaⶔ\u0001\u0000\u0000\u0001\uedeaⶔᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new anwp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anwp.class);
            default:
                return null;
        }
    }
}
