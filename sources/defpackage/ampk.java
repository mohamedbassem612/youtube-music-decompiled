package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ampk extends aihn implements aiis {
    public static final ampk a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        ampk ampkVar = new ampk();
        a = ampkVar;
        aihn.registerDefaultInstance(ampk.class, ampkVar);
    }

    private ampk() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0000\uf6dc㰼\ue9ba\uf05c\u0007\u0006\u0000\u0000\u0006\uf6dc㰼м\u0000\ue68a㶈м\u0000\uf407媆м\u0000識纽м\u0000漢쌷м\u0000\ue9ba\uf05c\u0007м\u0000", new Object[]{"c", "b", aktm.class, amnw.class, amqd.class, amps.class, amqh.class, amqc.class});
            case 3:
                return new ampk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ampk.class);
            default:
                return null;
        }
    }
}
