package defpackage;

import j$.util.Objects;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xwu implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ xwu(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x04ef  */
    @Override // defpackage.avni
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                xwv xwvVar = (xwv) ((xqy) this.a).a;
                xwvVar.h = null;
                xwvVar.b = null;
                break;
            case 1:
                aayw aaywVar = (aayw) obj;
                wgi wgiVar = aaywVar.d;
                Object obj2 = this.a;
                if (wgiVar != null) {
                    ((xwv) ((xqy) obj2).a).h = wgiVar.b;
                } else {
                    ((xwv) ((xqy) obj2).a).h = null;
                }
                ajwo ajwoVar = aaywVar.e;
                if (ajwoVar != null) {
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
                    ajwoVar.c(aihlVarCheckIsLite);
                    if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                        Object obj3 = ((xqy) obj2).a;
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
                        ajwoVar.c(aihlVarCheckIsLite2);
                        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                        ((xwv) obj3).c = (arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    } else {
                        ((xwv) ((xqy) obj2).a).c = null;
                    }
                } else {
                    ((xwv) ((xqy) obj2).a).c = null;
                }
                ((xwv) ((xqy) obj2).a).b = null;
                break;
            case 2:
                aazj aazjVar = (aazj) obj;
                yat yatVar = (yat) ((xrq) this.a).a;
                if (!yatVar.j && aazjVar.a.a(abob.i) && yatVar.b.h().e() != abnr.INLINE_IN_FEED && yatVar.d.a == 1) {
                    agrx agrxVar = agso.a;
                    yatVar.a(3);
                    break;
                }
                break;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    yfu yfuVar = (yfu) this.a;
                    File file = (File) yfuVar.a.io();
                    if (file != null) {
                        jsk jskVar = (jsk) yfuVar.b.get(file);
                        if (jskVar instanceof ygu) {
                            jskVar.k();
                            zhr.d(zhq.CACHE, "YoutubeMediaCache is released.");
                        }
                    }
                }
                break;
            case 4:
                ((zhl) this.a).e = ((Boolean) obj).booleanValue();
                break;
            case 5:
                ((zhl) this.a).ai();
                break;
            case 6:
                tfl tflVar = (tfl) obj;
                boolean z = tflVar.d;
                zju zjuVar = (zju) this.a;
                zjuVar.f = z;
                zjuVar.c = tflVar.a;
                zjuVar.d = tflVar.c;
                zjuVar.e = tflVar.b;
                int i = tflVar.e;
                zjuVar.b = i == 3 || i == 10;
                break;
            case 7:
                ((zrs) this.a).j((amuh) obj);
                break;
            case 8:
                zux zuxVar = new zux(((Boolean) obj).booleanValue());
                szn sznVar = ((zsu) this.a).d;
                sznVar.c(zuxVar, sznVar.b.b());
                break;
            case 9:
                long jLongValue = ((Long) obj).longValue();
                zsu zsuVar = (zsu) this.a;
                int i2 = (int) (jLongValue >> 32);
                int i3 = (int) (4294967295L & jLongValue);
                int i4 = i3 & 3;
                long jA = zsuVar.c.a();
                if (i4 != (i2 & 3)) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            zsuVar.n();
                            zsuVar.d.h(7000L, 42);
                        } else {
                            szn sznVar2 = zsuVar.d;
                            sznVar2.c(new zuu(i4 == 1), sznVar2.b.b());
                        }
                    }
                }
                int i5 = (i3 >> 2) & 3;
                if (i5 != ((i2 >> 2) & 3)) {
                    szn sznVar3 = zsuVar.d;
                    sznVar3.c(new zuw(i5 == 1, jA), sznVar3.b.b());
                }
                break;
            case 10:
                aobh aobhVarA = aobh.a(((aobm) obj).c);
                if (aobhVarA == null) {
                    aobhVarA = aobh.UNRECOGNIZED;
                }
                ((zzf) this.a).c = aobhVarA;
                break;
            case 11:
                aady aadyVar = (aady) this.a;
                aaew aaewVar = (aaew) aadyVar.h.io();
                for (String str : ((aahy) obj).a) {
                    aadyVar.l(str);
                    aaewVar.n(str);
                }
                break;
            case 12:
                aagg aaggVar = (aagg) this.a;
                int size = aaggVar.a().a().size();
                for (String str2 : ((aahy) obj).a) {
                    aaggVar.n(str2);
                    aaggVar.m(str2);
                }
                if (size > 0 && aaggVar.c().isEmpty()) {
                    Iterator it = aaggVar.g.iterator();
                    while (it.hasNext()) {
                        aado aadoVar = (aado) ((hzo) it.next()).a;
                        aadoVar.g.a(aadoVar.b);
                    }
                    break;
                }
                break;
            case 13:
                weo weoVar = (weo) obj;
                amtc amtcVar = (amtc) weoVar.b;
                amtc amtcVar2 = (amtc) weoVar.c;
                Object obj4 = this.a;
                if (amtcVar != null && amtcVar.f() && (amtcVar2 == null || !Objects.equals(amtcVar.getLocalImageUrl(), amtcVar2.getLocalImageUrl()))) {
                    aakl aaklVar = (aakl) obj4;
                    aakq aakqVar = aaklVar.d;
                    aakqVar.e(amtcVar.getRemoteImageUrl());
                    if (amtcVar2 != null) {
                        aakqVar.b(amtcVar2.getRemoteImageUrl(), amtcVar2.getLocalImageUrl());
                    }
                    zwb zwbVar = aaklVar.c;
                    awmd awmdVar = aaklVar.a;
                    zwa zwaVarE = zwbVar.e();
                    aaqn aaqnVarB = ((aanb) awmdVar.io()).b();
                    String strS = aaqnVarB.s();
                    if (((Objects.equals(zwaVarE.k(), strS) || Objects.equals(zwaVarE.i(), strS)) ? aaqnVarB.g() : null) == null) {
                        zvp.a(zvn.b, zvm.C, "Unable to get offline file store when deleting local image file.");
                    } else if (!aalf.s(amtcVar.getLocalImageUrl())) {
                        zvp.a(zvn.b, zvm.C, "Unable to delete image file '" + amtcVar.getLocalImageUrl() + "' for local image entity.");
                    }
                    break;
                } else if (amtcVar == null && amtcVar2 != null) {
                    ((aakl) obj4).d.b(amtcVar2.getRemoteImageUrl(), amtcVar2.getLocalImageUrl());
                    break;
                }
                break;
            case 14:
                weo weoVar2 = (weo) obj;
                aohq aohqVar = (aohq) weoVar2.b;
                aohq aohqVar2 = (aohq) weoVar2.c;
                aakr aakrVar = (aakr) this.a;
                zwa zwaVar = aakrVar.a;
                if (zwaVar != null) {
                    if (!Objects.equals(aakrVar.b.d(), zwaVar.i())) {
                    }
                }
                aadc aadcVarC = aakrVar.b.b().c();
                if (aohqVar != null && aadcVarC != null) {
                    String strH = wfs.h(aohqVar.b());
                    if (aohqVar2 == null) {
                        aabq.k(strH, ((aada) aadcVarC).io());
                    } else {
                        HashSet<String> hashSet = new HashSet();
                        Iterator it2 = aohqVar.getStreamsProgress().iterator();
                        while (it2.hasNext()) {
                            alaw alawVar = (alaw) wjr.F(((aqdp) it2.next()).g.G(), alaw.b);
                            if (alawVar != null) {
                                hashSet.add(zik.bv(strH, alawVar.e, alawVar.r, alawVar.p, false));
                                hashSet.add(zik.bv(strH, alawVar.e, alawVar.r, alawVar.p, true));
                            }
                        }
                        Iterator it3 = aohqVar2.getStreamsProgress().iterator();
                        while (it3.hasNext()) {
                            alaw alawVar2 = (alaw) wjr.F(((aqdp) it3.next()).g.G(), alaw.b);
                            if (alawVar2 != null) {
                                hashSet.remove(zik.bv(strH, alawVar2.e, alawVar2.r, alawVar2.p, false));
                                hashSet.remove(zik.bv(strH, alawVar2.e, alawVar2.r, alawVar2.p, true));
                            }
                        }
                        for (String str3 : hashSet) {
                            Iterator it4 = ((aada) aadcVarC).io().iterator();
                            while (it4.hasNext()) {
                                aabq.j(str3, (jsk) it4.next());
                            }
                        }
                    }
                    break;
                }
                break;
            case 15:
                weo weoVar3 = (weo) obj;
                aqph aqphVar = (aqph) weoVar3.b;
                if (weoVar3.c == null && aqphVar != null) {
                    ((aala) this.a).b.aA(aqphVar.b());
                    break;
                }
                break;
            case 16:
                ((aann) this.a).b();
                break;
            case 17:
                aany aanyVar = (aany) this.a;
                aaof aaofVar = (aaof) aanyVar.h.get();
                if (aaofVar != null && aaofVar.v() && ((tfq) aanyVar.c.io()).i()) {
                    aaofVar.p();
                    break;
                }
                break;
            case 18:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                aaof aaofVar2 = (aaof) ((aany) this.a).h.get();
                if (aaofVar2 != null) {
                    aaofVar2.n.set(zBooleanValue);
                    if (aaofVar2.v() && !zBooleanValue) {
                        aaofVar2.p();
                        break;
                    }
                }
                break;
            case 19:
                aaxc aaxcVar = (aaxc) obj;
                aihf aihfVarCreateBuilder = aknq.a.createBuilder();
                Object obj5 = this.a;
                mbc mbcVar = ((aaop) obj5).c;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long epochMilli = mbcVar.f().toEpochMilli() / 1000;
                aihfVarCreateBuilder.copyOnWrite();
                aknq aknqVar = (aknq) aihfVarCreateBuilder.instance;
                aknqVar.c |= 8;
                aknqVar.d = epochMilli;
                aknq aknqVar2 = (aknq) aihfVarCreateBuilder.build();
                aihh aihhVar = (aihh) aofg.b.createBuilder();
                aihhVar.e(aknq.b, aknqVar2);
                aofg aofgVar = (aofg) aihhVar.build();
                try {
                    aany aanyVar2 = ((aaop) obj5).b;
                    aihf aihfVarCreateBuilder2 = aofh.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    aofh aofhVar = (aofh) aihfVarCreateBuilder2.instance;
                    aofhVar.c = 4;
                    aofhVar.b |= 1;
                    String strG = wfs.g(146, aaxcVar.a());
                    aihfVarCreateBuilder2.copyOnWrite();
                    aofh aofhVar2 = (aofh) aihfVarCreateBuilder2.instance;
                    strG.getClass();
                    aofhVar2.b |= 2;
                    aofhVar2.d = strG;
                    aihfVarCreateBuilder2.copyOnWrite();
                    aofh aofhVar3 = (aofh) aihfVarCreateBuilder2.instance;
                    aofgVar.getClass();
                    aofhVar3.e = aofgVar;
                    aofhVar3.b |= 4;
                    aanyVar2.a((aofh) aihfVarCreateBuilder2.build());
                } catch (aaob e) {
                    ((agrc) ((agrc) aaop.a.b()).k("com/google/android/libraries/youtube/offline/player/OfflineDrmSessionExpirationMonitor", "onOfflineDrmSessionExpirationUpdateEvent", 82, "OfflineDrmSessionExpirationMonitor.java")).w("Couldn't update: %s", e.getMessage());
                    return;
                }
                break;
            default:
                ((aapj) this.a).a((aazj) obj);
                break;
        }
    }
}
