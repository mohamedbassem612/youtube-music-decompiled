package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qle implements aihw {
    private final /* synthetic */ int $cid;

    public qle(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aihw
    public final /* synthetic */ Object a(int i) {
        switch (this.$cid) {
            case 0:
                ahnm ahnmVarA = ahnm.a(i);
                if (ahnmVarA != null) {
                    return ahnmVarA;
                }
                break;
            case 1:
                aier aierVarA = aier.a(i);
                return aierVarA == null ? aier.REGISTRATION_REASON_UNSPECIFIED : aierVarA;
            case 2:
                ahnm ahnmVarA2 = ahnm.a(i);
                if (ahnmVarA2 != null) {
                    return ahnmVarA2;
                }
                break;
            case 3:
                ajbf ajbfVarA = ajbf.a(i);
                return ajbfVarA == null ? ajbf.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_UNKNOWN : ajbfVarA;
            case 4:
                amyg amygVarA = amyg.a(i);
                return amygVarA == null ? amyg.MDX_DEVICE_DISCOVERY_STRATEGY_UNKNOWN : amygVarA;
            case 5:
                anil anilVarA = anil.a(i);
                return anilVarA == null ? anil.MOBILE_CONNECTION_TYPE_UNKNOWN : anilVarA;
            case 6:
                akua akuaVarA = akua.a(i);
                return akuaVarA == null ? akua.ENGAGEMENT_PANEL_SNAP_STATE_UNKNOWN : akuaVarA;
            case 7:
                akwl akwlVarA = akwl.a(i);
                return akwlVarA == null ? akwl.EXO_PLAYER_CONFIG_FEATURES_UNSPECIFIED : akwlVarA;
            case 8:
                amuk amukVarA = amuk.a(i);
                return amukVarA == null ? amuk.LOGGING_QUEUE_TYPE_UNKNOWN : amukVarA;
            case 9:
                ajuf ajufVarA = ajuf.a(i);
                return ajufVarA == null ? ajuf.CONN_DEFAULT : ajufVarA;
            default:
                apbw apbwVarA = apbw.a(i);
                return apbwVarA == null ? apbw.QOE_HOT_CONFIG_FEATURES_UNSPECIFIED : apbwVarA;
        }
        return ahnm.UNKNOWN;
    }
}
