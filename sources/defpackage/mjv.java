package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mjv extends fkx {
    public static final /* synthetic */ int C = 0;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj A;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj B;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    avmb a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nry b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsl c;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean d;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nar e;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean f;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean g;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean q;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean r;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean s;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nuc t;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    Map u;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nxl v;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    avmb w;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj x;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj y;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj z;

    public mjv() {
        super("EditableText");
    }

    public static fip aE(fhd fhdVar, omj omjVar) {
        return o(mjv.class, "EditableText", fhdVar, 378376578, new Object[]{fhdVar, omjVar});
    }

    private static final mju aF(fhd fhdVar) {
        return (mju) fhdVar.i().c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.fgy
    protected final Object A(fip fipVar, Object obj) {
        orx orxVar;
        boolean z = true;
        boolean z2 = true;
        int i = 0;
        Object obj2 = null;
        switch (fipVar.c) {
            case -1974694341:
                fsz fszVar = (fsz) obj;
                fiu fiuVar = fipVar.b;
                Object[] objArr = fipVar.d;
                fhd fhdVar = (fhd) objArr[0];
                omj omjVar = (omj) objArr[1];
                omj omjVar2 = (omj) objArr[2];
                Object obj3 = fszVar.b;
                boolean z3 = fszVar.a;
                mjv mjvVar = (mjv) fiuVar;
                mju mjuVarAF = aF(fhdVar);
                nry nryVar = mjvVar.b;
                nsl nslVar = mjvVar.c;
                boolean z4 = mjvVar.r;
                nar narVar = mjvVar.e;
                boolean z5 = mjvVar.s;
                boolean z6 = mjvVar.g;
                AtomicReference atomicReference = mjuVarAF.a;
                AtomicBoolean atomicBoolean = mjuVarAF.b;
                String str = mkh.a;
                if (z4) {
                    atomicBoolean.set(z3);
                }
                if (narVar.v() && (orxVar = (orx) atomicReference.get()) != null) {
                    if (z3) {
                        View view = (View) obj3;
                        mej.d(view);
                        orxVar.b(view);
                    } else {
                        orxVar.d();
                    }
                }
                if (!z3) {
                    if (z5) {
                        View view2 = (View) obj3;
                        InputMethodManager inputMethodManager = (InputMethodManager) view2.getContext().getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(view2.getWindowToken(), 0);
                        }
                    }
                    if (omjVar2 != null) {
                        nryVar.a(omjVar2.x(), mkh.b((View) obj3, z6, nslVar.x, 0)).D();
                    }
                } else if (omjVar != null) {
                    nryVar.a(omjVar.x(), mkh.b((View) obj3, z6, nslVar.x, 0)).D();
                }
                return obj2;
            case -1048037474:
                gzj.bO((fhd) fipVar.d[0], (isw) obj);
                return obj2;
            case -1033470818:
                aai aaiVar = (aai) obj;
                fiu fiuVar2 = fipVar.b;
                Object obj4 = aaiVar.b;
                Object obj5 = aaiVar.c;
                int i2 = aaiVar.a;
                mjv mjvVar2 = (mjv) fiuVar2;
                nar narVar2 = mjvVar2.e;
                nry nryVar2 = mjvVar2.b;
                nsl nslVar2 = mjvVar2.c;
                nuc nucVar = mjvVar2.t;
                avmb avmbVar = mjvVar2.a;
                avmb avmbVar2 = mjvVar2.w;
                String str2 = mkh.a;
                if (narVar2.B()) {
                    zs zsVar = (zs) obj5;
                    Uri uriC = zsVar.c();
                    if (uriC != null) {
                        if ((i2 & 1) != 0) {
                            try {
                                ((zs) obj5).e();
                            } catch (RuntimeException e) {
                                nucVar.f(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar2, e, "InputContentInfoCompat#requestPermission() failed. This is usually due to developer error, but could also be due e.g. trying to access files after permission is revoked. Review the EditableTextSpec implementation.", new Object[0]);
                                z = false;
                            }
                            break;
                        }
                        awgs awgsVar = new awgs(avmc.m(new xor(((View) obj4).getContext().getApplicationContext(), uriC, z ? 1 : 0)).y(avmbVar), new mkb(i2, zsVar, nucVar, nslVar2, 0));
                        avnn avnnVar = atqp.o;
                        awgsVar.u(new aaki(zsVar, nucVar, narVar2, nslVar2, 1)).v(avmbVar2).c(new mkc(obj4, nslVar2, nryVar2, i)).F(new hrj(3), new gkr(nucVar, nslVar2, 20, null));
                        return Boolean.valueOf(z);
                    }
                    nucVar.c(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar2, "Content URI is unexpectedly null. This should NEVER happen and represents a breach in contract from the IME (consider reporting a bug to the IME and/or review integration point).", new Object[0]);
                } else {
                    nucVar.c(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar2, "OnRichContentSendAction is null. This should NEVER happen as rich content functions shouldn't be enabled without a valid action. Review the EditableTextSpec implementation.", new Object[0]);
                }
                z = false;
                return Boolean.valueOf(z);
            case 378110312:
                isw iswVar = (isw) obj;
                fiu fiuVar3 = fipVar.b;
                Object[] objArr2 = fipVar.d;
                fhd fhdVar2 = (fhd) objArr2[0];
                omj omjVar3 = (omj) objArr2[1];
                Object obj6 = iswVar.b;
                Object obj7 = iswVar.a;
                mjv mjvVar3 = (mjv) fiuVar3;
                mju mjuVarAF2 = aF(fhdVar2);
                nar narVar3 = mjvVar3.e;
                nry nryVar3 = mjvVar3.b;
                nsl nslVar3 = mjvVar3.c;
                boolean z7 = mjvVar3.g;
                mke mkeVar = mjuVarAF2.d;
                mkf mkfVar = mjuVarAF2.e;
                String str3 = mkh.a;
                if (mkfVar != null) {
                    mkfVar.a = (EditText) obj6;
                }
                synchronized (mkeVar) {
                    mkeVar.a.add(0, obj7);
                    break;
                }
                if (omjVar3 != null) {
                    if (narVar3.h() > 0) {
                        EditText editText = (EditText) obj6;
                        if (editText.getLineCount() > narVar3.h()) {
                            Layout layout = editText.getLayout();
                            if (narVar3.h() > 0 && layout != null && layout.getLineCount() > narVar3.h()) {
                                synchronized (mkeVar) {
                                    String strZ = mkeVar.e;
                                    int i3 = mkeVar.c;
                                    int i4 = mkeVar.d;
                                    if (strZ == null) {
                                        strZ = ahno.Z(mkeVar.b);
                                    } else if (i3 == -1) {
                                        i3 = -1;
                                        strZ = ahno.Z(mkeVar.b);
                                    }
                                    ((EditText) obj6).setText(strZ);
                                    int length = strZ.length();
                                    int iMax = Math.max(0, Math.min(i3, length));
                                    int iMax2 = Math.max(0, Math.min(i4, length));
                                    if (iMax > iMax2) {
                                        iMax = iMax2;
                                    }
                                    ((EditText) obj6).setSelection(iMax, iMax2);
                                    List list = mkeVar.a;
                                    if (!list.isEmpty() && ((String) list.get(0)).equals(obj7)) {
                                        list.remove(0);
                                    }
                                }
                            } else {
                                nryVar3.a(omjVar3.x(), mkh.b((View) obj6, z7, nslVar3.x, 0)).D();
                            }
                        } else {
                            nryVar3.a(omjVar3.x(), mkh.b((View) obj6, z7, nslVar3.x, 0)).D();
                        }
                    } else {
                        nryVar3.a(omjVar3.x(), mkh.b((View) obj6, z7, nslVar3.x, 0)).D();
                    }
                    break;
                }
                obj2 = null;
                return obj2;
            case 378376578:
                fiu fiuVar4 = fipVar.b;
                Object[] objArr3 = fipVar.d;
                omj omjVar4 = (omj) objArr3[1];
                Object obj8 = ((acu) obj).a;
                mjv mjvVar4 = (mjv) fiuVar4;
                nry nryVar4 = mjvVar4.b;
                nsl nslVar4 = mjvVar4.c;
                boolean z8 = mjvVar4.g;
                String str4 = mkh.a;
                if (omjVar4 == null || obj8 == null) {
                    z2 = false;
                } else {
                    nryVar4.a(omjVar4.x(), mkh.b((View) obj8, z8, nslVar4.x, 21)).D();
                }
                return Boolean.valueOf(z2);
            case 1803022739:
                fiu fiuVar5 = fipVar.b;
                fhd fhdVar3 = (fhd) fipVar.d[0];
                Object obj9 = ((ahfi) obj).b;
                mju mjuVarAF3 = aF(fhdVar3);
                nar narVar4 = ((mjv) fiuVar5).e;
                AtomicBoolean atomicBoolean2 = mjuVarAF3.c;
                AtomicReference atomicReference2 = mjuVarAF3.f;
                String str5 = mkh.a;
                if (obj9 instanceof EditText) {
                    if (narVar4.w()) {
                        EditText editText2 = (EditText) obj9;
                        int iG = narVar4.g();
                        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(iG, PorterDuff.Mode.SRC_IN);
                        editText2.setHighlightColor(avv.f(iG, SemanticState.Focused));
                        if (Build.VERSION.SDK_INT >= 29) {
                            Drawable textSelectHandle = editText2.getTextSelectHandle();
                            Drawable textSelectHandleLeft = editText2.getTextSelectHandleLeft();
                            Drawable textSelectHandleRight = editText2.getTextSelectHandleRight();
                            if (textSelectHandle != null) {
                                textSelectHandle.setColorFilter(porterDuffColorFilter);
                            }
                            if (textSelectHandleLeft != null && textSelectHandleRight != null) {
                                textSelectHandleLeft.setColorFilter(porterDuffColorFilter);
                                textSelectHandleRight.setColorFilter(porterDuffColorFilter);
                            }
                        } else {
                            try {
                                Field declaredField = TextView.class.getDeclaredField("mEditor");
                                if (!declaredField.isAccessible()) {
                                    declaredField.setAccessible(true);
                                }
                                Object obj10 = declaredField.get(editText2);
                                if (obj10 != null) {
                                    Class<?> cls = obj10.getClass();
                                    String[] strArr = {"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};
                                    String[] strArr2 = {"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
                                    int i5 = 0;
                                    for (int i6 = 3; i5 < i6; i6 = 3) {
                                        Field declaredField2 = cls.getDeclaredField(strArr[i5]);
                                        if (!declaredField2.isAccessible()) {
                                            declaredField2.setAccessible(true);
                                        }
                                        Drawable drawable = (Drawable) declaredField2.get(obj10);
                                        if (drawable == null) {
                                            Field declaredField3 = TextView.class.getDeclaredField(strArr2[i5]);
                                            if (!declaredField3.isAccessible()) {
                                                declaredField3.setAccessible(true);
                                            }
                                            drawable = editText2.getContext().getDrawable(declaredField3.getInt(editText2));
                                        }
                                        if (drawable != null) {
                                            Drawable drawableMutate = drawable.mutate();
                                            drawableMutate.setColorFilter(porterDuffColorFilter);
                                            declaredField2.set(obj10, drawableMutate);
                                        }
                                        i5++;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    if (narVar4.u() && atomicBoolean2.getAndSet(false)) {
                        if (atomicReference2.get() == null) {
                            atomicReference2.set(new mkg());
                        }
                        ((View) obj9).post(new lfa(obj9, (mkg) atomicReference2.get(), 16, (byte[]) null));
                    }
                }
                obj2 = null;
                return obj2;
            default:
                obj2 = null;
                return obj2;
        }
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        mju mjuVarAF = aF(fhdVar);
        nar narVar = this.e;
        String str = mkh.a;
        mke mkeVar = new mke();
        mkf mkfVar = narVar.h() > 0 ? new mkf(mkeVar) : null;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
        AtomicReference atomicReference = narVar.v() ? new AtomicReference(new orx(1)) : new AtomicReference(null);
        AtomicReference atomicReference2 = new AtomicReference(null);
        mjuVarAF.d = mkeVar;
        mjuVarAF.a = atomicReference;
        mjuVarAF.c = atomicBoolean2;
        mjuVarAF.b = atomicBoolean;
        mjuVarAF.f = atomicReference2;
        if (mkfVar != null) {
            mjuVarAF.e = mkfVar;
        }
    }

    @Override // defpackage.fgy
    public final void K(fhd fhdVar) {
        orx orxVar;
        mju mjuVarAF = aF(fhdVar);
        nar narVar = this.e;
        AtomicReference atomicReference = mjuVarAF.f;
        AtomicReference atomicReference2 = mjuVarAF.a;
        String str = mkh.a;
        mkg mkgVar = (mkg) atomicReference.getAndSet(null);
        if (mkgVar != null) {
            mkgVar.a();
        }
        if (!narVar.v() || (orxVar = (orx) atomicReference2.get()) == null) {
            return;
        }
        orxVar.d();
        atomicReference2.set(null);
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        mju mjuVar = (mju) fkyVar;
        mju mjuVar2 = (mju) fkyVar2;
        mjuVar2.a = mjuVar.a;
        mjuVar2.b = mjuVar.b;
        mjuVar2.c = mjuVar.c;
        mjuVar2.d = mjuVar.d;
        mjuVar2.e = mjuVar.e;
        mjuVar2.f = mjuVar.f;
    }

    @Override // defpackage.fgy
    public final boolean P() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    @Override // defpackage.fkx
    protected final fgy aC(fhd fhdVar) {
        mju mjuVarAF = aF(fhdVar);
        return mkh.c(fhdVar, this.e, this.y, this.z, this.x, this.A, this.v, this.t, this.B, this.q, this.d, this.r, this.f, this.g, this.b, this.c, this.u, mjuVarAF.d, mjuVarAF.b, mjuVarAF.e);
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new mju();
    }
}
