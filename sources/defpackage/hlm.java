package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.opengl.GLES20;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hlm implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hlm(ListenableFuture listenableFuture, agkx agkxVar, ListenableFuture listenableFuture2, zne zneVar, int i) {
        this.$cid = i;
        this.c = listenableFuture;
        this.b = agkxVar;
        this.d = listenableFuture2;
        this.a = zneVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v130, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v111, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r1v138, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v60, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.lang.Object, nxl] */
    /* JADX WARN: Type inference failed for: r1v89, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v90, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v99, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v124, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v47, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v78, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v91, types: [java.lang.Object, wek] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v136, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r3v146, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r3v159, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v69, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v46, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v72, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v83, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v56, types: [java.lang.Object, mbc] */
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
    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        aliz alizVar;
        int i;
        iti itiVar;
        airo airoVarA;
        akrq akrqVar;
        int i2 = 10;
        int i3 = 11;
        int i4 = 2097152;
        int i5 = 20;
        int i6 = 19;
        int i7 = 15;
        int i8 = 8;
        rfq rfqVarA = null;
        aeiv aeivVar = null;
        int i9 = 0;
        int i10 = 1;
        switch (this.$cid) {
            case 0:
                boolean zIsPresent = ((Optional) ahng.v(this.b)).isPresent();
                Optional optionalOfNullable = (Optional) ahng.v(this.c);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable((ansx) ((weh) optionalOfNullable.get()));
                }
                if (zIsPresent && optionalOfNullable.isPresent() && ((ansx) optionalOfNullable.get()).getAutoSyncType() == aofs.OFFLINE_PLAYLIST_AUTO_SYNC_TYPE_METADATA_AND_STREAMS) {
                    i9 = 1;
                }
                Object obj = this.a;
                if (i9 != 0) {
                    alizVar = aliz.REMOVE_FROM_LIBRARY;
                    i = R.string.action_disable_auto_download;
                } else {
                    alizVar = aliz.OFFLINE_DOWNLOAD;
                    i = R.string.action_enable_auto_download;
                }
                Object obj2 = ((jnj) obj).c;
                aihf builder = ((aihn) this.d).toBuilder();
                yno.dY(builder, ackj.c(((hlz) obj2).d.getResources().getString(i)));
                anfv anfvVar = (anfv) builder.instance;
                aihf builder2 = (anfvVar.b == 66441155 ? (anga) anfvVar.c : anga.a).toBuilder();
                aihh aihhVar = (aihh) alja.a.createBuilder();
                aihhVar.copyOnWrite();
                alja aljaVar = (alja) aihhVar.instance;
                aljaVar.c = alizVar.yN;
                aljaVar.b |= 1;
                builder2.copyOnWrite();
                anga angaVar = (anga) builder2.instance;
                alja aljaVar2 = (alja) aihhVar.build();
                aljaVar2.getClass();
                angaVar.d = aljaVar2;
                angaVar.b |= 8;
                anga angaVar2 = (anga) builder2.build();
                builder.copyOnWrite();
                anfv anfvVar2 = (anfv) builder.instance;
                angaVar2.getClass();
                anfvVar2.c = angaVar2;
                anfvVar2.b = 66441155;
                ajwo ajwoVarDT = yno.dT((anfv) builder.build());
                if (ajwoVarDT != null) {
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aofx.b);
                    ajwoVarDT.c(aihlVarCheckIsLite);
                    if (ajwoVarDT.j.n(aihlVarCheckIsLite.d)) {
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aofx.b);
                        ajwoVarDT.c(aihlVarCheckIsLite2);
                        Object objK = ajwoVarDT.j.k(aihlVarCheckIsLite2.d);
                        aihf builder3 = ((aofx) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).toBuilder();
                        builder3.copyOnWrite();
                        aofx aofxVar = (aofx) builder3.instance;
                        aofxVar.e = 10;
                        aofxVar.c |= 2;
                        aofx aofxVar2 = (aofx) builder3.build();
                        aihh aihhVar2 = (aihh) ajwoVarDT.toBuilder();
                        aihhVar2.e(aofx.b, aofxVar2);
                        yno.dX(builder, (ajwo) aihhVar2.build());
                    }
                }
                return Optional.of((anfv) builder.build());
            case 1:
                ?? r1 = this.d;
                ?? r2 = this.c;
                int i11 = hin.c;
                Object obj3 = this.b;
                try {
                    if (((Boolean) ahng.v(r2)).booleanValue()) {
                        ((agkx) obj3).c(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED);
                    }
                } catch (ExecutionException unused) {
                }
                try {
                    if (((Boolean) ahng.v(r1)).booleanValue()) {
                        ((agkx) obj3).c(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED);
                    }
                } catch (ExecutionException unused2) {
                }
                if (((zne) this.a).equals(znd.a)) {
                    agkx agkxVar = (agkx) obj3;
                    agkxVar.c(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED_CHILDREN);
                    agkxVar.c(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SETTINGS);
                }
                return ((agkx) obj3).g();
            case 2:
                List list = (List) ahng.v(this.b);
                Map map = (Map) ahng.v(this.c);
                ArrayList arrayList = new ArrayList();
                agke agkeVar = (agke) Collection.EL.stream(list).flatMap(new hfw(map, i8)).collect(aghu.a);
                int size = agkeVar.size();
                while (i9 < size) {
                    arrayList.add((anzi) ((hnl) this.a).e.ap((Class) this.d, anzi.class, agkeVar.get(i9), hnl.b));
                    i9++;
                }
                return arrayList;
            case 3:
                HashMap map2 = new HashMap();
                ahgb.ag((List) ahng.v(this.b), map2);
                Iterator it = ((List) ahng.v(this.c)).iterator();
                while (true) {
                    ?? r3 = this.a;
                    if (!it.hasNext()) {
                        Iterator it2 = ((List) ahng.v(this.d)).iterator();
                        while (it2.hasNext()) {
                            String strH = wfs.h((String) it2.next());
                            if (r3.contains(strH)) {
                                aihf aihfVar = (aihf) j$.util.Map.EL.computeIfAbsent(map2, strH, new hrn(i6));
                                aihf aihfVarCreateBuilder = aoed.a.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                aoed aoedVar = (aoed) aihfVarCreateBuilder.instance;
                                aoedVar.b |= 1;
                                aoedVar.c = true;
                                aihfVar.copyOnWrite();
                                aoeb aoebVar = (aoeb) aihfVar.instance;
                                aoed aoedVar2 = (aoed) aihfVarCreateBuilder.build();
                                aoeb aoebVar2 = aoeb.a;
                                aoedVar2.getClass();
                                aoebVar.e = aoedVar2;
                                aoebVar.b |= 4;
                            }
                        }
                        return ahgb.af(map2);
                    }
                    String strH2 = wfs.h((String) it.next());
                    if (r3.contains(strH2)) {
                        aihf aihfVar2 = (aihf) j$.util.Map.EL.computeIfAbsent(map2, strH2, new hrn(i5));
                        aihf aihfVarCreateBuilder2 = aoee.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        aoee aoeeVar = (aoee) aihfVarCreateBuilder2.instance;
                        aoeeVar.b |= 1;
                        aoeeVar.c = true;
                        aihfVar2.copyOnWrite();
                        aoeb aoebVar3 = (aoeb) aihfVar2.instance;
                        aoee aoeeVar2 = (aoee) aihfVarCreateBuilder2.build();
                        aoeb aoebVar4 = aoeb.a;
                        aoeeVar2.getClass();
                        aoebVar3.d = aoeeVar2;
                        aoebVar3.b |= 2;
                    }
                }
                break;
            case 4:
                aihf aihfVar3 = (aihf) ahng.v(this.b);
                aihf aihfVarCreateBuilder3 = anwt.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                anwt anwtVar = (anwt) aihfVarCreateBuilder3.instance;
                anwtVar.c |= 131072;
                anwtVar.t = true;
                Optional optional = (Optional) ahng.v(this.c);
                hge hgeVar = new hge(aihfVarCreateBuilder3, i6);
                if (true == optional.isPresent()) {
                    Object obj4 = optional.get();
                    Object obj5 = hgeVar.a;
                    aihf aihfVarCreateBuilder4 = anwv.a.createBuilder();
                    aihfVarCreateBuilder4.copyOnWrite();
                    anwv anwvVar = (anwv) aihfVarCreateBuilder4.instance;
                    anwvVar.f = (ankz) obj4;
                    anwvVar.b |= 2097152;
                    ((aihf) obj5).bR(aihfVarCreateBuilder4);
                }
                ?? r4 = this.d;
                Object obj6 = this.a;
                aihfVarCreateBuilder3.bO(r4);
                Optional optionalK = ((hur) obj6).k(r4.size());
                hge hgeVar2 = new hge(aihfVarCreateBuilder3, i5);
                if (true == optionalK.isPresent()) {
                    ((aihf) hgeVar2.a).bQ((apji) optionalK.get());
                }
                aihf aihfVarCreateBuilder5 = apox.a.createBuilder();
                aihfVarCreateBuilder5.copyOnWrite();
                apox apoxVar = (apox) aihfVarCreateBuilder5.instance;
                anwt anwtVar2 = (anwt) aihfVarCreateBuilder3.build();
                anwtVar2.getClass();
                apoxVar.aq = anwtVar2;
                apoxVar.c |= 536870912;
                aihfVar3.ck(aihfVarCreateBuilder5);
                itiVar = new iti((apoq) aihfVar3.build(), 1, (byte[]) null);
                return itiVar;
            case 5:
                aihf aihfVar4 = (aihf) ahng.v(this.b);
                hur hurVar = (hur) this.a;
                aihf aihfVarH = ixt.H(hurVar.d, hurVar.o.l(24, 45722989L, false));
                Optional optional2 = (Optional) ahng.v(this.c);
                hun hunVar = new hun(aihfVarH, i10);
                if (true == optional2.isPresent()) {
                    Object obj7 = optional2.get();
                    Object obj8 = hunVar.a;
                    aihf aihfVarCreateBuilder6 = alfu.a.createBuilder();
                    aihfVarCreateBuilder6.copyOnWrite();
                    alfu alfuVar = (alfu) aihfVarCreateBuilder6.instance;
                    alfuVar.f = (ankz) obj7;
                    alfuVar.b |= 262144;
                    ((aihf) obj8).bp(aihfVarCreateBuilder6);
                }
                ?? r0 = this.d;
                aihfVarH.aY(r0);
                Optional optionalK2 = hurVar.k(r0.size());
                hun hunVar2 = new hun(aihfVarH, i9);
                if (true == optionalK2.isPresent()) {
                    Object obj9 = optionalK2.get();
                    aihf aihfVar5 = (aihf) hunVar2.a;
                    aihfVar5.copyOnWrite();
                    alfr alfrVar = (alfr) aihfVar5.instance;
                    alfr alfrVar2 = alfr.a;
                    alfrVar.c = (apji) obj9;
                    alfrVar.b |= 1;
                }
                aihf aihfVarCreateBuilder7 = apox.a.createBuilder();
                aihfVarCreateBuilder7.copyOnWrite();
                apox apoxVar2 = (apox) aihfVarCreateBuilder7.instance;
                alfr alfrVar3 = (alfr) aihfVarH.build();
                alfrVar3.getClass();
                apoxVar2.p = alfrVar3;
                apoxVar2.b |= SemanticState.Hidden;
                aihfVar4.ck(aihfVarCreateBuilder7);
                itiVar = new iti((apoq) aihfVar4.build(), 1, (byte[]) null);
                return itiVar;
            case 6:
                List<ankr> list2 = (List) this.b.get();
                Cursor cursor = (Cursor) this.c.get();
                Map map3 = (Map) this.d.get();
                HashMap map4 = new HashMap();
                while (cursor.moveToNext()) {
                    try {
                        String strValueOf = String.valueOf(cursor.getInt(cursor.getColumnIndex("artist_id")));
                        if (!map4.containsKey(strValueOf)) {
                            map4.put(strValueOf, (String) map3.get(String.valueOf(cursor.getInt(cursor.getColumnIndex("album_id")))));
                        }
                    } catch (Throwable th) {
                        jku.b(cursor);
                        throw th;
                    }
                }
                jku.b(cursor);
                ArrayList arrayList2 = new ArrayList();
                for (ankr ankrVar : list2) {
                    Object obj10 = this.a;
                    String lastPathSegment = Uri.parse(ankrVar.getAndroidMediaStoreContentUri()).getLastPathSegment();
                    ankp ankpVarD = ankrVar.d();
                    iuo iuoVar = (iuo) obj10;
                    ankpVarD.am(ixt.x((String) map4.get(lastPathSegment), iuoVar.b, R.drawable.cover_profile_empty_state));
                    ((wbz) iuoVar.f.io()).c();
                    arrayList2.add(ankpVarD.an());
                }
                return arrayList2;
            case 7:
                ((ahgb) ((xsc) this.b).b).L((obp) this.a, (byte[]) this.c, (byte[]) this.d);
                return null;
            case 8:
                ?? r5 = this.c;
                Object obj11 = this.a;
                Object obj12 = this.d;
                int i12 = owt.c;
                String str = (String) obj12;
                Typeface typefaceA = r5.a((Context) obj11, str);
                if (typefaceA == null) {
                    typefaceA = rpi.r(str);
                }
                return afxw.n((Resources) this.b, typefaceA);
            case 9:
                Object obj13 = this.b;
                rdr rdrVar = (rdr) obj13;
                rbo rboVar = rdrVar.w;
                qyo qyoVar = rdrVar.n;
                quc qucVar = qyoVar.b;
                rdj rdjVar = rdrVar.g;
                rboVar.g(qucVar, rdjVar.a());
                ((Optional) this.c).isPresent();
                Object obj14 = this.d;
                boolean zIsPresent2 = ((Optional) obj14).isPresent();
                rdrVar.h.lock();
                Object obj15 = this.a;
                try {
                    try {
                        qyoVar.b((tld) obj15);
                        Duration duration = (Duration) ((Optional) (true != ((Optional) obj14).isPresent() ? obj14 : Optional.ofNullable(((rdr) new hlx(obj13, i7).a).v((Duration) ((Optional) obj14).get())))).orElse(rdjVar.a());
                        ((rdr) obj13).A.b();
                        boolean zI = zIsPresent2 | ((rdr) obj13).z.i((quc) ((tld) obj15).b, duration, ((Optional) obj14).isPresent());
                        ((rdr) obj13).A.c();
                        if (zI) {
                            rdo rdoVar = ((rdr) obj13).i;
                            synchronized (rdoVar.a) {
                                try {
                                    rdoVar.d = false;
                                    rdoVar.g = false;
                                    rdoVar.f = true;
                                    rdoVar.b();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            ((rdr) obj13).d.a();
                            ((rdr) obj13).A.a();
                        }
                        if (((Optional) obj14).isPresent()) {
                            ((rdr) obj13).g.c(duration);
                        }
                        ((rdr) obj13).t.b((quc) ((tld) obj15).b, duration, ((Optional) obj14).isPresent()).get(rdr.a.toNanos(), TimeUnit.NANOSECONDS);
                        rdrVar.h.unlock();
                        rdrVar.m.post(afwl.i(new rcu(obj13, i8)));
                        if (rdrVar.q.a.o && !zI) {
                            return null;
                        }
                        rdrVar.d.c();
                        return null;
                    } catch (Throwable th3) {
                        rdrVar.h.unlock();
                        throw th3;
                    }
                } catch (InterruptedException e) {
                    throw e;
                } catch (Exception e2) {
                    rbc rbcVar = new rbc(rdr.I, rbd.d);
                    rbcVar.a = e2;
                    rbcVar.c();
                    rbcVar.a("Exception thrown while updating the composition.", new Object[0]);
                    tge tgeVarA = quk.a();
                    tgeVarA.b = e2;
                    tgeVarA.c = new quf(2);
                    ((rdr) obj13).D(tgeVarA.e());
                    throw e2;
                }
            case 10:
                Object obj16 = this.a;
                ?? r6 = this.c;
                ?? r7 = this.d;
                Object obj17 = this.b;
                try {
                    rfqVarA = ((rgc) obj16).c.a();
                    rjc rjcVar = ((rgc) obj16).a;
                    rjcVar.a().g(rfqVarA.getTextureName(), rfqVarA.getWidth(), rfqVarA.getHeight());
                    rgi.d(((rgc) obj16).e);
                    rfqVarA.a(((Duration) obj17).toNanos() / 1000);
                    Comparator comparatorComparing = Comparator$CC.comparing(new rcs(i2));
                    agjz agjzVar = new agjz(4);
                    Stream map5 = Collection.EL.stream(r6).map(new iuk(obj16, 19));
                    Collector collector = aghu.a;
                    agjzVar.j((Iterable) map5.collect(collector));
                    agjzVar.j(r7);
                    agqs agqsVarListIterator = agke.B(comparatorComparing, agjzVar.g()).listIterator(0);
                    while (agqsVarListIterator.hasNext()) {
                        rem remVar = (rem) agqsVarListIterator.next();
                        if (((rgc) obj16).d.E) {
                            rjcVar.a().g(rfqVarA.getTextureName(), rfqVarA.getWidth(), rfqVarA.getHeight());
                        }
                        remVar.b(rfqVarA);
                    }
                    GLES20.glFinish();
                    rgi.g();
                    if (!((rgc) obj16).d.aa) {
                        return rfqVarA;
                    }
                    agke agkeVar2 = (agke) Collection.EL.stream(r6).flatMap(new rcs(i3)).collect(collector);
                    if (agkeVar2.size() > 1) {
                        rbm rbmVar = rgc.f;
                        rbd rbdVar = rbd.c;
                        new rbc(rbmVar, rbdVar).a("Multiple driving stream frame ids found", new Object[0]);
                        rbc rbcVar2 = new rbc(rbmVar, rbdVar);
                        rbcVar2.c();
                        rbcVar2.a("Multiple driving stream frame ids found", new Object[0]);
                    }
                    rfqVarA.c.m = Collection.EL.stream(agkeVar2).findFirst();
                    return rfqVarA;
                } catch (bvn | RuntimeException e3) {
                    if (rfqVarA != null) {
                        rfqVarA.release();
                    }
                    throw e3;
                }
            case 11:
                String str2 = ((Account) this.a).name;
                omj omjVar = ((rlw) this.c).l;
                Optional optional3 = (Optional) omjVar.H(str2).get();
                Optional optional4 = (Optional) omjVar.H(((Account) this.b).name).get();
                if (optional3.isPresent() && optional4.isPresent()) {
                    return Integer.valueOf(this.d.compare((aijp) optional4.get(), (aijp) optional3.get()));
                }
                if (optional3.isEmpty() && optional4.isEmpty()) {
                    return 0;
                }
                return Integer.valueOf(true != optional4.isPresent() ? -1 : 1);
            case 12:
                while (true) {
                    ?? r8 = this.d;
                    ?? r9 = this.c;
                    Object obj18 = this.a;
                    if (i9 >= ((agpi) obj18).d) {
                        Iterator it3 = r9.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                wnt wntVarH = ((ovo) it3.next()).h();
                                if (wntVarH != null && wntVarH.a() != null) {
                                    airoVarA = wntVarH.a();
                                }
                            } else {
                                airoVarA = null;
                            }
                        }
                        if (airoVarA != null) {
                            aihf aihfVarCreateBuilder8 = akrq.a.createBuilder();
                            aihfVarCreateBuilder8.copyOnWrite();
                            akrq akrqVar2 = (akrq) aihfVarCreateBuilder8.instance;
                            akrqVar2.b |= 1;
                            akrqVar2.c = true;
                            aihfVarCreateBuilder8.copyOnWrite();
                            akrq akrqVar3 = (akrq) aihfVarCreateBuilder8.instance;
                            akrqVar3.b |= 8;
                            akrqVar3.f = 6.0f;
                            akrqVar = (akrq) aihfVarCreateBuilder8.build();
                        } else {
                            akrqVar = null;
                        }
                        return new tld((Object) r9, new wnt(r8, agpi.a, airoVarA, akrqVar), (char[]) null);
                    }
                    Optional optional5 = (Optional) ahng.v((Future) this.b.get(i9));
                    if (optional5.isPresent()) {
                        r9.add((ovo) optional5.get());
                        wnt wntVarH2 = ((ovo) optional5.get()).h();
                        if (wntVarH2 != null) {
                            r8.addAll(wntVarH2.c());
                        }
                    } else {
                        r8.add(wns.b(((Account) ((agke) obj18).get(i9)).name, new wnr(null, null)));
                    }
                    i9++;
                }
                break;
            case 13:
                ukx ukxVar = (ukx) ahng.v(this.d);
                usd usdVar = ukxVar.a;
                vfs vfsVar = ((ula) this.b).b;
                if (vfsVar == null) {
                    throw new NullPointerException("Null shortsEditorProjectState");
                }
                ukz ukzVar = (ukz) this.a;
                if (ukzVar.m.K()) {
                    aihf aihfVarCreateBuilder9 = auew.a.createBuilder();
                    auhs auhsVarC = usdVar.c();
                    aihfVarCreateBuilder9.copyOnWrite();
                    auew auewVar = (auew) aihfVarCreateBuilder9.instance;
                    auhsVarC.getClass();
                    auewVar.c = auhsVarC;
                    auewVar.b |= 1;
                    aihfVarCreateBuilder9.copyOnWrite();
                    auew auewVar2 = (auew) aihfVarCreateBuilder9.instance;
                    auewVar2.b |= 2;
                    auewVar2.d = "";
                    aeivVar = new aeiv(new uru((auew) aihfVarCreateBuilder9.build(), vfsVar.f, vfsVar.g));
                }
                zdj zdjVar = ukzVar.k;
                Object obj19 = zdjVar.b;
                if (obj19 == null || ((uqg) obj19).a != usdVar) {
                    Object obj20 = zdjVar.a;
                    zdjVar.b = new uqg(new zf(usdVar), usdVar);
                }
                Object obj21 = this.c;
                zf zfVar = ((uqg) zdjVar.b).b;
                ukzVar.l.b = new uqf(zfVar, usdVar, ukzVar.h);
                return new ulb(((agjz) obj21).g(), usdVar, zfVar, new ukq(usdVar, vfsVar, aeivVar), ukxVar.b, ukxVar.c);
            case 14:
                awmd awmdVar = ((wbm) this.a).a;
                wer werVarE = this.b.e();
                werVarE.m(((hed) awmdVar.io()).L((String) this.c, (byte[]) this.d));
                return werVarE.c(wem.LEGACY_API_ALLOWLIST_TOKEN);
            case 15:
                ?? r10 = this.a;
                aakg aakgVar = (aakg) this.b;
                aanb aanbVar = aakgVar.b;
                aaqn aaqnVarB = aanbVar.b();
                if (!r10.k().equals(aaqnVarB.s())) {
                    aano aanoVar = new aano(aanp.b);
                    aanoVar.d = 35;
                    return aanoVar.a();
                }
                aaew aaewVarD = aaqnVarB.d();
                if (aaewVarD == null) {
                    aano aanoVar2 = new aano(aanp.b);
                    aanoVar2.d = 15;
                    return aanoVar2.a();
                }
                aerj aerjVarD = aaqnVarB instanceof aado ? ((aado) aanbVar.b()).D() : null;
                if (aerjVarD == null) {
                    return aanp.a;
                }
                String str3 = (String) this.d;
                aamt aamtVarF = aaewVarD.f(str3);
                if (aamtVarF == null) {
                    aano aanoVar3 = new aano(aanp.c);
                    aanoVar3.d = 26;
                    return aanoVar3.a();
                }
                Object obj22 = this.c;
                aihf aihfVarCreateBuilder10 = aoen.a.createBuilder();
                aihfVarCreateBuilder10.copyOnWrite();
                aoen aoenVar = (aoen) aihfVarCreateBuilder10.instance;
                aoenVar.b |= 1;
                aoenVar.c = str3;
                aihfVarCreateBuilder10.copyOnWrite();
                aoen aoenVar2 = (aoen) aihfVarCreateBuilder10.instance;
                aoenVar2.e = 11;
                aoenVar2.b |= 4;
                aaewVarD.J(str3, (aoen) aihfVarCreateBuilder10.build());
                aohx aohxVarAn = aaewVarD.an(str3);
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aqpb.b);
                aihi aihiVar = (aihi) obj22;
                aihiVar.c(aihlVarCheckIsLite3);
                Object objK2 = aihiVar.j.k(aihlVarCheckIsLite3.d);
                aqpb aqpbVar = (aqpb) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                if ((aqpbVar.c & SemanticState.ReadOnly) != 0 ? aerjVarD.k(str3, aqpbVar.l, null, null, aohxVarAn, null, aakgVar.c.d(aohxVarAn), aamtVarF.o, 1, true, true, false, aamtVarF.k(), 1) : aerjVarD.j(str3, null, null, aohxVarAn, null, aakgVar.c.d(aohxVarAn), aamtVarF.o, 1, true, true, false, aamtVarF.k(), 1)) {
                    return aanp.a;
                }
                if (aakgVar.d.l(103, 45612064L, false)) {
                    aano aanoVar4 = new aano(aanp.b);
                    aanoVar4.d = 46;
                    return aanoVar4.a();
                }
                aano aanoVar5 = new aano(aanp.c);
                aanoVar5.d = 46;
                return aanoVar5.a();
            case 16:
                ?? r11 = this.a;
                aakg aakgVar2 = (aakg) this.b;
                aaqn aaqnVarB2 = aakgVar2.b.b();
                if (!r11.k().equals(aaqnVarB2.s())) {
                    aano aanoVar6 = new aano(aanp.b);
                    aanoVar6.d = 35;
                    return aanoVar6.a();
                }
                aaew aaewVarD2 = aaqnVarB2.d();
                if (aaewVarD2 == null) {
                    aano aanoVar7 = new aano(aanp.b);
                    aanoVar7.d = 15;
                    return aanoVar7.a();
                }
                aerj aerjVarD2 = aaqnVarB2 instanceof aado ? ((aado) aaqnVarB2).D() : null;
                if (aerjVarD2 == null) {
                    return aanp.a;
                }
                String str4 = (String) this.d;
                aamt aamtVarF2 = aaewVarD2.f(str4);
                if (aamtVarF2 == null) {
                    aano aanoVar8 = new aano(aanp.c);
                    aanoVar8.d = 26;
                    return aanoVar8.a();
                }
                if (aamtVarF2.c() && aamtVarF2.h()) {
                    return aanp.a;
                }
                Object obj23 = this.c;
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aqpb.b);
                aihi aihiVar2 = (aihi) obj23;
                aihiVar2.c(aihlVarCheckIsLite4);
                Object objK3 = aihiVar2.j.k(aihlVarCheckIsLite4.d);
                aqpb aqpbVar2 = (aqpb) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3));
                aohx aohxVarA = aohx.a(aqpbVar2.d);
                if (aohxVarA == null) {
                    aohxVarA = aohx.UNKNOWN_FORMAT_TYPE;
                }
                int iAU = a.aU(aqpbVar2.h);
                if (iAU == 0) {
                    iAU = 1;
                }
                String str5 = aqpbVar2.e;
                int i13 = aqpbVar2.c;
                int i14 = i13 & 8;
                if ((i13 & SemanticState.ReadOnly) != 0) {
                    String str6 = aqpbVar2.l;
                    String str7 = i14 != 0 ? aqpbVar2.g : null;
                    aodp aodpVarD = aakgVar2.c.d(aohxVarA);
                    aamn aamnVarD = aakg.d(aqpbVar2);
                    int i15 = iAU == 2 ? 1 : 0;
                    boolean zK = aamtVarF2.k();
                    int iAS = a.aS(aqpbVar2.j);
                    aerjVarD2.k(str4, str6, str7, null, aohxVarA, str5, aodpVarD, aamnVarD, i15, false, false, false, zK, iAS == 0 ? 1 : iAS);
                } else {
                    String str8 = i14 != 0 ? aqpbVar2.g : null;
                    aodp aodpVarD2 = aakgVar2.c.d(aohxVarA);
                    aamn aamnVarD2 = aakg.d(aqpbVar2);
                    int i16 = iAU == 2 ? 1 : 0;
                    boolean zK2 = aamtVarF2.k();
                    int iAS2 = a.aS(aqpbVar2.j);
                    aerjVarD2.j(str4, str8, null, aohxVarA, str5, aodpVarD2, aamnVarD2, i16, false, false, false, zK2, iAS2 == 0 ? 1 : iAS2);
                }
                return aanp.a;
            case 17:
                aakh aakhVar = (aakh) this.b;
                aanb aanbVar2 = aakhVar.b;
                ?? r12 = this.a;
                aaqn aaqnVarB3 = aanbVar2.b();
                if (!r12.k().equals(aaqnVarB3.s())) {
                    aano aanoVar9 = new aano(aanp.b);
                    aanoVar9.d = 35;
                    return aanoVar9.a();
                }
                aaew aaewVarD3 = aaqnVarB3.d();
                if (aaewVarD3 == null) {
                    aano aanoVar10 = new aano(aanp.b);
                    aanoVar10.d = 15;
                    return aanoVar10.a();
                }
                String str9 = (String) this.d;
                aamt aamtVarF3 = aaewVarD3.f(str9);
                if (aamtVarF3 == null) {
                    aano aanoVar11 = new aano(aanp.c);
                    aanoVar11.d = 26;
                    return aanoVar11.a();
                }
                Object obj24 = this.c;
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(areq.b);
                aihi aihiVar3 = (aihi) obj24;
                aihiVar3.c(aihlVarCheckIsLite5);
                Object objK4 = aihiVar3.j.k(aihlVarCheckIsLite5.d);
                areq areqVar = (areq) (objK4 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK4));
                if (aakhVar.a.u()) {
                    Instant instant = aamtVarF3.j;
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(areqVar.e);
                    agrx agrxVar = agso.a;
                    long j = aamtVarF3.i;
                    long j2 = areqVar.d;
                    if (instantOfEpochMilli.equals(instant) && j == areqVar.d) {
                        return aanp.a;
                    }
                    aaewVarD3.Z(str9, areqVar.d, instantOfEpochMilli);
                    aakhVar.d(str9);
                } else {
                    long j3 = aamtVarF3.i;
                    long j4 = areqVar.d;
                    if (j3 != j4) {
                        aaewVarD3.Q(str9, j4);
                        aakhVar.d(str9);
                    }
                }
                return aanp.a;
            case 18:
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aqpb.b);
                aihi aihiVar4 = (aihi) this.c;
                aihiVar4.c(aihlVarCheckIsLite6);
                Object objK5 = aihiVar4.j.k(aihlVarCheckIsLite6.d);
                Object objC = objK5 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK5);
                Object obj25 = this.d;
                Object obj26 = this.b;
                aqpb aqpbVar3 = (aqpb) objC;
                int i17 = aqpbVar3.k;
                int iAS3 = a.aS(i17);
                if (iAS3 == 0 || iAS3 != 2) {
                    int iAS4 = a.aS(i17);
                    if (iAS4 == 0 || iAS4 != 3) {
                        aakz aakzVar = (aakz) obj26;
                        wcn wcnVarB = aakzVar.a.b(this.a);
                        String str10 = (String) obj25;
                        aqph aqphVar = (aqph) wcnVarB.g(str10).g(aqph.class).E();
                        if (aqphVar == null || aqphVar.getTransferState() != aqpc.TRANSFER_STATE_WAITING_FOR_PLAYER_RESPONSE_REFRESH) {
                            return aanp.a;
                        }
                        aqpc aqpcVar = aqpbVar3.f ? aqpc.TRANSFER_STATE_FAILED : aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE;
                        aqpf aqpfVarD = aqphVar.d();
                        aqpfVarD.as(aqpcVar);
                        if (aqpcVar == aqpc.TRANSFER_STATE_FAILED) {
                            aqpfVarD.aq(aqpe.TRANSFER_FAILURE_REASON_PLAYABILITY);
                        }
                        try {
                            wer werVarE2 = wcnVarB.e();
                            werVarE2.m(aqpfVarD);
                            werVarE2.b().G();
                            if (aqpcVar == aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE) {
                                aakzVar.e.az(str10);
                            }
                            return aanp.a;
                        } catch (RuntimeException unused3) {
                            aano aanoVar12 = new aano(aanp.b);
                            aanoVar12.d = 5;
                            return aanoVar12.a();
                        }
                    }
                    ((aakz) obj26).e.ay((String) obj25);
                } else {
                    ((aakz) obj26).e.ax((String) obj25);
                }
                return aanp.a;
            case 19:
                aakz aakzVar2 = (aakz) this.b;
                wco wcoVar = aakzVar2.a;
                ?? r13 = this.a;
                Object obj27 = this.d;
                wcn wcnVarB2 = wcoVar.b(r13);
                String str11 = (String) obj27;
                aqph aqphVar2 = (aqph) wcnVarB2.g(str11).g(aqph.class).E();
                if (aqphVar2 == null) {
                    aano aanoVar13 = new aano(aanp.c);
                    aanoVar13.d = 26;
                    return aanoVar13.a();
                }
                wer werVarE3 = wcnVarB2.e();
                agke agkeVarE = aqphVar2.e();
                int i18 = ((agpi) agkeVarE).d;
                for (int i19 = 0; i19 < i18; i19++) {
                    aoho aohoVarD = ((aohq) agkeVarE.get(i19)).d();
                    aohoVarD.an();
                    werVarE3.m(aohoVarD);
                }
                Object obj28 = this.c;
                aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aqpb.b);
                aihi aihiVar5 = (aihi) obj28;
                aihiVar5.c(aihlVarCheckIsLite7);
                Object objK6 = aihiVar5.j.k(aihlVarCheckIsLite7.d);
                aqpb aqpbVar4 = (aqpb) (objK6 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK6));
                aqpf aqpfVar = new aqpf((aihh) aqphVar2.d.toBuilder());
                aqpfVar.as(aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE);
                aqpfVar.ap(aakz.d(aqpbVar4, aakzVar2.b));
                aqph aqphVarI = aqpfVar.I(wcnVarB2);
                aama aamaVar = new aama((wej) wcnVarB2.p(str11).E());
                abxv abxvVar = aakzVar2.d;
                long j5 = aarq.a;
                aamaVar.h("user_triggered", false);
                aamaVar.h("triggered_by_refresh", true);
                aamaVar.k("transfer_added_time_millis", abxvVar.a.f().toEpochMilli());
                aamaVar.l("transfer_nonce", aqphVarI.getCotn());
                aoop aoopVarE = abxv.e(wcnVarB2, aqphVarI.b());
                if (aoopVarE != null) {
                    abxv.f(aoopVarE, aamaVar);
                }
                werVarE3.f(aqphVarI, aamaVar.e());
                werVarE3.b().G();
                aohx aohxVarC = aaus.c(aamaVar.a("stream_quality"));
                aofb aofbVarA = aofb.a(aqpbVar4.i);
                if (aofbVarA == null) {
                    aofbVarA = aofb.OFFLINE_TYPE_UNKNOWN;
                }
                ((aalv) aakzVar2.c.io()).d(aakz.e(4, aohxVarC, aofbVarA, aqphVarI.getCotn(), aamaVar));
                aakzVar2.e.aw(str11);
                return aanp.a;
            default:
                java.util.Collection<aamt> collection = (java.util.Collection) ahng.v(this.b);
                agkj agkjVar = (agkj) ahng.v(this.c);
                agkz agkzVarN = agkz.n((java.util.Collection) ahng.v(this.d));
                agpr agprVar = agpr.a;
                agjz agjzVar2 = new agjz(4);
                for (aamt aamtVar : collection) {
                    Object obj29 = this.a;
                    aihf aihfVarCreateBuilder11 = aoei.a.createBuilder();
                    String strB = aamtVar.b();
                    aihfVarCreateBuilder11.copyOnWrite();
                    aoei aoeiVar = (aoei) aihfVarCreateBuilder11.instance;
                    strB.getClass();
                    aoeiVar.b |= 1;
                    aoeiVar.c = strB;
                    aals.c(aihfVarCreateBuilder11, aamtVar);
                    String strG = wfs.g(119, aamtVar.b());
                    String strG2 = wfs.g(120, aamtVar.b());
                    aihf aihfVarCreateBuilder12 = aoeh.a.createBuilder();
                    aihfVarCreateBuilder12.copyOnWrite();
                    aoeh aoehVar = (aoeh) aihfVarCreateBuilder12.instance;
                    int i20 = i4;
                    aoehVar.b |= 1;
                    aoehVar.c = true;
                    boolean zContains = agprVar.contains(strG);
                    aihfVarCreateBuilder12.copyOnWrite();
                    aoeh aoehVar2 = (aoeh) aihfVarCreateBuilder12.instance;
                    aoehVar2.b |= 2;
                    aoehVar2.d = zContains;
                    boolean zContains2 = agprVar.contains(strG2);
                    aihfVarCreateBuilder12.copyOnWrite();
                    aoeh aoehVar3 = (aoeh) aihfVarCreateBuilder12.instance;
                    aoehVar3.b |= 16;
                    aoehVar3.f = zContains2;
                    boolean zContains3 = agkzVarN.contains(wfs.g(((Integer) ((agfa) ((aals) obj29).c).a).intValue(), aamtVar.b()));
                    aihfVarCreateBuilder12.copyOnWrite();
                    aoeh aoehVar4 = (aoeh) aihfVarCreateBuilder12.instance;
                    aoehVar4.b |= SemanticState.LiveRegion;
                    aoehVar4.i = zContains3;
                    aihfVarCreateBuilder11.copyOnWrite();
                    aoei aoeiVar2 = (aoei) aihfVarCreateBuilder11.instance;
                    aoeh aoehVar5 = (aoeh) aihfVarCreateBuilder12.build();
                    aoehVar5.getClass();
                    aoeiVar2.u = aoehVar5;
                    aoeiVar2.b |= i20;
                    aodz aodzVar = (aodz) agkjVar.get(aamtVar.b());
                    if (aodzVar != null) {
                        aihfVarCreateBuilder11.copyOnWrite();
                        aoei aoeiVar3 = (aoei) aihfVarCreateBuilder11.instance;
                        aoeiVar3.t = aodzVar;
                        aoeiVar3.b |= 1048576;
                    }
                    agjzVar2.h((aoei) aihfVarCreateBuilder11.build());
                    i4 = i20;
                }
                return agjzVar2.g();
        }
    }

    public /* synthetic */ hlm(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, agkz agkzVar, ListenableFuture listenableFuture3, int i) {
        this.$cid = i;
        this.b = listenableFuture;
        this.c = listenableFuture2;
        this.a = agkzVar;
        this.d = listenableFuture3;
    }

    public /* synthetic */ hlm(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ hlm(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ hlm(Object obj, zwa zwaVar, String str, aofg aofgVar, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = zwaVar;
        this.d = str;
        this.c = aofgVar;
    }

    public /* synthetic */ hlm(nxl nxlVar, Context context, String str, Resources resources, int i) {
        this.$cid = i;
        this.c = nxlVar;
        this.a = context;
        this.d = str;
        this.b = resources;
    }

    public /* synthetic */ hlm(rgc rgcVar, java.util.Collection collection, java.util.Collection collection2, Duration duration, int i) {
        this.$cid = i;
        this.a = rgcVar;
        this.c = collection;
        this.d = collection2;
        this.b = duration;
    }

    public /* synthetic */ hlm(rlw rlwVar, Account account, Account account2, Comparator comparator, int i) {
        this.$cid = i;
        this.c = rlwVar;
        this.a = account;
        this.b = account2;
        this.d = comparator;
    }

    public /* synthetic */ hlm(ukz ukzVar, ListenableFuture listenableFuture, ula ulaVar, agjz agjzVar, int i) {
        this.$cid = i;
        this.a = ukzVar;
        this.d = listenableFuture;
        this.b = ulaVar;
        this.c = agjzVar;
    }
}
