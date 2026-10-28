package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.runtime.RuntimeSignal;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gov implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gov(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.List] */
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
    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        int i = 5;
        switch (this.$cid) {
            case 0:
                ((gms) this.a).i((hej) this.b, (wfy) obj);
                break;
            case 1:
                wfy wfyVar = (wfy) obj;
                aihf aihfVarCreateBuilder = asff.a.createBuilder();
                if (wfyVar.a() != null) {
                    apjh apjhVarA = wfyVar.a();
                    aihl aihlVar = anrm.b;
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                    apjhVarA.c(aihlVarCheckIsLite);
                    if (apjhVarA.j.n(aihlVarCheckIsLite.d)) {
                        apjh apjhVarA2 = wfyVar.a();
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                        apjhVarA2.c(aihlVarCheckIsLite2);
                        Object objK = apjhVarA2.j.k(aihlVarCheckIsLite2.d);
                        for (anrl anrlVar : ((anrm) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c) {
                            aihf aihfVarCreateBuilder2 = asfe.a.createBuilder();
                            String str = anrlVar.b;
                            aihfVarCreateBuilder2.copyOnWrite();
                            asfe asfeVar = (asfe) aihfVarCreateBuilder2.instance;
                            str.getClass();
                            asfeVar.b |= 1;
                            asfeVar.c = str;
                            aihfVarCreateBuilder.copyOnWrite();
                            asff asffVar = (asff) aihfVarCreateBuilder.instance;
                            asfe asfeVar2 = (asfe) aihfVarCreateBuilder2.build();
                            asfeVar2.getClass();
                            aiie aiieVar = asffVar.c;
                            if (!aiieVar.c()) {
                                asffVar.c = aihn.mutableCopy(aiieVar);
                            }
                            asffVar.c.add(asfeVar2);
                        }
                    }
                }
                Object obj2 = this.a;
                if (((asff) aihfVarCreateBuilder.instance).c.size() > 0) {
                    aihfVarCreateBuilder.copyOnWrite();
                    asff asffVar2 = (asff) aihfVarCreateBuilder.instance;
                    asffVar2.d = 1;
                    asffVar2.b |= 1;
                    ((RuntimeSignal) obj2).b((asff) aihfVarCreateBuilder.build());
                } else {
                    ((agad) this.b).a((RuntimeSignal) obj2);
                }
                break;
            case 2:
                agab agabVar = (agab) obj;
                Object obj3 = this.b;
                Object obj4 = this.a;
                if (agabVar == null) {
                    isi isiVar = ((grf) obj4).P;
                    if (isiVar != null) {
                        hej hejVar = (hej) obj3;
                        isiVar.n(hejVar.f, hejVar.n);
                    }
                } else {
                    aihf aihfVarCreateBuilder3 = asfr.a.createBuilder();
                    aihfVarCreateBuilder3.copyOnWrite();
                    asfr asfrVar = (asfr) aihfVarCreateBuilder3.instance;
                    asfrVar.e = 1;
                    asfrVar.b |= 4;
                    aihf aihfVarCreateBuilder4 = asey.a.createBuilder();
                    cc ccVar = (cc) obj4;
                    String string = ccVar.getContext().getString(R.string.from_your_downloads);
                    aihfVarCreateBuilder4.copyOnWrite();
                    asey aseyVar = (asey) aihfVarCreateBuilder4.instance;
                    string.getClass();
                    aseyVar.b |= 2;
                    aseyVar.d = string;
                    aihfVarCreateBuilder4.copyOnWrite();
                    asey aseyVar2 = (asey) aihfVarCreateBuilder4.instance;
                    aseyVar2.e = 1;
                    aseyVar2.b |= 4;
                    asfb asfbVar = hli.a;
                    aihfVarCreateBuilder4.copyOnWrite();
                    asey aseyVar3 = (asey) aihfVarCreateBuilder4.instance;
                    asfbVar.getClass();
                    aseyVar3.c = asfbVar;
                    aseyVar3.b |= 1;
                    asey aseyVar4 = (asey) aihfVarCreateBuilder4.build();
                    aihfVarCreateBuilder3.copyOnWrite();
                    asfr asfrVar2 = (asfr) aihfVarCreateBuilder3.instance;
                    aseyVar4.getClass();
                    asfrVar2.c = aseyVar4;
                    asfrVar2.b |= 1;
                    aihf aihfVarCreateBuilder5 = asfg.a.createBuilder();
                    String string2 = ccVar.getContext().getString(R.string.no_connection_message_title);
                    aihfVarCreateBuilder5.copyOnWrite();
                    asfg asfgVar = (asfg) aihfVarCreateBuilder5.instance;
                    string2.getClass();
                    asfgVar.b |= 1;
                    asfgVar.c = string2;
                    String string3 = ccVar.getContext().getString(R.string.common_no_network);
                    aihfVarCreateBuilder5.copyOnWrite();
                    asfg asfgVar2 = (asfg) aihfVarCreateBuilder5.instance;
                    string3.getClass();
                    asfgVar2.b |= 2;
                    asfgVar2.d = string3;
                    String string4 = ccVar.getContext().getString(R.string.no_connection_refresh_button_text);
                    aihfVarCreateBuilder5.copyOnWrite();
                    asfg asfgVar3 = (asfg) aihfVarCreateBuilder5.instance;
                    string4.getClass();
                    asfgVar3.b |= 4;
                    asfgVar3.e = string4;
                    aihfVarCreateBuilder3.copyOnWrite();
                    asfr asfrVar3 = (asfr) aihfVarCreateBuilder3.instance;
                    asfg asfgVar4 = (asfg) aihfVarCreateBuilder5.build();
                    asfgVar4.getClass();
                    asfrVar3.d = asfgVar4;
                    asfrVar3.b |= 2;
                    asfr asfrVar4 = (asfr) aihfVarCreateBuilder3.build();
                    agabVar.i();
                    almd almdVar = almd.a;
                    ((hej) obj3).h = new wfy((almd) agabVar.f(-1829464861, asfrVar4, aihn.getParserForClass(almd.class)));
                    gnm gnmVarA = gnn.a();
                    gnmVarA.d(true);
                    heh hehVar = (heh) obj3;
                    hehVar.a = gnmVarA.a();
                    ((gnf) obj4).t(hehVar);
                }
                break;
            case 3:
                if (((acjy) obj) != null) {
                    Object obj5 = this.a;
                    jku.a(new fuc(obj5, this.b, i), (Context) ((xsc) obj5).b);
                }
                break;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj6 = this.b;
                Object obj7 = this.a;
                if (zBooleanValue) {
                    ((gtw) obj7).a.g((ajwo) obj6);
                } else {
                    hdd hddVar = new hdd();
                    hddVar.l = new gwb(obj7, (Object) hddVar, obj6, 1, (byte[]) null);
                    hddVar.h(((gtw) obj7).b.getSupportFragmentManager(), "GeneratedThumbnailsDisclaimerFragment");
                }
                break;
            case 5:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                ?? r3 = this.b;
                if (iIntValue >= r3.size()) {
                    ((agrc) ((agrc) gud.a.c()).k("com/google/android/apps/youtube/music/command/IterateCommandsCommandResolver", "resolve", 74, "IterateCommandsCommandResolver.java")).w("Index %d is out of bounds.", num);
                } else {
                    ((gud) this.a).b.a((ajwo) r3.get(num.intValue()));
                }
                break;
            case 6:
                alsq alsqVar = (alsq) obj;
                if (alsqVar != null) {
                    ((guv) this.a).b.d(alsqVar.c, this.b);
                }
                break;
            case 7:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj8 = this.a;
                Object obj9 = this.b;
                if (zBooleanValue2) {
                    aojl aojlVar = (aojl) obj9;
                    if ((aojlVar.c & 4) != 0) {
                        vxe vxeVar = ((gwd) obj8).c;
                        ajwo ajwoVar = aojlVar.f;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        vxeVar.a(ajwoVar);
                    }
                } else {
                    hdd hddVar2 = new hdd();
                    aojl aojlVar2 = (aojl) obj9;
                    ajwo ajwoVar2 = aojlVar2.g;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    hddVar2.k = ajwoVar2;
                    hddVar2.l = new gwb(obj8, obj9, hddVar2, 0);
                    int iAS = a.aS(aojlVar2.d);
                    hddVar2.n = iAS != 0 ? iAS : 1;
                    hddVar2.h(((gwd) obj8).b.getSupportFragmentManager(), "GeneratedThumbnailsDisclaimerFragment");
                }
                break;
            case 8:
                String str2 = ((ailn) obj) == ailn.GRANTED ? "granted" : "not_granted";
                hgr hgrVar = (hgr) this.a;
                hgrVar.b(((hgs) this.b).a(str2, hgrVar.d));
                break;
            case 9:
                Map map = (Map) obj;
                if (map == null || map.isEmpty()) {
                    zvp.a(zvn.b, zvm.n, "MBS onPlayFromSearch SearchMediaItems failed: Offline search response is empty.");
                } else {
                    hjo hjoVar = (hjo) this.b;
                    ((hir) ((hia) this.a).d.io()).a(hjoVar.d).h(map, hjoVar);
                }
                break;
            case 10:
                ((his) this.a).d((amzs) this.b, (Set) obj);
                break;
            case 11:
                ((hit) this.a).e((amzv) this.b, (Set) obj);
                break;
            case 12:
                Optional optional = (Optional) obj;
                aonl aonlVar = (aonl) this.b;
                String str3 = aonlVar.e;
                ajwo ajwoVar3 = aonlVar.g;
                if (ajwoVar3 == null) {
                    ajwoVar3 = ajwo.a;
                }
                ((hkl) this.a).q.c(str3, (ajwo) optional.orElse(ajwoVar3));
                break;
            case 13:
                if (!((Boolean) obj).booleanValue()) {
                    ((hmm) this.a).j.c(((aahj) this.b).a);
                }
                break;
            case 14:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                Object obj10 = this.b;
                Object obj11 = this.a;
                if (zBooleanValue3) {
                    hmm hmmVar = (hmm) obj11;
                    huf hufVar = hmmVar.h;
                    try {
                        aany aanyVar = hufVar.b;
                        aihf aihfVarCreateBuilder6 = aofh.a.createBuilder();
                        aihfVarCreateBuilder6.copyOnWrite();
                        aofh aofhVar = (aofh) aihfVarCreateBuilder6.instance;
                        aofhVar.c = 4;
                        aofhVar.b |= 1;
                        String strAy = kro.ay((String) obj10);
                        aihfVarCreateBuilder6.copyOnWrite();
                        aofh aofhVar2 = (aofh) aihfVarCreateBuilder6.instance;
                        strAy.getClass();
                        aofhVar2.b |= 2;
                        aofhVar2.d = strAy;
                        aihh aihhVar = (aihh) aofg.b.createBuilder();
                        int iIntValue2 = hufVar.d.intValue();
                        aogf aogfVar = aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE;
                        int iK = hmy.k(5, iIntValue2, aogfVar);
                        aihhVar.copyOnWrite();
                        aofg aofgVar = (aofg) aihhVar.instance;
                        aofgVar.c |= 1;
                        aofgVar.d = iK;
                        aihl aihlVar2 = anue.b;
                        aihf aihfVarCreateBuilder7 = anue.a.createBuilder();
                        aihfVarCreateBuilder7.copyOnWrite();
                        anue anueVar = (anue) aihfVarCreateBuilder7.instance;
                        anueVar.j = aogfVar.e;
                        anueVar.c |= 16;
                        aihhVar.e(aihlVar2, (anue) aihfVarCreateBuilder7.build());
                        aihfVarCreateBuilder6.copyOnWrite();
                        aofh aofhVar3 = (aofh) aihfVarCreateBuilder6.instance;
                        aofg aofgVar2 = (aofg) aihhVar.build();
                        aofgVar2.getClass();
                        aofhVar3.e = aofgVar2;
                        aofhVar3.b |= 4;
                        aanyVar.a((aofh) aihfVarCreateBuilder6.build());
                    } catch (aaob e) {
                        ((agrc) ((agrc) ((agrc) huf.a.b().i(agso.a, "Offline")).j(e)).k("com/google/android/apps/youtube/music/offline/orchestration/MusicPlaylistDownloadController", "convertSmartDownloadToExplicitDownload", 's', "MusicPlaylistDownloadController.java")).w("Couldn't update playlist through orchestration: %s", obj10);
                    }
                    hmmVar.h.k((String) obj10, hmmVar.o.b(), true, hmmVar.i.intValue());
                } else {
                    kwq kwqVar = ((hmm) obj11).q;
                    ((xsc) kwqVar.a).aA(R.string.sync_offline_playlists_title, R.string.sync_offline_playlists_tracks_message, new hml(new mqd(obj11, obj10), 4), R.string.cancel, R.string.menu_offline_sync_now, xhb.b(97918)).show();
                    ?? r1 = kwqVar.b;
                    r1.b(xhb.a(97917), null, null);
                    r1.l(new xgj(xhb.b(97918)));
                }
                break;
            case 15:
                hnk hnkVar = (hnk) obj;
                agrf agrfVar = hnl.a;
                this.b.a(hnkVar);
                int i2 = hnkVar.a;
                ?? r0 = this.a;
                r0.n("sr_r");
                aihf aihfVarCreateBuilder8 = amiu.a.createBuilder();
                aihf aihfVarCreateBuilder9 = amjd.a.createBuilder();
                long j = i2;
                aihfVarCreateBuilder9.copyOnWrite();
                amjd amjdVar = (amjd) aihfVarCreateBuilder9.instance;
                amjdVar.b |= 4;
                amjdVar.d = j;
                amjd amjdVar2 = (amjd) aihfVarCreateBuilder9.build();
                aihfVarCreateBuilder8.copyOnWrite();
                amiu amiuVar = (amiu) aihfVarCreateBuilder8.instance;
                amjdVar2.getClass();
                amiuVar.Y = amjdVar2;
                amiuVar.e |= SemanticState.Focused;
                r0.h((amiu) aihfVarCreateBuilder8.build());
                break;
            case 16:
                asqb asqbVar = (asqb) obj;
                if (asqbVar != null) {
                    ?? r2 = this.b;
                    ((hoo) this.a).o.b(asqbVar);
                    r2.f(tau.MUSIC_DOWNLOADS_SHELF_GENERATION_FINISHED);
                }
                break;
            case 17:
                htp htpVar = (htp) this.b;
                htpVar.j(htpVar.a(htpVar.f.c((hth) this.a).equals(aamp.TRANSFER_PENDING_WIFI), ((Boolean) obj).booleanValue()));
                break;
            case 18:
                hur hurVar = (hur) this.a;
                hurVar.g = (htd) obj;
                hurVar.h = false;
                hurVar.n(this.b);
                break;
            case 19:
                int i3 = hvo.e;
                if (((ailw) obj).c) {
                    ((hfn) this.a).z((String) this.b);
                }
                break;
            default:
                amae amaeVar = ((wgi) obj).a;
                aouj aoujVarAb = fhz.ab(amaeVar);
                if (aoujVarAb != null) {
                    ico icoVar = (ico) this.a;
                    ((awku) icoVar.h.io()).kk(new icw(amaeVar, null));
                    ArrayList arrayList = new ArrayList();
                    int iH = -1;
                    for (int i4 = 0; i4 < aoujVarAb.g.size(); i4++) {
                        aoui aouiVar = (aoui) aoujVarAb.g.get(i4);
                        int i5 = aouiVar.b;
                        if ((i5 & 1) != 0) {
                            aoun aounVar = aouiVar.c;
                            if (aounVar == null) {
                                aounVar = aoun.a;
                            }
                            if (true == aounVar.k) {
                                iH = i4;
                            }
                            hfn hfnVar = icoVar.o;
                            aoun aounVar2 = aouiVar.c;
                            if (aounVar2 == null) {
                                aounVar2 = aoun.a;
                            }
                            arrayList.add(hfnVar.s(aounVar2));
                        } else if ((i5 & 64) != 0) {
                            aouu aouuVar = aouiVar.e;
                            if (aouuVar == null) {
                                aouuVar = aouu.a;
                            }
                            apji apjiVar = aouuVar.b;
                            if (apjiVar == null) {
                                apjiVar = apji.a;
                            }
                            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aouq.b);
                            apjiVar.c(aihlVarCheckIsLite3);
                            Object objK2 = apjiVar.j.k(aihlVarCheckIsLite3.d);
                            if (true == ((aoun) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).k) {
                                iH = i4;
                            }
                            hfn hfnVar2 = icoVar.o;
                            aouu aouuVar2 = aouiVar.e;
                            if (aouuVar2 == null) {
                                aouuVar2 = aouu.a;
                            }
                            arrayList.add(hfnVar2.C(aouuVar2, icoVar.n));
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ((agrc) ((agrc) ico.a.c().i(agso.a, "PlaybackQueueOpsManager")).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueueOperationsManager", "onWatchNextResponse", 286, "MusicPlaybackQueueOperationsManager.java")).t("Tried to fetch videos for client-side expansion but result was empty.");
                    } else {
                        jnm jnmVar = icoVar.q;
                        agke agkeVar = agpi.a;
                        if (jnmVar.i() && !((abnl) this.b).J()) {
                            iH = jnmVar.h(arrayList, agkeVar, iH, true);
                        }
                        icoVar.c.u(arrayList, agkeVar, Math.max(0, iH), new xxw());
                    }
                }
                break;
        }
    }

    public /* synthetic */ gov(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
