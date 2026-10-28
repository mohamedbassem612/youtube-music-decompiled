package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyc extends hxw implements AdapterView.OnItemClickListener {
    public arbl[] k;
    public int l;
    public abgt m;
    public adyd n;
    public xgn o;
    private boolean p;

    public static void q(Context context, adyd adydVar, arbl[] arblVarArr, int i) {
        if (arblVarArr != null) {
            int i2 = 0;
            while (i2 < arblVarArr.length) {
                hxt hxtVar = new hxt(context, arblVarArr[i2]);
                hxtVar.e(i2 == i);
                adydVar.add(hxtVar);
                i2++;
            }
        }
    }

    @Override // defpackage.qnw
    protected final int i() {
        return 2;
    }

    @Override // defpackage.qnw
    protected final String l() {
        return getResources().getString(R.string.playback_rate_title);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qnw
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final adyd k() {
        cf cfVarRequireActivity = requireActivity();
        adyd adydVar = new adyd(cfVarRequireActivity);
        q(cfVarRequireActivity, adydVar, this.k, this.l);
        return adydVar;
    }

    @Override // defpackage.qnw, defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(R.layout.tinted_title_bottom_sheet_list_view, viewGroup, false);
        ListView listView = (ListView) viewInflate.findViewById(R.id.bottom_sheet_list_view);
        adyd adydVarK = k();
        this.n = adydVarK;
        listView.setAdapter((ListAdapter) adydVarK);
        listView.setOnItemClickListener(this);
        xgj xgjVar = new xgj(xhb.b(160339));
        this.o.l(xgjVar);
        listView.addFooterView(layoutInflater.inflate(R.layout.trim_silence_switch_view, (ViewGroup) null));
        SwitchCompat switchCompat = (SwitchCompat) viewInflate.findViewById(R.id.trim_silence_switch);
        switchCompat.setChecked(this.p);
        switchCompat.setOnCheckedChangeListener(new dlm(this, 3, null));
        switchCompat.setOnClickListener(new gdp(this, switchCompat, 8, null));
        viewInflate.findViewById(R.id.trim_silence_root).setOnClickListener(new gdp(this, switchCompat, 9, null));
        this.o.m(new xgj(xhb.b(211162)), xgjVar);
        ((TextView) viewInflate.findViewById(R.id.bottom_sheet_title)).setText(l());
        return viewInflate;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        adyd adydVar = this.n;
        if (adydVar != null) {
            hxt hxtVar = (hxt) adydVar.getItem(i);
            abgt abgtVar = this.m;
            if (abgtVar != null && hxtVar != null) {
                hyn hynVar = (hyn) abgtVar;
                abgu abguVar = (abgu) hynVar.a;
                abvk abvkVar = abguVar.a;
                float f = hxtVar.a;
                abvkVar.J(f);
                abguVar.b(aaxh.a(abguVar.b), abvkVar.a());
                taf.j(hynVar.b.e.p(f), new hou(10));
            }
        }
        super.iQ(false, false, false);
    }

    @Override // defpackage.cc
    public final void onPause() {
        super.onPause();
        super.iQ(false, false, false);
    }

    public final void p(boolean z) {
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amcx.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amcx amcxVar = (amcx) aihfVarCreateBuilder2.instance;
        amcxVar.c = (true != z ? 3 : 2) - 1;
        amcxVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
        amcx amcxVar2 = (amcx) aihfVarCreateBuilder2.build();
        amcxVar2.getClass();
        amddVar.l = amcxVar2;
        amddVar.b |= 32768;
        this.o.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(211162)), (amdd) aihfVarCreateBuilder.build());
    }

    public final void r(boolean z) {
        if (this.p != z) {
            this.p = z;
            View view = getView();
            if (view != null) {
                ((SwitchCompat) view.findViewById(R.id.trim_silence_switch)).setChecked(this.p);
            }
        }
    }

    @Override // defpackage.qnw
    protected final AdapterView.OnItemClickListener j() {
        return this;
    }
}
