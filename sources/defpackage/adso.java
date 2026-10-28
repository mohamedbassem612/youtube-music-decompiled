package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adso implements admn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ adsr a;

    public adso(adsr adsrVar, int i) {
        this.$cid = i;
        this.a = adsrVar;
    }

    @Override // defpackage.admb
    public final void a(adma admaVar, Object obj) {
        int i = this.$cid;
        adsr adsrVar = this.a;
        if (i != 0) {
            ((adwg) adsrVar).aQ();
            return;
        }
        aecs aecsVar = adsrVar.x;
        if (aecsVar == null || (obj instanceof acxm) || admaVar.a() == null) {
            return;
        }
        admaVar.a().setTag(R.id.flow_layout_manager_view_is_full_span_tag, Boolean.valueOf(aecsVar.d(obj)));
    }

    @Override // defpackage.admn
    public final void b() {
        if (this.$cid != 0) {
            ((adwg) this.a).aQ();
        }
    }
}
