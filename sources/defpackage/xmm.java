package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xmm implements kcs {
    final /* synthetic */ xmn b;
    boolean a = false;
    private final jzx c = new jzx() { // from class: xml
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, yco] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.jzx
        public final void a(String str) {
            agrf agrfVar = xmn.a;
            xmn xmnVar = this.a.b;
            agrx agrxVar = agso.a;
            yaa yaaVar = xmnVar.o;
            if (yaaVar == null) {
                ((agrc) ((agrc) xmn.a.c().i(agrxVar, "MDX.CastSdkClient")).k("com/google/android/libraries/youtube/mdx/castclient/DefaultCastSdkClient$CastSessionListener", "<init>", 213, "DefaultCastSdkClient.java")).t("No handler set, dropped message.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!TextUtils.equals(jSONObject.getString("type"), "mdxSessionStatus") || ((yae) yaaVar.a).g) {
                    return;
                }
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    String string = jSONObject2.getString("screenId");
                    String string2 = jSONObject2.getString("deviceId");
                    ?? r11 = yaaVar.a;
                    yae yaeVar = (yae) r11;
                    yaeVar.F.w(191, "cx_rsid");
                    ycp ycpVar = yaeVar.E;
                    ycpVar.l(9);
                    int i = xve.i;
                    xvb xvbVar = new xvb();
                    xvbVar.f(new xvz(string));
                    xvbVar.b(new xvg(string2));
                    xvbVar.g(yaeVar.h.c());
                    xvbVar.e(new xvv(4, false));
                    xve xveVarA = xvbVar.a();
                    ycj ycjVar = (ycj) r11;
                    ycjVar.aR(yaeVar.k.B(xveVarA, new yaa(ycjVar), ycpVar, r11));
                    yaeVar.g = true;
                } catch (JSONException e) {
                    ((agrc) ((agrc) ((agrc) yae.a.b().i(agso.a, "MDX.CastV3")).j(e)).k("com/google/android/libraries/youtube/mdx/remote/internal/CastSession$CastSdkClientConsumerImpl", "handleMdxSessionStatusMessage", (char) 474, "CastSession.java")).w("%s", "Cannot parse incoming MdxSessionStatus Cast message: ".concat(jSONObject.toString()));
                    ((yae) yaaVar.a).aF();
                }
            } catch (JSONException e2) {
                String strValueOf = String.valueOf(str);
                ((agrc) ((agrc) ((agrc) yae.a.b().i(agso.a, "MDX.CastV3")).j(e2)).k("com/google/android/libraries/youtube/mdx/remote/internal/CastSession$CastSdkClientConsumerImpl", "handleReceivedMessage", (char) 451, "CastSession.java")).w("%s", "Cannot parse incoming Cast message: ".concat(strValueOf));
                ((yae) yaaVar.a).aF();
            }
        }
    };

    public xmm(xmn xmnVar) {
        this.b = xmnVar;
    }

    private final void k(kbu kbuVar) {
        xmn xmnVar = this.b;
        yaa yaaVar = xmnVar.o;
        if (yaaVar == null) {
            ((agrc) ((agrc) xmn.a.b().i(agso.a, "MDX.CastSdkClient")).k("com/google/android/libraries/youtube/mdx/castclient/DefaultCastSdkClient$CastSessionListener", "notifySdkClientConsumerOfNewSession", 280, "DefaultCastSdkClient.java")).t("notifySdkClientConsumerOfNewSession, castSdkClientConsumer is null");
            xmnVar.f();
            return;
        }
        try {
            String str = xmnVar.c;
            jzx jzxVar = this.c;
            kro.f("Must be called from the main thread.");
            jzz jzzVar = kbuVar.c;
            if (jzzVar != null && jzzVar.e()) {
                kbuVar.c.i(str, jzxVar);
            }
            yaaVar.a(kbuVar);
        } catch (IOException e) {
            zvp.b(zvn.b, zvm.v, "setMessageReceivedCallbacks failed", e);
            ((agrc) ((agrc) ((agrc) xmn.a.b().i(agso.a, "MDX.CastSdkClient")).j(e)).k("com/google/android/libraries/youtube/mdx/castclient/DefaultCastSdkClient$CastSessionListener", "notifySdkClientConsumerOfNewSession", (char) 290, "DefaultCastSdkClient.java")).t("setMessageReceivedCallbacks failed");
            yaaVar.b(0);
        }
    }

    private final void l(kbu kbuVar) {
        Optional optionalA;
        xmn xmnVar = this.b;
        CastDevice castDeviceB = kbuVar.b();
        if (castDeviceB == null) {
            optionalA = Optional.empty();
        } else {
            yan yanVar = xmnVar.m;
            xrg xrgVarA = ((xrj) yanVar.c.io()).a(castDeviceB.a);
            ((ycp) yanVar.f.io()).e(new xvj(castDeviceB), ((xwv) yanVar.d.io()).e(), xrgVarA.b, xrgVarA.c);
            optionalA = yanVar.a();
        }
        if (optionalA.isEmpty()) {
            j(0);
        } else {
            xmnVar.o = (yaa) optionalA.get();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:36:0x0112  */
    @Override // defpackage.kcs
    public final /* synthetic */ void a(kcq kcqVar, int i) {
        xvj xvjVar;
        aunn aunnVar;
        xri xriVarA;
        int i2;
        kbu kbuVar = (kbu) kcqVar;
        agrf agrfVar = xmn.a;
        agrx agrxVar = agso.a;
        Integer numValueOf = Integer.valueOf(i);
        boolean z = this.a;
        xmn xmnVar = this.b;
        xmnVar.p.z(13, numValueOf, z);
        String str = kbuVar.b() != null ? kbuVar.b().a : "";
        if (xmnVar.n.l(141, 45644886L, false) && (i2 = xmnVar.l) != -1) {
            i = i2;
        }
        yan yanVar = xmnVar.m;
        Integer numValueOf2 = Integer.valueOf(i);
        Optional optionalB = yanVar.b();
        if (optionalB.isEmpty()) {
            ((agrc) ((agrc) yan.a.c().i(agso.a, "MDX.CastSdkClientAdapter")).k("com/google/android/libraries/youtube/mdx/remote/internal/DefaultCastSdkClientAdapter", "onSessionStop", 98, "DefaultCastSdkClientAdapter.java")).t("Cast session is unexpectedly missing on session stop");
            if (!((xra) yanVar.e.io()).c()) {
                aunnVar = yanVar.f;
                ycp ycpVar = (ycp) aunnVar.io();
                numValueOf2.getClass();
                xriVarA = xri.a().a();
                if (!TextUtils.isEmpty(str)) {
                    xriVarA = ((xrj) yanVar.c.io()).b(str);
                }
                if (((xra) yanVar.e.io()).c()) {
                    if (i != 2154) {
                        xrh xrhVarA = xri.a();
                        xrhVarA.c(true);
                        xriVarA = xrhVarA.a();
                    } else if (i == 2155) {
                        xrh xrhVarA2 = xri.a();
                        xrhVarA2.c(true);
                        xrhVarA2.b(((xsa) ((ycp) aunnVar.io()).n.io()).j());
                        xrhVarA2.d = abjx.b;
                        xriVarA = xrhVarA2.a();
                    }
                }
                ycpVar.h(xriVarA, Optional.of(numValueOf2));
            }
        } else {
            yae yaeVar = (yae) optionalB.get();
            if (!((xra) yanVar.e.io()).c() || TextUtils.isEmpty(str) || (xvjVar = yaeVar.h) == null || xvjVar.d().b.equals(str)) {
                yaeVar.i.set(numValueOf2);
                aunnVar = yanVar.f;
                ycp ycpVar2 = (ycp) aunnVar.io();
                numValueOf2.getClass();
                xriVarA = xri.a().a();
                if (!TextUtils.isEmpty(str)) {
                    xriVarA = ((xrj) yanVar.c.io()).b(str);
                }
                if (((xra) yanVar.e.io()).c()) {
                    if (i != 2154) {
                        xrh xrhVarA3 = xri.a();
                        xrhVarA3.c(true);
                        xriVarA = xrhVarA3.a();
                    } else if (i == 2155) {
                        xrh xrhVarA4 = xri.a();
                        xrhVarA4.c(true);
                        xrhVarA4.b(((xsa) ((ycp) aunnVar.io()).n.io()).j());
                        xrhVarA4.d = abjx.b;
                        xriVarA = xrhVarA4.a();
                    }
                }
                ycpVar2.h(xriVarA, Optional.of(numValueOf2));
            } else {
                yaeVar.h.d();
            }
        }
        xmnVar.f();
    }

    @Override // defpackage.kcs
    public final /* synthetic */ void b(kcq kcqVar) {
        agrf agrfVar = xmn.a;
        agrx agrxVar = agso.a;
    }

    @Override // defpackage.kcs
    public final /* synthetic */ void c(kcq kcqVar, int i) {
        agrf agrfVar = xmn.a;
        agrx agrxVar = agso.a;
        this.b.p.z(8, Integer.valueOf(i), this.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:31:0x0117  */
    /* JADX WARN: Code duplicated, block: B:34:0x011d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0129  */
    @Override // defpackage.kcs
    public final /* synthetic */ void d(kcq kcqVar, boolean z) {
        aunn aunnVar;
        amzd amzdVar;
        Optional optionalA;
        kbu kbuVar = (kbu) kcqVar;
        agrf agrfVar = xmn.a;
        agrx agrxVar = agso.a;
        xmn xmnVar = this.b;
        xmnVar.p.z(7, null, this.a);
        if (kbuVar != null && kbuVar.b() != null && z && xmnVar.l == 2310) {
            xmnVar.l = -1;
            ycp ycpVar = (ycp) xmnVar.e.io();
            CastDevice castDeviceB = kbuVar.b();
            castDeviceB.getClass();
            xvj xvjVar = new xvj(castDeviceB);
            yco ycoVar = ycpVar.e;
            if (ycoVar == null) {
                ((agrc) ((agrc) ycp.a.c().i(agso.a, "MDX.MdxSessionManagerImpl")).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionManagerImpl", "onMediaTransferComplete", 502, "MdxSessionManagerImpl.java")).t("no MDx session active, ignoring media transfer.");
            } else {
                ycoVar.Q(xvjVar);
            }
        }
        yan yanVar = xmnVar.m;
        CastDevice castDeviceB2 = kbuVar.b();
        if (castDeviceB2 == null) {
            ((agrc) ((agrc) yan.a.c().i(agso.a, "MDX.CastSdkClientAdapter")).k("com/google/android/libraries/youtube/mdx/remote/internal/DefaultCastSdkClientAdapter", "onSessionResume", 150, "DefaultCastSdkClientAdapter.java")).t("Cast device should not be null if the session is resumed, this is possibly a bug with SDK callback.");
            optionalA = Optional.empty();
        } else {
            yco ycoVar2 = ((ycp) yanVar.b.io()).e;
            if (ycoVar2 == null) {
                ycp ycpVar2 = (ycp) yanVar.g.io();
                xvj xvjVar2 = new xvj(castDeviceB2);
                aunnVar = ycpVar2.f;
                ((wjr) aunnVar.io()).v(16);
                ((wjr) aunnVar.io()).v(191);
                amzdVar = ycpVar2.m.b().m;
                if (amzdVar == null) {
                    amzdVar = amzd.a;
                }
                if (amzdVar.b) {
                    ((wjr) aunnVar.io()).v(121);
                } else {
                    ((wjr) aunnVar.io()).x();
                }
                taf.i(((yck) ycpVar2.i.io()).a(), MoreExecutors.directExecutor(), new xfa(ycpVar2, xvjVar2, 3, null), new xwl(ycpVar2, xvjVar2, 10), null);
                optionalA = yanVar.a();
            } else if (!(ycoVar2.j() instanceof xvj) || !((xvj) ycoVar2.j()).d().b.equals(castDeviceB2.a)) {
                yanVar.h.z(10, null, false);
                optionalA = Optional.empty();
            } else if (ycoVar2.b() == 1) {
                yanVar.h.z(11, null, false);
                optionalA = Optional.empty();
            } else if (ycoVar2.b() == 0) {
                optionalA = yanVar.a();
            } else {
                ycp ycpVar3 = (ycp) yanVar.g.io();
                xvj xvjVar3 = new xvj(castDeviceB2);
                aunnVar = ycpVar3.f;
                ((wjr) aunnVar.io()).v(16);
                ((wjr) aunnVar.io()).v(191);
                amzdVar = ycpVar3.m.b().m;
                if (amzdVar == null) {
                    amzdVar = amzd.a;
                }
                if (amzdVar.b) {
                    ((wjr) aunnVar.io()).v(121);
                } else {
                    ((wjr) aunnVar.io()).x();
                }
                taf.i(((yck) ycpVar3.i.io()).a(), MoreExecutors.directExecutor(), new xfa(ycpVar3, xvjVar3, 3, null), new xwl(ycpVar3, xvjVar3, 10), null);
                optionalA = yanVar.a();
            }
        }
        if (optionalA.isEmpty()) {
            return;
        }
        xmnVar.o = (yaa) optionalA.get();
        xmnVar.h = true;
        ((ycp) xmnVar.d.io()).l(8);
        k(kbuVar);
    }

    @Override // defpackage.kcs
    public final /* synthetic */ void e(kcq kcqVar, String str) {
        agrf agrfVar = xmn.a;
        agrx agrxVar = agso.a;
        this.b.p.z(6, null, this.a);
    }

    @Override // defpackage.kcs
    public final /* bridge */ /* synthetic */ void f(kcq kcqVar, int i) {
        j(i);
    }

    @Override // defpackage.kcs
    public final /* synthetic */ void g(kcq kcqVar, String str) {
        xmn xmnVar = this.b;
        kbu kbuVar = (kbu) kcqVar;
        if (xmnVar.j) {
            l(kbuVar);
        }
        if (((Boolean) xmnVar.f.io()).booleanValue()) {
            ((agrc) ((agrc) xmn.a.c().i(agso.a, "MDX.CastSdkClient")).k("com/google/android/libraries/youtube/mdx/castclient/DefaultCastSdkClient$CastSessionListener", "onSessionStarted", 258, "DefaultCastSdkClient.java")).t("Ending cast session due to sideloaded content");
            xmnVar.g.d(false);
            return;
        }
        agrx agrxVar = agso.a;
        ((ycp) xmnVar.d.io()).l(8);
        if (!xmnVar.h) {
            xmnVar.p.z(4, null, this.a);
            xmnVar.h = true;
        }
        k(kbuVar);
    }

    @Override // defpackage.kcs
    public final /* synthetic */ void h(kcq kcqVar) {
        kbu kbuVar = (kbu) kcqVar;
        agrf agrfVar = xmn.a;
        agrx agrxVar = agso.a;
        xmn xmnVar = this.b;
        xmnVar.p.z(3, null, this.a);
        xmnVar.h = false;
        xmnVar.l = -1;
        if (xmnVar.j) {
            return;
        }
        l(kbuVar);
    }

    @Override // defpackage.kcs
    public final /* synthetic */ void i(kcq kcqVar, int i) {
        kbu kbuVar = (kbu) kcqVar;
        agrf agrfVar = xmn.a;
        agrx agrxVar = agso.a;
        Integer numValueOf = Integer.valueOf(i);
        boolean z = this.a;
        xmn xmnVar = this.b;
        xmnVar.p.z(9, numValueOf, z);
        xmnVar.l = i;
        if (i == 2310) {
            yco ycoVar = ((ycp) xmnVar.e.io()).e;
            if (ycoVar == null) {
                ((agrc) ((agrc) ycp.a.c().i(agso.a, "MDX.MdxSessionManagerImpl")).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionManagerImpl", "onMediaTransferStart", 492, "MdxSessionManagerImpl.java")).t("no MDx session active, ignoring media transfer.");
            } else {
                ycoVar.R();
            }
            if (kbuVar != null) {
                try {
                    String str = xmnVar.c;
                    kro.f("Must be called from the main thread.");
                    jzz jzzVar = kbuVar.c;
                    if (jzzVar != null) {
                        jzzVar.h(str);
                    }
                } catch (IOException e) {
                    ((agrc) ((agrc) ((agrc) xmn.a.c().i(agso.a, "MDX.CastSdkClient")).j(e)).k("com/google/android/libraries/youtube/mdx/castclient/DefaultCastSdkClient$CastSessionListener", "onSessionSuspended", (char) 457, "DefaultCastSdkClient.java")).t("Failed to remove message received callbacks.");
                }
            }
            this.b.f();
        }
    }

    public final void j(int i) {
        agrf agrfVar = xmn.a;
        agrx agrxVar = agso.a;
        Integer numValueOf = Integer.valueOf(i);
        boolean z = this.a;
        xmn xmnVar = this.b;
        xmnVar.p.z(5, numValueOf, z);
        yaa yaaVar = xmnVar.o;
        if (yaaVar == null) {
            ((agrc) ((agrc) xmn.a.b().i(agrxVar, "MDX.CastSdkClient")).k("com/google/android/libraries/youtube/mdx/castclient/DefaultCastSdkClient$CastSessionListener", "onSessionStartFailed", 316, "DefaultCastSdkClient.java")).t("onSessionStartFailed, castSdkClientConsumer is null");
        } else {
            yaaVar.b(i);
        }
        xmnVar.f();
    }
}
