package defpackage;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class izl extends adwl implements izr {
    public static final /* synthetic */ int a = 0;
    private static final Duration g = Duration.ofMillis(2250);
    private final Context h;
    private final advb i;
    private final hpd j;
    private final izt k;
    private final adyr l;
    private final jnj m;
    private final ahek n;
    private final hef o;
    private final jnj p;

    /* JADX WARN: Illegal instructions before constructor call */
    public izl(Activity activity, vxe vxeVar, advb advbVar, ahek ahekVar, ci ciVar, hef hefVar, jnj jnjVar, ci ciVar2, hpd hpdVar, izt iztVar, adyr adyrVar, jnj jnjVar2, vxz vxzVar) {
        Optional optionalEmpty = Optional.empty();
        Optional.empty();
        Optional optionalEmpty2 = Optional.empty();
        Optional.of(vxzVar);
        super(activity, vxeVar, advbVar, ciVar, ahekVar, hefVar, jnjVar, ciVar2, optionalEmpty, optionalEmpty2, Optional.empty());
        this.h = activity;
        this.o = hefVar;
        this.p = jnjVar;
        this.n = ahekVar;
        this.i = advbVar;
        this.j = hpdVar;
        this.k = iztVar;
        this.l = adyrVar;
        this.m = jnjVar2;
        advbVar.b(anfv.class);
        advbVar.b(angf.class);
        advbVar.b(ange.class);
    }

    private final aevy o() {
        return (aevy) ((cf) this.h).getSupportFragmentManager().g("MUSIC_MENU_BOTTOM_SHEET_FRAGMENT_TAG");
    }

    private static void p(List list, anfv anfvVar) {
        if (anfvVar != null) {
            list.add(anfvVar);
        }
    }

    private final boolean q(anfv anfvVar) {
        anga angaVar = anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a;
        ajwo ajwoVar = angaVar.e;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apcb.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return false;
        }
        ajwo ajwoVar2 = angaVar.e;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apcb.b);
        ajwoVar2.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
        apcb apcbVar = (apcb) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        apcd apcdVar = apcbVar.d;
        if (apcdVar == null) {
            apcdVar = apcd.a;
        }
        if (apcdVar.e) {
            apcd apcdVar2 = apcbVar.d;
            if (apcdVar2 == null) {
                apcdVar2 = apcd.a;
            }
            if (!apcdVar2.c.isEmpty()) {
                apcd apcdVar3 = apcbVar.d;
                if (apcdVar3 == null) {
                    apcdVar3 = apcd.a;
                }
                try {
                    return ((Boolean) this.j.k(kro.aH(apcdVar3.c)).get(g.toMillis(), TimeUnit.MILLISECONDS)).booleanValue();
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.adva
    protected final List a(anfy anfyVar, Object obj) {
        agke agkeVarN;
        ArrayList arrayList = new ArrayList();
        for (anfv anfvVar : anfyVar.c) {
            ArrayList arrayList2 = new ArrayList();
            if (anfvVar == null) {
                agkeVarN = agpi.a;
            } else {
                if (aecm.s(anfvVar)) {
                    hef hefVar = this.o;
                    if (hefVar != null && hefVar.n(aecm.t(anfvVar) - 1)) {
                        p(arrayList2, anfvVar);
                    }
                } else if (acfz.al(anfvVar)) {
                    jnj jnjVar = this.p;
                    if (jnjVar != null) {
                        arrayList2.addAll(jnjVar.E(anfvVar));
                    }
                } else if (acfz.aj(anfvVar)) {
                    jnj jnjVar2 = this.p;
                    if (jnjVar2 != null) {
                        p(arrayList2, jnjVar2.D(anfvVar));
                    }
                } else if (acfz.ak(anfvVar)) {
                    jnj jnjVar3 = this.p;
                    if (jnjVar3 != null) {
                        p(arrayList2, jnjVar3.C(anfvVar, obj));
                    }
                } else {
                    ajwo ajwoVarDT = yno.dT(anfvVar);
                    if (ajwoVarDT != null) {
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(apcb.b);
                        ajwoVarDT.c(aihlVarCheckIsLite);
                        if (!ajwoVarDT.j.n(aihlVarCheckIsLite.d) || q(anfvVar)) {
                            p(arrayList2, anfvVar);
                        }
                    } else {
                        p(arrayList2, anfvVar);
                    }
                }
                agkeVarN = agke.n(arrayList2);
            }
            arrayList.addAll(agkeVarN);
        }
        return arrayList;
    }

    @Override // defpackage.izr
    public final void b(View view, izt iztVar) {
        view.setTag(R.id.music_menu_anchor_toggle_menu_item_mutations, iztVar);
    }

    @Override // defpackage.adva, defpackage.aduw
    public final void c(View view, anfy anfyVar, Object obj, xgn xgnVar) {
        super.c(view, anfyVar, obj, xgnVar);
        view.setTag(R.id.music_menu_anchor_toggle_menu_item_mutations, this.k);
    }

    @Override // defpackage.adva, defpackage.aduw
    public final void d(View view, anfy anfyVar, Object obj, xgn xgnVar) {
        ci ciVar;
        if (anfyVar != null) {
            view.setOnLongClickListener(this);
        }
        view.setTag(R.id.innertube_menu_anchor_model, anfyVar);
        view.setTag(R.id.innertube_menu_anchor_tag, obj);
        view.setTag(R.id.innertube_menu_anchor_interaction_logger, xgnVar);
        if (anfyVar != null && (ciVar = this.f) != null) {
            ciVar.ae(anfyVar, view);
        }
        view.setTag(R.id.music_menu_anchor_toggle_menu_item_mutations, this.k);
    }

    @Override // defpackage.izr
    public final void e(View view, View view2, anfy anfyVar, Object obj, xgn xgnVar) {
        d(view, anfyVar, obj, xgnVar);
        if (anfyVar != null && view2 != null) {
            aiqe aiqeVar = anfyVar.h;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
            aiqd aiqdVar = aiqeVar.c;
            if (aiqdVar == null) {
                aiqdVar = aiqd.a;
            }
            if ((aiqdVar.b & 2) != 0) {
                aiqe aiqeVar2 = anfyVar.h;
                if (aiqeVar2 == null) {
                    aiqeVar2 = aiqe.a;
                }
                aiqd aiqdVar2 = aiqeVar2.c;
                if (aiqdVar2 == null) {
                    aiqdVar2 = aiqd.a;
                }
                view2.setContentDescription(aiqdVar2.c);
            }
        }
        view2.setTag(R.id.music_menu_anchor_toggle_menu_item_mutations, this.k);
    }

    @Override // defpackage.izr
    public final void f(RecyclerView recyclerView, anfy anfyVar, Object obj, xgn xgnVar) {
        recyclerView.getClass();
        if (anfyVar == null || anfyVar.d.size() == 0) {
            recyclerView.setVisibility(8);
            return;
        }
        recyclerView.setVisibility(0);
        admu admuVar = new admu();
        Iterator it = anfyVar.d.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                admo admoVarD = this.n.d((admh) this.i.io());
                admoVarD.D(admuVar, null);
                admoVarD.jR(new adlk(xgnVar, 0));
                admoVarD.jR(new gob(obj, 11));
                recyclerView.ah(new GridLayoutManager(recyclerView.getContext(), Math.max(admuVar.size(), 1)));
                recyclerView.ad(admoVarD);
                return;
            }
            angf angfVar = (angf) it.next();
            if (angfVar != null) {
                int i = angfVar.b;
                if ((i & 1) != 0) {
                    obj2 = angfVar.c;
                    if (obj2 == null) {
                        obj2 = ajnf.a;
                    }
                } else if ((i & 2) != 0) {
                    obj2 = angfVar.d;
                    if (obj2 == null) {
                        obj2 = ajnh.a;
                    }
                } else if ((i & 4) != 0) {
                    obj2 = angfVar.e;
                    if (obj2 == null) {
                        obj2 = ajno.a;
                    }
                } else if ((i & 8) != 0) {
                    obj2 = angfVar.f;
                    if (obj2 == null) {
                        obj2 = anyl.a;
                    }
                } else if ((i & 16) != 0) {
                    obj2 = angfVar.g;
                    if (obj2 == null) {
                        obj2 = amks.a;
                    }
                } else if ((i & 32) != 0) {
                    obj2 = angfVar.h;
                    if (obj2 == null) {
                        obj2 = aqen.a;
                    }
                } else if ((i & 64) != 0) {
                    obj2 = angfVar.i;
                    if (obj2 == null) {
                        obj2 = aiql.a;
                    }
                } else if ((i & SemanticState.Focused) != 0) {
                    obj2 = angfVar.j;
                    if (obj2 == null) {
                        obj2 = aoua.a;
                    }
                } else if ((i & SemanticState.Hidden) != 0) {
                    obj2 = angfVar.k;
                    if (obj2 == null) {
                        obj2 = appc.a;
                    }
                } else if ((i & SemanticState.LiveRegion) != 0) {
                    obj2 = angfVar.l;
                    if (obj2 == null) {
                        obj2 = ajnq.a;
                    }
                } else if ((i & SemanticState.ReadOnly) != 0) {
                    obj2 = angfVar.m;
                    if (obj2 == null) {
                        obj2 = appd.a;
                    }
                } else if ((i & SemanticState.Modal) != 0) {
                    obj2 = angfVar.n;
                    if (obj2 == null) {
                        obj2 = akze.a;
                    }
                } else if ((i & SemanticState.Obscured) != 0) {
                    obj2 = angfVar.o;
                    if (obj2 == null) {
                        obj2 = aiqm.a;
                    }
                } else if ((i & SemanticState.Multiline) != 0 && (obj2 = angfVar.p) == null) {
                    obj2 = amkv.a;
                }
            }
            if (obj2 instanceof ajno) {
                admuVar.add(new heg((ajno) obj2));
            } else if (obj2 != null) {
                admuVar.add(obj2);
            }
        }
    }

    @Override // defpackage.adva, defpackage.aduw
    public final void g(View view) {
        view.setOnClickListener(null);
        view.setTag(R.id.innertube_menu_anchor_model, null);
        view.setTag(R.id.innertube_menu_anchor_tag, null);
        view.setTag(R.id.innertube_menu_anchor_interaction_logger, null);
        view.setTag(R.id.innertube_menu_anchor_on_click_listener, null);
        view.setTag(R.id.music_menu_anchor_toggle_menu_item_mutations, null);
    }

    @Override // defpackage.adva, defpackage.aduw
    public final void h(View view) {
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setTag(R.id.innertube_menu_anchor_model, null);
        view.setTag(R.id.innertube_menu_anchor_tag, null);
        view.setTag(R.id.innertube_menu_anchor_interaction_logger, null);
        view.setTag(R.id.music_menu_anchor_toggle_menu_item_mutations, null);
    }

    @Override // defpackage.adva, defpackage.aduw
    public final void i() {
        super.i();
        aevy aevyVarO = o();
        if (aevyVarO != null) {
            aevyVarO.iN();
        }
    }

    @Override // defpackage.izr
    public final void j(anfy anfyVar, Object obj, izt iztVar, xgn xgnVar) {
        dd supportFragmentManager = ((cf) this.h).getSupportFragmentManager();
        if (jku.e(supportFragmentManager)) {
            aihf aihfVarCreateBuilder = anfy.a.createBuilder();
            aihfVarCreateBuilder.bH(a(anfyVar, obj));
            if ((anfyVar.b & 4) != 0) {
                ange angeVar = anfyVar.f;
                if (angeVar == null) {
                    angeVar = ange.a;
                }
                aihfVarCreateBuilder.copyOnWrite();
                anfy anfyVar2 = (anfy) aihfVarCreateBuilder.instance;
                angeVar.getClass();
                anfyVar2.f = angeVar;
                anfyVar2.b |= 4;
            }
            anfy anfyVar3 = (anfy) aihfVarCreateBuilder.build();
            izq izqVar = new izq();
            ((izp) izqVar).m = anfyVar3;
            izqVar.p = iztVar;
            izqVar.q = xgnVar;
            izqVar.h(supportFragmentManager, "MUSIC_MENU_BOTTOM_SHEET_FRAGMENT_TAG");
        }
    }

    @Override // defpackage.adwl, defpackage.adva
    public final void k(anfy anfyVar, View view, Object obj, xgn xgnVar) {
        if (!this.m.j(anfyVar)) {
            aevy aevyVarO = o();
            if (aevyVarO != null) {
                aevyVarO.iN();
            }
            this.d = obj;
            this.e = xgnVar;
            Object tag = view.getTag(R.id.music_menu_anchor_toggle_menu_item_mutations);
            j(anfyVar, obj, tag instanceof izt ? (izt) tag : null, xgnVar);
            return;
        }
        this.d = obj;
        this.e = xgnVar;
        agkj agkjVarJ = obj != null ? agkj.j("com.google.android.libraries.youtube.innertube.endpoint.tag", obj) : agpn.b;
        adyr adyrVar = this.l;
        adyp adypVar = new adyp();
        adypVar.e = ajwo.a;
        adypVar.b(agkjVarJ);
        adypVar.c(anfyVar);
        adypVar.d(false);
        adyrVar.a(adypVar.a());
    }
}
