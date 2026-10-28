package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.LruCache;
import android.util.SparseArray;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ablx {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/features/storyboard/StoryboardClient");
    private final avmm A;
    private grj B;
    public final Executor b;
    public final Set c;
    public final LruCache d;
    public final awku e;
    public long f;
    public Bitmap g;
    public long h;
    public Bitmap i;
    public final Object l;
    public boolean m;
    public final abmt o;
    public int p;
    public final vxz q;
    private final adhv r;
    private final Executor s;
    private final sxu t;
    private final abnc u;
    private final abvn v;
    private final vyo w;
    private boolean x;
    private final AtomicBoolean y;
    private Optional z;
    public boolean j = false;
    public boolean k = false;
    public boolean n = false;

    public ablx(adhv adhvVar, Executor executor, Executor executor2, abnc abncVar, abvn abvnVar, vyo vyoVar, vxz vxzVar, abmt abmtVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.y = atomicBoolean;
        avmm avmmVar = new avmm();
        this.A = avmmVar;
        adhvVar.getClass();
        this.r = adhvVar;
        this.s = executor;
        this.b = executor2;
        this.l = new Object();
        this.c = Collections.newSetFromMap(new WeakHashMap());
        this.u = abncVar;
        this.v = abvnVar;
        this.w = vyoVar;
        this.p = 0;
        this.o = abmtVar;
        this.d = new LruCache(10);
        this.e = new awku(Optional.empty());
        this.z = Optional.empty();
        this.f = -1L;
        this.h = -1L;
        this.t = new ablv(this, 0);
        if (!abmtVar.p.l(192, 45787901L, false)) {
            int i = 1;
            if (atomicBoolean.compareAndSet(false, true)) {
                avmn[] avmnVarArr = new avmn[5];
                int i2 = 13;
                avmnVarArr[0] = ((avlh) (abvnVar.g().cg() ? abvnVar.r().t : abvnVar.r().i)).i(aawb.y(abvnVar.X(), 268435456L)).i(new abwr(i)).al(new aawl(new abhb(this, 14), "SbC", 2), new abeq(i2));
                avmnVarArr[1] = ((avlh) abvnVar.r().n).i(aawb.y(abvnVar.X(), 268435456L)).i(new abwr(i)).al(new abhb(this, 16), new abeq(i2));
                avmnVarArr[2] = abvnVar.H().al(new abhb(this, 17), new abeq(i2));
                avmnVarArr[3] = abvnVar.M(new abhg(7), new abhg(6)).P().i(new abwr(i)).al(new abhb(this, i2), new abeq(i2));
                avmnVarArr[4] = abvnVar.C().al(new abhb(this, 15), new abeq(i2));
                avmmVar.e(avmnVarArr);
            }
        }
        this.q = vxzVar;
    }

    public static final Uri f(ablz ablzVar, int i) {
        String string;
        int iFloor = (int) Math.floor(i / ablzVar.c());
        if (iFloor < 0 || iFloor >= ablzVar.d()) {
            string = null;
        } else {
            SparseArray sparseArray = ablzVar.i;
            string = (String) sparseArray.get(iFloor);
            if (string == null) {
                tyt tytVar = new tyt(Uri.parse(ablzVar.g.replace("$N", ablzVar.e).replace("$L", String.valueOf(ablzVar.h)).replace("$M", String.valueOf(iFloor))));
                tytVar.f("sigh", ablzVar.f);
                string = tytVar.a().toString();
                sparseArray.put(iFloor, string);
            }
        }
        if (string != null) {
            return Uri.parse(string);
        }
        return null;
    }

    public final int a(ablz ablzVar, int i) {
        if ((!this.j || this.k) && !this.u.k) {
            return 8;
        }
        Uri uriF = f(ablzVar, i);
        if (uriF != null) {
            this.r.m(uriF, this.t);
        }
        return 4;
    }

    public final synchronized void b(ablw ablwVar) {
        this.c.add(ablwVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    public final void c(wjf wjfVar) {
        String[] strArrSplit;
        int length;
        grj grjVar;
        aoqs aoqsVarR;
        String strE = wjfVar.E();
        boolean z = strE == null && (aoqsVarR = abmt.r(this.w)) != null && aoqsVarR.t && (strE = wjfVar.D()) != null;
        d();
        int iA = wjfVar.a();
        if (z) {
            avgj avgjVarAD = this.v.aD();
            if (strE != null) {
                String[] strArrSplit2 = strE.split("#", -1);
                grjVar = new grj(Arrays.asList(new abma(strArrSplit2[1] + '#' + strArrSplit2[2] + "#0#" + strArrSplit2[3] + '#' + strArrSplit2[4] + "#-1#" + strArrSplit2[0] + '#', avgjVarAD)));
            } else {
                grjVar = null;
            }
        } else {
            long j = iA;
            if (strE != null) {
                long j2 = j * 1000;
                if (j2 <= 0 || (length = (strArrSplit = strE.split("\\|")).length) <= 1) {
                    grjVar = null;
                } else {
                    String str = strArrSplit[0];
                    String[] strArr = (String[]) Arrays.copyOfRange(strArrSplit, 1, length);
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < strArr.length; i++) {
                        try {
                            String str2 = strArr[i];
                            arrayList.add(i, ahno.aa(str2) ? null : new ablz(str, i, str2, j2));
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    grjVar = new grj(arrayList);
                }
            } else {
                grjVar = null;
            }
        }
        this.B = grjVar;
        this.p = wjfVar.c();
        this.x = true;
        Optional optionalOf = Optional.of(Integer.valueOf(wjfVar.b()));
        this.z = optionalOf;
        awku awkuVar = this.e;
        grj grjVar2 = this.B;
        awkuVar.kk(Optional.ofNullable(grjVar2 != null ? grjVar2.r(((Integer) optionalOf.get()).intValue()) : null));
    }

    public final void d() {
        this.o.bY();
        if (this.f == -1 && this.h == -1) {
            return;
        }
        synchronized (this.l) {
            this.B = null;
            this.j = false;
            this.k = false;
            this.d.evictAll();
            this.g = null;
            this.i = null;
            this.f = -1L;
            this.h = -1L;
            this.m = false;
            this.n = false;
            this.x = false;
            this.z = Optional.empty();
            this.e.kk(Optional.empty());
            g(this.i);
        }
    }

    public final boolean e() {
        grj grjVar = this.B;
        if (grjVar == null || !this.x) {
            return false;
        }
        ablz ablzVarR = grjVar.r(0);
        return !(ablzVarR instanceof abma) || ablzVarR.b() > 0;
    }

    public final synchronized void g(Bitmap bitmap) {
        this.s.execute(new abaq(this, bitmap != null ? ably.a(bitmap) : null, 8));
    }

    public final synchronized void h() {
        this.s.execute(new abbj(this, 10));
    }
}
