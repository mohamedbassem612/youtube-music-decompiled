package defpackage;

import android.widget.ListAdapter;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyt implements hyi, abhw {
    public final cf a;
    public abhw b;
    public wiw[] c;
    public int d;
    public boolean e;
    public boolean f;
    public hyg g;
    public final adyj h;
    public final hwe i = new hwe(this);
    private final agfr j;
    private boolean k;

    public hyt(cf cfVar) {
        this.a = cfVar;
        adyj adyjVar = new adyj(cfVar, cfVar.getString(R.string.quality_title));
        this.h = adyjVar;
        aduk adukVar = new aduk(cfVar, R.drawable.yt_outline_gear_white_24);
        adukVar.d(R.color.quantum_grey600);
        adyjVar.f = adukVar.a();
        this.j = aguu.al(new cbr(this, 13));
    }

    @Override // defpackage.hyi
    public final anfv a() {
        if (e()) {
            return (anfv) this.j.io();
        }
        return null;
    }

    @Override // defpackage.abhw
    public final void b(int i) {
        throw null;
    }

    public final void c(boolean z) {
        this.k = z;
        this.h.g(e());
    }

    public final void d(wiw[] wiwVarArr, int i, boolean z) {
        ListAdapter listAdapter;
        this.c = wiwVarArr;
        this.d = i;
        this.e = z;
        hyg hygVar = this.g;
        if (hygVar != null && (listAdapter = hygVar.r) != null) {
            ((adyd) listAdapter).notifyDataSetChanged();
        }
        String str = null;
        if (wiwVarArr != null && i >= 0 && i < wiwVarArr.length) {
            str = wiwVarArr[i].b;
        }
        this.h.f(str);
    }

    public final boolean e() {
        return this.k && !this.f;
    }
}
