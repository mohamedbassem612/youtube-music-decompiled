package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.music.blocks.YoutubeActivityContainer;
import com.google.android.apps.youtube.music.blocks.YoutubeMusicProdContainer;
import com.google.android.libraries.blocks.Container;
import j$.util.Optional;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gly implements aupn {
    public static Container b(boolean z, YoutubeMusicProdContainer youtubeMusicProdContainer, awmd awmdVar, awmd awmdVar2) {
        awmdVar.getClass();
        awmdVar2.getClass();
        if (z) {
            return ((sqs) awmdVar.io()).a(youtubeMusicProdContainer, null);
        }
        meg.a();
        Object objIo = awmdVar2.io();
        objIo.getClass();
        wag wagVar = (wag) objIo;
        asbr asbrVar = (asbr) wagVar.c(42).io();
        return youtubeMusicProdContainer.d(wagVar.d(asbrVar.c), asbrVar, null);
    }

    public static Container c(boolean z, YoutubeActivityContainer youtubeActivityContainer, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, Executor executor, vxz vxzVar) {
        Container containerD;
        awmdVar.getClass();
        awmdVar2.getClass();
        awmdVar3.getClass();
        awmdVar4.getClass();
        executor.getClass();
        if (z) {
            containerD = ((sqs) awmdVar.io()).a(youtubeActivityContainer, (Container) awmdVar3.io());
        } else {
            meg.a();
            Object objIo = awmdVar2.io();
            objIo.getClass();
            wag wagVar = (wag) objIo;
            asbr asbrVar = (asbr) wagVar.c(142).io();
            containerD = youtubeActivityContainer.d(wagVar.d(asbrVar.c), asbrVar, (Container) awmdVar3.io());
        }
        if (vxzVar.l(25, 45724732L, false)) {
            taq.U(containerD, awmdVar4, executor);
        }
        return containerD;
    }

    public static avlh d(awkv awkvVar) {
        awkvVar.getClass();
        return awkvVar.P();
    }

    public static awkv e() {
        return new awkx().aI();
    }

    public static vnh f(gid gidVar) {
        vnh vnhVarC = gidVar.c();
        vnhVarC.getClass();
        return vnhVarC;
    }

    public static vnh g(gid gidVar, vxz vxzVar) {
        vnh vnhVarC = gidVar.c();
        if (vxzVar.l(132, 45845054L, false)) {
            vnhVarC = new hbx(vnhVarC);
        }
        vnhVarC.getClass();
        return vnhVarC;
    }

    public static tgl h(mbc mbcVar, tfu tfuVar, zry zryVar) {
        return new tgl(tfuVar, new zyc(zryVar, mbcVar));
    }

    public static tpw i(tdl tdlVar, aunn aunnVar, final boc bocVar) {
        tdlVar.getClass();
        aunnVar.getClass();
        final tpt tptVar = new tpt(new tpu(new pwa(tdlVar, 1), new tpv() { // from class: tdf
            @Override // defpackage.tpv
            public final void a(Object obj) {
                bof bofVar = (bof) obj;
                bofVar.getClass();
                bocVar.b(bofVar);
            }
        }, new tpz() { // from class: tde
            @Override // defpackage.tpz
            public final void iU(Object obj) {
                bof bofVar = (bof) obj;
                bofVar.getClass();
                bocVar.c(bofVar);
            }
        }));
        final tpt tptVar2 = new tpt(new tpu(aunnVar, tdlVar, tdlVar));
        return new tpu(new aunn() { // from class: hez
            @Override // defpackage.aunn
            public final Object io() {
                return atqq.aS(new tpt[]{tptVar, tptVar2});
            }
        }, new tpx(), new tpy());
    }

    public static awkv j() {
        return new awkx().aI();
    }

    public static awkv k() {
        return new awkx().aI();
    }

    public static hjf l(tun tunVar, xgn xgnVar, aunn aunnVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, ilx ilxVar, avlh avlhVar, aunn aunnVar2, aunn aunnVar3) {
        return new hjf(tunVar, xgnVar, aunnVar, (hjc) obj, (hjb) obj2, (hjm) obj3, (hjl) obj4, (hje) obj5, (hji) obj6, (hjh) obj7, (hjh) obj8, (hjg) obj9, (hjj) obj10, (hjk) obj11, ilxVar, avlhVar, aunnVar2, aunnVar3);
    }

    public static xgn m(abea abeaVar) {
        xgn xgnVarA = abeaVar.a();
        xgnVarA.getClass();
        return xgnVarA;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public static hnz n(Optional optional, awmd awmdVar) {
        sxe sxeVar = new sxe(awmdVar, 1);
        optional.isPresent();
        hnz hnzVar = (hnz) sxeVar.a.io();
        hnzVar.getClass();
        return hnzVar;
    }

    public static aanl o(aunn aunnVar, aunn aunnVar2, tqj tqjVar) {
        int i = tqr.a;
        aanl aanlVar = tqjVar.k(1073830356) ? (aanl) aunnVar.io() : (aanl) aunnVar2.io();
        aanlVar.getClass();
        return aanlVar;
    }

    public static List p(hzt hztVar, hzt hztVar2, hzt hztVar3, hzr hzrVar, hzq hzqVar) {
        List listAsList = Arrays.asList(hzqVar, hztVar, hztVar2, hztVar3, hzrVar);
        listAsList.getClass();
        return listAsList;
    }

    public static qrx q(Context context, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("persistencemodule");
        qpqVar.d("playercontrolsmodel.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        qrlVarA.e(aimh.a);
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        return qrxVarC;
    }

    public static qrx r(Context context, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("playbackratemodule");
        qpqVar.d("playbackratemodule.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        qrlVarA.e(ailh.a);
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        return qrxVarC;
    }

    public static avlh s(jan janVar) {
        return ((avlh) janVar.d).P();
    }

    public static awku t(jan janVar) {
        Object obj = janVar.d;
        obj.getClass();
        return (awku) obj;
    }

    public static ahto u(gid gidVar) {
        ahto ahtoVarO = gidVar.o();
        ahtoVarO.getClass();
        return ahtoVarO;
    }

    public static ahto v(gid gidVar) {
        ahto ahtoVarO = gidVar.o();
        ahtoVarO.getClass();
        return ahtoVarO;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
