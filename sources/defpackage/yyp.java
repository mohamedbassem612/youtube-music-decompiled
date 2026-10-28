package defpackage;

import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import com.google.android.libraries.elements.interfaces.CapabilitiesStore;
import com.google.android.libraries.elements.interfaces.ClientTemplateProvider;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.elements.interfaces.JSModuleBytesProvider;
import com.google.android.libraries.elements.interfaces.ResponseHydration;
import com.google.android.libraries.elements.interfaces.ThemeStore;
import com.google.android.libraries.elements.interfaces.WasmTemplateProvider;
import com.google.cardboard.sdk.R;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yyp implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ yyp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v18, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v67, types: [java.lang.Object, zwy] */
    @Override // defpackage.agfr
    public final Object io() {
        Spatializer spatializer;
        WasmTemplateProvider wasmTemplateProvider = null;
        switch (this.$cid) {
            case 0:
                return ((yye) this.a).a();
            case 1:
                return Long.valueOf(((yyv) this.a).e());
            case 2:
                return ((yyv) this.a).m;
            case 3:
                return ((yyv) this.a).t;
            case 4:
                int iAS = a.aS(((apbm) this.a).h);
                if (iAS == 0) {
                    iAS = 1;
                }
                return Integer.valueOf(iAS != 3 ? 1 : 2);
            case 5:
                akxc akxcVar = ((zhl) this.a).aa().i;
                return akxcVar == null ? akxc.a : akxcVar;
            case 6:
                akxc akxcVar2 = zjh.a;
                akxc akxcVar3 = (akxc) this.a.io();
                return !a.L(akxcVar3) ? zjh.a : akxcVar3;
            case 7:
                if (Build.VERSION.SDK_INT < 32) {
                    return Optional.empty();
                }
                AudioManager audioManager = (AudioManager) ((zjr) this.a).q.getSystemService("audio");
                return (audioManager == null || (spatializer = audioManager.getSpatializer()) == null) ? Optional.empty() : Optional.of(spatializer);
            case 8:
                zjr zjrVar = (zjr) this.a;
                return Boolean.valueOf(zjrVar.fA(zjrVar.F, zjrVar.G, zjrVar.H));
            case 9:
                zjr zjrVar2 = (zjr) this.a;
                return Boolean.valueOf(zjrVar2.fo(zjrVar2.F, zjrVar2.G, zjrVar2.H));
            case 10:
                Optional optionalEU = ((zjr) this.a).eU();
                if (true == optionalEU.isPresent()) {
                    optionalEU = Optional.ofNullable(Boolean.valueOf(zjr.fK(bby$$ExternalSyntheticApiModelOutline7.m(optionalEU.get()))));
                }
                Boolean bool = (Boolean) optionalEU.orElse(Boolean.FALSE);
                bool.booleanValue();
                return bool;
            case 11:
                Optional optionalEU2 = ((zjr) this.a).eU();
                if (true == optionalEU2.isPresent()) {
                    optionalEU2 = Optional.ofNullable(Boolean.valueOf(zjr.fI(bby$$ExternalSyntheticApiModelOutline7.m(optionalEU2.get()))));
                }
                Boolean bool2 = (Boolean) optionalEU2.orElse(Boolean.FALSE);
                bool2.booleanValue();
                return bool2;
            case 12:
                taq.d();
                return ((ytv) this.a).c.n();
            case 13:
                Object obj = ((abwk) this.a).d;
                return obj instanceof acfv ? Optional.of((acfv) obj) : Optional.empty();
            case 14:
                return ((maw) ((acxj) this.a).a.io()).a();
            case 15:
                return new aehn((vyo) this.a);
            case 16:
                return this.a.h();
            case 17:
                aczb aczbVar = (aczb) this.a;
                if (aczbVar.j.l(30, 45400787L, false)) {
                    String str = (String) aczbVar.c.io();
                    xit xitVar = aczbVar.b;
                    xitVar.k(str);
                    aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
                    amiuVar.f = 70;
                    amiuVar.b |= 4;
                    aihfVarCreateBuilder.copyOnWrite();
                    amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
                    str.getClass();
                    amiuVar2.b |= 8;
                    amiuVar2.g = str;
                    xitVar.i((amiu) aihfVarCreateBuilder.build());
                }
                aczbVar.h = (aczbVar.k.l(R.styleable.AppCompatTheme_windowNoTitle, 45421774L, false) || ((vxz) aczbVar.f.io()).l(11, 45782274L, false)) ? false : true;
                boolean zL = ((vxz) aczbVar.f.io()).l(12, 45782287L, false);
                aczbVar.i = zL;
                if (!zL || !aczbVar.h) {
                    return null;
                }
                nuc nucVar = aczbVar.a;
                aihf aihfVarCreateBuilder2 = asnc.a.createBuilder();
                aslh aslhVar = aslh.LOG_TYPE_CONFIGURATION_ERROR;
                aihfVarCreateBuilder2.copyOnWrite();
                asnc asncVar = (asnc) aihfVarCreateBuilder2.instance;
                asncVar.d = aslhVar.I;
                asncVar.b |= 2;
                nucVar.b((asnc) aihfVarCreateBuilder2.build(), "Both enableReplaceHandleOmitWithEnsureLoaded and enableHandleOmittedResources are true, which is undefined behavior. Disabling handleOmittedResources.", new Object[0]);
                aczbVar.h = false;
                return null;
            case 18:
                return ((aczb) this.a).e();
            case 19:
                Object obj2 = this.a;
                adak adakVar = (adak) obj2;
                if (!adakVar.p.l(14, 45785871L, false)) {
                    return new aher(adakVar.a());
                }
                adakVar.e();
                acnd acndVar = new acnd(obj2, 19);
                long j = afwl.a;
                ahcz ahczVar = new ahcz(afty.c(false), acndVar, 1);
                Executor executor = (Executor) adakVar.l.io();
                ahfo ahfoVar = new ahfo(ahczVar);
                executor.execute(ahfoVar);
                return ahfoVar;
            default:
                adak adakVar2 = (adak) this.a;
                JSModuleBytesProvider bytesProvider = ((JSEnvironment) adakVar2.b.io()).getBytesProvider();
                if (bytesProvider == null) {
                    throw new nud("bytesProvider is null");
                }
                adbg adbgVar = new adbg(adakVar2.a, adakVar2.c.h);
                if ((adakVar2.m || adakVar2.n) && (wasmTemplateProvider = (WasmTemplateProvider) ((agfa) adakVar2.j).a.io()) == null) {
                    throw new nud("WasmTemplateProvider is null");
                }
                ResponseHydration responseHydrationCreateWithResourceLoader = ResponseHydration.createWithResourceLoader(adakVar2.a(), (ClientTemplateProvider) adakVar2.g.io(), bytesProvider, (ThemeStore) adakVar2.h.io(), (CapabilitiesStore) adakVar2.i.io(), adbgVar, wasmTemplateProvider);
                responseHydrationCreateWithResourceLoader.getClass();
                return responseHydrationCreateWithResourceLoader;
        }
    }
}
