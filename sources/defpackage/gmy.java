package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gmy {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/browse/BrowseController");
    private static final long r;
    private static final agkz s;
    public final Set b = new HashSet();
    public final Context c;
    public final cf d;
    public final gqh e;
    public final Set f;
    public final tbt g;
    public final vxe h;
    public final mbc i;
    public final ttm j;
    public final ScheduledExecutorService k;
    public final Executor l;
    public final aunn m;
    public final aunn n;
    public final rql o;
    public final vxz p;
    public final jij q;
    private final zwb t;
    private final jks u;
    private final Set v;
    private final jnm w;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        r = 2592000000L;
        agkx agkxVar = new agkx();
        agkxVar.j(hdu.d);
        agkxVar.j(hdu.f);
        s = agkxVar.g();
    }

    public gmy(Context context, cf cfVar, gqh gqhVar, tbt tbtVar, ttm ttmVar, Set set, mbc mbcVar, jnm jnmVar, jij jijVar, vxe vxeVar, zwb zwbVar, jks jksVar, ScheduledExecutorService scheduledExecutorService, Executor executor, rql rqlVar, vxz vxzVar, aunn aunnVar, aunn aunnVar2, Set set2) {
        this.c = context;
        this.d = cfVar;
        this.e = gqhVar;
        this.f = set;
        this.g = tbtVar;
        this.j = ttmVar;
        this.i = mbcVar;
        this.h = vxeVar;
        this.w = jnmVar;
        this.q = jijVar;
        this.t = zwbVar;
        this.u = jksVar;
        this.k = scheduledExecutorService;
        this.l = executor;
        this.o = rqlVar;
        this.p = vxzVar;
        this.m = aunnVar;
        this.n = aunnVar2;
        this.v = set2;
    }

    public static apoq b(String str) {
        ahno.F(hdu.h.contains(str));
        if (!hdu.c.contains(str)) {
            if (hdu.e.contains(str)) {
                return itq.h(str);
            }
            aihf aihfVarCreateBuilder = apoq.a.createBuilder();
            aihf aihfVarCreateBuilder2 = apos.a.createBuilder();
            aihf aihfVarCreateBuilder3 = apho.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            apho aphoVar = (apho) aihfVarCreateBuilder3.instance;
            aphoVar.c |= 1;
            aphoVar.d = "no_connection_error_continuation";
            aihfVarCreateBuilder3.copyOnWrite();
            apho aphoVar2 = (apho) aihfVarCreateBuilder3.instance;
            aphoVar2.c |= 2;
            aphoVar2.e = true;
            apho aphoVar3 = (apho) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder2.copyOnWrite();
            apos aposVar = (apos) aihfVarCreateBuilder2.instance;
            aphoVar3.getClass();
            aposVar.e = aphoVar3;
            aposVar.b |= 4;
            aihfVarCreateBuilder.cl(aihfVarCreateBuilder2);
            return (apoq) aihfVarCreateBuilder.build();
        }
        akmy akmyVar = (akmy) hle.a.get(str);
        akmyVar.getClass();
        aihf aihfVarCreateBuilder4 = apoq.a.createBuilder();
        aihf aihfVarCreateBuilder5 = apos.a.createBuilder();
        aihf aihfVarCreateBuilder6 = apho.a.createBuilder();
        String strName = akmyVar.name();
        aihfVarCreateBuilder6.copyOnWrite();
        apho aphoVar4 = (apho) aihfVarCreateBuilder6.instance;
        strName.getClass();
        aphoVar4.c |= 1;
        aphoVar4.d = strName;
        aihfVarCreateBuilder6.copyOnWrite();
        apho aphoVar5 = (apho) aihfVarCreateBuilder6.instance;
        aphoVar5.c |= 2;
        aphoVar5.e = true;
        apho aphoVar6 = (apho) aihfVarCreateBuilder6.build();
        aihfVarCreateBuilder5.copyOnWrite();
        apos aposVar2 = (apos) aihfVarCreateBuilder5.instance;
        aphoVar6.getClass();
        aposVar2.e = aphoVar6;
        aposVar2.b |= 4;
        aihfVarCreateBuilder4.cl(aihfVarCreateBuilder5);
        return (apoq) aihfVarCreateBuilder4.build();
    }

    public final ListenableFuture a(heh hehVar) {
        woo wooVarX = this.w.x(hehVar.f);
        wooVarX.H = hehVar.e;
        if (!TextUtils.isEmpty(hehVar.b)) {
            aihf aihfVarCreateBuilder = anlg.a.createBuilder();
            String str = hehVar.b;
            aihfVarCreateBuilder.copyOnWrite();
            anlg anlgVar = (anlg) aihfVarCreateBuilder.instance;
            str.getClass();
            anlgVar.c |= 1;
            anlgVar.d = str;
            wooVarX.D = (anlg) aihfVarCreateBuilder.build();
        }
        if (hehVar.l(2)) {
            wooVarX.A = 2;
        }
        return s.contains(wooVarX.a) ? taf.a(this.d, this.u.a(), new gmv(wooVarX, 0)) : new aher(wooVarX);
    }

    public final void c(heh hehVar) {
        Context context = this.c;
        if (jku.d(context)) {
            if (hehVar.d()) {
                if (hehVar.g == hei.c && !hehVar.a.c) {
                    jku.a(new fuc(this, hehVar, 4), context);
                }
            } else if (hehVar.g != hei.e) {
                jku.a(new br(this, hehVar, 19, (byte[]) null), context);
            }
            if (hehVar.g != hei.b) {
                this.b.remove(hehVar);
            }
        }
    }

    public final void d(final heh hehVar, int i) {
        vxz vxzVar;
        hed hedVar;
        Runnable gkzVar;
        final long j;
        ListenableFuture listenableFutureH;
        Object obj;
        gnn gnnVar;
        hehVar.e = i;
        Set<heh> set = this.b;
        for (heh hehVar2 : set) {
            if (hehVar2.d()) {
                hehVar2.k(hei.e);
            }
        }
        vxz vxzVar2 = this.p;
        if (vxzVar2.l(206, 45734052L, false)) {
            agkz agkzVar = hdu.h;
            if (agkzVar.contains(hehVar.b())) {
                for (heh hehVar3 : set) {
                    if (agkzVar.contains(hehVar3.b())) {
                        hehVar3.k(hei.e);
                    }
                }
            }
        }
        hei heiVar = hehVar.g;
        hei heiVar2 = hei.b;
        if (heiVar != heiVar2) {
            ajwo ajwoVar = hehVar.f;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            ajmf ajmfVar = (ajmf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            hehVar.d = null;
            String str = ajmfVar.c;
            agqr it = ((agqj) this.v).iterator();
            while (true) {
                if (!it.hasNext()) {
                    vxzVar = vxzVar2;
                    hedVar = null;
                    break;
                }
                hed hedVar2 = (hed) it.next();
                str.getClass();
                vxzVar = vxzVar2;
                if (((vxz) hedVar2.b).l(56, 45801917L, false) && awrc.c(str, "FEmusic_home")) {
                    hedVar = hedVar2;
                    break;
                }
                vxzVar2 = vxzVar;
            }
            hehVar.k(heiVar2);
            set.add(hehVar);
            int i2 = 2;
            if (hedVar == null || hehVar.d() || hehVar.e == 5 || !((obj = hehVar.h) == null || ((wfy) obj).g() || ((gnnVar = hehVar.a) != null && gnnVar.c))) {
                c(hehVar);
                gkzVar = new gkz(i2);
            } else {
                gkzVar = new aew(this, hehVar, ajmfVar, hedVar, 10);
            }
            if (!hdu.h.contains(ajmfVar.c) || this.t.u()) {
                ajwo ajwoVar2 = hehVar.f;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                ajwoVar2.c(aihlVarCheckIsLite2);
                Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                final String str2 = ((ajmf) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).c;
                if (hehVar.d()) {
                    j = r;
                } else {
                    j = 500;
                    if (!hdu.c.contains(str2) && !hdu.e.contains(str2)) {
                        j = r;
                    }
                }
                final Runnable runnable = gkzVar;
                listenableFutureH = afxd.f(a(hehVar)).h(new ahcy() { // from class: gmw
                    @Override // defpackage.ahcy
                    public final ListenableFuture a(Object obj2) {
                        final heh hehVar4 = hehVar;
                        gnl gnlVar = hehVar4.c;
                        Optional optionalEmpty = Optional.empty();
                        Runnable runnable2 = runnable;
                        final gmy gmyVar = this.a;
                        afxd afxdVarF = afxd.f(gmyVar.e.g((woo) obj2, gnlVar, optionalEmpty, runnable2));
                        final String str3 = str2;
                        okv okvVar = new okv(gmyVar, str3, hehVar4, 1);
                        ScheduledExecutorService scheduledExecutorService = gmyVar.k;
                        return new afxd(ahng.u(afxdVarF.h(okvVar, scheduledExecutorService).b, j, TimeUnit.MILLISECONDS, scheduledExecutorService)).g(new idv(gmyVar, str3, 1), scheduledExecutorService).c(Throwable.class, new ahcy() { // from class: gmx
                            @Override // defpackage.ahcy
                            public final ListenableFuture a(Object obj3) {
                                boolean zContains;
                                Throwable th = (Throwable) obj3;
                                haj hajVar = new haj();
                                gmy gmyVar2 = gmyVar;
                                gmyVar2.g.c(hajVar);
                                ((agrc) ((agrc) ((agrc) gmy.a.c()).j(th)).k("com/google/android/apps/youtube/music/browse/BrowseController", "handleDefaultBrowse", (char) 381, "BrowseController.java")).t("Failed to load response from PersistentBrowseService");
                                vxz vxzVar3 = gmyVar2.p;
                                String str4 = str3;
                                if (vxzVar3.l(206, 45734052L, false)) {
                                    zContains = str4.equals("FEmusic_library_sideloaded_tracks") || str4.equals("FEmusic_offline");
                                } else {
                                    zContains = hdu.h.contains(str4);
                                }
                                if (!zContains) {
                                    return ahng.m(th);
                                }
                                heh hehVar5 = hehVar4;
                                if (vxzVar3.l(206, 45734052L, false) && !hehVar5.d()) {
                                    if (str4.equals("FEmusic_offline")) {
                                        ((hur) gmyVar2.m.io()).k = true;
                                    }
                                    if (str4.equals("FEmusic_library_sideloaded_tracks")) {
                                        ((itq) gmyVar2.n.io()).j();
                                    }
                                }
                                boolean z = !hehVar5.d();
                                gnm gnmVarA = gnn.a();
                                gnmVarA.d(true);
                                gnmVarA.g(z);
                                gnmVarA.c(gmyVar2.i.f().toEpochMilli());
                                gnn gnnVarA = gnmVarA.a();
                                jij jijVar = gmyVar2.q;
                                apoq apoqVarB = gmy.b(str4);
                                vxz vxzVar4 = (vxz) jijVar.b;
                                anxn anxnVarE = vxzVar4.l(206, 45734052L, false) ? jij.e(((Context) jijVar.c).getString(R.string.pivot_library)) : ((jij) jijVar.a).d(str4);
                                aihf aihfVarCreateBuilder = anpf.a.createBuilder();
                                aihh aihhVar = (aihh) apji.a.createBuilder();
                                aihhVar.e(anxo.a, anxnVarE);
                                aihfVarCreateBuilder.copyOnWrite();
                                anpf anpfVar = (anpf) aihfVarCreateBuilder.instance;
                                apji apjiVar = (apji) aihhVar.build();
                                apjiVar.getClass();
                                anpfVar.d = apjiVar;
                                anpfVar.b |= 4;
                                anpf anpfVar2 = (anpf) aihfVarCreateBuilder.build();
                                aihf aihfVarCreateBuilder2 = aqjj.a.createBuilder();
                                aihfVarCreateBuilder2.copyOnWrite();
                                aqjj aqjjVar = (aqjj) aihfVarCreateBuilder2.instance;
                                aqjjVar.b |= 16;
                                aqjjVar.f = true;
                                aihf aihfVarCreateBuilder3 = aqjg.a.createBuilder();
                                aihfVarCreateBuilder3.copyOnWrite();
                                aqjg aqjgVar = (aqjg) aihfVarCreateBuilder3.instance;
                                apoqVarB.getClass();
                                aqjgVar.c = apoqVarB;
                                aqjgVar.b |= 1;
                                aihfVarCreateBuilder2.copyOnWrite();
                                aqjj aqjjVar2 = (aqjj) aihfVarCreateBuilder2.instance;
                                aqjg aqjgVar2 = (aqjg) aihfVarCreateBuilder3.build();
                                aqjgVar2.getClass();
                                aqjjVar2.i = aqjgVar2;
                                aqjjVar2.b |= 16384;
                                aqjj aqjjVar3 = (aqjj) aihfVarCreateBuilder2.build();
                                aihh aihhVar2 = (aihh) almd.a.createBuilder();
                                aihf aihfVarCreateBuilder4 = allx.a.createBuilder();
                                aihfVarCreateBuilder4.copyOnWrite();
                                allx allxVar = (allx) aihfVarCreateBuilder4.instance;
                                anpfVar2.getClass();
                                allxVar.c = anpfVar2;
                                allxVar.b = 99965204;
                                aihhVar2.copyOnWrite();
                                almd almdVar = (almd) aihhVar2.instance;
                                allx allxVar2 = (allx) aihfVarCreateBuilder4.build();
                                allxVar2.getClass();
                                almdVar.d = allxVar2;
                                almdVar.b |= 2;
                                aihf aihfVarCreateBuilder5 = alme.a.createBuilder();
                                aihf aihfVarCreateBuilder6 = almj.a.createBuilder();
                                aihf aihfVarCreateBuilder7 = almg.a.createBuilder();
                                aihfVarCreateBuilder7.copyOnWrite();
                                almg almgVar = (almg) aihfVarCreateBuilder7.instance;
                                aqjjVar3.getClass();
                                almgVar.c = aqjjVar3;
                                almgVar.b = 58174010;
                                aihfVarCreateBuilder6.bq(aihfVarCreateBuilder7);
                                almj almjVar = (almj) aihfVarCreateBuilder6.build();
                                aihfVarCreateBuilder5.copyOnWrite();
                                alme almeVar = (alme) aihfVarCreateBuilder5.instance;
                                almjVar.getClass();
                                almeVar.c = almjVar;
                                almeVar.b = 58173949;
                                aihhVar2.copyOnWrite();
                                almd almdVar2 = (almd) aihhVar2.instance;
                                alme almeVar2 = (alme) aihfVarCreateBuilder5.build();
                                almeVar2.getClass();
                                almdVar2.f = almeVar2;
                                almdVar2.b |= 64;
                                if (vxzVar4.m(257, 45823344L)) {
                                    aihhVar2.g(jijVar.g());
                                }
                                return ahng.n(new gnq(new wfy((almd) aihhVar2.build()), gnnVarA));
                            }
                        }, scheduledExecutorService);
                    }
                }, MoreExecutors.directExecutor());
            } else {
                if (vxzVar.l(206, 45734052L, false)) {
                    ((itq) this.n.io()).j();
                }
                jij jijVar = this.q;
                apoq apoqVarH = itq.h("FEmusic_library_sideloaded_tracks");
                aihf aihfVarCreateBuilder = aqjj.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aqjj aqjjVar = (aqjj) aihfVarCreateBuilder.instance;
                aqjjVar.b |= 1;
                aqjjVar.c = "FEmusic_library_sideloaded_tracks";
                ajwo ajwoVarA = vxh.a("FEmusic_library_sideloaded_tracks");
                aihfVarCreateBuilder.copyOnWrite();
                aqjj aqjjVar2 = (aqjj) aihfVarCreateBuilder.instance;
                ajwoVarA.getClass();
                aqjjVar2.d = ajwoVarA;
                aqjjVar2.b |= 2;
                aihf aihfVarCreateBuilder2 = aqjg.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                aqjg aqjgVar = (aqjg) aihfVarCreateBuilder2.instance;
                apoqVarH.getClass();
                aqjgVar.c = apoqVarH;
                aqjgVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                aqjj aqjjVar3 = (aqjj) aihfVarCreateBuilder.instance;
                aqjg aqjgVar2 = (aqjg) aihfVarCreateBuilder2.build();
                aqjgVar2.getClass();
                aqjjVar3.i = aqjgVar2;
                aqjjVar3.b |= 16384;
                aihf aihfVarCreateBuilder3 = almj.a.createBuilder();
                aihf aihfVarCreateBuilder4 = almg.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                almg almgVar = (almg) aihfVarCreateBuilder4.instance;
                aqjj aqjjVar4 = (aqjj) aihfVarCreateBuilder.build();
                aqjjVar4.getClass();
                almgVar.c = aqjjVar4;
                almgVar.b = 58174010;
                aihfVarCreateBuilder3.bq(aihfVarCreateBuilder4);
                almj almjVar = (almj) aihfVarCreateBuilder3.build();
                aihf aihfVarCreateBuilder5 = anpf.a.createBuilder();
                alay alayVarD = ackj.d(((Context) jijVar.c).getString(R.string.library_device_files_songs_shelf_title));
                aihfVarCreateBuilder5.copyOnWrite();
                anpf anpfVar = (anpf) aihfVarCreateBuilder5.instance;
                alayVarD.getClass();
                anpfVar.c = alayVarD;
                anpfVar.b |= 1;
                anpf anpfVar2 = (anpf) aihfVarCreateBuilder5.build();
                aihh aihhVar = (aihh) almd.a.createBuilder();
                aihf aihfVarCreateBuilder6 = alme.a.createBuilder();
                aihfVarCreateBuilder6.copyOnWrite();
                alme almeVar = (alme) aihfVarCreateBuilder6.instance;
                almjVar.getClass();
                almeVar.c = almjVar;
                almeVar.b = 58173949;
                aihhVar.copyOnWrite();
                almd almdVar = (almd) aihhVar.instance;
                alme almeVar2 = (alme) aihfVarCreateBuilder6.build();
                almeVar2.getClass();
                almdVar.f = almeVar2;
                almdVar.b |= 64;
                aihf aihfVarCreateBuilder7 = allx.a.createBuilder();
                aihfVarCreateBuilder7.copyOnWrite();
                allx allxVar = (allx) aihfVarCreateBuilder7.instance;
                anpfVar2.getClass();
                allxVar.c = anpfVar2;
                allxVar.b = 99965204;
                aihhVar.copyOnWrite();
                almd almdVar2 = (almd) aihhVar.instance;
                allx allxVar2 = (allx) aihfVarCreateBuilder7.build();
                allxVar2.getClass();
                almdVar2.d = allxVar2;
                almdVar2.b |= 2;
                wfy wfyVar = new wfy((almd) aihhVar.build());
                mbc mbcVar = this.i;
                gnm gnmVarA = gnn.a();
                gnmVarA.c(mbcVar.f().toEpochMilli());
                listenableFutureH = new aher(new gnq(wfyVar, gnmVarA.a()));
            }
            ahda ahdaVar = new ahda(this, hehVar, 1);
            long j2 = afwl.a;
            listenableFutureH.addListener(new ahei(listenableFutureH, new afwj(afty.c(false), ahdaVar, 0)), this.l);
        }
    }
}
