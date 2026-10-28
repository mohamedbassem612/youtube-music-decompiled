package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeff implements aupn {
    public static aeez b(Activity activity, Map map) {
        aeez aeezVar;
        awmd awmdVar = (awmd) map.get(activity.getClass());
        if (awmdVar != null) {
            aeezVar = (aeez) awmdVar.io();
        } else {
            ((agrc) ((agrc) aefe.a.c()).k("com/google/android/libraries/youtube/rendering/ui/transientui/snackbar/SnackbarModule", "provideUntypedSnackbarController", 34, "SnackbarModule.java")).w("No SnackbarController found for activity (%s), falling back to NO_OP.", activity.getClass().getName());
            aeezVar = aeez.e;
        }
        aeezVar.getClass();
        return aeezVar;
    }

    public static tpq c(Context context, awmd awmdVar) {
        rrq rrqVar = (rrq) awmdVar.io();
        atpw atpwVar = atpw.a;
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("renderingui");
        qpqVar.d("frequency_cap_proto.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.e(atpwVar);
        qrlVarA.g(true);
        qrlVarA.f(uriA);
        return new tpn(omj.U(rrqVar.c(qrlVarA.a())), atpwVar);
    }

    public static aenu d(awmd awmdVar, awmd awmdVar2, tqj tqjVar) {
        awmdVar.getClass();
        awmdVar2.getClass();
        tqjVar.getClass();
        int i = tqr.a;
        if (tqjVar.l(1074615367, 254)) {
            Object objIo = awmdVar.io();
            objIo.getClass();
            return (aenu) objIo;
        }
        Object objIo2 = awmdVar2.io();
        objIo2.getClass();
        return (aenu) objIo2;
    }

    public static dyl e() {
        throw new IllegalArgumentException("Do not directly use the WorkManager or Configuration types. See go/tiktok/dev/androidx/work.");
    }

    public static awut f(awou awouVar, afpa afpaVar) {
        awouVar.getClass();
        afpaVar.getClass();
        return aewp.l(awouVar, afpaVar.getLifecycle());
    }

    public static awou g(ahey aheyVar) {
        aheyVar.getClass();
        awou awouVarPlus = new afmi(new awvw(new afmj(aheyVar))).plus(afme.a).plus(afws.a());
        awouVarPlus.getClass();
        return awouVarPlus;
    }

    public static ExtensionRegistryLite h() {
        afuu afuuVarC = afwt.c(148, "provideExtensionRegistry");
        try {
            ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
            afuuVarC.close();
            generatedRegistry.getClass();
            return generatedRegistry;
        } catch (Throwable th) {
            try {
                afuuVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static awou i(ahud ahudVar, ahey aheyVar, awou awouVar, agev agevVar, agev agevVar2, agev agevVar3) {
        aheyVar.getClass();
        awouVar.getClass();
        agevVar2.getClass();
        afmh afmhVar = new afmh();
        Boolean.TRUE.booleanValue();
        awou awouVarW = ahudVar.W(new mbr(MoreExecutors.a(new afkf(aheyVar, ((Boolean) agevVar2.e(Boolean.FALSE)).booleanValue(), true)), aheyVar));
        pwb pwbVar = new pwb(afmhVar, 3);
        awos awosVar = awouVarW.get(CoroutineExceptionHandler.c);
        awosVar.getClass();
        afmg afmgVar = new afmg((CoroutineExceptionHandler) awosVar, afme.a, pwbVar);
        ahx ahxVar = awor.j;
        awos awosVar2 = awouVarW.get(ahxVar);
        awosVar2.getClass();
        awos awosVar3 = awouVar.get(ahxVar);
        awosVar3.getClass();
        awou awouVarPlus = awouVarW.plus(new afmf(new afmi((awuq) awosVar3), afmhVar)).plus(afmgVar);
        awouVarPlus.getClass();
        return awouVarPlus;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
