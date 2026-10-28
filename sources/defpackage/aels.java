package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aels implements vxc {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/share/endpoint/SharingProviderDataCommandResolver");
    private final vxe b;
    private final Executor c;
    private final dd d;
    private final xgm e;
    private final awmd f;
    private bp g;
    private final lqa h;
    private final aend i;

    public aels(vxe vxeVar, Executor executor, aend aendVar, dd ddVar, xgm xgmVar, awmd awmdVar, lqa lqaVar) {
        vxeVar.getClass();
        this.b = vxeVar;
        executor.getClass();
        this.c = executor;
        aendVar.getClass();
        this.i = aendVar;
        ddVar.getClass();
        this.d = ddVar;
        xgmVar.getClass();
        this.e = xgmVar;
        awmdVar.getClass();
        this.f = awmdVar;
        lqaVar.getClass();
        this.h = lqaVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, zwb] */
    @Override // defpackage.vxc
    public final void c(final ajwo ajwoVar, final Map map) {
        final aels aelsVar;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aptm.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        final aptm aptmVar = (aptm) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        final boolean z = aptmVar.e;
        aelj aeljVar = (aelj) tym.U(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", aelj.class);
        if (aeljVar != null) {
            aeljVar.f();
        }
        if (z) {
            aelz aelzVar = new aelz();
            this.g = aelzVar;
            aelzVar.gT(this.d, "fullscreen_spinner_fragment");
        }
        aptc aptcVarA = (aptmVar.c & 16) != 0 ? this.h.A(aptmVar.h) : null;
        final String str = aptmVar.d;
        aend aendVar = this.i;
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        wpe wpeVar = new wpe(aendVar.b, aendVar.c.e());
        wpeVar.a = str;
        if (aptcVarA != null) {
            wpeVar.b = aptcVarA;
        }
        ListenableFuture listenableFutureB = aendVar.f(alqp.a, (wlp) aendVar.d, new wpa(1), new hep(15)).b(wpeVar, executorDirectExecutor, null);
        bp bpVar = this.g;
        if (bpVar != null) {
            aelsVar = this;
            taf.l(bpVar, listenableFutureB, new aelo(this, aptmVar, z, 0), new aelp(aelsVar, z, str, ajwoVar, map, 0));
        } else {
            aelsVar = this;
            taf.i(listenableFutureB, aelsVar.c, new tab() { // from class: aelq
                @Override // defpackage.twi
                /* JADX INFO: renamed from: b */
                public final void a(Throwable th) {
                    ajwo ajwoVar2;
                    aptm aptmVar2 = aptmVar;
                    if ((aptmVar2.c & 8) != 0) {
                        ajwoVar2 = aptmVar2.g;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                    } else {
                        ajwoVar2 = null;
                    }
                    this.a.d(ajwoVar2, z, th);
                }
            }, new tae() { // from class: aelr
                @Override // defpackage.tae, defpackage.twi
                public final void a(Object obj) {
                    this.a.e((alqp) obj, z, str, ajwoVar.c, map);
                }
            }, null);
        }
        if ((aptmVar.c & 4) != 0) {
            vxe vxeVar = aelsVar.b;
            ajwo ajwoVar2 = aptmVar.f;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            vxeVar.a(ajwoVar2);
        }
    }

    public final void d(ajwo ajwoVar, boolean z, Throwable th) {
        ((agrc) ((agrc) ((agrc) a.b()).j(th)).k("com/google/android/libraries/youtube/share/endpoint/SharingProviderDataCommandResolver", "handleError", (char) 149, "SharingProviderDataCommandResolver.java")).t("Could not get story sharing metadata.");
        bp bpVar = this.g;
        if (bpVar != null && z) {
            bpVar.iQ(false, false, false);
        }
        if (ajwoVar != null) {
            this.b.a(ajwoVar);
        }
    }

    public final void e(alqp alqpVar, boolean z, String str, aigj aigjVar, Map map) {
        xgn xgnVarHB;
        if (alqpVar != null) {
            if (map == null || (xgnVarHB = (xgn) map.get("interaction_logger_override")) == null) {
                xgnVarHB = this.e.hB();
            }
            ameb amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
            xgj xgjVar = new xgj(aigjVar, (amud) null);
            aihf aihfVarCreateBuilder = amdd.a.createBuilder();
            aihf aihfVarCreateBuilder2 = amdp.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            amdp amdpVar = (amdp) aihfVarCreateBuilder2.instance;
            str.getClass();
            amdpVar.b |= 2;
            amdpVar.d = str;
            aihfVarCreateBuilder.copyOnWrite();
            amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
            amdp amdpVar2 = (amdp) aihfVarCreateBuilder2.build();
            amdpVar2.getClass();
            amddVar.w = amdpVar2;
            amddVar.d |= 1;
            xgnVarHB.o(amebVar, xgjVar, (amdd) aihfVarCreateBuilder.build());
            if ((alqpVar.b & 2) != 0) {
                vxe vxeVar = this.b;
                ajwo ajwoVar = alqpVar.d;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.c(ajwoVar, map);
            }
            bp bpVar = this.g;
            if (bpVar == null || !z) {
                return;
            }
            bpVar.iQ(false, false, false);
        }
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
