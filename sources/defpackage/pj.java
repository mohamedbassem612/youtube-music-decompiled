package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pj {
    public final Object a;
    public final Object b;

    public pj() {
        this.a = new aha(0);
        this.b = new agk(10);
    }

    public static final ewf P(ImageDecoder.Source source, int i, int i2, ety etyVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new ezp(i, i2, etyVar, false));
        if (pj$$ExternalSyntheticApiModelOutline0.m916m((Object) drawableDecodeDrawable)) {
            return new fbv(pj$$ExternalSyntheticApiModelOutline0.m((Object) drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: ".concat(String.valueOf(String.valueOf(drawableDecodeDrawable))));
    }

    public static final boolean Q(ImageHeaderParser$ImageType imageHeaderParser$ImageType) {
        if (imageHeaderParser$ImageType != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageType == ImageHeaderParser$ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    public final void A() {
        synchronized (this) {
            Object obj = this.a;
            ((AtomicInteger) obj).decrementAndGet();
            if (((AtomicInteger) obj).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public final boolean B() {
        synchronized (this) {
            if (((AtomicBoolean) this.b).get()) {
                return false;
            }
            ((AtomicInteger) this.a).incrementAndGet();
            return true;
        }
    }

    public final void C(String str, long j, long j2) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new ctw(this, str, j, j2, 0));
        }
    }

    public final void D(String str) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new cfv(this, str, 15, null));
        }
    }

    public final void E(cay cayVar) {
        cayVar.a();
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new cfv(this, cayVar, 19));
        }
    }

    public final void F(int i, long j) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new ctx(this, i, j, 1));
        }
    }

    public final void G(cay cayVar) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new cfv(this, cayVar, 18));
        }
    }

    public final void H(bse bseVar, caz cazVar) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new bf((Object) this, bseVar, cazVar, 14));
        }
    }

    public final void I(Object obj) {
        Object obj2 = this.a;
        if (obj2 != null) {
            ((Handler) obj2).post(new laz(this, obj, SystemClock.elapsedRealtime(), 1));
        }
    }

    public final void J(long j, int i) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new ctx(this, j, i, 0));
        }
    }

    public final void K(Exception exc) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new cfv(this, exc, 17, null));
        }
    }

    public final void L(btz btzVar) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new cfv(this, btzVar, 16));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ewn, java.lang.Object] */
    public final void M(Bitmap bitmap) {
        this.b.d(bitmap);
    }

    public final void N(byte[] bArr) {
        Object obj = this.a;
        if (obj != null) {
            ((ewv) obj).c(bArr);
        }
    }

    public final byte[] O(int i) {
        Object obj = this.a;
        return obj == null ? new byte[i] : (byte[]) ((ewv) obj).a(i, byte[].class);
    }

    public final synchronized List R(Class cls) {
        return ((eza) this.a).c(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized List S(Class cls) {
        Object obj;
        List listUnmodifiableList;
        ?? r0 = ((ci) this.b).a;
        ci ciVar = (ci) r0.get(cls);
        if (ciVar == null) {
            listUnmodifiableList = 0;
        } else {
            obj = ciVar.a;
        }
        if (listUnmodifiableList == 0) {
            listUnmodifiableList = obj;
            listUnmodifiableList = DesugarCollections.unmodifiableList(((eza) this.a).b(cls));
            if (((ci) r0.put(cls, new ci(listUnmodifiableList, (byte[]) null))) != null) {
                throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(String.valueOf(cls))));
            }
        }
        return listUnmodifiableList;
    }

    public final synchronized void T(Class cls, Class cls2, eyw eywVar) {
        ((eza) this.a).f(cls, cls2, eywVar);
        ((ci) this.b).X();
    }

    public final synchronized void U(Class cls, Class cls2, eyw eywVar) {
        ((eza) this.a).g(cls, cls2, eywVar);
        ((ci) this.b).X();
    }

    public final synchronized void V(Class cls, Class cls2, eyw eywVar) {
        Iterator it = ((eza) this.a).e(cls, cls2, eywVar).iterator();
        while (it.hasNext()) {
            ((eyw) it.next()).c();
        }
        ((ci) this.b).X();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pi] */
    public final View a(int i, int i2, int i3, int i4) {
        ?? r0 = this.a;
        int iD = r0.d();
        int iC = r0.c();
        View view = null;
        int i5 = i;
        while (i5 != i2) {
            View viewE = r0.e(i5);
            int iB = r0.b(viewE);
            int iA = r0.a(viewE);
            foo fooVar = (foo) this.b;
            fooVar.c(iD, iC, iB, iA);
            fooVar.b();
            fooVar.a(i3);
            if (fooVar.d()) {
                return viewE;
            }
            if (i4 != 0) {
                fooVar.b();
                fooVar.a(i4);
                if (fooVar.d()) {
                    view = viewE;
                }
            }
            i5 += i2 > i ? 1 : -1;
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, pi] */
    final boolean b(View view) {
        Object obj = this.b;
        ?? r4 = this.a;
        foo fooVar = (foo) obj;
        fooVar.c(r4.d(), r4.c(), r4.b(view), r4.a(view));
        fooVar.b();
        fooVar.a(24579);
        return fooVar.d();
    }

    final void c(oh ohVar) {
        aha ahaVar = (aha) this.a;
        pk pkVarA = (pk) ahaVar.get(ohVar);
        if (pkVarA == null) {
            pkVarA = pk.a();
            ahaVar.put(ohVar, pkVarA);
        }
        pkVarA.b |= 1;
    }

    public final void d(long j, oh ohVar) {
        ((agk) this.b).i(j, ohVar);
    }

    public final void e() {
        ((aha) this.a).clear();
        ((agk) this.b).h();
    }

    final void f(oh ohVar) {
        pk pkVar = (pk) ((aha) this.a).get(ohVar);
        if (pkVar != null) {
            pkVar.b &= -2;
        }
    }

    final void g(oh ohVar) {
        agk agkVar = (agk) this.b;
        int iC = agkVar.c();
        while (true) {
            iC--;
            if (iC < 0) {
                break;
            } else if (ohVar == agkVar.g(iC)) {
                agkVar.j(iC);
                break;
            }
        }
        pk pkVar = (pk) ((aha) this.a).remove(ohVar);
        if (pkVar != null) {
            pk.b(pkVar);
        }
    }

    public final boolean h(oh ohVar) {
        pk pkVar = (pk) ((aha) this.a).get(ohVar);
        return (pkVar == null || (pkVar.b & 1) == 0) ? false : true;
    }

    public final void i(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((TextView) this.a).getContext().obtainStyledAttributes(attributeSet, he.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            Object obj = this.b;
            bme bmeVar = bme.b;
            ((bmm) ((ci) obj).a).a.a = z;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void j(cc ccVar, Bundle bundle, boolean z) {
        ccVar.getClass();
        cc ccVar2 = ((dd) this.a).r;
        if (ccVar2 != null) {
            ccVar2.getParentFragmentManager().D.j(ccVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            ci ciVar = (ci) it.next();
            if (!z) {
                Object obj = ciVar.a;
            }
        }
    }

    public final void k(cc ccVar, boolean z) {
        ccVar.getClass();
        dd ddVar = (dd) this.a;
        Context context = ddVar.p.c;
        cc ccVar2 = ddVar.r;
        if (ccVar2 != null) {
            ccVar2.getParentFragmentManager().D.k(ccVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            ci ciVar = (ci) it.next();
            if (!z) {
                Object obj = ciVar.a;
            }
        }
    }

    public final void l(cc ccVar, Bundle bundle, boolean z) {
        ccVar.getClass();
        cc ccVar2 = ((dd) this.a).r;
        if (ccVar2 != null) {
            ccVar2.getParentFragmentManager().D.l(ccVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            ci ciVar = (ci) it.next();
            if (!z) {
                Object obj = ciVar.a;
            }
        }
    }

    public final void m(cc ccVar, boolean z) {
        ccVar.getClass();
        cc ccVar2 = ((dd) this.a).r;
        if (ccVar2 != null) {
            ccVar2.getParentFragmentManager().D.m(ccVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            ci ciVar = (ci) it.next();
            if (!z) {
                Object obj = ciVar.a;
            }
        }
    }

    public final void n(cc ccVar, boolean z) {
        ccVar.getClass();
        cc ccVar2 = ((dd) this.a).r;
        if (ccVar2 != null) {
            ccVar2.getParentFragmentManager().D.n(ccVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            ci ciVar = (ci) it.next();
            if (!z) {
                Object obj = ciVar.a;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, nwj] */
    public final void o(cc ccVar, boolean z) {
        ccVar.getClass();
        cc ccVar2 = ((dd) this.a).r;
        if (ccVar2 != null) {
            ccVar2.getParentFragmentManager().D.o(ccVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            ci ciVar = (ci) it.next();
            if (!z) {
                Object obj = ciVar.a;
                ahsx ahsxVar = (ahsx) obj;
                ?? r1 = ahsxVar.c;
                r1.d((RecyclerView) ahsxVar.b);
                Object obj2 = ((dd) ahsxVar.a).D.b;
                synchronized (obj2) {
                    int size = ((CopyOnWriteArrayList) obj2).size();
                    for (int i = 0; i < size; i++) {
                        if (((ci) ((CopyOnWriteArrayList) obj2).get(i)).a == obj) {
                            ((CopyOnWriteArrayList) obj2).remove(i);
                            break;
                        }
                    }
                }
                r1.b();
            }
        }
    }

    public final void p(cc ccVar, boolean z) {
        ccVar.getClass();
        dd ddVar = (dd) this.a;
        Context context = ddVar.p.c;
        cc ccVar2 = ddVar.r;
        if (ccVar2 != null) {
            ccVar2.getParentFragmentManager().D.p(ccVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            ci ciVar = (ci) it.next();
            if (!z) {
                Object obj = ciVar.a;
            }
        }
    }

    public final void q(cc ccVar, Bundle bundle, boolean z) {
        ccVar.getClass();
        cc ccVar2 = ((dd) this.a).r;
        if (ccVar2 != null) {
            ccVar2.getParentFragmentManager().D.q(ccVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            ci ciVar = (ci) it.next();
            if (!z) {
                Object obj = ciVar.a;
            }
        }
    }

    public final void r(cc ccVar, boolean z) {
        ccVar.getClass();
        cc ccVar2 = ((dd) this.a).r;
        if (ccVar2 != null) {
            ccVar2.getParentFragmentManager().D.r(ccVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            ci ciVar = (ci) it.next();
            if (!z) {
                Object obj = ciVar.a;
            }
        }
    }

    public final void s(cc ccVar, Bundle bundle, boolean z) {
        ccVar.getClass();
        cc ccVar2 = ((dd) this.a).r;
        if (ccVar2 != null) {
            ccVar2.getParentFragmentManager().D.s(ccVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            ci ciVar = (ci) it.next();
            if (!z) {
                Object obj = ciVar.a;
            }
        }
    }

    public final void t(cc ccVar, boolean z) {
        ccVar.getClass();
        cc ccVar2 = ((dd) this.a).r;
        if (ccVar2 != null) {
            ccVar2.getParentFragmentManager().D.t(ccVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            ci ciVar = (ci) it.next();
            if (!z) {
                Object obj = ciVar.a;
            }
        }
    }

    public final void u(cc ccVar, boolean z) {
        ccVar.getClass();
        cc ccVar2 = ((dd) this.a).r;
        if (ccVar2 != null) {
            ccVar2.getParentFragmentManager().D.u(ccVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            ci ciVar = (ci) it.next();
            if (!z) {
                Object obj = ciVar.a;
            }
        }
    }

    public final void v(cc ccVar, View view, Bundle bundle, boolean z) {
        ccVar.getClass();
        view.getClass();
        cc ccVar2 = ((dd) this.a).r;
        if (ccVar2 != null) {
            ccVar2.getParentFragmentManager().D.v(ccVar, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            ci ciVar = (ci) it.next();
            if (!z) {
                Object obj = ciVar.a;
            }
        }
    }

    public final void w(cc ccVar, boolean z) {
        ccVar.getClass();
        cc ccVar2 = ((dd) this.a).r;
        if (ccVar2 != null) {
            ccVar2.getParentFragmentManager().D.w(ccVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        while (it.hasNext()) {
            ci ciVar = (ci) it.next();
            if (!z) {
                Object obj = ciVar.a;
            }
        }
    }

    public final cwp x(oh ohVar, int i) {
        pk pkVar;
        cwp cwpVar;
        aha ahaVar = (aha) this.a;
        int iC = ahaVar.c(ohVar);
        cwp cwpVar2 = null;
        if (iC >= 0 && (pkVar = (pk) ahaVar.g(iC)) != null) {
            int i2 = pkVar.b;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                pkVar.b = i3;
                if (i == 4) {
                    cwpVar = pkVar.c;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cwpVar = pkVar.d;
                }
                cwpVar2 = cwpVar;
                if ((i3 & 12) == 0) {
                    ahaVar.e(iC);
                    pk.b(pkVar);
                }
            }
        }
        return cwpVar2;
    }

    public final void y(oh ohVar, cwp cwpVar) {
        aha ahaVar = (aha) this.a;
        pk pkVarA = (pk) ahaVar.get(ohVar);
        if (pkVarA == null) {
            pkVarA = pk.a();
            ahaVar.put(ohVar, pkVarA);
        }
        pkVarA.d = cwpVar;
        pkVarA.b |= 8;
    }

    public final void z(oh ohVar, cwp cwpVar) {
        aha ahaVar = (aha) this.a;
        pk pkVarA = (pk) ahaVar.get(ohVar);
        if (pkVarA == null) {
            pkVarA = pk.a();
            ahaVar.put(ohVar, pkVarA);
        }
        pkVarA.c = cwpVar;
        pkVarA.b |= 4;
    }

    public pj(ewn ewnVar, ewv ewvVar) {
        this.b = ewnVar;
        this.a = ewvVar;
    }

    public pj(String str, awqg awqgVar) {
        this.a = str;
        this.b = new agw(awqgVar, 3);
    }

    public pj(List list, ewv ewvVar) {
        this.a = list;
        this.b = ewvVar;
    }

    public pj(pi piVar) {
        this.a = piVar;
        this.b = new foo(null);
    }

    public pj(TextView textView) {
        this.a = textView;
        this.b = new ci(textView);
    }

    public pj(dd ddVar) {
        this.a = ddVar;
        this.b = new CopyOnWriteArrayList();
    }

    public pj(fde fdeVar) {
        this.a = new HashMap();
        this.b = fdeVar;
    }

    public pj(byte[] bArr, byte[] bArr2) {
        this.a = new AtomicInteger(0);
        this.b = new AtomicBoolean(false);
    }

    public pj(Handler handler, cty ctyVar) {
        if (ctyVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.a = handler;
        this.b = ctyVar;
    }

    public pj(byte[] bArr) {
        this.a = new ReentrantLock();
        this.b = new LinkedHashMap();
    }

    public pj(axr axrVar) {
        eza ezaVar = new eza(axrVar);
        this.b = new ci((short[]) null, (byte[]) null, (byte[]) null);
        this.a = ezaVar;
    }
}
