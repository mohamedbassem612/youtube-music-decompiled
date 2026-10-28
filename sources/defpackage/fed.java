package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fed implements fdx {
    private volatile aerj A;
    private final Object a;
    private final feb b;
    private final fdz c;
    private final Context d;
    private final esc e;
    private final Object f;
    private final Class g;
    private final fdu h;
    private final int i;
    private final int j;
    private final esf k;
    private final fem l;
    private final List m;
    private final few n;
    private final Executor o;
    private ewf p;
    private evu q;
    private long r;
    private Drawable s;
    private Drawable t;
    private int u;
    private int v;
    private boolean w;
    private RuntimeException x;
    private final wkr z = new wkr(null);
    private int y = 1;

    public fed(Context context, esc escVar, Object obj, Object obj2, Class cls, fdu fduVar, int i, int i2, esf esfVar, fem femVar, feb febVar, List list, fdz fdzVar, aerj aerjVar, few fewVar, Executor executor) {
        this.a = obj;
        this.d = context;
        this.e = escVar;
        this.f = obj2;
        this.g = cls;
        this.h = fduVar;
        this.i = i;
        this.j = i2;
        this.k = esfVar;
        this.l = femVar;
        this.b = febVar;
        this.m = list;
        this.c = fdzVar;
        this.A = aerjVar;
        this.n = fewVar;
        this.o = executor;
        if (this.x == null && escVar.f.m(ert.class)) {
            this.x = new RuntimeException("Glide request origin trace");
        }
    }

    private final Drawable h() {
        int i;
        if (this.t == null) {
            fdu fduVar = this.h;
            Drawable drawable = fduVar.f;
            this.t = drawable;
            if (drawable == null && (i = fduVar.g) > 0) {
                this.t = i(i);
            }
        }
        return this.t;
    }

    private final Drawable i(int i) {
        Resources.Theme theme = this.h.p;
        if (theme == null) {
            theme = this.d.getTheme();
        }
        Context context = this.d;
        return fbw.a(context, context, i, theme);
    }

    private final void o() {
        if (this.w) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private final boolean p() {
        fdz fdzVar = this.c;
        return fdzVar == null || fdzVar.h(this);
    }

    private final boolean q() {
        fdz fdzVar = this.c;
        return fdzVar == null || !fdzVar.a().j();
    }

    public final Object a() {
        this.z.b();
        return this.a;
    }

    @Override // defpackage.fdx
    public final void b() {
        synchronized (this.a) {
            o();
            this.z.b();
            double d = ffn.a;
            this.r = SystemClock.elapsedRealtimeNanos();
            if (this.f == null) {
                int i = this.i;
                int i2 = this.j;
                if (ffs.i(i, i2)) {
                    this.u = i;
                    this.v = i2;
                }
                g(new ewb("Received null model"));
                return;
            }
            int i3 = this.y;
            if (i3 == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i3 == 4) {
                e(this.p, 5);
                return;
            }
            List<feb> list = this.m;
            if (list != null) {
                for (feb febVar : list) {
                    if (febVar instanceof fdw) {
                        throw null;
                    }
                }
            }
            this.y = 3;
            int i4 = this.i;
            int i5 = this.j;
            if (ffs.i(i4, i5)) {
                d(i4, i5);
            } else {
                this.l.g(this);
            }
            int i6 = this.y;
            if ((i6 == 2 || i6 == 3) && p()) {
                this.l.e(h());
            }
        }
    }

    @Override // defpackage.fdx
    public final void c() {
        synchronized (this.a) {
            o();
            wkr wkrVar = this.z;
            wkrVar.b();
            if (this.y == 6) {
                return;
            }
            o();
            wkrVar.b();
            this.l.h(this);
            evu evuVar = this.q;
            ewf ewfVar = null;
            if (evuVar != null) {
                synchronized (evuVar.b) {
                    try {
                        ((evx) evuVar.a).h((fed) evuVar.c);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.q = null;
            }
            ewf ewfVar2 = this.p;
            if (ewfVar2 != null) {
                this.p = null;
                ewfVar = ewfVar2;
            }
            fdz fdzVar = this.c;
            if (fdzVar == null || fdzVar.g(this)) {
                this.l.gG(h());
            }
            this.y = 6;
            if (ewfVar != null) {
                aerj aerjVar = this.A;
                ((evz) ewfVar).f();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0103 A[Catch: all -> 0x01e4, TryCatch #0 {all -> 0x01e4, blocks: (B:41:0x0125, B:43:0x0133, B:46:0x01ce, B:44:0x013d, B:48:0x01d0, B:20:0x0092, B:23:0x00a1, B:26:0x00a9, B:28:0x00ae, B:37:0x0103, B:32:0x00cc, B:34:0x00d2, B:35:0x00e4), top: B:64:0x0092, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x010e  */
    /* JADX WARN: Type inference failed for: r5v5, types: [axr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v8, types: [exk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [axr, java.lang.Object] */
    public final void d(int i, int i2) {
        dov dovVar;
        evz evzVar;
        evu evuVar;
        evu evuVar2;
        fed fedVar = this;
        fedVar.z.b();
        synchronized (fedVar.a) {
            if (fedVar.y != 3) {
                return;
            }
            fedVar.y = 2;
            fdu fduVar = fedVar.h;
            float f = fduVar.a;
            fedVar.u = i == Integer.MIN_VALUE ? Integer.MIN_VALUE : Math.round(i * f);
            fedVar.v = i2 != Integer.MIN_VALUE ? Math.round(f * i2) : Integer.MIN_VALUE;
            aerj aerjVar = fedVar.A;
            esc escVar = fedVar.e;
            Object obj = fedVar.f;
            ett ettVar = fduVar.k;
            int i3 = fedVar.u;
            int i4 = fedVar.v;
            Class cls = fduVar.o;
            Class cls2 = fedVar.g;
            esf esfVar = fedVar.k;
            evs evsVar = fduVar.b;
            Map map = fduVar.n;
            boolean z = fduVar.l;
            boolean z2 = fduVar.r;
            ety etyVar = fduVar.m;
            esf esfVar2 = esfVar;
            boolean z3 = fduVar.h;
            boolean z4 = fduVar.s;
            boolean z5 = z3;
            Executor executor = fedVar.o;
            ety etyVar2 = etyVar;
            boolean z6 = z;
            Map map2 = map;
            evy evyVar = new evy(obj, ettVar, i3, i4, map2, cls, cls2, etyVar2);
            dov dovVar2 = escVar.f;
            boolean zM = dovVar2.m(ern.class);
            synchronized (aerjVar) {
                Executor executor2 = executor;
                if (z5) {
                    try {
                        Object obj2 = aerjVar.a;
                        evz evzVarA = ((eve) obj2).a(evyVar);
                        if (evzVarA != null) {
                            if (!zM) {
                                evzVarA.d();
                            } else if (!evzVarA.g()) {
                                evzVarA = null;
                            }
                        }
                        if (evzVarA == null) {
                            ewf ewfVarB = aerjVar.d.b(evyVar);
                            if (ewfVarB == null) {
                                dovVar = dovVar2;
                                evzVar = null;
                            } else {
                                if (ewfVarB instanceof evz) {
                                    dovVar = dovVar2;
                                    evzVar = (evz) ewfVarB;
                                } else {
                                    obj2 = obj2;
                                    evsVar = evsVar;
                                    esfVar2 = esfVar2;
                                    map2 = map2;
                                    etyVar2 = etyVar2;
                                    dovVar = dovVar2;
                                    z6 = z6;
                                    evzVar = new evz(ewfVarB, true, true, evyVar, aerjVar);
                                }
                                if (evzVar != null) {
                                    evzVar.d();
                                    ((eve) obj2).b(evyVar, evzVar);
                                } else {
                                    evzVar = null;
                                }
                            }
                            if (evzVar != null) {
                                evzVar.d();
                                ((eve) obj2).b(evyVar, evzVar);
                            } else {
                                evzVar = null;
                            }
                        } else {
                            esfVar2 = esfVar2;
                            dovVar = dovVar2;
                            evsVar = evsVar;
                            map2 = map2;
                            etyVar2 = etyVar2;
                            z6 = z6;
                            executor2 = executor2;
                            z2 = z2;
                            z5 = z5;
                            evzVar = evzVarA;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    esfVar2 = esfVar2;
                    dovVar = dovVar2;
                    evsVar = evsVar;
                    map2 = map2;
                    etyVar2 = etyVar2;
                    evzVar = null;
                    z6 = z6;
                    executor2 = executor2;
                    z2 = z2;
                    z5 = z5;
                }
                if (evzVar == null) {
                    ?? r6 = ((dov) aerjVar.c).a;
                    evx evxVar = (evx) r6.get(evyVar);
                    if (evxVar != null) {
                        evxVar.f(fedVar, executor2);
                        evuVar2 = new evu(aerjVar, fedVar, evxVar);
                    } else {
                        evx evxVar2 = (evx) ((jnj) aerjVar.f).d.a();
                        evxVar2.i(evyVar, z5, z4);
                        Object obj3 = aerjVar.e;
                        evl evlVar = (evl) ((tgr) obj3).b.a();
                        int i5 = ((tgr) obj3).a;
                        ((tgr) obj3).a = i5 + 1;
                        evk evkVar = evlVar.b;
                        kmm kmmVar = evlVar.r;
                        evkVar.c = escVar;
                        evkVar.d = obj;
                        evkVar.m = ettVar;
                        evkVar.e = i3;
                        evkVar.f = i4;
                        evs evsVar2 = evsVar;
                        evkVar.o = evsVar2;
                        evkVar.g = cls;
                        evkVar.r = kmmVar;
                        evkVar.j = cls2;
                        esf esfVar3 = esfVar2;
                        evkVar.n = esfVar3;
                        ety etyVar3 = etyVar2;
                        evkVar.h = etyVar3;
                        evkVar.i = map2;
                        evkVar.p = z6;
                        evkVar.q = z2;
                        evlVar.c = escVar;
                        evlVar.d = ettVar;
                        evlVar.e = esfVar3;
                        evlVar.f = i3;
                        evlVar.g = i4;
                        evlVar.h = evsVar2;
                        evlVar.i = etyVar3;
                        evlVar.p = evxVar2;
                        evlVar.j = i5;
                        evlVar.o = 1;
                        evlVar.s = dovVar;
                        evlVar.k = a$$ExternalSyntheticApiModelOutline0.m10m(etyVar3.b(evl.a));
                        r6.put(evyVar, evxVar2);
                        fedVar = this;
                        evxVar2.f(fedVar, executor2);
                        evxVar2.e(evlVar);
                        evuVar2 = new evu(aerjVar, fedVar, evxVar2);
                    }
                    evuVar = evuVar2;
                } else {
                    fedVar.e(evzVar, 5);
                    evuVar = null;
                }
            }
            fedVar.q = evuVar;
            if (fedVar.y != 2) {
                fedVar.q = null;
            }
        }
    }

    public final void e(ewf ewfVar, int i) throws Throwable {
        Throwable th;
        boolean zGJ;
        this.z.b();
        ewf ewfVar2 = null;
        try {
            try {
                synchronized (this.a) {
                    try {
                        this.q = null;
                        if (ewfVar == null) {
                            g(new ewb("Expected to receive a Resource<R> with an object of " + this.g.toString() + " inside, but instead got null."));
                            return;
                        }
                        Object objC = ewfVar.c();
                        if (objC == null || !this.g.isAssignableFrom(objC.getClass())) {
                            this.p = null;
                            g(new ewb("Expected to receive an object of " + this.g.toString() + " but instead got " + String.valueOf(objC != null ? objC.getClass() : "") + '{' + String.valueOf(objC) + "} inside Resource{" + ewfVar.toString() + "}." + (objC != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.")));
                        } else {
                            fdz fdzVar = this.c;
                            if (fdzVar == null || fdzVar.i(this)) {
                                boolean zQ = q();
                                this.y = 4;
                                this.p = ewfVar;
                                if (this.e.d <= 3) {
                                    objC.getClass().getSimpleName();
                                    ept.h(i);
                                    String.valueOf(this.f);
                                    double d = ffn.a;
                                    SystemClock.elapsedRealtimeNanos();
                                    double d2 = ffn.a;
                                }
                                if (fdzVar != null) {
                                    fdzVar.e(this);
                                }
                                this.w = true;
                                try {
                                    List<feb> list = this.m;
                                    if (list != null) {
                                        zGJ = false;
                                        for (feb febVar : list) {
                                            zGJ |= febVar.gJ(objC, this.l, i);
                                            if (febVar instanceof fdw) {
                                                zGJ |= ((fdw) febVar).a();
                                            }
                                        }
                                    } else {
                                        zGJ = false;
                                    }
                                    feb febVar2 = this.b;
                                    if (febVar2 != null) {
                                        febVar2.gJ(objC, this.l, i);
                                    }
                                    if (!zGJ) {
                                        this.l.b(objC, this.n.a(i, zQ));
                                    }
                                    this.w = false;
                                    return;
                                } catch (Throwable th2) {
                                    this.w = false;
                                    throw th2;
                                }
                            }
                            this.p = null;
                            this.y = 4;
                        }
                        aerj aerjVar = this.A;
                        ((evz) ewfVar).f();
                    } catch (Throwable th3) {
                        th = th3;
                        ewfVar = null;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                            ewfVar2 = ewfVar;
                            if (ewfVar2 == null) {
                                throw th;
                            }
                            aerj aerjVar2 = this.A;
                            ((evz) ewfVar2).f();
                            throw th;
                        }
                    }
                }
                aerj aerjVar3 = this.A;
                ((evz) ewfVar).f();
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Override // defpackage.fdx
    public final void f() {
        synchronized (this.a) {
            if (n()) {
                c();
            }
        }
    }

    public final void g(ewb ewbVar) {
        boolean zC;
        int i;
        this.z.b();
        synchronized (this.a) {
            int i2 = this.e.d;
            if (i2 <= 5) {
                Log.w("Glide", "Load failed for [" + String.valueOf(this.f) + "] with dimensions [" + this.u + 'x' + this.v + ']', ewbVar);
                if (i2 <= 4) {
                    List listA = ewbVar.a();
                    int size = listA.size();
                    for (int i3 = 0; i3 < size; i3++) {
                    }
                }
            }
            this.q = null;
            this.y = 5;
            fdz fdzVar = this.c;
            if (fdzVar != null) {
                fdzVar.d(this);
            }
            this.w = true;
            try {
                List<feb> list = this.m;
                if (list != null) {
                    zC = false;
                    for (feb febVar : list) {
                        fem femVar = this.l;
                        q();
                        zC |= febVar.c(ewbVar, femVar);
                    }
                } else {
                    zC = false;
                }
                feb febVar2 = this.b;
                if (febVar2 != null) {
                    fem femVar2 = this.l;
                    q();
                    febVar2.c(ewbVar, femVar2);
                }
                if (!zC && p()) {
                    if (this.s == null) {
                        fdu fduVar = this.h;
                        Drawable drawable = fduVar.d;
                        this.s = drawable;
                        if (drawable == null && (i = fduVar.e) > 0) {
                            this.s = i(i);
                        }
                    }
                    Drawable drawableH = this.s;
                    if (drawableH == null) {
                        drawableH = h();
                    }
                    this.l.a(drawableH);
                }
                this.w = false;
            } catch (Throwable th) {
                this.w = false;
                throw th;
            }
        }
    }

    @Override // defpackage.fdx
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.y == 4;
        }
        return z;
    }

    @Override // defpackage.fdx
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.y == 6;
        }
        return z;
    }

    @Override // defpackage.fdx
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.y == 4;
        }
        return z;
    }

    @Override // defpackage.fdx
    public final boolean m(fdx fdxVar) {
        int i;
        int i2;
        Object obj;
        Class cls;
        fdu fduVar;
        esf esfVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        fdu fduVar2;
        esf esfVar2;
        int size2;
        if (!(fdxVar instanceof fed)) {
            return false;
        }
        synchronized (this.a) {
            i = this.i;
            i2 = this.j;
            obj = this.f;
            cls = this.g;
            fduVar = this.h;
            esfVar = this.k;
            List list = this.m;
            size = list != null ? list.size() : 0;
        }
        fed fedVar = (fed) fdxVar;
        synchronized (fedVar.a) {
            i3 = fedVar.i;
            i4 = fedVar.j;
            obj2 = fedVar.f;
            cls2 = fedVar.g;
            fduVar2 = fedVar.h;
            esfVar2 = fedVar.k;
            List list2 = fedVar.m;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i != i3 || i2 != i4) {
            return false;
        }
        char[] cArr = ffs.a;
        if (obj != null) {
            if (!(obj instanceof eys ? ((eys) obj).a() : obj.equals(obj2))) {
                return false;
            }
        } else if (obj2 != null) {
            return false;
        }
        if (!cls.equals(cls2)) {
            return false;
        }
        if (fduVar == null) {
            if (fduVar2 != null) {
                return false;
            }
        } else if (!fduVar.M(fduVar2)) {
            return false;
        }
        return esfVar == esfVar2 && size == size2;
    }

    @Override // defpackage.fdx
    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            int i = this.y;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.a) {
            obj = this.f;
            cls = this.g;
        }
        return super.toString() + "[model=" + String.valueOf(obj) + ", transcodeClass=" + cls.toString() + ']';
    }
}
