package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hqa implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hqa(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r2v75, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, wer] */
    @Override // java.lang.Runnable
    public final void run() {
        jhq jhqVar;
        long j = 250;
        int i = 0;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                Object obj = this.b;
                Object obj2 = this.a;
                Optional optionalB = ((hqg) obj2).b();
                gtr gtrVar = new gtr(obj2, obj, 16);
                if (true == optionalB.isPresent()) {
                    Object obj3 = optionalB.get();
                    Object obj4 = gtrVar.a;
                    Optional optionalC = ((hqg) obj4).c(((aahj) gtrVar.b).a);
                    gtr gtrVar2 = new gtr(obj4, (wer) obj3, 14);
                    if (true == optionalC.isPresent()) {
                        Object obj5 = optionalC.get();
                        Object obj6 = gtrVar2.a;
                        ?? r2 = gtrVar2.b;
                        aamj aamjVar = (aamj) obj5;
                        hqg hqgVar = (hqg) obj6;
                        if (!((vxz) hqgVar.h.io()).l(60, 45385690L, false)) {
                            hqgVar.h(r2);
                            hqgVar.g(r2, aamjVar);
                            hqg.o(r2);
                        } else {
                            ahno.at(hqgVar.a(r2), new hqd(obj6, (Object) r2, aamjVar, 1), hqgVar.i);
                        }
                    }
                }
                break;
            case 1:
                Object obj7 = this.b;
                Object obj8 = this.a;
                Optional optionalB2 = ((hqg) obj8).b();
                hqc hqcVar = new hqc(obj8, obj7, 8);
                if (true == optionalB2.isPresent()) {
                    Object obj9 = optionalB2.get();
                    Object obj10 = hqcVar.a;
                    Optional optionalC2 = ((hqg) obj10).c(((aahr) hqcVar.b).a.a());
                    hqc hqcVar2 = new hqc(obj10, (wer) obj9, 7);
                    if (true == optionalC2.isPresent()) {
                        Object obj11 = optionalC2.get();
                        Object obj12 = hqcVar2.a;
                        ?? r3 = hqcVar2.b;
                        ((hqg) obj12).g(r3, (aamj) obj11);
                        hqg.o(r3);
                    }
                }
                break;
            case 2:
                Object obj13 = this.b;
                Object obj14 = this.a;
                Optional optionalB3 = ((hqg) obj14).b();
                gtr gtrVar3 = new gtr(obj14, obj13, 20);
                if (true == optionalB3.isPresent()) {
                    Object obj15 = optionalB3.get();
                    Object obj16 = gtrVar3.a;
                    Optional optionalD = ((hqg) obj16).d(((aaif) gtrVar3.b).a.b());
                    gtr gtrVar4 = new gtr(obj16, (wer) obj15, 17);
                    if (true == optionalD.isPresent()) {
                        Object obj17 = optionalD.get();
                        Object obj18 = gtrVar4.a;
                        ?? r4 = gtrVar4.b;
                        ((hqg) obj18).i(r4, (aamt) obj17);
                        hqg.o(r4);
                    }
                }
                break;
            case 3:
                Object obj19 = this.b;
                Object obj20 = this.a;
                Optional optionalB4 = ((hqg) obj20).b();
                hqc hqcVar3 = new hqc(obj20, obj19, 3);
                if (true == optionalB4.isPresent()) {
                    Object obj21 = optionalB4.get();
                    Object obj22 = hqcVar3.a;
                    Optional optionalD2 = ((hqg) obj22).d(((aaht) hqcVar3.b).a.b());
                    gtr gtrVar5 = new gtr(obj22, (wer) obj21, 13);
                    if (true == optionalD2.isPresent()) {
                        Object obj23 = optionalD2.get();
                        Object obj24 = gtrVar5.a;
                        ?? r5 = gtrVar5.b;
                        ((hqg) obj24).i(r5, (aamt) obj23);
                        hqg.o(r5);
                    }
                }
                break;
            case 4:
                Object obj25 = this.b;
                Object obj26 = this.a;
                Optional optionalB5 = ((hqg) obj26).b();
                hqc hqcVar4 = new hqc(obj26, obj25, 6);
                if (true == optionalB5.isPresent()) {
                    Object obj27 = optionalB5.get();
                    Object obj28 = hqcVar4.a;
                    Object obj29 = hqcVar4.b;
                    wer werVar = (wer) obj27;
                    hqg hqgVar2 = (hqg) obj28;
                    aauk aaukVar = hqgVar2.f;
                    String str = ((aaia) obj29).a;
                    if (aaukVar.m()) {
                        hqgVar2.n(werVar, kro.aI(str), kro.aH(str));
                    } else {
                        hqgVar2.n(werVar, kro.aw(str), kro.av(str), kro.aJ(str), kro.ax(str), kro.aI(str), kro.aH(str));
                    }
                    hqg.o(werVar);
                }
                break;
            case 5:
                Object obj30 = this.b;
                Object obj31 = this.a;
                Optional optionalB6 = ((hqg) obj31).b();
                gtr gtrVar6 = new gtr(obj31, obj30, 12);
                if (true == optionalB6.isPresent()) {
                    Object obj32 = optionalB6.get();
                    Object obj33 = gtrVar6.a;
                    Optional optionalD3 = ((hqg) obj33).d(((aahz) gtrVar6.b).a.b());
                    gtr gtrVar7 = new gtr(obj33, (wer) obj32, 19);
                    if (true == optionalD3.isPresent()) {
                        Object obj34 = optionalD3.get();
                        Object obj35 = gtrVar7.a;
                        ?? r6 = gtrVar7.b;
                        ((hqg) obj35).i(r6, (aamt) obj34);
                        hqg.o(r6);
                    }
                }
                break;
            case 6:
                Object obj36 = this.b;
                Object obj37 = this.a;
                Optional optionalB7 = ((hqg) obj37).b();
                hqc hqcVar5 = new hqc(obj37, obj36, i);
                if (true == optionalB7.isPresent()) {
                    Object obj38 = optionalB7.get();
                    Object obj39 = hqcVar5.a;
                    Optional optionalC3 = ((hqg) obj39).c(((aaho) hqcVar5.b).a.a());
                    hqc hqcVar6 = new hqc(obj39, (wer) obj38, 2);
                    if (true == optionalC3.isPresent()) {
                        Object obj40 = optionalC3.get();
                        Object obj41 = hqcVar6.a;
                        ?? r7 = hqcVar6.b;
                        ((hqg) obj41).g(r7, (aamj) obj40);
                        hqg.o(r7);
                    }
                }
                break;
            case 7:
                Object obj42 = this.b;
                Object obj43 = this.a;
                Optional optionalB8 = ((hqg) obj43).b();
                hqc hqcVar7 = new hqc(obj43, obj42, 5);
                if (true == optionalB8.isPresent()) {
                    wer werVar2 = (wer) optionalB8.get();
                    ((hqg) hqcVar7.a).i(werVar2, (aamt) hqcVar7.b);
                    hqg.o(werVar2);
                }
                break;
            case 8:
                Object obj44 = this.b;
                Object obj45 = this.a;
                Optional optionalB9 = ((hqg) obj45).b();
                hqc hqcVar8 = new hqc(obj45, obj44, i2);
                if (true == optionalB9.isPresent()) {
                    Object obj46 = optionalB9.get();
                    Object obj47 = hqcVar8.a;
                    Optional optionalC4 = ((hqg) obj47).c(((aahp) hqcVar8.b).a);
                    gtr gtrVar8 = new gtr(obj47, (wer) obj46, 15);
                    if (true == optionalC4.isPresent()) {
                        Object obj48 = optionalC4.get();
                        Object obj49 = gtrVar8.a;
                        ?? r8 = gtrVar8.b;
                        ((hqg) obj49).g(r8, (aamj) obj48);
                        hqg.o(r8);
                    }
                }
                break;
            case 9:
                Object obj50 = this.b;
                Object obj51 = this.a;
                Optional optionalB10 = ((hqg) obj51).b();
                hqc hqcVar9 = new hqc(obj51, obj50, 4);
                if (true == optionalB10.isPresent()) {
                    Object obj52 = optionalB10.get();
                    Object obj53 = hqcVar9.a;
                    Object obj54 = hqcVar9.b;
                    wer werVar3 = (wer) obj52;
                    hqg hqgVar3 = (hqg) obj53;
                    if (!((vxz) hqgVar3.h.io()).l(60, 45385690L, false)) {
                        hqgVar3.h(werVar3);
                        hqgVar3.m(werVar3, ((aahm) obj54).a);
                        hqg.o(werVar3);
                    } else {
                        ahno.at(hqgVar3.a(werVar3), new hqd(obj53, werVar3, obj54, 0), hqgVar3.i);
                    }
                }
                break;
            case 10:
                ((hvu) this.a).b.d.i((abnl) this.b, hxb.a);
                break;
            case 11:
                hwc hwcVar = (hwc) this.a;
                abgi abgiVar = hwcVar.j;
                Object obj55 = this.b;
                if (!abgiVar.equals(obj55)) {
                    abgi abgiVar2 = (abgi) obj55;
                    hwcVar.j = abgiVar2;
                    hwcVar.K();
                    abgh abghVar = abgiVar2.a;
                    if (abghVar == abgh.a) {
                        hwcVar.E.d();
                    } else if (abghVar == abgh.f) {
                        ibf ibfVar = hwcVar.E;
                        abhk abhkVar = ibfVar.a;
                        if (abhkVar.m() != 0) {
                            abhl abhlVar = ibfVar.b;
                            abhlVar.b = 0L;
                            abhkVar.v(abhlVar);
                        }
                    }
                    if ((abghVar == abgh.c || abghVar == abgh.f) && hwcVar.o) {
                        hwcVar.C();
                    }
                    heg hegVar = hwcVar.U;
                    if (hegVar != null) {
                        hegVar.a = obj55;
                    }
                }
                hwcVar.j();
                break;
            case 12:
                iaw iawVar = (iaw) this.a;
                abqq abqqVar = iawVar.f;
                String str2 = (String) this.b;
                abqqVar.f(str2);
                iawVar.c(str2);
                iawVar.e.d(str2, false);
                break;
            case 13:
                ((idr) this.a).l.h((aimm) this.b);
                break;
            case 14:
                ((inu) this.a).c((alxg) this.b);
                break;
            case 15:
                this.b.iT(null, new IllegalArgumentException("Unexpected browse ID: ".concat(String.valueOf(String.valueOf(this.a)))));
                break;
            case 16:
                this.b.run();
                ((jcl) this.a).b = null;
                break;
            case 17:
                ?? r1 = this.b;
                int size = r1.size();
                while (i < size) {
                    jhf jhfVar = (jhf) r1.get(i);
                    Object obj56 = this.a;
                    Object obj57 = jhfVar.e;
                    int i3 = jhfVar.a;
                    int i4 = jhfVar.b;
                    int i5 = jhfVar.c;
                    int i6 = jhfVar.d;
                    oh ohVar = (oh) obj57;
                    View view = ohVar.a;
                    int i7 = i5 - i3;
                    int i8 = i6 - i4;
                    if (i7 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i8 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    jhg jhgVar = (jhg) obj56;
                    jhgVar.e.add(obj57);
                    viewPropertyAnimatorAnimate.setDuration(250L).setListener(new jhb(jhgVar, ohVar, i7, view, i8, viewPropertyAnimatorAnimate)).start();
                    i++;
                }
                ((ArrayList) r1).clear();
                ((jhg) this.a).b.remove((Object) r1);
                break;
            case 18:
                ?? r9 = this.b;
                int size2 = r9.size();
                while (i < size2) {
                    jhe jheVar = (jhe) r9.get(i);
                    Object obj58 = this.a;
                    oh ohVar2 = jheVar.a;
                    View view2 = ohVar2 == null ? null : ohVar2.a;
                    oh ohVar3 = jheVar.b;
                    View view3 = ohVar3 != null ? ohVar3.a : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j);
                        jhg jhgVar2 = (jhg) obj58;
                        jhgVar2.g.add(ohVar2);
                        duration.translationX(jheVar.e - jheVar.c);
                        duration.translationY(jheVar.f - jheVar.d);
                        duration.alpha(0.0f).setListener(new jhc(jhgVar2, ohVar2, duration, view2)).start();
                    }
                    if (view3 != null) {
                        jhg jhgVar3 = (jhg) obj58;
                        ArrayList arrayList = jhgVar3.g;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                        arrayList.add(ohVar3);
                        viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new jhd(jhgVar3, ohVar3, viewPropertyAnimatorAnimate2, view3)).start();
                    }
                    i++;
                    j = 250;
                }
                ((ArrayList) r9).clear();
                ((jhg) this.a).c.remove((Object) r9);
                break;
            case 19:
                ?? r10 = this.b;
                int size3 = r10.size();
                while (i < size3) {
                    oh ohVar4 = (oh) r10.get(i);
                    Object obj59 = this.a;
                    View view4 = ohVar4.a;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                    jhg jhgVar4 = (jhg) obj59;
                    jhgVar4.d.add(ohVar4);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(((nl) obj59).h).setListener(new jha(jhgVar4, ohVar4, view4, viewPropertyAnimatorAnimate3)).start();
                    i++;
                }
                ((ArrayList) r10).clear();
                ((jhg) this.a).a.remove((Object) r10);
                break;
            default:
                TabbedView tabbedView = (TabbedView) this.a;
                agke agkeVarC = tabbedView.a.c();
                int size4 = agkeVarC.size();
                while (true) {
                    if (i < size4) {
                        Object obj60 = this.b;
                        jhq jhqVar2 = (jhq) agkeVarC.get(i);
                        i++;
                        if (jhqVar2.d == obj60) {
                            jhqVar = jhqVar2;
                        }
                    } else {
                        jhqVar = null;
                    }
                }
                if (jhqVar != null) {
                    tabbedView.a.f(jhqVar);
                }
                break;
        }
    }

    public hqa(jhg jhgVar, ArrayList arrayList, int i) {
        this.$cid = i;
        this.b = arrayList;
        this.a = jhgVar;
    }

    public /* synthetic */ hqa(sxu sxuVar, Uri uri, int i) {
        this.$cid = i;
        this.b = sxuVar;
        this.a = uri;
    }
}
