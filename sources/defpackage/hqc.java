package defpackage;

import android.R;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.settings.fragment.PrivacyPrefsFragmentCompat;
import com.google.android.apps.youtube.music.ui.preference.SwitchCompatPreference;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hqc implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hqc(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v28, types: [adlz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [adlz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r2v13, types: [ijm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [ijm, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        int i = 16;
        int i2 = 13;
        int i3 = 2;
        switch (this.$cid) {
            case 0:
                String strA = ((aaho) this.b).a.a();
                Object obj2 = this.a;
                Optional optionalC = ((hqg) obj2).c(strA);
                hqc hqcVar = new hqc(obj2, (wer) obj, i3);
                if (true == optionalC.isPresent()) {
                    Object obj3 = optionalC.get();
                    Object obj4 = hqcVar.a;
                    ?? r0 = hqcVar.b;
                    ((hqg) obj4).g(r0, (aamj) obj3);
                    hqg.o(r0);
                }
                break;
            case 1:
                Object obj5 = this.a;
                Optional optionalC2 = ((hqg) obj5).c(((aahp) this.b).a);
                gtr gtrVar = new gtr(obj5, (wer) obj, 15);
                if (true == optionalC2.isPresent()) {
                    Object obj6 = optionalC2.get();
                    Object obj7 = gtrVar.a;
                    ?? r1 = gtrVar.b;
                    ((hqg) obj7).g(r1, (aamj) obj6);
                    hqg.o(r1);
                }
                break;
            case 2:
                ?? r2 = this.b;
                ((hqg) this.a).g(r2, (aamj) obj);
                hqg.o(r2);
                break;
            case 3:
                String strB = ((aaht) this.b).a.b();
                Object obj8 = this.a;
                Optional optionalD = ((hqg) obj8).d(strB);
                gtr gtrVar2 = new gtr(obj8, (wer) obj, i2);
                if (true == optionalD.isPresent()) {
                    Object obj9 = optionalD.get();
                    Object obj10 = gtrVar2.a;
                    ?? r3 = gtrVar2.b;
                    ((hqg) obj10).i(r3, (aamt) obj9);
                    hqg.o(r3);
                }
                break;
            case 4:
                Object obj11 = this.a;
                hqg hqgVar = (hqg) obj11;
                wer werVar = (wer) obj;
                boolean zL = ((vxz) hqgVar.h.io()).l(60, 45385690L, false);
                Object obj12 = this.b;
                if (!zL) {
                    hqgVar.h(werVar);
                    hqgVar.m(werVar, ((aahm) obj12).a);
                    hqg.o(werVar);
                } else {
                    ahno.at(hqgVar.a(werVar), new hqd(obj11, werVar, obj12, 0), hqgVar.i);
                }
                break;
            case 5:
                wer werVar2 = (wer) obj;
                ((hqg) this.a).i(werVar2, (aamt) this.b);
                hqg.o(werVar2);
                break;
            case 6:
                hqg hqgVar2 = (hqg) this.a;
                aauk aaukVar = hqgVar2.f;
                wer werVar3 = (wer) obj;
                String str = ((aaia) this.b).a;
                if (aaukVar.m()) {
                    hqgVar2.n(werVar3, kro.aI(str), kro.aH(str));
                } else {
                    hqgVar2.n(werVar3, kro.aw(str), kro.av(str), kro.aJ(str), kro.ax(str), kro.aI(str), kro.aH(str));
                }
                hqg.o(werVar3);
                break;
            case 7:
                ?? r4 = this.b;
                ((hqg) this.a).g(r4, (aamj) obj);
                hqg.o(r4);
                break;
            case 8:
                String strA2 = ((aahr) this.b).a.a();
                Object obj13 = this.a;
                Optional optionalC3 = ((hqg) obj13).c(strA2);
                hqc hqcVar2 = new hqc(obj13, (wer) obj, 7);
                if (true == optionalC3.isPresent()) {
                    Object obj14 = optionalC3.get();
                    Object obj15 = hqcVar2.a;
                    ?? r5 = hqcVar2.b;
                    ((hqg) obj15).g(r5, (aamj) obj14);
                    hqg.o(r5);
                }
                break;
            case 9:
                jav javVar = (jav) obj;
                javVar.L(this.b);
                Object obj16 = javVar.m;
                View view = javVar.l;
                ?? r6 = this.a;
                ijl ijlVar = (ijl) r6;
                admo admoVar = (admo) obj16;
                ijlVar.aK = new ijh(r6, admoVar, (RecyclerView) view, ijlVar.aB, ijlVar.az);
                ((nh) obj16).x(ijlVar.aK);
                break;
            case 10:
                SwitchCompatPreference switchCompatPreference = (SwitchCompatPreference) obj;
                Object obj17 = this.a;
                int i4 = 8;
                gpa gpaVar = new gpa(obj17, i4);
                afxd afxdVarF = afxd.f((ListenableFuture) gpaVar.get());
                String str2 = ((zot) this.b).b;
                ipr iprVar = (ipr) obj17;
                afxd afxdVarH = afxdVarF.h(new hqj(str2, i), iprVar.e);
                igt igtVar = new igt(11);
                PrivacyPrefsFragmentCompat privacyPrefsFragmentCompat = iprVar.a;
                taf.k(privacyPrefsFragmentCompat, afxdVarH, igtVar, new hcq(switchCompatPreference, privacyPrefsFragmentCompat, i4));
                switchCompatPreference.n = new iqq(privacyPrefsFragmentCompat, gpaVar, str2);
                break;
            case 11:
                jav javVar2 = (jav) obj;
                javVar2.L(this.b);
                Object obj18 = javVar2.m;
                View view2 = javVar2.l;
                ?? r7 = this.a;
                admo admoVar2 = (admo) obj18;
                ((nh) obj18).x(new ijh(r7, admoVar2, (RecyclerView) view2, ((ivj) r7).ai, null));
                break;
            case 12:
                ((GradientDrawable) this.a).setCornerRadius(((View) this.b).getResources().getDimension(((Integer) obj).intValue()));
                break;
            case 13:
                ajta ajtaVar = (ajta) obj;
                if (!ajtaVar.c.isEmpty()) {
                    jon jonVar = (jon) this.b;
                    if (jonVar.n == null) {
                        jonVar.n = (jbw) adul.e(jonVar.b.a, ajtaVar, null);
                    }
                    Object obj19 = this.a;
                    adly adlyVar = new adly();
                    adlyVar.a(jonVar.c);
                    adlyVar.f("backgroundColor", Integer.valueOf(jonVar.k.getContext().getColor(R.color.transparent)));
                    adlyVar.f("chipCloudController", obj19);
                    jbw jbwVar = jonVar.n;
                    if (jbwVar != null) {
                        jbwVar.hU(adlyVar, ajtaVar);
                        ViewGroup viewGroup = jonVar.j;
                        if (viewGroup.indexOfChild(jonVar.n.a()) < 0) {
                            viewGroup.addView(jonVar.n.a());
                        }
                    }
                    jonVar.i.setVisibility(0);
                }
                break;
            case 14:
                ((qxr) this.a).c.put(this.b, (qxq) obj);
                break;
            case 15:
                aihf aihfVarU = ((raw) this.a).u((qwf) obj);
                aihf aihfVar = (aihf) this.b;
                aihfVar.copyOnWrite();
                atrv atrvVar = (atrv) aihfVar.instance;
                atrw atrwVar = (atrw) aihfVarU.build();
                atrv atrvVar2 = atrv.a;
                atrwVar.getClass();
                atrvVar.d = atrwVar;
                atrvVar.b |= 2;
                break;
            case 16:
                aihf aihfVarU2 = ((raw) this.a).u((qwf) obj);
                aihf aihfVar2 = (aihf) this.b;
                aihfVar2.copyOnWrite();
                atrv atrvVar3 = (atrv) aihfVar2.instance;
                atrw atrwVar2 = (atrw) aihfVarU2.build();
                atrv atrvVar4 = atrv.a;
                atrwVar2.getClass();
                atrvVar3.g = atrwVar2;
                atrvVar3.b |= 16;
                break;
            case 17:
                rbs rbsVar = (rbs) obj;
                aihf aihfVarCreateBuilder = apsh.a.createBuilder();
                aigu aiguVarAu = ahng.au((Duration) this.b);
                aihfVarCreateBuilder.copyOnWrite();
                apsh apshVar = (apsh) aihfVarCreateBuilder.instance;
                aiguVarAu.getClass();
                apshVar.e = aiguVarAu;
                apshVar.b |= 4;
                rbo rboVar = (rbo) this.a;
                aigu aiguVarAu2 = ahng.au(rboVar.c);
                aihfVarCreateBuilder.copyOnWrite();
                apsh apshVar2 = (apsh) aihfVarCreateBuilder.instance;
                aiguVarAu2.getClass();
                apshVar2.c = aiguVarAu2;
                apshVar2.b |= 1;
                aigu aiguVarAu3 = ahng.au(rboVar.d);
                aihfVarCreateBuilder.copyOnWrite();
                apsh apshVar3 = (apsh) aihfVarCreateBuilder.instance;
                aiguVarAu3.getClass();
                apshVar3.d = aiguVarAu3;
                apshVar3.b |= 2;
                aihfVarCreateBuilder.copyOnWrite();
                apsh apshVar4 = (apsh) aihfVarCreateBuilder.instance;
                aiie aiieVar = apshVar4.f;
                if (!aiieVar.c()) {
                    apshVar4.f = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(rboVar.b, apshVar4.f);
                rbsVar.j((apsh) aihfVarCreateBuilder.build());
                break;
            case 18:
                ((rbs) obj).b(rbk.a((quc) this.a, ((rdr) this.b).l));
                break;
            case 19:
                ?? r8 = this.a;
                rbm rbmVar = rgw.j;
                Object obj20 = this.b;
                Stream stream = Collection.EL.stream(r8);
                obj20.getClass();
                ((rbr) obj).c(nqz.h((agke) stream.filter(new jmy(obj20, i2)).collect(aghu.a)));
                break;
            default:
                Object obj21 = this.b;
                rbr rbrVar = (rbr) obj;
                Optional optionalOfNullable = ((rhg) this.a).h;
                hlx hlxVar = new hlx(obj21, 20);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((Optional) hlxVar.a).get());
                }
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(agke.q((qvc) optionalOfNullable.get()));
                }
                rbrVar.c(nqz.h((agke) optionalOfNullable.orElse(agpi.a)));
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

    public /* synthetic */ hqc(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
