package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vmb extends fkx {

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    aedv b;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    int c;

    @fmt(a = 0)
    @fmu(a = fmv.a)
    float d;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    xgn e;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    apls f;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    String g;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    Long q;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    String r;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    Long s;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean t;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    Typeface u;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    aciz v;

    public vmb() {
        super("RollingNumber");
        this.g = "";
    }

    public static void aE(fhd fhdVar, vmd vmdVar) {
        if (fhdVar.c != null) {
            fhdVar.y(new aero(Integer.MIN_VALUE, new Object[]{vmdVar}));
        }
    }

    protected static void aF(fhd fhdVar, boolean z) {
        if (fhdVar.c != null) {
            fhdVar.y(new aero(-2147483647, new Object[]{Boolean.valueOf(z)}));
        }
    }

    protected static void aG(fhd fhdVar, vmo vmoVar) {
        if (fhdVar.c != null) {
            fhdVar.y(new aero(-2147483646, new Object[]{vmoVar}));
        }
    }

    private static final vma aH(fhd fhdVar) {
        return (vma) fhdVar.i().c;
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        return new vmi(context);
    }

    @Override // defpackage.fgy
    protected final void E(fiz fizVar, fiz fizVar2) {
        ((vlz) fizVar).a = ((vlz) fizVar2).a;
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        vma vmaVarAH = aH(fhdVar);
        vmd vmdVarB = vmd.b(0, 0);
        vmo vmoVarA = vmo.a("0");
        Boolean bool = Boolean.TRUE;
        vmaVarAH.a = vmdVarB;
        bool.booleanValue();
        vmaVarAH.b = true;
        vmaVarAH.c = vmoVarA;
    }

    @Override // defpackage.fgy
    public final void K(fhd fhdVar) {
        vma vmaVarAH = aH(fhdVar);
        vmd vmdVar = vmaVarAH.a;
        boolean z = vmaVarAH.b;
        vmo vmoVar = vmaVarAH.c;
        aF(fhdVar, true);
        aE(fhdVar, vmd.b(1, 1));
        aG(fhdVar, vmo.a("0"));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0215  */
    /* JADX WARN: Code duplicated, block: B:102:0x021f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0224  */
    /* JADX WARN: Code duplicated, block: B:105:0x0231 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0233  */
    /* JADX WARN: Code duplicated, block: B:150:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:170:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0136  */
    /* JADX WARN: Code duplicated, block: B:98:0x0212  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, xgn] */
    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        vmn vmnVarD;
        int i;
        List list;
        vmm vmmVar;
        Optional optionalEmpty;
        vma vmaVarAH = aH(fhdVar);
        vmi vmiVar = (vmi) obj;
        vmd vmdVar = vmaVarAH.a;
        boolean z = vmaVarAH.b;
        vmo vmoVar = vmaVarAH.c;
        String str = this.r;
        Long l = this.s;
        int i2 = this.c;
        Typeface typeface = this.u;
        float f = this.d;
        aciz acizVar = this.v;
        aedv aedvVar = this.b;
        boolean z2 = this.t;
        String str2 = this.g;
        Long l2 = this.q;
        xgn xgnVar = this.e;
        apls aplsVar = this.f;
        boolean z3 = this.a;
        int iIntValue = ((vlz) fizVar).a.intValue();
        if (vmiVar.b) {
            return;
        }
        vmiVar.e = z3;
        vmiVar.f = iIntValue;
        if (z) {
            vmiVar.a = vmo.a("");
            vmiVar.c = 0.0f;
            vmiVar.d = 0.0f;
            vmiVar.setSingleLine(true);
            vmiVar.setMaxLines(1);
            vmiVar.setGravity(0);
        }
        if (aedvVar != null) {
            acizVar.B(aedvVar, vmiVar.getContext(), vmiVar);
            vmnVarD = vmn.d(vmiVar.getPaint(), i2);
        } else {
            vmn vmnVarE = vmn.e(typeface, i2, yno.eT(fhdVar, f));
            vmiVar.setTypeface(typeface);
            vmiVar.setTextSize(f);
            vmnVarD = vmnVarE;
        }
        vmiVar.setTextColor(i2);
        boolean z4 = z2 && !z;
        boolean z5 = z2 && z && str2.length() > 0;
        boolean z6 = z5 || z4;
        vmo vmoVarB = z5 ? vmo.b(str2, l2) : vmoVar;
        vmo vmoVarB2 = vmo.b(str, l);
        Optional optionalEU = yno.eU(vmnVarD, str, vmdVar);
        urh urhVar = new urh(fhdVar, 15);
        if (true == optionalEU.isPresent()) {
            aE((fhd) urhVar.a, (vmd) optionalEU.get());
        }
        vmd vmdVar2 = (vmd) optionalEU.orElse(vmdVar);
        if (z6) {
            String str3 = vmoVarB.a;
            String str4 = vmoVarB2.a;
            if (str3.equals(str4)) {
                vmiVar.c(vmoVarB2, vmdVar2.a, vmnVarD.b(vmoVarB2.a));
                Bitmap bitmapA = vmdVar2.a();
                new Canvas(bitmapA).drawText(str, Math.max(bitmapA.getWidth() - vmnVarD.b(str), 0.0f) / 2.0f, vmnVarD.d, vmnVarD.a);
                vmiVar.a(bitmapA);
            } else {
                if (z5) {
                    vmiVar.c(vmoVarB, vmdVar2.a, vmnVarD.b(str3));
                }
                aepb aepbVar = new aepb(vmiVar, vmdVar2, vmnVarD, xgnVar);
                vmi vmiVar2 = (vmi) aepbVar.b;
                if (!vmiVar2.b && !str3.equals(str4)) {
                    vmiVar2.b = true;
                    aepbVar.d = new AnimatorSet();
                    Optional optional = vmoVarB.b;
                    if (optional.isPresent()) {
                        Optional optional2 = vmoVarB2.b;
                        if (!optional2.isPresent() || ((Long) optional.orElse(0L)).longValue() <= ((Long) optional2.orElse(0L)).longValue()) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                    } else {
                        i = 1;
                    }
                    vmn vmnVar = (vmn) aepbVar.e;
                    List listL = aepb.l(str3, vmnVar);
                    List listL2 = aepb.l(str4, vmnVar);
                    int size = listL.size() - 1;
                    int size2 = listL2.size() - 1;
                    ArrayList arrayList = new ArrayList();
                    while (size >= 0 && size2 >= 0) {
                        vmp vmpVar = (vmp) listL.get(size);
                        vmp vmpVar2 = (vmp) listL2.get(size2);
                        boolean z7 = vmpVar instanceof vmm;
                        if (!z7 || (vmpVar2 instanceof vmm)) {
                            size--;
                            if (z7 || !(vmpVar2 instanceof vmm)) {
                                arrayList.add(0, vmpVar);
                                size2--;
                            }
                        } else {
                            size2--;
                            arrayList.add(0, new vmk("", vmpVar2.a()));
                        }
                    }
                    while (size2 >= 0) {
                        if (((vmp) listL2.get(size2)) instanceof vmm) {
                            arrayList.add(0, vmm.d(0, vmnVar.a(0)));
                        } else {
                            arrayList.add(0, vmr.d("", vmnVar));
                        }
                        size2--;
                    }
                    boolean z8 = listL.size() > arrayList.size();
                    ArrayList arrayList2 = new ArrayList();
                    boolean z9 = z8;
                    int i3 = 0;
                    while (i3 < arrayList.size()) {
                        vmp vmpVar3 = (vmp) arrayList.get(i3);
                        vmp vmpVar4 = (vmp) listL2.get(i3);
                        boolean z10 = (vmpVar3 instanceof vmm) && (vmpVar4 instanceof vmm);
                        boolean z11 = (vmpVar3 instanceof vmr) && (vmpVar4 instanceof vmr);
                        if (z10) {
                            list = listL2;
                            boolean z12 = Objects.equals(vmpVar3.c(), vmpVar4.c()) ? false : true;
                            if (!z9 || z12) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z10) {
                                vmm vmmVar2 = (vmm) vmpVar3;
                                vmmVar = (vmm) vmpVar4;
                                float fA = vmmVar.a();
                                if (z9) {
                                    optionalEmpty = Optional.of(vmmVar);
                                } else {
                                    optionalEmpty = Optional.empty();
                                }
                                arrayList2.add(new vmq(vmmVar2, optionalEmpty, fA));
                            } else if (z11) {
                                vmr vmrVar = (vmr) vmpVar4;
                                arrayList2.add(new vmq((vmr) vmpVar3, Optional.of(vmrVar), vmrVar.a()));
                            }
                            i3++;
                            listL2 = list;
                        } else {
                            list = listL2;
                        }
                        if (z9) {
                            z9 = true;
                        } else {
                            z9 = true;
                        }
                        if (z10) {
                            vmm vmmVar3 = (vmm) vmpVar3;
                            vmmVar = (vmm) vmpVar4;
                            float fA2 = vmmVar.a();
                            if (z9) {
                                optionalEmpty = Optional.of(vmmVar);
                            } else {
                                optionalEmpty = Optional.empty();
                            }
                            arrayList2.add(new vmq(vmmVar3, optionalEmpty, fA2));
                        } else if (z11) {
                            vmr vmrVar2 = (vmr) vmpVar4;
                            arrayList2.add(new vmq((vmr) vmpVar3, Optional.of(vmrVar2), vmrVar2.a()));
                        }
                        i3++;
                        listL2 = list;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size3 = listL.size() - 1;
                    int size4 = arrayList2.size();
                    loop3: while (true) {
                        size4--;
                        while (true) {
                            if (size3 < 0 || size4 < 0) {
                                break loop3;
                            }
                            vmp vmpVar5 = (vmp) listL.get(size3);
                            vmp vmpVar6 = ((vmq) arrayList2.get(size4)).a;
                            if ((vmpVar5 instanceof vmm) && (vmpVar6 instanceof vmm) && vmpVar5.e(vmpVar6)) {
                                arrayList3.add(0, aepb.i((vmm) vmpVar5, (vmm) vmpVar6));
                            } else if ((vmpVar5 instanceof vmr) && (vmpVar6 instanceof vmr) && vmpVar5.e(vmpVar6)) {
                                arrayList3.add(0, aepb.i((vmr) vmpVar5, (vmr) vmpVar6));
                            } else if (size3 >= size4) {
                                arrayList3.add(0, aepb.j(vmpVar5));
                                size3--;
                            } else {
                                arrayList3.add(0, aepb.k(vmpVar6));
                            }
                            size3--;
                        }
                    }
                    int i4 = 0;
                    while (size3 >= 0) {
                        arrayList3.add(0, aepb.j((vmp) listL.get(size3)));
                        size3--;
                    }
                    while (size4 >= 0) {
                        arrayList3.add(i4, aepb.k(((vmq) arrayList2.get(size4)).a));
                        size4--;
                        i4 = 0;
                    }
                    new yvh(arrayList3, i, vmnVar);
                    yvh yvhVar = new yvh(arrayList2, i, vmnVar);
                    vmiVar2.a(((vmd) aepbVar.c).a());
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f);
                    valueAnimatorOfFloat.setDuration(1000L);
                    valueAnimatorOfFloat.setInterpolator(new bnn());
                    valueAnimatorOfFloat.addUpdateListener(new vmg(aepbVar, yvhVar, 0));
                    valueAnimatorOfFloat.addListener(new vmh(aepbVar, yvhVar));
                    ((AnimatorSet) aepbVar.d).playSequentially(valueAnimatorOfFloat);
                    ((AnimatorSet) aepbVar.d).addListener(new vme(aepbVar, vmoVarB2));
                    ((AnimatorSet) aepbVar.d).addListener(new vmf(aepbVar, vmoVarB, vmoVarB2, yvhVar));
                    ((AnimatorSet) aepbVar.d).start();
                    if (aplsVar != null) {
                        int i5 = aplsVar.b;
                        if ((i5 & 1) != 0 && (i5 & 2) != 0) {
                            aihf aihfVarCreateBuilder = amdd.a.createBuilder();
                            ?? r0 = aepbVar.a;
                            amud amudVar = aplsVar.d;
                            if (amudVar == null) {
                                amudVar = amud.b;
                            }
                            xgj xgjVar = new xgj(amudVar);
                            aihf aihfVarCreateBuilder2 = amcw.a.createBuilder();
                            int iAV = a.aV(aplsVar.c);
                            if (iAV == 0) {
                                iAV = 1;
                            }
                            aihfVarCreateBuilder2.copyOnWrite();
                            amcw amcwVar = (amcw) aihfVarCreateBuilder2.instance;
                            amcwVar.c = iAV - 1;
                            amcwVar.b |= 1;
                            amcw amcwVar2 = (amcw) aihfVarCreateBuilder2.build();
                            aihfVarCreateBuilder.copyOnWrite();
                            amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
                            amcwVar2.getClass();
                            amddVar.A = amcwVar2;
                            amddVar.d |= 65536;
                            r0.A(xgjVar, (amdd) aihfVarCreateBuilder.build());
                        }
                    }
                }
            }
        } else {
            vmiVar.c(vmoVarB2, vmdVar2.a, vmnVarD.b(vmoVarB2.a));
            Bitmap bitmapA2 = vmdVar2.a();
            new Canvas(bitmapA2).drawText(str, Math.max(bitmapA2.getWidth() - vmnVarD.b(str), 0.0f) / 2.0f, vmnVarD.d, vmnVarD.a);
            vmiVar.a(bitmapA2);
        }
        aF(fhdVar, false);
        aG(fhdVar, vmoVarB2);
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        vma vmaVar = (vma) fkyVar;
        vma vmaVar2 = (vma) fkyVar2;
        vmaVar2.a = vmaVar.a;
        vmaVar2.b = vmaVar.b;
        vmaVar2.c = vmaVar.c;
    }

    @Override // defpackage.fgy
    public final boolean O() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean P() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean ab() {
        return true;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 3;
    }

    @Override // defpackage.fgy
    public final void ag(fhd fhdVar, fji fjiVar, fiz fizVar) {
        ((vlz) fizVar).a = Integer.valueOf(fjiVar.g());
    }

    @Override // defpackage.fgy
    protected final void ah(fhd fhdVar, fji fjiVar, int i, int i2, fkw fkwVar, fiz fizVar) {
        vmn vmnVarE;
        vma vmaVarAH = aH(fhdVar);
        vmd vmdVar = vmaVarAH.a;
        boolean z = vmaVarAH.b;
        vmo vmoVar = vmaVarAH.c;
        Typeface typeface = this.u;
        float f = this.d;
        aciz acizVar = this.v;
        aedv aedvVar = this.b;
        String str = this.r;
        boolean z2 = this.a;
        if (aedvVar != null) {
            Context context = fhdVar.a;
            YouTubeAppCompatTextView youTubeAppCompatTextView = new YouTubeAppCompatTextView(context);
            acizVar.B(aedvVar, context, youTubeAppCompatTextView);
            vmnVarE = vmn.d(youTubeAppCompatTextView.getPaint(), -16777216);
        } else {
            vmnVarE = vmn.e(typeface, -16777216, yno.eT(fhdVar, f));
        }
        Optional optionalEU = yno.eU(vmnVarE, str, vmdVar);
        vmd vmdVar2 = (vmd) optionalEU.orElse(vmdVar);
        int i3 = vmdVar2.a;
        int i4 = vmdVar2.b;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (!z2 || mode == 0 || size <= 0 || i3 <= size) {
            fkwVar.a = i3;
            fkwVar.b = i4;
        } else {
            fkwVar.a = size;
            float f2 = vmnVarE.c;
            fkwVar.b = (int) Math.ceil(f2 + f2);
        }
        urh urhVar = new urh(fhdVar, 14);
        if (true == optionalEU.isPresent()) {
            aE((fhd) urhVar.a, (vmd) optionalEU.get());
        }
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        aedv aedvVar;
        xgn xgnVar;
        apls aplsVar;
        String str;
        Long l;
        String str2;
        Long l2;
        Typeface typeface;
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            vmb vmbVar = (vmb) fgyVar;
            if (this.a == vmbVar.a && ((aedvVar = this.b) == null ? vmbVar.b == null : aedvVar.equals(vmbVar.b)) && this.c == vmbVar.c && Float.compare(this.d, vmbVar.d) == 0 && ((xgnVar = this.e) == null ? vmbVar.e == null : xgnVar.equals(vmbVar.e)) && ((aplsVar = this.f) == null ? vmbVar.f == null : aplsVar.equals(vmbVar.f)) && ((str = this.g) == null ? vmbVar.g == null : str.equals(vmbVar.g)) && ((l = this.q) == null ? vmbVar.q == null : l.equals(vmbVar.q)) && ((str2 = this.r) == null ? vmbVar.r == null : str2.equals(vmbVar.r)) && ((l2 = this.s) == null ? vmbVar.s == null : l2.equals(vmbVar.s)) && this.t == vmbVar.t && ((typeface = this.u) == null ? vmbVar.u == null : typeface.equals(vmbVar.u))) {
                aciz acizVar = this.v;
                if (acizVar != null) {
                    if (acizVar.equals(vmbVar.v)) {
                        return true;
                    }
                } else if (vmbVar.v == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.fgy
    protected final int h() {
        return 3;
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        return (vmb) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fiz r() {
        return new vlz();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new vma();
    }
}
