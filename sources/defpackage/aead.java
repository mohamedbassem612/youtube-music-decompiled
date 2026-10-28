package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Rect;
import android.os.Build;
import android.os.VibrationEffect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.libraries.youtube.slimstatusbar.SlimStatusBar;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aead implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public aead(View view, View.DragShadowBuilder dragShadowBuilder, int i) {
        this.$cid = i;
        this.a = view;
        this.b = dragShadowBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [aeui, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v52, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v55, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v62, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v67, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v69, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        TextView textView;
        int iAS;
        switch (this.$cid) {
            case 0:
                Object obj = this.b;
                Object obj2 = this.a;
                int i = bac.a;
                azu.b((View) obj2, (View.DragShadowBuilder) obj);
                qpj.d(this, 200L);
                return;
            case 1:
                adzx adzxVar = (adzx) this.b;
                adzxVar.e.af(this.a, adzxVar.a);
                return;
            case 2:
                ((RecyclerView) this.b).aE((qa) this.a);
                return;
            case 3:
                ((AppBarLayout) this.a).j(this.b);
                return;
            case 4:
                ((aecj) this.b).h((amjx) this.a);
                return;
            case 5:
                Object obj3 = ((Optional) ((ssj) this.b).b).get();
                String str = ((apmv) this.a).e;
                aeeu aeeuVar = (aeeu) obj3;
                aeeuVar.a();
                Map map = aeeuVar.c;
                acqf acqfVar = (acqf) map.get(str);
                if (acqfVar != null) {
                    View view = (View) ((aeet) acqfVar.d).get();
                    alhq alhqVar = (alhq) ((WeakReference) acqfVar.b).get();
                    xgn xgnVar = (xgn) ((WeakReference) acqfVar.a).get();
                    aeem aeemVar = (aeem) ((WeakReference) acqfVar.c).get();
                    if (view == null || alhqVar == null || !view.isShown() || !view.isAttachedToWindow()) {
                        map.remove(str);
                        return;
                    } else {
                        aeeuVar.c(alhqVar, view, null, xgnVar, aeeuVar.a, true, aeemVar);
                        return;
                    }
                }
                return;
            case 6:
                ((aeei) this.a).c.removeView((View) this.b);
                return;
            case 7:
                ((aejo) this.b).W.n((Throwable) this.a);
                return;
            case 8:
                ((aejo) this.b).W.n((Throwable) this.a);
                return;
            case 9:
                qcb qcbVar = ((aejo) ((aejn) this.b).a).X;
                aiie<afxz> aiieVar = ((afxq) this.a).e;
                Object obj4 = qcbVar.a;
                if (kro.M((cc) obj4)) {
                    return;
                }
                for (afxz afxzVar : aiieVar) {
                    jmg jmgVar = (jmg) obj4;
                    jls jlsVar = jmgVar.au;
                    if (jlsVar != null && jlsVar.n() != 1) {
                        TextView textView2 = jmgVar.Y;
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                        }
                        TextView textView3 = jmgVar.V;
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                        }
                    }
                    double d = afxzVar.c;
                    if (d == 1.0d) {
                        jmgVar.M = true;
                    }
                    if (d >= 0.8d) {
                        if (jmgVar.az == 3) {
                            EditText editText = jmgVar.ad;
                            if (editText != null && (!jmgVar.as || jmgVar.L)) {
                                editText.setText(afxzVar.b);
                                jmgVar.ad.setSelection(afxzVar.b.length());
                            }
                        } else {
                            TextView textView4 = jmgVar.U;
                            if (textView4 != null) {
                                textView4.setText("");
                            }
                            TextView textView5 = jmgVar.T;
                            if (textView5 != null) {
                                textView5.setText(afxzVar.b);
                            }
                        }
                        jmgVar.x("voz_sf");
                    } else if (jmgVar.az != 3 && (textView = jmgVar.U) != null) {
                        textView.setText(afxzVar.b);
                    }
                }
                return;
            case 10:
                afxy afxyVar = ((afxq) this.a).f;
                if (afxyVar == null) {
                    afxyVar = afxy.a;
                }
                Object obj5 = this.b;
                aigj aigjVar = afxyVar.b;
                Object obj6 = ((aejn) obj5).a;
                qcb qcbVar2 = ((aejo) obj6).W;
                Object obj7 = qcbVar2.a;
                if (!kro.M((cc) obj7)) {
                    try {
                        atya atyaVar = (atya) aihn.parseFrom(atya.a, aigjVar);
                        allk allkVar = (allk) wjr.F((atyaVar.b == 1 ? (aigj) atyaVar.c : aigj.d).G(), allk.a);
                        if (allkVar == null) {
                            ((jmg) obj7).aI.s(jli.FAILURE);
                            ((jmg) obj7).B();
                            if (((jmg) obj7).az == 3) {
                                ((jmg) obj7).K();
                            }
                        } else {
                            if (((jmg) obj7).az == 3 && (iAS = a.aS(allkVar.h)) != 0 && iAS == 3) {
                                ((jmg) obj7).aI.s(jli.FAILURE);
                                ((jmg) obj7).B();
                                ((jmg) obj7).K();
                            }
                            int i2 = allkVar.b;
                            if ((i2 & 8) != 0) {
                                ((jmg) obj7).O = allkVar.e;
                            }
                            if ((i2 & SemanticState.Hidden) != 0) {
                                ((jmg) obj7).x("voz_rqf");
                                if (((jmg) obj7).az == 3) {
                                    EditText editText2 = ((jmg) obj7).ad;
                                    if (editText2 != null) {
                                        editText2.setText("");
                                    }
                                    LottieAnimationView lottieAnimationView = ((jmg) obj7).ai;
                                    if (lottieAnimationView != null) {
                                        lottieAnimationView.d();
                                        ((jmg) obj7).ai.setVisibility(8);
                                    }
                                    ((jmg) obj7).I(true);
                                }
                                ((jmg) obj7).v.a(Build.VERSION.SDK_INT >= 29 ? VibrationEffect.createPredefined(1) : VibrationEffect.createWaveform(jlh.c, jlh.d, 1));
                                ((jmg) obj7).aI.s(jli.SUCCESS);
                                ((jmg) obj7).t(allkVar);
                            } else if (allkVar.i.size() > 0 && ((jmg) obj7).az != 3) {
                                ((jmg) obj7).K = allkVar.i;
                                ((jmg) obj7).o();
                                TextView textView6 = ((jmg) obj7).Y;
                                if (textView6 != null) {
                                    textView6.setVisibility(0);
                                }
                                ((jmg) obj7).x("voz_vt");
                            }
                        }
                    } catch (aiik unused) {
                        jmg jmgVar2 = (jmg) qcbVar2.a;
                        jmgVar2.aI.s(jli.FAILURE);
                        jmgVar2.B();
                        if (jmgVar2.az == 3) {
                            jmgVar2.K();
                        }
                    }
                }
                try {
                    atya atyaVar2 = (atya) aihn.parseFrom(atya.a, aigjVar);
                    allk allkVar2 = (allk) wjr.F((atyaVar2.b == 1 ? (aigj) atyaVar2.c : aigj.d).G(), allk.a);
                    if (allkVar2 != null) {
                        wjr wjrVar = ((aejo) obj6).V;
                        alop alopVar = allkVar2.c;
                        if (alopVar == null) {
                            alopVar = alop.a;
                        }
                        wjrVar.H(null, alopVar);
                        return;
                    }
                    return;
                } catch (aiik unused2) {
                    return;
                }
            case 11:
                ((aejo) ((aejn) this.b).a).W.n((Throwable) this.a);
                return;
            case 12:
                ((aeke) this.a).s.scrollTo(0, Math.round(((RadioButton) this.b).getY()));
                return;
            case 13:
                Object obj8 = this.a;
                Object obj9 = this.b;
                try {
                    try {
                        ((aeoc) obj9).a(((aeoc) obj9).d, ((aeoc) obj9).j, 199);
                        break;
                    } catch (Exception e) {
                        ((agrc) ((agrc) aeoc.a.c().i(agso.a, "RootFragmentLifecycle")).j(e).k("com/google/android/libraries/youtube/shell/root/impl/RootFragmentLifecycleListenerImpl", "initializeOnCreateDestroyNonCriticalInitializable$<anonymous>$<anonymous>", 242, "RootFragmentLifecycleListenerImpl.kt")).t("Failed to initialize OnCreateDestroyNonCritical");
                        break;
                    }
                    return;
                } finally {
                    ((avma) obj8).dispose();
                }
            case 14:
                Object obj10 = this.b;
                avma avmaVarA = ((aeoc) obj10).b.a();
                avmaVarA.a(new aead(obj10, avmaVarA, 13));
                ((avmr) this.a).a(avmaVarA);
                return;
            case 15:
                Object obj11 = this.a;
                ViewGroup viewGroup = (ViewGroup) this.b;
                int iIndexOfChild = viewGroup.indexOfChild((View) obj11) - 1;
                if (iIndexOfChild >= 0) {
                    View childAt = viewGroup.getChildAt(iIndexOfChild);
                    Rect rect = new Rect();
                    childAt.getHitRect(rect);
                    rect.bottom += ((SlimStatusBar) obj11).getHeight();
                    viewGroup.setTouchDelegate(new aeol(rect, childAt));
                    return;
                }
                return;
            case 16:
                aeoh aeohVar = (aeoh) this.a;
                abgn abgnVar = aeohVar.O;
                abgnVar.getClass();
                ((aeoh) abgnVar.a).Q.getClass();
                AnimatorSet animatorSet = new AnimatorSet();
                int i3 = aeohVar.f;
                int i4 = aeohVar.e;
                View view2 = (View) this.b;
                Animator animatorN = adul.n(view2, i4, i3, 400L);
                Animator animatorN2 = adul.n(view2, i3, i4, 400L);
                animatorN2.setStartDelay(200L);
                animatorSet.playSequentially(animatorN, animatorN2);
                aeohVar.m = animatorSet;
                aeohVar.m.start();
                return;
            case 17:
                ((aeoh) this.b).m(false, (String) this.a);
                return;
            case 18:
                final aepb aepbVar = (aepb) this.b;
                ?? r1 = aepbVar.d;
                if (r1 != 0 && !r1.isCancelled() && !aepbVar.d.isDone()) {
                    aepbVar.d.cancel(true);
                }
                Object obj12 = aepbVar.e;
                ArrayList arrayList = new ArrayList();
                aepd aepdVar = (aepd) obj12;
                agqs agqsVarListIterator = ((agke) aepdVar.c).listIterator(0);
                while (true) {
                    Object obj13 = this.a;
                    if (!agqsVarListIterator.hasNext()) {
                        ahek ahekVarG = ahng.g(arrayList);
                        Callable callableJ = afwl.j(new aegt(arrayList, 5));
                        Executor executor = aepdVar.a;
                        aepbVar.d = ahcs.f(ahekVarG.a(callableJ, executor), new aepc(aepdVar, (String) obj13), executor);
                        taf.i(aepbVar.d, aepbVar.b, new abwu(18), new tae() { // from class: aepa
                            /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                            @Override // defpackage.tae, defpackage.twi
                            public final void a(Object obj14) {
                                aepb aepbVar2 = aepbVar;
                                aciz acizVar = (aciz) obj14;
                                ?? r0 = aepbVar2.d;
                                if (r0 == 0 || !r0.isCancelled()) {
                                    ((awku) aepbVar2.a).kk(acizVar);
                                }
                                aepbVar2.d = null;
                            }
                        }, null);
                        return;
                    }
                    arrayList.add(((ahub) agqsVarListIterator.next()).q((String) obj13));
                }
                break;
            case 19:
                ((aera) this.a).c((aeqi) this.b);
                return;
            default:
                afkf.a(this.b, (String) this.a);
                return;
        }
    }

    public /* synthetic */ aead(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ aead(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
