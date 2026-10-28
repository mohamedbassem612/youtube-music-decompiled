package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alqn extends aihn implements aiis {
    public static final alqn a;
    public alop b;
    private int c;
    private aiip d = aiip.a;
    private byte e = 2;

    static {
        alqn alqnVar = new alqn();
        a = alqnVar;
        aihn.registerDefaultInstance(alqn.class, alqnVar);
    }

    private alqn() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0001\u0000\u0001\u0001ᐉ\u0000\u00032", new Object[]{"c", "b", "d", new ahud(aika.STRING, "", aika.MESSAGE, apqh.a)});
            case 3:
                return new alqn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alqn.class);
            default:
                return null;
        }
    }
}
