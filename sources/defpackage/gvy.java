package defpackage;

import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.CommonApis;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gvy extends gut {
    private static final agrf g = agrf.h("com/google/android/apps/youtube/music/command/OfflinePlaylistCommandResolver");
    public final xgm a;
    public final vxe b;
    public final tpq c;
    public final cf d;
    public final kjc e;
    public final abfv f;
    private final awmd h;
    private final awmd i;
    private final Executor k;

    public gvy(cf cfVar, awmd awmdVar, awmd awmdVar2, xgm xgmVar, vxe vxeVar, kjc kjcVar, tpq tpqVar, abfv abfvVar, Executor executor) {
        this.d = cfVar;
        this.h = awmdVar;
        this.i = awmdVar2;
        this.a = xgmVar;
        this.b = vxeVar;
        this.e = kjcVar;
        this.c = tpqVar;
        this.f = abfvVar;
        this.k = executor;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aoia aoiaVar;
        gvy gvyVar;
        Map map2;
        ListenableFuture listenableFutureN;
        int iB;
        Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aofx.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aofx aofxVar = (aofx) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if ((aofxVar.c & 8) != 0) {
            apji apjiVar = aofxVar.f;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aoic.a);
            apjiVar.c(aihlVarCheckIsLite2);
            Object objK2 = apjiVar.j.k(aihlVarCheckIsLite2.d);
            aoiaVar = (aoia) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
        } else {
            aoiaVar = null;
        }
        if (aoiaVar == null && objS != null) {
            if (objS instanceof aouj) {
                aouj aoujVar = (aouj) objS;
                aouh aouhVar = aoujVar.q;
                if (aouhVar == null) {
                    aouhVar = aouh.a;
                }
                if (aouhVar.b == 60572968) {
                    aouh aouhVar2 = aoujVar.q;
                    if (aouhVar2 == null) {
                        aouhVar2 = aouh.a;
                    }
                    aoiaVar = aouhVar2.b == 60572968 ? (aoia) aouhVar2.c : aoia.a;
                } else {
                    aoiaVar = null;
                }
            } else {
                aoiaVar = null;
            }
        }
        if (aoiaVar == null) {
            ((agrc) ((agrc) g.b().i(agso.a, "OfflinePlaylistCmd")).k("com/google/android/apps/youtube/music/command/OfflinePlaylistCommandResolver", "getOfflineabilityRenderer", 265, "OfflinePlaylistCommandResolver.java")).w("Object is not an offlineable playlist: %s", objS);
        }
        Optional optionalOfNullable = Optional.ofNullable(aoiaVar);
        if (optionalOfNullable.isEmpty()) {
            gvyVar = this;
            map2 = map;
            listenableFutureN = ahng.n(Boolean.FALSE);
        } else {
            aohy aohyVar = ((aoia) optionalOfNullable.get()).d;
            if (aohyVar == null) {
                aohyVar = aohy.a;
            }
            if ((aohyVar.b & 4) == 0 || (iB = CommonApis.b(aofxVar.e)) == 0 || iB != 2) {
                gvyVar = this;
                map2 = map;
                listenableFutureN = ahng.n(Boolean.FALSE);
            } else {
                gvyVar = this;
                map2 = map;
                listenableFutureN = taf.a(this.d, this.c.a(), new hro(gvyVar, aofxVar, optionalOfNullable, map2, 1));
            }
        }
        taf.i(listenableFutureN, gvyVar.k, new glo(13), new gst((gut) gvyVar, (Object) aofxVar, (Object) optionalOfNullable, map2, 3), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public final void d(aofx aofxVar, Optional optional, Map map) {
        int iB = CommonApis.b(aofxVar.e);
        int i = 1;
        if (iB == 0) {
            iB = 1;
        }
        int i2 = iB - 1;
        if (i2 == 1) {
            hmr hmrVar = new hmr(this, aofxVar, map, i);
            if (true == optional.isPresent()) {
                ((gvy) hmrVar.a).g((aofx) hmrVar.b, hmrVar.c, (aoia) optional.get());
                return;
            }
            return;
        }
        int i3 = 8;
        if (i2 == 2) {
            hmm hmmVar = (hmm) this.h.io();
            String str = aofxVar.d;
            aaua aauaVar = new aaua();
            aauaVar.c();
            aauaVar.b(2);
            aaub aaubVarA = aauaVar.a();
            int i4 = 7;
            if (TextUtils.equals(str, "PPSV")) {
                hmmVar.a(aaubVarA, new hgx(hmmVar, 7));
                return;
            }
            if (TextUtils.equals(str, "PPSE")) {
                hmmVar.a(aaubVarA, new hgx(hmmVar, 8));
                return;
            }
            if (!TextUtils.equals(str, "PPSDST")) {
                typ.f(str);
                taf.k(hmmVar.a, ahno.as(hpb.k(hmmVar.b, str, false), new hba(hmmVar, i4), hmmVar.k), new gnx(12), new gyr(hmmVar, str, aaubVarA, 3, (byte[]) null));
                return;
            } else {
                if (aaubVarA.a) {
                    hmmVar.r.aA(R.string.delete_recent_music_dialog_title, R.string.delete_recent_music_dialog_content, new hml(hmmVar, 0), R.string.cancel, R.string.settings, xhb.b(302067)).show();
                    return;
                }
                return;
            }
        }
        if (i2 == 6) {
            hmm hmmVar2 = (hmm) this.h.io();
            String str2 = aofxVar.d;
            tfq tfqVar = hmmVar2.n;
            ListenableFuture listenableFutureP = hmmVar2.c.p(hmmVar2.b, str2);
            if (!tfqVar.i()) {
                taf.n(listenableFutureP, hmmVar2.l, new gln(hmmVar2, 18));
                hmmVar2.p.e(5, 3);
                return;
            } else if (hmmVar2.d.k()) {
                taf.n(listenableFutureP, hmmVar2.l, new gov(hmmVar2, str2, 14));
                return;
            } else {
                hmmVar2.j.d(str2);
                hmmVar2.p.e(5, 4);
                return;
            }
        }
        if (i2 != 10) {
            agrc agrcVar = (agrc) ((agrc) g.c().i(agso.a, "OfflinePlaylistCmd")).k("com/google/android/apps/youtube/music/command/OfflinePlaylistCommandResolver", "executeEndpoint", 227, "OfflinePlaylistCommandResolver.java");
            int iB2 = CommonApis.b(aofxVar.e);
            agrcVar.u("Unsupported Offline Playlist Action: %d", (iB2 != 0 ? iB2 : 1) - 1);
            return;
        }
        hmi hmiVar = (hmi) this.i.io();
        String str3 = aofxVar.d;
        hmo hmoVar = new hmo(this, optional, aofxVar, map, 1);
        cf cfVar = hmiVar.g;
        hpy hpyVar = hmiVar.b;
        ListenableFuture listenableFutureA = taf.a(cfVar, hpyVar.a(kro.at(str3)), new hdn(9));
        ListenableFuture listenableFutureA2 = taf.a(cfVar, hpyVar.a(kro.ay(str3)), new hdn(i3));
        byte[] bArr = null;
        int i5 = 11;
        taf.k(cfVar, ahno.av(listenableFutureA, listenableFutureA2).k(new uf(listenableFutureA, listenableFutureA2, i5, bArr), hmiVar.d), new gnx(i5), new gyr(hmiVar, str3, hmoVar, 2, bArr));
    }

    public final void g(aofx aofxVar, Map map, aoia aoiaVar) {
        hmm hmmVar = (hmm) this.h.io();
        String str = aofxVar.d;
        adbm adbmVar = new adbm(this, aofxVar, map);
        xgn xgnVarHB = this.a.hB();
        aodn aodnVar = aofxVar.h;
        if (aodnVar == null) {
            aodnVar = aodn.a;
        }
        hmmVar.c(str, aoiaVar, adbmVar, xgnVarHB, aodnVar);
    }
}
