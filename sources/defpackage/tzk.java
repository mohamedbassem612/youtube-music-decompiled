package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.EGL14;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class tzk {
    private tzk() {
    }

    public static /* synthetic */ Boolean A(Activity activity, Map map) {
        boolean z = false;
        if (map.containsKey(activity.getClass()) && ((Boolean) ((awmd) map.get(activity.getClass())).io()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static /* synthetic */ Boolean B(Activity activity, Map map) {
        boolean z = true;
        if (map.containsKey(activity.getClass()) && !((Boolean) ((awmd) map.get(activity.getClass())).io()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static avlh C(avlh avlhVar, avlh avlhVar2, avlh avlhVar3) {
        avlh avlhVarP = avlh.f(avlhVar, avlhVar2, new idi(4)).p();
        return avlhVar3 != null ? avlhVar3.W(new hby(avlhVarP, 16)) : avlhVarP;
    }

    public static void D(tss tssVar, float f) {
        if (f <= 0.0010000000474974513d) {
            tssVar.h(false, false);
        } else {
            tssVar.h(true, false);
            tssVar.a.setAlpha(Math.min(1.0f, f));
        }
    }

    public static void E(RelativeLayout relativeLayout, int i, int i2) {
        relativeLayout.getClass();
        relativeLayout.setTranslationY(i);
        tym.h(relativeLayout, new tyi(i + i2, 1), ViewGroup.MarginLayoutParams.class);
    }

    public static void F(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new RuntimeException("Error executing " + str + "! EGL error = 0x" + Integer.toHexString(iEglGetError));
    }

    public static byte[] J(aigj aigjVar) {
        aigm aigmVarG = aigjVar.g();
        try {
            if ((aigmVarG.n() & 7) != 2) {
                throw new IllegalStateException(a.ce(Base64.encodeToString(aigjVar.G(), 10), "Any field within EntityMutationPayload must have WIRETYPE_LENGTH_DELIMITED tag. Base64 payload bytes: "));
            }
            byte[] bArrG = aigmVarG.G();
            ahno.P(aigmVarG.D(), "There can be only one field in EntityMutationPayload");
            return bArrG;
        } catch (IOException unused) {
            return null;
        }
    }

    public static /* synthetic */ String K(int i) {
        return i != 1 ? "BYTES" : "ENTITY";
    }

    public static /* synthetic */ String L(int i) {
        return i != 1 ? "UPDATE" : "WRITE";
    }

    public static wbi M(Object obj) {
        obj.getClass();
        return new wax(obj);
    }

    public static vxe N(Activity activity, Map map) {
        vxe vxeVar = (vxe) agev.h((awmd) map.get(activity.getClass())).a(new qmd(8)).f();
        vxeVar.getClass();
        return vxeVar;
    }

    public static void O(omr omrVar, weh wehVar) {
        agqr it = wehVar.a().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("parent_entity_key", wehVar.b());
            contentValues.put("child_entity_key", str);
            omrVar.d("entity_associations", contentValues, 5);
        }
    }

    public static void P(omr omrVar, String str) {
        omrVar.g("DELETE FROM entity_associations WHERE parent_entity_key=? OR child_entity_key=?", str, str);
    }

    public static void Q(omr omrVar, Set set) {
        omrVar.i(" (");
        Iterator it = set.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            omrVar.i(true != z ? ",?" : "?");
            omrVar.k(str);
            z = false;
        }
        omrVar.i(") ");
    }

    public static void R(omr omrVar, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            omrVar.i(" = ");
            return;
        }
        if (i2 == 1) {
            omrVar.i(" != ");
            return;
        }
        if (i2 == 2) {
            omrVar.i(" < ");
            return;
        }
        if (i2 == 3) {
            omrVar.i(" <= ");
            return;
        }
        if (i2 == 4) {
            omrVar.i(" > ");
        } else if (i2 != 5) {
            omrVar.i(" LIKE ");
        } else {
            omrVar.i(" >= ");
        }
    }

    public static vwx S(ArrayList arrayList, vxa vxaVar) {
        return new vwy(vxaVar, agke.n(arrayList));
    }

    public static void T(Map map, ArrayList arrayList) {
        arrayList.add(new vwz(map));
    }

    public static tgg U(tqj tqjVar, int i, aunn aunnVar, aunn aunnVar2) {
        return tqjVar.k(i) ? (tgg) aunnVar2.io() : (tgg) aunnVar.io();
    }

    public static avlh V(avlh avlhVar, avlh avlhVar2) {
        return avlh.f(avlhVar, avlhVar2.x(new xib(1)).H(new vup(12)).H(new vup(13)).H(new vup(14)).p(), new vvj(0)).U(Boolean.FALSE).p();
    }

    public static avlh W(avlr avlrVar, avlh avlhVar) {
        return V(avlrVar.g(avla.e).H(new vup(10)).p(), avlhVar);
    }

    public static avlh X(avlr avlrVar, avlh avlhVar, tth tthVar, boolean z) {
        return z ? avlh.h(W(avlrVar, avlhVar), tthVar.b, avlhVar.x(new xib(1)).H(new uxe(14)), avlrVar.g(avla.e), new vth(3)).p() : avlh.g(W(avlrVar, avlhVar), tthVar.b, avlrVar.g(avla.e), new vqp(5)).p();
    }

    public static String Y(aqzk aqzkVar) {
        if ((aqzkVar.c & 2) == 0) {
            return null;
        }
        akud akudVar = aqzkVar.e;
        if (akudVar == null) {
            akudVar = akud.a;
        }
        return Z(akudVar);
    }

    public static String Z(akud akudVar) {
        if ((akudVar.b & 2) != 0) {
            return akudVar.d;
        }
        return null;
    }

    public static void a(Throwable th) {
        throw new tzl(th);
    }

    public static String aa(akuj akujVar) {
        if (((akujVar.e == 18 ? (akud) akujVar.f : akud.a).b & 2) != 0) {
            return (akujVar.e == 18 ? (akud) akujVar.f : akud.a).d;
        }
        int i = akujVar.e;
        if (i == 1) {
            return i == 1 ? (String) akujVar.f : "";
        }
        return null;
    }

    public static String ab(apxs apxsVar) {
        if (((apxsVar.d == 10 ? (akud) apxsVar.e : akud.a).b & 2) != 0) {
            return (apxsVar.d == 10 ? (akud) apxsVar.e : akud.a).d;
        }
        int i = apxsVar.d;
        if (i == 1) {
            return i == 1 ? (String) apxsVar.e : "";
        }
        return null;
    }

    public static String ac(aqzk aqzkVar) {
        if ((aqzkVar.c & 1) == 0) {
            return null;
        }
        akud akudVar = aqzkVar.d;
        if (akudVar == null) {
            akudVar = akud.a;
        }
        return Z(akudVar);
    }

    public static avlh ad(abwk abwkVar) {
        return ((avlh) abwkVar.c).x(new xib(1)).H(new vup(9)).S();
    }

    public static avlh ae(abwk abwkVar, avlr avlrVar) {
        int i = 1;
        return avlh.f(((avlh) abwkVar.c).x(new xib(i)), avlrVar.g(avla.e), new vvj(i)).S();
    }

    public static avlh af(abwk abwkVar) {
        return ((avlh) abwkVar.c).x(new xib(1)).H(new vup(11)).S();
    }

    public static void ag(wcu wcuVar, int i, Long l, abxv abxvVar, List list) {
        abxvVar.p(wcuVar);
        list.add(new wcq(wcuVar, i, l, 1));
    }

    public static void ah(wcu wcuVar, int i, String str, abxv abxvVar, List list) {
        abxvVar.p(wcuVar);
        list.add(new wcq(wcuVar, i, str, 0));
    }

    public static wjr ai(abxv abxvVar, List list) {
        omr omrVar = new omr();
        omrVar.i("SELECT entity_key FROM ");
        abxvVar.s(omrVar);
        omrVar.i(" WHERE ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((wct) it.next()).a(omrVar);
        }
        return new wjr(abxvVar, omrVar.p());
    }

    public static vqs aj(View view, int i, agev agevVar, boolean z, boolean z2, boolean z3, vor vorVar, ahto ahtoVar, vnh vnhVar, vwt vwtVar, agev agevVar2, agev agevVar3, vxz vxzVar, cf cfVar) {
        return new vqs(view, i, agevVar, z, z2, z3, true, vorVar, vnhVar, vwtVar, ahtoVar, agevVar2, agevVar3, vxzVar, cfVar.getSavedStateRegistry(), cfVar, Optional.empty());
    }

    public static onp ak(nvp nvpVar, axfd axfdVar, aunn aunnVar) {
        nvpVar.getClass();
        aunnVar.getClass();
        return axfdVar.ae(nvpVar, new hbg(aunnVar, 3), assq.b);
    }

    public static vqs al(View view, int i, agev agevVar, boolean z, boolean z2, boolean z3, vor vorVar, ahto ahtoVar, vnh vnhVar, vwt vwtVar, agev agevVar2, agev agevVar3, vxz vxzVar, cf cfVar, abxv abxvVar) {
        return new vqs(view, i, agevVar, z, z2, z3, false, vorVar, vnhVar, vwtVar, ahtoVar, agevVar2, agevVar3, vxzVar, cfVar.getSavedStateRegistry(), cfVar, Optional.of(abxvVar));
    }

    private static Resources.NotFoundException am(int i) {
        return new Resources.NotFoundException(String.format("Attribute not defined by theme (attr = %d)", Integer.valueOf(i)));
    }

    private static void an(int i) {
        if (i == 0) {
            throw new IllegalArgumentException(String.format("Invalid attribute resource ID (%d)", 0));
        }
    }

    public static ListenableFuture b(avmc avmcVar) {
        tzj tzjVar = new tzj();
        avmcVar.F(new tzi(tzjVar));
        return tzjVar;
    }

    public static avmc c(ListenableFuture listenableFuture) {
        awgn awgnVar = new awgn(new tzh(listenableFuture));
        avnn avnnVar = atqp.o;
        return awgnVar;
    }

    public static avmc d(avlm avlmVar) {
        return avlmVar.r(new rtq(18)).B(Optional.empty());
    }

    public static ListenableFuture e(avlm avlmVar) {
        return b(d(avlmVar));
    }

    public static avlm f(ListenableFuture listenableFuture) {
        avye avyeVar = new avye(new hkh(listenableFuture, 2));
        avnn avnnVar = atqp.n;
        return avyeVar;
    }

    public static ListenableFuture g(avlb avlbVar) {
        return ape.f(new tzc(avlbVar, 0));
    }

    public static avlb h(ListenableFuture listenableFuture) {
        avps avpsVar = new avps(new tzb(listenableFuture));
        avnn avnnVar = atqp.p;
        return avpsVar;
    }

    public static int i(Context context, int i) {
        context.getClass();
        an(i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw am(i);
        }
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return typedValue.data;
        }
        if (typedValue.type != 3) {
            throw new UnsupportedOperationException(String.format("Type of attribute is not a color (attr = %d, type = %d)", Integer.valueOf(i), Integer.valueOf(typedValue.type)));
        }
        try {
            return context.getResources().getColor(typedValue.resourceId);
        } catch (Resources.NotFoundException e) {
            throw new UnsupportedOperationException(String.format("Type of attribute is not a color (attr = %d, type = %d)", Integer.valueOf(i), Integer.valueOf(typedValue.type)), e);
        }
    }

    public static int j(Context context, int i) {
        context.getClass();
        an(i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw am(i);
        }
        if (typedValue.type == 1) {
            return typedValue.resourceId;
        }
        throw new UnsupportedOperationException(String.format("Type of attribute is not a resource ID (attr = %d, value = %s)", Integer.valueOf(i), typedValue.coerceToString()));
    }

    public static ColorStateList k(Context context, int i) {
        context.getClass();
        an(i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{i});
        try {
            try {
                ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
                typedArrayObtainStyledAttributes.recycle();
                if (colorStateList != null) {
                    return colorStateList;
                }
                throw am(i);
            } catch (Resources.NotFoundException e) {
                throw new UnsupportedOperationException(String.format("Type of attribute is not a color state list (attr = %d, value = %s)", Integer.valueOf(i), typedArrayObtainStyledAttributes.getString(0)), e);
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static Optional l(Context context, int i) {
        Optional optionalEmpty;
        context.getClass();
        an(i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{i});
        try {
            try {
                optionalEmpty = Optional.ofNullable(typedArrayObtainStyledAttributes.getColorStateList(0));
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                optionalEmpty = Optional.empty();
            }
            return optionalEmpty;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static Optional m(Context context, int i) {
        context.getClass();
        an(i);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.type == 5 ? Optional.of(Float.valueOf(typedValue.getDimension(context.getResources().getDisplayMetrics()))) : Optional.empty();
        }
        return Optional.empty();
    }

    public static OptionalInt n(Context context, int i) {
        context.getClass();
        return o(context.getResources(), context.getTheme(), i);
    }

    public static OptionalInt o(Resources resources, Resources.Theme theme, int i) {
        an(i);
        TypedValue typedValue = new TypedValue();
        if (!theme.resolveAttribute(i, typedValue, true)) {
            return OptionalInt.empty();
        }
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return OptionalInt.of(typedValue.data);
        }
        if (typedValue.type != 3) {
            return OptionalInt.empty();
        }
        try {
            int i2 = typedValue.resourceId;
            int i3 = avt.a;
            return OptionalInt.of(resources.getColor(i2, theme));
        } catch (Resources.NotFoundException unused) {
            return OptionalInt.empty();
        }
    }

    public static OptionalInt p(Context context, int i) {
        an(i);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.type == 1 ? OptionalInt.of(typedValue.resourceId) : OptionalInt.empty();
        }
        return OptionalInt.empty();
    }

    public static Drawable q(Context context) {
        context.getClass();
        Integer numValueOf = Integer.valueOf(R.attr.ytRadioButton);
        an(R.attr.ytRadioButton);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.ytRadioButton, typedValue, true)) {
            throw am(R.attr.ytRadioButton);
        }
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return new ColorDrawable(typedValue.data);
        }
        if (typedValue.type != 3) {
            throw new UnsupportedOperationException(String.format("Type of attribute is not a color or a reference to a drawable (attr = %d, value = %s)", numValueOf, typedValue.coerceToString()));
        }
        try {
            Resources resources = context.getResources();
            int i = typedValue.resourceId;
            Resources.Theme theme = context.getTheme();
            int i2 = avt.a;
            return resources.getDrawable(i, theme);
        } catch (Resources.NotFoundException e) {
            throw new UnsupportedOperationException(String.format("Type of attribute is not a reference to a drawable (attr = %d, value = %s)", numValueOf, typedValue.coerceToString()), e);
        }
    }

    public static int r(Context context) {
        an(R.attr.ytThemeType);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.ytThemeType, typedValue, true)) {
            throw am(R.attr.ytThemeType);
        }
        if (typedValue.type < 16 || typedValue.type > 31) {
            throw new UnsupportedOperationException(String.format("Type of attribute is not an integer (attr = %d, value = %s)", Integer.valueOf(R.attr.ytThemeType), typedValue.coerceToString()));
        }
        return typedValue.data;
    }

    public static boolean s(Context context) {
        context.getClass();
        return ((ActivityManager) context.getSystemService("activity")).getLargeMemoryClass() >= 256;
    }

    public static int t(long j, int i) {
        return (((int) (j & 4294967295L)) >> (i & 63)) & ((1 << (i >> 6)) - 1);
    }

    public static int u(long j, int i) {
        return (((int) (j >> 32)) >> (i & 63)) & ((1 << (i >> 6)) - 1);
    }

    public static int v(int i, int i2, int i3) {
        int i4 = (1 << (i2 >> 6)) - 1;
        int i5 = i2 & 63;
        return (i & (~(i4 << i5))) | ((Math.max(0, Math.min(i3, i4)) & i4) << i5);
    }

    public static long w(int i, int i2) {
        return (((long) i2) << 32) | ((long) i);
    }

    public static /* synthetic */ agev x(Activity activity, Map map) {
        if (!map.containsKey(activity.getClass())) {
            return agdf.a;
        }
        Integer num = (Integer) ((awmd) map.get(activity.getClass())).io();
        num.getClass();
        return new agfa(num);
    }

    public static /* synthetic */ agev y(Activity activity, Map map) {
        if (!map.containsKey(activity.getClass())) {
            return agdf.a;
        }
        voj vojVar = (voj) ((awmd) map.get(activity.getClass())).io();
        vojVar.getClass();
        return new agfa(vojVar);
    }

    public static /* synthetic */ agev z(Activity activity, Map map) {
        if (!map.containsKey(activity.getClass())) {
            return agdf.a;
        }
        vqt vqtVar = (vqt) ((awmd) map.get(activity.getClass())).io();
        vqtVar.getClass();
        return new agfa(vqtVar);
    }

    public /* bridge */ /* synthetic */ weh I(wek wekVar) {
        throw null;
    }

    public tzk(short[] sArr) {
    }

    public void H(Deque deque, Attributes attributes) {
    }

    public void G(Deque deque, Attributes attributes, String str) {
    }
}
