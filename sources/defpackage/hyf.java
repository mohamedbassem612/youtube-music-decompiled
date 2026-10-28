package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyf extends hxz implements AdapterView.OnItemClickListener {
    public xgm k;
    public ArrayList l;
    public acca m;
    public abhh n;

    @Override // defpackage.qnw
    protected final int i() {
        return 0;
    }

    @Override // defpackage.qnw
    protected final /* bridge */ /* synthetic */ ListAdapter k() {
        cf cfVarRequireActivity = requireActivity();
        adyd adydVar = new adyd(cfVarRequireActivity);
        xgt xgtVarA = this.k.hB().a();
        if (xgtVarA != null) {
            this.k.hB().l(new xgx(xgtVarA, 107242));
        }
        ArrayList arrayList = this.l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                acca accaVar = (acca) arrayList.get(i);
                hxv hxvVar = new hxv(cfVarRequireActivity, accaVar);
                if (accaVar.g() && this.m == null) {
                    hxvVar.e(true);
                } else {
                    hxvVar.e(accaVar.equals(this.m));
                }
                adydVar.add(hxvVar);
            }
        }
        return adydVar;
    }

    @Override // defpackage.qnw
    protected final String l() {
        return getResources().getString(R.string.overflow_captions);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        abhh abhhVar;
        hxv hxvVar = (hxv) ((adyd) this.r).getItem(i);
        if (hxvVar != null && (abhhVar = this.n) != null) {
            acca accaVar = (acca) hxvVar.a;
            if (accaVar.e()) {
                ((abvk) abhhVar.a).g.d();
            } else {
                ((abvk) abhhVar.a).K(accaVar);
            }
        }
        super.iQ(false, false, false);
    }

    @Override // defpackage.qnw
    protected final AdapterView.OnItemClickListener j() {
        return this;
    }
}
