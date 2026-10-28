package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alma extends aihn implements aiis {
    public static final alma a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alma almaVar = new alma();
        a = almaVar;
        aihn.registerDefaultInstance(alma.class, almaVar);
    }

    private alma() {
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
                return newMessageInfo(a, "\u0001%\u0001\u0000\uf321Ẑ\uefaa좴%\u0000\u0000%\uf321Ẑм\u0000\uf26a⤒м\u0000\ue607⨅м\u0000\uf88a\u2cf8м\u0000\uefcf⸵м\u0000￣⺒м\u0000\uec67むм\u0000突ハм\u0000\uf3fbヺм\u0000\uf1ca㟄м\u0000\ue422㢒м\u0000\ufddd㢧м\u0000\uf5a4㧕м\u0000︍㧬м\u0000︊㾮м\u0000\ue9e9䅮м\u0000\ue621䊃м\u0000ﲸ䍖м\u0000\ue8cb䔆м\u0000\ue493䣤м\u0000\ueb41䣥м\u0000\uf492䤳м\u0000\ueb17䪝м\u0000\uf2cb䬘м\u0000\ue684䭌м\u0000\ue923䶡м\u0000\ue8a1勇м\u0000ￗ勋м\u0000\ue60b囤м\u0000\uf175援м\u0000\ueb32棪м\u0000\ue860瞦м\u0000\uf396薼м\u0000\uf153詬м\u0000\ue1c0ꉹм\u0000ﹹ녆м\u0000\uefaa좴м\u0000", new Object[]{"c", "b", akdd.class, amfe.class, arat.class, anpb.class, amzh.class, akzr.class, aqqj.class, akmg.class, alhq.class, akwq.class, aqom.class, amet.class, aqjx.class, aqwk.class, aqwm.class, akzf.class, aqyl.class, aqyx.class, aqxh.class, aqym.class, aqof.class, akrn.class, aqts.class, aqtu.class, aqvr.class, albf.class, aqyt.class, aqwd.class, ajws.class, anrz.class, aqvd.class, aqxe.class, aqyk.class, aqxr.class, akdp.class, akzv.class, ajlz.class});
            case 3:
                return new alma();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alma.class);
            default:
                return null;
        }
    }
}
