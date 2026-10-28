package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afts {
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public afts(Looper looper) {
        this.b = new Object();
        this.d = looper;
        this.c = null;
        this.a = 0;
    }

    public static List o(List list, fly flyVar) {
        if (flyVar == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new fuq((ftg) list.get(i), flyVar));
        }
        return arrayList;
    }

    public static afts u(int i, foe foeVar, boolean z) {
        afts aftsVar = new afts();
        aftsVar.a = i;
        aftsVar.d = foeVar;
        aftsVar.c = z ? new foa() : null;
        return aftsVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    public static afts v(afts aftsVar, afts aftsVar2) {
        afts aftsVarU = u(0, null, false);
        int i = aftsVar != null ? aftsVar.a : 0;
        int i2 = aftsVar2 != null ? aftsVar2.a : 0;
        ?? r6 = aftsVarU.b;
        Object objA = aftsVar != null ? aftsVar.c : null;
        Object obj = aftsVar2 != null ? aftsVar2.c : null;
        if (aftsVar != null) {
            Iterator it = aftsVar.b.iterator();
            while (it.hasNext()) {
                r6.add((fnz) it.next());
            }
        }
        if (aftsVar2 != null) {
            for (fnz fnzVar : aftsVar2.b) {
                List list = fnz.a;
                int i3 = fnzVar.d;
                r6.add(new fnz(fnzVar.b, fnzVar.c + i, i3 >= 0 ? i3 + i : -1, fnzVar.e, fnzVar.f, fnzVar.g, fnzVar.h, fnzVar.i));
            }
        }
        aftsVarU.a = i + i2;
        if (objA == null) {
            objA = obj;
        } else if (obj != null) {
            objA = ((foa) objA).a((foa) obj);
        }
        aftsVarU.c = objA;
        return aftsVarU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void w(afwn afwnVar, cc ccVar, boolean z) {
        if (ccVar.getContext() != null) {
            for (cc ccVar2 : ccVar.getChildFragmentManager().k()) {
                if (ccVar2 instanceof afvj) {
                    ((afvj) ccVar2).setAnimationRef(afwnVar, z);
                } else {
                    w(afwnVar, ccVar2, z);
                }
            }
        }
    }

    private final PackageInfo x(String str) {
        try {
            return ((Context) this.b).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseInstanceId", "Failed to find package ".concat(e.toString()));
            return null;
        }
    }

    private final synchronized void y() {
        PackageInfo packageInfoX = x(((Context) this.b).getPackageName());
        if (packageInfoX != null) {
            this.c = Integer.toString(packageInfoX.versionCode);
            this.d = packageInfoX.versionName;
        }
    }

    public final afvn a(String str) {
        if (afty.o()) {
            return afwt.c(164, str);
        }
        cf activity = ((cc) this.b).getActivity();
        activity.getClass();
        return ((afvs) atqp.a(activity, afvs.class)).as().d(str, 163);
    }

    public final afvn b() {
        try {
            return c();
        } finally {
            this.c = null;
            this.d = null;
            this.a = 0;
        }
    }

    public final afvn c() {
        Object obj = this.d;
        if (obj != null) {
            return ((afwn) obj).a();
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            return ((afwn) obj2).a();
        }
        afty.t();
        return new aftu(1);
    }

    public final afvn d() {
        afty.t();
        aftu aftuVar = new aftu(1);
        if (this.a > 0) {
            g(new afwn(afty.c(false)), false);
        }
        return aftuVar;
    }

    public final afvn e(String str) {
        afty.l();
        return new afsy(afty.h(), afty.o() ? afwt.c(166, str) : ((aftr) aguu.av(((cc) this.b).getContext(), aftr.class)).as().d(str, 165), 3);
    }

    public final void f(boolean z) {
        g(z ? afwn.b() : null, true);
    }

    public final void g(afwn afwnVar, boolean z) {
        if (z) {
            int i = this.a;
            if (afwnVar == null) {
                int i2 = i - 1;
                if (i2 < 0) {
                    i2 = 0;
                }
                this.a = i2;
                if (i2 == 0) {
                    this.c = null;
                    return;
                }
                return;
            }
            this.a = i + 1;
        }
        this.c = afwnVar;
        w(afwnVar, (cc) this.b, z);
    }

    public final afvn h(int i, int i2) {
        afvn afvnVarG = afty.g();
        if (i != 0 || i2 != 0) {
            g(afwn.b(), true);
        }
        return afvnVarG;
    }

    public final void i() {
        afty.t();
        if (this.a > 0) {
            g(new afwn(afty.c(false)), false);
        }
    }

    public final synchronized int j() {
        PackageInfo packageInfoX;
        if (this.a == 0 && (packageInfoX = x("com.google.android.gms")) != null) {
            this.a = packageInfoX.versionCode;
        }
        return this.a;
    }

    public final synchronized String k() {
        if (this.c == null) {
            y();
        }
        return (String) this.c;
    }

    public final synchronized String l() {
        if (this.d == null) {
            y();
        }
        return (String) this.d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final int m() {
        return this.b.size();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final fnz n(int i) {
        return (fnz) this.b.get(i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final void p(fnz fnzVar) {
        int i;
        int i2;
        Object obj;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        this.b.add(fnzVar);
        int i10 = fnzVar.b;
        if (i10 != -3) {
            if (i10 == -1) {
                i = fnzVar.e;
            } else if (i10 != 1) {
                i2 = i10 != 3 ? 0 : -1;
            } else {
                i2 = 1;
            }
            this.a += i2;
            obj = this.c;
            if (obj != null) {
                if (i10 != -3) {
                    if (i10 != -2) {
                        if (i10 != -1) {
                            i5 = fnzVar.e;
                            i4 = 0;
                            i6 = 0;
                        } else if (i10 != 0) {
                            if (i10 != 1) {
                                i4 = 1;
                                i5 = 0;
                                i6 = 0;
                            } else if (i10 != 2) {
                                i6 = 1;
                                i4 = 0;
                                i5 = 0;
                                i3 = 0;
                                i7 = i3;
                            } else {
                                i7 = 1;
                                i4 = 0;
                                i5 = 0;
                                i6 = 0;
                                i3 = 0;
                                i9 = 0;
                            }
                            i8 = i9;
                        } else {
                            i8 = fnzVar.e;
                            i4 = 0;
                            i5 = 0;
                            i6 = 0;
                            i3 = 0;
                            i7 = 0;
                            i9 = 0;
                        }
                        i3 = i6;
                        i7 = i3;
                    } else {
                        i9 = fnzVar.e;
                        i4 = 0;
                        i5 = 0;
                        i6 = 0;
                        i3 = 0;
                        i7 = 0;
                        i8 = 0;
                    }
                    this.c = ((foa) obj).a(new foa(i2, i4, i5, i6, i3, i7, i9, i8));
                }
                i3 = fnzVar.e;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                i9 = i7;
                i8 = i9;
                this.c = ((foa) obj).a(new foa(i2, i4, i5, i6, i3, i7, i9, i8));
            }
        }
        i = -fnzVar.e;
        i2 = i;
        this.a += i2;
        obj = this.c;
        if (obj != null) {
            if (i10 != -3) {
                if (i10 != -2) {
                    if (i10 != -1) {
                        i5 = fnzVar.e;
                        i4 = 0;
                        i6 = 0;
                    } else if (i10 != 0) {
                        if (i10 != 1) {
                            i4 = 1;
                            i5 = 0;
                            i6 = 0;
                        } else if (i10 != 2) {
                            i6 = 1;
                            i4 = 0;
                            i5 = 0;
                            i3 = 0;
                            i7 = i3;
                        } else {
                            i7 = 1;
                            i4 = 0;
                            i5 = 0;
                            i6 = 0;
                            i3 = 0;
                            i9 = 0;
                        }
                        i8 = i9;
                    } else {
                        i8 = fnzVar.e;
                        i4 = 0;
                        i5 = 0;
                        i6 = 0;
                        i3 = 0;
                        i7 = 0;
                        i9 = 0;
                    }
                    i3 = i6;
                    i7 = i3;
                } else {
                    i9 = fnzVar.e;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    i3 = 0;
                    i7 = 0;
                    i8 = 0;
                }
                this.c = ((foa) obj).a(new foa(i2, i4, i5, i6, i3, i7, i9, i8));
            }
            i3 = fnzVar.e;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i9 = i7;
            i8 = i9;
            this.c = ((foa) obj).a(new foa(i2, i4, i5, i6, i3, i7, i9, i8));
        }
    }

    public final void q(int i, Object obj) {
        p(fnz.c(i, obj));
    }

    public final void r(int i, ftg ftgVar, fly flyVar, Object obj) {
        Object obj2 = this.d;
        if (obj2 != null) {
            ftgVar.n(((foe) obj2).k);
        }
        p(fnz.b(1, i, new fuq(ftgVar, flyVar), null, obj));
    }

    public final void s(int i, ftg ftgVar, fly flyVar, Object obj, Object obj2) {
        p(fnz.b(2, i, new fuq(ftgVar, flyVar), obj, obj2));
    }

    public final void t() {
        Object obj;
        synchronized (this.b) {
            ahno.O(this.a > 0);
            int i = this.a - 1;
            this.a = i;
            if (i == 0 && (obj = this.c) != null) {
                ((HandlerThread) obj).quit();
                this.c = null;
                this.d = null;
            }
        }
    }

    public afts(Context context) {
        this.b = context;
    }

    public afts(cc ccVar) {
        this.a = 0;
        this.b = ccVar;
    }

    private afts() {
        this.b = new ArrayList();
    }
}
