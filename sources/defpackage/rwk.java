package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rwk implements rvq {
    private final /* synthetic */ int $cid;

    @Override // defpackage.rvq
    public final sko a(smr smrVar, sko skoVar) {
        aixg aixgVar;
        if (this.$cid != 0) {
            if (skoVar != null && ((aixgVar = skoVar.b) == aixg.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES || aixgVar == aixg.LAYOUT_TYPE_MEDIA || aixgVar == aixg.LAYOUT_TYPE_MEDIA_BREAK)) {
                return skoVar;
            }
        } else if (skoVar != null) {
            aixg aixgVar2 = skoVar.b;
            boolean z = true;
            if (aixgVar2 != aixg.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES && aixgVar2 != aixg.LAYOUT_TYPE_MEDIA && aixgVar2 != aixg.LAYOUT_TYPE_MEDIA_BREAK) {
                z = false;
            }
            ahno.R(z, "Expected LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES. Received %s", aixgVar2.name());
            return skoVar;
        }
        return null;
    }
}
