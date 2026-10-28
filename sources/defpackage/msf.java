package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BulletSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.TypedValue;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class msf {
    public static final /* synthetic */ int a = 0;
    private static final Map b = new HashMap();
    private static final Map c = new HashMap();

    public static int a(Resources resources) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = resources.getConfiguration().fontWeightAdjustment) == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    public static void b(SpannableString spannableString, CharSequence charSequence, Class cls) {
        Object[] spans = spannableString.getSpans(0, spannableString.length(), cls);
        int length = spannableString.length() - charSequence.length();
        for (Object obj : spans) {
            int spanStart = spannableString.getSpanStart(obj);
            int spanEnd = spannableString.getSpanEnd(obj);
            if ((cls == ClickableSpan.class || spanStart > 0) && spanStart < length && spanEnd >= length) {
                spannableString.removeSpan(obj);
                spannableString.setSpan(obj, spanStart, length, 0);
            }
        }
    }

    public static int c(CharSequence charSequence, int i) {
        if (charSequence instanceof Spannable) {
            for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), AbsoluteSizeSpan.class)) {
                i = Math.max(absoluteSizeSpan.getSize(), i);
            }
        }
        return i;
    }

    public static int d(CharSequence charSequence, Resources resources) {
        int iP = rpi.p(TypedValue.applyDimension(2, 14.0f, resources.getDisplayMetrics()));
        if (charSequence instanceof Spannable) {
            for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), AbsoluteSizeSpan.class)) {
                iP = Math.min(absoluteSizeSpan.getSize(), iP);
            }
        }
        return iP;
    }

    public static Layout.Alignment e(int i) {
        int i2 = i - 1;
        if (i2 != 2) {
            return i2 != 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static TextUtils.TruncateAt f(int i) {
        int i2 = i - 1;
        if (i2 == 3) {
            return TextUtils.TruncateAt.START;
        }
        if (i2 != 5) {
            return i2 != 6 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE;
        }
        return TextUtils.TruncateAt.MIDDLE;
    }

    public static TextUtils.TruncateAt g(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return TextUtils.TruncateAt.START;
        }
        if (i2 != 3) {
            return i2 != 4 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE;
        }
        return TextUtils.TruncateAt.MIDDLE;
    }

    public static Typeface h(final Context context, Resources resources, mxy mxyVar, final nxl nxlVar, nuc nucVar, nsl nslVar, boolean z) {
        int iO;
        FutureTask futureTask;
        ExecutionException executionException;
        if (mxyVar.x()) {
            final String strR = mxyVar.r();
            if (mxyVar.ck()) {
                iO = mxyVar.n();
            } else {
                iO = mxyVar.cl() ? afxw.o(mxyVar.aO()) : 400;
            }
            final int iO2 = rpi.o(resources, iO);
            final boolean zT = mxyVar.t();
            if (z) {
                Typeface typefaceB = nxlVar.b(context, strR, iO2, zT);
                return typefaceB == null ? rpi.q(strR, iO2, zT) : typefaceB;
            }
            msd msdVar = new msd(strR, iO2, zT);
            Map map = c;
            synchronized (map) {
                FutureTask futureTask2 = (FutureTask) map.get(msdVar);
                if (futureTask2 == null) {
                    futureTask = new FutureTask(new Callable() { // from class: msc
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i = msf.a;
                            nxl nxlVar2 = nxlVar;
                            Context context2 = context;
                            String str = strR;
                            int i2 = iO2;
                            boolean z2 = zT;
                            Typeface typefaceB2 = nxlVar2.b(context2, str, i2, z2);
                            return typefaceB2 == null ? rpi.q(str, i2, z2) : typefaceB2;
                        }
                    });
                    map.put(msdVar, futureTask);
                } else {
                    futureTask = futureTask2;
                }
            }
            futureTask.run();
            try {
                try {
                    try {
                        return (Typeface) futureTask.get();
                    } catch (ExecutionException e) {
                        executionException = e;
                        Map map2 = c;
                        synchronized (map2) {
                            j$.util.Map.EL.remove(map2, msdVar, futureTask);
                        }
                        aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                        aslh aslhVar = aslh.LOG_TYPE_INTERNAL_ERROR;
                        aihfVarCreateBuilder.copyOnWrite();
                        asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                        asncVar.d = aslhVar.I;
                        asncVar.b |= 2;
                        aihf aihfVarCreateBuilder2 = asmy.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        asmy asmyVar = (asmy) aihfVarCreateBuilder2.instance;
                        strR.getClass();
                        asmyVar.b |= 2;
                        asmyVar.d = strR;
                        aihfVarCreateBuilder2.copyOnWrite();
                        asmy asmyVar2 = (asmy) aihfVarCreateBuilder2.instance;
                        asmyVar2.b |= 4;
                        asmyVar2.e = iO2;
                        boolean zT2 = mxyVar.t();
                        aihfVarCreateBuilder2.copyOnWrite();
                        asmy asmyVar3 = (asmy) aihfVarCreateBuilder2.instance;
                        asmyVar3.b |= 8;
                        asmyVar3.f = zT2;
                        aihfVarCreateBuilder.copyOnWrite();
                        asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
                        asmy asmyVar4 = (asmy) aihfVarCreateBuilder2.build();
                        asmyVar4.getClass();
                        asncVar2.n = asmyVar4;
                        asncVar2.b |= SemanticState.ReadOnly;
                        nucVar.g((asnc) aihfVarCreateBuilder.build(), nslVar, executionException, "Font fetching future task failed.", new Object[0]);
                        return null;
                    }
                } catch (ExecutionException e2) {
                    executionException = e2;
                }
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                aihf aihfVarCreateBuilder3 = asnc.a.createBuilder();
                aslh aslhVar2 = aslh.LOG_TYPE_INTERNAL_ERROR;
                aihfVarCreateBuilder3.copyOnWrite();
                asnc asncVar3 = (asnc) aihfVarCreateBuilder3.instance;
                asncVar3.d = aslhVar2.I;
                asncVar3.b |= 2;
                aihf aihfVarCreateBuilder4 = asmy.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                asmy asmyVar5 = (asmy) aihfVarCreateBuilder4.instance;
                strR.getClass();
                asmyVar5.b |= 2;
                asmyVar5.d = strR;
                aihfVarCreateBuilder4.copyOnWrite();
                asmy asmyVar6 = (asmy) aihfVarCreateBuilder4.instance;
                asmyVar6.b |= 4;
                asmyVar6.e = iO2;
                boolean zT3 = mxyVar.t();
                aihfVarCreateBuilder4.copyOnWrite();
                asmy asmyVar7 = (asmy) aihfVarCreateBuilder4.instance;
                asmyVar7.b |= 8;
                asmyVar7.f = zT3;
                aihfVarCreateBuilder3.copyOnWrite();
                asnc asncVar4 = (asnc) aihfVarCreateBuilder3.instance;
                asmy asmyVar8 = (asmy) aihfVarCreateBuilder4.build();
                asmyVar8.getClass();
                asncVar4.n = asmyVar8;
                asncVar4.b |= SemanticState.ReadOnly;
                nucVar.g((asnc) aihfVarCreateBuilder3.build(), nslVar, e3, "Font fetching future task interrupted.", new Object[0]);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:111:0x0203  */
    /* JADX WARN: Code duplicated, block: B:115:0x0217  */
    /* JADX WARN: Code duplicated, block: B:167:0x0402  */
    /* JADX WARN: Code duplicated, block: B:172:0x0423  */
    /* JADX WARN: Code duplicated, block: B:175:0x0440  */
    /* JADX WARN: Code duplicated, block: B:177:0x0443  */
    /* JADX WARN: Code duplicated, block: B:178:0x0458  */
    /* JADX WARN: Code duplicated, block: B:181:0x0472  */
    /* JADX WARN: Code duplicated, block: B:183:0x047e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0486  */
    /* JADX WARN: Code duplicated, block: B:187:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:189:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:190:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:192:0x0509  */
    /* JADX WARN: Code duplicated, block: B:200:0x0532 A[Catch: aiik -> 0x054a, TryCatch #5 {aiik -> 0x054a, blocks: (B:195:0x051d, B:198:0x052c, B:200:0x0532, B:203:0x0549, B:197:0x0529), top: B:374:0x051d, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:310:0x082f A[PHI: r1
      0x082f: PHI (r1v14 int) = (r1v13 int), (r1v26 int) binds: [B:306:0x0824, B:308:0x082a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:323:0x0859  */
    /* JADX WARN: Code duplicated, block: B:355:0x090f  */
    /* JADX WARN: Code duplicated, block: B:386:0x05b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x018d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0194  */
    /* JADX WARN: Code duplicated, block: B:81:0x019c  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:87:0x01af  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static CharSequence i(nsl nslVar, Context context, mxc mxcVar, nry nryVar, nxl nxlVar, nuc nucVar, Map map, nte nteVar, omj omjVar, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        int i2;
        nuc nucVar2;
        String str;
        int i3;
        int iJ;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        mro mroVarA;
        int iBu;
        Float fValueOf;
        mxy mxyVar;
        Resources resources;
        String str2;
        FutureTask futureTask;
        nsl nslVar2;
        nuc nucVar3;
        ExecutionException executionException;
        Typeface typeface;
        int iF;
        int iE;
        int iD;
        mxz mxzVarQ;
        int[] iArrAG;
        int length;
        int i9;
        int i10;
        Pair pair;
        agke agkeVarAF;
        int size;
        int i11;
        agke agkeVar;
        Pair pair2;
        Object objB;
        String strA;
        String str3;
        mxy mxyVar2;
        float fCe;
        float fO;
        float f;
        float fCf;
        float fCd;
        float fCa;
        float fCc;
        float f2;
        float fFloatValue;
        omj omjVar2;
        nuc nucVar4 = nucVar;
        if (mxcVar != null) {
            omj omjVar3 = new omj(nucVar4);
            String strU = mxcVar.u();
            if (!TextUtils.isEmpty(strU)) {
                boolean z5 = false;
                CharSequence charSequenceF = (z && men.b) ? bll.b().f(strU, 0, strU.length(), Alert.DURATION_SHOW_INDEFINITELY) : strU;
                if (mxcVar.m() == 0 && mxcVar.i() == 0 && mxcVar.l() == 0 && mxcVar.h() == 0 && mxcVar.j() == 0 && mxcVar.k() == 0 && !mxcVar.A()) {
                    return charSequenceF;
                }
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequenceF);
                Resources resources2 = context.getResources();
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                int i12 = 0;
                while (i12 < mxcVar.i()) {
                    mxe mxeVarO = mxcVar.o(i12);
                    if (mxeVarO.n() || mxeVarO.m()) {
                        omjVar2 = omjVar3;
                        rpi.s(spannableStringValueOf, new mrn(mxeVarO, nryVar, omjVar2, nslVar.x, nslVar), mxeVarO.h(), mxeVarO.l(), mxeVarO.g());
                    } else {
                        omjVar2 = omjVar3;
                    }
                    i12++;
                    omjVar3 = omjVar2;
                }
                int i13 = 0;
                while (true) {
                    int i14 = 2;
                    if (i13 >= mxcVar.m()) {
                        nuc nucVar5 = nucVar4;
                        Resources resources3 = resources2;
                        for (int i15 = 0; i15 < mxcVar.j(); i15++) {
                            mxf mxfVarP = mxcVar.p(i15);
                            if (mxfVarP != null) {
                                if (mxfVarP.h()) {
                                    myb mybVarG = mxfVarP.g();
                                    mep mepVar = nby.W;
                                    if (mybVarG.e(mepVar)) {
                                        nby nbyVar = (nby) mxfVarP.g().d(mepVar);
                                        rpi.s(spannableStringValueOf, new mrz(nbyVar.l(), TypedValue.applyDimension(1, nbyVar.g(), displayMetrics), new RectF(TypedValue.applyDimension(1, nbyVar.i(), displayMetrics), TypedValue.applyDimension(1, nbyVar.k(), displayMetrics), TypedValue.applyDimension(1, nbyVar.j(), displayMetrics), TypedValue.applyDimension(1, nbyVar.h(), displayMetrics)), nucVar5), nbyVar.n(), true, nbyVar.m());
                                    }
                                }
                                if (z2 && mxfVarP.h()) {
                                    myb mybVarG2 = mxfVarP.g();
                                    mep mepVar2 = ncb.X;
                                    if (mybVarG2.e(mepVar2)) {
                                        ncb ncbVar = (ncb) mxfVarP.g().d(mepVar2);
                                        rpi.s(spannableStringValueOf, new msa(qnl.bs(resources3), TypedValue.applyDimension(1, ncbVar.cf(), displayMetrics), TypedValue.applyDimension(1, ncbVar.g(), displayMetrics)), 0, false, 0);
                                    }
                                }
                                if (z3 && mxfVarP.h()) {
                                    myb mybVarG3 = mxfVarP.g();
                                    mep mepVar3 = nfl.am;
                                    if (mybVarG3.e(mepVar3)) {
                                        nfl nflVar = (nfl) mxfVarP.g().d(mepVar3);
                                        rpi.s(spannableStringValueOf, new msg(nflVar.g(), nflVar.h()), 0, false, 0);
                                    }
                                }
                            }
                        }
                        for (int i16 = 0; i16 < mxcVar.l(); i16++) {
                            mxx mxxVarS = mxcVar.s(i16);
                            if (mxxVarS.k() && mxxVarS.i().V() == 2) {
                                ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringValueOf.getSpans(mxxVarS.h(), mxxVarS.g(), ForegroundColorSpan.class);
                                rpi.s(spannableStringValueOf, foregroundColorSpanArr.length > 0 ? new BulletSpan(20, foregroundColorSpanArr[0].getForegroundColor()) : new BulletSpan(20), mxxVarS.h(), mxxVarS.j(), mxxVarS.g());
                            }
                        }
                        for (int i17 = 0; i17 < mxcVar.k(); i17++) {
                            mxv mxvVarR = mxcVar.r(i17);
                            if (mxvVarR.j()) {
                                spannableStringValueOf.setSpan(new LocaleSpan(Locale.forLanguageTag(mxvVarR.i())), mxvVarR.h(), mxvVarR.h() + mxvVarR.g(), 17);
                            }
                        }
                        int i18 = 0;
                        while (i18 < mxcVar.h()) {
                            mxb mxbVarN = mxcVar.n(i18);
                            if (nteVar == 0 || nteVar.equals(nte.a)) {
                                i2 = i18;
                                nucVar2 = nucVar5;
                                str = strU;
                                spannableStringValueOf = spannableStringValueOf;
                                nucVar2.c(aslh.LOG_TYPE_CONFIGURATION_ERROR, nslVar, "Has attachmentRuns but drawableRequester is missing.", new Object[0]);
                            } else {
                                int iRound = Math.round(TypedValue.applyDimension(2, 14.0f, resources3.getDisplayMetrics()));
                                int iH = mxbVarN.h();
                                int iG = mxbVarN.g();
                                if (iG == 0) {
                                    nucVar5.c(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar, "AttachmentRun with 0 length found. This probably means the AttributedString hasn't been adjusted to account for zero-length (inserted) AttachmentRun's.", new Object[0]);
                                } else if (mxbVarN.j()) {
                                    nay nayVarI = mxbVarN.i();
                                    if (nayVarI.n()) {
                                        nff nffVarJ = nayVarI.j();
                                        mep mepVar4 = ncq.Z;
                                        if (nffVarJ.e(mepVar4)) {
                                            ncq ncqVar = (ncq) nffVarJ.d(mepVar4);
                                            int iK = mxbVarN.k();
                                            if (ncqVar.p()) {
                                                String str4 = strU;
                                                nci nciVarM = ncqVar.m();
                                                nds ndsVarI = nayVarI.m() ? nayVarI.i() : nnb.a;
                                                mep mepVar5 = ndn.ae;
                                                ndn ndnVar = ndsVarI.e(mepVar5) ? (ndn) ndsVarI.d(mepVar5) : nmt.a;
                                                nal nalVarS = ndnVar.cm() ? ndnVar.s() : null;
                                                nal nalVarN = ndnVar.y() ? ndnVar.n() : null;
                                                i2 = i18;
                                                DisplayMetrics displayMetrics2 = resources3.getDisplayMetrics();
                                                if (nalVarS != null) {
                                                    i3 = iRound;
                                                    if (nalVarS.i() == 2 && nalVarS.co() > 0.0f) {
                                                        iJ = qnl.bu(nalVarS.co(), displayMetrics2);
                                                    }
                                                    if (iJ <= 0 || (iJ = rpi.j(spannableStringValueOf, iH)) > 0) {
                                                        i4 = iJ;
                                                    } else {
                                                        i4 = i3;
                                                    }
                                                    if (nalVarN == null && qnl.by(nalVarN)) {
                                                        int i19 = nalVarN.i() - 1;
                                                        if (i19 == 1) {
                                                            iBu = qnl.bu(nalVarN.co(), displayMetrics2);
                                                        } else if (i19 != 2 || (iBu = (int) (nalVarN.co() * i4)) < 0) {
                                                            i5 = i4;
                                                        }
                                                        i5 = iBu;
                                                    } else {
                                                        i5 = i4;
                                                    }
                                                    if (i4 >= 0 || i5 < 0) {
                                                        nucVar2 = nucVar5;
                                                        spannableStringValueOf = spannableStringValueOf;
                                                        str = str4;
                                                        nucVar2.c(aslh.LOG_TYPE_INVALID_FIELD, nslVar, "Attachment run requires widthDimension and heightDimension in LayoutProperties.", new Object[0]);
                                                    } else {
                                                        if (ndnVar.z()) {
                                                            i6 = i4;
                                                            DisplayMetrics displayMetrics3 = resources3.getDisplayMetrics();
                                                            nak nakVarJ = ndnVar.j();
                                                            int iBv = qnl.bv(displayMetrics3, nakVarJ.k());
                                                            int iBv2 = qnl.bv(displayMetrics3, nakVarJ.n());
                                                            int iBv3 = qnl.bv(displayMetrics3, nakVarJ.l());
                                                            int iBv4 = qnl.bv(displayMetrics3, nakVarJ.h());
                                                            int iBv5 = qnl.bv(displayMetrics3, nakVarJ.m());
                                                            int iBv6 = qnl.bv(displayMetrics3, nakVarJ.i());
                                                            if (iBv5 >= 0 || iBv6 >= 0) {
                                                                if (qnl.bs(resources3)) {
                                                                    if (iBv5 >= 0) {
                                                                        iBv3 = iBv5;
                                                                    }
                                                                    if (iBv6 >= 0) {
                                                                        iBv = iBv6;
                                                                    }
                                                                } else {
                                                                    if (iBv5 >= 0) {
                                                                        iBv = iBv5;
                                                                    }
                                                                    if (iBv6 >= 0) {
                                                                        i7 = iBv6;
                                                                        i8 = iBv;
                                                                    }
                                                                }
                                                                i8 = iBv;
                                                                i7 = iBv3;
                                                            } else {
                                                                i8 = iBv;
                                                                i7 = iBv3;
                                                            }
                                                            mroVarA = mro.a(i6, i5, i8, iBv2, i7, iBv4);
                                                        } else {
                                                            i6 = i4;
                                                            mroVarA = mro.a(i6, i5, 0, 0, 0, 0);
                                                        }
                                                        mro mroVar = mroVarA;
                                                        nuc nucVar6 = nucVar5;
                                                        str = str4;
                                                        nteVar.b(context, nciVarM, ncqVar.n() ? ncqVar.k() : null, ncqVar.o() ? ncqVar.l() : null, omjVar, i6, i5, mroVar, nucVar6);
                                                        nucVar2 = nucVar6;
                                                        rpi.s(spannableStringValueOf, new mrm(mroVar, iK), iH, true, iG);
                                                    }
                                                } else {
                                                    i3 = iRound;
                                                }
                                                iJ = -1;
                                                if (iJ <= 0) {
                                                    i4 = iJ;
                                                } else {
                                                    i4 = iJ;
                                                }
                                                if (nalVarN == null) {
                                                    i5 = i4;
                                                } else {
                                                    i5 = i4;
                                                }
                                                if (i4 >= 0) {
                                                    nucVar2 = nucVar5;
                                                    spannableStringValueOf = spannableStringValueOf;
                                                    str = str4;
                                                    nucVar2.c(aslh.LOG_TYPE_INVALID_FIELD, nslVar, "Attachment run requires widthDimension and heightDimension in LayoutProperties.", new Object[0]);
                                                } else {
                                                    nucVar2 = nucVar5;
                                                    spannableStringValueOf = spannableStringValueOf;
                                                    str = str4;
                                                    nucVar2.c(aslh.LOG_TYPE_INVALID_FIELD, nslVar, "Attachment run requires widthDimension and heightDimension in LayoutProperties.", new Object[0]);
                                                }
                                            } else {
                                                nucVar5.c(aslh.LOG_TYPE_MISSING_FIELD, nslVar, "Image of ImageType missing in Attachment", new Object[0]);
                                            }
                                        } else {
                                            nucVar5.c(aslh.LOG_TYPE_INVALID_FIELD, nslVar, "Attachment run doesn't contain ImageType extension", new Object[0]);
                                        }
                                    } else {
                                        nucVar5.c(aslh.LOG_TYPE_MISSING_FIELD, nslVar, "AttachmentRun contains element with no type", new Object[0]);
                                    }
                                } else {
                                    nucVar5.c(aslh.LOG_TYPE_MISSING_FIELD, nslVar, "Element missing in AttachmentRun", new Object[0]);
                                }
                                i2 = i18;
                                nucVar2 = nucVar5;
                                str = strU;
                                spannableStringValueOf = spannableStringValueOf;
                            }
                            i18 = i2 + 1;
                            strU = str;
                            spannableStringValueOf = spannableStringValueOf;
                            displayMetrics = displayMetrics;
                            nucVar5 = nucVar2;
                        }
                        String str5 = strU;
                        SpannableString spannableString = spannableStringValueOf;
                        DisplayMetrics displayMetrics4 = displayMetrics;
                        if (mxcVar.A() && mxcVar.q().co() > 0.0f) {
                            rpi.s(spannableString, new mrq(TypedValue.applyDimension(2, mxcVar.q().co(), displayMetrics4)), 0, true, str5.length());
                        }
                        return spannableString;
                    }
                    mxy mxyVarT = mxcVar.t(i13);
                    if (mxyVarT.k() != 0) {
                        rpi.s(spannableStringValueOf, new ForegroundColorSpan(mxyVarT.k()), mxyVarT.m(), mxyVarT.z(), mxyVarT.l());
                    }
                    if (mxyVarT.h() == 0.0f && i == 0) {
                        fValueOf = null;
                    } else {
                        float fH = i == 0 ? mxyVarT.h() : i;
                        fValueOf = Float.valueOf(fH);
                        int i20 = mxyVarT.C() == 2 ? 1 : 2;
                        fValueOf.getClass();
                        rpi.s(spannableStringValueOf, new AbsoluteSizeSpan(Math.round(TypedValue.applyDimension(i20, fH, resources2.getDisplayMetrics())), z5), mxyVarT.m(), mxyVarT.z(), mxyVarT.l());
                    }
                    if (mxyVarT.j() != 0) {
                        rpi.s(spannableStringValueOf, new mrz(mxyVarT.j(), mxyVarT.g(), null, nucVar4), mxyVarT.m(), mxyVarT.z(), mxyVarT.l());
                    }
                    if (mxyVarT.x()) {
                        String strR = mxyVarT.r();
                        int iD2 = nxlVar.d(strR);
                        Boolean bool = nya.b;
                        if (nya.a || iD2 == 1 || !mxyVarT.x()) {
                            strA = null;
                        } else if (mxyVarT.v()) {
                            mxk mxkVarP = mxyVarT.p();
                            if (mxkVarP.ck()) {
                                fCe = mxkVarP.ce();
                            } else {
                                if (mxkVarP.cl()) {
                                    fO = afxw.o(mxkVarP.aO());
                                } else {
                                    fCe = 400.0f;
                                }
                                float fO2 = rpi.o(resources2, (int) fO);
                                if (mxkVarP.cm()) {
                                    fCf = mxkVarP.cf();
                                } else {
                                    if (mxkVarP.cn()) {
                                        switch (mxkVarP.aP() - 1) {
                                            case 1:
                                                fCf = 50.0f;
                                                break;
                                            case 2:
                                                fCf = 62.5f;
                                                break;
                                            case 3:
                                                fCf = 75.0f;
                                                break;
                                            case 4:
                                                fCf = 87.5f;
                                                break;
                                            case 6:
                                                fCf = 112.5f;
                                                break;
                                            case 7:
                                                fCf = 125.0f;
                                                break;
                                            case 8:
                                                fCf = 150.0f;
                                                break;
                                            case 9:
                                                fCf = 200.0f;
                                                break;
                                        }
                                        if (mxkVarP.cj()) {
                                            fCd = mxkVarP.cd();
                                        } else {
                                            fCd = 0.0f;
                                        }
                                        if (mxkVarP.cg()) {
                                            fCa = mxkVarP.ca();
                                        } else {
                                            fCa = 0.0f;
                                        }
                                        if (mxkVarP.ci()) {
                                            fCc = mxkVarP.cc();
                                        } else {
                                            fCc = 0.0f;
                                        }
                                        if (mxkVarP.ch()) {
                                            fFloatValue = mxkVarP.cb();
                                        } else {
                                            if (fValueOf != null) {
                                                fFloatValue = fValueOf.floatValue();
                                            } else {
                                                f2 = 0.0f;
                                            }
                                            strA = oxq.b(fO2, f, fCd, fCa, fCc, f2);
                                        }
                                        f2 = fFloatValue;
                                        strA = oxq.b(fO2, f, fCd, fCa, fCc, f2);
                                    }
                                    f = 100.0f;
                                    if (mxkVarP.cj()) {
                                        fCd = mxkVarP.cd();
                                    } else {
                                        fCd = 0.0f;
                                    }
                                    if (mxkVarP.cg()) {
                                        fCa = mxkVarP.ca();
                                    } else {
                                        fCa = 0.0f;
                                    }
                                    if (mxkVarP.ci()) {
                                        fCc = mxkVarP.cc();
                                    } else {
                                        fCc = 0.0f;
                                    }
                                    if (mxkVarP.ch()) {
                                        fFloatValue = mxkVarP.cb();
                                    } else {
                                        if (fValueOf != null) {
                                            fFloatValue = fValueOf.floatValue();
                                        } else {
                                            f2 = 0.0f;
                                        }
                                        strA = oxq.b(fO2, f, fCd, fCa, fCc, f2);
                                    }
                                    f2 = fFloatValue;
                                    strA = oxq.b(fO2, f, fCd, fCa, fCc, f2);
                                }
                                f = fCf;
                                if (mxkVarP.cj()) {
                                    fCd = mxkVarP.cd();
                                } else {
                                    fCd = 0.0f;
                                }
                                if (mxkVarP.cg()) {
                                    fCa = mxkVarP.ca();
                                } else {
                                    fCa = 0.0f;
                                }
                                if (mxkVarP.ci()) {
                                    fCc = mxkVarP.cc();
                                } else {
                                    fCc = 0.0f;
                                }
                                if (mxkVarP.ch()) {
                                    fFloatValue = mxkVarP.cb();
                                } else {
                                    if (fValueOf != null) {
                                        fFloatValue = fValueOf.floatValue();
                                    } else {
                                        f2 = 0.0f;
                                    }
                                    strA = oxq.b(fO2, f, fCd, fCa, fCc, f2);
                                }
                                f2 = fFloatValue;
                                strA = oxq.b(fO2, f, fCd, fCa, fCc, f2);
                            }
                            fO = fCe;
                            float fO3 = rpi.o(resources2, (int) fO);
                            if (mxkVarP.cm()) {
                                fCf = mxkVarP.cf();
                            } else {
                                if (mxkVarP.cn()) {
                                    switch (mxkVarP.aP() - 1) {
                                        case 1:
                                            fCf = 50.0f;
                                            break;
                                        case 2:
                                            fCf = 62.5f;
                                            break;
                                        case 3:
                                            fCf = 75.0f;
                                            break;
                                        case 4:
                                            fCf = 87.5f;
                                            break;
                                        case 6:
                                            fCf = 112.5f;
                                            break;
                                        case 7:
                                            fCf = 125.0f;
                                            break;
                                        case 8:
                                            fCf = 150.0f;
                                            break;
                                        case 9:
                                            fCf = 200.0f;
                                            break;
                                    }
                                    if (mxkVarP.cj()) {
                                        fCd = mxkVarP.cd();
                                    } else {
                                        fCd = 0.0f;
                                    }
                                    if (mxkVarP.cg()) {
                                        fCa = mxkVarP.ca();
                                    } else {
                                        fCa = 0.0f;
                                    }
                                    if (mxkVarP.ci()) {
                                        fCc = mxkVarP.cc();
                                    } else {
                                        fCc = 0.0f;
                                    }
                                    if (mxkVarP.ch()) {
                                        fFloatValue = mxkVarP.cb();
                                    } else {
                                        if (fValueOf != null) {
                                            fFloatValue = fValueOf.floatValue();
                                        } else {
                                            f2 = 0.0f;
                                        }
                                        strA = oxq.b(fO3, f, fCd, fCa, fCc, f2);
                                    }
                                    f2 = fFloatValue;
                                    strA = oxq.b(fO3, f, fCd, fCa, fCc, f2);
                                }
                                f = 100.0f;
                                if (mxkVarP.cj()) {
                                    fCd = mxkVarP.cd();
                                } else {
                                    fCd = 0.0f;
                                }
                                if (mxkVarP.cg()) {
                                    fCa = mxkVarP.ca();
                                } else {
                                    fCa = 0.0f;
                                }
                                if (mxkVarP.ci()) {
                                    fCc = mxkVarP.cc();
                                } else {
                                    fCc = 0.0f;
                                }
                                if (mxkVarP.ch()) {
                                    fFloatValue = mxkVarP.cb();
                                } else {
                                    if (fValueOf != null) {
                                        fFloatValue = fValueOf.floatValue();
                                    } else {
                                        f2 = 0.0f;
                                    }
                                    strA = oxq.b(fO3, f, fCd, fCa, fCc, f2);
                                }
                                f2 = fFloatValue;
                                strA = oxq.b(fO3, f, fCd, fCa, fCc, f2);
                            }
                            f = fCf;
                            if (mxkVarP.cj()) {
                                fCd = mxkVarP.cd();
                            } else {
                                fCd = 0.0f;
                            }
                            if (mxkVarP.cg()) {
                                fCa = mxkVarP.ca();
                            } else {
                                fCa = 0.0f;
                            }
                            if (mxkVarP.ci()) {
                                fCc = mxkVarP.cc();
                            } else {
                                fCc = 0.0f;
                            }
                            if (mxkVarP.ch()) {
                                fFloatValue = mxkVarP.cb();
                            } else {
                                if (fValueOf != null) {
                                    fFloatValue = fValueOf.floatValue();
                                } else {
                                    f2 = 0.0f;
                                }
                                strA = oxq.b(fO3, f, fCd, fCa, fCc, f2);
                            }
                            f2 = fFloatValue;
                            strA = oxq.b(fO3, f, fCd, fCa, fCc, f2);
                        } else if (fValueOf != null) {
                            strA = oxq.a(fValueOf.floatValue());
                        } else {
                            strA = null;
                        }
                        if (iD2 != 2) {
                            str3 = null;
                            mxyVar2 = mxyVarT;
                        } else {
                            str3 = strA;
                            mxyVar2 = mxyVarT;
                        }
                        Typeface typefaceH = h(context, resources2, mxyVar2, nxlVar, nucVar4, nslVar, z4);
                        mxyVar = mxyVar2;
                        if (typefaceH == null && str3 == null) {
                            rpi.s(spannableStringValueOf, new TypefaceSpan(strR), mxyVar.m(), mxyVar.z(), mxyVar.l());
                        } else {
                            rpi.s(spannableStringValueOf, new nys(strR, typefaceH, str3), mxyVar.m(), mxyVar.z(), mxyVar.l());
                        }
                    } else {
                        i14 = 2;
                        resources2 = resources2;
                        mxyVar = mxyVarT;
                        if (mxyVar.y()) {
                            String strS = mxyVar.s();
                            mse mseVar = new mse(strS, a(resources2));
                            Map map2 = b;
                            synchronized (map2) {
                                FutureTask futureTask2 = (FutureTask) map2.get(mseVar);
                                if (futureTask2 == null) {
                                    str2 = null;
                                    resources = resources2;
                                    futureTask2 = new FutureTask(new hql(nxlVar, context, strS, resources2, 2));
                                    map2.put(mseVar, futureTask2);
                                } else {
                                    resources = resources2;
                                    str2 = null;
                                }
                                futureTask = futureTask2;
                            }
                            futureTask.run();
                            try {
                                try {
                                    try {
                                        nslVar2 = nslVar;
                                        nucVar3 = nucVar;
                                        strS = strS;
                                        typeface = (Typeface) futureTask.get();
                                    } catch (ExecutionException e) {
                                        executionException = e;
                                        Map map3 = b;
                                        synchronized (map3) {
                                            j$.util.Map.EL.remove(map3, mseVar, futureTask);
                                        }
                                        aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                                        aslh aslhVar = aslh.LOG_TYPE_INTERNAL_ERROR;
                                        aihfVarCreateBuilder.copyOnWrite();
                                        asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                                        asncVar.d = aslhVar.I;
                                        asncVar.b |= 2;
                                        aihf aihfVarCreateBuilder2 = asmy.a.createBuilder();
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        asmy asmyVar = (asmy) aihfVarCreateBuilder2.instance;
                                        strS.getClass();
                                        asmyVar.b |= 2;
                                        asmyVar.d = strS;
                                        aihfVarCreateBuilder.copyOnWrite();
                                        asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
                                        asmy asmyVar2 = (asmy) aihfVarCreateBuilder2.build();
                                        asmyVar2.getClass();
                                        asncVar2.n = asmyVar2;
                                        asncVar2.b |= SemanticState.ReadOnly;
                                        nslVar2 = nslVar;
                                        nucVar.g((asnc) aihfVarCreateBuilder.build(), nslVar2, executionException, "Font fetching future task failed.", new Object[0]);
                                        nucVar3 = nucVar;
                                        typeface = str2;
                                    }
                                } catch (ExecutionException e2) {
                                    executionException = e2;
                                }
                            } catch (InterruptedException e3) {
                                Thread.currentThread().interrupt();
                                aihf aihfVarCreateBuilder3 = asnc.a.createBuilder();
                                aslh aslhVar2 = aslh.LOG_TYPE_INTERNAL_ERROR;
                                aihfVarCreateBuilder3.copyOnWrite();
                                asnc asncVar3 = (asnc) aihfVarCreateBuilder3.instance;
                                asncVar3.d = aslhVar2.I;
                                asncVar3.b |= 2;
                                aihf aihfVarCreateBuilder4 = asmy.a.createBuilder();
                                aihfVarCreateBuilder4.copyOnWrite();
                                asmy asmyVar3 = (asmy) aihfVarCreateBuilder4.instance;
                                strS.getClass();
                                asmyVar3.b |= 2;
                                asmyVar3.d = strS;
                                aihfVarCreateBuilder3.copyOnWrite();
                                asnc asncVar4 = (asnc) aihfVarCreateBuilder3.instance;
                                asmy asmyVar4 = (asmy) aihfVarCreateBuilder4.build();
                                asmyVar4.getClass();
                                asncVar4.n = asmyVar4;
                                asncVar4.b |= SemanticState.ReadOnly;
                                nslVar2 = nslVar;
                                strS = strS;
                                nucVar.g((asnc) aihfVarCreateBuilder3.build(), nslVar2, e3, "Font fetching future task interrupted.", new Object[0]);
                                nucVar3 = nucVar;
                                typeface = str2;
                            }
                            if (typeface == 0) {
                                rpi.s(spannableStringValueOf, new TypefaceSpan(strS), mxyVar.m(), mxyVar.z(), mxyVar.l());
                            } else {
                                rpi.s(spannableStringValueOf, new nys(strS, typeface, str2), mxyVar.m(), mxyVar.z(), mxyVar.l());
                            }
                        }
                        iF = mxyVar.F() - 1;
                        if (iF != i14 || iF == 3) {
                            rpi.s(spannableStringValueOf, new UnderlineSpan(), mxyVar.m(), mxyVar.z(), mxyVar.l());
                        } else if (iF == 4) {
                            rpi.s(spannableStringValueOf, new mrp(resources.getDisplayMetrics(), mxyVar.k()), mxyVar.m(), mxyVar.z(), mxyVar.l());
                        }
                        iE = mxyVar.E() - 1;
                        if (iE != 2 || iE == 3 || iE == 4) {
                            rpi.s(spannableStringValueOf, new StrikethroughSpan(), mxyVar.m(), mxyVar.z(), mxyVar.l());
                        }
                        iD = mxyVar.D() - 1;
                        if (iD != 1) {
                            rpi.s(spannableStringValueOf, new SubscriptSpan(), mxyVar.m(), mxyVar.z(), mxyVar.l());
                        } else if (iD == 2) {
                            rpi.s(spannableStringValueOf, new SuperscriptSpan(), mxyVar.m(), mxyVar.z(), mxyVar.l());
                        }
                        if (mxyVar.B()) {
                            mxzVarQ = mxyVar.q();
                            iArrAG = ksy.aG(mxzVarQ);
                            length = iArrAG.length;
                            i9 = 0;
                            while (i9 < length) {
                                i10 = iArrAG[i9];
                                if (mer.a(i10)) {
                                    aihf aihfVarCreateBuilder5 = asnc.a.createBuilder();
                                    aslh aslhVar3 = aslh.LOG_TYPE_WIRE_FORMAT_ERROR;
                                    aihfVarCreateBuilder5.copyOnWrite();
                                    asnc asncVar5 = (asnc) aihfVarCreateBuilder5.instance;
                                    asncVar5.d = aslhVar3.I;
                                    asncVar5.b |= 2;
                                    aihfVarCreateBuilder5.cC(i10);
                                    nucVar3.d((asnc) aihfVarCreateBuilder5.build(), nslVar2, "TextComponentSpec: extension with unsupported format.", new Object[0]);
                                } else {
                                    pair = (Pair) map.get(Integer.valueOf(i10));
                                    if (pair == null) {
                                        aihf aihfVarCreateBuilder6 = asnc.a.createBuilder();
                                        aslh aslhVar4 = aslh.LOG_TYPE_UNKNOWN_EXTENSION;
                                        aihfVarCreateBuilder6.copyOnWrite();
                                        asnc asncVar6 = (asnc) aihfVarCreateBuilder6.instance;
                                        asncVar6.d = aslhVar4.I;
                                        asncVar6.b |= 2;
                                        aihfVarCreateBuilder6.cC(i10);
                                        nucVar3.d((asnc) aihfVarCreateBuilder6.build(), nslVar2, "TextComponentSpec: No converter for extension.", new Object[0]);
                                    } else {
                                        i9 = i9;
                                        agkeVarAF = ksy.aF(mxzVarQ, i10);
                                        size = agkeVarAF.size();
                                        i11 = 0;
                                        while (i11 < size) {
                                            ByteBuffer byteBuffer = (ByteBuffer) agkeVarAF.get(i11);
                                            try {
                                                nws nwsVar = (nws) pair.first;
                                                aiix aiixVar = (aiix) pair.second;
                                                agkeVar = agkeVarAF;
                                                try {
                                                    ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                                                    aigm aigmVarU = aigm.U(byteBuffer);
                                                    aiixVar.f(aigmVarU, generatedRegistry);
                                                    try {
                                                        aigmVarU.z(0);
                                                        objB = nwsVar.b();
                                                        if (objB != null) {
                                                            rpi.s(spannableStringValueOf, objB, mxyVar.m(), mxyVar.z(), mxyVar.l());
                                                        }
                                                        nslVar2 = nslVar;
                                                        pair2 = pair;
                                                    } catch (aiik e4) {
                                                        throw e4;
                                                    }
                                                } catch (aiik e5) {
                                                    e = e5;
                                                    aiik aiikVar = e;
                                                    aihf aihfVarCreateBuilder7 = asnc.a.createBuilder();
                                                    aslh aslhVar5 = aslh.LOG_TYPE_WIRE_FORMAT_ERROR;
                                                    aihfVarCreateBuilder7.copyOnWrite();
                                                    asnc asncVar7 = (asnc) aihfVarCreateBuilder7.instance;
                                                    asncVar7.d = aslhVar5.I;
                                                    asncVar7.b |= 2;
                                                    aihfVarCreateBuilder7.cC(i10);
                                                    nslVar2 = nslVar;
                                                    pair2 = pair;
                                                    nucVar.g((asnc) aihfVarCreateBuilder7.build(), nslVar2, aiikVar, "Failed to set PB Style Run Extension in TextComponentSpec.", new Object[0]);
                                                    nucVar3 = nucVar;
                                                }
                                            } catch (aiik e6) {
                                                e = e6;
                                                agkeVar = agkeVarAF;
                                            }
                                            i11++;
                                            i10 = i10;
                                            pair = pair2;
                                            agkeVarAF = agkeVar;
                                        }
                                    }
                                    i9++;
                                    mxzVarQ = mxzVarQ;
                                    iArrAG = iArrAG;
                                }
                                i9++;
                                mxzVarQ = mxzVarQ;
                                iArrAG = iArrAG;
                            }
                        }
                        if (mxyVar.i() != 0.0f) {
                            rpi.s(spannableStringValueOf, new nyt(mxyVar.i()), mxyVar.m(), mxyVar.z(), mxyVar.l());
                        }
                        i13++;
                        nucVar4 = nucVar3;
                        resources2 = resources;
                        z5 = false;
                    }
                    nslVar2 = nslVar;
                    nucVar3 = nucVar;
                    resources = resources2;
                    mxyVar = mxyVar;
                    iF = mxyVar.F() - 1;
                    if (iF != i14) {
                        rpi.s(spannableStringValueOf, new UnderlineSpan(), mxyVar.m(), mxyVar.z(), mxyVar.l());
                    } else {
                        rpi.s(spannableStringValueOf, new UnderlineSpan(), mxyVar.m(), mxyVar.z(), mxyVar.l());
                    }
                    iE = mxyVar.E() - 1;
                    if (iE != 2) {
                        rpi.s(spannableStringValueOf, new StrikethroughSpan(), mxyVar.m(), mxyVar.z(), mxyVar.l());
                    } else {
                        rpi.s(spannableStringValueOf, new StrikethroughSpan(), mxyVar.m(), mxyVar.z(), mxyVar.l());
                    }
                    iD = mxyVar.D() - 1;
                    if (iD != 1) {
                        rpi.s(spannableStringValueOf, new SubscriptSpan(), mxyVar.m(), mxyVar.z(), mxyVar.l());
                    } else if (iD == 2) {
                        rpi.s(spannableStringValueOf, new SuperscriptSpan(), mxyVar.m(), mxyVar.z(), mxyVar.l());
                    }
                    if (mxyVar.B()) {
                        mxzVarQ = mxyVar.q();
                        iArrAG = ksy.aG(mxzVarQ);
                        length = iArrAG.length;
                        i9 = 0;
                        while (i9 < length) {
                            i10 = iArrAG[i9];
                            if (mer.a(i10)) {
                                aihf aihfVarCreateBuilder8 = asnc.a.createBuilder();
                                aslh aslhVar6 = aslh.LOG_TYPE_WIRE_FORMAT_ERROR;
                                aihfVarCreateBuilder8.copyOnWrite();
                                asnc asncVar8 = (asnc) aihfVarCreateBuilder8.instance;
                                asncVar8.d = aslhVar6.I;
                                asncVar8.b |= 2;
                                aihfVarCreateBuilder8.cC(i10);
                                nucVar3.d((asnc) aihfVarCreateBuilder8.build(), nslVar2, "TextComponentSpec: extension with unsupported format.", new Object[0]);
                            } else {
                                pair = (Pair) map.get(Integer.valueOf(i10));
                                if (pair == null) {
                                    aihf aihfVarCreateBuilder9 = asnc.a.createBuilder();
                                    aslh aslhVar7 = aslh.LOG_TYPE_UNKNOWN_EXTENSION;
                                    aihfVarCreateBuilder9.copyOnWrite();
                                    asnc asncVar9 = (asnc) aihfVarCreateBuilder9.instance;
                                    asncVar9.d = aslhVar7.I;
                                    asncVar9.b |= 2;
                                    aihfVarCreateBuilder9.cC(i10);
                                    nucVar3.d((asnc) aihfVarCreateBuilder9.build(), nslVar2, "TextComponentSpec: No converter for extension.", new Object[0]);
                                } else {
                                    i9 = i9;
                                    agkeVarAF = ksy.aF(mxzVarQ, i10);
                                    size = agkeVarAF.size();
                                    i11 = 0;
                                    while (i11 < size) {
                                        ByteBuffer byteBuffer2 = (ByteBuffer) agkeVarAF.get(i11);
                                        nws nwsVar2 = (nws) pair.first;
                                        aiix aiixVar2 = (aiix) pair.second;
                                        agkeVar = agkeVarAF;
                                        ExtensionRegistryLite generatedRegistry2 = ExtensionRegistryLite.getGeneratedRegistry();
                                        aigm aigmVarU2 = aigm.U(byteBuffer2);
                                        aiixVar2.f(aigmVarU2, generatedRegistry2);
                                        aigmVarU2.z(0);
                                        objB = nwsVar2.b();
                                        if (objB != null) {
                                            rpi.s(spannableStringValueOf, objB, mxyVar.m(), mxyVar.z(), mxyVar.l());
                                        }
                                        nslVar2 = nslVar;
                                        pair2 = pair;
                                        i11++;
                                        i10 = i10;
                                        pair = pair2;
                                        agkeVarAF = agkeVar;
                                    }
                                }
                                i9++;
                                mxzVarQ = mxzVarQ;
                                iArrAG = iArrAG;
                            }
                            i9++;
                            mxzVarQ = mxzVarQ;
                            iArrAG = iArrAG;
                        }
                    }
                    if (mxyVar.i() != 0.0f) {
                        rpi.s(spannableStringValueOf, new nyt(mxyVar.i()), mxyVar.m(), mxyVar.z(), mxyVar.l());
                    }
                    i13++;
                    nucVar4 = nucVar3;
                    resources2 = resources;
                    z5 = false;
                }
            }
        }
        return "";
    }
}
