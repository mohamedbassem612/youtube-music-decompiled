package defpackage;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaRouter2;
import android.media.VolumeProvider;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dgr {
    static final axp a = new dgj();
    private final boolean E;
    private final dik F;
    private dhh G;
    final dje d;
    public dii e;
    public dhn f;
    dig g;
    public final Context h;
    public final boolean n;
    public dgz o;
    public final div p;
    public dim q;
    public dii r;
    public dii s;
    public dii t;
    public dhn u;
    public dhh w;
    public int x;
    public dgn y;
    public fg z;
    final dgl b = new dgl(this);
    final Map c = new HashMap();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final Map k = new HashMap();
    public final Map l = new HashMap();
    private final ArrayList B = new ArrayList();
    private final ArrayList C = new ArrayList();
    public final djf m = new djf();
    private final dgo D = new dgo(this);
    public int v = 0;
    final dhj A = new dgk(this);

    /* JADX WARN: Code duplicated, block: B:21:0x00d0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.lang.Runnable] */
    public dgr(Context context) {
        this.h = context;
        this.n = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        boolean z = Build.VERSION.SDK_INT >= 30 && ((Boolean) a.a(context)).booleanValue();
        this.E = z;
        Intent intent = new Intent(context, (Class<?>) dji.class);
        intent.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.o = (Build.VERSION.SDK_INT < 30 || !z) ? null : new dgz(context, new hhb(this));
        context.getPackageName();
        dir dirVar = new dir(context, this);
        this.p = dirVar;
        if (Build.VERSION.SDK_INT < 36 || a.at() < 3600001) {
            Map map = Collections.EMPTY_MAP;
            new ArrayList();
            context.getPackageName();
        } else {
            Map map2 = ef.a;
            if (!ed.a() || this.o == null) {
                Map map3 = Collections.EMPTY_MAP;
                new ArrayList();
                context.getPackageName();
            }
        }
        this.F = new dik(new px(this, 6));
        i(dirVar, true);
        dhp dhpVar = this.o;
        if (dhpVar != null) {
            i(dhpVar, true);
        }
        dje djeVar = new dje(context, this);
        this.d = djeVar;
        if (djeVar.b) {
            return;
        }
        djeVar.b = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme("package");
        ((Context) djeVar.c).registerReceiver((BroadcastReceiver) djeVar.f, intentFilter, null, (Handler) djeVar.d);
        ((Handler) djeVar.d).post(djeVar.g);
    }

    private final int u(String str) {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((dii) arrayList.get(i)).d.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private final boolean v(dii diiVar) {
        return diiVar.d() == this.p && diiVar.q("android.media.intent.category.LIVE_AUDIO") && !diiVar.q("android.media.intent.category.LIVE_VIDEO");
    }

    final int a(dii diiVar, dhg dhgVar) {
        int iC = diiVar.c(dhgVar);
        if (iC != 0) {
            if ((iC & 1) != 0) {
                this.b.a(259, diiVar);
            }
            if ((iC & 2) != 0) {
                this.b.a(260, diiVar);
            }
            if ((iC & 4) != 0) {
                this.b.a(261, diiVar);
            }
        }
        return iC;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    public final dhn b(dii diiVar) {
        dhn dhnVar;
        Iterator it;
        dhn dhnVar2;
        if (diiVar == this.e && (dhnVar2 = this.f) != null) {
            return dhnVar2;
        }
        if (diiVar instanceof dif) {
            dij.c();
            if (dij.a().h().contains((dif) diiVar)) {
                Iterator it2 = this.k.values().iterator();
                while (it2.hasNext()) {
                    dif difVar = ((dgp) it2.next()).b;
                }
            } else {
                dhnVar = (dhn) this.c.get(diiVar.d);
                if (dhnVar == null) {
                    return dhnVar;
                }
                it = this.k.values().iterator();
                if (it.hasNext()) {
                    Map map = ((dgp) it.next()).a;
                    throw null;
                }
            }
        } else {
            dhnVar = (dhn) this.c.get(diiVar.d);
            if (dhnVar == null) {
                return dhnVar;
            }
            it = this.k.values().iterator();
            if (it.hasNext()) {
                Map map2 = ((dgp) it.next()).a;
                throw null;
            }
        }
        return null;
    }

    public final dih c(dhp dhpVar) {
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            dih dihVar = (dih) arrayList.get(i);
            i++;
            if (dihVar.a == dhpVar) {
                return dihVar;
            }
        }
        return null;
    }

    public final dii d() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dii diiVar = (dii) arrayList.get(i);
            if (diiVar != this.r && v(diiVar) && diiVar.n()) {
                return diiVar;
            }
        }
        return this.r;
    }

    public final dii e() {
        dii diiVar = this.r;
        if (diiVar != null) {
            return diiVar;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    public final dii f() {
        dii diiVar = this.e;
        if (diiVar != null) {
            return diiVar;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    final String g(dih dihVar, String str) {
        String strFlattenToShortString = dihVar.a().flattenToShortString();
        boolean z = dihVar.c;
        String strCl = z ? str : a.cl(str, (byte) 58, strFlattenToShortString);
        if (z || u(strCl) < 0) {
            this.l.put(new axq(strFlattenToShortString, str), strCl);
            return strCl;
        }
        Log.w("AxMediaRouter", a.ct(strFlattenToShortString, str, "Either ", " isn't unique in ", " or we're trying to assign a unique ID for an already added route"));
        int i = 2;
        while (true) {
            String str2 = String.format(Locale.US, "%s_%d", strCl, Integer.valueOf(i));
            if (u(str2) < 0) {
                this.l.put(new axq(strFlattenToShortString, str), str2);
                return str2;
            }
            i++;
        }
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            dif difVar = ((dgp) it.next()).b;
        }
        return arrayList;
    }

    public final void i(dhp dhpVar, boolean z) {
        if (c(dhpVar) == null) {
            dih dihVar = new dih(dhpVar, z);
            this.B.add(dihVar);
            this.b.a(513, dihVar);
            q(dihVar, dhpVar.j);
            dhpVar.gC(this.D);
            dhpVar.gA(this.G);
        }
    }

    final void j() {
        dhn dhnVarGy;
        if (this.e.m()) {
            List<dii> listF = this.e.f();
            HashSet hashSet = new HashSet();
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                hashSet.add(((dii) it.next()).d);
            }
            Map map = this.c;
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    dhn dhnVar = (dhn) entry.getValue();
                    dhnVar.q(0);
                    dhnVar.b();
                    it2.remove();
                }
            }
            for (dii diiVar : listF) {
                String str = diiVar.d;
                if (!map.containsKey(str) && (dhnVarGy = diiVar.d().gy(diiVar.c, this.e.c)) != null) {
                    dhnVarGy.p();
                    map.put(str, dhnVarGy);
                }
            }
        }
    }

    final void k(dgr dgrVar, dii diiVar, dhn dhnVar, int i, int i2, boolean z, dii diiVar2, Collection collection) {
        dig digVar = this.g;
        if (digVar != null) {
            digVar.a();
            this.g = null;
        }
        dig digVar2 = new dig(dgrVar, diiVar, dhnVar, i, z, diiVar2, collection);
        this.g = digVar2;
        int i3 = digVar2.b;
        digVar2.b();
    }

    public final void l(dhp dhpVar) {
        dih dihVarC = c(dhpVar);
        if (dihVarC != null) {
            dhpVar.gC(null);
            dhpVar.gA(null);
            q(dihVarC, null);
            this.b.a(514, dihVarC);
            this.B.remove(dihVarC);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void m(defpackage.dii r5, int r6, int r7, boolean r8) {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.j
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = "AxMediaRouter"
            if (r0 != 0) goto L1b
            java.util.Objects.toString(r5)
            java.lang.String r4 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "Ignoring attempt to select removed route: "
            java.lang.String r4 = r5.concat(r4)
            android.util.Log.w(r1, r4)
            return
        L1b:
            boolean r0 = r5.h
            if (r0 == 0) goto Lae
            dii r0 = r4.e
            if (r0 == r5) goto L4e
            if (r0 == 0) goto L2a
            dif r0 = r0.e()
            goto L2b
        L2a:
            r0 = 0
        L2b:
            if (r0 == 0) goto L5f
            java.util.List r2 = r0.f()
            int r2 = r2.size()
            r3 = 1
            if (r2 != r3) goto L5f
            java.lang.String r2 = r5.d
            java.util.Map r0 = r0.a
            java.lang.Object r0 = r0.get(r2)
            dhi r0 = (defpackage.dhi) r0
            if (r0 == 0) goto L47
            int r0 = r0.b
            goto L48
        L47:
            r0 = 4
        L48:
            r2 = 3
            if (r0 == r2) goto L4e
            r2 = 2
            if (r0 != r2) goto L5f
        L4e:
            java.util.Objects.toString(r5)
            java.lang.String r4 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "Ignoring attempt to select selected route: "
            java.lang.String r4 = r5.concat(r4)
            android.util.Log.w(r1, r4)
            goto Lbe
        L5f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Laa
            dhp r0 = r5.d()
            dgz r1 = r4.o
            if (r0 != r1) goto Laa
            dii r0 = r4.e
            if (r0 == r5) goto Laa
            java.lang.String r4 = r5.c
            android.media.MediaRoute2Info r5 = r1.a(r4)
            java.lang.String r6 = "MR2Provider"
            if (r5 != 0) goto L89
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "transferTo: Specified route not found. routeId="
            java.lang.String r4 = r5.concat(r4)
            android.util.Log.w(r6, r4)
            goto Lbe
        L89:
            java.lang.String r7 = r1.d
            boolean r7 = android.text.TextUtils.equals(r7, r4)
            if (r7 == 0) goto La2
            java.util.Objects.toString(r5)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "Ignoring attempt to transfer to pending transfer route: "
            java.lang.String r4 = r5.concat(r4)
            android.util.Log.w(r6, r4)
            goto Lbe
        La2:
            r1.d = r4
            android.media.MediaRouter2 r4 = r1.a
            defpackage.aaj$$ExternalSyntheticApiModelOutline0.m(r4, r5)
            goto Lbe
        Laa:
            r4.n(r5, r6, r7, r8)
            goto Lbe
        Lae:
            java.util.Objects.toString(r5)
            java.lang.String r4 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "Ignoring attempt to select disabled route: "
            java.lang.String r4 = r5.concat(r4)
            android.util.Log.w(r1, r4)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgr.m(dii, int, int, boolean):void");
    }

    public final void n(dii diiVar, int i, int i2, boolean z) {
        dhq dhqVar;
        String str;
        if (this.e != diiVar) {
            dii diiVar2 = this.r;
            if (this.s != null && diiVar == diiVar2) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder sb = new StringBuilder("- Stacktrace: [");
                int i3 = 3;
                while (true) {
                    int length = stackTrace.length;
                    if (i3 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i3];
                    sb.append(stackTraceElement.getClassName());
                    sb.append('.');
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(':');
                    sb.append(stackTraceElement.getLineNumber());
                    i3++;
                    if (i3 < length) {
                        sb.append(", ");
                    }
                }
                sb.append(']');
                if (this.e != null) {
                    Locale locale = Locale.US;
                    dii diiVar3 = this.e;
                    str = String.format(locale, "%s(BT=%b, syncMediaRoute1Provider=%b)", diiVar3.e, Boolean.valueOf(diiVar3.j()), Boolean.valueOf(z));
                } else {
                    str = null;
                }
                Log.w("AxMediaRouter", "Changing selection(" + str + ") to default while BT is available: pkgName=" + this.h.getPackageName() + ((Object) sb));
            }
            if (this.t != null) {
                this.t = null;
                dhn dhnVar = this.u;
                if (dhnVar != null) {
                    dhnVar.q(3);
                    this.u.b();
                    this.u = null;
                }
                this.v = 0;
            }
            if (s() && (dhqVar = diiVar.b.d) != null && dhqVar.c) {
                dhp dhpVarD = diiVar.d();
                String str2 = diiVar.c;
                Bundle bundle = new Bundle();
                Context context = this.h;
                bundle.putString("clientPackageName", context.getPackageName());
                dhk dhkVarGw = dhpVarD.gw(str2, new dho(bundle));
                if (dhkVarGw != null) {
                    dhkVarGw.s(avg.e(context), this.A);
                    this.t = diiVar;
                    this.u = dhkVarGw;
                    this.v = i2;
                    dhkVarGw.p();
                    return;
                }
                Objects.toString(diiVar);
                Log.w("AxMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=".concat(String.valueOf(diiVar)));
            }
            dhp dhpVarD2 = diiVar.d();
            String str3 = diiVar.c;
            Bundle bundle2 = new Bundle();
            bundle2.putString("clientPackageName", this.h.getPackageName());
            dhn dhnVarGx = dhpVarD2.gx(str3, new dho(bundle2));
            if (dhnVarGx != null) {
                dhnVarGx.p();
            }
            if (this.e != null) {
                k(this, diiVar, dhnVarGx, i, i2, z, null, null);
                return;
            }
            this.e = diiVar;
            this.f = dhnVarGx;
            afft afftVar = new afft(null, null);
            afftVar.a = i;
            this.b.b(null, diiVar, new ytt(afftVar), z);
        }
    }

    public final void o() {
        int i;
        dhh dhhVar;
        heg hegVar = new heg((char[]) null);
        dik dikVar = this.F;
        dikVar.b();
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            dij dijVar = (dij) ((WeakReference) arrayList.get(size)).get();
            if (dijVar == null) {
                arrayList.remove(size);
            } else {
                ArrayList arrayList2 = dijVar.c;
                int size2 = arrayList2.size();
                i2 += size2;
                int i4 = 0;
                while (i4 < size2) {
                    die dieVar = (die) arrayList2.get(i4);
                    hegVar.n(dieVar.b);
                    int i5 = dieVar.c & 1;
                    int i6 = i2;
                    dikVar.a(1 == i5, dieVar.d);
                    int i7 = i5 | i3;
                    int i8 = dieVar.c;
                    if ((i8 & 4) != 0 && !this.n) {
                        i7 = 1;
                    }
                    i3 = (((i8 & 8) != 0 ? 0 : 1) ^ 1) | i7;
                    i4++;
                    i2 = i6;
                }
            }
        }
        boolean zC = dikVar.c();
        this.x = i2;
        did didVarK = i3 != 0 ? hegVar.k() : did.a;
        did didVarK2 = hegVar.k();
        if (s() && ((dhhVar = this.w) == null || !dhhVar.a().equals(didVarK2) || this.w.b() != zC)) {
            if (!didVarK2.d() || zC) {
                this.w = new dhh(didVarK2, zC, false);
            } else if (this.w != null) {
                this.w = null;
            }
            this.o.gA(this.w);
        }
        dhh dhhVar2 = this.G;
        if (dhhVar2 != null && dhhVar2.a().equals(didVarK) && this.G.b() == zC) {
            return;
        }
        if (!didVarK.d() || zC) {
            i = 0;
            this.G = new dhh(didVarK, zC, false);
        } else {
            if (this.G == null) {
                return;
            }
            this.G = null;
            i = 0;
        }
        ArrayList arrayList3 = this.B;
        int size3 = arrayList3.size();
        while (i < size3) {
            dhp dhpVar = ((dih) arrayList3.get(i)).a;
            if (dhpVar != this.o) {
                dhpVar.gA(this.G);
            }
            i++;
        }
    }

    final void p() {
        MediaRouter2.RoutingController routingController;
        dii diiVar = this.e;
        if (diiVar == null) {
            dgn dgnVar = this.y;
            if (dgnVar != null) {
                dgnVar.a();
                return;
            }
            return;
        }
        djf djfVar = this.m;
        djfVar.a = diiVar.p;
        djfVar.b = diiVar.q;
        djfVar.c = diiVar.b();
        dii diiVar2 = this.e;
        djfVar.d = diiVar2.n;
        djfVar.e = diiVar2.m;
        if (s() && diiVar2.d() == this.o) {
            dhn dhnVar = this.f;
            djfVar.f = (!(dhnVar instanceof dgu) || (routingController = ((dgu) dhnVar).b) == null) ? null : routingController.getId();
        } else {
            djfVar.f = null;
        }
        ArrayList arrayList = this.C;
        if (arrayList.size() > 0) {
            throw null;
        }
        if (this.y != null) {
            if (this.e == e() || this.e == this.s) {
                this.y.a();
                return;
            }
            int i = djfVar.c == 1 ? 2 : 0;
            dgn dgnVar2 = this.y;
            int i2 = djfVar.b;
            int i3 = djfVar.a;
            String str = djfVar.f;
            brj brjVar = dgnVar2.b;
            if (brjVar != null && i == 0 && i2 == 0) {
                brjVar.a = i3;
                ((VolumeProvider) brjVar.a()).setCurrentVolume(i3);
                return;
            }
            dgnVar2.b = new dgm(dgnVar2, i, i2, i3, str);
            fg fgVar = dgnVar2.a;
            brj brjVar2 = dgnVar2.b;
            if (brjVar2 == null) {
                throw new IllegalArgumentException("volumeProvider may not be null!");
            }
            ((fb) fgVar.c).a.setPlaybackToRemote((VolumeProvider) brjVar2.a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x016e A[LOOP:0: B:57:0x016c->B:58:0x016e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x018b A[LOOP:1: B:60:0x0189->B:61:0x018b, LOOP_END] */
    public final void q(dih dihVar, dhq dhqVar) {
        String strConcat;
        boolean z;
        int i;
        List list;
        int size;
        int size2;
        if (dihVar.d != dhqVar) {
            dihVar.d = dhqVar;
            if (dhqVar != null) {
                if (dhqVar.b() || dhqVar == this.p.j) {
                    List<dhg> list2 = dhqVar.b;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    z = false;
                    int i2 = 0;
                    for (dhg dhgVar : list2) {
                        if (dhgVar == null || !dhgVar.y()) {
                            Objects.toString(dhgVar);
                            Log.w("AxMediaRouter", "Ignoring invalid route descriptor: ".concat(String.valueOf(dhgVar)));
                        } else {
                            String strP = dhgVar.p();
                            List list3 = dihVar.b;
                            int size3 = list3.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    i3 = -1;
                                    break;
                                } else if (((dii) list3.get(i3)).c.equals(strP)) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (i3 < 0) {
                                int i4 = i2 + 1;
                                dii diiVar = new dii(dihVar, strP, g(dihVar, strP), dhgVar.x());
                                list3.add(i2, diiVar);
                                this.j.add(diiVar);
                                if (dhgVar.s().isEmpty()) {
                                    diiVar.c(dhgVar);
                                    this.b.a(257, diiVar);
                                } else {
                                    arrayList.add(new axq(diiVar, dhgVar));
                                }
                                i2 = i4;
                            } else if (i3 < i2) {
                                Objects.toString(dhgVar);
                                Log.w("AxMediaRouter", "Ignoring route descriptor with duplicate id: ".concat(dhgVar.toString()));
                            } else {
                                int i5 = i2 + 1;
                                dii diiVar2 = (dii) list3.get(i3);
                                Collections.swap(list3, i3, i2);
                                if (!dhgVar.s().isEmpty()) {
                                    arrayList2.add(new axq(diiVar2, dhgVar));
                                } else if (a(diiVar2, dhgVar) != 0 && diiVar2 == this.e) {
                                    i2 = i5;
                                    z = true;
                                }
                                i2 = i5;
                            }
                        }
                    }
                    int size4 = arrayList.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        axq axqVar = (axq) arrayList.get(i6);
                        dii diiVar3 = (dii) axqVar.a;
                        diiVar3.c((dhg) axqVar.b);
                        this.b.a(257, diiVar3);
                    }
                    int size5 = arrayList2.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        axq axqVar2 = (axq) arrayList2.get(i7);
                        dii diiVar4 = (dii) axqVar2.a;
                        if (a(diiVar4, (dhg) axqVar2.b) != 0 && diiVar4 == this.e) {
                            z = true;
                        }
                    }
                    i = i2;
                } else {
                    Objects.toString(dhqVar);
                    strConcat = "Ignoring invalid provider descriptor: ".concat(dhqVar.toString());
                }
                list = dihVar.b;
                for (size = list.size() - 1; size >= i; size--) {
                    dii diiVar5 = (dii) list.get(size);
                    diiVar5.c(null);
                    this.j.remove(diiVar5);
                }
                r(z);
                for (size2 = list.size() - 1; size2 >= i; size2--) {
                    this.b.a(258, (dii) list.remove(size2));
                }
                this.b.a(515, dihVar);
            }
            ComponentName componentNameA = dihVar.a();
            Objects.toString(componentNameA);
            strConcat = "Ignoring null provider descriptor from ".concat(componentNameA.toString());
            Log.w("AxMediaRouter", strConcat);
            i = 0;
            z = false;
            list = dihVar.b;
            while (size >= i) {
                dii diiVar6 = (dii) list.get(size);
                diiVar6.c(null);
                this.j.remove(diiVar6);
            }
            r(z);
            while (size2 >= i) {
                this.b.a(258, (dii) list.remove(size2));
            }
            this.b.a(515, dihVar);
        }
    }

    final void r(boolean z) {
        dii diiVar = this.r;
        if (diiVar != null && !diiVar.n()) {
            Objects.toString(this.r);
            this.r = null;
        }
        if (this.r == null) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dii diiVar2 = (dii) arrayList.get(i);
                if (diiVar2.d() == this.p && diiVar2.c.equals("DEFAULT_ROUTE") && diiVar2.n()) {
                    this.r = diiVar2;
                    Objects.toString(this.r);
                    break;
                }
            }
        }
        dii diiVar3 = this.s;
        if (diiVar3 != null && !diiVar3.n()) {
            Objects.toString(this.s);
            this.s = null;
        }
        if (this.s == null) {
            ArrayList arrayList2 = this.j;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                dii diiVar4 = (dii) arrayList2.get(i2);
                if (v(diiVar4) && diiVar4.n()) {
                    this.s = diiVar4;
                    Objects.toString(this.s);
                    break;
                }
            }
        }
        dii diiVar5 = this.e;
        if (diiVar5 == null || !diiVar5.n()) {
            Objects.toString(this.e);
            n(d(), 1, 3, false);
        } else if (z) {
            j();
            p();
        }
    }

    final boolean s() {
        boolean z = this.E;
        dim dimVar = this.q;
        if (z) {
            return dimVar == null || dimVar.b;
        }
        if (dimVar == null || !dimVar.c) {
            return false;
        }
        return dimVar.b;
    }

    final boolean t() {
        dim dimVar = this.q;
        if (dimVar == null) {
            return false;
        }
        return dimVar.e;
    }
}
