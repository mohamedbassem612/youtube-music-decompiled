package defpackage;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gyr implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gyr(Object obj, Object obj2, aihn aihnVar, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = aihnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [bog, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object, twi] */
    /* JADX WARN: Type inference failed for: r13v21, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v76, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r13v77, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v110, types: [java.lang.Object, vri] */
    /* JADX WARN: Type inference failed for: r14v41, types: [java.lang.Object, twi] */
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
    @Override // defpackage.twi
    public final void a(Object obj) {
        aeqo aeqoVarAD;
        ListenableFuture listenableFutureAm;
        angn angnVar;
        adma admaVarE;
        int i = 2;
        int i2 = 3;
        wgd wgdVar = null;
        switch (this.$cid) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                Object obj2 = this.b;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(arbc.a);
                aihi aihiVar = (aihi) obj2;
                aihiVar.c(aihlVarCheckIsLite);
                Object objK = aihiVar.j.k(aihlVarCheckIsLite.d);
                araz arazVar = (araz) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                String str = "";
                String str2 = "";
                Object[] objArr = false;
                for (arba arbaVar : arazVar.b) {
                    arbb arbbVar = arbaVar.c;
                    if (arbbVar == null) {
                        arbbVar = arbb.a;
                    }
                    if ((arbaVar.b & 1) != 0) {
                        String str3 = arbbVar.b;
                        int iHashCode = str3.hashCode();
                        if (iHashCode != 108124731) {
                            if (iHashCode == 778073676 && str3.equals("offline_playlist_id")) {
                                str = arbbVar.c;
                                objArr = true;
                            } else {
                                bundle2.putString(str3, arbbVar.c);
                            }
                        } else if (str3.equals("offline_video_id")) {
                            str2 = arbbVar.c;
                            objArr = true;
                        } else {
                            bundle2.putString(str3, arbbVar.c);
                        }
                    }
                }
                Object obj3 = this.a;
                if (objArr == true) {
                    bundle2.putString("item_details", String.format("offline_playlist_id: %s, offline_video_id: %s", str, str2));
                    aeqoVarAD = ((gys) obj3).f.aD();
                } else {
                    aeqoVarAD = null;
                }
                ?? r13 = this.c;
                Bitmap bitmap = r13 != 0 ? (Bitmap) r13.get("dialog_bitmap") : null;
                if (bitmap != null) {
                    listenableFutureAm = ahng.n(bitmap);
                } else {
                    gys gysVar = (gys) obj3;
                    listenableFutureAm = ahno.am(twm.x(gysVar.b, gysVar.d.l(83, 45440305L, false), false), Exception.class, new cbs(13), gysVar.c);
                }
                ListenableFuture listenableFuture = listenableFutureAm;
                ahno.av(listenableFuture).k(new hni(obj3, listenableFuture, bundle2, aeqoVarAD, arazVar, 1), ((gys) obj3).c);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                Object obj4 = this.c;
                Object obj5 = this.a;
                if (bool != null && bool.booleanValue()) {
                    ((gwl) obj5).c.b((String) obj4);
                }
                ((gwl) obj5).b.c(new wsp((String) obj4, (alvy) this.b));
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                Object obj6 = this.a;
                Object obj7 = this.c;
                ?? r14 = this.b;
                if (bool2 == null || !bool2.booleanValue()) {
                    String strAt = kro.at((String) obj7);
                    strAt.getClass();
                    ahno.P(!strAt.isEmpty(), "key cannot be empty");
                    aihf aihfVarCreateBuilder = ansy.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    ansy ansyVar = (ansy) aihfVarCreateBuilder.instance;
                    ansyVar.b |= 1;
                    ansyVar.c = strAt;
                    ansv ansvVar = new ansv(aihfVarCreateBuilder);
                    hmi hmiVar = (hmi) obj6;
                    ansvVar.am(Long.valueOf(hmiVar.c.a().getEpochSecond()));
                    aihf aihfVar = ansvVar.a;
                    aofs aofsVar = aofs.OFFLINE_PLAYLIST_AUTO_SYNC_TYPE_METADATA_AND_STREAMS;
                    aihfVar.copyOnWrite();
                    ansy ansyVar2 = (ansy) aihfVar.instance;
                    ansyVar2.d = aofsVar.d;
                    ansyVar2.b |= 2;
                    hmiVar.i.k(hmiVar.h.e()).c(new hbn(ansvVar, 10)).r(hmiVar.e).F(new hmg(obj6, r14, i), new hmd(i2));
                } else {
                    hmi hmiVar2 = (hmi) obj6;
                    Dialog dialogAA = hmiVar2.k.aA(R.string.implicit_remove_offline_playlists_title, R.string.implicit_remove_offline_playlists_message, new hmh(hmiVar2, (String) obj7, r14), R.string.implicit_remove_offline_playlists_negative_button, R.string.remove_offline_confirmed_button, xhb.b(75291));
                    grj grjVar = hmiVar2.j;
                    aaua aauaVar = new aaua();
                    aauaVar.c();
                    aauaVar.b(0);
                    grjVar.g(dialogAA, aauaVar.a());
                }
                break;
            case 3:
                hte hteVar = (hte) obj;
                if (hteVar != null) {
                    Object obj8 = this.b;
                    Object obj9 = this.c;
                    hmm hmmVar = (hmm) this.a;
                    hmk hmkVar = new hmk(hmmVar, (String) obj9);
                    if (hteVar.a) {
                        hmmVar.q.o(hmkVar, (aaub) obj8);
                    } else {
                        hmmVar.q.o(hmkVar, (aaub) obj8);
                    }
                }
                break;
            case 4:
                allk allkVar = (allk) obj;
                ?? r0 = this.a;
                if (allkVar != null) {
                    ((jmg) r0).t(allkVar);
                }
                jmg jmgVar = (jmg) r0;
                LoadingFrameLayout loadingFrameLayout = jmgVar.am;
                if (loadingFrameLayout != null) {
                    loadingFrameLayout.h(1);
                    jmgVar.am.setVisibility(8);
                }
                ?? r15 = this.b;
                taf.l(r0, this.c, new jlz(r15, 5), r15);
                break;
            case 5:
                wfy wfyVar = (wfy) obj;
                if (wfyVar != null) {
                    almd almdVar = wfyVar.a;
                    alme almeVar = almdVar.f;
                    if (almeVar == null) {
                        almeVar = alme.a;
                    }
                    Object obj10 = this.c;
                    Object obj11 = this.a;
                    Object obj12 = this.b;
                    if (almeVar.b == 153515154) {
                        heh hehVar = new heh();
                        hehVar.h = wfyVar;
                        hehVar.j((ajwo) obj10);
                        jol jolVar = (jol) obj12;
                        god godVar = jolVar.u;
                        godVar.d(hehVar);
                        cf cfVar = jolVar.a;
                        if (tuk.s(cfVar.getSupportFragmentManager())) {
                            cc ccVarB = godVar.b();
                            String strB = hehVar.b();
                            if (ccVarB != null && !ahno.aa(strB)) {
                                av avVar = new av(cfVar.getSupportFragmentManager());
                                avVar.p();
                                avVar.g(0, ccVarB, hdu.a(strB), 1);
                                avVar.e();
                                joj jojVar = (joj) obj11;
                                jojVar.e = ccVarB;
                                View view = ccVarB.getView();
                                if (view != null) {
                                    jojVar.a(view);
                                }
                                jojVar.a.h(3);
                            }
                        }
                    } else {
                        jol jolVar2 = (jol) obj12;
                        xgn xgnVar = jolVar2.d;
                        ajwo ajwoVar = (ajwo) obj10;
                        xgnVar.b(fhz.s(ajwoVar), ajwoVar, null);
                        xgnVar.l(new xgj(wfyVar.d()));
                        int i3 = almeVar.b;
                        if (i3 == 49399797) {
                            alme almeVar2 = almdVar.f;
                            if ((almeVar2 == null ? alme.a : almeVar2).b == 49399797) {
                                if (almeVar2 == null) {
                                    almeVar2 = alme.a;
                                }
                                wgdVar = new wgd(almeVar2.b == 49399797 ? (apoq) almeVar2.c : apoq.a);
                            }
                            if (wgdVar != null) {
                                joj jojVar2 = (joj) obj11;
                                jojVar2.c.as(wgdVar);
                                jojVar2.d.scrollToPositionWithOffset(0, 0);
                                jojVar2.a(jojVar2.b);
                                jojVar2.a.h(3);
                            }
                        } else if (i3 == 58508690 && (admaVarE = adul.e(jolVar2.l.a, (angnVar = (angn) almeVar.c), null)) != null) {
                            admaVarE.hU(jolVar2.I, angnVar);
                            joj jojVar3 = (joj) obj11;
                            jojVar3.a(admaVarE.a());
                            jojVar3.a.h(3);
                        }
                    }
                    ((joj) obj11).f = true;
                }
                break;
            case 6:
                zs zsVar = (zs) obj;
                zsVar.getClass();
                zs zsVar2 = new zs((almq) zsVar.a);
                rkt rktVar = (rkt) this.a;
                xgn xgnVar2 = rktVar.c;
                if (xgnVar2 != null && zsVar.w() != null) {
                    xgnVar2.d(new xgj(zsVar.w()));
                }
                ajwo ajwoVarV = zsVar2.v();
                if (ajwoVarV != null) {
                    rktVar.f.a(ajwoVarV);
                } else if (zsVar2.u() != null) {
                    int iAq = ahng.aq(((ajpt) this.b).d);
                    if (iAq == 0) {
                        iAq = 1;
                    }
                    Object obj13 = this.c;
                    rktVar.g = rkm.p(null, iAq, zsVar2.u().toByteArray(), xgnVar2);
                    av avVar2 = new av(rktVar.a.getSupportFragmentManager());
                    avVar2.g(0, rktVar.g, "channel_creation_fragment", 1);
                    avVar2.a(false, true);
                    xgnVar2.b(xhb.a(124448), (ajwo) obj13, null);
                } else {
                    rktVar.d();
                }
                break;
            case 7:
                ((swe) this.a).b(vyq.PRODUCTION, (byte[]) this.b, (byte[]) this.c);
                break;
            case 8:
                ((swe) this.a).b((vyq) obj, (byte[]) this.b, (byte[]) this.c);
                break;
            case 9:
                Throwable th = (Throwable) obj;
                sum sumVar = (sum) this.a;
                xeu xeuVar = sumVar.c;
                Object obj14 = this.b;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(((acb) obj14).o(), alot.PAYMENT_FLOW_STARTED);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                } else {
                    xeuVar.b(((acb) obj14).m());
                }
                sumVar.j = true;
                sumVar.b.i();
                if (th != null) {
                    th.printStackTrace(new PrintWriter(new StringWriter()));
                }
                nsh.f((vxe) sumVar.d.io(), (ajwn) this.c);
                sumVar.d(th);
                break;
            case 10:
                amaz amazVar = (amaz) obj;
                if (amazVar == null) {
                    amazVar = amaz.a;
                }
                Object obj15 = this.b;
                if ((amazVar.b & 64) != 0) {
                    ((acb) obj15).d = amazVar.l;
                }
                sum sumVar2 = (sum) this.a;
                xeu xeuVar2 = sumVar2.c;
                if (xeuVar2.b) {
                    xff xffVarA2 = xeuVar2.a(((acb) obj15).o(), alot.PAYMENT_FLOW_STARTED);
                    ztf ztfVar2 = xffVarA2.k.e;
                    xffVarA2.l = ztfVar2.a();
                    ztfVar2.k(xffVarA2);
                } else {
                    xeuVar2.b(((acb) obj15).m());
                }
                Object obj16 = this.c;
                sumVar2.j = true;
                sumVar2.b.i();
                sumVar2.a().d(new xgj(amazVar.k, (amud) null));
                sumVar2.b(amazVar, (ajwn) obj16);
                break;
            case 11:
                amax amaxVar = (amax) obj;
                if (amaxVar == null) {
                    amaxVar = amax.a;
                }
                sum sumVar3 = (sum) this.a;
                sumVar3.b.i();
                qcb qcbVar = sumVar3.n;
                if (qcbVar != null && (amaxVar.b & 4) != 0) {
                    ambc ambcVar = amaxVar.e;
                    if (ambcVar == null) {
                        ambcVar = ambc.a;
                    }
                    CharSequence charSequenceA = qcbVar.a(ambcVar);
                    if (charSequenceA != null) {
                        Object obj17 = this.b;
                        sumVar3.a().d(new xgj(amaxVar.g.G()));
                        zvp.a(zvn.a, zvm.l, "youtubePayment::".concat(charSequenceA.toString()));
                        xeu xeuVar3 = sumVar3.c;
                        if (xeuVar3.b) {
                            xff xffVarA3 = xeuVar3.a(((acb) obj17).o(), alot.TRANSACTION_FLOW_FAILED);
                            ztf ztfVar3 = xffVarA3.k.e;
                            xffVarA3.l = ztfVar3.a();
                            ztfVar3.k(xffVarA3);
                        } else {
                            xeuVar3.b(((acb) obj17).h());
                        }
                        sumVar3.e(charSequenceA);
                    }
                }
                sul sulVar = sumVar3.k;
                if (sulVar != null) {
                    sulVar.f(amaxVar);
                }
                amaz amazVar2 = (amaz) this.c;
                if ((amazVar2.b & 64) != 0) {
                    acb acbVar = new acb((char[]) null);
                    acbVar.d = amazVar2.l;
                    xeu xeuVar4 = sumVar3.c;
                    if (xeuVar4.b) {
                        xff xffVarA4 = xeuVar4.a(acbVar.o(), alot.TRANSACTION_FLOW_SUCCEEDED);
                        ztf ztfVar4 = xffVarA4.k.e;
                        xffVarA4.l = ztfVar4.a();
                        ztfVar4.k(xffVarA4);
                    } else {
                        xeuVar4.b(acbVar.l());
                    }
                }
                break;
            case 12:
                ((svh) this.a).a(vyq.PRODUCTION, (byte[]) this.b, (byte[]) this.c);
                break;
            case 13:
                ((svh) this.a).a((vyq) obj, (byte[]) this.b, (byte[]) this.c);
                break;
            case 14:
                ((svr) this.b).j(vyq.PRODUCTION, (byte[]) this.c, (yhi) this.a);
                break;
            case 15:
                ((svr) this.b).j((vyq) obj, (byte[]) this.c, (yhi) this.a);
                break;
            case 16:
                this.a.e();
                aoli aoliVar = (aoli) this.c;
                if ((aoliVar.b & 4) != 0) {
                    Object obj18 = this.b;
                    ajwo ajwoVar2 = aoliVar.g;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    ((abxv) obj18).b.a(ajwoVar2);
                }
                break;
            case 17:
                aaac aaacVar = (aaac) this.a;
                tuk.n(aaacVar.b, R.string.notifications_settings_changed, 1);
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aocq.b);
                aihi aihiVar2 = (aihi) this.b;
                aihiVar2.c(aihlVarCheckIsLite2);
                Object objK2 = aihiVar2.j.k(aihlVarCheckIsLite2.d);
                aaacVar.d.d(((aocq) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).g, this.c);
                break;
            case 18:
                aarp aarpVar = (aarp) obj;
                agrf agrfVar = aatc.a;
                aarpVar.getClass();
                aarpVar.k((aamw) this.b, (aogv) this.c, (aamg) this.a);
                break;
            case 19:
                acra acraVar = (acra) obj;
                Long[] lArr = (Long[]) this.c;
                if (lArr[0].longValue() == Long.MIN_VALUE && acraVar != null && acraVar.m()) {
                    Object obj19 = this.a;
                    Object obj20 = this.b;
                    apfp apfpVarC = acraVar.c();
                    String str4 = (String) obj20;
                    if (str4.equals(apfpVarC.o)) {
                        Optional optional = (Optional) obj19;
                        if (optional.isEmpty() || ((String) optional.get()).equals(apfpVarC.p)) {
                            lArr[0] = Long.valueOf(acraVar.b);
                        }
                    }
                    if (acraVar.l()) {
                        for (acra acraVar2 : acraVar.o) {
                            apfp apfpVarC2 = acraVar2.c();
                            if (str4.equals(apfpVarC2.o)) {
                                Optional optional2 = (Optional) obj19;
                                if (optional2.isEmpty() || ((String) optional2.get()).equals(apfpVarC2.p)) {
                                    lArr[0] = Long.valueOf(acraVar2.q);
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                affd affdVar = (affd) obj;
                if (affdVar != null) {
                    acwv acwvVar = (acwv) this.b;
                    ((acwq) this.a).c(affdVar, (acwy) ((aihf) this.c).build(), acwvVar, acwvVar.e);
                }
                break;
        }
    }

    public /* synthetic */ gyr(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ gyr(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ gyr(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ gyr(Long[] lArr, String str, Optional optional, int i) {
        this.$cid = i;
        this.c = lArr;
        this.b = str;
        this.a = optional;
    }
}
