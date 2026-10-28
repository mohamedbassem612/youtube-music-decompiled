package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.Window;
import android.widget.Button;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.media.interfaces.CuePointDataProviderWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abfv {
    public final Object a;
    public final Object b;

    public abfv(Set set) {
        this.a = set;
        this.b = new ConcurrentHashMap();
        agqr it = ((agqj) set).iterator();
        while (it.hasNext()) {
            abvn abvnVar = (abvn) it.next();
            abvnVar.K().ak(new aawi(new rri(this, 4), 8));
            abvnVar.L().ak(new aawi(new rri(this, 5), 9));
        }
    }

    private final void D(wgo[] wgoVarArr, String str) {
        int i = 0;
        IntStream.CC.range(0, wgoVarArr.length).filter(new abft(wgoVarArr, str, i)).findFirst().ifPresent(new abfu(this, wgoVarArr, i));
    }

    public static void h(Button button) {
        if (button != null) {
            button.setAllCaps(false);
        }
    }

    public static void i(Window window, Context context) {
        if (window != null) {
            Drawable drawable = context.getDrawable(R.drawable.bg_dialog_rounded);
            drawable.getClass();
            window.setBackgroundDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static atps u(atpt atptVar, String str) {
        atps atpsVar = atps.a;
        str.getClass();
        atps atpsVar2 = (atps) atptVar.d.get(str);
        return atpsVar2 != null ? atpsVar2 : atpsVar;
    }

    public final aazo A(String str, int i) {
        return B(str, i, new woi(str, 20));
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    public final aazo B(String str, int i, Function function) throws ExecutionException {
        ArrayList arrayList;
        taq.c();
        Object obj = this.a;
        aaqb aaqbVar = (aaqb) function.apply(((aaqc) obj).b());
        aaqbVar.m();
        try {
            altv altvVarA = ((aaqc) obj).a(aaqbVar);
            aofu aofuVarE = aajg.e(altvVarA, str);
            aofu aofuVarE2 = aajg.e(altvVarA, str);
            if (aofuVarE2 != null) {
                arrayList = new ArrayList();
                Iterator it = aofuVarE2.f.iterator();
                while (it.hasNext()) {
                    aohb aohbVar = ((aohc) it.next()).c;
                    if (aohbVar == null) {
                        aohbVar = aohb.a;
                    }
                    arrayList.add(aohbVar);
                }
            } else {
                arrayList = null;
            }
            if (aofuVarE == null || arrayList == null) {
                return null;
            }
            aamh aamhVarA = aamh.a(aofuVarE);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(aamo.b((aohb) it2.next()));
            }
            aazo aazoVar = new aazo(aamhVarA, (List) arrayList2);
            if (i < 0) {
                return null;
            }
            Object obj2 = aazoVar.b;
            ?? r3 = aazoVar.a;
            List listSubList = r3.subList(0, Math.min(r3.size(), i));
            return new aazo(new aamh((aamh) obj2, listSubList.size()), listSubList);
        } catch (wno e) {
            throw new ExecutionException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final agcl C(may mayVar) {
        zzf zzfVar = (zzf) this.a.io();
        zzfVar.getClass();
        return new agcl((awmd) this.b, zzfVar, mayVar);
    }

    public final avmn[] a(abvn abvnVar) {
        return new avmn[]{((avlh) abvnVar.r().p).i(aawb.y(abvnVar.X(), 4096L)).i(new abwr(1)).al(new aawi(this, 18), new abeq(2))};
    }

    public final void b(String str, String str2, abad abadVar) {
        CuePointDataProviderWrapper cuePointDataProviderWrapperA;
        str.getClass();
        str2.getClass();
        CuePointDataProviderWrapper.Holder holder = (CuePointDataProviderWrapper.Holder) ((ConcurrentHashMap) this.b).get(str);
        if (holder == null || (cuePointDataProviderWrapperA = holder.a()) == null) {
            return;
        }
        cuePointDataProviderWrapperA.a(str2, abadVar.i, null);
    }

    public final List c(List list) {
        avlr avlrVar;
        list.getClass();
        awcy awcyVar = new awcy(list);
        avnn avnnVar = atqp.l;
        List list2 = (List) awcyVar.K(new vvb(this, 15)).as().E();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            ((adwp) list2.get(i)).d();
        }
        int size = list.size();
        int i2 = 1;
        if (size > 0) {
            awbp awbpVar = new awbp(new afnh(size, list2, list, i2));
            avnn avnnVar2 = atqp.l;
            arrayList.add(awbpVar);
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        if (arrayList.size() == 1) {
            avlrVar = (avlr) arrayList.get(0);
        } else {
            int i3 = avlh.a;
            awcy awcyVar2 = new awcy(arrayList);
            avnn avnnVar3 = atqp.l;
            avoj.a(i3, "maxConcurrency");
            avoj.a(i3, "prefetch");
            awbi awbiVar = new awbi(awcyVar2, i3, i3);
            avnn avnnVar4 = atqp.l;
            avlrVar = awbiVar;
        }
        return (List) avlrVar.as().E();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void d(adwp adwpVar) {
        if (adwpVar != null) {
            this.b.add(0, adwpVar);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, nuc] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, mbc] */
    public final /* synthetic */ mnl e(Object obj, nrv nrvVar) {
        albl alblVar = (albl) obj;
        ntq ntqVar = nrvVar.g;
        if (!(ntqVar instanceof adau)) {
            return null;
        }
        adau adauVar = (adau) ntqVar;
        xgn xgnVar = adauVar.a;
        amud amudVar = alblVar.d;
        if (amudVar == null) {
            amudVar = amud.b;
        }
        return new adfz(xgnVar, amudVar, adauVar.b, nrvVar, this.b, this.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aeda, java.lang.Object] */
    @Deprecated
    public final acwr f(Context context) {
        ?? r2 = this.a;
        return new acwr(context, r2.a(), r2.o());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aeda, java.lang.Object] */
    @Deprecated
    public final acws g(Context context) {
        ?? r2 = this.a;
        return new acws(context, r2.a(), r2.o());
    }

    @tcc
    public void handleFormatStreamChangeEvent(yvu yvuVar) {
        wgo[] wgoVarArr = yvuVar.h;
        boolean z = wgoVarArr.length > 1;
        hyh hyhVar = (hyh) this.b;
        hyhVar.b = z;
        hyhVar.d.g(z);
        if (z) {
            wgs wgsVar = yvuVar.f;
            String strV = wgsVar != null ? wgsVar.v() : "";
            agke agkeVar = agpi.a;
            if (agkeVar.isEmpty()) {
                D(wgoVarArr, strV);
            } else {
                D((wgo[]) DesugarArrays.stream(wgoVarArr).filter(new aajl(agkeVar, 14)).toArray(new hhv(15)), strV);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aeda, java.lang.Object] */
    public final boolean j() {
        return this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aeda, java.lang.Object] */
    public final boolean k() {
        if (!this.a.l()) {
            return false;
        }
        ((Optional) this.b).isPresent();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aeda, java.lang.Object] */
    public final boolean l() {
        return this.a.n();
    }

    public final void m(acwn acwnVar, String str) {
        taq.d();
        ((agge) this.b).u(str, acwnVar);
    }

    public final void n() {
        taq.d();
        boolean zL = ((vxz) this.a).l(295, 45774883L, false);
        Object obj = this.b;
        if (!zL) {
            Iterator<E> it = new aghg((aghh) obj).iterator();
            while (it.hasNext()) {
                ((acwn) it.next()).a();
            }
        } else {
            agke agkeVarN = agke.n(new aghg((aghh) obj));
            int size = agkeVarN.size();
            for (int i = 0; i < size; i++) {
                ((acwn) agkeVarN.get(i)).a();
            }
        }
    }

    public final void o(acwn acwnVar, String str) {
        taq.d();
        ((agge) this.b).x(str, acwnVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized int p() {
        zwa zwaVarE = this.b.e();
        if (!zwaVarE.h()) {
            String strY = tym.y("%s_uses_offline", zwaVarE.k());
            ?? r1 = this.a;
            if (!r1.contains(strY)) {
                return 0;
            }
            if (r1.getBoolean(strY, false)) {
                return 1;
            }
        }
        return 2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void q(boolean z) {
        zwa zwaVarE = this.b.e();
        if (zwaVarE.h()) {
            return;
        }
        this.a.edit().putBoolean(tym.y("%s_uses_offline", zwaVarE.k()), z).apply();
    }

    public final boolean r() {
        return p() != 2;
    }

    public final void s(String str, String str2) {
        typ.f(str2);
        aamv aamvVar = new aamv();
        long j = aarq.a;
        aamvVar.l("video_id", str2);
        aamvVar.j("transfer_type", 2);
        aamvVar.h("triggered_by_refresh", true);
        aamvVar.l("transfer_nonce", ((txp) this.b).a());
        ((ci) this.a).au(str, aajc.d(str, str2), 100, aamvVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tpq] */
    public final ListenableFuture t(atpr atprVar) {
        return this.b.b(new aaoz(atprVar, 3));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tpq] */
    public final boolean v() {
        return (((atpt) this.b.c()).b & 1) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    public final aamo w(String str) throws ExecutionException {
        aohb aohbVar;
        taq.c();
        Object obj = this.a;
        aaqb aaqbVarB = ((aaqc) obj).b();
        aaqbVarB.a.add(str);
        aaqbVarB.m();
        try {
            for (aohc aohcVar : ((aaqc) obj).a(aaqbVarB).c) {
                aohb aohbVar2 = aohcVar.c;
                if (aohbVar2 == null) {
                    aohbVar2 = aohb.a;
                }
                if (aohbVar2.c.equals(str)) {
                    aohbVar = aohcVar.c;
                    if (aohbVar == null) {
                        aohbVar = aohb.a;
                    }
                    if (aohbVar != null) {
                        return aamo.b(aohbVar);
                    }
                    throw new ExecutionException(new wno("No video data returned for videoId=".concat(str)));
                }
            }
            aohbVar = null;
            if (aohbVar != null) {
                return aamo.b(aohbVar);
            }
            throw new ExecutionException(new wno("No video data returned for videoId=".concat(str)));
        } catch (wno e) {
            throw new ExecutionException(e);
        }
    }

    public final aaqa x(long j, long j2, int i, float f, List list, boolean z) {
        aaqc aaqcVar = (aaqc) this.a;
        aaqa aaqaVar = new aaqa(aaqcVar.b, aaqcVar.c.e(), (vyo) aaqcVar.f, ((vxz) aaqcVar.g).l(34, 45402343L, false));
        aaqaVar.c = j;
        aaqaVar.d = j2;
        aaqaVar.e = i;
        aaqaVar.D = f;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aapt aaptVar = (aapt) it.next();
            String str = aaptVar.a;
            long j3 = aaptVar.b;
            String[] strArr = aaptVar.c;
            long j4 = aaptVar.d;
            long j5 = aaptVar.e;
            boolean zR = aauk.r(aaqaVar.a);
            aihf aihfVarCreateBuilder = altp.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            altp altpVar = (altp) aihfVarCreateBuilder.instance;
            altpVar.b |= 1;
            altpVar.c = str;
            aihfVarCreateBuilder.copyOnWrite();
            altp altpVar2 = (altp) aihfVarCreateBuilder.instance;
            altpVar2.b |= 2;
            altpVar2.d = j3;
            List listAsList = Arrays.asList(strArr);
            aihfVarCreateBuilder.copyOnWrite();
            altp altpVar3 = (altp) aihfVarCreateBuilder.instance;
            aiie aiieVar = altpVar3.e;
            if (!aiieVar.c()) {
                altpVar3.e = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(listAsList, altpVar3.e);
            aihfVarCreateBuilder.copyOnWrite();
            altp altpVar4 = (altp) aihfVarCreateBuilder.instance;
            altpVar4.b |= 4;
            altpVar4.f = z;
            aihfVarCreateBuilder.copyOnWrite();
            altp altpVar5 = (altp) aihfVarCreateBuilder.instance;
            altpVar5.b |= 8;
            altpVar5.g = j4;
            if (true != zR) {
                j5 = 0;
            }
            aihfVarCreateBuilder.copyOnWrite();
            altp altpVar6 = (altp) aihfVarCreateBuilder.instance;
            altpVar6.b |= 16;
            altpVar6.h = j5;
            aaqaVar.b.add((altp) aihfVarCreateBuilder.build());
        }
        aaqaVar.m();
        return aaqaVar;
    }

    public final alts y(long j, long j2, int i, float f, List list) throws ExecutionException {
        taq.c();
        try {
            return (alts) ((wnh) ((aaqc) this.a).e).c(x(j, j2, i, f, list, true));
        } catch (wno e) {
            throw new ExecutionException(e);
        }
    }

    public final boolean z() {
        TelephonyManager telephonyManager = (TelephonyManager) ((Context) this.b).getSystemService("phone");
        int simCarrierId = -1;
        if (telephonyManager != null && Build.VERSION.SDK_INT >= 28) {
            simCarrierId = telephonyManager.getSimCarrierId();
        }
        anin aninVar = ((vyo) this.a).b().g;
        if (aninVar == null) {
            aninVar = anin.a;
        }
        return aninVar.e.contains(Integer.valueOf(simCarrierId));
    }

    public abfv(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public abfv(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public abfv(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public abfv() {
        this.a = new adwo();
        this.b = new CopyOnWriteArrayList();
    }

    public abfv(awmd awmdVar, awmd awmdVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
    }

    public abfv(nuc nucVar, mbc mbcVar) {
        nucVar.getClass();
        this.b = nucVar;
        mbcVar.getClass();
        this.a = mbcVar;
    }

    public abfv(vxz vxzVar) {
        vxzVar.l(1, 45371393L, false);
        awku awkuVar = new awku();
        this.a = awkuVar;
        this.b = awkuVar.S();
    }

    public abfv(byte[] bArr) {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        keySetViewNewKeySet.getClass();
        this.b = keySetViewNewKeySet;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet2 = ConcurrentHashMap.newKeySet();
        keySetViewNewKeySet2.getClass();
        this.a = keySetViewNewKeySet2;
    }

    public abfv(awmd awmdVar, awmd awmdVar2, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
    }

    public abfv(awmd awmdVar, awmd awmdVar2, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
    }

    public abfv(Class cls, adme admeVar) {
        this.b = cls;
        this.a = admeVar;
    }

    public abfv(abvk abvkVar, hyh hyhVar) {
        this.a = abvkVar;
        hyhVar.getClass();
        this.b = hyhVar;
        hyhVar.c.m = this;
    }

    public abfv(awmd awmdVar, awmd awmdVar2) {
        awmdVar.getClass();
        this.b = awmdVar;
        this.a = awmdVar2;
    }

    public abfv(Set set, ytv ytvVar) {
        set.getClass();
        ytvVar.getClass();
        this.b = set;
        this.a = ytvVar;
    }

    public abfv(vxz vxzVar, byte[] bArr) {
        this.a = vxzVar;
        this.b = new aghn(null);
    }
}
