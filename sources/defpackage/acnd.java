package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.LinearLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acnd implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acnd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        avlr avlrVarJ;
        int i = 12;
        int i2 = 17;
        int i3 = 18;
        int i4 = 13;
        int i5 = 6;
        int i6 = 16;
        int i7 = 3;
        int i8 = 5;
        int i9 = 0;
        int i10 = 15;
        switch (this.$cid) {
            case 0:
                return nsj.f().p().ak(new acmv(this.a, i8));
            case 1:
                return Boolean.valueOf(((ycp) this.a).j());
            case 2:
                Object obj = this.a;
                return ((acng) obj).c.p().W(new abqe(obj, i)).aj();
            case 3:
                Object obj2 = this.a;
                return ((acng) obj2).c.W(new abqe(obj2, i4)).aj();
            case 4:
                Object obj3 = this.a;
                acng acngVar = (acng) obj3;
                return avlh.f(acngVar.c, ((vor) acngVar.a.io()).d.p, new abiw(i7)).al(new acmv(obj3, i7), new abxq(i));
            case 5:
                yqz yqzVar = new yqz(i6);
                Object obj4 = this.a;
                return ((acng) obj4).b.al.B(yqzVar).K(new ablh(i4)).af(new acmv(obj4, 6));
            case 6:
                yqz yqzVar2 = new yqz(i10);
                Object obj5 = this.a;
                return ((acng) obj5).b.al.B(yqzVar2).af(new acmv(obj5, 4));
            case 7:
                Object obj6 = this.a;
                return ((acni) obj6).h.a.al(new acmv(obj6, 7), new abxq(i4));
            case 8:
                avlr avlrVarR = avlr.J(Boolean.FALSE).r();
                Object obj7 = this.a;
                return avlrVarR.O(((acoi) obj7).am).af(new acmv(obj7, i3));
            case 9:
                Object obj8 = this.a;
                acoi acoiVar = (acoi) obj8;
                return avlr.j(acoiVar.aW.r(), acoiVar.aX.r(), new abiw(i5)).af(new acnt(obj8, 4));
            case 10:
                acoi acoiVar2 = (acoi) this.a;
                avlr avlrVarJ2 = avlr.j(acoiVar2.by.r(), acoiVar2.bx.r(), new abiw(i8));
                awli awliVar = acoiVar2.bz;
                awliVar.getClass();
                return avlrVarJ2.ag(new acmv(awliVar, i2), new abxq(i10));
            case 11:
                Object obj9 = this.a;
                acoi acoiVar3 = (acoi) obj9;
                return acoiVar3.bS.e.p().L(acoiVar3.am).al(new acmv(obj9, i10), new abxq(i10));
            case 12:
                Object obj10 = this.a;
                return ((avlr) ((acoi) obj10).cl.a).ag(new acmv(obj10, i6), new abxq(i10));
            case 13:
                Object obj11 = this.a;
                final acoi acoiVar4 = (acoi) obj11;
                avlu avluVarJ = acoiVar4.ck.ax() ? acoiVar4.aH.b : avlr.J("");
                avlr avlrVarB = acoiVar4.ck.ax() ? acoiVar4.k.b() : avlr.J(Boolean.FALSE);
                int i11 = 14;
                avlr avlrVarX = acoiVar4.ck.ay() ? acoiVar4.t.v.X(new ablh(i11)) : avlr.J(Boolean.TRUE);
                if (acoiVar4.ck.aG()) {
                    avlrVarJ = avlr.J(Boolean.TRUE);
                } else {
                    avlrVarJ = avlr.J(Boolean.TRUE);
                }
                awcu awcuVar = new awcu(new avlu[]{acoiVar4.aN.K(new abqe(obj11, i11)), acoiVar4.aO.K(new abqe(obj11, i10)), acoiVar4.aQ.K(new abqe(obj11, i6)), acoiVar4.aR.K(new abqe(obj11, i2)), acoiVar4.W.B(new yqz(i3)).X(new abqe(obj11, i3))});
                avnn avnnVar = atqp.l;
                avlr avlrVarC = awcuVar.C(avoi.a, 5);
                avlu avluVarJ2 = acoiVar4.ck.E() ? acoiVar4.ay.b : avlr.J(Boolean.FALSE);
                avlr avlrVarAg = acoiVar4.bV.a().ag();
                awli awliVar2 = acoiVar4.aY;
                avlr avlrVarR2 = acoiVar4.bG.r();
                avnm avnmVar = new avnm() { // from class: acnr
                    @Override // defpackage.avnm
                    public final Object a(Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
                        Boolean bool = (Boolean) obj12;
                        Boolean bool2 = (Boolean) obj14;
                        Boolean bool3 = (Boolean) obj15;
                        Boolean bool4 = (Boolean) obj16;
                        Boolean bool5 = (Boolean) obj17;
                        Boolean bool6 = (Boolean) obj18;
                        acmi acmiVarA = (acmi) obj20;
                        acoi acoiVar5 = acoiVar4;
                        boolean zE = acoiVar5.ck.E();
                        if (zE || acmiVarA.f != null) {
                            boolean zBooleanValue = bool.booleanValue();
                            if (acmiVarA.g != null && !zBooleanValue) {
                                acmh acmhVar = new acmh(acmiVarA);
                                acmhVar.c = null;
                                acmiVarA = acmhVar.a();
                            }
                            if (acoiVar5.ck.ax()) {
                                acoiVar5.ap();
                                acvv acvvVarB = acoiVar5.B();
                                if (acvvVarB != null) {
                                    acvvVarB.b();
                                    if (!acvvVarB.b().b) {
                                        Optional optionalG = acoiVar5.G();
                                        if (!optionalG.isEmpty() && acoiVar5.aH.b((String) optionalG.get())) {
                                            acmh acmhVar2 = new acmh(acmiVarA);
                                            acmhVar2.b = null;
                                            acmhVar2.c = null;
                                            acmiVarA = acmhVar2.a();
                                        }
                                    }
                                }
                            }
                            boolean zBooleanValue2 = bool2.booleanValue();
                            if (acoiVar5.ck.ax() && zBooleanValue2) {
                                acmh acmhVar3 = new acmh(acmiVarA);
                                acmhVar3.b = null;
                                acmhVar3.c = null;
                                acmiVarA = acmhVar3.a();
                            }
                        }
                        boolean zBooleanValue3 = bool5.booleanValue();
                        if (acoiVar5.ck.aG() && !zBooleanValue3) {
                            acmh acmhVar4 = new acmh(acmiVarA);
                            acmhVar4.b = null;
                            acmhVar4.c = null;
                            acmiVarA = acmhVar4.a();
                        }
                        boolean z = false;
                        if (acmiVarA.a && !acoiVar5.bw && ((!zE || !bool6.booleanValue()) && bool4.booleanValue())) {
                            z = true;
                        }
                        acmh acmhVar5 = new acmh(acmiVarA);
                        acmhVar5.e(z);
                        acmhVar5.c(bool3.booleanValue());
                        return acmhVar5.a();
                    }
                };
                awliVar2.getClass();
                avlr avlrVarK = avlr.k(new avlu[]{avlrVarAg, avluVarJ, avlrVarB, awliVar2, avlrVarX, avlrVarJ, avluVarJ2, avlrVarR2, avlrVarC}, new avnz(avnmVar, 0), avlh.a);
                int i12 = 19;
                return (acoiVar4.ck.j() ? avlrVarK.B(new wsh(obj11, 20)).B(new wsh(obj11, i12)) : avlrVarK.B(new wsh(obj11, i12))).r().O(acoiVar4.am).af(new avni() { // from class: acnw
                    @Override // defpackage.avni
                    public final void a(Object obj12) {
                        acmi acmiVar = (acmi) obj12;
                        Optional optionalOf = Optional.of(acmiVar);
                        acoi acoiVar5 = acoiVar4;
                        acoiVar5.bI = optionalOf;
                        acmg acmgVar = acoiVar5.al;
                        boolean zD = acoiVar5.d();
                        View view = acmgVar.f;
                        boolean z = true;
                        if (view != null) {
                            if (acmiVar == null) {
                                acfz.I(view, false);
                            } else {
                                acmgVar.h = acmiVar.d;
                                agke agkeVar = acmiVar.c;
                                if (agkeVar.isEmpty() && zD) {
                                    acfz.I(acmgVar.f, false);
                                } else {
                                    View view2 = acmgVar.f;
                                    Context context = view2 == null ? null : view2.getContext();
                                    View view3 = acmgVar.f;
                                    LinearLayout linearLayout = view3 == null ? null : (LinearLayout) view3.findViewById(R.id.reel_header_options_container);
                                    if (linearLayout != null && context != null) {
                                        if (agkeVar.isEmpty()) {
                                            acfz.I(linearLayout, false);
                                        } else {
                                            linearLayout.removeAllViews();
                                            int i13 = ((agpi) agkeVar).d;
                                            for (int i14 = 0; i14 < i13; i14++) {
                                                ajnf ajnfVar = (ajnf) agkeVar.get(i14);
                                                AppCompatImageView appCompatImageView = new AppCompatImageView(context);
                                                linearLayout.addView(appCompatImageView);
                                                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.reel_header_option_button_padding);
                                                appCompatImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                                                appCompatImageView.setBackground(context.getDrawable(R.drawable.reel_circular_button_background));
                                                appCompatImageView.setImageTintList(tzk.k(context, R.attr.ytOverlayTextPrimary));
                                                int i15 = ajnfVar.e;
                                                if (i15 == 8) {
                                                    aduv aduvVar = acmgVar.b;
                                                    aliz alizVarA = aliz.a((i15 == 8 ? (alja) ajnfVar.f : alja.a).c);
                                                    if (alizVarA == null) {
                                                        alizVarA = aliz.UNKNOWN;
                                                    }
                                                    appCompatImageView.setImageResource(aduvVar.a(alizVarA));
                                                }
                                                if ((ajnfVar.b & 262144) != 0) {
                                                    aiqe aiqeVar = ajnfVar.v;
                                                    if (aiqeVar == null) {
                                                        aiqeVar = aiqe.a;
                                                    }
                                                    aiqd aiqdVar = aiqeVar.c;
                                                    if (aiqdVar == null) {
                                                        aiqdVar = aiqd.a;
                                                    }
                                                    appCompatImageView.setContentDescription(aiqdVar.c);
                                                }
                                                if ((ajnfVar.b & SemanticState.Multiline) != 0) {
                                                    appCompatImageView.setOnClickListener(new vqd((Object) acmgVar, (aihn) ajnfVar, 19));
                                                }
                                                if ((ajnfVar.b & 2097152) != 0) {
                                                    acmgVar.a.hB().l(new xgj(ajnfVar.y, (amud) null));
                                                }
                                            }
                                            acfz.I(linearLayout, true);
                                        }
                                    }
                                    View view4 = acmgVar.f;
                                    View viewFindViewById = view4 == null ? null : view4.findViewById(R.id.reel_back_button);
                                    if (viewFindViewById != null) {
                                        if (zD) {
                                            acfz.I(viewFindViewById, false);
                                        } else {
                                            viewFindViewById.setOnClickListener(new yde(acmgVar, 6));
                                            acfz.I(viewFindViewById, true);
                                        }
                                    }
                                    View view5 = acmgVar.f;
                                    YouTubeTextView youTubeTextView = view5 == null ? null : (YouTubeTextView) view5.findViewById(R.id.contextual_header_title);
                                    if (youTubeTextView != null) {
                                        apev apevVar = acmgVar.h;
                                        if (apevVar == null || (apevVar.b & 1) == 0) {
                                            youTubeTextView.setText((CharSequence) null);
                                            acfz.I(youTubeTextView, false);
                                        } else {
                                            alay alayVar = apevVar.c;
                                            if (alayVar == null) {
                                                alayVar = alay.a;
                                            }
                                            youTubeTextView.setText(ackj.k(null, alayVar, null, false));
                                        }
                                    }
                                    acfz.I(acmgVar.f, true);
                                }
                            }
                        }
                        acmg acmgVar2 = acoiVar5.al;
                        boolean zI = acoiVar5.z.i();
                        if (acmgVar2.h != null) {
                            View view6 = acmgVar2.f;
                            YouTubeTextView youTubeTextView2 = view6 != null ? (YouTubeTextView) view6.findViewById(R.id.contextual_header_title) : null;
                            if (youTubeTextView2 != null) {
                                apev apevVar2 = acmgVar2.h;
                                if (apevVar2 != null && apevVar2.d && !zI) {
                                    z = false;
                                }
                                acfz.I(youTubeTextView2, z);
                            }
                        }
                    }
                });
            case 14:
                Object obj12 = this.a;
                acoi acoiVar5 = (acoi) obj12;
                return acoiVar5.S.h.d().r(acoiVar5.am).E(new vtu(obj12, i10));
            case 15:
                Object obj13 = this.a;
                acoi acoiVar6 = (acoi) obj13;
                acqz acqzVar = acoiVar6.t;
                awli awliVar3 = acqzVar.t;
                awli awliVar4 = acqzVar.u;
                avlr avlrVarAg2 = (acoiVar6.ck.aK() ? nsj.f() : avlh.G(Boolean.FALSE)).ag();
                acny acnyVar = new acny(i9);
                awliVar3.getClass();
                awliVar4.getClass();
                avlr avlrVarK2 = avlr.k(new avlu[]{awliVar3, awliVar4, avlrVarAg2}, new avnx(acnyVar, 0), avlh.a);
                tqj tqjVar = acoiVar6.aA;
                int i13 = tqr.a;
                if (tqjVar.l(1074025686, 1)) {
                    avlrVarK2 = avlrVarK2.O(acoiVar6.am);
                }
                return avlrVarK2.ag(new acnt(obj13, i5), new abxq(i10));
            case 16:
                return this.a;
            case 17:
                Object obj14 = this.a;
                return ((acqz) obj14).ao.p(0, 45358111L).af(new acpf(obj14, i2));
            case 18:
                Object obj15 = this.a;
                return ((acqz) obj15).t.af(new acpf(obj15, i6));
            case 19:
                return ((adak) this.a).a();
            default:
                Object obj16 = this.a;
                Optional optionalB = ((adsr) obj16).x.b();
                adha adhaVar = new adha(obj16, 4);
                if (true == optionalB.isPresent()) {
                    optionalB = Optional.ofNullable(((avlr) optionalB.get()).ag(new adsm((adsr) adhaVar.a), new achk(i8)));
                }
                return (avmn) optionalB.orElse(new avmq(avoi.b));
        }
    }
}
