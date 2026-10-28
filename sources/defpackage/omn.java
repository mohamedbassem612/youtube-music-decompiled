package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class omn {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public omn(awmd awmdVar, mbc mbcVar, awmd awmdVar2, tqj tqjVar, ayq ayqVar, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5) {
        this.f = awmdVar;
        this.h = mbcVar;
        this.e = awmdVar2;
        this.k = tqjVar;
        this.b = ayqVar;
        this.j = awmdVar3;
        this.i = awmdVar4;
        this.d = awmdVar5;
        this.g = aguu.al(new tpc(this, 4));
        this.c = aguu.al(new tpc(this, 5));
        this.a = aguu.al(new tpc(this, 6));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [agfr, java.lang.Object] */
    public final wll a() {
        return (wll) this.g.io();
    }

    public final ListenableFuture b() {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                Object obj = this.g;
                agfm agfmVar = qps.a;
                ((ayq) this.a).aa(rmp.G("*.lease", ((Context) obj).getPackageName(), 0L));
                ((ong) this.i).j(1077);
            } catch (qqf unused) {
                int i = onb.a;
            } catch (IOException e) {
                onb.g(e, "%s: Failed to release the leases in the android shared storage", "SharedFileManager");
                ((ong) this.i).j(1078);
            }
        }
        try {
            ((ayq) this.a).ae(qnl.ba((Context) this.g, (agev) this.e));
        } catch (IOException unused2) {
        }
        return aher.a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture c(oiz oizVar, String str, int i, long j, String str2, oiw oiwVar, oin oinVar, oiq oiqVar, oir oirVar, int i2, List list, aifv aifvVar) {
        return ahno.as(f(oizVar), new olv(this, oizVar, str, oinVar, oiqVar, oiwVar, i, j, str2, oirVar, i2, list, aifvVar, 1), this.b);
    }

    public final ListenableFuture d(oiz oizVar) {
        return ahno.ar(e(new agqj(oizVar)), new olj(oizVar, 17), MoreExecutors.directExecutor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, omb] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture e(agkz agkzVar) {
        return ooi.d(this.d.f(agkzVar)).f(new ols(this, agkzVar, 5, null), this.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, omb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture f(oiz oizVar) {
        return ahno.as(this.d.e(oizVar), new oll(oizVar, 8), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0069  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture g(final oiw oiwVar, final int i, final long j, final String str, final oin oinVar, final oiz oizVar, final oir oirVar, final int i2, final List list, final aifv aifvVar) {
        ListenableFuture listenableFutureN;
        String str2 = oinVar.d;
        int i3 = onb.a;
        if (oinVar.d.startsWith("inlinefile")) {
            acb acbVarA = oig.a();
            acbVarA.b = oif.INVALID_INLINE_FILE_URL_SCHEME;
            acbVarA.c = "downloading a file with an inlinefile scheme is not supported, use importFiles instead.";
            return ahng.m(acbVarA.a());
        }
        final ListenableFuture listenableFutureF = f(oizVar);
        int iAS = a.aS(oizVar.f);
        if (iAS == 0) {
            iAS = 1;
        }
        if (qnl.bT((Context) this.g, (qnl) this.f).d >= olg.USE_CHECKSUM_ONLY.d) {
            agev agevVar = (agev) this.c;
            if (!agevVar.g() || ((ojt) agevVar.c()).b() == 1) {
                listenableFutureN = ahng.n(null);
            } else {
                listenableFutureN = i(oinVar.l, 0, iAS);
            }
        } else {
            listenableFutureN = ahng.n(null);
        }
        final ListenableFuture listenableFuture = listenableFutureN;
        final ListenableFuture listenableFutureN2 = qnl.aK(listenableFutureF, listenableFuture).N(new ium((Object) listenableFutureF, listenableFuture, (Object) oinVar, 9), MoreExecutors.directExecutor());
        okx okxVar = new okx((Object) this, (Object) oizVar, (Object) oinVar, 14, (byte[]) null);
        ?? r2 = this.b;
        final ListenableFuture listenableFutureAs = ahno.as(listenableFutureN2, okxVar, r2);
        return ooi.d(qnl.aK(listenableFutureF, listenableFuture, listenableFutureN2, listenableFutureAs).O(new inq(3), MoreExecutors.directExecutor())).f(new ahcy() { // from class: olw
            /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.concurrent.Executor] */
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                ojb ojbVar = (ojb) ahng.v(listenableFutureF);
                final oiq oiqVar = (oiq) ahng.v(listenableFuture);
                final String str3 = (String) ahng.v(listenableFutureN2);
                final Uri uri = (Uri) ahng.v(listenableFutureAs);
                int i4 = ojbVar.d;
                final oin oinVar2 = oinVar;
                String str4 = oinVar2.d;
                int i5 = onb.a;
                int i6 = ojbVar.d;
                oiv oivVarA = oiv.a(i6);
                if (oivVarA == null) {
                    oivVarA = oiv.NONE;
                }
                final oiw oiwVar2 = oiwVar;
                final omn omnVar = this.o;
                if (oivVarA == oiv.DOWNLOAD_COMPLETE) {
                    agev agevVar2 = (agev) omnVar.k;
                    if (agevVar2.g()) {
                        ooe ooeVar = (ooe) agevVar2.c();
                        String str5 = oiwVar2.c;
                        long j2 = oinVar2.j;
                        if (j2 <= 0) {
                            j2 = oinVar2.e;
                        }
                        ooeVar.g(str5, j2);
                    }
                    return aher.a;
                }
                oiv oivVarA2 = oiv.a(i6);
                if (oivVarA2 == null) {
                    oivVarA2 = oiv.NONE;
                }
                final aifv aifvVar2 = aifvVar;
                final List list2 = list;
                final int i7 = i2;
                final oir oirVar2 = oirVar;
                final String str6 = str;
                final long j3 = j;
                final int i8 = i;
                final oiz oizVar2 = oizVar;
                if (oivVarA2 != oiv.DOWNLOAD_IN_PROGRESS) {
                    return omnVar.c(oizVar2, str3, i8, j3, str6, oiwVar2, oinVar2, oiqVar, oirVar2, i7, list2, aifvVar2);
                }
                Object obj2 = omnVar.j;
                String str7 = oizVar2.e;
                return ahno.as(((aesp) obj2).n(uri), new ahcy() { // from class: olz
                    @Override // defpackage.ahcy
                    public final ListenableFuture a(Object obj3) {
                        agev agevVar3 = (agev) obj3;
                        boolean zG = agevVar3.g();
                        omn omnVar2 = omnVar;
                        oiw oiwVar3 = oiwVar2;
                        if (zG) {
                            omnVar2.h(oiwVar3, uri);
                            return (ListenableFuture) agevVar3.c();
                        }
                        aifv aifvVar3 = aifvVar2;
                        List list3 = list2;
                        int i9 = i7;
                        oir oirVar3 = oirVar2;
                        oiq oiqVar2 = oiqVar;
                        oin oinVar3 = oinVar2;
                        String str8 = str6;
                        long j4 = j3;
                        int i10 = i8;
                        return omnVar2.c(oizVar2, str3, i10, j4, str8, oiwVar3, oinVar3, oiqVar2, oirVar3, i9, list3, aifvVar3);
                    }
                }, omnVar.b);
            }
        }, r2).c(oma.class, new ols(this, oizVar, 6), r2);
    }

    public final void h(oiw oiwVar, Uri uri) {
        Object obj = this.k;
        if (((agev) obj).g()) {
            try {
                long jV = ((ayq) this.a).V(uri);
                if (jV > 0) {
                    ((ooe) ((agev) obj).c()).g(oiwVar.c, jV);
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, omb] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture i(final List list, final int i, final int i2) {
        if (i == list.size()) {
            return ahng.n(null);
        }
        final oiq oiqVar = (oiq) list.get(i);
        int iAU = a.aU(oiqVar.f);
        if (iAU == 0) {
            iAU = 1;
        }
        if (iAU != ((ojt) ((agev) this.c).c()).b()) {
            return i(list, i + 1, i2);
        }
        aihf aihfVarCreateBuilder = oiz.a.createBuilder();
        oim oimVar = oiqVar.g;
        if (oimVar == null) {
            oimVar = oim.a;
        }
        String str = oimVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        oiz oizVar = (oiz) aihfVarCreateBuilder.instance;
        str.getClass();
        oizVar.b |= 4;
        oizVar.e = str;
        aihfVarCreateBuilder.copyOnWrite();
        oiz oizVar2 = (oiz) aihfVarCreateBuilder.instance;
        oizVar2.f = i2 - 1;
        oizVar2.b |= 8;
        final oiz oizVar3 = (oiz) aihfVarCreateBuilder.build();
        return ahno.as(this.d.e(oizVar3), new ahcy() { // from class: olx
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                omn omnVar = this.f;
                ojb ojbVar = (ojb) obj;
                if (ojbVar != null) {
                    oiv oivVarA = oiv.a(ojbVar.d);
                    if (oivVarA == null) {
                        oivVarA = oiv.NONE;
                    }
                    if (oivVarA == oiv.DOWNLOAD_COMPLETE) {
                        oiz oizVar4 = oizVar3;
                        Object obj2 = omnVar.g;
                        int iAS = a.aS(oizVar4.f);
                        if (qnl.bR((Context) obj2, iAS == 0 ? 1 : iAS, ojbVar.c, oizVar4.e, (qnl) omnVar.f, (agev) omnVar.e, false) != null) {
                            return ahng.n(oiqVar);
                        }
                    }
                }
                return omnVar.i(list, i + 1, i2);
            }
        }, this.b);
    }

    public final ListenableFuture j(int i, String str, String str2) {
        Uri uriBR = qnl.bR((Context) this.g, i, str, str2, (qnl) this.f, (agev) this.e, false);
        if (uriBR != null) {
            return ahng.n(uriBR);
        }
        onb.c("%s: Failed to get file uri!", "SharedFileManager");
        acb acbVarA = oig.a();
        acbVarA.b = oif.UNABLE_TO_CREATE_FILE_URI_ERROR;
        return ahng.m(acbVarA.a());
    }

    public final int k(Uri uri, List list) {
        int iK;
        try {
            Object obj = this.k;
            if (!((ayq) obj).ac(uri)) {
                return 0;
            }
            iK = 0;
            for (Uri uri2 : ((ayq) obj).W(uri)) {
                try {
                    try {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                if (!((ayq) obj).ad(uri2)) {
                                    uri2.getPath();
                                    int i = onb.a;
                                    ((ayq) obj).aa(uri2);
                                    iK++;
                                    break;
                                }
                                iK += k(uri2, list);
                                break;
                            }
                        } while (!uri2.toString().startsWith(((Uri) it.next()).toString()));
                    } catch (IOException e) {
                        ((ong) this.a).j(1059);
                        onb.g(e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            return iK;
        } catch (IOException e3) {
            e = e3;
            iK = 0;
        }
        ((ong) this.a).j(1059);
        onb.g(e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
        return iK;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [awmd, java.lang.Object] */
    public final hwj l(xgn xgnVar, View view, hwi hwiVar) {
        jnm jnmVar = (jnm) this.g.io();
        jnmVar.getClass();
        tfq tfqVar = (tfq) this.f.io();
        tfqVar.getClass();
        ycp ycpVar = (ycp) this.j.io();
        ycpVar.getClass();
        jin jinVar = (jin) this.d.io();
        jinVar.getClass();
        jij jijVar = (jij) this.e.io();
        jijVar.getClass();
        hbf hbfVar = (hbf) this.k.io();
        hbfVar.getClass();
        avmb avmbVar = (avmb) this.b.io();
        avmbVar.getClass();
        ?? Io = this.i.io();
        Io.getClass();
        ?? Io2 = this.c.io();
        Io2.getClass();
        ?? Io3 = this.h.io();
        Io3.getClass();
        vxz vxzVar = (vxz) this.a.io();
        vxzVar.getClass();
        xgnVar.getClass();
        view.getClass();
        return new hwj(jnmVar, tfqVar, ycpVar, jinVar, jijVar, hbfVar, avmbVar, Io, Io2, Io3, vxzVar, xgnVar, view, hwiVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    public final xll m(may mayVar) {
        Context context = (Context) this.g.io();
        context.getClass();
        xql xqlVar = (xql) this.d.io();
        xqlVar.getClass();
        avmb avmbVar = (avmb) this.f.io();
        avmbVar.getClass();
        avmb avmbVar2 = (avmb) this.c.io();
        avmbVar2.getClass();
        hfn hfnVar = (hfn) this.j.io();
        hfnVar.getClass();
        vxe vxeVar = (vxe) this.k.io();
        vxeVar.getClass();
        xsc xscVar = (xsc) this.b.io();
        xscVar.getClass();
        xpn xpnVar = (xpn) this.h.io();
        xpnVar.getClass();
        xpq xpqVar = (xpq) this.e.io();
        xpqVar.getClass();
        vxz vxzVar = (vxz) this.i.io();
        vxzVar.getClass();
        return new xll(mayVar, context, xqlVar, avmbVar, avmbVar2, this.a, hfnVar, vxeVar, xscVar, xpnVar, xpqVar, vxzVar);
    }

    public omn(Context context, qnl qnlVar, omb ombVar, ayq ayqVar, aesp aespVar, agev agevVar, agev agevVar2, ong ongVar, oii oiiVar, agev agevVar3, Executor executor) {
        this.g = context;
        this.f = qnlVar;
        this.d = ombVar;
        this.a = ayqVar;
        this.j = aespVar;
        this.c = agevVar;
        this.k = agevVar2;
        this.i = ongVar;
        this.h = oiiVar;
        this.e = agevVar3;
        this.b = executor;
    }

    public omn(ayq ayqVar, ooh oohVar, ong ongVar, agev agevVar, agev agevVar2, agev agevVar3, agev agevVar4, agev agevVar5, oii oiiVar, agev agevVar6, agev agevVar7) {
        this.a = ayqVar;
        this.b = oohVar;
        this.k = ongVar;
        this.c = agevVar;
        this.d = agevVar2;
        this.e = agevVar3;
        this.f = agevVar4;
        this.g = agevVar5;
        this.h = oiiVar;
        this.i = agevVar6;
        this.j = agevVar7;
    }

    public omn(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11) {
        this.g = awmdVar;
        this.f = awmdVar2;
        awmdVar3.getClass();
        this.j = awmdVar3;
        awmdVar4.getClass();
        this.d = awmdVar4;
        this.e = awmdVar5;
        this.k = awmdVar6;
        awmdVar7.getClass();
        this.b = awmdVar7;
        this.i = awmdVar8;
        this.c = awmdVar9;
        this.h = awmdVar10;
        awmdVar11.getClass();
        this.a = awmdVar11;
    }

    public omn(Context context, ola olaVar, omn omnVar, omb ombVar, ong ongVar, omj omjVar, ayq ayqVar, agev agevVar, qnl qnlVar, Executor executor, oii oiiVar) {
        this.g = context;
        this.j = olaVar;
        this.i = omnVar;
        this.f = ombVar;
        this.a = ongVar;
        this.d = omjVar;
        this.k = ayqVar;
        this.e = agevVar;
        this.c = qnlVar;
        this.b = executor;
        this.h = oiiVar;
    }

    public omn(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.g = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        awmdVar3.getClass();
        this.f = awmdVar3;
        awmdVar4.getClass();
        this.c = awmdVar4;
        this.a = awmdVar5;
        this.j = awmdVar6;
        awmdVar7.getClass();
        this.k = awmdVar7;
        this.b = awmdVar8;
        awmdVar9.getClass();
        this.h = awmdVar9;
        this.e = awmdVar10;
        this.i = awmdVar11;
    }

    public omn(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, byte[] bArr) {
        awmdVar.getClass();
        this.e = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.i = awmdVar3;
        awmdVar4.getClass();
        this.g = awmdVar4;
        awmdVar5.getClass();
        this.k = awmdVar5;
        awmdVar6.getClass();
        this.j = awmdVar6;
        awmdVar7.getClass();
        this.c = awmdVar7;
        this.h = awmdVar8;
        awmdVar9.getClass();
        this.d = awmdVar9;
        awmdVar10.getClass();
        this.b = awmdVar10;
        awmdVar11.getClass();
        this.f = awmdVar11;
    }
}
