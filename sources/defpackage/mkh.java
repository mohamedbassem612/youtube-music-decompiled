package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mkh {
    public static final String a = "mkh";
    public static final AtomicInteger b = new AtomicInteger();
    private static final Handler c = new Handler(Looper.getMainLooper());
    private static final BreakIterator d = BreakIterator.getCharacterInstance();

    private mkh() {
    }

    public static void a(View view) {
        view.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    public static nrv b(View view, boolean z, ntx ntxVar, int i) {
        nrt nrtVarD = nrv.d();
        nrtVarD.d(view);
        nrtVarD.g = ntxVar;
        nrtVarD.k = i;
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            String string = editText.getText().toString();
            aihf aihfVarCreateBuilder = askp.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            askp askpVar = (askp) aihfVarCreateBuilder.instance;
            string.getClass();
            askpVar.b |= 1;
            askpVar.c = string;
            askp askpVar2 = (askp) aihfVarCreateBuilder.build();
            aihf aihfVarCreateBuilder2 = asmt.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            asmt asmtVar = (asmt) aihfVarCreateBuilder2.instance;
            askpVar2.getClass();
            asmtVar.d = askpVar2;
            asmtVar.c |= 1;
            boolean zIsFocused = view.isFocused();
            aihfVarCreateBuilder2.copyOnWrite();
            asmt asmtVar2 = (asmt) aihfVarCreateBuilder2.instance;
            asmtVar2.c |= 8;
            asmtVar2.f = zIsFocused;
            int selectionEnd = editText.getSelectionEnd();
            aihfVarCreateBuilder2.copyOnWrite();
            asmt asmtVar3 = (asmt) aihfVarCreateBuilder2.instance;
            asmtVar3.c |= 2;
            asmtVar3.e = selectionEnd;
            BreakIterator breakIterator = d;
            breakIterator.setText(string);
            breakIterator.first();
            int i2 = 0;
            while (breakIterator.next() != -1) {
                i2++;
            }
            aihfVarCreateBuilder2.copyOnWrite();
            asmt asmtVar4 = (asmt) aihfVarCreateBuilder2.instance;
            asmtVar4.c |= 16;
            asmtVar4.g = i2;
            if (z) {
                int lineCount = editText.getLineCount();
                aihfVarCreateBuilder2.copyOnWrite();
                asmt asmtVar5 = (asmt) aihfVarCreateBuilder2.instance;
                asmtVar5.c |= 64;
                asmtVar5.i = lineCount;
            }
            asmt asmtVar6 = (asmt) aihfVarCreateBuilder2.build();
            aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
            aihhVar.e(asmt.b, asmtVar6);
            nrtVarD.e = (SenderStateOuterClass$SenderState) aihhVar.build();
        }
        return nrtVarD.a();
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0377  */
    /* JADX WARN: Code duplicated, block: B:157:0x0386  */
    /* JADX WARN: Code duplicated, block: B:159:0x038e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0390 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x0392  */
    /* JADX WARN: Code duplicated, block: B:163:0x0395 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x0397  */
    /* JADX WARN: Code duplicated, block: B:165:0x0399  */
    /* JADX WARN: Code duplicated, block: B:166:0x039a A[PHI: r4
      0x039a: PHI (r4v24 int) = (r4v17 int), (r4v25 int) binds: [B:159:0x038e, B:165:0x0399] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:167:0x039c  */
    /* JADX WARN: Code duplicated, block: B:168:0x039e  */
    /* JADX WARN: Code duplicated, block: B:170:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:172:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:173:0x03af  */
    /* JADX WARN: Code duplicated, block: B:175:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:177:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:178:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:180:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:182:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:186:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:189:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:191:0x0407  */
    /* JADX WARN: Code duplicated, block: B:194:0x0410  */
    /* JADX WARN: Code duplicated, block: B:197:0x041c A[LOOP:1: B:195:0x0416->B:197:0x041c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x0434  */
    /* JADX WARN: Code duplicated, block: B:201:0x0437  */
    /* JADX WARN: Code duplicated, block: B:204:0x0442  */
    /* JADX WARN: Code duplicated, block: B:207:0x045f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0462  */
    /* JADX WARN: Multi-variable type inference failed */
    static fgy c(fhd fhdVar, @fmu nar narVar, @fmu omj omjVar, @fmu omj omjVar2, @fmu omj omjVar3, @fmu omj omjVar4, @fmu nxl nxlVar, @fmu nuc nucVar, @fmu omj omjVar5, @fmu boolean z, @fmu boolean z2, @fmu boolean z3, @fmu boolean z4, @fmu boolean z5, @fmu nry nryVar, @fmu nsl nslVar, @fmu Map map, mke mkeVar, AtomicBoolean atomicBoolean, mkf mkfVar) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        boolean z6;
        int i6;
        int i7;
        String str2;
        boolean z7;
        int color;
        int i8;
        ArrayList arrayList;
        fua fuaVar;
        ArrayList arrayList2;
        int i9;
        fua fuaVar2;
        fua fuaVar3;
        int iJ;
        Resources resources;
        fua fuaVar4;
        mxc mxcVar;
        fty ftyVar = new fty(fhdVar, new fua());
        Context context = fhdVar.a;
        Resources resources2 = context.getResources();
        int i10 = 2;
        if (narVar.G() == 2) {
            ftyVar.a.t = new ColorDrawable(0);
        }
        if (narVar.g() != 0) {
            ftyVar.a.a = narVar.g();
        }
        boolean z8 = z && men.b;
        fua fuaVar5 = ftyVar.a;
        fuaVar5.d = z8;
        if (narVar.F()) {
            mxc mxcVarL = narVar.l();
            int i11 = 0;
            while (true) {
                if (i11 < mxcVarL.m()) {
                    mxy mxyVarT = mxcVarL.t(i11);
                    if (mxyVarT != null && mxyVarT.m() == 0) {
                        if (mxyVarT.h() != 0.0f) {
                            if (mxyVarT.C() == i10) {
                                fuaVar5.D = ftyVar.c.z(mxyVarT.h());
                            } else {
                                fuaVar5.D = ftyVar.c.A(mxyVarT.h());
                            }
                        }
                        if (!mxcVarL.y() || TextUtils.isEmpty(mxcVarL.u())) {
                            fuaVar4 = fuaVar5;
                            Typeface typefaceH = msf.h(context, resources2, mxyVarT, nxlVar, nucVar, nslVar, z2);
                            resources = resources2;
                            if (typefaceH == null) {
                                break;
                            }
                            ftyVar.g(typefaceH);
                            break;
                        }
                    } else {
                        i11++;
                        fuaVar5 = fuaVar5;
                        resources2 = resources2;
                        i10 = 2;
                    }
                }
                resources = resources2;
                fuaVar4 = fuaVar5;
                break;
            }
            CharSequence charSequenceI = msf.i(nslVar, context, mxcVarL, nryVar, nxlVar, nucVar, map, null, omjVar5, z, false, false, false, 0);
            context = context;
            if (e(mxcVarL)) {
                long jK = mxcVarL.t(0).k();
                if (jK != 0) {
                    fuaVar4.C = ColorStateList.valueOf((int) jK);
                }
                a.M(charSequenceI);
            }
            if (e(mxcVarL)) {
                mxcVar = mxcVarL;
                Typeface typefaceH2 = msf.h(context, resources, mxcVarL.t(0), nxlVar, nucVar, nslVar, z2);
                if (typefaceH2 != null) {
                    ftyVar.g(typefaceH2);
                }
            } else {
                mxcVar = mxcVarL;
            }
            String str3 = mkeVar.f;
            String string = charSequenceI.toString();
            synchronized (mkeVar) {
                String str4 = mkeVar.b;
                mkeVar.b = string;
                if (string.equals(str4)) {
                    str = mkeVar.f;
                } else {
                    List list = mkeVar.a;
                    int iIndexOf = list.indexOf(string);
                    if (iIndexOf >= 0) {
                        do {
                            list.remove(iIndexOf);
                        } while (iIndexOf < list.size());
                        str = mkeVar.f;
                    } else {
                        str = a + b.incrementAndGet();
                        mkeVar.f = str;
                    }
                }
            }
            if (!str3.equals(str)) {
                ftyVar.a.s = charSequenceI;
            }
            ftyVar.z(str);
            int iG = mxcVar.G() - 1;
            if (iG != 1) {
                i = 3;
                if (iG == 2) {
                    i2 = 5;
                    ftyVar.e(5);
                } else if (iG != 3) {
                    ftyVar.e(8388611);
                    i2 = 5;
                    ftyVar.a.B = 5;
                } else {
                    i2 = 5;
                    ftyVar.e(1);
                }
            } else {
                i = 3;
                i2 = 5;
                ftyVar.e(3);
            }
            if (mxcVar.E() != 2) {
                ftyVar.d(msf.f(mxcVar.E()));
            }
            if (mxcVar.E() == 1) {
                ftyVar.d(msf.g(mxcVar.H()));
            }
        } else {
            i = 3;
            i2 = 5;
            str = null;
        }
        String str5 = str;
        if (narVar.D()) {
            Context context2 = context;
            context = context2;
            ftyVar.a.g = msf.i(nslVar, context2, narVar.k(), nryVar, nxlVar, nucVar, map, null, omjVar5, z, false, false, false, 0);
        }
        if (omjVar != null) {
            int i12 = mjv.C;
            ftyVar.a.G = mjv.o(mjv.class, "EditableText", fhdVar, 378110312, new Object[]{fhdVar, omjVar});
        }
        if (omjVar2 != null || omjVar3 != null || z3 || narVar.v()) {
            int i13 = mjv.C;
            Object[] objArr = new Object[i];
            objArr[0] = fhdVar;
            objArr[1] = omjVar2;
            objArr[2] = omjVar3;
            ftyVar.b.k().F().p(mjv.o(mjv.class, "EditableText", fhdVar, -1974694341, objArr));
        }
        int iH = narVar.H() - 1;
        if (iH == 2) {
            i3 = 16384;
        } else if (iH != i) {
            i3 = iH != 4 ? 0 : SemanticState.Obscured;
        } else {
            i3 = SemanticState.Multiline;
        }
        switch (narVar.I() - 1) {
            case 2:
                i4 = 2;
                break;
            case 3:
                i4 = i;
                break;
            case 4:
                i4 = 8194;
                break;
            case 5:
            case 9:
                i4 = 32;
                break;
            case 6:
                i4 = 16;
                break;
            case 7:
                i4 = 96;
                break;
            case 8:
            default:
                if (narVar.i() != 1) {
                    fua fuaVar6 = ftyVar.a;
                    fuaVar6.y = true;
                    if (narVar.i() > 1) {
                        fuaVar6.w = narVar.i();
                    }
                }
                i4 = 1;
                break;
        }
        int i14 = true != narVar.s() ? 0 : 524288;
        fua fuaVar7 = ftyVar.a;
        int i15 = i14 | i4 | i3;
        fuaVar7.v = i15;
        if (!z3 || !narVar.x() || narVar.u() == atomicBoolean.get() || str5 == null) {
            i5 = i;
            z6 = true;
            i6 = 2;
            i7 = 0;
            str2 = str5;
            if (narVar.u() || narVar.w()) {
                z7 = z6;
                int i16 = mjv.C;
                ftyVar.I(mjv.o(mjv.class, "EditableText", fhdVar, 1803022739, new Object[]{fhdVar}));
                z7 = z6;
            }
        } else {
            str2 = str5;
            i5 = i;
            i6 = 2;
            i7 = 0;
            z7 = true;
            c.post(new lez((Object) narVar, (Object) fhdVar, (Object) str2, 3, (byte[]) null));
        }
        z7 = z6;
        fuaVar7.b = (narVar.t() ? 1 : 0) ^ z7;
        if (narVar.t() && str2 != null) {
            fua.aE(fhdVar, str2);
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.textColorHighlight, typedValue, z7)) {
            try {
                color = context.getColor(typedValue.resourceId);
                i15 = i15;
                i8 = z7;
                i5 = i5;
                i2 = i2;
            } catch (Resources.NotFoundException e) {
                aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                aslh aslhVar = aslh.LOG_TYPE_INVALID_FIELD;
                aihfVarCreateBuilder.copyOnWrite();
                asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                asncVar.d = aslhVar.I;
                asncVar.b |= i6;
                String hexString = Integer.toHexString(typedValue.resourceId);
                aihfVarCreateBuilder.copyOnWrite();
                asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
                hexString.getClass();
                asncVar2.b |= SemanticState.Hidden;
                asncVar2.l = hexString;
                nucVar.g((asnc) aihfVarCreateBuilder.build(), nslVar, e, "Highlight Color (attribute = android.R.attr.textColorHighlight) is associated with undefined.", new Object[i7]);
                color = i7;
                i8 = z7;
            }
            if (color != 0) {
                ftyVar.a.f = Integer.valueOf(color);
            }
            if (narVar.E()) {
                iJ = narVar.J() - 1;
                if (iJ != i8) {
                    i2 = i6;
                } else if (iJ == i6) {
                    i2 = i5;
                } else if (iJ != i5) {
                    i5 = 4;
                    i2 = i5;
                } else if (iJ != 4) {
                    if (iJ == i2) {
                        i2 = 6;
                    } else {
                        i2 = i7;
                    }
                }
            } else {
                i2 = i7;
            }
            if (omjVar4 != null) {
                if (mda.h(narVar)) {
                    ftyVar.c(mjv.aE(fhdVar, omjVar4));
                } else if (mda.g(omjVar4.x())) {
                    if (narVar.E()) {
                        d(i2, ftyVar, i15);
                    } else {
                        d(6, ftyVar, i15);
                    }
                    ftyVar.c(mjv.aE(fhdVar, omjVar4));
                } else {
                    fum fumVar = new fum(omjVar4, nryVar, nslVar, z5);
                    fuaVar3 = ftyVar.a;
                    if (fuaVar3.E == Collections.EMPTY_LIST) {
                        fuaVar3.E = new ArrayList();
                    }
                    fuaVar3.E.add(fumVar);
                }
            }
            if (narVar.E()) {
                ftyVar.f(i2);
            }
            arrayList = new ArrayList();
            if (z4) {
                arrayList.add(new mkd());
            }
            if (mkfVar != null) {
                arrayList.add(mkfVar);
            }
            if (narVar.j() > 0) {
                arrayList2 = new ArrayList();
                for (i9 = i7; i9 < narVar.j(); i9++) {
                    arrayList2.add(narVar.r(i9));
                }
                fuaVar2 = ftyVar.a;
                if (fuaVar2.A.isEmpty()) {
                    fuaVar2.A = arrayList2;
                } else {
                    fuaVar2.A.addAll(arrayList2);
                }
                if (narVar.B()) {
                    int i17 = mjv.C;
                    Object[] objArr2 = new Object[i8];
                    objArr2[i7] = fhdVar;
                    fuaVar2.I = mjv.o(mjv.class, "EditableText", fhdVar, -1033470818, objArr2);
                }
            }
            fuaVar = ftyVar.a;
            if (fuaVar.u.isEmpty()) {
                fuaVar.u = arrayList;
            } else {
                fuaVar.u.addAll(arrayList);
            }
            return ftyVar.a();
        }
        color = i7;
        i8 = z7;
        if (color != 0) {
            ftyVar.a.f = Integer.valueOf(color);
        }
        if (narVar.E()) {
            i2 = i7;
        } else {
            iJ = narVar.J() - 1;
            if (iJ != i8) {
                i2 = i6;
            } else if (iJ == i6) {
                i2 = i5;
            } else if (iJ != i5) {
                i5 = 4;
                i2 = i5;
            } else if (iJ != 4) {
                if (iJ == i2) {
                    i2 = 6;
                } else {
                    i2 = i7;
                }
            }
        }
        if (omjVar4 != null) {
            if (mda.h(narVar)) {
                ftyVar.c(mjv.aE(fhdVar, omjVar4));
            } else if (mda.g(omjVar4.x())) {
                if (narVar.E()) {
                    d(i2, ftyVar, i15);
                } else {
                    d(6, ftyVar, i15);
                }
                ftyVar.c(mjv.aE(fhdVar, omjVar4));
            } else {
                fum fumVar2 = new fum(omjVar4, nryVar, nslVar, z5);
                fuaVar3 = ftyVar.a;
                if (fuaVar3.E == Collections.EMPTY_LIST) {
                    fuaVar3.E = new ArrayList();
                }
                fuaVar3.E.add(fumVar2);
            }
        }
        if (narVar.E()) {
            ftyVar.f(i2);
        }
        arrayList = new ArrayList();
        if (z4) {
            arrayList.add(new mkd());
        }
        if (mkfVar != null) {
            arrayList.add(mkfVar);
        }
        if (narVar.j() > 0) {
            arrayList2 = new ArrayList();
            while (i9 < narVar.j()) {
                arrayList2.add(narVar.r(i9));
            }
            fuaVar2 = ftyVar.a;
            if (fuaVar2.A.isEmpty()) {
                fuaVar2.A = arrayList2;
            } else {
                fuaVar2.A.addAll(arrayList2);
            }
            if (narVar.B()) {
                int i18 = mjv.C;
                Object[] objArr3 = new Object[i8];
                objArr3[i7] = fhdVar;
                fuaVar2.I = mjv.o(mjv.class, "EditableText", fhdVar, -1033470818, objArr3);
            }
        }
        fuaVar = ftyVar.a;
        if (fuaVar.u.isEmpty()) {
            fuaVar.u = arrayList;
        } else {
            fuaVar.u.addAll(arrayList);
        }
        return ftyVar.a();
    }

    private static void d(int i, fty ftyVar, int i2) {
        ftyVar.f(i);
        ftyVar.a.z = i2 & (-131073);
    }

    private static boolean e(mxc mxcVar) {
        if (mxcVar.m() != 1) {
            return false;
        }
        mxy mxyVarT = mxcVar.t(0);
        long length = mxcVar.y() ? mxcVar.u().length() : 0L;
        return mxyVarT.m() == 0 && length <= (mxyVarT.z() ? (long) mxyVarT.l() : length);
    }
}
