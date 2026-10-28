package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PathEffect;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import app.rive.semantics.SemanticState;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahto {
    static Integer d;
    private static WeakReference e;
    public final Object a;
    public final Object b;
    public Object c;

    public ahto(bof bofVar, bob bobVar) {
        Object bosVar;
        this.a = bofVar;
        this.c = bobVar;
        boolean z = bofVar instanceof boe;
        boolean z2 = bofVar instanceof bnu;
        bok bokVar = bok.a;
        if (z && z2) {
            bosVar = new bnv((bnu) bofVar, (boe) bofVar);
        } else if (z2) {
            bosVar = new bnv((bnu) bofVar, null);
        } else if (z) {
            bosVar = (boe) bofVar;
        } else {
            Class<?> cls = bofVar.getClass();
            if (bok.a.a(cls) == 2) {
                Object obj = bok.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    bosVar = new bph(bok.b((Constructor) list.get(0), bofVar), 0);
                } else {
                    int size = list.size();
                    bnx[] bnxVarArr = new bnx[size];
                    for (int i = 0; i < size; i++) {
                        bnxVarArr[i] = bok.b((Constructor) list.get(i), bofVar);
                    }
                    bosVar = new bph(bnxVarArr, 1);
                }
            } else {
                bosVar = new bos(bofVar);
            }
        }
        this.b = bosVar;
    }

    public static ahto K(Context context, AttributeSet attributeSet, int[] iArr) {
        return new ahto(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static ahto L(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new ahto(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054 A[Catch: all -> 0x005b, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x005b, blocks: (B:5:0x000d, B:7:0x0025, B:9:0x002d, B:11:0x0038, B:13:0x0041, B:15:0x0049, B:16:0x004f, B:17:0x0052, B:19:0x0054), top: B:31:0x000d, outer: #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence, java.lang.Object] */
    private final synchronized void M() {
        axfd axfdVar = new axfd((SharedPreferences) this.a, (Executor) this.b);
        Object obj = axfdVar.c;
        synchronized (obj) {
            try {
                ((ArrayDeque) obj).clear();
                String string = axfdVar.a.getString((String) axfdVar.d, "");
                if (!TextUtils.isEmpty(string)) {
                    ?? r3 = axfdVar.e;
                    if (string.contains(r3)) {
                        String[] strArrSplit = string.split((String) r3, -1);
                        if (strArrSplit.length == 0) {
                            Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                        }
                        for (String str : strArrSplit) {
                            if (!TextUtils.isEmpty(str)) {
                                ((ArrayDeque) obj).add(str);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = axfdVar;
    }

    private final int N(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        View view = (View) this.a;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Context context = view.getContext();
        Integer numValueOf = d;
        if (numValueOf == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            gzj.bM(windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            numValueOf = Integer.valueOf(Math.max(point.x, point.y));
            d = numValueOf;
        }
        return numValueOf.intValue();
    }

    private static final boolean O(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static synchronized ahto b(Context context, Executor executor) {
        ahto ahtoVar;
        WeakReference weakReference = e;
        ahtoVar = weakReference != null ? (ahto) weakReference.get() : null;
        if (ahtoVar == null) {
            ahtoVar = new ahto(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
            ahtoVar.M();
            e = new WeakReference(ahtoVar);
        }
        return ahtoVar;
    }

    public static final boolean r(int i, int i2) {
        return O(i) && O(i2);
    }

    public final ColorStateList A(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            Context context = (Context) this.a;
            ColorStateList colorStateListA = avt.a(context.getResources(), resourceId, context.getTheme());
            if (colorStateListA != null) {
                return colorStateListA;
            }
        }
        return typedArray.getColorStateList(i);
    }

    public final Drawable B(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : ok.e().c((Context) this.a, resourceId);
    }

    public final Drawable C(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return kl.d().g((Context) this.a, resourceId);
    }

    public final CharSequence D(int i) {
        return ((TypedArray) this.b).getText(i);
    }

    public final String E(int i) {
        return ((TypedArray) this.b).getString(i);
    }

    public final void F() {
        ((TypedArray) this.b).recycle();
    }

    public final boolean G(int i, boolean z) {
        return ((TypedArray) this.b).getBoolean(i, z);
    }

    public final boolean H(int i) {
        return ((TypedArray) this.b).hasValue(i);
    }

    public final int I(int i) {
        return ((TypedArray) this.b).getColor(i, 0);
    }

    public final float J(int i) {
        return ((TypedArray) this.b).getDimension(i, -1.0f);
    }

    final synchronized ahtn a() {
        String str;
        Object obj = ((axfd) this.c).c;
        synchronized (obj) {
            try {
                str = (String) ((ArrayDeque) obj).peek();
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = ahtn.d;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                return new ahtn(strArrSplit[0], strArrSplit[1]);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.CharSequence, java.lang.Object] */
    final synchronized void c(ahtn ahtnVar) {
        String str = ahtnVar.c;
        Object obj = this.c;
        if (TextUtils.isEmpty(str) || str.contains(((axfd) obj).e)) {
            return;
        }
        Object obj2 = ((axfd) obj).c;
        synchronized (obj2) {
            ((axfd) obj).e(((ArrayDeque) obj2).add(str));
        }
    }

    final synchronized void d(ahtn ahtnVar) {
        Object obj = this.c;
        Object obj2 = ((axfd) obj).c;
        String str = ahtnVar.c;
        synchronized (obj2) {
            try {
                ((axfd) obj).e(((ArrayDeque) obj2).remove(str));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(akno aknoVar, int i) {
        if (aknoVar != null) {
            Object obj = this.a;
            xfh xfhVar = new xfh(i - 1, 18);
            aihf aihfVarCreateBuilder = akzk.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            akzk akzkVar = (akzk) aihfVarCreateBuilder.instance;
            akzkVar.h = aknoVar;
            akzkVar.b |= SemanticState.Modal;
            xfhVar.a = (akzk) aihfVarCreateBuilder.build();
            ((abte) obj).b(xfhVar, alai.FLOW_TYPE_DRAG_AND_DROP);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.locks.ReadWriteLock] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [awmd] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final adnc f(Object obj) {
        ?? r4;
        awmd awmdVar;
        ?? r0 = this.b;
        r0.readLock().lock();
        if (obj != null) {
            awmdVar = (awmd) this.a.get(obj);
        } else {
            r4 = 0;
        }
        if (r4 == 0) {
            r4 = awmdVar;
            r4 = this.c;
        }
        r4 = awmdVar;
        r0.readLock().unlock();
        if (r4 != 0) {
            return (adnc) r4.io();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.locks.ReadWriteLock] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.locks.ReadWriteLock] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.locks.ReadWriteLock] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    public final void g(Map map) {
        this.b.readLock().lock();
        try {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (this.a.containsKey(it.next())) {
                    throw new IllegalStateException();
                }
            }
            ?? r0 = this.b;
            r0.readLock().unlock();
            r0.writeLock().lock();
            this.a.putAll(map);
            r0.writeLock().unlock();
        } catch (Throwable th) {
            this.b.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.locks.ReadWriteLock] */
    public final void h(awmd awmdVar) {
        ?? r0 = this.b;
        r0.writeLock().lock();
        this.c = awmdVar;
        r0.writeLock().unlock();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [boe, java.lang.Object] */
    public final void i(bog bogVar, boa boaVar) throws Exception {
        bob bobVarA = boaVar.a();
        this.c = (bob) atqq.h(this.c, bobVarA);
        drd drdVar = drd.d;
        drdVar.a("androidx.lifecycle");
        axjt axjtVar = axjt.a;
        try {
            this.b.a(bogVar, boaVar);
            afxw.v(axjtVar);
            this.c = bobVarA;
        } catch (Throwable th) {
            try {
                wg.d(drdVar, th);
                throw new awmh();
            } catch (Throwable th2) {
                afxw.v(axjtVar);
                throw th2;
            }
        }
    }

    public final fgp j() {
        k();
        this.c = null;
        return (fgp) this.a;
    }

    public final void k() {
        if (this.c == null) {
            throw new IllegalStateException("This builder has already been disposed / built!");
        }
    }

    public final void l(int i, float f) {
        k();
        int iZ = ((ayq) this.c).z(f);
        k();
        ((fgp) this.a).a[i] = iZ;
    }

    public final void m(int i) {
        k();
        fgp.c(((fgp) this.a).c, 9, i);
    }

    public final void n(int i) {
        k();
        if (i >= 0) {
            fgp.c(((fgp) this.a).b, 9, i);
            return;
        }
        throw new IllegalArgumentException("Given negative border width value: " + i + " for edge " + kro.be(9));
    }

    public final int o() {
        View view = (View) this.a;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return N(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    public final int p() {
        View view = (View) this.a;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return N(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void q() {
        ViewTreeObserver viewTreeObserver = ((View) this.a).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.c);
        }
        this.c = null;
        this.b.clear();
    }

    public final Object s() {
        long j = ahs.j();
        return j == ajq.a ? this.c : ((xgl) ((AtomicReference) this.b).get()).e(j);
    }

    public final void t(Object obj) {
        long j = ahs.j();
        if (j == ajq.a) {
            this.c = obj;
            return;
        }
        synchronized (this.a) {
            Object obj2 = this.b;
            xgl xglVar = (xgl) ((AtomicReference) obj2).get();
            if (!xglVar.f(j, obj)) {
                ((AtomicReference) obj2).set(xglVar.i(j, obj));
            }
        }
    }

    public final int u(int i, int i2) {
        return ((TypedArray) this.b).getDimensionPixelOffset(i, i2);
    }

    public final int v(int i, int i2) {
        return ((TypedArray) this.b).getDimensionPixelSize(i, i2);
    }

    public final int w(int i, int i2) {
        return ((TypedArray) this.b).getInt(i, i2);
    }

    public final int x(int i, int i2) {
        return ((TypedArray) this.b).getInteger(i, i2);
    }

    public final int y(int i, int i2) {
        return ((TypedArray) this.b).getLayoutDimension(i, i2);
    }

    public final int z(int i, int i2) {
        return ((TypedArray) this.b).getResourceId(i, i2);
    }

    private ahto(SharedPreferences sharedPreferences, Executor executor) {
        this.b = executor;
        this.a = sharedPreferences;
    }

    public ahto(fhd fhdVar) {
        this.b = new PathEffect[2];
        this.c = fhdVar.k;
        this.a = new fgp();
    }

    public ahto(ght ghtVar, gjw gjwVar) {
        this.b = ghtVar;
        this.a = gjwVar;
    }

    public ahto(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public ahto(Runnable runnable, Executor executor, ahto ahtoVar) {
        this.b = runnable;
        this.a = executor;
        this.c = ahtoVar;
    }

    public ahto(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new kjs((char[]) null);
        this.b = new kjs((char[]) null);
        this.c = new an[32];
    }

    public ahto() {
        agdf agdfVar = agdf.a;
        this.c = agdfVar;
        awku awkuVar = new awku(agdfVar);
        this.a = awkuVar;
        this.b = awkuVar.E().u(new rtn(this, 16)).i(new vqh(1));
    }

    public ahto(byte[] bArr, byte[] bArr2) {
        this.b = new AtomicReference(ajp.a);
        this.a = new Object();
    }

    public ahto(abte abteVar, vxz vxzVar) {
        this.a = abteVar;
        this.b = vxzVar;
        this.c = null;
    }

    public ahto(qci qciVar) {
        this.a = qciVar;
        this.b = new ConcurrentHashMap();
    }

    public ahto(byte[] bArr) {
        this.b = new ReentrantReadWriteLock();
        this.a = new HashMap();
    }

    public ahto(View view) {
        this.b = new ArrayList();
        this.a = view;
    }
}
