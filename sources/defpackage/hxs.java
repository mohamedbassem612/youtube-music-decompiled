package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxs extends hyb implements AdapterView.OnItemClickListener {
    public wgo[] k;
    public int l;
    public abfv m;

    @Override // defpackage.qnw
    protected final int i() {
        return 0;
    }

    @Override // defpackage.qnw
    protected final /* bridge */ /* synthetic */ ListAdapter k() {
        cf cfVarRequireActivity = requireActivity();
        adyd adydVar = new adyd(cfVarRequireActivity);
        if (this.k != null) {
            int i = 0;
            while (true) {
                wgo[] wgoVarArr = this.k;
                if (i >= wgoVarArr.length) {
                    break;
                }
                hxv hxvVar = new hxv(cfVarRequireActivity, wgoVarArr[i]);
                hxvVar.e(i == this.l);
                adydVar.add(hxvVar);
                i++;
            }
        }
        return adydVar;
    }

    @Override // defpackage.qnw
    protected final String l() {
        return getResources().getString(R.string.audio_tracks_title);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object obj;
        hxv hxvVar = (hxv) ((adyd) this.r).getItem(i);
        abfv abfvVar = this.m;
        if (abfvVar != null && hxvVar != null && (obj = hxvVar.a) != null) {
            ((abvk) abfvVar.a).F(((wgo) obj).a);
        }
        super.iQ(false, false, false);
    }

    @Override // defpackage.qnw
    protected final AdapterView.OnItemClickListener j() {
        return this;
    }
}
