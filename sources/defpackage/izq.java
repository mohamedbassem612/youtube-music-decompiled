package defpackage;

import android.app.Dialog;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class izq extends izm {
    public awmd o;
    public izt p;
    public xgn q;

    @Override // defpackage.izp
    public final int k() {
        return R.layout.music_menu_bottom_sheet_dialog_fragment;
    }

    @Override // defpackage.izp
    protected final adkz l() {
        admu admuVar = new admu();
        anfy anfyVar = (anfy) ((izp) this).m;
        if (anfyVar != null) {
            Iterator it = anfyVar.c.iterator();
            while (it.hasNext()) {
                admuVar.add((anfv) it.next());
            }
        }
        return admuVar;
    }

    @Override // defpackage.izp
    protected final adkz m() {
        anfy anfyVar = (anfy) ((izp) this).m;
        Object obj = null;
        if (anfyVar == null || (anfyVar.b & 4) == 0) {
            return null;
        }
        admu admuVar = new admu();
        ange angeVar = anfyVar.f;
        if (angeVar == null) {
            angeVar = ange.a;
        }
        if (angeVar != null) {
            int i = angeVar.b;
            if (i == 82258301) {
                obj = (angd) angeVar.c;
            } else if (i == 94310230) {
                obj = (akdh) angeVar.c;
            } else if (i == 72399185) {
                obj = (anrp) angeVar.c;
            }
        }
        if (obj != null) {
            admuVar.add(obj);
        }
        admuVar.e(new hde(6));
        return admuVar;
    }

    @Override // defpackage.izp
    protected final adlz n() {
        return new gob(this, 12);
    }

    @Override // defpackage.izp, defpackage.bp, defpackage.cc
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.f;
        if (dialog != null) {
            View viewFindViewById = dialog.findViewById(R.id.design_bottom_sheet);
            int dimensionPixelSize = viewFindViewById.getResources().getDimensionPixelSize(R.dimen.menu_padding);
            viewFindViewById.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, dimensionPixelSize);
            viewFindViewById.setBackground(null);
            this.l.setBackgroundResource(R.drawable.context_menu_background);
        }
    }

    @Override // defpackage.izp
    protected final boolean q() {
        return this.o.io() == null || ((WatchWhileLayout) this.o.io()).aa();
    }
}
