package defpackage;

import com.facebook.litho.widget.LithoScrollView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mmn extends fhz {
    private final mmf l;
    private final oyg m;
    private LithoScrollView n;

    public mmn(mmf mmfVar, oyg oygVar) {
        super(null, null);
        this.l = mmfVar;
        this.m = oygVar;
    }

    @Override // defpackage.fhz
    public final void aw(LithoScrollView lithoScrollView) {
        if (lithoScrollView != null) {
            this.n = lithoScrollView;
            mmf mmfVar = this.l;
            mmfVar.j(this.m, false);
            mmfVar.c(lithoScrollView);
            return;
        }
        LithoScrollView lithoScrollView2 = this.n;
        if (lithoScrollView2 != null) {
            this.n = null;
            this.l.e(lithoScrollView2);
        }
    }
}
