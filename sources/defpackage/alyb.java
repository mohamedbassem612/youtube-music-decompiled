package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alyb extends aihn implements aiis {
    public static final alyb a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alyb alybVar = new alyb();
        a = alybVar;
        aihn.registerDefaultInstance(alyb.class, alybVar);
    }

    private alyb() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000拓ᵕ\uf587淲\u0005\u0000\u0000\u0005拓ᵕм\u0000\ue6c6Ὺм\u0000\uf006⢾м\u0000\uf1f8⨰м\u0000\uf587淲м\u0000", new Object[]{"c", "b", apqv.class, apqt.class, apqj.class, ajul.class, ajus.class});
            case 3:
                return new alyb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alyb.class);
            default:
                return null;
        }
    }
}
