package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import com.google.android.libraries.elements.interfaces.CapabilitiesStore;
import com.google.android.libraries.elements.interfaces.ClientTemplateProvider;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import com.google.android.libraries.elements.interfaces.TemplateResolver;
import com.google.android.libraries.elements.interfaces.ThemeStore;
import com.google.android.libraries.elements.interfaces.WasmTemplateProvider;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class idj implements aupn {
    private final /* synthetic */ int $cid;

    public idj(int i) {
        this.$cid = i;
    }

    public static avlh b(icj icjVar) {
        return icjVar.h.P();
    }

    public static avlh c(avlh avlhVar, avlh avlhVar2) {
        return avlh.f(avlhVar, avlhVar2, new idi(0)).P();
    }

    public static jmx d(Context context, zwb zwbVar, awmd awmdVar, absl abslVar) {
        context.getClass();
        zwbVar.getClass();
        awmdVar.getClass();
        abslVar.getClass();
        return new jmx(context, zwbVar, awmdVar, abslVar);
    }

    public static iup e(vxz vxzVar, awmd awmdVar, awmd awmdVar2) {
        iup iupVar = vxzVar.l(232, 45783065L, false) ? (iup) awmdVar2.io() : (iup) awmdVar.io();
        iupVar.getClass();
        return iupVar;
    }

    public static jqa f(vxz vxzVar, awmd awmdVar) {
        vxzVar.getClass();
        awmdVar.getClass();
        if (!vxzVar.l(95, 45762151L, false)) {
            return new jqg();
        }
        Object objIo = awmdVar.io();
        objIo.getClass();
        return (jqa) objIo;
    }

    public static klt g() {
        klt kltVar = klt.a;
        kltVar.getClass();
        return kltVar;
    }

    public static Looper h(Object obj, ThreadFactory threadFactory) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        ((kjc) obj).t(ksy.aK("Lite", new kyn(threadFactory, 3))).newThread(new Runnable() { // from class: mbf
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture = settableFutureCreate;
                try {
                    Looper.prepare();
                    settableFuture.set(Looper.myLooper());
                    Looper.loop();
                    if ("robolectric".equals(Build.FINGERPRINT)) {
                        return;
                    }
                    qpj.a().post(new gqd(15));
                } catch (Throwable th) {
                    settableFuture.set(Looper.myLooper());
                    throw th;
                }
            }
        }).start();
        try {
            Looper looper = (Looper) a.i(settableFutureCreate);
            looper.getClass();
            return looper;
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static ClientTemplateProvider i(final agev agevVar, final agev agevVar2, final agev agevVar3, agev agevVar4, final agev agevVar5, final agev agevVar6, agev agevVar7, final agev agevVar8, final agev agevVar9, final agev agevVar10, final agev agevVar11) {
        ClientTemplateProvider clientTemplateProvider = (ClientTemplateProvider) msy.b.a(new nwm() { // from class: msu
            @Override // defpackage.nwm
            public final Object a() {
                agev agevVar12 = agevVar11;
                Boolean bool = Boolean.FALSE;
                ClientTemplateProvider.setEnableEkoArenaFieldSetPresize(((Boolean) agevVar12.e(bool)).booleanValue());
                boolean zBooleanValue = ((Boolean) agevVar.e(bool)).booleanValue();
                boolean zBooleanValue2 = ((Boolean) agevVar2.e(bool)).booleanValue();
                boolean zBooleanValue3 = ((Boolean) agevVar3.e(bool)).booleanValue();
                bool.booleanValue();
                boolean zBooleanValue4 = ((Boolean) agevVar5.e(bool)).booleanValue();
                boolean zBooleanValue5 = ((Boolean) agevVar6.e(bool)).booleanValue();
                bool.booleanValue();
                ClientTemplateProvider clientTemplateProviderCreate = ClientTemplateProvider.create(zBooleanValue, zBooleanValue2, zBooleanValue3, false, zBooleanValue4, zBooleanValue5, false, ((Boolean) agevVar8.e(bool)).booleanValue());
                clientTemplateProviderCreate.getClass();
                if (((Integer) agevVar9.e(0)).intValue() == 1) {
                    clientTemplateProviderCreate.setEnableLazyEkoBytecodeCompilation(true);
                }
                if (((Boolean) agevVar10.e(bool)).booleanValue()) {
                    clientTemplateProviderCreate.setEnableTrimMemory(true);
                }
                return clientTemplateProviderCreate;
            }
        });
        clientTemplateProvider.getClass();
        return clientTemplateProvider;
    }

    public static nsu j(agev agevVar, awmd awmdVar) {
        nsu nsuVar = !((Boolean) agevVar.e(Boolean.FALSE)).booleanValue() ? msy.a : (nsu) awmdVar.io();
        nsuVar.getClass();
        return nsuVar;
    }

    public static TemplateResolver k(UnifiedTemplateResolver unifiedTemplateResolver) {
        TemplateResolver templateResolverA = msy.a(unifiedTemplateResolver);
        templateResolverA.getClass();
        return templateResolverA;
    }

    public static UnifiedTemplateResolver l(final awmd awmdVar, final agev agevVar, final awmd awmdVar2, final agev agevVar2, final agev agevVar3, final agev agevVar4, final agev agevVar5, final agev agevVar6, final agev agevVar7, final agev agevVar8, final agev agevVar9, final agev agevVar10, final agev agevVar11, final agev agevVar12, final agev agevVar13, final agev agevVar14) {
        UnifiedTemplateResolver unifiedTemplateResolver = (UnifiedTemplateResolver) msy.c.a(new nwm() { // from class: msv
            /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r13v2, types: [awmd, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r14v2, types: [awmd, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v3, types: [awmd, java.lang.Object] */
            @Override // defpackage.nwm
            public final Object a() {
                ClientTemplateProvider clientTemplateProvider = (ClientTemplateProvider) awmdVar.io();
                agev agevVar15 = agevVar;
                Boolean bool = Boolean.FALSE;
                DebuggerClient debuggerClient = ((Boolean) agevVar15.e(bool)).booleanValue() ? (DebuggerClient) awmdVar2.io() : null;
                agev agevVar16 = agevVar4;
                agev agevVar17 = agevVar3;
                int iIntValue = ((Integer) agevVar2.e(0)).intValue();
                int iIntValue2 = ((Integer) agevVar17.e(0)).intValue();
                WasmTemplateProvider wasmTemplateProvider = (((Boolean) agevVar16.e(bool)).booleanValue() || ((Boolean) agevVar5.e(bool)).booleanValue()) ? (WasmTemplateProvider) ((agfa) agevVar6).a.io() : null;
                agev agevVar18 = agevVar14;
                agev agevVar19 = agevVar13;
                agev agevVar20 = agevVar12;
                agev agevVar21 = agevVar11;
                agev agevVar22 = agevVar10;
                agev agevVar23 = agevVar9;
                agev agevVar24 = agevVar8;
                agev agevVar25 = agevVar7;
                return new UnifiedTemplateResolver(clientTemplateProvider, debuggerClient, iIntValue, iIntValue2, wasmTemplateProvider, ((Boolean) agevVar16.e(bool)).booleanValue(), ((nzm) ((agfa) agevVar25).a.io()).a, ((Boolean) agevVar24.e(bool)).booleanValue(), (CapabilitiesStore) ((agfa) agevVar23).a.io(), (ThemeStore) ((agfa) agevVar22).a.io(), ((Boolean) agevVar21.e(bool)).booleanValue(), ((Boolean) agevVar20.e(bool)).booleanValue(), ((Boolean) agevVar19.e(bool)).booleanValue(), ((Boolean) agevVar18.e(bool)).booleanValue());
            }
        });
        unifiedTemplateResolver.getClass();
        return unifiedTemplateResolver;
    }

    public static ntd m(agev agevVar) {
        final nub nubVar = (nub) ((agfa) agevVar).a;
        Boolean.FALSE.booleanValue();
        return new ntd() { // from class: nqa
            @Override // defpackage.ntd
            public final nte a() {
                nub nubVar2 = nubVar;
                return new nqb(nubVar2.d, nubVar2.e, nubVar2.f, nubVar2.g, nubVar2.m);
            }
        };
    }

    public static qrx n(Context context, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("widgetpersistencemodule");
        qpqVar.d("recentlyplayeditems.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        qrlVarA.e(aimi.a);
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        return qrxVarC;
    }

    public static qrx o(Context context, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("sideloadedplaylistmigrationmodule");
        qpqVar.d("onboardingmodule.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        qrlVarA.e(aimq.a);
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        return qrxVarC;
    }

    public static DirectUpdateDataRelay p(kjc kjcVar, nuc nucVar) {
        DirectUpdateDataRelay directUpdateDataRelay = (DirectUpdateDataRelay) ((nwn) kjcVar.a).a(new mnn(nucVar, 1));
        directUpdateDataRelay.getClass();
        return directUpdateDataRelay;
    }

    public static ahey q(ThreadFactory threadFactory, ahey aheyVar, int i, mdj mdjVar, Object obj, agev agevVar, agev agevVar2, kjc kjcVar) {
        mdh mdhVar = new mdh("BG", i, ((Boolean) agevVar2.e(Boolean.FALSE)).booleanValue(), mdjVar);
        return new mbr(MoreExecutors.a(new mbu(ksy.aL(mdhVar, new mbj((kjc) obj, ksy.aK(mdhVar.a, new kyn(threadFactory, 3)), new StrictMode.ThreadPolicy.Builder()), ksy.aP(kjcVar, mdhVar)), (zhk) ((agfa) agevVar).a)), aheyVar);
    }

    public static ahey r(ThreadFactory threadFactory, ahey aheyVar, int i, Object obj, agev agevVar, agev agevVar2, kjc kjcVar) {
        mdh mdhVar = new mdh("Lite", i, ((Boolean) agevVar2.e(Boolean.FALSE)).booleanValue(), mdj.a);
        return new mbr(MoreExecutors.a(new mbu(ksy.aL(mdhVar, ((kjc) obj).t(ksy.aK(mdhVar.a, new kyn(threadFactory, 3))), ksy.aP(kjcVar, mdhVar)), (zhk) ((agfa) agevVar).a)), aheyVar);
    }

    public static nwj s(isi isiVar, Object obj, agev agevVar, final agev agevVar2) {
        nwj mnyVar;
        if (((Boolean) ((agfa) agevVar).a).booleanValue()) {
            mnyVar = new mny((hee) obj, ((Boolean) agevVar2.e(Boolean.FALSE)).booleanValue());
        } else {
            final hee heeVar = (hee) obj;
            mnyVar = (nwj) ((nwn) isiVar.a).a(new nwm() { // from class: mno
                @Override // defpackage.nwm
                public final Object a() {
                    return new mny(heeVar, ((Boolean) agevVar2.e(Boolean.FALSE)).booleanValue());
                }
            });
        }
        mnyVar.getClass();
        return mnyVar;
    }

    public static avlh t(hfn hfnVar) {
        return ((avlh) hfnVar.a).P();
    }

    public static nry u(mqq mqqVar, axfd axfdVar, agev agevVar, agev agevVar2, Object obj, isi isiVar) {
        return new mpd(mqqVar, axfdVar, agevVar, agevVar2, (mpe) obj, isiVar);
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
                return new mda();
            case 10:
                throw null;
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
