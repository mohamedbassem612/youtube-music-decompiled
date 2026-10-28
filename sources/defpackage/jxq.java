package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.CommandHandler;
import com.google.android.libraries.elements.interfaces.CommandHandlerResolver;
import com.google.android.libraries.elements.interfaces.ErrorPolicy;
import com.google.android.libraries.elements.interfaces.ExecutorRegistry;
import com.google.android.libraries.elements.interfaces.ProcessState;
import com.google.android.libraries.elements.interfaces.ResourceEntry;
import com.google.protobuf.ExtensionRegistryLite;
import io.grpc.Status;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jxq implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jxq(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v86, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v102, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r13v32, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r13v49, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v65, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v71, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [agfr, java.lang.Object] */
    @Override // defpackage.agfr
    public final Object io() {
        Object kslVar;
        Object objY;
        int i = 2;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                kslVar = new ksl((Context) this.a, (krx) this.b);
                return kslVar;
            case 1:
                return ((jwm) this.a).c(((jwn) this.b).e);
            case 2:
                ?? r0 = this.b;
                Object obj = this.a;
                Object objIo = r0.io();
                synchronized (obj) {
                    ((max) obj).b = (mav) objIo;
                    List list = ((max) obj).a;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        a$$ExternalSyntheticApiModelOutline0.m7m(it.next()).r(((max) obj).b);
                    }
                    list.clear();
                    break;
                }
                return objIo;
            case 3:
                meg.a();
                CommandHandlerResolver commandHandlerResolverCreate = CommandHandlerResolver.create((CommandHandler) this.a, (ExecutorRegistry) this.b.io());
                if (commandHandlerResolverCreate == null) {
                    throw new nud("Error creating djinni CommandHandlerResolver.");
                }
                return commandHandlerResolverCreate;
            case 4:
                return ((kjc) this.a).D(((qiq) this.b.io()).a);
            case 5:
                return ((agyg) ((ayq) this.a).c).j(((aigj) this.b).G());
            case 6:
                kic kicVar = (kic) this.a;
                String str = kicVar.h;
                String str2 = kicVar.g;
                return axfd.U(str2, (AtomicReference) ((axfd) ((omj) this.b).a).e.get(new agew(str, str2)));
            case 7:
                return axfd.U("", (AtomicReference) ((axfd) ((omj) this.b).a).b.get(((kic) this.a).h));
            case 8:
                return String.valueOf(qke.b((Context) this.a)) + File.separator + "phenotype_storage_info" + File.separator + "shared" + File.separator + ((String) this.b);
            case 9:
                return avlh.f(((avlh) ((tfm) this.b).c).P().H(new tfk(z ? 1 : 0)).p(), ((tfi) this.a).d.E(), new idi(i)).P().p();
            case 10:
                Object obj2 = this.a;
                try {
                    if ((((ohp) obj2).b & SemanticState.Hidden) == 0) {
                        return asje.a;
                    }
                    aifv aifvVar = ((ohp) obj2).m;
                    if (aifvVar == null) {
                        aifvVar = aifv.a;
                    }
                    kslVar = (asje) aihn.parseFrom(asje.a, aifvVar.c, ExtensionRegistryLite.getGeneratedRegistry());
                    return kslVar;
                } catch (aiik unused) {
                    ((zs) this.b.io()).B(7, ((ohp) obj2).c);
                    ((agrc) ((agrc) wab.c.b()).k("com/google/android/libraries/youtube/innertube/datapush/FileGroupReaderBase", "<init>", 63, "FileGroupReaderBase.java")).t("Failed to initialize FileGroup manifest.");
                    return asje.a;
                }
            case 11:
                Object obj3 = this.a;
                if (obj3 == null) {
                    return asbr.a;
                }
                wag wagVar = (wag) this.b;
                awmd awmdVar = wagVar.d;
                ((wah) awmdVar.io()).startLatencyActionSpan("DataPushResourceLoad");
                ConcurrentHashMap concurrentHashMap = wagVar.h;
                waf wafVar = (waf) obj3;
                String str3 = wafVar.b;
                ResourceEntry resourceEntry = (ResourceEntry) concurrentHashMap.get(str3);
                if (resourceEntry != null) {
                    aguu.aj(wagVar.f != null, "ResourceLoader should be not null", new Object[0]);
                    Status statusHandleResources = wagVar.f.handleResources(aguu.s(resourceEntry));
                    if (!statusHandleResources.e()) {
                        ((agrc) ((agrc) ((agrc) wag.a.c()).j(statusHandleResources.asException())).k("com/google/android/libraries/youtube/innertube/datapush/blocks/DataPushBlocksContainerFactory", "getContainerManifest", (char) 213, "DataPushBlocksContainerFactory.java")).w("HandleResource failed for resourceId: %s", str3);
                    }
                }
                aguu.aj(wagVar.g != null, "ResourcePreloader should be not null", new Object[0]);
                Status statusEnsureLoaded = wagVar.g.ensureLoaded(new HashSet(Arrays.asList(str3)), ProcessState.FULLY_PROCESSED, ErrorPolicy.CONTINUE_ON_ERROR, null);
                if (((wah) awmdVar.io()).endLatencyActionSpan("DataPushResourceLoad")) {
                    ((wah) awmdVar.io()).logLatencyActionSpan("DataPushResourceLoad");
                }
                if (statusEnsureLoaded.e()) {
                    return wafVar.a;
                }
                throw new avcg(statusEnsureLoaded);
            case 12:
                if (!((vxz) this.a).l(18, 45390562L, false)) {
                    return agdf.a;
                }
                ahfg ahfgVar = new ahfg(this.b);
                avmb avmbVar = awlg.a;
                return agev.i(new awir(ahfgVar));
            case 13:
                web webVar = (web) this.a;
                kslVar = new wdl((omj) webVar.f.io(), (Set) this.b.io(), (wjr) webVar.c);
                return kslVar;
            case 14:
                objY = ((wkf) this.a).Y();
                if (Objects.equals(objY, "NO_CACHE_KEY_VALUE")) {
                    return ((wmf) this.b).d();
                }
                return objY;
            case 15:
                return ((wnn) this.a).f(almd.a, (wlp) this.b.io(), new heo(14), new hep(9));
            case 16:
                int iAS = a.aS(((apbm) this.b).e);
                int i2 = iAS != 0 ? iAS : 1;
                Object obj4 = this.a;
                if (i2 == 2) {
                    zfo zfoVar = (zfo) obj4;
                    String strAD = zfoVar.n.aD(zfoVar.g.e());
                    return strAD != null ? strAD : "fake_session_content_binding";
                }
                if (i2 != 3) {
                    return "fake_session_content_binding";
                }
                zfo zfoVar2 = (zfo) obj4;
                zwb zwbVar = zfoVar2.g;
                String strAD2 = (!zwbVar.u() || zwbVar.e() == null) ? zfoVar2.n.aD(zwbVar.e()) : zwbVar.e().i();
                return strAD2 == null ? "fake_session_content_binding" : strAD2;
            case 17:
                if (((abmt) this.b.io()).g.l(366, 45767247L, false)) {
                    return ((abww) this.a).m.H(new abld(5)).P().p();
                }
                int i3 = avlh.a;
                avtz avtzVar = new avtz();
                avnn avnnVar = atqp.j;
                return avtzVar;
            case 18:
                agjz agjzVar = new agjz(4);
                agjzVar.j(((vxz) this.b.io()).h(0, 45401288L).b);
                agjzVar.j(this.a);
                return agjzVar.g();
            case 19:
                adsr adsrVar = (adsr) ((WeakReference) this.b).get();
                if (adsrVar != null) {
                    synchronized (adsrVar) {
                        if (!adsrVar.P) {
                            return adsrVar.B();
                        }
                    }
                }
                objY = new mav((Container) this.a);
                return objY;
            default:
                hhb hhbVar = (hhb) this.b.io();
                Object obj5 = this.a;
                obj5.getClass();
                return hhbVar.f(aguu.al(new adge(obj5, 11)));
        }
    }

    public /* synthetic */ jxq(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
