package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.libraries.youtube.engagementpanel.size.EngagementPanelSizeBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vqs implements dos {
    public final agev a;
    public final agev b;
    public final boolean c;
    public final boolean d;
    public final bog e;
    public final Optional f;
    public String g;
    final tuv h;
    public final vor i;
    public final vxz k;
    public final ahto m;
    private final View n;
    private final int p;
    private final agev q;
    private final vnh r;
    private final boolean s;
    private final boolean t;
    private final dou u;
    private final vwt v;
    public tss j = null;
    public hed l = null;
    private final avmm o = new avmm();

    public vqs(final View view, int i, agev agevVar, boolean z, boolean z2, boolean z3, final boolean z4, final vor vorVar, vnh vnhVar, vwt vwtVar, ahto ahtoVar, agev agevVar2, agev agevVar3, vxz vxzVar, dou douVar, bog bogVar, Optional optional) {
        this.n = view;
        this.p = i;
        this.q = agevVar;
        this.s = z;
        this.t = z2;
        this.c = z3;
        this.d = z4;
        this.i = vorVar;
        this.v = vwtVar;
        this.m = ahtoVar;
        this.r = vnhVar;
        this.a = agevVar2;
        this.b = agevVar3;
        this.k = vxzVar;
        this.u = douVar;
        this.e = bogVar;
        this.f = optional;
        this.h = new tuv() { // from class: vqm
            @Override // defpackage.tuv
            public final void a(int i2, tss tssVar) {
                if (i2 == 0 && vorVar.k() == null) {
                    tuk.l(view.findViewById(true != z4 ? R.id.app_engagement_panel_wrapper : R.id.watch_engagement_panel_wrapper), false);
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.dos
    public final Bundle a() {
        vop vopVar;
        int i;
        Optional optional = this.f;
        ahno.O(optional.isPresent());
        this.g.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("uuid_state_key", this.g);
        Object obj = optional.get();
        String str = this.g;
        aihf aihfVarCreateBuilder = vsv.a.createBuilder();
        aihf aihfVarCreateBuilder2 = vss.a.createBuilder();
        vor vorVar = this.i;
        Map map = vorVar.a.a;
        j$.util.Map.EL.forEach(map, new gpd(aihfVarCreateBuilder2, 8));
        vss vssVar = (vss) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        vsv vsvVar = (vsv) aihfVarCreateBuilder.instance;
        vssVar.getClass();
        vsvVar.d = vssVar;
        vsvVar.b |= 2;
        aihf aihfVarCreateBuilder3 = vsu.a.createBuilder();
        ArrayDeque arrayDeque = vorVar.b.a;
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            aihf aihfVarCreateBuilder4 = vsx.a.createBuilder();
            Iterator itDescendingIterator2 = ((ArrayDeque) ((xsc) itDescendingIterator.next()).c).descendingIterator();
            while (itDescendingIterator2.hasNext()) {
                String str2 = ((vot) itDescendingIterator2.next()).a;
                aihfVarCreateBuilder4.copyOnWrite();
                vsx vsxVar = (vsx) aihfVarCreateBuilder4.instance;
                str2.getClass();
                aiie aiieVar = vsxVar.b;
                if (!aiieVar.c()) {
                    vsxVar.b = aihn.mutableCopy(aiieVar);
                }
                vsxVar.b.add(str2);
            }
            aihfVarCreateBuilder3.copyOnWrite();
            vsu vsuVar = (vsu) aihfVarCreateBuilder3.instance;
            vsx vsxVar2 = (vsx) aihfVarCreateBuilder4.build();
            vsxVar2.getClass();
            aiie aiieVar2 = vsuVar.b;
            if (!aiieVar2.c()) {
                vsuVar.b = aihn.mutableCopy(aiieVar2);
            }
            vsuVar.b.add(vsxVar2);
        }
        vsu vsuVar2 = (vsu) aihfVarCreateBuilder3.build();
        aihfVarCreateBuilder.copyOnWrite();
        vsv vsvVar2 = (vsv) aihfVarCreateBuilder.instance;
        vsuVar2.getClass();
        vsvVar2.e = vsuVar2;
        vsvVar2.b |= 4;
        vsv vsvVar3 = (vsv) aihfVarCreateBuilder.build();
        vun vunVar = vorVar.d.u;
        String strK = vorVar.I() ? vorVar.k() : null;
        if (vorVar.v.l(372, 45812899L, false)) {
            HashMap map2 = new HashMap();
            for (vou vouVar : map.values()) {
                adxd adxdVarQ = vouVar.b.q();
                if (adxdVarQ != null) {
                    map2.put(vouVar.a, adxdVarQ);
                }
            }
            vopVar = new vop(map2, vunVar, strK);
        } else {
            HashMap map3 = new HashMap();
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                for (vot votVar : (ArrayDeque) ((xsc) it.next()).c) {
                    adxd adxdVarQ2 = votVar.b.q();
                    if (adxdVarQ2 != null) {
                        map3.put(votVar.a, adxdVarQ2);
                    }
                }
            }
            vopVar = new vop(map3, vunVar, strK);
        }
        abxv abxvVar = (abxv) obj;
        if (!((vxz) abxvVar.c).l(372, 45812899L, false)) {
            ?? r5 = abxvVar.d;
            Collection.EL.removeIf(r5, new uso(str, 15));
            ArrayDeque arrayDeque2 = (ArrayDeque) r5;
            arrayDeque2.add(new vvi(str, vopVar));
            while (true) {
                i = 8;
                if (arrayDeque2.size() <= 8) {
                    break;
                }
                arrayDeque2.removeFirst();
            }
        } else {
            abxvVar.b.put(str, new xpl(vsvVar3, vopVar, (short[]) null));
            i = 8;
        }
        taf.j(afxd.f(((abxv) abxvVar.a).u()).h(new row(str, vsvVar3, i), MoreExecutors.directExecutor()).g(new sdp(19), MoreExecutors.directExecutor()), new tsq(9));
        return bundle;
    }

    public final void b() {
        tss tssVar = this.j;
        if (tssVar != null) {
            tssVar.f(this.h);
        }
        this.o.b();
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v18, types: [awmd, java.lang.Object] */
    public final void c() {
        adxd adxdVar;
        ListenableFuture listenableFutureG;
        int i = 0;
        awdh awdhVar = new awdh(0);
        avnn avnnVar = atqp.l;
        View view = this.n;
        AccessibilityLayerLayout accessibilityLayerLayout = (AccessibilityLayerLayout) view.findViewById(this.p);
        agev agevVar = this.q;
        if (agevVar.g()) {
            View viewFindViewById = view.findViewById(((Integer) agevVar.c()).intValue());
            if (viewFindViewById == null || !tuk.q(accessibilityLayerLayout, viewFindViewById)) {
                accessibilityLayerLayout.b(false);
            } else {
                accessibilityLayerLayout.a = viewFindViewById.getId();
                accessibilityLayerLayout.d = viewFindViewById;
                accessibilityLayerLayout.b(true);
            }
        }
        boolean z = this.d;
        View viewFindViewById2 = accessibilityLayerLayout.findViewById(true != z ? R.id.app_engagement_panel_wrapper : R.id.watch_engagement_panel_wrapper);
        RelativeLayout relativeLayout = (RelativeLayout) viewFindViewById2.findViewById(true != z ? R.id.app_engagement_panel : R.id.watch_engagement_panel);
        RelativeLayout relativeLayout2 = this.s ? (RelativeLayout) viewFindViewById2.findViewById(R.id.engagement_panel_lower_view) : null;
        final vor vorVar = this.i;
        relativeLayout.getClass();
        if (vorVar.i != relativeLayout) {
            vorVar.m = false;
        }
        vorVar.i = relativeLayout;
        vorVar.j = relativeLayout2;
        vorVar.b.d = vorVar;
        vorVar.l = true;
        relativeLayout.setOnTouchListener(new jot(this, 4));
        vuk vukVar = vorVar.d;
        EngagementPanelSizeBehavior engagementPanelSizeBehavior = vukVar.b;
        engagementPanelSizeBehavior.b = vukVar;
        engagementPanelSizeBehavior.c = relativeLayout;
        tym.h(relativeLayout, new tyf(engagementPanelSizeBehavior), asv.class);
        avmm avmmVar = this.o;
        avmmVar.e(this.r.a(relativeLayout, accessibilityLayerLayout, awdhVar));
        int i2 = 17;
        int i3 = 6;
        if (this.k.l(113, 45624532L, false)) {
            avmmVar.c(avlh.g(vukVar.q, vukVar.i, awdhVar.r().g(avla.e), new vqp(i)).ak(new rtn(relativeLayout, i2)));
        } else {
            avmmVar.c(avlh.f(vukVar.q, awdhVar.r().g(avla.e), new idi(i3)).ak(new rtn(relativeLayout, 18)));
        }
        tuv tuvVar = this.h;
        tss tssVarL = vorVar.L();
        this.j = tssVarL;
        tssVarL.d(tuvVar);
        avmmVar.c(((avlh) vorVar.w.c).ak(new vqn(this, accessibilityLayerLayout, viewFindViewById2, i)));
        int i4 = 9;
        if (this.t) {
            View viewFindViewById3 = viewFindViewById2.findViewById(true != z ? R.id.scrim : R.id.watch_engagement_panel_scrim);
            vwt vwtVar = this.v;
            tss tssVar = new tss(viewFindViewById3);
            vxz vxzVar = (vxz) vwtVar.a.io();
            vxzVar.getClass();
            final hed hedVar = new hed(tssVar, vxzVar);
            this.l = hedVar;
            tzk.C(vukVar.p, vukVar.c.f(), ((avlh) hedVar.b).E().p()).p().x(new avno() { // from class: vtb
                @Override // defpackage.avno
                public final boolean a(Object obj) {
                    if (((vxz) hedVar.a).l(26, 45418396L, false)) {
                        vor vorVar2 = vorVar;
                        if (vorVar2.j != null && vorVar2.b.b() > 1) {
                            return false;
                        }
                    }
                    return true;
                }
            }).ak(new jbq(hedVar, vorVar, 7, null));
            ahto ahtoVar = this.m;
            avuu avuuVar = new avuu(aktz.ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_NOOP);
            avnn avnnVar2 = atqp.j;
            avmmVar.c(avuuVar.k(((avlh) ahtoVar.b).H(new tfk(i4)).p()).ak(new jbq(this, viewFindViewById3, i3, null)));
        }
        agev agevVar2 = this.b;
        if (agevVar2.g()) {
            vorVar.k = ((voj) agevVar2.c()).a();
        }
        if (this.f.isPresent()) {
            dou douVar = this.u;
            douVar.b("engagement_panel_controller_initializer_state_key", this);
            Optional optionalOfNullable = Optional.ofNullable(douVar.a("engagement_panel_controller_initializer_state_key"));
            hkp hkpVar = new hkp(this, 10);
            if (true == optionalOfNullable.isPresent()) {
                Object obj = optionalOfNullable.get();
                Object obj2 = hkpVar.a;
                Bundle bundle = (Bundle) obj;
                if (!((vqs) obj2).f.isPresent()) {
                    throw new IllegalStateException();
                }
                Optional optionalOfNullable2 = Optional.ofNullable(bundle.getString("uuid_state_key"));
                urh urhVar = new urh(obj2, 20);
                if (true == optionalOfNullable2.isPresent()) {
                    Object obj3 = optionalOfNullable2.get();
                    Object obj4 = urhVar.a;
                    String str = (String) obj3;
                    vqs vqsVar = (vqs) obj4;
                    vqsVar.g = str;
                    abxv abxvVar = (abxv) vqsVar.f.get();
                    int i5 = 5;
                    if (((vxz) abxvVar.c).l(372, 45812899L, false)) {
                        xpl xplVar = (xpl) abxvVar.b.remove(str);
                        if (xplVar == null) {
                            adxdVar = null;
                        } else if (abxv.t((vsv) xplVar.b)) {
                            listenableFutureG = new aher(Optional.of(xplVar));
                        } else {
                            twu.d(twu.a, 5, "Dropping invalid EngagementPanelSavedState.", null);
                            listenableFutureG = new aher(Optional.empty());
                        }
                        taf.l(vqsVar.e, listenableFutureG, new jco(19), new uny(obj4, 13));
                    } else {
                        ?? r1 = abxvVar.d;
                        Optional optionalFindFirst = Collection.EL.stream(r1).filter(new uso(str, i2)).findFirst();
                        if (true == optionalFindFirst.isPresent()) {
                            optionalFindFirst = Optional.ofNullable(((vvi) optionalFindFirst.get()).b);
                        }
                        adxdVar = (adxd) optionalFindFirst.orElse(null);
                        Collection.EL.removeIf(r1, new uso(str, 14));
                    }
                    listenableFutureG = afxd.f(((abxv) abxvVar.a).u()).h(new oly(i5), MoreExecutors.directExecutor()).g(new tvm(str, adxdVar, i4, null), MoreExecutors.directExecutor());
                    taf.l(vqsVar.e, listenableFutureG, new jco(19), new uny(obj4, 13));
                }
            }
            if (this.g == null) {
                this.g = UUID.randomUUID().toString();
            }
        }
    }
}
