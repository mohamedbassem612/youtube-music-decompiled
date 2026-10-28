package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import j$.time.ZoneId;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rrq {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public rrq(Executor executor, ayq ayqVar, qsb qsbVar, Map map) {
        this.a = new ConcurrentHashMap();
        executor.getClass();
        this.b = executor;
        ayqVar.getClass();
        this.d = ayqVar;
        this.c = qsbVar;
        this.f = map;
        if (map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.e = new hqn(9);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, mbc] */
    public final aihf a(ListenableFuture listenableFuture, ListenableFuture listenableFuture2) {
        aihf aihfVarCreateBuilder = ajfh.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aqif.a.createBuilder();
        vbz vbzVar = (vbz) taf.f(listenableFuture2, null);
        if (vbzVar != null) {
            String str = vbzVar.f;
            if (str != null) {
                aihfVarCreateBuilder2.copyOnWrite();
                aqif aqifVar = (aqif) aihfVarCreateBuilder2.instance;
                aqifVar.b |= 131072;
                aqifVar.q = str;
            }
            String str2 = vbzVar.e;
            if (str2 != null) {
                aihfVarCreateBuilder2.copyOnWrite();
                aqif aqifVar2 = (aqif) aihfVarCreateBuilder2.instance;
                aqifVar2.b |= 262144;
                aqifVar2.r = str2;
            }
        }
        ((aepv) this.d).h(aihfVarCreateBuilder2);
        aihfVarCreateBuilder.copyOnWrite();
        ajfh ajfhVar = (ajfh) aihfVarCreateBuilder.instance;
        aqif aqifVar3 = (aqif) aihfVarCreateBuilder2.build();
        aqifVar3.getClass();
        ajfhVar.c = aqifVar3;
        ajfhVar.b |= 1;
        agke agkeVar = (agke) taf.f(listenableFuture, agpi.a);
        if (!agkeVar.isEmpty()) {
            int size = agkeVar.size();
            long j = 0;
            long j2 = 0;
            for (int i = 0; i < size; i++) {
                ajfe ajfeVar = (ajfe) agkeVar.get(i);
                aihfVarCreateBuilder.copyOnWrite();
                ajfh ajfhVar2 = (ajfh) aihfVarCreateBuilder.instance;
                ajfeVar.getClass();
                aiie aiieVar = ajfhVar2.d;
                if (!aiieVar.c()) {
                    ajfhVar2.d = aihn.mutableCopy(aiieVar);
                }
                ajfhVar2.d.add(ajfeVar);
                j += (long) ajfeVar.c;
                j2 += (long) ajfeVar.d;
            }
            aihfVarCreateBuilder.copyOnWrite();
            ajfh ajfhVar3 = (ajfh) aihfVarCreateBuilder.instance;
            ajfhVar3.b |= 4;
            ajfhVar3.e = j;
            aihfVarCreateBuilder.copyOnWrite();
            ajfh ajfhVar4 = (ajfh) aihfVarCreateBuilder.instance;
            ajfhVar4.b |= 8;
            ajfhVar4.f = j2;
        }
        if (((vxz) this.e).l(11, 45637503L, false)) {
            aihf aihfVarCreateBuilder3 = ajfg.a.createBuilder();
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            String id = zoneIdSystemDefault.getId();
            long totalSeconds = zoneIdSystemDefault.getRules().getOffset(this.a.f()).getTotalSeconds();
            aihfVarCreateBuilder3.copyOnWrite();
            ajfg ajfgVar = (ajfg) aihfVarCreateBuilder3.instance;
            ajfgVar.b |= 1;
            ajfgVar.c = totalSeconds;
            if (!id.isEmpty() && !id.startsWith("-") && !id.startsWith("+")) {
                aihf aihfVarCreateBuilder4 = ajff.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                ajff ajffVar = (ajff) aihfVarCreateBuilder4.instance;
                id.getClass();
                ajffVar.b |= 1;
                ajffVar.c = id;
                aihfVarCreateBuilder3.copyOnWrite();
                ajfg ajfgVar2 = (ajfg) aihfVarCreateBuilder3.instance;
                ajff ajffVar2 = (ajff) aihfVarCreateBuilder4.build();
                ajffVar2.getClass();
                ajfgVar2.d = ajffVar2;
                ajfgVar2.b |= 2;
            }
            aihfVarCreateBuilder.copyOnWrite();
            ajfh ajfhVar5 = (ajfh) aihfVarCreateBuilder.instance;
            ajfg ajfgVar3 = (ajfg) aihfVarCreateBuilder3.build();
            ajfgVar3.getClass();
            ajfhVar5.g = ajfgVar3;
            ajfhVar5.b |= 64;
        }
        return aihfVarCreateBuilder;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, rmu] */
    public final boolean b() {
        ?? r1 = this.a;
        if (r1.u()) {
            r1.e();
            if (r1.e().i().equals("")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v6, types: [ahcy, java.lang.Object] */
    public final qrx c(qrm qrmVar) {
        ?? r0 = this.a;
        Uri uri = qrmVar.a;
        Pair pairCreate = (Pair) r0.get(uri);
        if (pairCreate == null) {
            ahno.K(uri.isHierarchical(), "Uri must be hierarchical: %s", uri);
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = "";
            }
            int iLastIndexOf = lastPathSegment.lastIndexOf(46);
            ahno.K((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri);
            if (qrmVar.b == null) {
                throw new IllegalArgumentException("Proto schema cannot be null");
            }
            if (qrmVar.c == null) {
                throw new IllegalArgumentException("Handler cannot be null");
            }
            qrz qrzVar = (qrz) this.f.get("singleproc");
            ahno.K(qrzVar != 0, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
            String lastPathSegment2 = uri.getLastPathSegment();
            String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
            int iLastIndexOf2 = strSubstring.lastIndexOf(46);
            if (iLastIndexOf2 != -1) {
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            ListenableFuture aherVar = uri == null ? aher.a : new aher(uri);
            ?? r7 = this.e;
            Executor executorDirectExecutor = MoreExecutors.directExecutor();
            int i = ahcs.c;
            ahcq ahcqVar = new ahcq(aherVar, r7);
            aherVar.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
            ?? r6 = this.b;
            qry qryVarB = qrzVar.b(qrmVar, strSubstring, r6, (ayq) this.d);
            qrzVar.a();
            qrx qrxVar = new qrx(qryVarB, ahcqVar, false);
            agke agkeVar = qrmVar.d;
            if (!agkeVar.isEmpty()) {
                qrxVar.b(new qrk(agkeVar, r6));
            }
            pairCreate = Pair.create(qrxVar, qrmVar);
            Pair pair = (Pair) r0.putIfAbsent(uri, pairCreate);
            if (pair != null) {
                pairCreate = pair;
            }
        }
        qrx qrxVar2 = (qrx) pairCreate.first;
        qrm qrmVar2 = (qrm) pairCreate.second;
        if (qrmVar.equals(qrmVar2)) {
            return qrxVar2;
        }
        MessageLite messageLite = qrmVar.b;
        String strE = ahno.E("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", messageLite.getClass().getSimpleName(), uri);
        ahno.K(uri.equals(qrmVar2.a), strE, "uri");
        ahno.K(messageLite.equals(qrmVar2.b), strE, "schema");
        ahno.K(qrmVar.c.equals(qrmVar2.c), strE, "handler");
        ahno.K(aguu.v(qrmVar.d, qrmVar2.d), strE, "migrations");
        ahno.K(qrmVar.f.equals(qrmVar2.f), strE, "variantConfig");
        ahno.K(qrmVar.e == qrmVar2.e, strE, "useGeneratedExtensionRegistry");
        throw new IllegalArgumentException(ahno.E(strE, "unknown"));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final boolean d() {
        return !this.b.isEmpty();
    }

    public rrq(qpm qpmVar) {
        this.e = qpmVar.a;
        this.f = qpmVar.b;
        this.b = qpmVar.c;
        this.a = qpmVar.d;
        this.c = qpmVar.e;
        this.d = qpmVar.f;
    }

    public rrq(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6) {
        awmdVar.getClass();
        this.f = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
        awmdVar5.getClass();
        this.a = awmdVar5;
        awmdVar6.getClass();
        this.e = awmdVar6;
    }

    public rrq(oml omlVar, ahey aheyVar, Random random, awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        this.f = omlVar;
        this.a = aheyVar;
        this.b = random;
        this.c = awmdVar;
        this.e = awmdVar2;
        this.d = awmdVar3;
    }

    public rrq(rmu rmuVar, rmw rmwVar, wnw wnwVar, tbt tbtVar, Executor executor, rre rreVar, rqa rqaVar) {
        rmuVar.getClass();
        this.a = rmuVar;
        rmwVar.getClass();
        this.b = rmwVar;
        wnwVar.getClass();
        this.d = wnwVar;
        tbtVar.getClass();
        executor.getClass();
        this.f = executor;
        rreVar.getClass();
        this.c = rreVar;
        rqaVar.getClass();
        this.e = rqaVar;
    }

    public rrq(mbc mbcVar, rrh rrhVar, xeu xeuVar, vxz vxzVar, rrt rrtVar, aepv aepvVar, avmb avmbVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = mbcVar;
        this.b = rrhVar;
        this.c = xeuVar;
        this.e = vxzVar;
        this.d = aepvVar;
        this.f = scheduledExecutorService;
        if (vxzVar.l(0, 45371409L, false)) {
            rrtVar.a.L(avmbVar).ak(new rlb(this, 3));
        }
    }
}
