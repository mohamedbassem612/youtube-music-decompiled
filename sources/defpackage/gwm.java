package defpackage;

import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gwm extends gut {
    public static final Set a = new HashSet();
    private final cf b;
    private final awmd c;
    private final wsl d;
    private final ttm e;
    private final tbt f;
    private final hpy g;
    private final hpb h;
    private final huf i;
    private final xgm k;
    private final awmd l;
    private final jki m;
    private final Executor n;
    private final ScheduledExecutorService o;
    private final jin p;
    private final tfq q;
    private final vxz r;
    private final vxz s;
    private final vxz t;
    private final grj u;
    private final hef v;
    private final jij w;

    public gwm(awmd awmdVar, cf cfVar, wsl wslVar, ttm ttmVar, tbt tbtVar, hpy hpyVar, hpb hpbVar, jin jinVar, huf hufVar, grj grjVar, xgm xgmVar, awmd awmdVar2, jki jkiVar, Executor executor, ScheduledExecutorService scheduledExecutorService, hef hefVar, tfq tfqVar, jij jijVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3) {
        awmdVar.getClass();
        this.c = awmdVar;
        cfVar.getClass();
        this.b = cfVar;
        wslVar.getClass();
        this.d = wslVar;
        ttmVar.getClass();
        this.e = ttmVar;
        tbtVar.getClass();
        this.f = tbtVar;
        hpyVar.getClass();
        this.g = hpyVar;
        hpbVar.getClass();
        this.h = hpbVar;
        awmdVar2.getClass();
        this.l = awmdVar2;
        this.p = jinVar;
        this.i = hufVar;
        this.u = grjVar;
        this.k = xgmVar;
        this.m = jkiVar;
        this.n = executor;
        this.o = scheduledExecutorService;
        this.v = hefVar;
        this.q = tfqVar;
        this.r = vxzVar;
        this.s = vxzVar2;
        this.w = jijVar;
        this.t = vxzVar3;
    }

    static boolean d(aotf aotfVar, vxz vxzVar) {
        return aotfVar.d.equals("SE") && vxzVar.l(58, 45706990L, false);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x016c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0178  */
    /* JADX WARN: Code duplicated, block: B:71:0x0186  */
    /* JADX WARN: Code duplicated, block: B:80:0x020a  */
    /* JADX WARN: Code duplicated, block: B:81:0x021d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0194 A[SYNTHETIC] */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        ajwo ajwoVar2;
        aelz aelzVar;
        long j;
        final gwl gwlVar;
        final long j2;
        Executor executor;
        ListenableFuture listenableFutureB;
        String str;
        Iterator it;
        aotd aotdVarA;
        int iOrdinal;
        aelz aelzVar2;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aotf.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aotf aotfVar = (aotf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        typ.f(aotfVar.d);
        if (!this.q.i()) {
            jin jinVar = this.p;
            cf cfVar = this.b;
            jio jioVarE = jin.e();
            ((jik) jioVarE).k(cfVar.getString(R.string.common_no_network));
            jinVar.d(jioVarE.b());
            return;
        }
        if (aotfVar.f.size() > 0) {
            ((vxe) this.c.io()).d(aotfVar.f, map);
        }
        Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        wsl wslVar = this.d;
        wsi wsiVarA = wslVar.a();
        wsiVarA.n(ajwoVar.c);
        wsiVarA.a = aotfVar.d;
        wsiVarA.c = aotfVar.h;
        wsiVarA.e(aotfVar.e);
        vxz vxzVar = this.s;
        int i = 1;
        if (d(aotfVar, vxzVar)) {
            Optional optionalJ = this.w.j();
            hge hgeVar = new hge(wsiVarA, i);
            if (true == optionalJ.isPresent()) {
                ((wsi) hgeVar.a).d = (aigj) optionalJ.get();
            }
        }
        boolean z = objS instanceof anzi;
        if (z) {
            anzi anziVar = (anzi) objS;
            if ((anziVar.b & 64) != 0) {
                ajwoVar2 = anziVar.i;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
            } else {
                ajwoVar2 = null;
            }
            this.u.c(anziVar);
            Iterator it2 = aotfVar.e.iterator();
            while (it2.hasNext()) {
                aotd aotdVarA2 = aotd.a(((aote) it2.next()).d);
                if (aotdVarA2 == null) {
                    aotdVarA2 = aotd.ACTION_UNKNOWN;
                }
                if (aotdVarA2 == aotd.ACTION_REMOVE_VIDEO) {
                    Set set = a;
                    if (set.contains(anziVar)) {
                        return;
                    } else {
                        set.add(anziVar);
                    }
                }
            }
        } else {
            ajwoVar2 = null;
        }
        Iterator it3 = aotfVar.e.iterator();
        while (true) {
            if (it3.hasNext()) {
                aote aoteVar = (aote) it3.next();
                int i2 = aoteVar.d;
                aotd aotdVarA3 = aotd.a(i2);
                if (aotdVarA3 == null) {
                    aotdVarA3 = aotd.ACTION_UNKNOWN;
                }
                if (aotdVarA3 == aotd.ACTION_REMOVE_CUSTOM_THUMBNAIL) {
                    aelzVar2 = new aelz();
                    aelzVar2.h(this.b.getSupportFragmentManager(), "fullscreen_spinner_fragment");
                    j = 2500;
                } else {
                    aotd aotdVarA4 = aotd.a(i2);
                    if (aotdVarA4 == null) {
                        aotdVarA4 = aotd.ACTION_UNKNOWN;
                    }
                    if (aotdVarA4 == aotd.ACTION_SET_CUSTOM_THUMBNAIL) {
                        aelzVar2 = new aelz();
                        aelzVar2.h(this.b.getSupportFragmentManager(), "fullscreen_spinner_fragment");
                        j = 1500;
                    } else {
                        aotd aotdVarA5 = aotd.a(i2);
                        if (aotdVarA5 == null) {
                            aotdVarA5 = aotd.ACTION_UNKNOWN;
                        }
                        if (aotdVarA5 == aotd.ACTION_SET_EPHEMERAL_STATUS) {
                            cc ccVarG = this.b.getSupportFragmentManager().g(goa.VOICE_SEARCH.j);
                            jmg jmgVar = ccVarG instanceof jmg ? (jmg) ccVarG : null;
                            if (jmgVar != null) {
                                jmgVar.an = aoteVar.r;
                            }
                        }
                    }
                }
                aelzVar = aelzVar2;
                if (this.t.l(21, 45706150L, false)) {
                    it = aotfVar.e.iterator();
                    while (it.hasNext()) {
                        aotdVarA = aotd.a(((aote) it.next()).d);
                        if (aotdVarA == null) {
                            aotdVarA = aotd.ACTION_UNKNOWN;
                        }
                        iOrdinal = aotdVarA.ordinal();
                        if (iOrdinal != 3 || iOrdinal == 23) {
                            if (z) {
                                this.f.c(new vvt(objS));
                            }
                        }
                    }
                }
                aiie aiieVar = aotfVar.e;
                cf cfVar2 = this.b;
                ttm ttmVar = this.e;
                vxe vxeVar = (vxe) this.c.io();
                tbt tbtVar = this.f;
                hpy hpyVar = this.g;
                hpb hpbVar = this.h;
                ajwo ajwoVar3 = ajwoVar2;
                jin jinVar2 = this.p;
                huf hufVar = this.i;
                j2 = j;
                grj grjVar = this.u;
                xgm xgmVar = this.k;
                jki jkiVar = this.m;
                executor = this.n;
                gwlVar = new gwl(aiieVar, ajwoVar, objS, ajwoVar3, cfVar2, ttmVar, vxeVar, tbtVar, hpyVar, hpbVar, jinVar2, hufVar, grjVar, xgmVar, aelzVar, jkiVar, executor, this.o, this.v, this.w, this.r, vxzVar);
                listenableFutureB = wslVar.b(wsiVarA, MoreExecutors.directExecutor());
                if (aelzVar != null) {
                    taf.l(aelzVar, listenableFutureB, new glm(gwlVar, 8), new twi() { // from class: gwi
                        @Override // defpackage.twi
                        public final void a(Object obj) {
                            alvy alvyVar = (alvy) obj;
                            Set set2 = gwm.a;
                            if (alvyVar != null) {
                                long j3 = j2;
                                gwl gwlVar2 = gwlVar;
                                gwj gwjVar = new gwj(gwlVar2, alvyVar, 0);
                                gwlVar2.a.getLifecycle().b(new gwk(gwlVar2, ahng.p(afwl.c(gwjVar), j3, TimeUnit.MILLISECONDS, gwlVar2.f)));
                            }
                        }
                    });
                    str = null;
                } else {
                    str = null;
                    taf.i(listenableFutureB, executor, new gtq(gwlVar, 3), new gln(gwlVar, 6), null);
                }
                tbtVar.c(new haz(true, str));
                return;
            }
            j = 0;
            aelzVar = null;
            if (this.t.l(21, 45706150L, false)) {
                it = aotfVar.e.iterator();
                while (it.hasNext()) {
                    aotdVarA = aotd.a(((aote) it.next()).d);
                    if (aotdVarA == null) {
                        aotdVarA = aotd.ACTION_UNKNOWN;
                    }
                    iOrdinal = aotdVarA.ordinal();
                    if (iOrdinal != 3) {
                    }
                    if (z) {
                        this.f.c(new vvt(objS));
                    }
                }
            }
            aiie aiieVar2 = aotfVar.e;
            cf cfVar3 = this.b;
            ttm ttmVar2 = this.e;
            vxe vxeVar2 = (vxe) this.c.io();
            tbt tbtVar2 = this.f;
            hpy hpyVar2 = this.g;
            hpb hpbVar2 = this.h;
            ajwo ajwoVar4 = ajwoVar2;
            jin jinVar3 = this.p;
            huf hufVar2 = this.i;
            j2 = j;
            grj grjVar2 = this.u;
            xgm xgmVar2 = this.k;
            jki jkiVar2 = this.m;
            executor = this.n;
            gwlVar = new gwl(aiieVar2, ajwoVar, objS, ajwoVar4, cfVar3, ttmVar2, vxeVar2, tbtVar2, hpyVar2, hpbVar2, jinVar3, hufVar2, grjVar2, xgmVar2, aelzVar, jkiVar2, executor, this.o, this.v, this.w, this.r, vxzVar);
            listenableFutureB = wslVar.b(wsiVarA, MoreExecutors.directExecutor());
            if (aelzVar != null) {
                taf.l(aelzVar, listenableFutureB, new glm(gwlVar, 8), new twi() { // from class: gwi
                    @Override // defpackage.twi
                    public final void a(Object obj) {
                        alvy alvyVar = (alvy) obj;
                        Set set2 = gwm.a;
                        if (alvyVar != null) {
                            long j3 = j2;
                            gwl gwlVar2 = gwlVar;
                            gwj gwjVar = new gwj(gwlVar2, alvyVar, 0);
                            gwlVar2.a.getLifecycle().b(new gwk(gwlVar2, ahng.p(afwl.c(gwjVar), j3, TimeUnit.MILLISECONDS, gwlVar2.f)));
                        }
                    }
                });
                str = null;
            } else {
                str = null;
                taf.i(listenableFutureB, executor, new gtq(gwlVar, 3), new gln(gwlVar, 6), null);
            }
            tbtVar2.c(new haz(true, str));
            return;
        }
    }
}
