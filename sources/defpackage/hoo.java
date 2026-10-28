package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.runtime.RuntimeSignal;
import j$.util.Comparator$EL;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hoo extends agcv {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/blocks/MusicOfflineHomeBlockImpl");
    public final hpy b;
    public final Executor c;
    public final Context d;
    public final hlz e;
    public final hnq f;
    public final iqk g;
    public final aunn h;
    public final hlj i;
    public avmn j;
    public avmn k;
    public asfb l;
    public final gmj m;
    public final hbf n;
    public final RuntimeSignal o;
    public final RuntimeSignal p;
    public final vxz q;
    private final mbc r;
    private final awou s;
    private final hpk t;
    private final xit u;
    private final Object v;
    private final awut w;
    private final aaok x;

    public hoo(may mayVar, hpy hpyVar, mbc mbcVar, Executor executor, awou awouVar, gmj gmjVar, Context context, hlz hlzVar, hpk hpkVar, hbf hbfVar, hnq hnqVar, iqk iqkVar, xit xitVar, vxz vxzVar, aunn aunnVar, aaok aaokVar) {
        this.b = hpyVar;
        this.r = mbcVar;
        this.c = executor;
        this.s = awouVar;
        this.m = gmjVar;
        this.d = context;
        this.e = hlzVar;
        this.t = hpkVar;
        this.n = hbfVar;
        this.f = hnqVar;
        this.g = iqkVar;
        this.u = xitVar;
        this.q = vxzVar;
        this.h = aunnVar;
        this.x = aaokVar;
        this.i = new hlj(mbcVar);
        asqb asqbVar = asqb.a;
        aihn.getParserForClass(asqb.class);
        this.o = new RuntimeSignal(-253945413, mayVar.a);
        asfn asfnVar = asfn.a;
        aihn.getParserForClass(asfn.class);
        this.p = new RuntimeSignal(-460115156, mayVar.a);
        this.v = new Object();
        this.w = awrc.K(awouVar);
    }

    public static final void b(Throwable th) {
        ((agrc) ((agrc) a.b().i(agso.a, "MusicOfflineHomeBlock")).j(th).k("com/google/android/apps/youtube/music/offline/blocks/MusicOfflineHomeBlockImpl", "fetchAndNotifySignal$<anonymous>", 384, "MusicOfflineHomeBlockImpl.kt")).t("Failed to fetch downloads shelf items.");
    }

    public final void a() {
        xir xirVarO;
        final asfb asfbVar = this.l;
        if (asfbVar != null) {
            xit xitVar = this.u;
            Object obj = this.v;
            xii xiiVarG = xitVar.g();
            synchronized (obj) {
                xirVarO = (xir) awrc.f(xiiVarG.e());
                if (xirVarO != null) {
                    xiiVarG.c(357);
                } else {
                    xirVarO = xitVar.o(356);
                    xirVarO.k();
                }
            }
            xirVarO.f(tau.MUSIC_DOWNLOADS_SHELF_GENERATION_STARTED);
            afxd afxdVarF = afxd.f(this.t.f());
            hba hbaVar = new hba(new awqg() { // from class: hok
                /* JADX WARN: Type inference failed for: r1v43, types: [awqg, java.lang.Object] */
                @Override // defpackage.awqg
                public final Object invoke(Object obj2) {
                    asew asewVarD;
                    int i;
                    htd htdVar = (htd) obj2;
                    htdVar.getClass();
                    awoa awoaVar = new awoa(10);
                    agke agkeVar = htdVar.d;
                    agkeVar.getClass();
                    awoaVar.addAll(agkeVar);
                    agke agkeVar2 = htdVar.e;
                    agkeVar2.getClass();
                    awoaVar.addAll(agkeVar2);
                    hge hgeVar = new hge(new hol(awoaVar, 0), 8);
                    Optional optional = htdVar.c;
                    if (true == optional.isPresent()) {
                        hgeVar.a.invoke(optional.get());
                    }
                    asfb asfbVar2 = asfbVar;
                    List listF = awoaVar.f();
                    if (((awoa) listF).b < asfbVar2.d) {
                        return ahng.n(asqb.a);
                    }
                    hoo hooVar = this;
                    Comparator comparatorReversed = Comparator$EL.reversed(hooVar.i);
                    comparatorReversed.getClass();
                    List<hcg> listAm = atqq.am(listF, comparatorReversed);
                    if ((asfbVar2.b & 4) != 0 && (i = asfbVar2.e) > 0) {
                        listAm = atqq.an(listAm, i);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (hcg hcgVar : listAm) {
                        String str = hcgVar.f;
                        if (awrc.c(str, "PPSE")) {
                            hcgVar.getClass();
                            Context context = hooVar.d;
                            aqmh aqmhVarY = ixt.y(context, hlz.c);
                            agke agkeVar3 = hcgVar.c;
                            String quantityString = context.getResources().getQuantityString(R.plurals.auto_playlist_with_episode_count_item_subtitle, agkeVar3.size(), Integer.valueOf(agkeVar3.size()));
                            quantityString.getClass();
                            aihf aihfVarCreateBuilder = asew.a.createBuilder();
                            aihfVarCreateBuilder.getClass();
                            aihf aihfVarCreateBuilder2 = anoe.a.createBuilder();
                            aihfVarCreateBuilder2.getClass();
                            aihh aihhVar = (aihh) anuu.a.createBuilder();
                            aihhVar.getClass();
                            str.getClass();
                            aihhVar.copyOnWrite();
                            anuu anuuVar = (anuu) aihhVar.instance;
                            anuuVar.b |= 1;
                            anuuVar.c = str;
                            String strB = hooVar.n.b();
                            strB.getClass();
                            aihhVar.copyOnWrite();
                            anuu anuuVar2 = (anuu) aihhVar.instance;
                            anuuVar2.b |= 2;
                            anuuVar2.d = strB;
                            str.getClass();
                            aihhVar.copyOnWrite();
                            anuu anuuVar3 = (anuu) aihhVar.instance;
                            anuuVar3.b |= 4;
                            anuuVar3.e = str;
                            if (aqmhVarY != null) {
                                aihhVar.copyOnWrite();
                                anuu anuuVar4 = (anuu) aihhVar.instance;
                                anuuVar4.h = aqmhVarY;
                                anuuVar4.b |= 32;
                            }
                            aihn aihnVarBuild = aihhVar.build();
                            aihnVarBuild.getClass();
                            agvp.P((anuu) aihnVarBuild, aihfVarCreateBuilder2);
                            atqn.E(agvp.O(aihfVarCreateBuilder2), aihfVarCreateBuilder);
                            atqn.G(quantityString, aihfVarCreateBuilder);
                            atqn.F(quantityString, aihfVarCreateBuilder);
                            asewVarD = atqn.D(aihfVarCreateBuilder);
                        } else {
                            Object obj3 = hcgVar.a.get();
                            aihf aihfVarCreateBuilder3 = anoe.a.createBuilder();
                            aihfVarCreateBuilder3.getClass();
                            int iC = hna.c(obj3);
                            if (iC == 0) {
                                ankd ankdVar = ((anjx) obj3).c;
                                ankdVar.getClass();
                                aihfVarCreateBuilder3.copyOnWrite();
                                anoe anoeVar = (anoe) aihfVarCreateBuilder3.instance;
                                anoeVar.c = ankdVar;
                                anoeVar.b = 1;
                            } else if (iC != 1) {
                                asewVarD = null;
                            } else {
                                anuu anuuVar5 = ((anuk) obj3).c;
                                anuuVar5.getClass();
                                agvp.P(anuuVar5, aihfVarCreateBuilder3);
                            }
                            anoe anoeVarO = agvp.O(aihfVarCreateBuilder3);
                            int iC2 = hna.c(obj3);
                            String strI = iC2 != 0 ? iC2 != 1 ? "" : hooVar.e.i((anuk) obj3) : hooVar.e.g((anjx) obj3);
                            strI.getClass();
                            aihf aihfVarCreateBuilder4 = asew.a.createBuilder();
                            aihfVarCreateBuilder4.getClass();
                            atqn.E(anoeVarO, aihfVarCreateBuilder4);
                            atqn.G(strI, aihfVarCreateBuilder4);
                            atqn.F(strI, aihfVarCreateBuilder4);
                            asewVarD = atqn.D(aihfVarCreateBuilder4);
                        }
                        if (asewVarD != null) {
                            arrayList.add(asewVarD);
                        }
                    }
                    aihf aihfVarCreateBuilder5 = asez.a.createBuilder();
                    aihfVarCreateBuilder5.getClass();
                    List listUnmodifiableList = DesugarCollections.unmodifiableList(((asez) aihfVarCreateBuilder5.instance).c);
                    listUnmodifiableList.getClass();
                    new aikl(listUnmodifiableList);
                    aihfVarCreateBuilder5.copyOnWrite();
                    asez asezVar = (asez) aihfVarCreateBuilder5.instance;
                    aiie aiieVar = asezVar.c;
                    if (!aiieVar.c()) {
                        asezVar.c = aihn.mutableCopy(aiieVar);
                    }
                    aifs.addAll(arrayList, asezVar.c);
                    aihfVarCreateBuilder5.copyOnWrite();
                    asez asezVar2 = (asez) aihfVarCreateBuilder5.instance;
                    asezVar2.e = 1;
                    asezVar2.b |= 2;
                    aihf aihfVarCreateBuilder6 = asfa.a.createBuilder();
                    aihfVarCreateBuilder6.getClass();
                    Context context2 = hooVar.d;
                    String string = context2.getString(R.string.podcast_label);
                    string.getClass();
                    aihfVarCreateBuilder6.copyOnWrite();
                    asfa asfaVar = (asfa) aihfVarCreateBuilder6.instance;
                    asfaVar.b |= 4;
                    asfaVar.c = string;
                    String string2 = context2.getString(R.string.playlist_label);
                    string2.getClass();
                    aihfVarCreateBuilder6.copyOnWrite();
                    asfa asfaVar2 = (asfa) aihfVarCreateBuilder6.instance;
                    asfaVar2.b |= 8;
                    asfaVar2.d = string2;
                    String string3 = context2.getString(R.string.ep_label);
                    string3.getClass();
                    aihfVarCreateBuilder6.copyOnWrite();
                    asfa asfaVar3 = (asfa) aihfVarCreateBuilder6.instance;
                    asfaVar3.b |= 16;
                    asfaVar3.e = string3;
                    String string4 = context2.getString(R.string.single_label);
                    string4.getClass();
                    aihfVarCreateBuilder6.copyOnWrite();
                    asfa asfaVar4 = (asfa) aihfVarCreateBuilder6.instance;
                    asfaVar4.b |= 32;
                    asfaVar4.f = string4;
                    String string5 = context2.getString(R.string.album_label);
                    string5.getClass();
                    aihfVarCreateBuilder6.copyOnWrite();
                    asfa asfaVar5 = (asfa) aihfVarCreateBuilder6.instance;
                    asfaVar5.b |= 64;
                    asfaVar5.g = string5;
                    String string6 = context2.getString(R.string.shuffle_play_button);
                    string6.getClass();
                    aihfVarCreateBuilder6.copyOnWrite();
                    asfa asfaVar6 = (asfa) aihfVarCreateBuilder6.instance;
                    asfaVar6.b |= SemanticState.Focused;
                    asfaVar6.h = string6;
                    String string7 = context2.getString(R.string.queue_play_next);
                    string7.getClass();
                    aihfVarCreateBuilder6.copyOnWrite();
                    asfa asfaVar7 = (asfa) aihfVarCreateBuilder6.instance;
                    asfaVar7.b |= SemanticState.Hidden;
                    asfaVar7.i = string7;
                    String string8 = context2.getString(R.string.play_next_toast_playlist);
                    string8.getClass();
                    aihfVarCreateBuilder6.copyOnWrite();
                    asfa asfaVar8 = (asfa) aihfVarCreateBuilder6.instance;
                    asfaVar8.b |= SemanticState.LiveRegion;
                    asfaVar8.j = string8;
                    String string9 = context2.getString(R.string.queue_add);
                    string9.getClass();
                    aihfVarCreateBuilder6.copyOnWrite();
                    asfa asfaVar9 = (asfa) aihfVarCreateBuilder6.instance;
                    asfaVar9.b |= SemanticState.ReadOnly;
                    asfaVar9.k = string9;
                    String string10 = context2.getString(R.string.add_to_queue_toast_playlist);
                    string10.getClass();
                    aihfVarCreateBuilder6.copyOnWrite();
                    asfa asfaVar10 = (asfa) aihfVarCreateBuilder6.instance;
                    asfaVar10.b |= SemanticState.Modal;
                    asfaVar10.l = string10;
                    String string11 = context2.getString(R.string.action_remove_playlist_from_offline);
                    string11.getClass();
                    aihfVarCreateBuilder6.copyOnWrite();
                    asfa asfaVar11 = (asfa) aihfVarCreateBuilder6.instance;
                    asfaVar11.b |= SemanticState.Obscured;
                    asfaVar11.m = string11;
                    aihn aihnVarBuild2 = aihfVarCreateBuilder6.build();
                    aihnVarBuild2.getClass();
                    aihfVarCreateBuilder5.copyOnWrite();
                    asez asezVar3 = (asez) aihfVarCreateBuilder5.instance;
                    asezVar3.d = (asfa) aihnVarBuild2;
                    asezVar3.b |= 1;
                    aihn aihnVarBuild3 = aihfVarCreateBuilder5.build();
                    aihnVarBuild3.getClass();
                    return afxd.f(hooVar.m.a()).g(new hnd(new hol((asez) aihnVarBuild3, 2), 3), hooVar.c);
                }
            }, 17);
            Executor executor = this.c;
            taf.i(afxdVarF.h(hbaVar, executor), executor, new hou(1), new gov(this, xirVarO, 16), null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final void c() {
        aaok aaokVar = this.x;
        ?? r1 = aaokVar.d;
        aldd alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_MUSIC_OFFLINE_HOME_SMART_DOWNLOADS_PROMO_CHECK;
        long jC = ((vxz) r1.io()).c(12, 45427744L, 0L);
        long j = jC > 0 ? jC * 1000 : 300000L;
        ?? r2 = aaokVar.b;
        ?? r7 = aaokVar.c;
        long jB = r2.b();
        long jLongValue = ((Long) ConcurrentMap.EL.getOrDefault(r7, alddVar, 0L)).longValue();
        if (jLongValue <= 0 || jB - jLongValue > j) {
            ((ConcurrentHashMap) r7).put(alddVar, Long.valueOf(jB));
            aihf aihfVarCreateBuilder = aldb.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aldb aldbVar = (aldb) aihfVarCreateBuilder.instance;
            aldbVar.c = alddVar.aW;
            aldbVar.b |= 1;
            xeu xeuVar = (xeu) aaokVar.a.io();
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.GENERIC_CLIENT_EXPERIMENT_EVENT);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } else {
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                aldb aldbVar2 = (aldb) aihfVarCreateBuilder.build();
                aldbVar2.getClass();
                alouVar.d = aldbVar2;
                alouVar.c = 423;
                xeuVar.b((alou) alosVar.build());
            }
        }
        if (this.q.l(49, 45782327L, false)) {
            awro.t(this.w, null, 0, new hon(this, null), 3);
        }
    }
}
