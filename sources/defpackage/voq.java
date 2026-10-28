package defpackage;

import android.R;
import android.content.res.Resources;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class voq extends tss {
    final /* synthetic */ vor e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voq(vor vorVar) {
        super(vorVar.i);
        this.e = vorVar;
    }

    @Override // defpackage.tss
    public final void h(boolean z, boolean z2) {
        amve amveVar = this.e.g.b().f;
        if (amveVar == null) {
            amveVar = amve.a;
        }
        if ((amveVar.b & 67108864) != 0) {
            long j = amveVar.g;
            this.d = j;
            this.c = j;
        } else {
            View view = this.a;
            Resources resources = view.getResources();
            this.d = resources != null ? resources.getInteger(R.integer.config_mediumAnimTime) : 0;
            Resources resources2 = view.getResources();
            this.c = resources2 != null ? resources2.getInteger(R.integer.config_mediumAnimTime) : 0;
        }
        super.h(z, true);
    }
}
