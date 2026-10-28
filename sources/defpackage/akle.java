package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akle extends aihn implements aiis {
    public static final akle a;
    private int b;
    private akld c;
    private byte d = 2;

    static {
        akle akleVar = new akle();
        a = akleVar;
        aihn.registerDefaultInstance(akle.class, akleVar);
    }

    private akle() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue719ⵞ\ue719ⵞ\u0001\u0000\u0000\u0001\ue719ⵞᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new akle();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akle.class);
            default:
                return null;
        }
    }
}
