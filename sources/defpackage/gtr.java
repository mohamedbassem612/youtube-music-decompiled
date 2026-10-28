package defpackage;

import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gtr implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gtr(gms gmsVar, View view, int i) {
        this.$cid = i;
        this.b = gmsVar;
        this.a = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r11v42, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v73, types: [java.lang.Object, wer] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        Long lValueOf;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                Object obj2 = this.b;
                Object obj3 = this.a;
                jio jioVarE = jin.e();
                ((jik) jioVarE).k(((gts) obj3).b.b((Throwable) obj2));
                ((jin) obj).d(jioVarE.b());
                break;
            case 1:
                View view = (View) obj;
                Object obj4 = this.b;
                gms gmsVar = (gms) obj4;
                if (gmsVar.D()) {
                    ViewGroup viewGroup = gmsVar.x;
                    if (viewGroup != null) {
                        viewGroup.addView(view);
                    }
                    gmsVar.w(true);
                    ViewGroup viewGroup2 = gmsVar.x;
                    if (viewGroup2 != null) {
                        tuk.l(viewGroup2, true);
                    }
                    gmsVar.t();
                    gmsVar.w = new jg(obj4, 6, null);
                    CollapsingToolbarLayout collapsingToolbarLayout = gmsVar.v;
                    if (collapsingToolbarLayout != null) {
                        collapsingToolbarLayout.getViewTreeObserver().addOnGlobalLayoutListener(gmsVar.w);
                    }
                } else {
                    gmsVar.t();
                    CollapsingToolbarLayout collapsingToolbarLayout2 = gmsVar.v;
                    if (collapsingToolbarLayout2 != null) {
                        collapsingToolbarLayout2.addView(view);
                        Toolbar toolbar = gmsVar.y;
                        if (toolbar != null) {
                            gmsVar.v.bringChildToFront(toolbar);
                        }
                    }
                    gmsVar.w(false);
                    ViewGroup viewGroup3 = gmsVar.x;
                    if (viewGroup3 != null) {
                        tuk.l(viewGroup3, false);
                    }
                }
                Object obj5 = this.a;
                if (obj5 != null) {
                    ((View) obj5).requestFocus();
                }
                break;
            case 2:
                weh wehVar = (weh) obj;
                if (((hlg) this.a).a) {
                    Optional optionalQ = hpb.q(wehVar);
                    if (true == optionalQ.isPresent()) {
                        optionalQ.get();
                        optionalQ = Optional.ofNullable(-1L);
                    }
                    lValueOf = (Long) optionalQ.orElse(Long.valueOf(hpb.b(wehVar)));
                } else {
                    lValueOf = Long.valueOf(hpb.b(wehVar));
                }
                this.b.add(lValueOf);
                break;
            case 3:
                Optional optionalQ2 = hpb.q((weh) obj);
                gtr gtrVar = new gtr(this.a, this.b, 4);
                if (true == optionalQ2.isPresent()) {
                    Object obj6 = optionalQ2.get();
                    Object obj7 = gtrVar.a;
                    Object obj8 = gtrVar.b;
                    anxf anxfVar = (anxf) obj6;
                    String str = anxfVar.c;
                    hmn hmnVar = ((hmk) obj7).b.j;
                    hmnVar.a(str);
                    String str2 = anxfVar.d;
                    if (!TextUtils.isEmpty(str2)) {
                        jin jinVar = hmnVar.e;
                        cf cfVar = hmnVar.a;
                        jio jioVarE2 = jin.e();
                        ((jik) jioVarE2).k(cfVar.getText(R.string.remove_smart_download_container_message));
                        jioVarE2.l(cfVar.getText(R.string.undo), new gdp(hmnVar, str2, 6));
                        jinVar.d(jioVarE2.b());
                        ((AtomicBoolean) obj8).set(true);
                    }
                }
                break;
            case 4:
                anxf anxfVar2 = (anxf) obj;
                String str3 = anxfVar2.c;
                hmn hmnVar2 = ((hmk) this.a).b.j;
                hmnVar2.a(str3);
                String str4 = anxfVar2.d;
                if (!TextUtils.isEmpty(str4)) {
                    Object obj9 = this.b;
                    jin jinVar2 = hmnVar2.e;
                    cf cfVar2 = hmnVar2.a;
                    jio jioVarE3 = jin.e();
                    ((jik) jioVarE3).k(cfVar2.getText(R.string.remove_smart_download_container_message));
                    jioVarE3.l(cfVar2.getText(R.string.undo), new gdp(hmnVar2, str4, 6));
                    jinVar2.d(jioVarE3.b());
                    ((AtomicBoolean) obj9).set(true);
                }
                break;
            case 5:
                annv annvVar = (annv) ((weh) obj);
                List listH = annvVar.h();
                String str5 = (String) this.b;
                boolean zContains = listH.contains(kro.aH(str5));
                Object obj10 = this.a;
                if (zContains) {
                    ((hmt) obj10).a(str5, "PPSV", listH.size() == 1);
                } else if (!annvVar.k().contains(kro.aH(str5))) {
                    List listF = annvVar.f();
                    if (listF.contains(kro.aH(str5))) {
                        ((hmt) obj10).a(str5, "PPSE", listF.size() == 1);
                    }
                } else {
                    ((hmt) obj10).a(str5, "PPSDST", false);
                }
                break;
            case 6:
                anwt anwtVar = (anwt) obj;
                aihf aihfVarCreateBuilder = apox.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                apox apoxVar = (apox) aihfVarCreateBuilder.instance;
                anwtVar.getClass();
                apoxVar.aq = anwtVar;
                apoxVar.c |= 536870912;
                ((aihf) this.b).ck(aihfVarCreateBuilder);
                ((hnl) this.a).f(122508);
                break;
            case 7:
                anwt anwtVar2 = (anwt) obj;
                aihf aihfVarCreateBuilder2 = apox.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                apox apoxVar2 = (apox) aihfVarCreateBuilder2.instance;
                anwtVar2.getClass();
                apoxVar2.aq = anwtVar2;
                apoxVar2.c |= 536870912;
                ((aihf) this.b).ck(aihfVarCreateBuilder2);
                ((hnl) this.a).f(122509);
                break;
            case 8:
                anwt anwtVar3 = (anwt) obj;
                aihf aihfVarCreateBuilder3 = apox.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                apox apoxVar3 = (apox) aihfVarCreateBuilder3.instance;
                anwtVar3.getClass();
                apoxVar3.aq = anwtVar3;
                apoxVar3.c |= 536870912;
                ((aihf) this.b).ck(aihfVarCreateBuilder3);
                ((hnl) this.a).f(122510);
                break;
            case 9:
                anwt anwtVar4 = (anwt) obj;
                aihf aihfVarCreateBuilder4 = apox.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                apox apoxVar4 = (apox) aihfVarCreateBuilder4.instance;
                anwtVar4.getClass();
                apoxVar4.aq = anwtVar4;
                apoxVar4.c |= 536870912;
                ((aihf) this.b).ck(aihfVarCreateBuilder4);
                ((hnl) this.a).f(202020);
                break;
            case 10:
                annv annvVar2 = (annv) ((weh) obj);
                Stream.CC.concat(Collection.EL.stream(annvVar2.j()), Collection.EL.stream(annvVar2.i())).forEach(new hfo(this.a, this.b, 7, bArr));
                break;
            case 11:
                Object obj11 = this.a;
                weo weoVar = (weo) this.b;
                weh wehVar2 = weoVar.c;
                wer werVar = (wer) obj;
                if (wehVar2 != null) {
                    ((hqg) obj11).f(werVar, wehVar2);
                } else {
                    weh wehVar3 = weoVar.b;
                    if (wehVar3 != null) {
                        ((hqg) obj11).n(werVar, wehVar3.b());
                    }
                }
                hqg.o(werVar);
                break;
            case 12:
                String strB = ((aahz) this.b).a.b();
                Object obj12 = this.a;
                Optional optionalD = ((hqg) obj12).d(strB);
                gtr gtrVar2 = new gtr(obj12, (wer) obj, 19);
                if (true == optionalD.isPresent()) {
                    Object obj13 = optionalD.get();
                    Object obj14 = gtrVar2.a;
                    ?? r0 = gtrVar2.b;
                    ((hqg) obj14).i(r0, (aamt) obj13);
                    hqg.o(r0);
                }
                break;
            case 13:
                ?? r1 = this.b;
                ((hqg) this.a).i(r1, (aamt) obj);
                hqg.o(r1);
                break;
            case 14:
                Object obj15 = this.a;
                hqg hqgVar = (hqg) obj15;
                aamj aamjVar = (aamj) obj;
                boolean zL = ((vxz) hqgVar.h.io()).l(60, 45385690L, false);
                ?? r11 = this.b;
                if (!zL) {
                    hqgVar.h(r11);
                    hqgVar.g(r11, aamjVar);
                    hqg.o(r11);
                } else {
                    ahno.at(hqgVar.a(r11), new hqd(obj15, (Object) r11, aamjVar, 1), hqgVar.i);
                }
                break;
            case 15:
                ?? r2 = this.b;
                ((hqg) this.a).g(r2, (aamj) obj);
                hqg.o(r2);
                break;
            case 16:
                Object obj16 = this.a;
                Optional optionalC = ((hqg) obj16).c(((aahj) this.b).a);
                gtr gtrVar3 = new gtr(obj16, (wer) obj, 14);
                if (true == optionalC.isPresent()) {
                    Object obj17 = optionalC.get();
                    Object obj18 = gtrVar3.a;
                    ?? r3 = gtrVar3.b;
                    aamj aamjVar2 = (aamj) obj17;
                    hqg hqgVar2 = (hqg) obj18;
                    if (!((vxz) hqgVar2.h.io()).l(60, 45385690L, false)) {
                        hqgVar2.h(r3);
                        hqgVar2.g(r3, aamjVar2);
                        hqg.o(r3);
                    } else {
                        ahno.at(hqgVar2.a(r3), new hqd(obj18, (Object) r3, aamjVar2, 1), hqgVar2.i);
                    }
                }
                break;
            case 17:
                ?? r4 = this.b;
                ((hqg) this.a).i(r4, (aamt) obj);
                hqg.o(r4);
                break;
            case 18:
                ((hqg) this.a).f(this.b, (weh) obj);
                break;
            case 19:
                ?? r5 = this.b;
                ((hqg) this.a).i(r5, (aamt) obj);
                hqg.o(r5);
                break;
            default:
                String strB2 = ((aaif) this.b).a.b();
                Object obj19 = this.a;
                Optional optionalD2 = ((hqg) obj19).d(strB2);
                gtr gtrVar4 = new gtr(obj19, (wer) obj, 17);
                if (true == optionalD2.isPresent()) {
                    Object obj20 = optionalD2.get();
                    Object obj21 = gtrVar4.a;
                    ?? r6 = gtrVar4.b;
                    ((hqg) obj21).i(r6, (aamt) obj20);
                    hqg.o(r6);
                    break;
                }
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ gtr(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
