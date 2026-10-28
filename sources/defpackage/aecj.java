package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.blocks.Container;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aecj implements aecf {
    public final View b;
    public final avmb c;
    public final String d;
    private final Context e;
    private final awkv g;
    private final avlr h;
    private final Optional i;
    private final Executor j;
    private apkv m;
    private akzn n;
    private afyr o;
    private final ci q;
    private final awkv f = awku.aC(Pair.create(-1, -1)).aI();
    private int p = 1;
    private agke k = agpi.a;
    private int l = 1;

    public aecj(Context context, avmb avmbVar, aunn aunnVar, Executor executor, vwt vwtVar, View view, amjx amjxVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, String str) {
        afyr afyrVar;
        int i = 1;
        this.b = view;
        this.c = avmbVar;
        this.d = str;
        this.j = executor;
        byte[] bArr = null;
        this.q = (ci) optional.orElse(null);
        this.i = optional2;
        this.e = context;
        awkv awkvVarAI = awku.aC(new aeca(1, aecc.a().a(), Optional.empty(), 0)).aI();
        this.g = awkvVarAI;
        this.h = awkvVarAI.ag();
        if (aunnVar.io() != null && (optional4.isPresent() || optional5.isPresent())) {
            Container container = (Container) aunnVar.io();
            Optional optionalOf = (TextUtils.isEmpty(str) || !str.equals("responsive_signal_block_without_key")) ? Optional.of(str) : Optional.empty();
            mav mavVar = optional4.isPresent() ? (mav) optional4.get() : (mav) ((max) optional5.get()).io();
            byte[] bArrE = mavVar.e(745696016, optionalOf);
            if (bArrE.length > 0) {
                aihf aihfVarCreateBuilder = asci.a.createBuilder();
                aigj aigjVarV = aigj.v(bArrE);
                aihfVarCreateBuilder.copyOnWrite();
                asci asciVar = (asci) aihfVarCreateBuilder.instance;
                asciVar.c = aigjVarV.B();
                asciVar.b |= 1;
                afyrVar = (afyr) container.c(new afyq(0), (asci) aihfVarCreateBuilder.build());
            } else {
                afyrVar = (afyr) container.a(new afyq(0));
                if (optional4.isPresent()) {
                    if (!TextUtils.isEmpty(str)) {
                        if (str.equals("responsive_signal_block_without_key")) {
                            mavVar.b(afyrVar);
                        } else {
                            mavVar.c(afyrVar, str);
                        }
                    }
                } else if (optional5.isPresent() && !TextUtils.isEmpty(str)) {
                    max maxVar = (max) optional5.get();
                    if (str.equals("responsive_signal_block_without_key")) {
                        maxVar.c(new adsk(afyrVar, 3));
                    } else {
                        maxVar.c(new aalb(afyrVar, str, 7, bArr));
                    }
                }
            }
            this.o = afyrVar;
        }
        optional3.isPresent();
        optional3.ifPresentOrElse(new adsk(this, 2), new aead(this, amjxVar, 4));
        vwtVar.D(new aegt(this, i));
    }

    private final float i(boolean z, amzi amziVar, int i) {
        if (!z) {
            return i;
        }
        Context context = this.e;
        amziVar.getClass();
        Integer numU = aecm.u(context, amziVar);
        Float fValueOf = numU != null ? Float.valueOf(numU.intValue() / context.getResources().getDisplayMetrics().density) : null;
        if (fValueOf == null) {
            return 0.0f;
        }
        return fValueOf.floatValue();
    }

    private final int j(boolean z, amzi amziVar, int i) {
        if (z) {
            Integer numU = aecm.u(this.e, amziVar);
            if (numU != null) {
                return numU.intValue();
            }
        } else {
            DisplayMetrics displayMetricsE = e();
            if (displayMetricsE != null) {
                return twm.c(displayMetricsE, i);
            }
        }
        return 0;
    }

    private final aeci k(int i, int i2) {
        int i3 = 0;
        while (true) {
            agke agkeVar = this.k;
            if (i3 >= ((agpi) agkeVar).d) {
                return new aeci(true, 2, 2, 0, Alert.DURATION_SHOW_INDEFINITELY, 0, 0, 0, 0, 1, 1, amjy.a, aecc.a().a());
            }
            if (i <= ((aeci) agkeVar.get(i3)).b && i2 <= ((aeci) this.k.get(i3)).c) {
                return (aeci) this.k.get(i3);
            }
            i3++;
        }
    }

    @Override // defpackage.aecf
    public final int a() {
        return this.l;
    }

    @Override // defpackage.aecf
    public final Optional b() {
        return Optional.of(this.h);
    }

    @Override // defpackage.aecf
    public final void c() {
        this.g.kn();
        this.f.kn();
    }

    @Override // defpackage.aecf
    public final boolean d(Object obj) {
        ci ciVar = this.q;
        if (ciVar == null) {
            return false;
        }
        return ciVar.aa(obj);
    }

    public final DisplayMetrics e() {
        return this.e.getResources().getDisplayMetrics();
    }

    final akdw f(int i, int i2) {
        aeci aeciVarK = k(i, i2);
        int i3 = aeciVarK.k;
        int i4 = aeciVarK.l;
        aihf aihfVarCreateBuilder = akdw.a.createBuilder();
        int i5 = this.p;
        aihfVarCreateBuilder.copyOnWrite();
        akdw akdwVar = (akdw) aihfVarCreateBuilder.instance;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        akdwVar.c = i6;
        akdwVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        akdw akdwVar2 = (akdw) aihfVarCreateBuilder.instance;
        akdwVar2.d = i3 - 1;
        akdwVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        akdw akdwVar3 = (akdw) aihfVarCreateBuilder.instance;
        akdwVar3.e = i4 - 1;
        akdwVar3.b |= 4;
        return (akdw) aihfVarCreateBuilder.build();
    }

    public final void g(int i, int i2) {
        aecj aecjVar;
        int i3;
        DisplayMetrics displayMetricsE = e();
        aeci aeciVarK = k(i, i2);
        int iMin = 1;
        if (i > 0 && aeciVarK.l != 2) {
            int i4 = aeciVarK.d;
            iMin = i4 > 0 ? i4 : 1;
            if (aeciVarK.a) {
                int i5 = i / iMin;
                int i6 = aeciVarK.e;
                if (i6 > 0) {
                    i5 *= i6;
                }
                int i7 = aeciVarK.f;
                if (i7 > 0) {
                    i5 += i7;
                }
                iMin = Math.min(aeciVarK.h, Math.max(aeciVarK.g, i5));
            } else {
                iMin = aeciVarK.g;
            }
        }
        int i8 = iMin;
        this.l = i8;
        if (!aeciVarK.a || this.o == null || TextUtils.isEmpty(this.d)) {
            aecjVar = this;
            i3 = i;
        } else {
            aecjVar = this;
            i3 = i;
            ahno.ao(new aecg(aecjVar, this.o, i3, i2, aeciVarK, 0), aecjVar.j);
        }
        aecjVar.g.kk(new aeca(i8, aeciVarK.j, aecjVar.i, twm.c(displayMetricsE, 0)));
        aecjVar.f.kk(Pair.create(Integer.valueOf(i3), Integer.valueOf(i3 / i8)));
    }

    public final void h(amjx amjxVar) {
        int iBc;
        aihl aihlVar = akzn.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        amjxVar.c(aihlVarCheckIsLite);
        if (amjxVar.j.n(aihlVarCheckIsLite.d)) {
            this.m = null;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            amjxVar.c(aihlVarCheckIsLite2);
            Object objK = amjxVar.j.k(aihlVarCheckIsLite2.d);
            this.n = (akzn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        } else {
            aihl aihlVar2 = apkv.b;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
            amjxVar.c(aihlVarCheckIsLite3);
            if (amjxVar.j.n(aihlVarCheckIsLite3.d)) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                amjxVar.c(aihlVarCheckIsLite4);
                Object objK2 = amjxVar.j.k(aihlVarCheckIsLite4.d);
                this.m = (apkv) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                this.n = null;
            } else {
                this.m = null;
                this.n = null;
            }
        }
        apkv apkvVar = this.m;
        boolean z = true;
        if (apkvVar == null || (iBc = a.bc(apkvVar.c)) == 0) {
            iBc = 1;
        }
        this.p = iBc;
        agjz agjzVar = new agjz(4);
        DisplayMetrics displayMetricsE = e();
        if (displayMetricsE != null) {
            apkv apkvVar2 = this.m;
            int i = 3;
            int i2 = 2;
            int i3 = 9;
            int i4 = 7;
            int i5 = 8;
            if (apkvVar2 != null) {
                aiie aiieVar = apkvVar2.d;
                int i6 = 0;
                while (i6 < aiieVar.size()) {
                    apkw apkwVar = (apkw) aiieVar.get(i6);
                    int iC = twm.c(displayMetricsE, apkwVar.e);
                    int i7 = apkwVar.f;
                    int iC2 = i7 > 0 ? twm.c(displayMetricsE, i7) : Alert.DURATION_SHOW_INDEFINITELY;
                    int iC3 = twm.c(displayMetricsE, apkwVar.h);
                    amjy amjyVar = apkwVar.g;
                    if (amjyVar == null) {
                        amjyVar = amjy.a;
                    }
                    int i8 = amjyVar.d;
                    int iJ = j(i8 == i5 ? z : false, i8 == i5 ? (amzi) amjyVar.e : amzi.a, amjyVar.d == i2 ? ((Integer) amjyVar.e).intValue() : 0);
                    int i9 = amjyVar.d;
                    float fI = i(i9 == i5 ? z : false, i9 == i5 ? (amzi) amjyVar.e : amzi.a, amjyVar.d == i2 ? ((Integer) amjyVar.e).intValue() : 0);
                    int i10 = amjyVar.b;
                    int iJ2 = j(i10 == i4 ? z : false, i10 == i4 ? (amzi) amjyVar.c : amzi.a, amjyVar.b == z ? ((Integer) amjyVar.c).intValue() : 0);
                    int i11 = amjyVar.b;
                    float fI2 = i(i11 == i4 ? z : false, i11 == i4 ? (amzi) amjyVar.c : amzi.a, amjyVar.b == z ? ((Integer) amjyVar.c).intValue() : 0);
                    int i12 = amjyVar.f;
                    int iJ3 = j(i12 == i3 ? z : false, i12 == i3 ? (amzi) amjyVar.g : amzi.a, amjyVar.f == i ? ((Integer) amjyVar.g).intValue() : 0);
                    int i13 = amjyVar.f;
                    float fI3 = i(i13 == i3, i13 == i3 ? (amzi) amjyVar.g : amzi.a, amjyVar.f == i ? ((Integer) amjyVar.g).intValue() : 0);
                    int i14 = amjyVar.h;
                    aiie aiieVar2 = aiieVar;
                    int iJ4 = j(i14 == 10, i14 == 10 ? (amzi) amjyVar.i : amzi.a, amjyVar.h == 4 ? ((Integer) amjyVar.i).intValue() : 0);
                    int i15 = amjyVar.h;
                    int i16 = i6;
                    float fI4 = i(i15 == 10, i15 == 10 ? (amzi) amjyVar.i : amzi.a, amjyVar.h == 4 ? ((Integer) amjyVar.i).intValue() : 0);
                    int i17 = amjyVar.j;
                    DisplayMetrics displayMetrics = displayMetricsE;
                    int iJ5 = j(i17 == 11, i17 == 11 ? (amzi) amjyVar.k : amzi.a, amjyVar.j == 5 ? ((Integer) amjyVar.k).intValue() : 0);
                    int i18 = amjyVar.j;
                    agjz agjzVar2 = agjzVar;
                    float fI5 = i(i18 == 11, i18 == 11 ? (amzi) amjyVar.k : amzi.a, amjyVar.j == 5 ? ((Integer) amjyVar.k).intValue() : 0);
                    int i19 = amjyVar.l;
                    int iJ6 = j(i19 == 12, i19 == 12 ? (amzi) amjyVar.m : amzi.a, amjyVar.l == 6 ? ((Integer) amjyVar.m).intValue() : 0);
                    int i20 = amjyVar.l;
                    float fI6 = i(i20 == 12, i20 == 12 ? (amzi) amjyVar.m : amzi.a, amjyVar.l == 6 ? ((Integer) amjyVar.m).intValue() : 0);
                    boolean z2 = (apkwVar.b & SemanticState.Modal) != 0;
                    amzi amziVar = apkwVar.m;
                    if (amziVar == null) {
                        amziVar = amzi.a;
                    }
                    int i21 = (int) i(z2, amziVar, 0);
                    int iBc2 = a.bc(apkwVar.c);
                    int i22 = iBc2 == 0 ? 1 : iBc2;
                    int iBc3 = a.bc(apkwVar.d);
                    int i23 = iBc3 == 0 ? 1 : iBc3;
                    int i24 = apkwVar.i;
                    int i25 = apkwVar.j;
                    int i26 = apkwVar.k;
                    int i27 = apkwVar.l;
                    amjy amjyVar2 = apkwVar.g;
                    if (amjyVar2 == null) {
                        amjyVar2 = amjy.a;
                    }
                    amjy amjyVar3 = amjyVar2;
                    aecb aecbVarA = aecc.a();
                    aecbVarA.k(iJ3);
                    aecbVarA.e(iJ4);
                    aecbVarA.i(iJ5);
                    aecbVarA.g(iJ6);
                    aecbVarA.m(iJ);
                    aecbVarA.c(iJ2);
                    aecbVarA.j(fI3);
                    aecbVarA.d(fI4);
                    aecbVarA.h(fI5);
                    aecbVarA.f(fI6);
                    aecbVarA.l(fI);
                    aecbVarA.b(fI2);
                    agjzVar = agjzVar2;
                    agjzVar.h(new aeci(true, i22, i23, iC, iC2, i21, iC3, i24, i25, i26, i27, amjyVar3, aecbVarA.a()));
                    i6 = i16 + 1;
                    aiieVar = aiieVar2;
                    displayMetricsE = displayMetrics;
                    z = true;
                    i = 3;
                    i2 = 2;
                    i3 = 9;
                    i4 = 7;
                    i5 = 8;
                }
            } else {
                DisplayMetrics displayMetrics2 = displayMetricsE;
                akzn akznVar = this.n;
                if (akznVar != null) {
                    aiie aiieVar3 = akznVar.c;
                    int i28 = 0;
                    while (i28 < aiieVar3.size()) {
                        akzm akzmVar = (akzm) aiieVar3.get(i28);
                        DisplayMetrics displayMetrics3 = displayMetrics2;
                        int iC4 = twm.c(displayMetrics3, akzmVar.b);
                        int i29 = akzmVar.c;
                        amjy amjyVar4 = akzmVar.d;
                        if (amjyVar4 == null) {
                            amjyVar4 = amjy.a;
                        }
                        int i30 = amjyVar4.d;
                        int iJ7 = j(i30 == 8, i30 == 8 ? (amzi) amjyVar4.e : amzi.a, amjyVar4.d == 2 ? ((Integer) amjyVar4.e).intValue() : 0);
                        int i31 = amjyVar4.d;
                        float fI7 = i(i31 == 8, i31 == 8 ? (amzi) amjyVar4.e : amzi.a, amjyVar4.d == 2 ? ((Integer) amjyVar4.e).intValue() : 0);
                        int i32 = amjyVar4.b;
                        int iJ8 = j(i32 == 7, i32 == 7 ? (amzi) amjyVar4.c : amzi.a, amjyVar4.b == 1 ? ((Integer) amjyVar4.c).intValue() : 0);
                        int i33 = amjyVar4.b;
                        float fI8 = i(i33 == 7, i33 == 7 ? (amzi) amjyVar4.c : amzi.a, amjyVar4.b == 1 ? ((Integer) amjyVar4.c).intValue() : 0);
                        int i34 = amjyVar4.f;
                        int iJ9 = j(i34 == 9, i34 == 9 ? (amzi) amjyVar4.g : amzi.a, amjyVar4.f == 3 ? ((Integer) amjyVar4.g).intValue() : 0);
                        int i35 = amjyVar4.f;
                        aiie aiieVar4 = aiieVar3;
                        float fI9 = i(i35 == 9, i35 == 9 ? (amzi) amjyVar4.g : amzi.a, amjyVar4.f == 3 ? ((Integer) amjyVar4.g).intValue() : 0);
                        int i36 = amjyVar4.h;
                        int i37 = i28;
                        int iJ10 = j(i36 == 10, i36 == 10 ? (amzi) amjyVar4.i : amzi.a, amjyVar4.h == 4 ? ((Integer) amjyVar4.i).intValue() : 0);
                        int i38 = amjyVar4.h;
                        float fI10 = i(i38 == 10, i38 == 10 ? (amzi) amjyVar4.i : amzi.a, amjyVar4.h == 4 ? ((Integer) amjyVar4.i).intValue() : 0);
                        int i39 = amjyVar4.j;
                        displayMetrics2 = displayMetrics3;
                        int iJ11 = j(i39 == 11, i39 == 11 ? (amzi) amjyVar4.k : amzi.a, amjyVar4.j == 5 ? ((Integer) amjyVar4.k).intValue() : 0);
                        int i40 = amjyVar4.j;
                        agjz agjzVar3 = agjzVar;
                        float fI11 = i(i40 == 11, i40 == 11 ? (amzi) amjyVar4.k : amzi.a, amjyVar4.j == 5 ? ((Integer) amjyVar4.k).intValue() : 0);
                        int i41 = amjyVar4.l;
                        int iJ12 = j(i41 == 12, i41 == 12 ? (amzi) amjyVar4.m : amzi.a, amjyVar4.l == 6 ? ((Integer) amjyVar4.m).intValue() : 0);
                        int i42 = amjyVar4.l;
                        float fI12 = i(i42 == 12, i42 == 12 ? (amzi) amjyVar4.m : amzi.a, amjyVar4.l == 6 ? ((Integer) amjyVar4.m).intValue() : 0);
                        amjy amjyVar5 = akzmVar.d;
                        if (amjyVar5 == null) {
                            amjyVar5 = amjy.a;
                        }
                        amjy amjyVar6 = amjyVar5;
                        aecb aecbVarA2 = aecc.a();
                        aecbVarA2.k(iJ9);
                        aecbVarA2.e(iJ10);
                        aecbVarA2.i(iJ11);
                        aecbVarA2.g(iJ12);
                        aecbVarA2.m(iJ7);
                        aecbVarA2.c(iJ8);
                        aecbVarA2.j(fI9);
                        aecbVarA2.d(fI10);
                        aecbVarA2.h(fI11);
                        aecbVarA2.f(fI12);
                        aecbVarA2.l(fI7);
                        aecbVarA2.b(fI8);
                        agjzVar = agjzVar3;
                        agjzVar.h(new aeci(false, 1, 1, iC4, Alert.DURATION_SHOW_INDEFINITELY, 0, 0, 0, 0, i29, i29, amjyVar6, aecbVarA2.a()));
                        i28 = i37 + 1;
                        aiieVar3 = aiieVar4;
                    }
                }
            }
        }
        this.k = agjzVar.g();
        View view = this.b;
        g(view.getWidth(), view.getHeight());
    }
}
