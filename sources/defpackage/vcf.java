package defpackage;

import android.app.Activity;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.geo.LocationSearchView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vcf extends nh {
    public List a = new ArrayList();
    public vce e;
    private final LayoutInflater f;
    private final qcb g;

    public vcf(LayoutInflater layoutInflater, qcb qcbVar) {
        this.f = layoutInflater;
        this.g = qcbVar;
    }

    @Override // defpackage.nh
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ oh e(ViewGroup viewGroup, int i) {
        return new vch(this.f.inflate(R.layout.metadataeditor_location_search_item, viewGroup, false), this.e, this.g);
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void o(oh ohVar, int i) {
        alay alayVar;
        alay alayVar2;
        final vch vchVar = (vch) ohVar;
        final anip anipVar = (anip) this.a.get(i);
        TextView textView = vchVar.s;
        if ((anipVar.b & 2) != 0) {
            alayVar = anipVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        textView.setText(ackj.k(null, alayVar, null, false));
        TextView textView2 = vchVar.t;
        if ((anipVar.b & 4) != 0) {
            alayVar2 = anipVar.e;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        textView2.setText(ackj.k(null, alayVar2, null, false));
        vchVar.a.setOnClickListener(new View.OnClickListener() { // from class: vcg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vch vchVar2 = vchVar;
                int i2 = 1;
                ((LocationSearchView) vchVar2.v.a).a(true);
                anip anipVar2 = anipVar;
                vcc vccVar = vchVar2.u.c;
                String str = anipVar2.c;
                alay alayVar3 = anipVar2.d;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
                vci vciVar = new vci(str, ackj.k(null, alayVar3, null, false).toString());
                vgw vgwVar = (vgw) vccVar;
                vgwVar.f.b(vgwVar.n, vgwVar.m);
                vgwVar.k.setVisibility(8);
                vgwVar.j.a();
                vgwVar.h.l(new xgj(xhb.b(65452)));
                auaq auaqVar = auaq.a;
                aihf aihfVarCreateBuilder = auaqVar.createBuilder();
                ArrayList arrayList = new ArrayList();
                arrayList.add(auar.LOCATION_NORMAL);
                arrayList.add(auar.LOCATION_LIGHT);
                auap auapVar = auap.a;
                aihf aihfVarCreateBuilder2 = auapVar.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                auap auapVar2 = (auap) aihfVarCreateBuilder2.instance;
                aihv aihvVar = auapVar2.d;
                if (!aihvVar.c()) {
                    auapVar2.d = aihn.mutableCopy(aihvVar);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    auapVar2.d.h(((auar) it.next()).d);
                }
                auar auarVar = vgw.b;
                aihfVarCreateBuilder2.copyOnWrite();
                auap auapVar3 = (auap) aihfVarCreateBuilder2.instance;
                int i3 = auarVar.d;
                auapVar3.c = i3;
                auapVar3.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                auaq auaqVar2 = (auaq) aihfVarCreateBuilder.instance;
                auap auapVar4 = (auap) aihfVarCreateBuilder2.build();
                auapVar4.getClass();
                auaqVar2.f = auapVar4;
                auaqVar2.b |= 8;
                aihf aihfVarCreateBuilder3 = auat.a.createBuilder();
                auas auasVar = auas.a;
                aihf aihfVarCreateBuilder4 = auasVar.createBuilder();
                boolean z = vgwVar.o;
                aihfVarCreateBuilder4.copyOnWrite();
                auas auasVar2 = (auas) aihfVarCreateBuilder4.instance;
                auasVar2.b |= 1;
                auasVar2.e = z;
                aihfVarCreateBuilder4.copyOnWrite();
                auas auasVar3 = (auas) aihfVarCreateBuilder4.instance;
                auaq auaqVar3 = (auaq) aihfVarCreateBuilder.build();
                auaqVar3.getClass();
                auasVar3.d = auaqVar3;
                auasVar3.c = 3;
                boolean zE = vgwVar.q.E();
                aihfVarCreateBuilder4.copyOnWrite();
                auas auasVar4 = (auas) aihfVarCreateBuilder4.instance;
                auasVar4.b |= 2;
                auasVar4.f = zE;
                aihfVarCreateBuilder3.copyOnWrite();
                auat auatVar = (auat) aihfVarCreateBuilder3.instance;
                auas auasVar5 = (auas) aihfVarCreateBuilder4.build();
                auasVar5.getClass();
                auatVar.e = auasVar5;
                auatVar.b |= 4;
                auas auasVar6 = ((auat) aihfVarCreateBuilder3.instance).e;
                if (auasVar6 == null) {
                    auasVar6 = auasVar;
                }
                aihf builder = auasVar6.toBuilder();
                auas auasVar7 = ((auat) aihfVarCreateBuilder3.instance).e;
                if (auasVar7 == null) {
                    auasVar7 = auasVar;
                }
                auaq auaqVar4 = auasVar7.c == 3 ? (auaq) auasVar7.d : auaqVar;
                String str2 = vciVar.a;
                aihf builder2 = auaqVar4.toBuilder();
                builder2.copyOnWrite();
                auaq auaqVar5 = (auaq) builder2.instance;
                str2.getClass();
                auaqVar5.b |= 2;
                auaqVar5.d = str2;
                String str3 = vciVar.b;
                builder2.copyOnWrite();
                auaq auaqVar6 = (auaq) builder2.instance;
                str3.getClass();
                auaqVar6.b |= 4;
                auaqVar6.e = str3;
                auas auasVar8 = ((auat) aihfVarCreateBuilder3.instance).e;
                if (auasVar8 != null) {
                    auasVar = auasVar8;
                }
                if (auasVar.c == 3) {
                    auaqVar = (auaq) auasVar.d;
                }
                auap auapVar5 = auaqVar.f;
                if (auapVar5 != null) {
                    auapVar = auapVar5;
                }
                aihf builder3 = auapVar.toBuilder();
                builder3.copyOnWrite();
                auap auapVar6 = (auap) builder3.instance;
                auapVar6.c = i3;
                auapVar6.b |= 1;
                builder2.copyOnWrite();
                auaq auaqVar7 = (auaq) builder2.instance;
                auap auapVar7 = (auap) builder3.build();
                auapVar7.getClass();
                auaqVar7.f = auapVar7;
                auaqVar7.b |= 8;
                builder.copyOnWrite();
                auas auasVar9 = (auas) builder.instance;
                auaq auaqVar8 = (auaq) builder2.build();
                auaqVar8.getClass();
                auasVar9.d = auaqVar8;
                auasVar9.c = 3;
                aihfVarCreateBuilder3.copyOnWrite();
                auat auatVar2 = (auat) aihfVarCreateBuilder3.instance;
                auas auasVar10 = (auas) builder.build();
                auasVar10.getClass();
                auatVar2.e = auasVar10;
                auatVar2.b |= 4;
                int iIntValue = ((Integer) vgw.a.get(auarVar)).intValue();
                Activity activity = vgwVar.c;
                View viewInflate = LayoutInflater.from(new ContextThemeWrapper(activity, iIntValue)).inflate(R.layout.location_sticker, new FrameLayout(activity));
                ((TextView) viewInflate.findViewById(R.id.text)).setText(str3);
                yno.fH(activity, vgwVar.p, viewInflate, aihfVarCreateBuilder3, new vid(vccVar, i2));
            }
        });
    }
}
