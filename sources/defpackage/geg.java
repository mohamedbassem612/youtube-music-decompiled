package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.activities.MusicActivity;
import com.google.android.apps.youtube.music.blocks.YoutubeActivityAccountContainer;
import com.google.android.libraries.blocks.Container;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class geg implements aupn {
    public static rg b(cf cfVar) {
        rg activityResultRegistry = cfVar.getActivityResultRegistry();
        activityResultRegistry.getClass();
        return activityResultRegistry;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public static gdt c(Optional optional, awmd awmdVar) {
        hly hlyVar = new hly(awmdVar, 1);
        optional.isPresent();
        gdt gdtVar = (gdt) hlyVar.a.io();
        gdtVar.getClass();
        return gdtVar;
    }

    public static gfq d(Activity activity, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, tqj tqjVar) {
        gfq gfqVar;
        if (activity instanceof MusicActivity) {
            int i = tqr.a;
            gfqVar = tqjVar.k(1073830461) ? (gfq) aunnVar2.io() : (gfq) aunnVar.io();
        } else {
            gfqVar = (gfq) aunnVar3.io();
        }
        gfqVar.getClass();
        return gfqVar;
    }

    public static rmy e(afpa afpaVar) {
        rmy rmyVarC = ((gfm) atqp.a(afpaVar.a, gfm.class)).c();
        rmyVarC.getClass();
        return rmyVarC;
    }

    public static agkz f() {
        agkz agkzVarU = agkz.u(aixo.SLOT_TYPE_PLAYER_BYTES, aixo.SLOT_TYPE_BELOW_PLAYER, aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, aixo.SLOT_TYPE_IN_PLAYER, aixo.SLOT_TYPE_LOCKSCREEN, aixo.SLOT_TYPE_FORECASTING, aixo.SLOT_TYPE_AD_BREAK_REQUEST);
        agkzVarU.getClass();
        return agkzVarU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static igy g(Activity activity, igx igxVar) {
        igy igyVar = igxVar;
        if (activity instanceof igy) {
            igyVar = (igy) activity;
        }
        igyVar.getClass();
        return igyVar;
    }

    public static dd h(cf cfVar) {
        dd supportFragmentManager = cfVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        return supportFragmentManager;
    }

    public static vxc i(aunn aunnVar) {
        aunnVar.getClass();
        Object objIo = aunnVar.io();
        objIo.getClass();
        return (vxc) objIo;
    }

    public static Container j(boolean z, YoutubeActivityAccountContainer youtubeActivityAccountContainer, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, Executor executor, vxz vxzVar) {
        Container containerD;
        awmdVar.getClass();
        awmdVar2.getClass();
        awmdVar4.getClass();
        executor.getClass();
        if (z) {
            containerD = ((sqs) awmdVar.io()).a(youtubeActivityAccountContainer, (Container) awmdVar3.io());
        } else {
            meg.a();
            Object objIo = awmdVar2.io();
            objIo.getClass();
            wag wagVar = (wag) objIo;
            asbr asbrVar = (asbr) wagVar.c(1242).io();
            containerD = youtubeActivityAccountContainer.d(wagVar.d(asbrVar.c), asbrVar, (Container) awmdVar3.io());
        }
        if (vxzVar.l(25, 45724732L, false)) {
            taq.U(containerD, awmdVar4, executor);
        }
        return containerD;
    }

    public static agkj k() {
        agkj agkjVar = gzi.a;
        agkjVar.getClass();
        return agkjVar;
    }

    public static Intent l(Context context) {
        Intent flags = new Intent().setClassName(context, "com.google.android.apps.youtube.music.activities.InternalMusicActivity").setAction("android.intent.action.MAIN").setFlags(67108864);
        flags.getClass();
        return flags;
    }

    public static abnz m(hyv hyvVar, vxz vxzVar) {
        vxzVar.getClass();
        return !vxzVar.l(102, 45785173L, false) ? abnz.a : hyvVar;
    }

    public static ViewGroup n(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.accessibility_layer_container);
        viewGroup.getClass();
        return viewGroup;
    }

    public static View o(Activity activity) {
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.custom_thumbnail_creation_activity, (ViewGroup) null);
        viewInflate.getClass();
        return viewInflate;
    }

    public static qrx p(Context context, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("mediaserviceinteractionstore");
        qpqVar.d("mediaserviceinteractionstore.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        qrlVarA.e(aill.a);
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        return qrxVarC;
    }

    public static gyv q(igy igyVar, igr igrVar, grj grjVar, jij jijVar, Object obj, awmd awmdVar, awmd awmdVar2, Executor executor, xit xitVar) {
        return new gyv(igyVar, igrVar, grjVar, jijVar, (xsc) obj, awmdVar, awmdVar2, executor, xitVar);
    }

    public static vxc r(qcb qcbVar, awmd awmdVar) {
        qcbVar.getClass();
        awmdVar.getClass();
        return qcbVar.C(awmdVar);
    }

    public static vxc s(qcb qcbVar, awmd awmdVar, jin jinVar) {
        qcbVar.getClass();
        awmdVar.getClass();
        jinVar.getClass();
        return qcbVar.D(awmdVar, Optional.of(jinVar));
    }

    public static vxc t(qcb qcbVar, awmd awmdVar, jin jinVar) {
        qcbVar.getClass();
        awmdVar.getClass();
        jinVar.getClass();
        return qcbVar.D(awmdVar, Optional.of(jinVar));
    }

    public static vxc u(qcb qcbVar, aczl aczlVar) {
        qcbVar.getClass();
        ggt ggtVar = (ggt) qcbVar.a;
        zwh zwhVar = (zwh) ggtVar.b.c.io();
        ght ghtVar = ggtVar.a;
        return new vmu(zwhVar, (wco) ghtVar.jy.io(), (wbz) ghtVar.es.io(), (ztf) ghtVar.cl.io(), (vxz) ghtVar.cu.io(), (Executor) ghtVar.u.io(), (vmx) ghtVar.ts.io(), aczlVar);
    }

    public static aczl v(qcb qcbVar, vxe vxeVar) {
        qcbVar.getClass();
        vxeVar.getClass();
        return qcbVar.M(vxeVar);
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
