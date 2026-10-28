package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akuh extends aihn implements aiis {
    public static final akuh a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        akuh akuhVar = new akuh();
        a = akuhVar;
        aihn.registerDefaultInstance(akuh.class, akuhVar);
    }

    private akuh() {
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
                return newMessageInfo(a, "\u00014\u0001\u0000К\uefa2\uf8ed\u00074\u0000\u00000Км\u0000Шм\u0000Ям\u0000ѣ<\u0000Ѥ<\u0000Ҁм\u0000ӭм\u0000ԅм\u0000զм\u0000ؽм\u0000ࡐм\u0000ॵм\u0000দм\u0000ਃм\u0000\u0aceм\u0000\u0b45м\u0000\u0b46м\u0000逄м\u0000逸м\u0000郉м\u0000\uef75rм\u0000\ue7f5ណм\u0000\uec06\u17efм\u0000\uf74f⩫м\u0000\ue8d8⮯м\u0000\uea01䆵м\u0000\uf492䤳м\u0000ﯡ䥼м\u0000\uf72c䰍м\u0000禮猞м\u0000ﲵ猶м\u0000連砆м\u0000神禠м\u0000ﾪ窐м\u0000\ued5f竊м\u0000\ue48e繓м\u0000\uec41芪м\u0000\ue0aa詙м\u0000\uf599鎒м\u0000\uf7f8頧м\u0000\uec75鬳м\u0000ﺪ鴡м\u0000\ue2cdꟊм\u0000ﹹ녆м\u0000\uf750뇚м\u0000\ue94e딛м\u0000\uf4da딧м\u0000\ue41f씊<\u0000\ue0f7퇥<\u0000ﴁ홁м\u0000\ue128\uf809\u0007м\u0000\uefa2\uf8ed\u0007м\u0000", new Object[]{"c", "b", amlo.class, arit.class, angl.class, apwj.class, apwi.class, aoub.class, alim.class, aota.class, ajky.class, aplm.class, amlk.class, aitl.class, amin.class, aolz.class, aqai.class, aito.class, aitp.class, aqks.class, amuy.class, aivb.class, aqsw.class, apoq.class, amgg.class, alie.class, aovg.class, apus.class, akrn.class, aqoz.class, akei.class, ajvd.class, ajvf.class, ajvh.class, aplj.class, aqxq.class, airq.class, aizt.class, apbz.class, akuk.class, amux.class, apnm.class, anfi.class, aozf.class, aqdx.class, akzv.class, aljh.class, ajzm.class, aqbv.class, akea.class, apvt.class, arkm.class, akmi.class, aipo.class});
            case 3:
                return new akuh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akuh.class);
            default:
                return null;
        }
    }
}
