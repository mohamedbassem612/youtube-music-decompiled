package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.watch.WatchFragment;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qcb {
    public final /* synthetic */ Object a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qcb(kgj kgjVar) {
        this((char[]) null);
        this.a = kgjVar;
    }

    public final syw A(int i, String str, long j) {
        ght ghtVar = ((ghs) this.a).a;
        return new syw((Context) ghtVar.v.io(), i, str, j, (mbc) ghtVar.l.io(), ghtVar.yN);
    }

    public final yam B(xve xveVar, yaa yaaVar, ycp ycpVar, yco ycoVar) {
        boolean z;
        ght ghtVar = ((ghs) this.a).a;
        Context context = (Context) ghtVar.v.io();
        tbt tbtVar = (tbt) ghtVar.I.io();
        txp txpVar = (txp) ghtVar.aS.io();
        mbc mbcVar = (mbc) ghtVar.l.io();
        ttm ttmVar = (ttm) ghtVar.cJ.io();
        tfq tfqVar = (tfq) ghtVar.cd.io();
        acda acdaVar = (acda) ghtVar.cX.io();
        Handler handler = (Handler) ghtVar.cY.io();
        xwj xwjVar = (xwj) ghtVar.dj.io();
        xxj xxjVar = new xxj((xls) ghtVar.dN.io(), null);
        aesq aesqVar = (aesq) ghtVar.kh.io();
        ListenableFuture listenableFuture = (ListenableFuture) ghtVar.f13do.io();
        wjr wjrVar = (wjr) ghtVar.ki.io();
        Optional optionalEmpty = Optional.empty();
        xys xysVar = (xys) ghtVar.kj.io();
        aupr auprVar = ghtVar.de;
        xla xlaVar = (xla) auprVar.io();
        xmr xmrVar = (xmr) ghtVar.dh.io();
        aupr auprVar2 = ghtVar.dd;
        String strBR = zik.bR(xlaVar, xmrVar, (vxz) auprVar2.io());
        if (strBR != null) {
            String[] strArrSplit = TextUtils.split(strBR, ",");
            int i = 0;
            while (i < strArrSplit.length) {
                String[] strArr = strArrSplit;
                if ("que".equals(strArrSplit[i])) {
                    z = true;
                } else {
                    i++;
                    strArrSplit = strArr;
                }
            }
            z = false;
        } else {
            z = false;
        }
        xla xlaVar2 = (xla) auprVar.io();
        ahey aheyVar = (ahey) ghtVar.u.io();
        ghtVar.cM();
        return new yam(context, yaaVar, ycpVar, tbtVar, txpVar, mbcVar, ttmVar, tfqVar, acdaVar, handler, xwjVar, xveVar, ycoVar, xxjVar, aesqVar, listenableFuture, wjrVar, optionalEmpty, xysVar, z, xlaVar2, aheyVar, (abea) ghtVar.kt.io(), (yed) ghtVar.ku.io(), (ytv) ghtVar.ia.io(), (ydy) ghtVar.dg.io(), (vxz) auprVar2.io(), new xur((xit) ghtVar.fa.io(), (vyo) ghtVar.av.io(), (tbt) ghtVar.I.io()));
    }

    public final vrf C(awmd awmdVar) {
        ght ghtVar = ((ghs) this.a).a;
        return new vrf(aupm.b(ghtVar.xW), (Executor) ghtVar.B.io(), awmdVar, 2);
    }

    public final gts D(awmd awmdVar, Optional optional) {
        ght ghtVar = ((ghs) this.a).a;
        return new gts((aapw) ghtVar.xT.io(), (tbt) ghtVar.I.io(), (ttm) ghtVar.cJ.io(), awmdVar, optional, (Executor) ghtVar.B.io());
    }

    public final xei E() {
        ght ghtVar = ((ghs) this.a).a;
        return new xei(ghtVar.cf, ghtVar.qG, ghtVar.eW, ghtVar.eX, (Executor) ghtVar.bP.io());
    }

    public final abek F(abvn abvnVar) {
        return new abek((aenu) ((ghs) this.a).a.jY.io(), new abed(), abvnVar);
    }

    public final boolean G(File file) {
        try {
            return ((kto) this.a).a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public final void H(agke agkeVar) {
        Object obj = this.a;
        synchronized (((chz) obj).c) {
            ((chz) obj).h = agkeVar;
            ((chz) obj).b();
        }
        ((chz) this.a).x.d = agkeVar;
    }

    public final void I(IOException iOException) {
        ((chz) this.a).g(iOException);
    }

    public final void J() {
        long j;
        synchronized (csm.b) {
            j = csm.c ? csm.d : -9223372036854775807L;
        }
        ((chz) this.a).h(j);
    }

    public final void K() {
        ccs ccsVar = (ccs) this.a;
        if (ccsVar.f() || ccsVar.o) {
            ccsVar.e.g(2);
        }
    }

    public final void L(boolean z) {
        ccm ccmVar = (ccm) this.a;
        if (ccmVar.y) {
            return;
        }
        if (!z) {
            ccmVar.W();
        } else if (ccmVar.A.n == 3) {
            ccmVar.W();
        }
    }

    public final aczl M(vxe vxeVar) {
        ght ghtVar = ((ghs) this.a).a;
        return new aczl((abvk) ghtVar.kB.io(), (abvc) ghtVar.kC.io(), (hzi) ghtVar.nw.io(), (jlh) ghtVar.xP.io(), (tbt) ghtVar.I.io(), (vxz) ghtVar.ga.io(), vxeVar);
    }

    public final gug N(Optional optional, aczl aczlVar) {
        ght ghtVar = ((ghs) this.a).a;
        return new gug((wqm) ghtVar.ro.io(), (wbz) ghtVar.es.io(), (zwb) ghtVar.bd.io(), (avmb) ghtVar.dA.io(), (Executor) ghtVar.B.io(), optional, aczlVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, svf] */
    public final CharSequence a(ambc ambcVar) {
        return this.a.a(ambcVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void b() {
        this.a.run();
    }

    public final void c(boolean z) {
        Object obj = this.a;
        if (z) {
            ((upo) obj).d();
        } else {
            ((upo) obj).b();
        }
    }

    public final void d() {
        ListenableFuture listenableFutureR;
        agjz agjzVar = new agjz(4);
        uoa uoaVar = (uoa) this.a;
        Iterator it = uoaVar.h.c.iterator();
        while (it.hasNext()) {
            vfb vfbVarA = uoaVar.e.a(Uri.parse(((uqa) it.next()).b));
            if (vfbVarA != null) {
                ahey aheyVar = uoaVar.f;
                if (vfbVarA.v()) {
                    vez vezVar = vfbVarA.m;
                    vfbVarA.b = vezVar == null ? null : vezVar.b;
                    vfbVarA.c = vezVar == null ? null : vezVar.a;
                    vfbVarA.d = vezVar == null ? null : vezVar.c;
                    vfbVarA.e = null;
                    vfbVarA.n = null;
                    listenableFutureR = ahng.r(afwl.j(new tsp(vfbVarA, 11)), aheyVar);
                } else {
                    listenableFutureR = ahng.n(Boolean.FALSE);
                }
                agjzVar.h(listenableFutureR);
            }
        }
        if (uoaVar.i()) {
            uoaVar.r.isPresent();
        }
        taf.k(uoaVar.a, ahng.k(agjzVar.g()), new uny(this, 0), new uny(this, 2));
    }

    public final void e(boolean z) {
        qr qrVar;
        uoa uoaVar = (uoa) this.a;
        if (!uoaVar.i() || (qrVar = uoaVar.y) == null) {
            return;
        }
        qrVar.g(!z);
    }

    public final void f(int i, aigs aigsVar) {
        byte[] bArr = (byte[]) this.a;
        int length = bArr.length;
        aigr aigrVar = (aigr) aigsVar;
        aigrVar.y(((i >>> 3) << 3) | 2);
        aigrVar.B(bArr, length);
    }

    public final void g(int i, int i2) {
        fof fofVar = (fof) ((AtomicReference) this.a).get();
        int i3 = mjl.z;
        if (fofVar.A() != null) {
            fofVar.z(new aero(1, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), "updateState:DataDrivenCollectionSection.onItemDraggedStateUpdate");
        }
    }

    public final /* bridge */ /* synthetic */ void h(Object obj) {
        qmr qmrVar = (qmr) obj;
        try {
            Object obj2 = this.a;
            qml qmlVar = (qml) aihn.parseFrom(qml.a, (byte[]) obj2, ExtensionRegistryLite.a);
            boolean z = false;
            for (qnl qnlVar : qmrVar.b.f) {
                if (qmi.i.d(qmlVar.b) && !z) {
                    qmrVar.a.a();
                    z = true;
                }
            }
        } catch (aiik unused) {
        }
    }

    public final void i(int i, String str, List list, boolean z, boolean z2) {
        lcx lcxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            lcxVar = ((ldz) this.a).aT().j;
        } else if (i2 != 1) {
            if (i2 == 3) {
                lcxVar = ((ldz) this.a).aT().k;
            } else if (i2 != 4) {
                lcxVar = ((ldz) this.a).aT().i;
            } else if (z) {
                lcxVar = ((ldz) this.a).aT().g;
            } else {
                Object obj = this.a;
                lcxVar = !z2 ? ((ldz) obj).aT().h : ((ldz) obj).aT().f;
            }
        } else if (z) {
            lcxVar = ((ldz) this.a).aT().d;
        } else {
            Object obj2 = this.a;
            lcxVar = !z2 ? ((ldz) obj2).aT().e : ((ldz) obj2).aT().c;
        }
        int size = list.size();
        if (size == 1) {
            lcxVar.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            lcxVar.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            lcxVar.a(str);
        } else {
            lcxVar.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public final void j(Object obj) {
        kym kymVar = (kym) this.a;
        kymVar.e.remove(obj);
        Object obj2 = kymVar.c;
        synchronized (obj2) {
            obj2.notifyAll();
        }
    }

    public final void k(int[] iArr) {
        Iterator it = ((kfm) this.a).e.iterator();
        while (it.hasNext()) {
            ((ket) it.next()).c(iArr);
        }
    }

    public final void l() {
        Object obj = this.a;
        ((WatchFragment) obj).e.a(fhz.P(((cc) obj).getContext().getString(R.string.start_radio_error_toast_message)));
    }

    public final void m() {
        Object obj = this.a;
        ((WatchFragment) obj).e.a(fhz.P(((cc) obj).getContext().getString(R.string.start_radio_toast_message)));
    }

    public final void n(Throwable th) {
        Object obj = this.a;
        if (kro.M((cc) obj)) {
            return;
        }
        jmg jmgVar = (jmg) obj;
        jls jlsVar = jmgVar.au;
        if (jlsVar != null && jlsVar.n() == 4) {
            jmgVar.aI.s(jli.FAILURE);
        }
        jmgVar.B();
        if (jmgVar.az == 3) {
            Throwable cause = th.getCause();
            if ((cause instanceof StatusException) && ((StatusException) cause).getStatus().getCode() == Status.Code.CANCELLED) {
                return;
            }
            if ((th instanceof avcg) && ((avcg) th).a.getCode() == Status.Code.INVALID_ARGUMENT) {
                return;
            }
            jmgVar.K();
        }
    }

    public final Map o() {
        return ((aduw) ((jcp) this.a).b.io()).l();
    }

    @JavascriptInterface
    public void onPageReady() {
        cf activity = ((qcf) this.a).getActivity();
        if (activity != null) {
            activity.runOnUiThread(new qca(this, 4));
        }
    }

    public final void p(ajwo ajwoVar) {
        if (ajwoVar != null) {
            Object obj = this.a;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akyq.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akyq.a);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                aihf builder = ((akyo) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).toBuilder();
                aihf aihfVarCreateBuilder = appw.a.createBuilder();
                String strI = ((ivu) obj).b.hB().i();
                aihfVarCreateBuilder.copyOnWrite();
                appw appwVar = (appw) aihfVarCreateBuilder.instance;
                strI.getClass();
                appwVar.b |= 1;
                appwVar.c = strI;
                appw appwVar2 = (appw) aihfVarCreateBuilder.build();
                aihh aihhVar = (aihh) ajwoVar.toBuilder();
                aihhVar.e(akyq.a, (akyo) builder.build());
                aihhVar.e(appx.b, appwVar2);
                ajwoVar = (ajwo) aihhVar.build();
            }
            ((ivu) obj).a.c(ajwoVar, null);
        }
    }

    public final CharSequence q(int i) {
        Context context = ((ipo) this.a).b.getContext();
        return context != null ? context.getResources().getQuantityString(R.plurals.accessibility_duration_description_seconds, i, Integer.valueOf(i)) : "";
    }

    public final void r(String str, int i, Optional optional) {
        ikn iknVar = (ikn) this.a;
        if (iknVar.k.l(281, 45859619L, false)) {
            iknVar.f.c(iknVar.d.e(new ikm(this, str, i, optional, 0)));
        } else {
            iknVar.h(str, i, optional);
        }
    }

    public final void s() {
        hfk hfkVar = (hfk) this.a;
        for (hfj hfjVar : hfkVar.c) {
            if (hfkVar.e()) {
                hfjVar.b(false);
            } else {
                hfjVar.b(true);
            }
        }
    }

    public final void t() {
        grf grfVar = (grf) this.a;
        ViewGroup viewGroup = grfVar.an;
        if (viewGroup != null) {
            new twp(0, grfVar.aB, viewGroup, new grd(), 0).e();
        }
        grfVar.U();
    }

    public final vwg u(may mayVar) {
        gix gixVar = (gix) this.a;
        wek wekVar = (wek) gixVar.b.m.io();
        ght ghtVar = gixVar.a;
        return new vwg(wekVar, (awut) ghtVar.bm.io(), (avmb) ghtVar.dC.io(), (zvl) ghtVar.dO.io());
    }

    public final acnb v(SwipeRefreshLayout swipeRefreshLayout, acmz acmzVar) {
        gij gijVar = (gij) this.a;
        acqz acqzVar = (acqz) gijVar.c.B.io();
        ghj ghjVar = gijVar.b;
        xgm xgmVar = (xgm) ghjVar.j.io();
        ght ghtVar = gijVar.a;
        return new acnb(swipeRefreshLayout, acqzVar, xgmVar, acmzVar, (actm) ghtVar.a.ko.io(), (xeu) ghtVar.aZ.io(), (hno) ghtVar.jZ.io(), (mbc) ghtVar.l.io(), (acpo) ghjVar.pi.io(), (aclm) ghjVar.pj.io(), aupm.b(ghtVar.jY));
    }

    public final acqi w(acqh acqhVar, acqz acqzVar) {
        gij gijVar = (gij) this.a;
        return new acqi(gijVar.b.bB(), (hno) gijVar.a.jZ.io(), acqhVar, acqzVar);
    }

    public final acra x(long j, long j2, ajwo ajwoVar, aigj aigjVar, long j3, boolean z) {
        ght ghtVar = ((gij) this.a).a;
        return new acra(j, j2, ajwoVar, aigjVar, j3, z, (hno) ghtVar.jZ.io(), (adif) ghtVar.a.ls.io());
    }

    public final /* bridge */ /* synthetic */ rjz y(rjx rjxVar, Map map) {
        ght ghtVar = ((gjc) this.a).a;
        return new rjz((wnw) ghtVar.zR.io(), (zwb) ghtVar.bd.io(), (Executor) ghtVar.B.io(), rjxVar, map);
    }

    public final /* synthetic */ syw z(syx syxVar) {
        long seconds = syxVar.c.toSeconds();
        int i = syxVar.a;
        String str = syxVar.b;
        syw sywVarA = A(i, str, seconds);
        ahno.K(syxVar.equals(((Map) sywVarA.e.io()).get(str)), "TtlDiskCacheDirectory for path %s is not bound in the Map<String, TtlDiskCacheDirectory> multibinding", str);
        return sywVarA;
    }

    public qcb(Object obj) {
        this.a = obj;
    }

    public /* synthetic */ qcb(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public qcb() {
        throw null;
    }

    public qcb(char[] cArr) {
    }
}
