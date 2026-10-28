package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acva implements wfv {
    public boolean a = false;
    public String b;
    public String c;

    public acva(abvn abvnVar) {
        ((avlh) abvnVar.r().f).al(new acte(this, 20), new acrr(7));
    }

    @Override // defpackage.wfv
    public final void c(Bundle bundle) {
        String str = this.b;
        if (str != null) {
            bundle.putString("CPN", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            bundle.putString("video_id", str2);
        }
        bundle.putString("feedback_from_immersive_live", true != this.a ? "NO" : "YES");
    }

    @Override // defpackage.wfv
    public final void b(Bundle bundle) {
    }
}
