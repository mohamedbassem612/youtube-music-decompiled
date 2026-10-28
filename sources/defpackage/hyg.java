package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hyg extends hya implements AdapterView.OnItemClickListener {
    public hyt k;
    public xgm l;
    public vxz m;
    private final List n = new ArrayList();
    private xgn o;

    private static xgz o(xgt xgtVar, int i) {
        return new xgx(xgtVar, xhb.b(i));
    }

    private static amdd p(String str, boolean z) {
        aihf aihfVarCreateBuilder = amdv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amdv amdvVar = (amdv) aihfVarCreateBuilder.instance;
        str.getClass();
        amdvVar.b |= 1;
        amdvVar.c = str;
        if (z) {
            aihfVarCreateBuilder.copyOnWrite();
            amdv amdvVar2 = (amdv) aihfVarCreateBuilder.instance;
            amdvVar2.b |= 2;
            amdvVar2.d = true;
        }
        aihf aihfVarCreateBuilder2 = amdd.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder2.instance;
        amdv amdvVar3 = (amdv) aihfVarCreateBuilder.build();
        amdvVar3.getClass();
        amddVar.s = amdvVar3;
        amddVar.c |= 32768;
        return (amdd) aihfVarCreateBuilder2.build();
    }

    @Override // defpackage.qnw
    protected final int i() {
        return 0;
    }

    @Override // defpackage.qnw
    protected final /* bridge */ /* synthetic */ ListAdapter k() {
        xgn xgnVarHB;
        xgt xgtVarA;
        cf cfVarRequireActivity = requireActivity();
        adyd adydVar = new adyd(cfVarRequireActivity);
        List list = this.n;
        list.clear();
        this.o = null;
        wiw[] wiwVarArr = this.k.c;
        if (wiwVarArr != null && wiwVarArr.length > 0) {
            int i = 0;
            while (i < wiwVarArr.length) {
                hxv hxvVar = new hxv(cfVarRequireActivity, wiwVarArr[i]);
                hxvVar.e(i == this.k.d);
                adydVar.add(hxvVar);
                i++;
            }
            if (this.m.l(137, 45858970L, false) && (xgnVarHB = this.l.hB()) != null && (xgtVarA = xgnVarHB.a()) != null) {
                this.o = xgnVarHB;
                xgz xgzVarO = o(xgtVarA, 93924);
                xgnVarHB.l(xgzVarO);
                for (int i2 = 0; i2 < adydVar.getCount(); i2++) {
                    hxv hxvVar2 = (hxv) adydVar.getItem(i2);
                    if (hxvVar2 != null) {
                        xgz xgzVarO2 = o(xgtVarA, 93925);
                        xgnVarHB.e(xgzVarO2, xgzVarO);
                        xgnVarHB.w(xgzVarO2, p(hxvVar2.a(), hxvVar2.b));
                        list.add(xgzVarO2);
                    }
                }
            }
        }
        return adydVar;
    }

    @Override // defpackage.qnw
    protected final String l() {
        return null;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        hxv hxvVar = (hxv) ((adyd) this.r).getItem(i);
        if (hxvVar != null) {
            if (this.m.l(137, 45858970L, false)) {
                String strA = hxvVar.a();
                if (this.o != null && i >= 0) {
                    List list = this.n;
                    if (i < list.size()) {
                        this.o.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, (xgz) list.get(i), p(strA, false));
                    }
                }
            }
            this.k.b.b(((wiw) hxvVar.a).a);
        }
        super.iQ(false, false, false);
    }

    @Override // defpackage.cc
    public final void onPause() {
        super.onPause();
        this.k.g = null;
        super.iQ(false, false, false);
    }

    @Override // defpackage.cc
    public final void onResume() {
        super.onResume();
        this.k.g = this;
    }

    @Override // defpackage.qnw
    protected final AdapterView.OnItemClickListener j() {
        return this;
    }
}
