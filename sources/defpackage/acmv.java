package defpackage;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.libraries.youtube.reel.internal.player.ReelPlayerView;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acmv implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acmv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v22, types: [acnh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v49, types: [actu, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.avni
    public final void a(Object obj) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        acnk acnkVar;
        acra acraVar;
        acnk acnkVar2;
        acra acraVar2;
        abgp abgpVar;
        View view;
        int i = 4;
        int i2 = 3;
        int i3 = 5;
        int i4 = 2;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                int iOrdinal = ((aayw) obj).b.ordinal();
                Object obj2 = this.a;
                if (iOrdinal != 1) {
                    ((acmw) obj2).a();
                    return;
                } else {
                    ((acmw) obj2).b();
                    return;
                }
            case 1:
                int i5 = ((aazn) obj).a;
                Object obj3 = this.a;
                if (i5 == 5 || i5 == 6) {
                    ((acmw) obj3).b();
                    return;
                } else {
                    ((acmw) obj3).a();
                    return;
                }
            case 2:
                ((acmy) this.a).b.kk(((apet) obj).getIsVisible());
                return;
            case 3:
                Pair pair = (Pair) obj;
                boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
                int iIntValue = ((Integer) pair.second).intValue();
                acng acngVar = (acng) this.a;
                acngVar.e = zBooleanValue;
                if (zBooleanValue) {
                    acngVar.i(iIntValue);
                    return;
                }
                return;
            case 4:
                acng acngVar2 = (acng) this.a;
                acngVar2.f(acngVar2.a());
                if (acngVar2.o.aA()) {
                    acngVar2.g.kk(Integer.valueOf((acngVar2.e || acngVar2.k()) ? acngVar2.f : 0));
                    return;
                }
                return;
            case 5:
                acng acngVar3 = (acng) this.a;
                ((vor) acngVar3.a.io()).u(false);
                acngVar3.c(0);
                acngVar3.b(0);
                acngVar3.d(0);
                return;
            case 6:
                acng acngVar4 = (acng) this.a;
                if (acngVar4.e) {
                    return;
                }
                acngVar4.b(0);
                acngVar4.c(0);
                acngVar4.d(0);
                return;
            case 7:
                tuy tuyVar = (tuy) obj;
                acni acniVar = (acni) this.a;
                if (acniVar.a != null) {
                    Rect rect = tuyVar.a.a;
                    if (((rect.top < 0 || (rect.top == 0 && !acniVar.j.aK())) && acniVar.j.aQ()) || acniVar.g) {
                        return;
                    }
                    acniVar.c = rect.top;
                    if (acniVar.j.aQ()) {
                        acnh acnhVar = acniVar.a;
                        if (acnhVar != null && (viewGroup2 = (ViewGroup) acnhVar.k()) != null) {
                            viewGroup2.setPadding(0, acniVar.c - acniVar.a(), 0, 0);
                            if (acniVar.a.o() && (viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.reel_static_header_group)) != null) {
                                tym.h(viewGroup3, new tyj(acniVar.a(), 2), ViewGroup.MarginLayoutParams.class);
                            }
                        }
                    } else {
                        acnh acnhVar2 = acniVar.a;
                        if (acnhVar2 != null && acnhVar2.o() && (viewGroup = (ViewGroup) acniVar.a.k()) != null) {
                            viewGroup.setPadding(0, acniVar.c, 0, 0);
                        }
                    }
                    acor acorVar = acniVar.b;
                    if (acorVar != null) {
                        acorVar.k.set(rect);
                        if (acorVar.m == acos.f) {
                            acorVar.c();
                        }
                    }
                    acniVar.a.n(tuyVar);
                    return;
                }
                return;
            case 8:
                View viewK = this.a.k();
                if (viewK != null) {
                    int i6 = bac.a;
                    viewK.requestApplyInsets();
                    return;
                }
                return;
            case 9:
                acvm acvmVar = (acvm) obj;
                acvmVar.getClass();
                Object obj4 = this.a;
                int iE = a.E(acvmVar);
                if (iE == 0) {
                    acvh acvhVar = (acvh) acvmVar;
                    boolean z2 = acvhVar.a;
                    acra acraVar3 = acvhVar.c;
                    acnk acnkVar3 = (acnk) obj4;
                    acnkVar3.m = acraVar3;
                    acnkVar3.k = true;
                    acrp acrpVar = acraVar3.i;
                    if (acrpVar == null || (viewGroup4 = acrpVar.t) == null) {
                        return;
                    }
                    acnkVar3.r.a = viewGroup4;
                    acnkVar3.d.d.kk(Boolean.TRUE);
                    ilv ilvVar = acnkVar3.p;
                    ilvVar.f = z2;
                    ilvVar.b = Optional.of(viewGroup4);
                    if (viewGroup4.getChildCount() > 0) {
                        View childAt = viewGroup4.getChildAt(0);
                        if (z2) {
                            ilvVar.d = Optional.of(ilvVar.a((LoadingFrameLayout) childAt));
                        } else {
                            ilvVar.e = Optional.ofNullable(ilvVar.b(childAt));
                        }
                    }
                    if (acnkVar3.l) {
                        acnkVar3.l = false;
                        acnkVar3.h();
                        return;
                    }
                    return;
                }
                if (iE != 1) {
                    if (iE == 2) {
                        return;
                    } else if (iE == 3) {
                        return;
                    } else {
                        if (iE != 4) {
                            throw new RuntimeException(null, null);
                        }
                        return;
                    }
                }
                acnk acnkVar4 = (acnk) obj4;
                acnkVar4.d();
                acnkVar4.l = false;
                ilv ilvVar2 = acnkVar4.p;
                ilvVar2.c = Optional.empty();
                if (ilvVar2.d.isPresent()) {
                    ((ViewGroup) ilvVar2.b.get()).removeAllViews();
                    ilvVar2.d = Optional.empty();
                }
                ilvVar2.e = Optional.empty();
                ilvVar2.b = Optional.empty();
                ilvVar2.f = false;
                acnkVar4.k = false;
                acnkVar4.m = null;
                return;
            case 10:
                ((acnk) this.a).l((acsu) obj);
                return;
            case 11:
                aayw aaywVar = (aayw) obj;
                String str = aaywVar.f;
                acnk acnkVar5 = (acnk) this.a;
                acnkVar5.n = str;
                abnw abnwVar = aaywVar.b;
                if (abnwVar.a(abnw.b) && !acnkVar5.q.i()) {
                    boolean z3 = acnkVar5.k;
                    acnkVar5.l = !z3;
                    if (z3) {
                        acnkVar5.h();
                        return;
                    }
                    return;
                }
                acnkVar5.l = false;
                if (abnwVar.a(abnw.d)) {
                    acnkVar5.d();
                    ilv ilvVar3 = acnkVar5.p;
                    if (ilvVar3.f) {
                        Optional optional = ilvVar3.d;
                        if (true == optional.isPresent()) {
                            ((ilt) optional.get()).a.l();
                        }
                    } else {
                        Optional optional2 = ilvVar3.e;
                        if (true == optional2.isPresent()) {
                            ((ilu) optional2.get()).b.a(null);
                        }
                    }
                    acnkVar5.i(false);
                    return;
                }
                return;
            case 12:
                if (!((aayt) obj).a.a(abnv.e) || (acraVar = (acnkVar = (acnk) this.a).m) == null) {
                    return;
                }
                acrp acrpVar2 = acraVar.i;
                if (acrpVar2 != null) {
                    ViewGroup viewGroup5 = acrpVar2.u;
                    if (viewGroup5 != null) {
                        viewGroup5.setVisibility(0);
                    }
                    ViewGroup viewGroup6 = acrpVar2.t;
                    if (viewGroup6 != null) {
                        viewGroup6.setVisibility(8);
                    }
                }
                acnkVar.i(false);
                return;
            case 13:
                aboe aboeVar = (aboe) obj;
                int i7 = aboeVar.j;
                if (i7 == 4 || (acraVar2 = (acnkVar2 = (acnk) this.a).m) == null) {
                    return;
                }
                acrp acrpVar3 = acraVar2.i;
                apfp apfpVarC = acraVar2.c();
                if (acrpVar3 == null || apfpVarC == null || !acnkVar2.h.b(apfpVarC.o)) {
                    acnkVar2.j(Optional.ofNullable(aboeVar.c));
                    acts actsVar = acnkVar2.j;
                    actsVar.a(3);
                    actsVar.g(ahno.Z(acnkVar2.n), 3, "Playback Error: Failure Reason is " + aawb.A(i7) + ':' + aboeVar.c);
                    return;
                }
                return;
            case 14:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj5 = this.a;
                if (!zBooleanValue2) {
                    ((acoi) obj5).ao.c.b();
                    return;
                }
                acdc acdcVar = ((acoi) obj5).ao;
                avmm avmmVar = acdcVar.c;
                abvn abvnVar = acdcVar.a;
                avmmVar.e(abvnVar.M(new abzr(i4), new abzr(i2)).i(aawb.y(abvnVar.X(), 1073741824L)).i(new abwr(1)).al(new acaa(acdcVar, 7), new abxq(5)), abvnVar.M(new abzr(i4), new abzr(i)).i(aawb.y(abvnVar.X(), 1073741824L)).i(new abwr(1)).al(new acaa(acdcVar, 7), new abxq(5)), abvnVar.M(new abzr(i4), new abzr(i3)).i(aawb.y(abvnVar.X(), 1073741824L)).i(new abwr(1)).al(new acaa(acdcVar, 6), new abxq(5)));
                return;
            case 15:
                ((acoi) this.a).bx.kk((Boolean) obj);
                return;
            case 16:
                ?? r14 = this.a;
                acvn acvnVar = (acvn) obj;
                acoi acoiVar = (acoi) r14;
                if (acoiVar.ck.G() && acoiVar.ba == null) {
                    return;
                }
                acoiVar.y.k = acvnVar;
                acpe acpeVar = acoiVar.D;
                acpeVar.b();
                acvn acvnVar2 = acvn.b;
                boolean z4 = acvnVar == acvnVar2;
                acpeVar.m = z4;
                if (z4) {
                    acpeVar.d();
                }
                int iOrdinal2 = acvnVar.ordinal();
                if (iOrdinal2 == 1) {
                    if (acoiVar.ck.aK() && (view = acoiVar.bb) != null) {
                        tym.h(view, new tyk(0, 0, 0, 0), ViewGroup.MarginLayoutParams.class);
                    }
                    acoz acozVar = acoiVar.aZ;
                    if (acozVar != null && (abgpVar = acozVar.b) != null) {
                        abgpVar.k();
                    }
                    if (acoiVar.ca.l(11, 45621798L, false) && acoiVar.bh) {
                        acoiVar.G.b();
                        acoiVar.v.e();
                        acoiVar.t.x();
                        acoiVar.u.z(r14);
                        acoiVar.J.f(acoiVar.aK);
                        acoz acozVar2 = acoiVar.aZ;
                        if (acozVar2 != null) {
                            acoiVar.J.f(acozVar2.b.v);
                        }
                        acoiVar.J.f(acoiVar.y);
                        acoiVar.X();
                    }
                    if (acoiVar.ck.aZ()) {
                        vor vorVar = (vor) acoiVar.ah.io();
                        if (vorVar != null && vorVar.I()) {
                            vorVar.M(false);
                            acoiVar.ai();
                            if (acoiVar.ck.aM()) {
                                acoiVar.ak();
                                acoiVar.aj();
                            }
                        }
                        acoiVar.t.O();
                        acoiVar.t.N();
                        acoiVar.Z(false);
                        acoiVar.bK = true;
                        acoiVar.q.d = true;
                        acoiVar.n.d(true);
                        if (acoiVar.ck.aM()) {
                            acoiVar.q.k = new vtl(Alert.DURATION_SHOW_INDEFINITELY, 0);
                        }
                    }
                } else if (iOrdinal2 == 2 && acoiVar.bK && acoiVar.ck.aZ()) {
                    if (acoiVar.B() != null) {
                        acoiVar.Z(acoiVar.af());
                    }
                    acoiVar.bK = false;
                    acoiVar.q.d = false;
                    acoiVar.n.d(false);
                }
                acoiVar.N();
                boolean zEquals = acvnVar.equals(acvnVar2);
                ReelPlayerView reelPlayerView = acoiVar.ba;
                if (reelPlayerView != null) {
                    reelPlayerView.d = zEquals;
                    reelPlayerView.invalidate();
                }
                abnc abncVar = acoiVar.F.f;
                if (zEquals != abncVar.g) {
                    abncVar.g = zEquals;
                    abncVar.f();
                }
                acoiVar.ch.a = zEquals;
                acoiVar.aR.kk(acvnVar);
                return;
            case 17:
                ((awli) this.a).kk((Boolean) obj);
                return;
            case 18:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                acoi acoiVar2 = (acoi) this.a;
                acoiVar2.bj = zBooleanValue3;
                if (zBooleanValue3) {
                    return;
                }
                acoiVar2.z.h(false);
                return;
            case 19:
                ((acoi) this.a).l((acsu) obj);
                return;
            default:
                aayw aaywVar2 = (aayw) obj;
                acoh acohVar = (acoh) this.a;
                acoi acoiVar3 = acohVar.b;
                if (acoiVar3.ck.G() && acoiVar3.ba == null) {
                    return;
                }
                if (aaywVar2.b.a(abnw.c)) {
                    synchronized (acoiVar3.aV) {
                        acoiVar3.Q(true);
                        break;
                    }
                    acohVar.b.y.d();
                }
                acoi acoiVar4 = acohVar.b;
                if (!acoiVar4.ck.aw() && aaywVar2.b.a(abnw.b)) {
                    Optional optionalK = acoiVar4.t.k(acoiVar4.bu);
                    vre vreVar = new vre(acoiVar4, 20);
                    if (true == optionalK.isPresent()) {
                        optionalK = Optional.ofNullable(((acoi) vreVar.a).y((acra) optionalK.get()));
                    }
                    if (true == optionalK.isPresent()) {
                        optionalK = Optional.ofNullable(Boolean.valueOf(aecm.aj(((acra) optionalK.get()).f)));
                    }
                    acoiVar4.av.a = ((Boolean) optionalK.orElse(Boolean.FALSE)).booleanValue();
                }
                wjf wjfVar = aaywVar2.c;
                acoiVar4.M(wjfVar);
                acoiVar4.ap();
                if (aaywVar2.b.b(abnw.d)) {
                    wjfVar.getClass();
                    ReelPlayerView reelPlayerView2 = acoiVar4.ba;
                    if (reelPlayerView2 != null) {
                        if (wjfVar.f().aR()) {
                            reelPlayerView2.setVisibility(4);
                        } else {
                            reelPlayerView2.setVisibility(0);
                        }
                        if (!acoiVar4.ck.aK() && !acoiVar4.ck.au()) {
                            z = false;
                        }
                        reelPlayerView2.l = z;
                    }
                    ajwo ajwoVar = aaywVar2.e;
                    if (ajwoVar != null) {
                        acoiVar4.E.c(ajwoVar, wjfVar.u());
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
