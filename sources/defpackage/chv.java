package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class chv implements crk {
    final /* synthetic */ chz a;

    public chv(chz chzVar) {
        this.a = chzVar;
    }

    @Override // defpackage.crk
    public final /* bridge */ /* synthetic */ void gq(crm crmVar, long j, long j2, boolean z) {
        this.a.f((crs) crmVar, j, j2);
    }

    @Override // defpackage.crk
    public final /* bridge */ /* synthetic */ void gr(crm crmVar, long j, long j2, int i) {
        crs crsVar = (crs) crmVar;
        cnc cncVar = new cnc(crsVar.a, crsVar.b, j);
        if (i != 0) {
            cncVar.d = crsVar.d();
            cncVar.e = crsVar.e();
            cncVar.f = j2;
            cncVar.g = crsVar.c();
        }
        chz chzVar = this.a;
        chzVar.w.l(new cnd(cncVar), crsVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.crk
    public final /* synthetic */ yvt gs(crm crmVar, long j, long j2, IOException iOException, int i) {
        int size;
        int i2;
        cis cisVar;
        crs crsVar = (crs) crmVar;
        cnc cncVar = new cnc(crsVar.a, crsVar.b, j);
        cncVar.d = crsVar.d();
        cncVar.e = crsVar.e();
        cncVar.f = j2;
        cncVar.g = crsVar.c();
        cnd cndVar = new cnd(cncVar);
        int i3 = crsVar.c;
        aae aaeVar = new aae(cndVar, iOException, i);
        chz chzVar = this.a;
        synchronized (chzVar.c) {
            size = chzVar.f.size();
            agqs agqsVarListIterator = chzVar.f.listIterator(0);
            i2 = 0;
            while (agqsVarListIterator.hasNext()) {
                Long l = (Long) chzVar.e.get(((cis) agqsVarListIterator.next()).b);
                if (l != null && l.longValue() > j) {
                    i2++;
                }
            }
        }
        yvt yvtVarD = chzVar.b.d(new cri(size, i2, 1, 0, chzVar.q()), aaeVar);
        if (yvtVarD != null && yvtVarD.b == 1) {
            Uri uri = crsVar.b.a;
            synchronized (chzVar.c) {
                agqs agqsVarListIterator2 = chzVar.f.listIterator(0);
                do {
                    if (!agqsVarListIterator2.hasNext()) {
                        cisVar = null;
                        break;
                    }
                    cisVar = (cis) agqsVarListIterator2.next();
                } while (!uri.equals(cisVar.a));
                if (cisVar != null) {
                    chzVar.e.put(cisVar.b, Long.valueOf(j + yvtVarD.a));
                }
            }
            if (cisVar != null) {
                chzVar.n(0L);
                chzVar.w.j(cndVar, crsVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                long j3 = crsVar.a;
                return crp.d;
            }
        }
        crj crjVar = chzVar.b;
        int i4 = crsVar.c;
        long jC = i > crjVar.a(i4) ? -9223372036854775807L : crjVar.c(aaeVar);
        yvt yvtVar = jC == -9223372036854775807L ? crp.e : new yvt(0, jC);
        boolean zC = yvtVar.c();
        chzVar.w.j(cndVar, i4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !zC);
        if (zC) {
            return yvtVar;
        }
        long j4 = crsVar.a;
        return yvtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.crk
    public final /* synthetic */ void gv(crm crmVar, long j, long j2) {
        long j3;
        cin cinVar;
        agke agkeVar;
        int i;
        crs crsVar = (crs) crmVar;
        long j4 = crsVar.a;
        byi byiVar = crsVar.b;
        cnc cncVar = new cnc(j4, byiVar, j);
        cncVar.d = crsVar.d();
        cncVar.e = crsVar.e();
        cncVar.f = j2;
        cncVar.g = crsVar.c();
        cnd cndVar = new cnd(cncVar);
        int i2 = crsVar.c;
        chz chzVar = this.a;
        chzVar.w.h(cndVar, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        cio cioVar = (cio) crsVar.d;
        cio cioVar2 = chzVar.n;
        int iA = cioVar2 == null ? 0 : cioVar2.a();
        long j5 = cioVar.d(0).a;
        int i3 = 0;
        while (i3 < iA && chzVar.n.d(i3).a < j5) {
            i3++;
        }
        if (cioVar.d) {
            if (iA - i3 > cioVar.a()) {
                bvx.e("DashMediaSource", "Loaded out of sync manifest");
            } else {
                j3 = -9223372036854775807L;
                long j6 = chzVar.t;
                if (j6 != -9223372036854775807L) {
                    long j7 = cioVar.h;
                    if (1000 * j7 <= j6) {
                        bvx.e("DashMediaSource", a.cr(j6, j7, "Loaded stale dynamic manifest: ", ", "));
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
                chzVar.s = i;
            }
            crj crjVar = chzVar.b;
            int i4 = chzVar.s;
            chzVar.s = i4 + 1;
            if (i4 < crjVar.a(i2)) {
                chzVar.n(Math.min(i4 * 1000, 5000));
                return;
            } else {
                chzVar.l = new chq();
                return;
            }
        }
        j3 = -9223372036854775807L;
        chzVar.n = cioVar;
        chzVar.o &= chzVar.n.d;
        chzVar.p = j - j2;
        chzVar.q = j;
        chzVar.u += i3;
        Uri uri = byiVar.a;
        synchronized (chzVar.c) {
            agqs agqsVarListIterator = chzVar.f.listIterator(0);
            while (agqsVarListIterator.hasNext()) {
                if (uri.equals(((cis) agqsVarListIterator.next()).a)) {
                    agke agkeVar2 = cioVar.l;
                    if (!agkeVar2.isEmpty()) {
                        chzVar.f = agkeVar2;
                        break;
                    }
                    Uri uriD = crsVar.d();
                    int i5 = cre.a;
                    if (uriD.isHierarchical() && uriD.getQueryParameter("CMCD") != null) {
                        Uri.Builder builderBuildUpon = uriD.buildUpon();
                        builderBuildUpon.clearQuery();
                        for (String str : uriD.getQueryParameterNames()) {
                            if (!str.equals("CMCD")) {
                                Iterator<String> it = uriD.getQueryParameters(str).iterator();
                                while (it.hasNext()) {
                                    builderBuildUpon.appendQueryParameter(str, it.next());
                                }
                            }
                        }
                        uriD = builderBuildUpon.build();
                    }
                    chzVar.f = agke.q(new cis(uriD));
                    break;
                }
            }
        }
        cio cioVar3 = chzVar.n;
        if (chzVar.v == null && (cinVar = cioVar3.m) != null) {
            chzVar.v = new crw(chzVar.a, new qcb(chzVar), chzVar.k, cioVar3);
            chzVar.i = new chx(chzVar, 0);
            chzVar.v.d(chzVar.i);
            crw crwVar = chzVar.v;
            aae aaeVar = chzVar.w;
            ahno.O(!crwVar.c);
            int i6 = 0;
            while (true) {
                agkeVar = cinVar.b;
                if (i6 >= ((agpi) agkeVar).d) {
                    break;
                }
                String str2 = (String) agkeVar.get(i6);
                ahno.P(crwVar.f(str2), a.bT(str2, "The pathway with ID: ", " is not available"));
                i6++;
            }
            crwVar.c = true;
            crwVar.i = agkeVar;
            if (!agkeVar.isEmpty()) {
                crwVar.j.H(agkeVar);
            }
            Uri uri2 = cinVar.a;
            csf csfVar = crwVar.a;
            qcb qcbVar = new qcb(crwVar);
            csfVar.b = uri2;
            csfVar.h = qcbVar;
            csfVar.g = aaeVar;
            csfVar.d = csfVar.a.d(bwp.I(), null);
            csfVar.e = new crp("SteeringManifestTracker");
            csfVar.f = true;
            csfVar.b();
        }
        cio cioVar4 = chzVar.n;
        if (!cioVar4.d || chzVar.r != j3) {
            chzVar.j(true);
            return;
        }
        cjh cjhVar = cioVar4.i;
        if (cjhVar == null) {
            chzVar.d();
            return;
        }
        String str3 = cjhVar.a;
        if (Objects.equals(str3, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str3, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                chzVar.h(bwp.A(cjhVar.b) - chzVar.q);
                return;
            } catch (bsz e) {
                chzVar.g(e);
                return;
            }
        }
        if (Objects.equals(str3, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str3, "urn:mpeg:dash:utc:http-iso:2012")) {
            chzVar.m(cjhVar, new chu());
            return;
        }
        if (Objects.equals(str3, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str3, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            chzVar.m(cjhVar, new chy());
        } else if (Objects.equals(str3, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str3, "urn:mpeg:dash:utc:ntp:2012")) {
            chzVar.d();
        } else {
            chzVar.g(new IOException("Unsupported UTC timing scheme"));
        }
    }
}
