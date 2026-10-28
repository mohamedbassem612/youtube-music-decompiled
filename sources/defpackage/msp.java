package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.car.app.model.Alert;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class msp extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public ner A;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nxl B;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public omj C;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Boolean a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nry b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nsl c;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nso d;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean e;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nte f;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean g;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean q;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean r;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean s;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean t;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nuc u;

    @fmt(a = 13)
    @fmu(a = fmv.g)
    public Integer v;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float w;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float x;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float y;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Map z;

    public msp() {
        super("TextViewComponent");
        this.d = mss.a;
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        int i = mss.b;
        return new mry(context);
    }

    @Override // defpackage.fgy
    protected final void E(fiz fizVar, fiz fizVar2) {
        zpd zpdVar = (zpd) fizVar;
        zpd zpdVar2 = (zpd) fizVar2;
        zpdVar.d = zpdVar2.d;
        zpdVar.c = zpdVar2.c;
        zpdVar.b = zpdVar2.b;
        zpdVar.a = zpdVar2.a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        boolean z;
        mry mryVar = (mry) obj;
        ner nerVar = this.A;
        nry nryVar = this.b;
        nxl nxlVar = this.B;
        nuc nucVar = this.u;
        nsl nslVar = this.c;
        Map map = this.z;
        nte nteVar = this.f;
        omj omjVar = this.C;
        boolean z2 = this.q;
        float f = this.y;
        float f2 = this.w;
        float f3 = this.x;
        Integer num = this.v;
        boolean z3 = this.r;
        boolean z4 = this.t;
        boolean z5 = this.e;
        boolean z6 = this.g;
        Boolean bool = this.a;
        boolean z7 = this.s;
        zpd zpdVar = (zpd) fizVar;
        Object obj2 = zpdVar.a;
        ?? r0 = zpdVar.d;
        int i = mss.b;
        if (nslVar != null) {
            nslVar.f("null");
        }
        Context context = fhdVar.a;
        Resources resources = context.getResources();
        if (r0 == 0 || r0.length() <= 0) {
            CharSequence charSequenceI = msf.i(nslVar, context, nerVar.m() ? omj.s(nerVar.i(), nslVar, nucVar) : null, nryVar, nxlVar, nucVar, map, nteVar, omjVar, z2, z3, z4, z5, 0);
            CharSequence charSequenceI2 = msf.i(nslVar, context, nerVar.n() ? omj.s(nerVar.j(), nslVar, nucVar) : null, nryVar, nxlVar, nucVar, map, nteVar, omjVar, z2, z3, z4, z5, 0);
            if (true == TextUtils.isEmpty(charSequenceI2)) {
                charSequenceI2 = "…";
            }
            CharSequence charSequence = charSequenceI2;
            SpannableString spannableString = new SpannableString(charSequenceI);
            int length = charSequenceI.length();
            for (ImageSpan imageSpan : (ImageSpan[]) spannableString.getSpans(0, length, ImageSpan.class)) {
                Drawable drawable = imageSpan.getDrawable();
                if (drawable != null) {
                    drawable.setCallback(new msr(mryVar, charSequenceI, charSequence, nerVar));
                }
            }
            mss.f(resources, mryVar, charSequenceI, nerVar, f, f2, f3, num, z6, bool, (fwl) obj2);
            mryVar.b(charSequenceI, charSequence, nerVar.h());
            z = z7;
        } else {
            for (ImageSpan imageSpan2 : (ImageSpan[]) new SpannableString(r0).getSpans(0, r0.length(), ImageSpan.class)) {
                Drawable drawable2 = imageSpan2.getDrawable();
                if (drawable2 != null) {
                    drawable2.setCallback(new msq(mryVar, r0));
                }
            }
            z = z7;
            mss.f(resources, mryVar, r0, nerVar, f, f2, f3, num, z6, bool, (fwl) obj2);
            mryVar.addOnLayoutChangeListener(new mrt(mryVar, (CharSequence) r0, 0));
        }
        mryVar.c = z;
    }

    @Override // defpackage.fgy
    public final boolean O() {
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
        ner nerVar;
        mxc mxcVarS;
        Object obj;
        zpd zpdVar;
        nsl nslVar;
        CharSequence charSequence;
        CharSequence charSequenceD;
        CharSequence charSequence2;
        Object obj2;
        ner nerVar2 = this.A;
        nry nryVar = this.b;
        nxl nxlVar = this.B;
        nuc nucVar = this.u;
        nsl nslVar2 = this.c;
        Map map = this.z;
        nte nteVar = this.f;
        omj omjVar = this.C;
        boolean z = this.q;
        boolean z2 = this.r;
        boolean z3 = this.t;
        boolean z4 = this.e;
        zpd zpdVar2 = (zpd) fizVar;
        Object objM = zpdVar2.b;
        Object obj3 = zpdVar2.c;
        int i = mss.b;
        if (objM == null || obj3 == null) {
            Context context = fhdVar.a;
            Resources resources = context.getResources();
            if (nerVar2.m()) {
                nerVar = nerVar2;
                mxcVarS = omj.s(nerVar.i(), nslVar2, nucVar);
            } else {
                nerVar = nerVar2;
                mxcVarS = null;
            }
            CharSequence charSequenceI = msf.i(nslVar2, context, mxcVarS, nryVar, nxlVar, nucVar, map, nteVar, omjVar, z, z2, z3, z4, 0);
            if (mxcVarS == null || TextUtils.isEmpty(charSequenceI)) {
                objM = null;
                obj = null;
            } else {
                zpdVar = zpdVar2;
                mxc mxcVar = mxcVarS;
                CharSequence charSequenceI2 = msf.i(nslVar2, context, nerVar.n() ? omj.s(nerVar.j(), nslVar2, nucVar) : null, nryVar, nxlVar, nucVar, map, nteVar, omjVar, z, z2, z3, z4, 0);
                if (true == TextUtils.isEmpty(charSequenceI2)) {
                    charSequenceI2 = "…";
                }
                int iH = nerVar.l() ? nerVar.h() : Alert.DURATION_SHOW_INDEFINITELY;
                int iG = (fjiVar.g() - fjiVar.d()) - fjiVar.e();
                if (mxcVar.z()) {
                    nslVar = nslVar2;
                    if (mxcVar.E() == 2) {
                        charSequenceI2 = "";
                    }
                } else {
                    nslVar = nslVar2;
                }
                CharSequence charSequence3 = charSequenceI2;
                Layout.Alignment alignmentE = msf.e(mxcVar.w() ? mxcVar.G() : 6);
                TextPaint textPaintB = mss.b(charSequenceI, resources, charSequence3);
                StaticLayout staticLayoutA = mss.a(charSequenceI, textPaintB, iG, alignmentE, mxcVar);
                mxg mxgVarC = mss.c(mxcVar);
                if (mxgVarC != null) {
                    charSequenceD = mss.g(charSequence3, charSequenceI, mxcVar, iH, iG, alignmentE, staticLayoutA, textPaintB, fhdVar, nryVar, nxlVar, nucVar, nslVar, map, nteVar, omjVar, z, z2, z3, z4, mxgVarC);
                } else if (iH <= 0 || staticLayoutA.getLineCount() <= iH) {
                    charSequence = charSequenceI;
                    charSequence = charSequenceI;
                    if (!mxcVar.z() || staticLayoutA.getHeight() <= fjiVar.b()) {
                        charSequenceD = null;
                    } else {
                        charSequenceD = mss.d((int) (fjiVar.b() / (staticLayoutA.getHeight() / staticLayoutA.getLineCount())), staticLayoutA, charSequence, charSequence3, textPaintB, mxcVar, alignmentE);
                    }
                } else {
                    charSequenceD = mss.d(iH, staticLayoutA, charSequence, charSequence3, textPaintB, mxcVar, alignmentE);
                }
                if (charSequenceD == null) {
                    charSequence = charSequenceI;
                    charSequence = charSequenceI;
                    charSequence2 = null;
                } else {
                    charSequence = charSequenceI;
                    charSequence = charSequenceI;
                    charSequence2 = charSequenceD;
                }
                boolean zIsEmpty = TextUtils.isEmpty(charSequence2);
                objM = null;
                obj2 = charSequence2;
                if (zIsEmpty) {
                    obj2 = charSequence;
                }
            }
            zpdVar2.a = objM;
            zpdVar2.d = obj;
        }
        zpdVar = zpdVar2;
        if (objM == null) {
            obj2 = obj3;
            zpdVar2 = zpdVar;
            objM = fjiVar.m();
            obj = obj2;
        } else {
            obj2 = obj3;
            zpdVar2 = zpdVar;
            obj = obj2;
        }
        zpdVar2.a = objM;
        zpdVar2.d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:57:0x0146  */
    /* JADX WARN: Code duplicated, block: B:59:0x0150  */
    /* JADX WARN: Code duplicated, block: B:60:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0159  */
    /* JADX WARN: Code duplicated, block: B:63:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0175  */
    /* JADX WARN: Code duplicated, block: B:68:0x0196  */
    @Override // defpackage.fgy
    protected final void ah(fhd fhdVar, fji fjiVar, int i, int i2, fkw fkwVar, fiz fizVar) {
        fwl fwlVarM;
        CharSequence charSequence;
        nry nryVar;
        nxl nxlVar;
        CharSequence charSequence2;
        TextPaint textPaintB;
        CharSequence charSequence3;
        nuc nucVar;
        int i3;
        StaticLayout staticLayoutA;
        boolean z;
        mxg mxgVarC;
        TextPaint textPaint;
        boolean z2;
        int i4;
        mxc mxcVar;
        int i5;
        CharSequence charSequence4;
        Layout.Alignment alignment;
        CharSequence charSequenceD;
        TextUtils.TruncateAt truncateAtF;
        float desiredWidth;
        ner nerVar = this.A;
        nry nryVar2 = this.b;
        nxl nxlVar2 = this.B;
        nuc nucVar2 = this.u;
        nsl nslVar = this.c;
        Map map = this.z;
        nte nteVar = this.f;
        omj omjVar = this.C;
        boolean z3 = this.q;
        boolean z4 = this.r;
        boolean z5 = this.t;
        boolean z6 = this.e;
        int i6 = mss.b;
        Context context = fhdVar.a;
        Resources resources = context.getResources();
        CharSequence charSequence5 = null;
        mxc mxcVarS = nerVar.m() ? omj.s(nerVar.i(), nslVar, nucVar2) : null;
        CharSequence charSequenceI = msf.i(nslVar, context, mxcVarS, nryVar2, nxlVar2, nucVar2, map, nteVar, omjVar, z3, z4, z5, z6, 0);
        if (mxcVarS == null || TextUtils.isEmpty(charSequenceI)) {
            fkwVar.a = 0;
            fkwVar.b = 0;
            fwlVarM = null;
            charSequence = null;
        } else {
            CharSequence charSequenceI2 = msf.i(nslVar, context, nerVar.n() ? omj.s(nerVar.j(), nslVar, nucVar2) : null, nryVar2, nxlVar2, nucVar2, map, nteVar, omjVar, z3, z4, z5, z6, 0);
            if (true == TextUtils.isEmpty(charSequenceI2)) {
                charSequenceI2 = "…";
            }
            int iH = nerVar.l() ? nerVar.h() : Alert.DURATION_SHOW_INDEFINITELY;
            int size = View.MeasureSpec.getSize(i);
            CharSequence charSequence6 = charSequenceI2;
            Layout.Alignment alignmentE = msf.e(mxcVarS.w() ? mxcVarS.G() : 6);
            if (mxcVarS.z()) {
                nryVar = nryVar2;
                nxlVar = nxlVar2;
                if (mxcVarS.E() == 2) {
                    charSequence2 = "";
                }
                textPaintB = mss.b(charSequenceI, resources, charSequence2);
                charSequence3 = charSequence2;
                if (View.MeasureSpec.getMode(i) != 1073741824) {
                    desiredWidth = Layout.getDesiredWidth(charSequenceI, textPaintB);
                    nucVar = nucVar2;
                    if ((View.MeasureSpec.getMode(i) != Integer.MIN_VALUE && desiredWidth < size) || (View.MeasureSpec.getMode(i) == 0 && desiredWidth > size)) {
                    }
                } else {
                    nucVar = nucVar2;
                }
                i3 = size;
                staticLayoutA = mss.a(charSequenceI, textPaintB, i3, alignmentE, mxcVarS);
                if (iH > 0 || staticLayoutA.getLineCount() <= iH) {
                    z = false;
                } else {
                    z = true;
                }
                mxgVarC = mss.c(mxcVarS);
                if (mxgVarC != null) {
                    alignment = alignmentE;
                    i5 = iH;
                    charSequence4 = charSequenceI;
                    textPaint = textPaintB;
                    z2 = true;
                    charSequenceD = mss.g(charSequence3, charSequence4, mxcVar, i5, i3, alignment, staticLayoutA, textPaint, fhdVar, nryVar, nxlVar, nucVar, nslVar, map, nteVar, omjVar, z3, z4, z5, z6, mxgVarC);
                } else {
                    textPaint = textPaintB;
                    z2 = true;
                    i4 = iH;
                    if (z) {
                        charSequenceD = mss.d(i4, staticLayoutA, charSequenceI, charSequence3, textPaint, mxcVar, alignmentE);
                        i5 = i4;
                        charSequence4 = charSequenceI;
                        alignment = alignmentE;
                    } else {
                        i5 = i4;
                        charSequence4 = charSequenceI;
                        alignment = alignmentE;
                        charSequenceD = null;
                    }
                }
                if (charSequenceD != null) {
                    mxcVar = mxcVarS;
                    mxcVar = mxcVarS;
                    mxcVar = mxcVarS;
                    staticLayoutA = mss.a(charSequenceD, textPaint, i3, alignment, mxcVar);
                    charSequence5 = charSequenceD;
                } else if (z) {
                    StaticLayout.Builder maxLines = StaticLayout.Builder.obtain(charSequence4, 0, charSequence4.length(), textPaint, i3).setMaxLines(i5);
                    if (mxcVar.z()) {
                        truncateAtF = msf.f(mxcVar.E());
                    } else {
                        truncateAtF = TextUtils.TruncateAt.END;
                    }
                    StaticLayout.Builder ellipsize = maxLines.setEllipsize(truncateAtF);
                    mss.e(ellipsize, mxcVar, alignment);
                    staticLayoutA = ellipsize.build();
                }
                fkwVar.b = staticLayoutA.getHeight();
                fkwVar.a = staticLayoutA.getWidth();
                if (z2 == TextUtils.isEmpty(charSequence5)) {
                    charSequence5 = charSequence4;
                }
                fwlVarM = fjiVar.m();
                charSequence = charSequence5;
            } else {
                nryVar = nryVar2;
                nxlVar = nxlVar2;
            }
            charSequence2 = charSequence6;
            textPaintB = mss.b(charSequenceI, resources, charSequence2);
            charSequence3 = charSequence2;
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                desiredWidth = Layout.getDesiredWidth(charSequenceI, textPaintB);
                nucVar = nucVar2;
                size = View.MeasureSpec.getMode(i) != Integer.MIN_VALUE ? (int) Math.ceil(desiredWidth) : (int) Math.ceil(desiredWidth);
            } else {
                nucVar = nucVar2;
            }
            i3 = size;
            staticLayoutA = mss.a(charSequenceI, textPaintB, i3, alignmentE, mxcVarS);
            if (iH > 0) {
                z = false;
            } else {
                z = false;
            }
            mxgVarC = mss.c(mxcVarS);
            if (mxgVarC != null) {
                alignment = alignmentE;
                i5 = iH;
                charSequence4 = charSequenceI;
                textPaint = textPaintB;
                z2 = true;
                charSequenceD = mss.g(charSequence3, charSequence4, mxcVar, i5, i3, alignment, staticLayoutA, textPaint, fhdVar, nryVar, nxlVar, nucVar, nslVar, map, nteVar, omjVar, z3, z4, z5, z6, mxgVarC);
            } else {
                textPaint = textPaintB;
                z2 = true;
                i4 = iH;
                if (z) {
                    charSequenceD = mss.d(i4, staticLayoutA, charSequenceI, charSequence3, textPaint, mxcVar, alignmentE);
                    i5 = i4;
                    charSequence4 = charSequenceI;
                    alignment = alignmentE;
                } else {
                    i5 = i4;
                    charSequence4 = charSequenceI;
                    alignment = alignmentE;
                    charSequenceD = null;
                }
            }
            if (charSequenceD != null) {
                mxcVar = mxcVarS;
                mxcVar = mxcVarS;
                mxcVar = mxcVarS;
                staticLayoutA = mss.a(charSequenceD, textPaint, i3, alignment, mxcVar);
                charSequence5 = charSequenceD;
            } else if (z) {
                StaticLayout.Builder maxLines2 = StaticLayout.Builder.obtain(charSequence4, 0, charSequence4.length(), textPaint, i3).setMaxLines(i5);
                if (mxcVar.z()) {
                    truncateAtF = msf.f(mxcVar.E());
                } else {
                    truncateAtF = TextUtils.TruncateAt.END;
                }
                StaticLayout.Builder ellipsize2 = maxLines2.setEllipsize(truncateAtF);
                mss.e(ellipsize2, mxcVar, alignment);
                staticLayoutA = ellipsize2.build();
            }
            fkwVar.b = staticLayoutA.getHeight();
            fkwVar.a = staticLayoutA.getWidth();
            if (z2 == TextUtils.isEmpty(charSequence5)) {
                charSequence5 = charSequence4;
            }
            fwlVarM = fjiVar.m();
            charSequence = charSequence5;
        }
        zpd zpdVar = (zpd) fizVar;
        zpdVar.b = fwlVarM;
        zpdVar.c = charSequence;
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        nte nteVar;
        omj omjVar;
        nuc nucVar;
        Integer num;
        Map map;
        ner nerVar;
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            msp mspVar = (msp) fgyVar;
            Boolean bool = this.a;
            if (bool == null ? mspVar.a == null : bool.equals(mspVar.a)) {
                nry nryVar = this.b;
                if (nryVar == null ? mspVar.b == null : nryVar.equals(mspVar.b)) {
                    nsl nslVar = this.c;
                    if (nslVar == null ? mspVar.c == null : nslVar.equals(mspVar.c)) {
                        nso nsoVar = this.d;
                        if (nsoVar == null ? mspVar.d == null : nsoVar.equals(mspVar.d)) {
                            if (this.e == mspVar.e && ((nteVar = this.f) == null ? mspVar.f == null : nteVar.equals(mspVar.f)) && this.g == mspVar.g && this.q == mspVar.q && this.r == mspVar.r && this.s == mspVar.s && this.t == mspVar.t && ((omjVar = this.C) == null ? mspVar.C == null : omjVar.equals(mspVar.C)) && ((nucVar = this.u) == null ? mspVar.u == null : nucVar.equals(mspVar.u)) && ((num = this.v) == null ? mspVar.v == null : num.equals(mspVar.v)) && Float.compare(this.w, mspVar.w) == 0 && Float.compare(this.x, mspVar.x) == 0 && Float.compare(this.y, mspVar.y) == 0 && ((map = this.z) == null ? mspVar.z == null : aguu.q(map, mspVar.z)) && ((nerVar = this.A) == null ? mspVar.A == null : nerVar.equals(mspVar.A))) {
                                nxl nxlVar = this.B;
                                if (nxlVar != null) {
                                    if (nxlVar.equals(mspVar.B)) {
                                        return true;
                                    }
                                } else if (mspVar.B == null) {
                                    return true;
                                }
                            }
                        }
                    }
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
        return (msp) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fiz r() {
        return new zpd();
    }
}
