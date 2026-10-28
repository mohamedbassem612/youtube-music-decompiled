package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apbu extends aihn implements aiis {
    public static final apbu a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        apbu apbuVar = new apbu();
        a = apbuVar;
        aihn.registerDefaultInstance(apbu.class, apbuVar);
    }

    private apbu() {
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
                return newMessageInfo(a, "\u0004\u0004\u0001\u0000\uecb1┛\uedcc㐚\u0004\u0000\u0000\u0003\uecb1┛м\u0000\uecb4┛м\u0000\uf2b9〧м\u0000\uedcc㐚<\u0000", new Object[]{"c", "b", ajda.class, amfv.class, ajjf.class, amfo.class});
            case 3:
                return new apbu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apbu.class);
            default:
                return null;
        }
    }
}
