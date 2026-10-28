package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cmy implements cnu {
    public dbl a;
    private final cmx d;
    private final byd e;
    private boolean f;
    private boolean g;
    private final boolean h;

    public cmy(byd bydVar, cvl cvlVar) {
        dbk dbkVar = new dbk(1);
        this.e = bydVar;
        this.a = dbkVar;
        cmx cmxVar = new cmx(cvlVar, dbkVar);
        this.d = cmxVar;
        if (bydVar != cmxVar.d) {
            cmxVar.d = bydVar;
            cmxVar.b.clear();
            cmxVar.c.clear();
        }
        this.f = true;
        this.g = true;
        this.h = bsc.c(5);
    }

    public static cnl b(Class cls, byd bydVar) {
        try {
            return (cnl) cls.getConstructor(byd.class).newInstance(bydVar);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.cnl
    public final cno a(bss bssVar) {
        cmw cmwVar;
        bsp bspVar = bssVar.c;
        bspVar.getClass();
        Uri uri = bspVar.a;
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        String str = bspVar.b;
        if (Objects.equals(str, "application/x-image-uri")) {
            long j = bspVar.i;
            int i = bwp.a;
            throw null;
        }
        int iR = bwp.r(uri, str);
        if (bspVar.i != -9223372036854775807L) {
            cve cveVar = (cve) this.d.a;
            cveVar.e();
            cveVar.d();
        }
        try {
            cmx cmxVar = this.d;
            Map map = cmxVar.c;
            Integer numValueOf = Integer.valueOf(iR);
            cnl cnlVar = (cnl) map.get(numValueOf);
            int i2 = 0;
            if (cnlVar == null) {
                Map map2 = cmxVar.b;
                agfr cmwVar2 = (agfr) map2.get(numValueOf);
                if (cmwVar2 == null) {
                    byd bydVar = cmxVar.d;
                    bydVar.getClass();
                    if (iR != 0) {
                        if (iR == 1) {
                            cmwVar = new cmw(Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(cnl.class), bydVar, 0);
                        } else if (iR != 2) {
                            cmwVar2 = iR != 3 ? new cmw(cmxVar, bydVar, 3) : new cbq(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(cnl.class), 9);
                        } else {
                            cmwVar2 = new cmw(Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(cnl.class), bydVar, 2);
                        }
                        map2.put(numValueOf, cmwVar2);
                    } else {
                        cmwVar = new cmw(Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(cnl.class), bydVar, 1);
                    }
                    cmwVar2 = cmwVar;
                    map2.put(numValueOf, cmwVar2);
                }
                cnlVar = (cnl) cmwVar2.io();
                cnlVar.d(cmxVar.f);
                cnlVar.c(cmxVar.e);
                map.put(numValueOf, cnlVar);
            }
            bso bsoVar = bssVar.d;
            bsn bsnVar = new bsn(bsoVar);
            if (bsoVar.a == -9223372036854775807L) {
                bsnVar.a = -9223372036854775807L;
            }
            if (bsoVar.d == -3.4028235E38f) {
                bsnVar.d = -3.4028235E38f;
            }
            if (bsoVar.e == -3.4028235E38f) {
                bsnVar.e = -3.4028235E38f;
            }
            if (bsoVar.b == -9223372036854775807L) {
                bsnVar.b = -9223372036854775807L;
            }
            if (bsoVar.c == -9223372036854775807L) {
                bsnVar.c = -9223372036854775807L;
            }
            bso bsoVar2 = new bso(bsnVar);
            if (!bsoVar2.equals(bsoVar)) {
                bsi bsiVar = new bsi(bssVar);
                bsiVar.e = new bsn(bsoVar2);
                bssVar = bsiVar.a();
            }
            cno cnoVarA = cnlVar.a(bssVar);
            bsp bspVar2 = bssVar.c;
            agke agkeVar = bspVar2.g;
            if (!agkeVar.isEmpty()) {
                if (this.f) {
                    int i3 = ((agpi) agkeVar).d;
                    cno[] cnoVarArr = new cno[i3];
                    if (i3 > 0) {
                        bsd bsdVar = new bsd();
                        String str2 = ((bsr) agkeVar.get(0)).b;
                        bsdVar.e(null);
                        String str3 = ((bsr) agkeVar.get(0)).c;
                        bsdVar.d = null;
                        int i4 = ((bsr) agkeVar.get(0)).d;
                        bsdVar.e = 0;
                        int i5 = ((bsr) agkeVar.get(0)).e;
                        bsdVar.f = 0;
                        String str4 = ((bsr) agkeVar.get(0)).f;
                        bsdVar.b = null;
                        String str5 = ((bsr) agkeVar.get(0)).g;
                        bsdVar.a = null;
                        final bse bseVar = new bse(bsdVar);
                        coi coiVar = new coi(this.e, new cvl() { // from class: cmv
                            @Override // defpackage.cvl
                            public final /* synthetic */ cvi[] a(Uri uri2, Map map3) {
                                cmy cmyVar = this.a;
                                cvi[] cviVarArr = new cvi[1];
                                dbl dblVar = cmyVar.a;
                                bse bseVar2 = bseVar;
                                cviVarArr[0] = dblVar.c(bseVar2) ? new dbh(cmyVar.a.b(bseVar2), null) : new cwx(bseVar2, 1);
                                return cviVarArr;
                            }
                        });
                        if (this.a.c(bseVar)) {
                            bsd bsdVar2 = new bsd(bseVar);
                            bsdVar2.e("application/x-media3-cues");
                            bsdVar2.k = bseVar.q;
                            bsdVar2.N = this.a.a(bseVar);
                            bseVar = new bse(bsdVar2);
                        }
                        coiVar.a = bseVar;
                        coiVar.d = this.g;
                        Uri uri2 = ((bsr) agkeVar.get(0)).a;
                        throw null;
                    }
                    cnoVarA = new cos(cnoVarA, agkeVar, cnoVarArr);
                } else {
                    int i6 = ((agpi) agkeVar).d;
                    cno[] cnoVarArr2 = new cno[i6 + 1];
                    cnoVarArr2[0] = cnoVarA;
                    while (i2 < i6) {
                        this.e.getClass();
                        int i7 = i2 + 1;
                        cnoVarArr2[i7] = new cou((bsr) agkeVar.get(i2));
                        i2 = i7;
                    }
                    cnoVarA = new cny(cnoVarArr2);
                }
            }
            boolean z = this.h;
            bsk bskVar = bssVar.f;
            if (bskVar.a != 0 || bskVar.b != Long.MIN_VALUE) {
                cmm cmmVar = new cmm(cnoVarA);
                ahno.O(!cmmVar.d);
                cmmVar.b = new bsj(bskVar);
                ahno.O(!cmmVar.d);
                cmmVar.c = z;
                cmmVar.d = true;
                cnoVarA = new cmp(cmmVar);
            }
            bspVar2.getClass();
            bsh bshVar = bspVar2.d;
            return cnoVarA;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.cnl
    @Deprecated
    public final /* bridge */ /* synthetic */ void c(boolean z) {
        this.f = z;
        cmx cmxVar = this.d;
        cmxVar.e = z;
        ((cve) cmxVar.a).b(z);
        Iterator it = cmxVar.c.values().iterator();
        while (it.hasNext()) {
            ((cnl) it.next()).c(z);
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void d(dbl dblVar) {
        dblVar.getClass();
        this.a = dblVar;
        cmx cmxVar = this.d;
        cmxVar.f = dblVar;
        ((cve) cmxVar.a).g(dblVar);
        Iterator it = cmxVar.c.values().iterator();
        while (it.hasNext()) {
            ((cnl) it.next()).d(dblVar);
        }
    }

    public final void e(boolean z) {
        this.g = z;
        this.d.g = z;
    }
}
