package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.elements.interfaces.BlocksContainerLoaderProxy;
import com.google.android.libraries.elements.interfaces.CapabilitiesLoaderProxy;
import com.google.android.libraries.elements.interfaces.CapabilitiesStore;
import com.google.android.libraries.elements.interfaces.ClientTemplateProvider;
import com.google.android.libraries.elements.interfaces.ControllerModuleLoader;
import com.google.android.libraries.elements.interfaces.JSController;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.elements.interfaces.PublicKeyVerifierProvider;
import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.google.android.libraries.elements.interfaces.ResourceLoaderConfig;
import com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate;
import com.google.android.libraries.elements.interfaces.ResourcePreloader;
import com.google.android.libraries.elements.interfaces.ResponseHydration;
import com.google.android.libraries.elements.interfaces.ThemeLoaderProxy;
import com.google.android.libraries.elements.interfaces.ThemeStore;
import com.google.android.libraries.elements.interfaces.WasmTemplateProvider;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import com.youtube.android.libraries.elements.StatusOr;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adak {
    private final tqj A;
    private final vxz B;
    public final nuc a;
    public final aunn b;
    public final apjm c;
    public final boolean d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final aunn i;
    public final agev j;
    public final Executor k;
    public final aunn l;
    public final boolean m;
    public final boolean n;
    public final vxz o;
    public final vxz p;
    private volatile ResourceLoader q;
    private final agfr r;
    private final agfr s;
    private final boolean t;
    private final ahbw u;
    private final Context v;
    private final aunn w;
    private final aunn x;
    private final aunn y;
    private final aunn z;

    public adak(nuc nucVar, vyo vyoVar, vxu vxuVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3, tqj tqjVar, aunn aunnVar, Context context, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, agev agevVar, ahbw ahbwVar, aunn aunnVar8, aunn aunnVar9, agev agevVar2, agev agevVar3, agev agevVar4, Executor executor, aunn aunnVar10) {
        boolean z = false;
        this.a = nucVar;
        this.b = aunnVar;
        apjn apjnVar = vxuVar.c().k;
        apjm apjmVar = (apjnVar == null ? apjn.a : apjnVar).i;
        apjmVar = apjmVar == null ? apjm.a : apjmVar;
        this.c = apjmVar;
        this.o = vxzVar;
        this.B = vxzVar2;
        this.v = context;
        this.p = vxzVar3;
        this.A = tqjVar;
        int i = 1;
        if (apjmVar.d) {
            apjp apjpVar = vyoVar.b().l;
            if (!(apjpVar == null ? apjp.a : apjpVar).c) {
                z = true;
            }
        }
        this.d = z;
        this.w = aunnVar2;
        this.f = aunnVar3;
        this.g = aunnVar4;
        this.x = aunnVar5;
        this.h = aunnVar6;
        this.i = aunnVar7;
        Boolean bool = Boolean.FALSE;
        this.t = ((Boolean) agevVar.e(bool)).booleanValue();
        this.u = ahbwVar;
        this.y = aunnVar8;
        this.z = aunnVar9;
        this.m = ((Boolean) agevVar2.e(bool)).booleanValue();
        this.n = ((Boolean) agevVar3.e(bool)).booleanValue();
        this.j = agevVar4;
        this.k = executor;
        this.l = aunnVar10;
        this.r = aguu.al(new yyp(this, 19));
        this.s = aguu.al(new yyp(this, 20));
        aguu.al(new adav(this, i));
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0338 A[Catch: all -> 0x04ba, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x0019, B:11:0x001f, B:13:0x002d, B:15:0x0038, B:21:0x0049, B:23:0x0054, B:29:0x0065, B:31:0x0069, B:37:0x007e, B:39:0x0086, B:41:0x008b, B:43:0x0091, B:45:0x0095, B:47:0x009b, B:49:0x00a1, B:51:0x00a5, B:53:0x00af, B:55:0x00b5, B:57:0x00b9, B:59:0x00bd, B:61:0x00c9, B:63:0x00d0, B:65:0x00d4, B:67:0x00d8, B:69:0x00e3, B:71:0x0198, B:73:0x0294, B:80:0x0330, B:82:0x0338, B:84:0x03ca, B:85:0x03d2, B:87:0x03ff, B:88:0x0417, B:91:0x047b, B:93:0x0481, B:95:0x0486, B:97:0x048b, B:98:0x0490, B:74:0x02a1, B:76:0x02cb, B:77:0x02e3, B:68:0x00de, B:34:0x006f, B:99:0x0496, B:100:0x049d, B:26:0x005c, B:27:0x0063, B:18:0x0040, B:19:0x0047, B:101:0x049e, B:102:0x04a5, B:103:0x04a6, B:104:0x04ad, B:105:0x04ae, B:106:0x04b5, B:107:0x04b6), top: B:114:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x03ca A[Catch: all -> 0x04ba, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x0019, B:11:0x001f, B:13:0x002d, B:15:0x0038, B:21:0x0049, B:23:0x0054, B:29:0x0065, B:31:0x0069, B:37:0x007e, B:39:0x0086, B:41:0x008b, B:43:0x0091, B:45:0x0095, B:47:0x009b, B:49:0x00a1, B:51:0x00a5, B:53:0x00af, B:55:0x00b5, B:57:0x00b9, B:59:0x00bd, B:61:0x00c9, B:63:0x00d0, B:65:0x00d4, B:67:0x00d8, B:69:0x00e3, B:71:0x0198, B:73:0x0294, B:80:0x0330, B:82:0x0338, B:84:0x03ca, B:85:0x03d2, B:87:0x03ff, B:88:0x0417, B:91:0x047b, B:93:0x0481, B:95:0x0486, B:97:0x048b, B:98:0x0490, B:74:0x02a1, B:76:0x02cb, B:77:0x02e3, B:68:0x00de, B:34:0x006f, B:99:0x0496, B:100:0x049d, B:26:0x005c, B:27:0x0063, B:18:0x0040, B:19:0x0047, B:101:0x049e, B:102:0x04a5, B:103:0x04a6, B:104:0x04ad, B:105:0x04ae, B:106:0x04b5, B:107:0x04b6), top: B:114:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x03d2 A[Catch: all -> 0x04ba, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x0019, B:11:0x001f, B:13:0x002d, B:15:0x0038, B:21:0x0049, B:23:0x0054, B:29:0x0065, B:31:0x0069, B:37:0x007e, B:39:0x0086, B:41:0x008b, B:43:0x0091, B:45:0x0095, B:47:0x009b, B:49:0x00a1, B:51:0x00a5, B:53:0x00af, B:55:0x00b5, B:57:0x00b9, B:59:0x00bd, B:61:0x00c9, B:63:0x00d0, B:65:0x00d4, B:67:0x00d8, B:69:0x00e3, B:71:0x0198, B:73:0x0294, B:80:0x0330, B:82:0x0338, B:84:0x03ca, B:85:0x03d2, B:87:0x03ff, B:88:0x0417, B:91:0x047b, B:93:0x0481, B:95:0x0486, B:97:0x048b, B:98:0x0490, B:74:0x02a1, B:76:0x02cb, B:77:0x02e3, B:68:0x00de, B:34:0x006f, B:99:0x0496, B:100:0x049d, B:26:0x005c, B:27:0x0063, B:18:0x0040, B:19:0x0047, B:101:0x049e, B:102:0x04a5, B:103:0x04a6, B:104:0x04ad, B:105:0x04ae, B:106:0x04b5, B:107:0x04b6), top: B:114:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x03ff A[Catch: all -> 0x04ba, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x0019, B:11:0x001f, B:13:0x002d, B:15:0x0038, B:21:0x0049, B:23:0x0054, B:29:0x0065, B:31:0x0069, B:37:0x007e, B:39:0x0086, B:41:0x008b, B:43:0x0091, B:45:0x0095, B:47:0x009b, B:49:0x00a1, B:51:0x00a5, B:53:0x00af, B:55:0x00b5, B:57:0x00b9, B:59:0x00bd, B:61:0x00c9, B:63:0x00d0, B:65:0x00d4, B:67:0x00d8, B:69:0x00e3, B:71:0x0198, B:73:0x0294, B:80:0x0330, B:82:0x0338, B:84:0x03ca, B:85:0x03d2, B:87:0x03ff, B:88:0x0417, B:91:0x047b, B:93:0x0481, B:95:0x0486, B:97:0x048b, B:98:0x0490, B:74:0x02a1, B:76:0x02cb, B:77:0x02e3, B:68:0x00de, B:34:0x006f, B:99:0x0496, B:100:0x049d, B:26:0x005c, B:27:0x0063, B:18:0x0040, B:19:0x0047, B:101:0x049e, B:102:0x04a5, B:103:0x04a6, B:104:0x04ad, B:105:0x04ae, B:106:0x04b5, B:107:0x04b6), top: B:114:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0486 A[Catch: all -> 0x04ba, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x0019, B:11:0x001f, B:13:0x002d, B:15:0x0038, B:21:0x0049, B:23:0x0054, B:29:0x0065, B:31:0x0069, B:37:0x007e, B:39:0x0086, B:41:0x008b, B:43:0x0091, B:45:0x0095, B:47:0x009b, B:49:0x00a1, B:51:0x00a5, B:53:0x00af, B:55:0x00b5, B:57:0x00b9, B:59:0x00bd, B:61:0x00c9, B:63:0x00d0, B:65:0x00d4, B:67:0x00d8, B:69:0x00e3, B:71:0x0198, B:73:0x0294, B:80:0x0330, B:82:0x0338, B:84:0x03ca, B:85:0x03d2, B:87:0x03ff, B:88:0x0417, B:91:0x047b, B:93:0x0481, B:95:0x0486, B:97:0x048b, B:98:0x0490, B:74:0x02a1, B:76:0x02cb, B:77:0x02e3, B:68:0x00de, B:34:0x006f, B:99:0x0496, B:100:0x049d, B:26:0x005c, B:27:0x0063, B:18:0x0040, B:19:0x0047, B:101:0x049e, B:102:0x04a5, B:103:0x04a6, B:104:0x04ad, B:105:0x04ae, B:106:0x04b5, B:107:0x04b6), top: B:114:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x048b A[Catch: all -> 0x04ba, TryCatch #0 {, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x0019, B:11:0x001f, B:13:0x002d, B:15:0x0038, B:21:0x0049, B:23:0x0054, B:29:0x0065, B:31:0x0069, B:37:0x007e, B:39:0x0086, B:41:0x008b, B:43:0x0091, B:45:0x0095, B:47:0x009b, B:49:0x00a1, B:51:0x00a5, B:53:0x00af, B:55:0x00b5, B:57:0x00b9, B:59:0x00bd, B:61:0x00c9, B:63:0x00d0, B:65:0x00d4, B:67:0x00d8, B:69:0x00e3, B:71:0x0198, B:73:0x0294, B:80:0x0330, B:82:0x0338, B:84:0x03ca, B:85:0x03d2, B:87:0x03ff, B:88:0x0417, B:91:0x047b, B:93:0x0481, B:95:0x0486, B:97:0x048b, B:98:0x0490, B:74:0x02a1, B:76:0x02cb, B:77:0x02e3, B:68:0x00de, B:34:0x006f, B:99:0x0496, B:100:0x049d, B:26:0x005c, B:27:0x0063, B:18:0x0040, B:19:0x0047, B:101:0x049e, B:102:0x04a5, B:103:0x04a6, B:104:0x04ad, B:105:0x04ae, B:106:0x04b5, B:107:0x04b6), top: B:114:0x0007 }] */
    /* JADX WARN: Type inference failed for: r5v2, types: [aunn, java.lang.Object] */
    public final ResourceLoader a() {
        ThemeLoaderProxy themeLoaderProxy;
        CapabilitiesLoaderProxy capabilitiesLoaderProxy;
        WasmTemplateProvider wasmTemplateProvider;
        boolean z;
        CapabilitiesLoaderProxy capabilitiesLoaderProxy2;
        WasmTemplateProvider wasmTemplateProvider2;
        ControllerModuleLoader controllerModuleLoader;
        ThemeLoaderProxy themeLoaderProxy2;
        PublicKeyVerifierProvider publicKeyVerifierProvider;
        boolean z2;
        ResourceLoader resourceLoaderCreateWithDefaultConfigWithBlocks;
        ResourcePreloader preloader;
        aunn aunnVar;
        aunn aunnVar2;
        aunn aunnVar3;
        WasmTemplateProvider wasmTemplateProvider3;
        StatusOr statusOrCreateWithBlocks;
        aihf aihfVarCreateBuilder;
        ResourceLoader resourceLoader = this.q;
        if (resourceLoader == null) {
            synchronized (this) {
                resourceLoader = this.q;
                if (resourceLoader == null) {
                    JSEnvironment jSEnvironment = (JSEnvironment) this.b.io();
                    JSController controller = jSEnvironment.getController();
                    if (controller == null) {
                        throw new nud("JSController is null");
                    }
                    ControllerModuleLoader moduleLoader = jSEnvironment.getModuleLoader();
                    if (moduleLoader == null) {
                        throw new nud("JS Module Loader is null");
                    }
                    agev agevVar = (agev) this.x.io();
                    if (!agevVar.g()) {
                        throw new nud("Blocks Container Loader is null");
                    }
                    ThemeStore themeStore = (ThemeStore) this.h.io();
                    if (themeStore != null) {
                        ThemeLoaderProxy themeLoader = themeStore.getThemeLoader();
                        if (themeLoader == null) {
                            throw new nud("Theme Loader is null");
                        }
                        themeLoaderProxy = themeLoader;
                    } else {
                        themeLoaderProxy = null;
                    }
                    CapabilitiesStore capabilitiesStore = (CapabilitiesStore) this.i.io();
                    if (capabilitiesStore != null) {
                        CapabilitiesLoaderProxy capabilitiesLoader = capabilitiesStore.getCapabilitiesLoader();
                        if (capabilitiesLoader == null) {
                            throw new nud("Capabilities Loader is null");
                        }
                        capabilitiesLoaderProxy = capabilitiesLoader;
                    } else {
                        capabilitiesLoaderProxy = null;
                    }
                    boolean z3 = this.m;
                    if (z3 || this.n) {
                        WasmTemplateProvider wasmTemplateProvider4 = (WasmTemplateProvider) ((agfa) this.j).a.io();
                        if (wasmTemplateProvider4 == null) {
                            throw new nud("WasmTemplateProvider is null");
                        }
                        wasmTemplateProvider = wasmTemplateProvider4;
                    } else {
                        wasmTemplateProvider = null;
                    }
                    apjm apjmVar = this.c;
                    int i = apjmVar.b;
                    int i2 = (i & 1) != 0 ? apjmVar.c : R.styleable.AppCompatTheme_windowMinWidthMinor;
                    int i3 = (i & 8) != 0 ? apjmVar.e : 5;
                    long j = (i & 32) != 0 ? apjmVar.f : 3145728L;
                    long j2 = (i & SemanticState.Focused) != 0 ? apjmVar.g : 86400L;
                    boolean z4 = (i & SemanticState.Multiline) != 0 ? apjmVar.i : false;
                    long j3 = (i & 16384) != 0 ? apjmVar.j : 1048576L;
                    boolean z5 = (i & 32768) != 0 ? apjmVar.k : false;
                    PublicKeyVerifierProvider aczzVar = this.t ? new aczz() : new acyl();
                    vxz vxzVar = this.B;
                    long j4 = j3;
                    boolean z6 = z5;
                    ThemeLoaderProxy themeLoaderProxy3 = themeLoaderProxy;
                    boolean zL = vxzVar.l(410, 45769626L, false);
                    boolean zL2 = vxzVar.l(431, 45782817L, false);
                    boolean zL3 = vxzVar.l(344, 45726097L, false);
                    boolean zL4 = vxzVar.l(413, 45772158L, false);
                    CapabilitiesLoaderProxy capabilitiesLoaderProxy3 = capabilitiesLoaderProxy;
                    PublicKeyVerifierProvider publicKeyVerifierProvider2 = aczzVar;
                    boolean zL5 = this.p.l(15, 45799526L, false);
                    boolean zL6 = vxzVar.l(461, 45801183L, false);
                    boolean zL7 = vxzVar.l(464, 45805125L, false);
                    boolean zL8 = vxzVar.l(502, 45830689L, false);
                    boolean zL9 = vxzVar.l(482, 45820578L, false);
                    boolean zL10 = vxzVar.l(495, 45827685L, false);
                    boolean zL11 = vxzVar.l(476, 45816928L, false);
                    boolean zL12 = vxzVar.l(477, 45816929L, false);
                    boolean zL13 = vxzVar.l(475, 45816926L, false);
                    long jC = vxzVar.c(52, 45816927L, 0L);
                    boolean zL14 = vxzVar.l(529, 45852281L, false);
                    boolean zL15 = vxzVar.l(538, 45855710L, false);
                    e();
                    if (this.d) {
                        Context context = this.v;
                        String str = context.getFilesDir().getAbsolutePath() + File.separator + "ElementsResourceCacheBytes";
                        String str2 = context.getFilesDir().getAbsolutePath() + File.separator + "ElementsResourceCacheMetadata";
                        wasmTemplateProvider2 = wasmTemplateProvider;
                        nuc nucVar = this.a;
                        z = zL15;
                        adap adapVar = new adap(nucVar, this.y, new pwa(this, 3), this.z);
                        Integer numValueOf = Integer.valueOf(i2);
                        Integer numValueOf2 = Integer.valueOf(i3);
                        Long lValueOf = Long.valueOf(j);
                        Long lValueOf2 = Long.valueOf(j2);
                        Boolean boolValueOf = Boolean.valueOf(z4);
                        Long lValueOf3 = Long.valueOf(j4);
                        Boolean boolValueOf2 = Boolean.valueOf(z6);
                        Boolean boolValueOf3 = Boolean.valueOf(zL13);
                        Long lValueOf4 = Long.valueOf(jC);
                        Boolean boolValueOf4 = Boolean.valueOf(zL11);
                        Boolean boolValueOf5 = Boolean.valueOf(zL12);
                        Boolean bool = Boolean.TRUE;
                        ResourceLoaderConfig resourceLoaderConfig = new ResourceLoaderConfig(numValueOf, numValueOf2, str, str2, lValueOf, lValueOf2, boolValueOf, lValueOf3, boolValueOf2, boolValueOf3, lValueOf4, boolValueOf4, boolValueOf5, bool, bool, bool, Boolean.valueOf(zL3), Boolean.valueOf(zL), null, Boolean.valueOf(z3), Boolean.valueOf(zL2), Boolean.valueOf(zL4), Boolean.valueOf(zL5), Boolean.valueOf(zL6), Boolean.valueOf(zL7), Boolean.valueOf(zL8), null, null, null, Boolean.valueOf(zL9), Boolean.valueOf(zL10), null, Boolean.valueOf(zL14), Boolean.valueOf(z));
                        capabilitiesLoaderProxy2 = capabilitiesLoaderProxy3;
                        themeLoaderProxy2 = themeLoaderProxy3;
                        publicKeyVerifierProvider = publicKeyVerifierProvider2;
                        z2 = true;
                        StatusOr statusOrCreateWithCacheWithBlocks = ResourceLoader.createWithCacheWithBlocks((ClientTemplateProvider) this.g.io(), controllerModuleLoader, (BlocksContainerLoaderProxy) agevVar.c(), themeLoaderProxy2, capabilitiesLoaderProxy2, publicKeyVerifierProvider, (ResourceLoaderDelegate) this.w.io(), adapVar, resourceLoaderConfig, wasmTemplateProvider2);
                        if (statusOrCreateWithCacheWithBlocks.hasValue) {
                            controllerModuleLoader = moduleLoader;
                            ResourceLoader resourceLoader2 = (ResourceLoader) statusOrCreateWithCacheWithBlocks.value;
                            this.e.set(true);
                            resourceLoaderCreateWithDefaultConfigWithBlocks = resourceLoader2;
                        } else {
                            aihf aihfVarCreateBuilder2 = asnb.a.createBuilder();
                            int iValue = statusOrCreateWithCacheWithBlocks.status.getCode().value();
                            aihfVarCreateBuilder2.copyOnWrite();
                            asnb asnbVar = (asnb) aihfVarCreateBuilder2.instance;
                            asnbVar.b |= 1;
                            asnbVar.c = iValue;
                            if (!ahno.aa(statusOrCreateWithCacheWithBlocks.status.getDescription())) {
                                controllerModuleLoader = moduleLoader;
                                String description = statusOrCreateWithCacheWithBlocks.status.getDescription();
                                description.getClass();
                                aihfVarCreateBuilder2.copyOnWrite();
                                asnb asnbVar2 = (asnb) aihfVarCreateBuilder2.instance;
                                asnbVar2.b |= 2;
                                asnbVar2.d = description;
                            }
                            controllerModuleLoader = moduleLoader;
                            aihf aihfVarCreateBuilder3 = asnc.a.createBuilder();
                            aslh aslhVar = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
                            aihfVarCreateBuilder3.copyOnWrite();
                            asnc asncVar = (asnc) aihfVarCreateBuilder3.instance;
                            asncVar.d = aslhVar.I;
                            asncVar.b |= 2;
                            asnb asnbVar3 = (asnb) aihfVarCreateBuilder2.build();
                            aihfVarCreateBuilder3.copyOnWrite();
                            asnc asncVar2 = (asnc) aihfVarCreateBuilder3.instance;
                            asnbVar3.getClass();
                            asncVar2.j = asnbVar3;
                            asncVar2.b |= 64;
                            nucVar.b((asnc) aihfVarCreateBuilder3.build(), "ELMCache: SRS persistence is turned on but fails to initialize.", new Object[0]);
                        }
                        if (!this.e.get()) {
                            Integer numValueOf3 = Integer.valueOf(i2);
                            Integer numValueOf4 = Integer.valueOf(i3);
                            Boolean bool2 = Boolean.TRUE;
                            ResourceLoaderConfig resourceLoaderConfig2 = new ResourceLoaderConfig(numValueOf3, numValueOf4, null, null, null, null, null, null, null, null, null, null, null, bool2, bool2, bool2, Boolean.valueOf(zL3), Boolean.valueOf(zL), null, Boolean.valueOf(z3), Boolean.valueOf(zL2), Boolean.valueOf(zL4), Boolean.valueOf(zL5), Boolean.valueOf(zL6), Boolean.FALSE, Boolean.valueOf(zL8), null, null, null, Boolean.valueOf(zL9), null, null, Boolean.valueOf(zL14), Boolean.valueOf(z));
                            aunnVar = this.f;
                            aunnVar2 = this.g;
                            ClientTemplateProvider clientTemplateProvider = (ClientTemplateProvider) aunnVar2.io();
                            BlocksContainerLoaderProxy blocksContainerLoaderProxy = (BlocksContainerLoaderProxy) agevVar.c();
                            aunnVar3 = this.w;
                            wasmTemplateProvider3 = wasmTemplateProvider2;
                            statusOrCreateWithBlocks = ResourceLoader.createWithBlocks(clientTemplateProvider, controllerModuleLoader, blocksContainerLoaderProxy, themeLoaderProxy2, capabilitiesLoaderProxy2, publicKeyVerifierProvider, (ResourceLoaderDelegate) aunnVar3.io(), resourceLoaderConfig2, wasmTemplateProvider3);
                            if (statusOrCreateWithBlocks.hasValue) {
                                resourceLoaderCreateWithDefaultConfigWithBlocks = (ResourceLoader) statusOrCreateWithBlocks.value;
                            } else {
                                aihfVarCreateBuilder = asnb.a.createBuilder();
                                int iValue2 = statusOrCreateWithBlocks.status.getCode().value();
                                aihfVarCreateBuilder.copyOnWrite();
                                asnb asnbVar4 = (asnb) aihfVarCreateBuilder.instance;
                                asnbVar4.b |= 1;
                                asnbVar4.c = iValue2;
                                if (!ahno.aa(statusOrCreateWithBlocks.status.getDescription())) {
                                    String description2 = statusOrCreateWithBlocks.status.getDescription();
                                    description2.getClass();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    asnb asnbVar5 = (asnb) aihfVarCreateBuilder.instance;
                                    asnbVar5.b |= 2;
                                    asnbVar5.d = description2;
                                }
                                nuc nucVar2 = this.a;
                                aihf aihfVarCreateBuilder4 = asnc.a.createBuilder();
                                aslh aslhVar2 = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
                                aihfVarCreateBuilder4.copyOnWrite();
                                asnc asncVar3 = (asnc) aihfVarCreateBuilder4.instance;
                                asncVar3.d = aslhVar2.I;
                                asncVar3.b |= 2;
                                asnb asnbVar6 = (asnb) aihfVarCreateBuilder.build();
                                aihfVarCreateBuilder4.copyOnWrite();
                                asnc asncVar4 = (asnc) aihfVarCreateBuilder4.instance;
                                asnbVar6.getClass();
                                asncVar4.j = asnbVar6;
                                asncVar4.b |= 64;
                                nucVar2.b((asnc) aihfVarCreateBuilder4.build(), "Failed to setup resource loader. Will fall back to default configuration.", new Object[0]);
                                resourceLoaderCreateWithDefaultConfigWithBlocks = ResourceLoader.createWithDefaultConfigWithBlocks((ClientTemplateProvider) aunnVar2.io(), controllerModuleLoader, (BlocksContainerLoaderProxy) agevVar.c(), themeLoaderProxy2, capabilitiesLoaderProxy2, publicKeyVerifierProvider, (ResourceLoaderDelegate) aunnVar3.io(), wasmTemplateProvider3);
                            }
                        }
                        resourceLoader = resourceLoaderCreateWithDefaultConfigWithBlocks;
                        if (resourceLoader != null && (preloader = resourceLoader.getPreloader()) != null) {
                            controller.setPreloader(preloader);
                            if (themeStore != null) {
                                themeStore.setPreloader(preloader);
                            }
                            if (capabilitiesStore != 0) {
                                capabilitiesStore.setPreloader(preloader);
                            }
                        }
                        resourceLoader.getClass();
                        this.q = resourceLoader;
                    } else {
                        z = zL15;
                        capabilitiesLoaderProxy2 = capabilitiesLoaderProxy3;
                        wasmTemplateProvider2 = wasmTemplateProvider;
                        controllerModuleLoader = moduleLoader;
                        themeLoaderProxy2 = themeLoaderProxy3;
                        publicKeyVerifierProvider = publicKeyVerifierProvider2;
                        z2 = true;
                    }
                    resourceLoaderCreateWithDefaultConfigWithBlocks = null;
                    if (!this.e.get()) {
                        Integer numValueOf5 = Integer.valueOf(i2);
                        Integer numValueOf6 = Integer.valueOf(i3);
                        Boolean bool3 = Boolean.TRUE;
                        ResourceLoaderConfig resourceLoaderConfig3 = new ResourceLoaderConfig(numValueOf5, numValueOf6, null, null, null, null, null, null, null, null, null, null, null, bool3, bool3, bool3, Boolean.valueOf(zL3), Boolean.valueOf(zL), null, Boolean.valueOf(z3), Boolean.valueOf(zL2), Boolean.valueOf(zL4), Boolean.valueOf(zL5), Boolean.valueOf(zL6), Boolean.FALSE, Boolean.valueOf(zL8), null, null, null, Boolean.valueOf(zL9), null, null, Boolean.valueOf(zL14), Boolean.valueOf(z));
                        aunnVar = this.f;
                        aunnVar2 = this.g;
                        ClientTemplateProvider clientTemplateProvider2 = (ClientTemplateProvider) aunnVar2.io();
                        BlocksContainerLoaderProxy blocksContainerLoaderProxy2 = (BlocksContainerLoaderProxy) agevVar.c();
                        aunnVar3 = this.w;
                        wasmTemplateProvider3 = wasmTemplateProvider2;
                        statusOrCreateWithBlocks = ResourceLoader.createWithBlocks(clientTemplateProvider2, controllerModuleLoader, blocksContainerLoaderProxy2, themeLoaderProxy2, capabilitiesLoaderProxy2, publicKeyVerifierProvider, (ResourceLoaderDelegate) aunnVar3.io(), resourceLoaderConfig3, wasmTemplateProvider3);
                        if (statusOrCreateWithBlocks.hasValue) {
                            resourceLoaderCreateWithDefaultConfigWithBlocks = (ResourceLoader) statusOrCreateWithBlocks.value;
                        } else {
                            aihfVarCreateBuilder = asnb.a.createBuilder();
                            int iValue3 = statusOrCreateWithBlocks.status.getCode().value();
                            aihfVarCreateBuilder.copyOnWrite();
                            asnb asnbVar7 = (asnb) aihfVarCreateBuilder.instance;
                            asnbVar7.b |= 1;
                            asnbVar7.c = iValue3;
                            if (!ahno.aa(statusOrCreateWithBlocks.status.getDescription())) {
                                String description3 = statusOrCreateWithBlocks.status.getDescription();
                                description3.getClass();
                                aihfVarCreateBuilder.copyOnWrite();
                                asnb asnbVar8 = (asnb) aihfVarCreateBuilder.instance;
                                asnbVar8.b |= 2;
                                asnbVar8.d = description3;
                            }
                            nuc nucVar3 = this.a;
                            aihf aihfVarCreateBuilder5 = asnc.a.createBuilder();
                            aslh aslhVar3 = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
                            aihfVarCreateBuilder5.copyOnWrite();
                            asnc asncVar5 = (asnc) aihfVarCreateBuilder5.instance;
                            asncVar5.d = aslhVar3.I;
                            asncVar5.b |= 2;
                            asnb asnbVar9 = (asnb) aihfVarCreateBuilder.build();
                            aihfVarCreateBuilder5.copyOnWrite();
                            asnc asncVar6 = (asnc) aihfVarCreateBuilder5.instance;
                            asnbVar9.getClass();
                            asncVar6.j = asnbVar9;
                            asncVar6.b |= 64;
                            nucVar3.b((asnc) aihfVarCreateBuilder5.build(), "Failed to setup resource loader. Will fall back to default configuration.", new Object[0]);
                            resourceLoaderCreateWithDefaultConfigWithBlocks = ResourceLoader.createWithDefaultConfigWithBlocks((ClientTemplateProvider) aunnVar2.io(), controllerModuleLoader, (BlocksContainerLoaderProxy) agevVar.c(), themeLoaderProxy2, capabilitiesLoaderProxy2, publicKeyVerifierProvider, (ResourceLoaderDelegate) aunnVar3.io(), wasmTemplateProvider3);
                        }
                    }
                    resourceLoader = resourceLoaderCreateWithDefaultConfigWithBlocks;
                    if (resourceLoader != null) {
                        controller.setPreloader(preloader);
                        if (themeStore != null) {
                            themeStore.setPreloader(preloader);
                        }
                        if (capabilitiesStore != 0) {
                            capabilitiesStore.setPreloader(preloader);
                        }
                    }
                    resourceLoader.getClass();
                    this.q = resourceLoader;
                }
            }
        }
        return resourceLoader;
    }

    public final ResponseHydration b() {
        return (ResponseHydration) this.s.io();
    }

    public final ListenableFuture c() {
        return (ListenableFuture) this.r.io();
    }

    public final void d() {
        if (this.d) {
            synchronized (this) {
                if (this.q != null) {
                    ((ResourceLoaderDelegate) this.w.io()).onServingContextUpdated(a().getServingContext());
                    return;
                }
                Context context = this.v;
                String absolutePath = context.getFilesDir().getAbsolutePath();
                File file = new File(absolutePath, "ElementsResourceCacheMetadata");
                File file2 = new File(absolutePath, "ElementsResourceCacheBytes");
                if (file.exists() && file2.exists()) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(new File(context.getFilesDir().getAbsolutePath(), "ElementsResourceCacheMetadata"));
                        try {
                            asog asogVar = (asog) aihn.parseFrom(asog.a, fileInputStream, ExtensionRegistryLite.getGeneratedRegistry());
                            fileInputStream.close();
                            if (asogVar.c || asogVar.e) {
                                return;
                            }
                            if ((asogVar.b & 4) != 0) {
                                aijp aijpVar = asogVar.f;
                                if (aijpVar == null) {
                                    aijpVar = aijp.a;
                                }
                                if (ahng.ax(aijpVar).isBefore(this.u.a())) {
                                    return;
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            for (asof asofVar : asogVar.d) {
                                if ((asofVar.b & 4) != 0) {
                                    arrayList.add(Long.valueOf(asofVar.c));
                                }
                            }
                            synchronized (this) {
                                if (this.q == null) {
                                    aihf aihfVarCreateBuilder = asul.a.createBuilder();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    asul asulVar = (asul) aihfVarCreateBuilder.instance;
                                    aihy aihyVar = asulVar.b;
                                    if (!aihyVar.c()) {
                                        asulVar.b = aihn.mutableCopy(aihyVar);
                                    }
                                    aifs.addAll(arrayList, asulVar.b);
                                    ((ResourceLoaderDelegate) this.w.io()).onServingContextUpdated(((asul) aihfVarCreateBuilder.build()).toByteArray());
                                } else {
                                    ((ResourceLoaderDelegate) this.w.io()).onServingContextUpdated(a().getServingContext());
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (IOException e) {
                        this.a.f(aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR, nsl.a, e, "Failed to read persisted serving context", new Object[0]);
                    }
                }
            }
        }
    }

    public final void e() {
        int i = tqr.a;
        tqj tqjVar = this.A;
        if (tqjVar.k(1073808332)) {
            tqjVar.k(1073815694);
        } else {
            this.p.l(10, 45768674L, false);
        }
    }
}
