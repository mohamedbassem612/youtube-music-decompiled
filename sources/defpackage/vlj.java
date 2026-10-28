package defpackage;

import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vlj implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vlj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v77, types: [java.lang.Object, tgz] */
    @Override // java.lang.Runnable
    public final void run() {
        List list;
        switch (this.$cid) {
            case 0:
                ((vll) this.a).d();
                return;
            case 1:
                vkv vkvVar = (vkv) this.a;
                int height = ((vkvVar.e.getHeight() - vkvVar.f.getHeight()) - vkvVar.c.getHeight()) / 2;
                if (!vkvVar.b) {
                    if (height > vkvVar.a) {
                        tym.h(vkvVar.d, new tye(new tyj(16, 1, null), new tyi(0, 1)), FrameLayout.LayoutParams.class);
                        vkvVar.b = true;
                        return;
                    }
                    return;
                }
                int i = vkvVar.a;
                if (height <= i) {
                    tym.h(vkvVar.d, new tye(new tyj(80, 1, null), new tyi(i, 1)), FrameLayout.LayoutParams.class);
                    vkvVar.b = false;
                    return;
                }
                return;
            case 2:
                ((vll) this.a).e();
                return;
            case 3:
                vlk vlkVar = (vlk) this.a;
                tfq tfqVar = (tfq) vlkVar.b.io();
                if (tfqVar.i()) {
                    anew anewVar = vlkVar.c.b().j;
                    if (anewVar == null) {
                        anewVar = anew.a;
                    }
                    aont aontVar = anewVar.i;
                    if (aontVar == null) {
                        aontVar = aont.a;
                    }
                    if (aontVar.c && tfqVar.j(0) && vlkVar.d.get() == null) {
                        vlkVar.d();
                        return;
                    } else {
                        if (vlkVar.e.get() == null) {
                            vlkVar.c();
                            return;
                        }
                        return;
                    }
                }
                return;
            case 4:
                ((vlk) this.a).d();
                return;
            case 5:
                ((vlk) this.a).c();
                return;
            case 6:
                ((vna) this.a).ak();
                return;
            case 7:
                ((wwt) this.a).b();
                return;
            case 8:
                ((vpt) ((dfy) this.a).a).p(false);
                return;
            case 9:
                ((vrm) this.a).p();
                return;
            case 10:
                vsc vscVar = (vsc) this.a;
                Object obj = vscVar.b;
                if (obj != null) {
                    arkm arkmVar = (arkm) obj;
                    int i2 = arkmVar.d;
                    if (i2 != 1) {
                        if (i2 != 14) {
                            return;
                        } else {
                            i2 = 14;
                        }
                    }
                    aegs aegsVar = vscVar.l;
                    String str = i2 == 1 ? agvp.f((agya) arkmVar.e).a : (String) arkmVar.e;
                    vxe vxeVar = vscVar.f;
                    Object obj2 = vscVar.b;
                    aegsVar.b(str, vxeVar, obj2 != null ? ((arkm) obj2).K : null);
                    vscVar.k = false;
                    return;
                }
                return;
            case 11:
                xsc xscVar = (xsc) ((vvm) this.a).a.io();
                aihf aihfVarCreateBuilder = akjt.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                akjt akjtVar = (akjt) aihfVarCreateBuilder.instance;
                akjtVar.c = 1;
                akjtVar.b |= 1;
                int i3 = Build.VERSION.SDK_INT;
                aihfVarCreateBuilder.copyOnWrite();
                akjt akjtVar2 = (akjt) aihfVarCreateBuilder.instance;
                akjtVar2.b |= 2;
                akjtVar2.d = i3;
                boolean zHasSystemFeature = ((PackageManager) xscVar.b).hasSystemFeature("android.hardware.telephony");
                aihfVarCreateBuilder.copyOnWrite();
                akjt akjtVar3 = (akjt) aihfVarCreateBuilder.instance;
                akjtVar3.b |= 4;
                akjtVar3.e = zHasSystemFeature;
                if (Build.VERSION.SDK_INT >= 28) {
                    int simCarrierId = ((TelephonyManager) xscVar.a).getSimCarrierId();
                    aihfVarCreateBuilder.copyOnWrite();
                    akjt akjtVar4 = (akjt) aihfVarCreateBuilder.instance;
                    akjtVar4.b |= 8;
                    akjtVar4.f = simCarrierId;
                }
                TelephonyManager telephonyManager = (TelephonyManager) xscVar.a;
                String simOperator = telephonyManager.getSimOperator();
                aihfVarCreateBuilder.copyOnWrite();
                akjt akjtVar5 = (akjt) aihfVarCreateBuilder.instance;
                simOperator.getClass();
                akjtVar5.b |= 16;
                akjtVar5.g = simOperator;
                String networkOperator = telephonyManager.getNetworkOperator();
                aihfVarCreateBuilder.copyOnWrite();
                akjt akjtVar6 = (akjt) aihfVarCreateBuilder.instance;
                networkOperator.getClass();
                akjtVar6.b |= 32;
                akjtVar6.h = networkOperator;
                Object obj3 = xscVar.c;
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                akjt akjtVar7 = (akjt) aihfVarCreateBuilder.build();
                akjtVar7.getClass();
                alouVar.d = akjtVar7;
                alouVar.c = 507;
                ((dov) obj3).R((alou) alosVar.build());
                return;
            case 12:
                Object obj4 = this.a;
                synchronized (obj4) {
                    ((vwi) obj4).c = false;
                    ((vwi) obj4).a.e();
                    ((vwi) obj4).i();
                    break;
                }
                return;
            case 13:
                Object obj5 = this.a;
                synchronized (obj5) {
                    ((vwi) obj5).c = false;
                    ((vwi) obj5).a.e();
                    ((vwi) obj5).i();
                    break;
                }
                return;
            case 14:
                Object obj6 = this.a;
                vxr vxrVar = ((vxt) obj6).e;
                vxrVar.c = true;
                try {
                    FutureTask futureTask = ((vxt) obj6).d;
                    if (!((Boolean) futureTask.get()).booleanValue() && ((vxt) obj6).c == 0) {
                        vxrVar.a();
                        return;
                    } else {
                        int i4 = ((vxt) obj6).c;
                        ((Boolean) futureTask.get()).booleanValue();
                        throw null;
                    }
                } catch (InterruptedException | ExecutionException unused) {
                    zvp.a(zvn.b, zvm.s, "Fail to read crashcounter");
                    return;
                }
            case 15:
                Toast.makeText(((vyt) this.a).d, "VIX environment is set", 0).show();
                return;
            case 16:
                avnr.b((AtomicReference) this.a);
                return;
            case 17:
                Object obj7 = this.a;
                while (true) {
                    synchronized (obj7) {
                        if (((wka) obj7).a.isEmpty()) {
                            ((wka) obj7).b = false;
                            return;
                        } else {
                            list = ((wka) obj7).a;
                            ((wka) obj7).a = new ArrayList();
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                break;
            case 18:
                ((aczl) this.a).m();
                return;
            case 19:
                Object obj8 = this.a;
                aczl aczlVar = (aczl) obj8;
                if (((AtomicInteger) aczlVar.c).decrementAndGet() == 0 && a.av((AtomicReference) aczlVar.f, wkb.a, wkb.c)) {
                    aczlVar.b.execute(afwl.i(new vlj(obj8, 18)));
                    return;
                }
                return;
            default:
                ?? r8 = ((aepb) this.a).d;
                if (r8 != 0) {
                    r8.a();
                    return;
                }
                return;
        }
    }
}
