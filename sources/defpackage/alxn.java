package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alxn extends aihn implements aiis {
    public static final alxn a;
    private int b;
    private algf c;
    private akla d;
    private anit e;
    private byte f = 2;

    static {
        alxn alxnVar = new alxn();
        a = alxnVar;
        aihn.registerDefaultInstance(alxn.class, alxnVar);
    }

    private alxn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\ue0ae\u2d72\ue84d㫇\u0003\u0000\u0000\u0003\ue0ae\u2d72ᐉ\u0000ﷴ㦵ᐉ\u0001\ue84d㫇ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new alxn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alxn.class);
            default:
                return null;
        }
    }
}
