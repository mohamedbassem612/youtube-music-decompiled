package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dup implements nr {
    @Override // defpackage.nr
    public final void hO(View view) {
        nq nqVar = (nq) view.getLayoutParams();
        if (nqVar.width != -1 || nqVar.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override // defpackage.nr
    public final void b(View view) {
    }
}
