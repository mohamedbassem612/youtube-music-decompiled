package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.voice.views.NestedScrollListeningFrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jjc implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jjc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v51, types: [java.lang.Object, rpt] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int i = 1;
        final int i2 = 0;
        switch (this.$cid) {
            case 0:
                ((jjd) this.a).c.e();
                break;
            case 1:
                Object obj = this.a;
                try {
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ((LoadingFrameLayout) ((jjd) obj).g.c()).h(2);
                    for (eqq eqqVar : ((jjd) obj).f) {
                        arrayList2.add(eqqVar.c);
                        if (eqqVar.b) {
                            arrayList.add(eqqVar.a);
                        }
                    }
                    map.put("selection_values", arrayList);
                    map.put("impression_values", arrayList2);
                    ajwo ajwoVar = ((jjd) obj).e;
                    if (ajwoVar != null) {
                        ((jjd) obj).b.c(ajwoVar, map);
                    }
                } catch (jjk e) {
                    ((agrc) ((agrc) ((agrc) jjd.a.b().i(agso.a, "MultiselectFormCtlr")).j(e)).k("com/google/android/apps/youtube/music/userengagement/MultiselectFormScreenController", "attachListenersToViews", 'n', "MultiselectFormScreenController.java")).t("genre next button was invalid somehow when user clicked on it");
                    return;
                }
                break;
            case 2:
                jjy jjyVar = (jjy) this.a;
                EditText editText = jjyVar.l;
                editText.setText("");
                tuk.m(editText);
                Iterator it = jjyVar.c.iterator();
                while (it.hasNext()) {
                    ((jjs) it.next()).q();
                }
                break;
            case 3:
                jjy jjyVar2 = (jjy) this.a;
                jjyVar2.j();
                Iterator it2 = jjyVar2.c.iterator();
                while (it2.hasNext()) {
                    ((jjs) it2.next()).o();
                }
                break;
            case 4:
                final Object obj2 = this.a;
                jlj jljVar = (jlj) obj2;
                jljVar.b.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, jlj.a, null);
                EditText editText2 = jljVar.d;
                if (editText2 != null) {
                    tuk.i(editText2);
                }
                jljVar.f.c(new jln() { // from class: jlk
                    @Override // defpackage.jln
                    public final void a() {
                        int i3 = i;
                        Object obj3 = obj2;
                        if (i3 == 0) {
                            jlm jlmVar = (jlm) obj3;
                            jlmVar.i.b();
                            if (kro.M(jlmVar.b)) {
                                return;
                            }
                            abvk abvkVar = jlmVar.e;
                            if (abvkVar != null) {
                                abvkVar.ap(false, 19);
                            }
                            jlmVar.d.u("voz_ms", 48);
                            jlmVar.f.a();
                            return;
                        }
                        jlj jljVar2 = (jlj) obj3;
                        jljVar2.e.b();
                        String strI = jljVar2.b.i();
                        aihh aihhVar = (aihh) ajwo.a.createBuilder();
                        aihl aihlVar = apym.b;
                        aihf aihfVarCreateBuilder = apym.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        apym apymVar = (apym) aihfVarCreateBuilder.instance;
                        apymVar.f = 3;
                        apymVar.c |= 4;
                        aihhVar.e(aihlVar, (apym) aihfVarCreateBuilder.build());
                        aihl aihlVar2 = aoaq.b;
                        aihf aihfVarCreateBuilder2 = aoar.a.createBuilder();
                        String strC = typ.c(strI);
                        aihfVarCreateBuilder2.copyOnWrite();
                        aoar aoarVar = (aoar) aihfVarCreateBuilder2.instance;
                        aoarVar.b |= 1;
                        aoarVar.c = strC;
                        aihfVarCreateBuilder2.copyOnWrite();
                        aoar aoarVar2 = (aoar) aihfVarCreateBuilder2.instance;
                        aoarVar2.b |= 2;
                        aoarVar2.d = 208485;
                        aihhVar.e(aihlVar2, (aoar) aihfVarCreateBuilder2.build());
                        jljVar2.c.a((ajwo) aihhVar.build());
                    }
                });
                break;
            case 5:
                final Object obj3 = this.a;
                jlm jlmVar = (jlm) obj3;
                jlmVar.c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, jlmVar.g, null);
                EditText editText3 = jlmVar.h;
                if (editText3 != null) {
                    tuk.i(editText3);
                }
                xit xitVar = jlmVar.d;
                xitVar.A();
                if (jlmVar.c()) {
                    jlmVar.j.c(new jln() { // from class: jlk
                        @Override // defpackage.jln
                        public final void a() {
                            int i3 = i2;
                            Object obj4 = obj3;
                            if (i3 == 0) {
                                jlm jlmVar2 = (jlm) obj4;
                                jlmVar2.i.b();
                                if (kro.M(jlmVar2.b)) {
                                    return;
                                }
                                abvk abvkVar = jlmVar2.e;
                                if (abvkVar != null) {
                                    abvkVar.ap(false, 19);
                                }
                                jlmVar2.d.u("voz_ms", 48);
                                jlmVar2.f.a();
                                return;
                            }
                            jlj jljVar2 = (jlj) obj4;
                            jljVar2.e.b();
                            String strI = jljVar2.b.i();
                            aihh aihhVar = (aihh) ajwo.a.createBuilder();
                            aihl aihlVar = apym.b;
                            aihf aihfVarCreateBuilder = apym.a.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            apym apymVar = (apym) aihfVarCreateBuilder.instance;
                            apymVar.f = 3;
                            apymVar.c |= 4;
                            aihhVar.e(aihlVar, (apym) aihfVarCreateBuilder.build());
                            aihl aihlVar2 = aoaq.b;
                            aihf aihfVarCreateBuilder2 = aoar.a.createBuilder();
                            String strC = typ.c(strI);
                            aihfVarCreateBuilder2.copyOnWrite();
                            aoar aoarVar = (aoar) aihfVarCreateBuilder2.instance;
                            aoarVar.b |= 1;
                            aoarVar.c = strC;
                            aihfVarCreateBuilder2.copyOnWrite();
                            aoar aoarVar2 = (aoar) aihfVarCreateBuilder2.instance;
                            aoarVar2.b |= 2;
                            aoarVar2.d = 208485;
                            aihhVar.e(aihlVar2, (aoar) aihfVarCreateBuilder2.build());
                            jljVar2.c.a((ajwo) aihhVar.build());
                        }
                    });
                } else {
                    xitVar.u("voz_ms", 48);
                    jlmVar.f.b(jlm.a());
                }
                break;
            case 6:
                aihh aihhVar = (aihh) kro.ai("FEmusic_sound_search_match").toBuilder();
                aihl aihlVar = aoaq.b;
                aihf aihfVarCreateBuilder = aoar.a.createBuilder();
                jmg jmgVar = (jmg) this.a;
                String strI = jmgVar.l.i();
                aihfVarCreateBuilder.copyOnWrite();
                aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
                strI.getClass();
                aoarVar.b |= 1;
                aoarVar.c = strI;
                aihfVarCreateBuilder.copyOnWrite();
                aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
                aoarVar2.b |= 2;
                aoarVar2.d = 261068;
                aihhVar.e(aihlVar, (aoar) aihfVarCreateBuilder.build());
                jmgVar.k.a((ajwo) aihhVar.build());
                jmgVar.l.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(261068)), null);
                break;
            case 7:
                jmg jmgVar2 = (jmg) this.a;
                jmgVar2.l.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(189808)), null);
                NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout = jmgVar2.Q;
                if (nestedScrollListeningFrameLayout != null) {
                    nestedScrollListeningFrameLayout.setVisibility(8);
                }
                FrameLayout frameLayout = jmgVar2.S;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                if (avg.c(jmgVar2.requireContext(), "android.permission.RECORD_AUDIO") != 0) {
                    jmgVar2.y();
                } else {
                    jmgVar2.v.b();
                    if (jmgVar2.L) {
                        jmgVar2.aI.s(jli.NO_INPUT);
                        jmgVar2.B();
                    } else {
                        jmgVar2.M();
                    }
                }
                break;
            case 8:
                jmg jmgVar3 = (jmg) this.a;
                jmgVar3.l.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(217900)), null);
                if (avg.c(jmgVar3.requireContext(), "android.permission.RECORD_AUDIO") != 0) {
                    jmgVar3.y();
                } else if (jmgVar3.L) {
                    jmgVar3.B();
                    jmgVar3.D();
                } else {
                    ListenableFuture listenableFuture = jmgVar3.aw;
                    if (listenableFuture != null && !listenableFuture.isDone()) {
                        jmgVar3.aw.cancel(false);
                    }
                    jmgVar3.M();
                    jmgVar3.D();
                }
                break;
            case 9:
                EditText editText4 = ((jmg) this.a).ad;
                if (editText4 != null) {
                    editText4.setText("");
                }
                break;
            case 10:
                jmg jmgVar4 = (jmg) this.a;
                jmgVar4.u();
                jmgVar4.s();
                break;
            case 11:
                jmg jmgVar5 = (jmg) this.a;
                jmgVar5.l.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(62943)), null);
                TextView textView = jmgVar5.W;
                if (textView != null) {
                    textView.setVisibility(4);
                }
                NestedScrollListeningFrameLayout nestedScrollListeningFrameLayout2 = jmgVar5.Q;
                if (nestedScrollListeningFrameLayout2 != null) {
                    nestedScrollListeningFrameLayout2.setVisibility(8);
                }
                FrameLayout frameLayout2 = jmgVar5.S;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
                FrameLayout frameLayout3 = jmgVar5.P;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(0);
                }
                TextView textView2 = jmgVar5.X;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                jmgVar5.v.b();
                if (jmgVar5.L) {
                    jmgVar5.aI.s(jli.NO_INPUT);
                    jmgVar5.B();
                } else {
                    jmgVar5.M();
                }
                break;
            case 12:
                ((jmg) this.a).w();
                break;
            case 13:
                ((jmg) this.a).w();
                break;
            case 14:
                ((jmg) this.a).q();
                break;
            case 15:
                Object obj4 = this.a;
                joz jozVar = (joz) obj4;
                if (jozVar.H.io() != null) {
                    Optional optionalE = jozVar.e();
                    jfn jfnVar = new jfn(obj4, 9);
                    if (true == optionalE.isPresent()) {
                        ((vxe) ((joz) jfnVar.a).H.io()).a((ajwo) optionalE.get());
                    }
                }
                break;
            case 16:
                qcf qcfVar = (qcf) this.a;
                qcfVar.h.setVisibility(0);
                qcfVar.i.setVisibility(0);
                qcfVar.j.setVisibility(8);
                qcfVar.g.setVisibility(true != qcfVar.e ? 8 : 4);
                qcfVar.e();
                break;
            case 17:
                ((qcf) this.a).getActivity().onBackPressed();
                break;
            case 18:
                this.a.k();
                break;
            case 19:
                Intent intent = new Intent("android.settings.SYNC_SETTINGS");
                intent.putExtra("settings", new String[]{"com.google"});
                ((Activity) ((xsc) this.a).c).startActivity(intent);
                break;
            default:
                Dialog dialog = ((bp) this.a).f;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
