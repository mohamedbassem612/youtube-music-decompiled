package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alye extends aihn implements aiis {
    public static final alye a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alye alyeVar = new alye();
        a = alyeVar;
        aihn.registerDefaultInstance(alye.class, alyeVar);
    }

    private alye() {
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
                return newMessageInfo(a, "\u0001\u0013\u0001\u0000\u070e\ue857끞\u0013\u0000\u0000\u0013\u070eм\u0000ࣗм\u0000拓ᵕм\u0000\ue6c6Ὺм\u0000\ue0e7⏒м\u0000\uf006⢾м\u0000\uf1f8⨰м\u0000\uf5d9ⲵм\u0000\uf792ⳬм\u0000ﱙ㬷м\u0000\ue6d4䓥м\u0000\uf492䤳м\u0000\uec67䩗м\u0000\ue3db勁м\u0000\uea8e愮м\u0000\uf587淲м\u0000\ufe53髪м\u0000\uf2fcꭽм\u0000\ue857끞м\u0000", new Object[]{"c", "b", ajux.class, aokz.class, apqv.class, apqt.class, apqw.class, apqj.class, ajul.class, apqp.class, ajuv.class, ajum.class, ajuw.class, akrn.class, alcm.class, ajuu.class, ajuq.class, ajus.class, ajun.class, ajuo.class, ajut.class});
            case 3:
                return new alye();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alye.class);
            default:
                return null;
        }
    }
}
