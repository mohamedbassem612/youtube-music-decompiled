package defpackage;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;
import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.CommonApis;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jcp implements View.OnClickListener, adma {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/ui/presenter/MenuItemPresenter");
    public final awmd b;
    public anfv c;
    private final cf d;
    private final hdv e;
    private final aduv f;
    private final acyx g;
    private final jer h;
    private final jki i;
    private final xgm j;
    private final avmb k;
    private final FrameLayout l;
    private View m;
    private adly n;
    private izt o;
    private final avmm p = new avmm();
    private final hcb q;
    private final vxz r;
    private final jnj s;
    private final aciz t;
    private final qcb u;
    private final qcb v;

    public jcp(cf cfVar, hdv hdvVar, awmd awmdVar, aduv aduvVar, jnj jnjVar, acyx acyxVar, jer jerVar, jki jkiVar, xgm xgmVar, aciz acizVar, vxz vxzVar, hcb hcbVar, avmb avmbVar) {
        cfVar.getClass();
        this.d = cfVar;
        this.e = hdvVar;
        this.b = awmdVar;
        aduvVar.getClass();
        this.f = aduvVar;
        this.s = jnjVar;
        this.g = acyxVar;
        this.h = jerVar;
        this.i = jkiVar;
        this.j = xgmVar;
        this.t = acizVar;
        this.r = vxzVar;
        hcbVar.getClass();
        this.q = hcbVar;
        avmbVar.getClass();
        this.k = avmbVar;
        this.v = new qcb(this, null);
        this.u = new qcb(this, null);
        FrameLayout frameLayout = new FrameLayout(cfVar);
        this.l = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    private final View h() {
        if (this.m == null) {
            View viewInflate = View.inflate(this.d, R.layout.music_menu_item, null);
            this.m = viewInflate;
            viewInflate.setOnClickListener(this);
        }
        return this.m;
    }

    private final ImageView i() {
        return (ImageView) h().findViewById(R.id.icon);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.l;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.p.b();
        if (this.m != null) {
            e(false);
            f(true);
        }
        kro.X(this.l, admhVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    public final void d() {
        anfv anfvVar;
        if (this.n == null || (anfvVar = this.c) == null) {
            return;
        }
        aigj aigjVarDR = yno.dR(anfvVar);
        if (aigjVarDR != null && !aigjVarDR.E()) {
            this.j.hB().w(new xgj(aigjVarDR, (amud) null), null);
        }
        TextView textView = (TextView) h().findViewById(R.id.text);
        ImageView imageViewI = i();
        if (this.c.b == 78861357) {
            Object objC = this.n.c("sharedToggleMenuItemMutations");
            adly adlyVar = this.n;
            this.o = objC != null ? (izt) adlyVar.c("sharedToggleMenuItemMutations") : (izt) adlyVar.c("toggleMenuItemMutations");
            anfv anfvVar2 = this.c;
            angh anghVar = anfvVar2.b == 78861357 ? (angh) anfvVar2.c : angh.a;
            izt iztVar = this.o;
            if (iztVar != null && iztVar.b(anghVar) != anghVar.m) {
                aihf builder = this.c.toBuilder();
                aihf builder2 = anghVar.toBuilder();
                boolean zB = this.o.b(anghVar);
                builder2.copyOnWrite();
                angh anghVar2 = (angh) builder2.instance;
                anghVar2.b |= SemanticState.ReadOnly;
                anghVar2.m = zB;
                builder.copyOnWrite();
                anfv anfvVar3 = (anfv) builder.instance;
                angh anghVar3 = (angh) builder2.build();
                anghVar3.getClass();
                anfvVar3.c = anghVar3;
                anfvVar3.b = 78861357;
                this.c = (anfv) builder.build();
            }
        }
        aciz acizVar = this.t;
        aedu aeduVarA = aedv.a();
        aeduVarA.b();
        aeduVarA.b = 4;
        aeduVarA.c = 1;
        aeduVarA.d = 1;
        acizVar.B(aeduVarA.a(), textView.getContext(), (YouTubeAppCompatTextView) textView);
        textView.setText(yno.dV(this.c));
        if (yno.dU(this.c) != null) {
            aduv aduvVar = this.f;
            aliz alizVarA = aliz.a(yno.dU(this.c).c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            if (aduvVar.a(alizVarA) != 0) {
                aliz alizVarA2 = aliz.a(yno.dU(this.c).c);
                if (alizVarA2 == null) {
                    alizVarA2 = aliz.UNKNOWN;
                }
                imageViewI.setImageResource(aduvVar.a(alizVarA2));
            } else {
                imageViewI.setImageDrawable(null);
            }
        } else {
            imageViewI.setImageDrawable(null);
        }
        imageViewI.setColorFilter(imageViewI.getContext().getColor(yno.dW(this.c) == 2 ? R.color.ytm_icon_color_idle : R.color.ytm_icon_color_active), PorterDuff.Mode.SRC_IN);
        int color = textView.getContext().getColor(R.color.ytm_text_color_idle);
        int i = tzk.i(textView.getContext(), R.attr.ytTextPrimary);
        if (yno.dW(this.c) != 2) {
            color = i;
        }
        textView.setTextColor(color);
        FrameLayout frameLayout = this.l;
        kro.X(frameLayout, this.h.a);
        frameLayout.addView(h());
    }

    public final void e(boolean z) {
        boolean z2 = !z;
        h().setClickable(z2);
        tuk.l(h().findViewById(R.id.loading_spinner), z);
        tuk.l(i(), z2);
    }

    public final void f(boolean z) {
        ViewGroup.LayoutParams layoutParams = h().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = true != z ? 0 : -2;
            h().requestLayout();
        }
        tuk.l(h(), z);
    }

    public final void g(boolean z) {
        int i;
        anfv anfvVar = this.c;
        if (anfvVar == null || (i = anfvVar.b) != 78861357) {
            return;
        }
        angh anghVar = i == 78861357 ? (angh) anfvVar.c : angh.a;
        izt iztVar = this.o;
        if (iztVar == null || iztVar.b(anghVar) == z) {
            return;
        }
        this.o.a(anghVar, z);
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v33, types: [hpy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v17, types: [hpy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v5, types: [hpy, java.lang.Object] */
    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        anfv anfvVar;
        int i;
        ListenableFuture listenableFutureAr;
        anfv anfvVar2 = (anfv) obj;
        this.n = adlyVar;
        this.c = anfvVar2;
        int i2 = 0;
        if (anfvVar2 != null) {
            ajwo ajwoVar = (anfvVar2.b == 66441155 ? (anga) anfvVar2.c : anga.a).e;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aohd.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                e(true);
                cf cfVar = this.d;
                jnj jnjVar = this.s;
                anfv anfvVar3 = this.c;
                ajwo ajwoVar2 = (anfvVar3.b == 66441155 ? (anga) anfvVar3.c : anga.a).e;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aohd.b);
                ajwoVar2.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                aohd aohdVar = (aohd) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                taf.k(cfVar, ahno.as(jnjVar.b.a(kro.aq()), new hlk(jnjVar, kro.aH(aohdVar.d == 1 ? (String) aohdVar.e : ""), anfvVar3, i2), jnjVar.f), new jco(0), new iny(this, 10));
            } else {
                anfv anfvVar4 = this.c;
                ajwo ajwoVar3 = (anfvVar4.b == 66441155 ? (anga) anfvVar4.c : anga.a).e;
                if (ajwoVar3 == null) {
                    ajwoVar3 = ajwo.a;
                }
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aofx.b);
                ajwoVar3.c(aihlVarCheckIsLite3);
                if (ajwoVar3.j.n(aihlVarCheckIsLite3.d)) {
                    e(true);
                    cf cfVar2 = this.d;
                    final jnj jnjVar2 = this.s;
                    final anfv anfvVar5 = this.c;
                    final boolean z = !this.i.h();
                    ajwo ajwoVar4 = (anfvVar5.b == 66441155 ? (anga) anfvVar5.c : anga.a).e;
                    if (ajwoVar4 == null) {
                        ajwoVar4 = ajwo.a;
                    }
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aofx.b);
                    ajwoVar4.c(aihlVarCheckIsLite4);
                    Object objK2 = ajwoVar4.j.k(aihlVarCheckIsLite4.d);
                    aofx aofxVar = (aofx) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                    final String str = aofxVar.d;
                    int iB = CommonApis.b(aofxVar.e);
                    if (iB == 0 || iB != 11) {
                        listenableFutureAr = ahno.ar(jnjVar2.b.a(kro.aq()), new agek() { // from class: hll
                            @Override // defpackage.agek
                            public final Object apply(Object obj2) {
                                Optional optional = (Optional) obj2;
                                if (optional.isEmpty()) {
                                    return Optional.empty();
                                }
                                String str2 = str;
                                annv annvVar = (annv) optional.get();
                                String strAm = kro.am(str2);
                                String strAy = kro.ay(str2);
                                boolean z2 = annvVar.e().contains(strAm) || annvVar.i().contains(strAm) || annvVar.g().contains(strAy) || annvVar.j().contains(strAy) || Objects.equals(str2, "PPSV") || Objects.equals(str2, "PPSE");
                                anfv anfvVar6 = anfvVar5;
                                boolean z3 = z;
                                jnj jnjVar3 = jnjVar2;
                                if (Objects.equals(str2, "PPSDST") && z3) {
                                    return Optional.of(((hlz) jnjVar3.c).a(anfvVar6));
                                }
                                ajwo ajwoVarB = jnj.B(anfvVar6);
                                aoia aoiaVar = null;
                                if (ajwoVarB != null) {
                                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aofx.b);
                                    ajwoVarB.c(aihlVarCheckIsLite5);
                                    if (ajwoVarB.j.n(aihlVarCheckIsLite5.d)) {
                                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aofx.b);
                                        ajwoVarB.c(aihlVarCheckIsLite6);
                                        Object objK3 = ajwoVarB.j.k(aihlVarCheckIsLite6.d);
                                        aofx aofxVar2 = (aofx) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3));
                                        if ((aofxVar2.c & 8) != 0) {
                                            apji apjiVar = aofxVar2.f;
                                            if (apjiVar == null) {
                                                apjiVar = apji.a;
                                            }
                                            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aoic.a);
                                            apjiVar.c(aihlVarCheckIsLite7);
                                            Object objK4 = apjiVar.j.k(aihlVarCheckIsLite7.d);
                                            aoiaVar = (aoia) (objK4 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK4));
                                        }
                                    }
                                }
                                if (!z2 && (aoiaVar == null || !aoiaVar.c)) {
                                    return Optional.empty();
                                }
                                boolean z4 = annvVar.i().contains(strAm) || annvVar.j().contains(strAy);
                                if (z2) {
                                    if (!z4 || z3) {
                                        return Optional.of(((hlz) jnjVar3.c).a(anfvVar6));
                                    }
                                    z4 = true;
                                }
                                Object obj3 = jnjVar3.c;
                                aihf builder = anfvVar6.toBuilder();
                                yno.dY(builder, ackj.c(((hlz) obj3).d.getResources().getString(R.string.action_add_playlist_to_offline)));
                                anfv anfvVar7 = (anfv) builder.instance;
                                aihf builder2 = (anfvVar7.b == 66441155 ? (anga) anfvVar7.c : anga.a).toBuilder();
                                aihh aihhVar = (aihh) alja.a.createBuilder();
                                aliz alizVar = aliz.OFFLINE_DOWNLOAD;
                                aihhVar.copyOnWrite();
                                alja aljaVar = (alja) aihhVar.instance;
                                aljaVar.c = alizVar.yN;
                                aljaVar.b |= 1;
                                builder2.copyOnWrite();
                                anga angaVar = (anga) builder2.instance;
                                alja aljaVar2 = (alja) aihhVar.build();
                                aljaVar2.getClass();
                                angaVar.d = aljaVar2;
                                angaVar.b |= 8;
                                anga angaVar2 = (anga) builder2.build();
                                builder.copyOnWrite();
                                anfv anfvVar8 = (anfv) builder.instance;
                                angaVar2.getClass();
                                anfvVar8.c = angaVar2;
                                anfvVar8.b = 66441155;
                                ajwo ajwoVarDT = yno.dT((anfv) builder.build());
                                if (ajwoVarDT != null) {
                                    aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aofx.b);
                                    ajwoVarDT.c(aihlVarCheckIsLite8);
                                    if (ajwoVarDT.j.n(aihlVarCheckIsLite8.d)) {
                                        aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aofx.b);
                                        ajwoVarDT.c(aihlVarCheckIsLite9);
                                        Object objK5 = ajwoVarDT.j.k(aihlVarCheckIsLite9.d);
                                        aihf builder3 = ((aofx) (objK5 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK5))).toBuilder();
                                        int i3 = true != z4 ? 2 : 7;
                                        builder3.copyOnWrite();
                                        aofx aofxVar3 = (aofx) builder3.instance;
                                        aofxVar3.e = i3 - 1;
                                        aofxVar3.c |= 2;
                                        aofx aofxVar4 = (aofx) builder3.build();
                                        aihh aihhVar2 = (aihh) ajwoVarDT.toBuilder();
                                        aihhVar2.e(aofx.b, aofxVar4);
                                        yno.dX(builder, (ajwo) aihhVar2.build());
                                    }
                                }
                                return Optional.of((anfv) builder.build());
                            }
                        }, jnjVar2.f);
                    } else {
                        ?? r3 = jnjVar2.b;
                        ListenableFuture listenableFutureA = r3.a(kro.ay(str));
                        ListenableFuture listenableFutureA2 = r3.a(kro.at(str));
                        listenableFutureAr = ahno.av(listenableFutureA, listenableFutureA2).k(new hlm(jnjVar2, listenableFutureA, listenableFutureA2, anfvVar5, 0), jnjVar2.f);
                    }
                    taf.k(cfVar2, listenableFutureAr, new jco(2), new iny(this, 11));
                }
            }
        }
        avmm avmmVar = this.p;
        avmmVar.b();
        if (this.r.l(222, 45757689L, false) && (i = (anfvVar = this.c).b) == 78861357) {
            ajwo ajwoVar5 = (i == 78861357 ? (angh) anfvVar.c : angh.a).g;
            if (ajwoVar5 == null) {
                ajwoVar5 = ajwo.a;
            }
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(amla.b);
            ajwoVar5.c(aihlVarCheckIsLite5);
            if (ajwoVar5.j.n(aihlVarCheckIsLite5.d)) {
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(amla.b);
                ajwoVar5.c(aihlVarCheckIsLite6);
                Object objK3 = ajwoVar5.j.k(aihlVarCheckIsLite6.d);
                amlh amlhVar = ((amla) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3))).g;
                if (amlhVar == null) {
                    amlhVar = amlh.a;
                }
                if ((amlhVar.b & 2) != 0) {
                    aihl aihlVarCheckIsLite7 = aihn.checkIsLite(amla.b);
                    ajwoVar5.c(aihlVarCheckIsLite7);
                    Object objK4 = ajwoVar5.j.k(aihlVarCheckIsLite7.d);
                    amlh amlhVar2 = ((amla) (objK4 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK4))).g;
                    if (amlhVar2 == null) {
                        amlhVar2 = amlh.a;
                    }
                    String str2 = amlhVar2.d;
                    if (!str2.isEmpty()) {
                        avmmVar.c(this.q.c().j(wfs.g(318, str2), true).O(this.k).ag(new iwb(this, 11), new ido(19)));
                    }
                }
            }
        }
        anfv anfvVar6 = this.c;
        if (anfvVar6.b != 153515154) {
            d();
            return;
        }
        adly adlyVar2 = this.n;
        if (adlyVar2 == null || anfvVar6 == null) {
            return;
        }
        adlyVar2.g(this.v.o());
        adly adlyVar3 = this.n;
        if (adlyVar3.b instanceof xgy) {
            adlyVar3.a(this.j.hB());
        }
        jer jerVar = this.h;
        FrameLayout frameLayout = this.l;
        jba jbaVar = jerVar.a;
        kro.X(frameLayout, jbaVar);
        acyx acyxVar = this.g;
        anfv anfvVar7 = this.c;
        kro.Q(acyxVar.c(anfvVar7.b == 153515154 ? (akrn) anfvVar7.c : akrn.a), frameLayout, jbaVar, this.n);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aigj aigjVarDR;
        anfv anfvVar = this.c;
        if (anfvVar != null) {
            vxz vxzVar = this.r;
            ajwo ajwoVarDT = yno.dT(anfvVar);
            if (vxzVar.l(198, 45715323L, false) && yno.dS(this.c) == null && ((ajwoVarDT == null || !this.e.i(ajwoVarDT, this.v.o())) && (aigjVarDR = yno.dR(this.c)) != null && !aigjVarDR.E())) {
                this.j.hB().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(aigjVarDR, (amud) null), null);
            }
            ((aduw) ((jcp) this.u.a).b.io()).i();
            if (ajwoVarDT != null) {
                this.e.c(ajwoVarDT, this.v.o());
            } else if (yno.dS(this.c) != null) {
                this.e.c(yno.dS(this.c), this.v.o());
            }
            anfv anfvVar2 = this.c;
            if (anfvVar2.b == 78861357) {
                aihf builder = anfvVar2.toBuilder();
                anfv anfvVar3 = this.c;
                boolean z = !(anfvVar3.b == 78861357 ? (angh) anfvVar3.c : angh.a).m;
                anfv anfvVar4 = (anfv) builder.instance;
                int i = anfvVar4.b;
                if (i == 78861357) {
                    aihf builder2 = (i == 78861357 ? (angh) anfvVar4.c : angh.a).toBuilder();
                    builder2.copyOnWrite();
                    angh anghVar = (angh) builder2.instance;
                    anghVar.b |= SemanticState.ReadOnly;
                    anghVar.m = z;
                    builder.copyOnWrite();
                    anfv anfvVar5 = (anfv) builder.instance;
                    angh anghVar2 = (angh) builder2.build();
                    anghVar2.getClass();
                    anfvVar5.c = anghVar2;
                    anfvVar5.b = 78861357;
                }
                izt iztVar = this.o;
                if (iztVar != null) {
                    anfv anfvVar6 = this.c;
                    iztVar.a(anfvVar6.b == 78861357 ? (angh) anfvVar6.c : angh.a, z);
                }
                this.c = (anfv) builder.build();
            }
        }
    }
}
