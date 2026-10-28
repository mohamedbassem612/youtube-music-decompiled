package defpackage;

import android.content.Context;
import android.provider.Settings;
import android.view.ContextThemeWrapper;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.elements.interfaces.DebuggerCallback;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.Executor;
import com.google.android.libraries.elements.interfaces.ExecutorRegistry;
import com.google.android.libraries.elements.interfaces.ExecutorThread;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iqf implements aupn {
    private final /* synthetic */ int $cid;

    public iqf(int i) {
        this.$cid = i;
    }

    public static acdo b(abvn abvnVar) {
        acdo acdoVarW = abvnVar.w();
        acdoVarW.getClass();
        return acdoVarW;
    }

    public static tpk c(zwb zwbVar, sym symVar) {
        aimn aimnVar = iqe.a;
        return new tpk(new oqe(zwbVar, 1), symVar, new heo(5));
    }

    public static jer d(afpa afpaVar) {
        jer jerVarZ = ((jgg) atqp.a(afpaVar.a, jgg.class)).z();
        jerVarZ.getClass();
        return jerVarZ;
    }

    public static Context e(Context context) {
        context.getClass();
        return new ContextThemeWrapper(context, R.style.Themed_YouTube_Dark_AppCompat_DarkerPalette);
    }

    public static ExtensionRegistryLite f(Set set) {
        ExtensionRegistryLite extensionRegistryLite;
        if (set.isEmpty()) {
            extensionRegistryLite = ExtensionRegistryLite.a;
        } else {
            ExtensionRegistryLite extensionRegistryLite2 = new ExtensionRegistryLite();
            agqr it = ((agqj) set).iterator();
            while (it.hasNext()) {
                aihl aihlVar = askx.b;
                if (aihlVar instanceof aihl) {
                    extensionRegistryLite2.b(aihlVar);
                }
            }
            extensionRegistryLite = extensionRegistryLite2;
        }
        extensionRegistryLite.getClass();
        return extensionRegistryLite;
    }

    public static npb g(agev agevVar, final Context context, final awmd awmdVar, final agev agevVar2) {
        if (!((Boolean) agevVar.e(Boolean.FALSE)).booleanValue()) {
            throw new IllegalStateException("Creating DebuggerCallback when debugger is disabled");
        }
        npb npbVar = (npb) msy.d.a(new nwm() { // from class: msw
            @Override // defpackage.nwm
            public final Object a() {
                return new npb(context, awmdVar, agevVar2);
            }
        });
        npbVar.getClass();
        return npbVar;
    }

    public static DebuggerClient h(agev agevVar, final String str, final awmd awmdVar, final Context context, final agev agevVar2) {
        if (!((Boolean) agevVar.e(Boolean.FALSE)).booleanValue()) {
            throw new IllegalStateException("Creating DebuggerClient when debugger is disabled");
        }
        DebuggerClient debuggerClient = (DebuggerClient) msy.e.a(new nwm() { // from class: mst
            @Override // defpackage.nwm
            public final Object a() {
                Executor npqVar;
                Context context2 = context;
                String strValueOf = String.valueOf(Settings.Secure.getString(context2.getContentResolver(), "android_id"));
                String strValueOf2 = String.valueOf(context2.getPackageName());
                String strValueOf3 = String.valueOf(String.valueOf(context2.getApplicationInfo().loadLabel(context2.getPackageManager())));
                agev agevVar3 = agevVar2;
                if (agevVar3.g()) {
                    npqVar = ((ExecutorRegistry) agevVar3.c()).executorForExecutorThread(ExecutorThread.BACKGROUND);
                } else {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                    npqVar = new npq(new npo(scheduledThreadPoolExecutor, 1), scheduledThreadPoolExecutor.getPoolSize());
                }
                awmd awmdVar2 = awmdVar;
                return DebuggerClient.create(str, strValueOf.concat(strValueOf2), "Android - ".concat(strValueOf3), npqVar, (DebuggerCallback) awmdVar2.io());
            }
        });
        debuggerClient.getClass();
        return debuggerClient;
    }

    public static String i(agev agevVar) {
        return ((String) agevVar.e("localhost")).concat(":5001");
    }

    public static elr j(elr elrVar) {
        return new elr(elrVar.a, (byte[]) null);
    }

    public static ppw k(swe sweVar, pbz pbzVar) {
        pbzVar.getClass();
        return sweVar.e(pbzVar, "CHIME_PERIODIC_JOB", 7);
    }

    public static ppw l(swe sweVar, peu peuVar) {
        peuVar.getClass();
        return sweVar.e(peuVar, "CHIME_THREAD_STATE_UPDATE", 10);
    }

    public static ppw m(swe sweVar, pfb pfbVar) {
        pfbVar.getClass();
        return sweVar.e(pfbVar, "CHIME_FETCH_LATEST_THREADS", 2);
    }

    public static ppw n(swe sweVar, pfc pfcVar) {
        pfcVar.getClass();
        return sweVar.e(pfcVar, "CHIME_FETCH_UPDATED_THREADS", 2);
    }

    public static ppw o(swe sweVar, pfd pfdVar) {
        pfdVar.getClass();
        return sweVar.e(pfdVar, "CHIME_REMOVE_TARGET", 1);
    }

    public static ppw p(swe sweVar, pfh pfhVar) {
        pfhVar.getClass();
        return sweVar.e(pfhVar, "CHIME_SET_USER_PREFERENCE", 6);
    }

    public static ppw q(swe sweVar, pfi pfiVar) {
        pfiVar.getClass();
        return sweVar.e(pfiVar, "CHIME_STORE_TARGET", 1);
    }

    public static IntersectionEngine r(isi isiVar, awmd awmdVar, Context context) {
        IntersectionEngine intersectionEngine = (IntersectionEngine) ((nwn) isiVar.b).a(new adaw(awmdVar, context, 1));
        intersectionEngine.getClass();
        return intersectionEngine;
    }

    public static sym s(Context context, rrq rrqVar, ayq ayqVar) {
        aimn aimnVar = iqe.a;
        qrl qrlVarA = qrm.a();
        qrlVarA.f(tpj.a(context, "musicsettings", "top_level_prefs.pb"));
        aili ailiVar = aili.a;
        qrlVarA.e(ailiVar);
        return ayqVar.P(omj.U(rrqVar.c(qrlVarA.a())), ailiVar);
    }

    public static tld t(Context context, awou awouVar) {
        context.getClass();
        awouVar.getClass();
        return new tld(new pfn(context, awouVar, 0));
    }

    public static pou u(qcb qcbVar) {
        qcbVar.getClass();
        ght ghtVar = ((ghs) qcbVar.a).a;
        pvg pvgVarM = ghtVar.M();
        Context context = (Context) ghtVar.v.io();
        context.getClass();
        khn khnVar = lll.a;
        return new pow(pvgVarM, new llq(context), agpr.a, agkz.n(atqq.aS(new String[]{ault.b.c, ault.a.c})), (mbc) ghtVar.l.io(), ghtVar.dL(), ghtVar.yj, (Context) ghtVar.v.io(), (pls) ghtVar.yi.io());
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        switch (this.$cid) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                throw null;
            case 7:
                throw null;
            case 8:
                throw null;
            case 9:
                throw null;
            case 10:
                return new kto();
            case 11:
                throw null;
            case 12:
                throw null;
            case 13:
                throw null;
            case 14:
                throw null;
            case 15:
                throw null;
            case 16:
                throw null;
            case 17:
                throw null;
            case 18:
                throw null;
            case 19:
                throw null;
            default:
                throw null;
        }
    }
}
