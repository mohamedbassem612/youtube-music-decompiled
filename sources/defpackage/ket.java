package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ket {
    public ket() {
    }

    public static byte[] A(ksa ksaVar) {
        Parcel parcelObtain = Parcel.obtain();
        ksaVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static int B(int i) {
        int[] iArrF = afxw.f();
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArrF[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static int C(int i) {
        int[] iArrP = afxw.p();
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArrP[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Integer D(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1118317585:
                    if (str.equals("REPEAT_ALL_AND_SHUFFLE")) {
                        return 3;
                    }
                    break;
                case -962896020:
                    if (str.equals("REPEAT_SINGLE")) {
                        return 2;
                    }
                    break;
                case 1645938909:
                    if (str.equals("REPEAT_ALL")) {
                        return 1;
                    }
                    break;
                case 1645952171:
                    if (str.equals("REPEAT_OFF")) {
                        return 0;
                    }
                    break;
            }
        }
        return null;
    }

    public static void G(boolean z, float f, RectF rectF) {
        if (z) {
            rectF.left = f;
        } else {
            rectF.right = f;
        }
    }

    public static /* synthetic */ boolean H(Layout layout, Spanned spanned) {
        int length = spanned.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return ((fur[]) spanned.getSpans(i, i, fur.class)).length > 0 || (layout.getLineCount() > 0 && layout.getEllipsisCount(layout.getLineCount() + (-1)) > 0);
    }

    public static Set I(View view, int i) {
        Object tag = view.getTag(i);
        if (!(tag instanceof mns)) {
            tag = new mns();
            view.setTag(i, tag);
        }
        return (mns) tag;
    }

    public static Set J(View view) {
        Object tag = view.getTag(525003905);
        if (tag instanceof Set) {
            return (Set) tag;
        }
        return null;
    }

    public static void K(View view, View view2) {
        Set setJ;
        if (view2 == null || (setJ = J(view2)) == null) {
            return;
        }
        setJ.remove(view);
    }

    public static float L(fhd fhdVar, float f) {
        return f / fhdVar.c().getDisplayMetrics().density;
    }

    public static void M(nsl nslVar) {
        asnu asnuVarD = nslVar.d();
        adfx adfxVarI = nslVar.i();
        if (adfxVarI == null || asnuVarD == null) {
            return;
        }
        adfxVarI.h(asnuVarD, 3);
    }

    public static void N(View view, nry nryVar, CommandOuterClass$Command commandOuterClass$Command, ntx ntxVar, ntq ntqVar, asob asobVar, ason asonVar, float f) {
        nrt nrtVarD = nrv.d();
        nrtVarD.d(view);
        nrtVarD.g = ntxVar;
        nrtVarD.f = ntqVar;
        O(nrtVarD, view, asobVar, asonVar, f);
        nryVar.a(commandOuterClass$Command, nrtVarD.a()).D();
    }

    public static void O(nrt nrtVar, View view, asob asobVar, ason asonVar, float f) {
        float width;
        float height;
        if (asobVar != null) {
            int i = bac.a;
            float measuredWidth = view.getLayoutDirection() == 0 ? asobVar.c : (asonVar.c - (view.getMeasuredWidth() / f)) - asobVar.c;
            aihf aihfVarCreateBuilder = asoi.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            asoi asoiVar = (asoi) aihfVarCreateBuilder.instance;
            asoiVar.d = asobVar;
            asoiVar.c |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            asoi asoiVar2 = (asoi) aihfVarCreateBuilder.instance;
            asonVar.getClass();
            asoiVar2.e = asonVar;
            asoiVar2.c |= 2;
            aihfVarCreateBuilder.copyOnWrite();
            asoi asoiVar3 = (asoi) aihfVarCreateBuilder.instance;
            asoiVar3.c |= 4;
            asoiVar3.f = measuredWidth;
            asoi asoiVar4 = (asoi) aihfVarCreateBuilder.build();
            Object parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                width = view2.getWidth();
                height = view2.getHeight();
            } else {
                width = 0.0f;
                height = 0.0f;
            }
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            aihf aihfVarCreateBuilder2 = aslp.a.createBuilder();
            aslx aslxVar = aslx.a;
            aihf aihfVarCreateBuilder3 = aslxVar.createBuilder();
            ason asonVar2 = ason.a;
            aihf aihfVarCreateBuilder4 = asonVar2.createBuilder();
            float measuredWidth2 = view.getMeasuredWidth() / f;
            aihfVarCreateBuilder4.copyOnWrite();
            ason asonVar3 = (ason) aihfVarCreateBuilder4.instance;
            asonVar3.b |= 1;
            asonVar3.c = measuredWidth2;
            float measuredHeight = view.getMeasuredHeight() / f;
            aihfVarCreateBuilder4.copyOnWrite();
            ason asonVar4 = (ason) aihfVarCreateBuilder4.instance;
            asonVar4.b |= 2;
            asonVar4.d = measuredHeight;
            ason asonVar5 = (ason) aihfVarCreateBuilder4.build();
            aihfVarCreateBuilder3.copyOnWrite();
            aslx aslxVar2 = (aslx) aihfVarCreateBuilder3.instance;
            asonVar5.getClass();
            aslxVar2.c = asonVar5;
            aslxVar2.b |= 1;
            aslx aslxVar3 = (aslx) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder2.copyOnWrite();
            aslp aslpVar = (aslp) aihfVarCreateBuilder2.instance;
            aslxVar3.getClass();
            aslpVar.d = aslxVar3;
            aslpVar.c |= 1;
            aihf aihfVarCreateBuilder5 = aslxVar.createBuilder();
            aihf aihfVarCreateBuilder6 = asonVar2.createBuilder();
            aihfVarCreateBuilder6.copyOnWrite();
            ason asonVar6 = (ason) aihfVarCreateBuilder6.instance;
            asonVar6.b |= 1;
            asonVar6.c = width / f;
            aihfVarCreateBuilder6.copyOnWrite();
            ason asonVar7 = (ason) aihfVarCreateBuilder6.instance;
            asonVar7.b |= 2;
            asonVar7.d = height / f;
            ason asonVar8 = (ason) aihfVarCreateBuilder6.build();
            aihfVarCreateBuilder5.copyOnWrite();
            aslx aslxVar4 = (aslx) aihfVarCreateBuilder5.instance;
            asonVar8.getClass();
            aslxVar4.c = asonVar8;
            aslxVar4.b |= 1;
            aslx aslxVar5 = (aslx) aihfVarCreateBuilder5.build();
            aihfVarCreateBuilder2.copyOnWrite();
            aslp aslpVar2 = (aslp) aihfVarCreateBuilder2.instance;
            aslxVar5.getClass();
            aslpVar2.e = aslxVar5;
            aslpVar2.c |= 2;
            aihf aihfVarCreateBuilder7 = aslxVar.createBuilder();
            aihf aihfVarCreateBuilder8 = asonVar2.createBuilder();
            float fWidth = rect.width() / f;
            aihfVarCreateBuilder8.copyOnWrite();
            ason asonVar9 = (ason) aihfVarCreateBuilder8.instance;
            asonVar9.b |= 1;
            asonVar9.c = fWidth;
            float fHeight = rect.height() / f;
            aihfVarCreateBuilder8.copyOnWrite();
            ason asonVar10 = (ason) aihfVarCreateBuilder8.instance;
            asonVar10.b |= 2;
            asonVar10.d = fHeight;
            ason asonVar11 = (ason) aihfVarCreateBuilder8.build();
            aihfVarCreateBuilder7.copyOnWrite();
            aslx aslxVar6 = (aslx) aihfVarCreateBuilder7.instance;
            asonVar11.getClass();
            aslxVar6.c = asonVar11;
            aslxVar6.b |= 1;
            aslx aslxVar7 = (aslx) aihfVarCreateBuilder7.build();
            aihfVarCreateBuilder2.copyOnWrite();
            aslp aslpVar3 = (aslp) aihfVarCreateBuilder2.instance;
            aslxVar7.getClass();
            aslpVar3.f = aslxVar7;
            aslpVar3.c |= 4;
            aslp aslpVar4 = (aslp) aihfVarCreateBuilder2.build();
            aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
            aihhVar.e(asoi.b, asoiVar4);
            aihhVar.e(aslp.b, aslpVar4);
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = (SenderStateOuterClass$SenderState) aihhVar.build();
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = nrtVar.e;
            if (senderStateOuterClass$SenderState2 != null) {
                aihh aihhVar2 = (aihh) senderStateOuterClass$SenderState2.toBuilder();
                aihhVar2.mergeFrom((aihn) senderStateOuterClass$SenderState);
                senderStateOuterClass$SenderState = (SenderStateOuterClass$SenderState) aihhVar2.build();
            }
            nrtVar.e = senderStateOuterClass$SenderState;
        }
    }

    public static int P(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 == 3 ? 0 : 1;
        }
        return 2;
    }

    public static ner Q(nbi nbiVar, boolean z) {
        try {
            aihf aihfVarCreateBuilder = asor.a.createBuilder();
            if (nbiVar.z() && nbiVar.l().y()) {
                askp askpVar = (askp) aihn.parseFrom(askp.a, nbiVar.l().f(), ExtensionRegistryLite.getGeneratedRegistry());
                aihfVarCreateBuilder.copyOnWrite();
                asor asorVar = (asor) aihfVarCreateBuilder.instance;
                askpVar.getClass();
                asorVar.e = askpVar;
                asorVar.b |= 4;
            }
            if (nbiVar.q() && nbiVar.h().y()) {
                askp askpVar2 = (askp) aihn.parseFrom(askp.a, nbiVar.h().f(), ExtensionRegistryLite.getGeneratedRegistry());
                aihfVarCreateBuilder.copyOnWrite();
                asor asorVar2 = (asor) aihfVarCreateBuilder.instance;
                askpVar2.getClass();
                asorVar2.f = askpVar2;
                asorVar2.b |= 8;
            }
            if (nbiVar.y() && nbiVar.k().y()) {
                askp askpVar3 = (askp) aihn.parseFrom(askp.a, nbiVar.k().f(), ExtensionRegistryLite.getGeneratedRegistry());
                aihfVarCreateBuilder.copyOnWrite();
                asor asorVar3 = (asor) aihfVarCreateBuilder.instance;
                askpVar3.getClass();
                asorVar3.c = askpVar3;
                asorVar3.b |= 1;
            }
            if (!z) {
                int iG = nbiVar.g();
                aihfVarCreateBuilder.copyOnWrite();
                asor asorVar4 = (asor) aihfVarCreateBuilder.instance;
                asorVar4.b |= 2;
                asorVar4.d = iG;
            }
            return nob.aR(((asor) aihfVarCreateBuilder.build()).toByteArray());
        } catch (aiik e) {
            throw new nud("Failed to create ExpandableTextComponent", e);
        }
    }

    public static void R(nry nryVar, nsl nslVar, avmm avmmVar, CommandOuterClass$Command commandOuterClass$Command) {
        nrt nrtVarD = nrv.d();
        nrtVarD.b(nslVar);
        avmmVar.c(nryVar.a(commandOuterClass$Command, nrtVarD.a()).D());
    }

    public static void S(nro nroVar, AtomicReference atomicReference, nsl nslVar, nuc nucVar, avmm avmmVar, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        nroVar.a.a.add(new mjn(nroVar, atomicReference, nslVar, nucVar, avmmVar, atomicBoolean, atomicBoolean2));
    }

    public static byte[] T(nro nroVar, String str, nsl nslVar, nuc nucVar) {
        StatusOr statusOrElementBytesByKey = nroVar.elementBytesByKey(str);
        if (statusOrElementBytesByKey.hasValue) {
            byte[] bArr = (byte[]) statusOrElementBytesByKey.value;
            if (bArr != null) {
                return bArr;
            }
            nucVar.c(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar, "Null Element bytes from CollectionDataSource.", new Object[0]);
        } else if (statusOrElementBytesByKey.status.getCode() != Status.Code.NOT_FOUND) {
            nucVar.f(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar, statusOrElementBytesByKey.status.asException(), "Error getting Element bytes from CollectionDataSource.", new Object[0]);
        }
        return null;
    }

    public static askn U(LottieAnimationView lottieAnimationView) {
        aihf aihfVarCreateBuilder = askn.a.createBuilder();
        boolean zT = lottieAnimationView.t();
        aihfVarCreateBuilder.copyOnWrite();
        askn asknVar = (askn) aihfVarCreateBuilder.instance;
        asknVar.c |= 1;
        asknVar.d = zT;
        float fC = lottieAnimationView.d.c();
        aihfVarCreateBuilder.copyOnWrite();
        askn asknVar2 = (askn) aihfVarCreateBuilder.instance;
        asknVar2.c |= 2;
        asknVar2.e = fC;
        return (askn) aihfVarCreateBuilder.build();
    }

    public static SenderStateOuterClass$SenderState V(LottieAnimationView lottieAnimationView) {
        return W(null, U(lottieAnimationView));
    }

    public static SenderStateOuterClass$SenderState W(SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, askn asknVar) {
        aihh aihhVar = senderStateOuterClass$SenderState != null ? (aihh) SenderStateOuterClass$SenderState.a.createBuilder(senderStateOuterClass$SenderState) : (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
        aihhVar.e(askn.b, asknVar);
        return (SenderStateOuterClass$SenderState) aihhVar.build();
    }

    public static boolean X(String str, Pattern pattern) {
        return pattern.matcher(str).find();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    public static String Y(asmw asmwVar) {
        String str;
        int iG;
        int iIntValue;
        if (asmwVar != null) {
            int i = asmwVar.b;
            if (atqn.g(i) != 5) {
                int iG2 = atqn.g(i);
                if (iG2 == 1) {
                    str = "COMMAND_EXTENSION_ID";
                } else if (iG2 == 2) {
                    str = "TYPE_EXTENSION_ID";
                } else if (iG2 == 3) {
                    str = "PROPERTY_EXTENSION_ID";
                } else if (iG2 != 4) {
                    str = iG2 != 5 ? "null" : "ERRORSOURCE_NOT_SET";
                } else {
                    str = "MODEL_EXTENSION_ID";
                }
                if (iG2 == 0 || (iG = atqn.g(i)) == 0) {
                    throw null;
                }
                int i2 = iG - 1;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    throw new RuntimeException(null, null);
                                }
                            } else if (i == 4) {
                                iIntValue = ((Integer) asmwVar.c).intValue();
                            }
                            iIntValue = 0;
                        } else if (i == 3) {
                            iIntValue = ((Integer) asmwVar.c).intValue();
                        } else {
                            iIntValue = 0;
                        }
                    } else if (i == 2) {
                        iIntValue = ((Integer) asmwVar.c).intValue();
                    } else {
                        iIntValue = 0;
                    }
                } else if (i == 1) {
                    iIntValue = ((Integer) asmwVar.c).intValue();
                } else {
                    iIntValue = 0;
                }
                return String.format("[ElementsErrorAttribution: %s]", str + '=' + iIntValue);
            }
        }
        return "ElementsErrorAttribution not set";
    }

    @Deprecated
    public static kpo n(kas kasVar) {
        if (kasVar == null || !kasVar.c()) {
            return null;
        }
        return (kpo) kasVar.a.get(0);
    }

    public static kpo o(kas kasVar, kem kemVar) {
        int i = kemVar.a;
        return n(kasVar);
    }

    public static int p(int i) {
        if (i == 1) {
            return 2;
        }
        int i2 = 3;
        if (i != 2) {
            if (i == 3) {
                return 4;
            }
            i2 = 5;
            if (i != 4) {
                return i != 5 ? 1 : 6;
            }
        }
        return i2;
    }

    public static ksa y(byte[] bArr, Parcelable.Creator creator) {
        kro.l(creator);
        int length = bArr.length;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, length);
        parcelObtain.setDataPosition(0);
        ksa ksaVar = (ksa) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return ksaVar;
    }

    public static ksa z(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return y(byteArrayExtra, creator);
    }

    public void E() {
        throw null;
    }

    public void F() {
        throw null;
    }

    public void b() {
        throw null;
    }

    public void q(kyr kyrVar) {
        throw null;
    }

    public void r(kyr kyrVar) {
        throw null;
    }

    public void s(kyr kyrVar) {
        throw null;
    }

    public void t(kyr kyrVar) {
        throw null;
    }

    public void u(kyr kyrVar) {
        throw null;
    }

    public void v(kyr kyrVar) {
        throw null;
    }

    public void w(kyr kyrVar) {
        throw null;
    }

    public void x(kyr kyrVar) {
        throw null;
    }

    public ket(char[] cArr) {
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public void c(int[] iArr) {
    }

    public void e(kav[] kavVarArr) {
    }

    public void f(int[] iArr) {
    }

    public void h(int[] iArr) {
    }

    public void d(int[] iArr, int i) {
    }

    public void g(List list, List list2, int i) {
    }

    public void a(String str, long j, int i, long j2, long j3) {
    }
}
