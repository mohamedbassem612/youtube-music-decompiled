package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amab extends aihn implements aiis {
    public static final amab a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        amab amabVar = new amab();
        a = amabVar;
        aihn.registerDefaultInstance(amab.class, amabVar);
    }

    private amab() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0000\ue607⨅\ue008\uf577\u0007\t\u0000\u0000\t\ue607⨅м\u0000\uefcf⸵м\u0000突ハм\u0000ﭴ㨬м\u0000\ueb41䣥м\u0000\ue60b囤м\u0000\ue1c0ꉹм\u0000\uefaa좴м\u0000\ue008\uf577\u0007м\u0000", new Object[]{"c", "b", arat.class, amzh.class, akmg.class, albw.class, aqof.class, ajws.class, akdp.class, ajlz.class, akty.class});
            case 3:
                return new amab();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amab.class);
            default:
                return null;
        }
    }
}
