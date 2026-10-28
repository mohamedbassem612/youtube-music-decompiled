package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gam implements gal {
    protected static volatile gbg a;
    protected MotionEvent b;
    protected double k;
    protected float l;
    protected float m;
    protected float n;
    protected float o;
    protected DisplayMetrics q;
    protected heg r;
    private double s;
    private double t;
    protected final LinkedList c = new LinkedList();
    protected long d = 0;
    protected long e = 0;
    protected long f = 0;
    protected long g = 0;
    protected long h = 0;
    protected long i = 0;
    protected long j = 0;
    private boolean u = false;
    protected boolean p = false;

    protected gam(Context context) {
        try {
            fzu.a();
            this.q = context.getResources().getDisplayMetrics();
            if (((Boolean) jwp.p.d()).booleanValue()) {
                this.r = new heg((char[]) null, (char[]) null);
            }
        } catch (Throwable unused) {
        }
    }

    private final void n() {
        this.h = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.i = 0L;
        this.j = 0L;
        LinkedList linkedList = this.c;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.b;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.b = null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    private final String o(Context context, String str, int i, View view, Activity activity) {
        gak gakVar;
        String str2;
        boolean z;
        char c;
        char c2;
        Exception exc;
        int i2;
        int i3;
        int i4;
        int i5;
        fxg fxgVarL;
        int i6;
        int i7;
        ?? r3 = i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) jwp.i.d()).booleanValue();
        fxg fxgVarB = null;
        if (zBooleanValue) {
            gakVar = a != null ? a.j : null;
            str2 = "be";
        } else {
            gakVar = null;
            str2 = null;
        }
        try {
            if (r3 == 3) {
                fxgVarB = b(context, view, activity);
                try {
                    this.u = true;
                    i7 = 1002;
                } catch (Exception e) {
                    exc = e;
                    z = true;
                    c = 2;
                    c2 = 3;
                    if (zBooleanValue) {
                        if (r3 == c2) {
                            i3 = 1003;
                        } else {
                            if (r3 == c) {
                                i3 = 1009;
                            } else {
                                i2 = 1001;
                                r3 = z;
                            }
                            gakVar.a(i2, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                        }
                        i2 = i3;
                        r3 = r3;
                        gakVar.a(i2, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                }
            } else {
                if (r3 == 2) {
                    fxgVarL = h(context, view, activity);
                    i6 = 1008;
                } else {
                    fxgVarL = l(context);
                    i6 = 1000;
                }
                fxgVarB = fxgVarL;
                i7 = i6;
            }
            if (!zBooleanValue || gakVar == null) {
                z = true;
                c = 2;
                c2 = 3;
            } else {
                c2 = 3;
                c = 2;
                z = true;
                try {
                    gakVar.a(i7, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    if (zBooleanValue && gakVar != null) {
                        if (r3 == c2) {
                            i3 = 1003;
                        } else {
                            if (r3 == c) {
                                i3 = 1009;
                            } else {
                                i2 = 1001;
                                r3 = z;
                            }
                            gakVar.a(i2, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                        }
                        i2 = i3;
                        r3 = r3;
                        gakVar.a(i2, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            z = true;
            c = 2;
            c2 = 3;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (fxgVarB != null) {
            try {
                if (((fxl) fxgVarB.build()).getSerializedSize() != 0) {
                    fxl fxlVar = (fxl) fxgVarB.build();
                    MessageDigest messageDigest = fzu.c;
                    aihf aihfVarE = fzu.e(fxlVar.toByteArray(), str);
                    String strEncodeToString = Base64.encodeToString(aihfVarE == null ? fzu.c(fzu.f().toByteArray(), str, z) : ((fxp) aihfVarE.build()).toByteArray(), 11);
                    if (!zBooleanValue || gakVar == null) {
                        return strEncodeToString;
                    }
                    if (r3 == c2) {
                        i5 = 1006;
                    } else {
                        i5 = r3 == c ? 1010 : 1004;
                    }
                    gakVar.a(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                    return strEncodeToString;
                }
            } catch (Exception e4) {
                if (zBooleanValue && gakVar != null) {
                    if (r3 == c2) {
                        i4 = 1007;
                    } else {
                        i4 = r3 == c ? 1011 : 1005;
                    }
                    gakVar.a(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, e4);
                }
                return "7";
            }
        }
        return "5";
    }

    protected abstract long a(StackTraceElement[] stackTraceElementArr);

    protected abstract fxg b(Context context, View view, Activity activity);

    @Override // defpackage.gal
    public final String c(Context context, String str, View view, Activity activity) {
        return o(context, str, 3, view, activity);
    }

    @Override // defpackage.gal
    public final String d(Context context) {
        char[] cArr = gbj.a;
        if (a.x()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return o(context, null, 1, null, null);
    }

    @Override // defpackage.gal
    public final String e(Context context, View view, Activity activity) {
        return o(context, null, 2, view, activity);
    }

    @Override // defpackage.gal
    public final synchronized void f(MotionEvent motionEvent) {
        Long l;
        if (this.u) {
            n();
            this.u = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.k = 0.0d;
            this.s = motionEvent.getRawX();
            this.t = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = rawX - this.s;
            double d2 = rawY - this.t;
            this.k += Math.sqrt((d * d) + (d2 * d2));
            this.s = rawX;
            this.t = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    this.b = motionEventObtain;
                    LinkedList linkedList = this.c;
                    linkedList.add(motionEventObtain);
                    if (linkedList.size() > 6) {
                        ((MotionEvent) linkedList.remove()).recycle();
                    }
                    this.f++;
                    this.h = a(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.e += (long) (motionEvent.getHistorySize() + 1);
                    gbi gbiVarJ = j(motionEvent);
                    Long l2 = gbiVarJ.d;
                    if (l2 != null && gbiVarJ.g != null) {
                        this.i += l2.longValue() + gbiVarJ.g.longValue();
                    }
                    if (this.q != null && (l = gbiVarJ.e) != null && gbiVarJ.h != null) {
                        this.j += l.longValue() + gbiVarJ.h.longValue();
                    }
                } else if (action2 == 3) {
                    this.g++;
                }
            } catch (gbb unused) {
            }
        } else {
            this.l = motionEvent.getX();
            this.m = motionEvent.getY();
            this.n = motionEvent.getRawX();
            this.o = motionEvent.getRawY();
            this.d++;
        }
        this.p = true;
    }

    @Override // defpackage.gal
    public final synchronized void g(int i, int i2, int i3) {
        if (this.b != null) {
            if (((Boolean) jwp.h.d()).booleanValue()) {
                n();
            } else {
                this.b.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.q;
        if (displayMetrics != null) {
            this.b = MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, i2 * this.q.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.b = null;
        }
        this.p = false;
    }

    protected abstract fxg h(Context context, View view, Activity activity);

    protected abstract gbi j(MotionEvent motionEvent);

    @Override // defpackage.gal
    public final boolean k() {
        return true;
    }

    protected abstract fxg l(Context context);

    @Override // defpackage.gal
    public final boolean m() {
        return true;
    }

    @Override // defpackage.gal
    public void i(View view) {
    }
}
