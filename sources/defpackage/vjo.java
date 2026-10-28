package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vjo implements vip {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vjo(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.vip
    public final boolean a(vjb vjbVar) {
        if (this.$cid == 0) {
            vjq vjqVar = (vjq) this.a;
            if (vjqVar.m) {
                if (vjbVar.b() == vjqVar.i.getContext().getResources().getColor(R.color.sticker_picker_color_royal_blue)) {
                    return true;
                }
            } else if (vjbVar.b() == vjqVar.i.getContext().getResources().getColor(R.color.sticker_picker_color_white)) {
                return true;
            }
        } else if (vjbVar.b() == ((Integer) this.a).intValue()) {
            return true;
        }
        return false;
    }
}
