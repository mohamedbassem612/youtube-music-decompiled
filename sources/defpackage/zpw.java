package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.widget.FrameLayout;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zpw {
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
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    public zpw(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, awmd awmdVar14, awmd awmdVar15, byte[] bArr) {
        awmdVar.getClass();
        this.k = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        awmdVar3.getClass();
        this.i = awmdVar3;
        awmdVar4.getClass();
        this.n = awmdVar4;
        awmdVar5.getClass();
        this.e = awmdVar5;
        awmdVar6.getClass();
        this.j = awmdVar6;
        awmdVar7.getClass();
        this.f = awmdVar7;
        awmdVar8.getClass();
        this.h = awmdVar8;
        awmdVar9.getClass();
        this.o = awmdVar9;
        awmdVar10.getClass();
        this.l = awmdVar10;
        awmdVar11.getClass();
        this.a = awmdVar11;
        awmdVar12.getClass();
        this.g = awmdVar12;
        awmdVar13.getClass();
        this.c = awmdVar13;
        awmdVar14.getClass();
        this.m = awmdVar14;
        awmdVar15.getClass();
        this.b = awmdVar15;
    }

    public static oho c(String str, long j, long j2, String str2, aifv aifvVar, boolean z, String str3) {
        aihh aihhVar = (aihh) oho.a.createBuilder();
        aihhVar.copyOnWrite();
        oho ohoVar = (oho) aihhVar.instance;
        str.getClass();
        ohoVar.b |= 1;
        ohoVar.c = str;
        aihhVar.copyOnWrite();
        oho ohoVar2 = (oho) aihhVar.instance;
        ohoVar2.b |= 4;
        ohoVar2.e = (int) j;
        aihhVar.copyOnWrite();
        oho ohoVar3 = (oho) aihhVar.instance;
        ohoVar3.b |= 32;
        ohoVar3.h = z;
        aihhVar.copyOnWrite();
        oho ohoVar4 = (oho) aihhVar.instance;
        str3.getClass();
        ohoVar4.b |= 64;
        ohoVar4.i = str3;
        if (j2 > 0) {
            aihhVar.copyOnWrite();
            oho ohoVar5 = (oho) aihhVar.instance;
            ohoVar5.b |= 8;
            ohoVar5.f = (int) j2;
        }
        if (j > 2147483647L || j2 > 2147483647L) {
            aihl aihlVar = ohq.b;
            aihf aihfVarCreateBuilder = ohq.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ohq ohqVar = (ohq) aihfVarCreateBuilder.instance;
            ohqVar.c |= 1;
            ohqVar.d = j;
            aihfVarCreateBuilder.copyOnWrite();
            ohq ohqVar2 = (ohq) aihfVarCreateBuilder.instance;
            ohqVar2.c |= 2;
            ohqVar2.e = j2;
            aihhVar.e(aihlVar, (ohq) aihfVarCreateBuilder.build());
        }
        if (str2 != null) {
            aihhVar.copyOnWrite();
            oho ohoVar6 = (oho) aihhVar.instance;
            ohoVar6.b |= 2;
            ohoVar6.d = str2;
        }
        if (aifvVar != null) {
            aihhVar.copyOnWrite();
            oho ohoVar7 = (oho) aihhVar.instance;
            ohoVar7.g = aifvVar;
            ohoVar7.b |= 16;
        }
        return (oho) aihhVar.build();
    }

    public static agev h(oip oipVar) {
        return oipVar != null ? agev.i(oipVar.t) : agdf.a;
    }

    public static List j(ayq ayqVar, Uri uri, String str) {
        ArrayList arrayList = new ArrayList();
        for (Uri uri2 : ayqVar.W(uri)) {
            if (ayqVar.ad(uri2)) {
                arrayList.addAll(j(ayqVar, uri2, str));
            } else {
                String path = uri2.getPath();
                if (path != null) {
                    long jV = ayqVar.V(uri2);
                    aihh aihhVar = (aihh) oho.a.createBuilder();
                    String strReplaceFirst = path.replaceFirst(str, "");
                    aihhVar.copyOnWrite();
                    oho ohoVar = (oho) aihhVar.instance;
                    strReplaceFirst.getClass();
                    ohoVar.b |= 1;
                    ohoVar.c = strReplaceFirst;
                    aihhVar.copyOnWrite();
                    oho ohoVar2 = (oho) aihhVar.instance;
                    ohoVar2.b |= 4;
                    ohoVar2.e = (int) jV;
                    String string = uri2.toString();
                    aihhVar.copyOnWrite();
                    oho ohoVar3 = (oho) aihhVar.instance;
                    string.getClass();
                    ohoVar3.b |= 2;
                    ohoVar3.d = string;
                    if (jV > 2147483647L) {
                        aihl aihlVar = ohq.b;
                        aihf aihfVarCreateBuilder = ohq.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ohq ohqVar = (ohq) aihfVarCreateBuilder.instance;
                        ohqVar.c |= 1;
                        ohqVar.d = jV;
                        aihhVar.e(aihlVar, (ohq) aihfVarCreateBuilder.build());
                    }
                    arrayList.add((oho) aihhVar.build());
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    public static ListenableFuture k(oip oipVar, agev agevVar, String str, int i, final boolean z, final olp olpVar, Executor executor, ayq ayqVar) {
        aihf aihfVar;
        ooi ooiVarF;
        byte[] bArr = null;
        if (oipVar == null) {
            return ahng.n(null);
        }
        aihf aihfVarCreateBuilder = ohp.a.createBuilder();
        String str2 = oipVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        ohp ohpVar = (ohp) aihfVarCreateBuilder.instance;
        str2.getClass();
        ohpVar.b |= 1;
        ohpVar.c = str2;
        String str3 = oipVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        ohp ohpVar2 = (ohp) aihfVarCreateBuilder.instance;
        str3.getClass();
        ohpVar2.b |= 2;
        ohpVar2.d = str3;
        int i2 = oipVar.f;
        aihfVarCreateBuilder.copyOnWrite();
        ohp ohpVar3 = (ohp) aihfVarCreateBuilder.instance;
        ohpVar3.b |= 8;
        ohpVar3.f = i2;
        aifv aifvVar = oipVar.g;
        if (aifvVar == null) {
            aifvVar = aifv.a;
        }
        aihfVarCreateBuilder.copyOnWrite();
        ohp ohpVar4 = (ohp) aihfVarCreateBuilder.instance;
        aifvVar.getClass();
        ohpVar4.l = aifvVar;
        ohpVar4.b |= SemanticState.Focused;
        long j = oipVar.s;
        aihfVarCreateBuilder.copyOnWrite();
        ohp ohpVar5 = (ohp) aihfVarCreateBuilder.instance;
        ohpVar5.b |= 32;
        ohpVar5.i = j;
        aihfVarCreateBuilder.copyOnWrite();
        ohp ohpVar6 = (ohp) aihfVarCreateBuilder.instance;
        ohpVar6.g = i - 1;
        ohpVar6.b |= 16;
        aiie aiieVar = oipVar.u;
        aihfVarCreateBuilder.copyOnWrite();
        ohp ohpVar7 = (ohp) aihfVarCreateBuilder.instance;
        aiie aiieVar2 = ohpVar7.k;
        if (!aiieVar2.c()) {
            ohpVar7.k = aihn.mutableCopy(aiieVar2);
        }
        aifs.addAll(aiieVar, ohpVar7.k);
        if (agevVar.g()) {
            Object objC = agevVar.c();
            aihfVarCreateBuilder.copyOnWrite();
            ohp ohpVar8 = (ohp) aihfVarCreateBuilder.instance;
            ohpVar8.b |= 64;
            ohpVar8.j = (String) objC;
        }
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            ohp ohpVar9 = (ohp) aihfVarCreateBuilder.instance;
            ohpVar9.b |= 4;
            ohpVar9.e = str;
        }
        if ((oipVar.b & 32) != 0) {
            aifv aifvVar2 = oipVar.h;
            if (aifvVar2 == null) {
                aifvVar2 = aifv.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            ohp ohpVar10 = (ohp) aihfVarCreateBuilder.instance;
            aifvVar2.getClass();
            ohpVar10.m = aifvVar2;
            ohpVar10.b |= SemanticState.Hidden;
        }
        aiie aiieVar3 = oipVar.o;
        ListenableFuture listenableFuture = aher.a;
        if (i == 2 || i == 4) {
            if (oipVar.n) {
                String string = nsp.c(olpVar.b, olpVar.f, oipVar).toString();
                aihfVarCreateBuilder.copyOnWrite();
                ohp ohpVar11 = (ohp) aihfVarCreateBuilder.instance;
                string.getClass();
                ohpVar11.b |= SemanticState.ReadOnly;
                ohpVar11.n = string;
            }
            int i3 = onb.a;
            int i4 = 0;
            final boolean z2 = i != 4 && nsp.i(oipVar);
            agkh agkhVar = new agkh(4);
            if (z2) {
                agkhVar.i(olpVar.m.d(oipVar));
            }
            final agkj agkjVarD = agkhVar.d(false);
            ooi ooiVarD = ooi.d(olpVar.e());
            acrf acrfVar = new acrf(olpVar, z2, z, oipVar, 1);
            Executor executor2 = olpVar.g;
            ooi ooiVarD2 = ooi.d(ooiVarD.f(acrfVar, executor2).e(new agek() { // from class: oli
                @Override // defpackage.agek
                public final Object apply(Object obj) {
                    agkj agkjVar = (agkj) obj;
                    if (!z2) {
                        return agkjVar;
                    }
                    agkj agkjVar2 = agkjVarD;
                    return !z ? agkjVar2 : olpVar.m.e(agkjVar2, agkjVar);
                }
            }, executor2).e(new olj(olpVar, i4), executor2));
            aihfVar = aihfVarCreateBuilder;
            ooiVarF = ooiVarD2.f(new ojk(aiieVar3, ayqVar, aihfVar, 3, (char[]) null), executor);
        } else {
            xgg xggVar = olpVar.m;
            ooi ooiVarD3 = ooi.d(ahng.n(oipVar.o));
            iun iunVar = new iun(oipVar, 19);
            ?? r8 = xggVar.k;
            ooi ooiVarE = ooiVarD3.e(iunVar, r8);
            ooiVarF = ooi.d(ooiVarE.f(new ods(xggVar, 12), r8).f(new ods(ooiVarE, 13), r8)).f(new iub(aiieVar3, aihfVarCreateBuilder, 17, bArr), executor);
            aihfVar = aihfVarCreateBuilder;
        }
        return ooi.d(ooiVarF).e(new iun(aihfVar, 15), executor).b(oig.class, new kke(14), executor);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [ahex, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, xla] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, xla] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, xla] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, xla] */
    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ycs a(int i) {
        ycs yafVar;
        int i2 = i - 1;
        if (i2 == 1) {
            dij dijVar = (dij) this.o.io();
            Object obj = this.b;
            Object obj2 = this.a;
            Object obj3 = this.l;
            Object obj4 = this.k;
            Object obj5 = this.e;
            Object obj6 = this.g;
            Object obj7 = this.m;
            avmb avmbVar = (avmb) obj7;
            avlh avlhVar = (avlh) obj6;
            xsa xsaVar = (xsa) obj5;
            tbt tbtVar = (tbt) obj4;
            tfq tfqVar = (tfq) obj3;
            xru xruVar = (xru) obj2;
            yafVar = new yaf(dijVar, (did) obj, xruVar, tfqVar, tbtVar, xsaVar, avlhVar, avmbVar, this.h, (ycd) this.f, (vxz) this.d);
        } else if (i2 == 2) {
            dij dijVar2 = (dij) this.o.io();
            Object obj8 = this.b;
            Object obj9 = this.a;
            Object obj10 = this.l;
            Object obj11 = this.j;
            Object obj12 = this.k;
            ?? r9 = this.i;
            ?? r10 = this.n;
            Object obj13 = this.c;
            ?? r12 = this.h;
            Object obj14 = this.g;
            Object obj15 = this.m;
            avmb avmbVar2 = (avmb) obj15;
            avlh avlhVar2 = (avlh) obj14;
            yar yarVar = (yar) obj13;
            tbt tbtVar2 = (tbt) obj12;
            xns xnsVar = (xns) obj11;
            tfq tfqVar2 = (tfq) obj10;
            xru xruVar2 = (xru) obj9;
            yafVar = new yaz(dijVar2, (did) obj8, xruVar2, tfqVar2, xnsVar, tbtVar2, r9, r10, yarVar, r12, avlhVar2, avmbVar2, (ycd) this.f, (vxz) this.d);
        } else if (i2 == 3) {
            dij dijVar3 = (dij) this.o.io();
            Object obj16 = this.b;
            Object obj17 = this.a;
            Object obj18 = this.l;
            Object obj19 = this.k;
            Object obj20 = this.g;
            Object obj21 = this.m;
            avmb avmbVar3 = (avmb) obj21;
            avlh avlhVar3 = (avlh) obj20;
            tbt tbtVar3 = (tbt) obj19;
            tfq tfqVar3 = (tfq) obj18;
            xru xruVar3 = (xru) obj17;
            yafVar = new ybo(dijVar3, (did) obj16, xruVar3, tfqVar3, tbtVar3, avlhVar3, avmbVar3, this.h, (ycd) this.f, (vxz) this.d);
        } else {
            if (i2 != 5) {
                return null;
            }
            dij dijVar4 = (dij) this.o.io();
            Object obj22 = this.b;
            Object obj23 = this.a;
            Object obj24 = this.l;
            Object obj25 = this.k;
            Object obj26 = this.g;
            Object obj27 = this.m;
            avmb avmbVar4 = (avmb) obj27;
            avlh avlhVar4 = (avlh) obj26;
            tbt tbtVar4 = (tbt) obj25;
            tfq tfqVar4 = (tfq) obj24;
            xru xruVar4 = (xru) obj23;
            yafVar = new ycg(dijVar4, (did) obj22, xruVar4, tfqVar4, tbtVar4, avlhVar4, avmbVar4, this.h, (ycd) this.f, (vxz) this.d);
        }
        return yafVar;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    public final vsc b(LoadingFrameLayout loadingFrameLayout, xgn xgnVar) {
        Context context = (Context) this.h.io();
        context.getClass();
        cf cfVar = (cf) this.g.io();
        cfVar.getClass();
        zwb zwbVar = (zwb) this.c.io();
        zwbVar.getClass();
        vxe vxeVar = (vxe) this.j.io();
        vxeVar.getClass();
        aegs aegsVar = (aegs) this.i.io();
        aegsVar.getClass();
        Map map = (Map) this.k.io();
        xit xitVar = (xit) this.a.io();
        xitVar.getClass();
        vxz vxzVar = (vxz) this.o.io();
        vxzVar.getClass();
        loadingFrameLayout.getClass();
        xgnVar.getClass();
        return new vsc(context, cfVar, zwbVar, vxeVar, aegsVar, this.m, map, this.l, this.n, this.f, this.d, this.e, this.b, xitVar, vxzVar, loadingFrameLayout, xgnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture d(ojo ojoVar) {
        Uri uri;
        String str;
        ojv ojvVar;
        agke agkeVar;
        String str2;
        aifv aifvVar;
        ooa ooaVar = new ooa();
        ooaVar.f(-1);
        ooaVar.b(agpi.a);
        ooaVar.g();
        ooaVar.d(true);
        ooaVar.e(true);
        ooaVar.a(aifv.a);
        Uri uri2 = ojoVar.a;
        if (uri2 == null) {
            throw new NullPointerException("Null destinationFileUri");
        }
        ooaVar.a = uri2;
        String str3 = ojoVar.b;
        if (str3 == null) {
            throw new NullPointerException("Null urlToDownload");
        }
        ooaVar.b = str3;
        ojv ojvVar2 = ojoVar.c;
        if (ojvVar2 == null) {
            throw new NullPointerException("Null downloadConstraints");
        }
        ooaVar.c = ojvVar2;
        agev agevVarI = agdf.a;
        ooaVar.d = agevVarI;
        ooaVar.f(ojoVar.d);
        ooaVar.b(ojoVar.e);
        ooaVar.g();
        ooaVar.c(ojoVar.f);
        agev agevVar = ojoVar.g;
        if (agevVar == null) {
            throw new NullPointerException("Null notificationContentTextOptional");
        }
        ooaVar.h = agevVar;
        agev agevVar2 = ojoVar.h;
        if (agevVar2 == null) {
            throw new NullPointerException("Null notificationContentIntentOptional");
        }
        ooaVar.i = agevVar2;
        ooaVar.d(ojoVar.i);
        ooaVar.e(ojoVar.j);
        ooaVar.a(ojoVar.k);
        String str4 = ooaVar.g;
        if (str4 != null) {
            agevVarI = agev.i(str4);
        }
        if (!agevVarI.g()) {
            String str5 = ooaVar.b;
            if (str5 == null) {
                throw new IllegalStateException("Property \"urlToDownload\" has not been set");
            }
            ooaVar.c(str5);
        }
        Object obj = this.c;
        int i = 8;
        if (ooaVar.m == 15 && (uri = ooaVar.a) != null && (str = ooaVar.b) != null && (ojvVar = ooaVar.c) != null && (agkeVar = ooaVar.f) != null && (str2 = ooaVar.g) != null && (aifvVar = ooaVar.l) != null) {
            oob oobVar = new oob(uri, str, ojvVar, ooaVar.d, ooaVar.e, agkeVar, str2, ooaVar.h, ooaVar.i, ooaVar.j, ooaVar.k, aifvVar);
            Uri uri3 = oobVar.a;
            uri3.toString();
            int i2 = onb.a;
            int i3 = agxm.b;
            agxk agxkVarF = agxl.a.f();
            agxkVarF.j(uri3.toString());
            agxkVarF.j("|");
            oka okaVar = new oka(2, agxkVarF.o().toString());
            String str6 = okaVar.a;
            syn synVar = (syn) obj;
            Object obj2 = synVar.d;
            jkb jkbVar = new jkb(obj2, str6, i);
            syn synVar2 = (syn) obj2;
            ListenableFuture listenableFutureB = ((omj) synVar2.b).b(jkbVar, synVar2.a);
            byte[] bArr = null;
            ols olsVar = new ols(obj, str6, 13, bArr);
            ?? r1 = synVar.a;
            return ahno.as(ahno.as(listenableFutureB, olsVar, r1), new okx(obj, (Object) oobVar, (Object) okaVar, 16, bArr), r1);
        }
        StringBuilder sb = new StringBuilder();
        if (ooaVar.a == null) {
            sb.append(" destinationFileUri");
        }
        if (ooaVar.b == null) {
            sb.append(" urlToDownload");
        }
        if (ooaVar.c == null) {
            sb.append(" downloadConstraints");
        }
        if ((ooaVar.m & 1) == 0) {
            sb.append(" trafficTag");
        }
        if (ooaVar.f == null) {
            sb.append(" extraHttpHeaders");
        }
        if ((ooaVar.m & 2) == 0) {
            sb.append(" fileSizeBytes");
        }
        if (ooaVar.g == null) {
            sb.append(" notificationContentTitle");
        }
        if ((ooaVar.m & 4) == 0) {
            sb.append(" showDownloadedNotification");
        }
        if ((ooaVar.m & 8) == 0) {
            sb.append(" showFailureNotification");
        }
        if (ooaVar.l == null) {
            sb.append(" customDownloaderMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture e(oik oikVar) {
        return ((omj) this.a).c(new jnu(this, oikVar, 2, null), this.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture f(final boolean z) {
        ooi ooiVarD = ooi.d(g());
        final int i = 1;
        ahcy ahcyVar = new ahcy(this) { // from class: oje
            public final /* synthetic */ zpw b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v3, types: [ahcy, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v6, types: [ahcy, java.lang.Object] */
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                if (i != 0) {
                    zpw zpwVar = this.b;
                    return ((olp) zpwVar.j).c(z, zpwVar.i);
                }
                zpw zpwVar2 = this.b;
                return ((olp) zpwVar2.j).c(z, zpwVar2.i);
            }
        };
        ?? r2 = this.o;
        final int i2 = 0;
        return ooiVarD.f(ahcyVar, r2).f(new hqm(this, 3), r2).f(new ahcy(this) { // from class: oje
            public final /* synthetic */ zpw b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v3, types: [ahcy, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v6, types: [ahcy, java.lang.Object] */
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                if (i2 != 0) {
                    zpw zpwVar = this.b;
                    return ((olp) zpwVar.j).c(z, zpwVar.i);
                }
                zpw zpwVar2 = this.b;
                return ((olp) zpwVar2.j).c(z, zpwVar2.i);
            }
        }, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture g() {
        ArrayList arrayList = new ArrayList();
        for (wjr wjrVar : this.m) {
            akjw akjwVar = ((tao) wjrVar.a).b().x;
            if (akjwVar == null) {
                akjwVar = akjw.a;
            }
            vzt vztVar = (vzt) wjrVar.b.io();
            aiie aiieVar = akjwVar.b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = aiieVar.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((oid) it.next()).b.iterator();
                while (it2.hasNext()) {
                    ohz ohzVar = ((oic) it2.next()).b;
                    if (ohzVar == null) {
                        ohzVar = ohz.a;
                    }
                    arrayList2.add(vztVar.a(ohzVar));
                }
            }
            arrayList.add(new ahud(new ahek(false, agke.j(arrayList2)), (byte[]) null).k(new okp(9), vztVar.e));
        }
        return new kjc(new ahek(false, agke.j(arrayList))).N(new okp(1), this.o);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [awmd, java.lang.Object] */
    public final hxj i(FrameLayout frameLayout) {
        frameLayout.getClass();
        hwz hwzVar = (hwz) this.a.io();
        hwzVar.getClass();
        abjp abjpVar = (abjp) this.l.io();
        abjpVar.getClass();
        jnm jnmVar = (jnm) this.n.io();
        jnmVar.getClass();
        xgn xgnVar = (xgn) this.k.io();
        xgnVar.getClass();
        ycp ycpVar = (ycp) this.h.io();
        ycpVar.getClass();
        avlh avlhVar = (avlh) this.b.io();
        avlhVar.getClass();
        jnj jnjVar = (jnj) this.j.io();
        jnjVar.getClass();
        avlh avlhVar2 = (avlh) this.o.io();
        avlhVar2.getClass();
        fdl fdlVar = (fdl) this.g.io();
        fdlVar.getClass();
        vxz vxzVar = (vxz) this.c.io();
        vxzVar.getClass();
        hxf hxfVar = (hxf) this.d.io();
        hxfVar.getClass();
        ?? Io = this.m.io();
        Io.getClass();
        abvn abvnVar = (abvn) this.e.io();
        abvnVar.getClass();
        jij jijVar = (jij) this.f.io();
        jijVar.getClass();
        ?? Io2 = this.i.io();
        Io2.getClass();
        return new hxj(frameLayout, hwzVar, abjpVar, jnmVar, xgnVar, ycpVar, avlhVar, jnjVar, avlhVar2, fdlVar, vxzVar, hxfVar, Io, abvnVar, jijVar, Io2);
    }

    public zpw(awmd awmdVar, did didVar, xru xruVar, tfq tfqVar, xns xnsVar, tbt tbtVar, Executor executor, ahex ahexVar, yar yarVar, xla xlaVar, xsa xsaVar, avlh avlhVar, avmb avmbVar, ycd ycdVar, vxz vxzVar) {
        this.o = awmdVar;
        this.b = didVar;
        this.a = xruVar;
        this.l = tfqVar;
        this.j = xnsVar;
        this.k = tbtVar;
        this.i = executor;
        this.n = ahexVar;
        this.c = yarVar;
        this.h = xlaVar;
        this.e = xsaVar;
        this.g = avlhVar;
        this.m = avmbVar;
        this.f = ycdVar;
        this.d = vxzVar;
    }

    public zpw(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, awmd awmdVar14, awmd awmdVar15) {
        this.a = awmdVar;
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.d = awmdVar4;
        awmdVar5.getClass();
        this.e = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
        this.g = awmdVar7;
        awmdVar8.getClass();
        this.h = awmdVar8;
        awmdVar9.getClass();
        this.i = awmdVar9;
        awmdVar10.getClass();
        this.o = awmdVar10;
        awmdVar11.getClass();
        this.j = awmdVar11;
        awmdVar12.getClass();
        this.k = awmdVar12;
        awmdVar13.getClass();
        this.l = awmdVar13;
        awmdVar14.getClass();
        this.m = awmdVar14;
        awmdVar15.getClass();
        this.n = awmdVar15;
    }

    public zpw(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, awmd awmdVar14, awmd awmdVar15, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.l = awmdVar2;
        this.n = awmdVar3;
        awmdVar4.getClass();
        this.k = awmdVar4;
        awmdVar5.getClass();
        this.h = awmdVar5;
        awmdVar6.getClass();
        this.b = awmdVar6;
        awmdVar7.getClass();
        this.j = awmdVar7;
        this.o = awmdVar8;
        awmdVar9.getClass();
        this.g = awmdVar9;
        awmdVar10.getClass();
        this.c = awmdVar10;
        awmdVar11.getClass();
        this.d = awmdVar11;
        this.m = awmdVar12;
        this.e = awmdVar13;
        this.f = awmdVar14;
        this.i = awmdVar15;
    }

    public zpw(Context context, ong ongVar, final olp olpVar, final Executor executor, List list, agev agevVar, final ayq ayqVar, agev agevVar2, agev agevVar3, final oii oiiVar, syn synVar, final agev agevVar4, omj omjVar) {
        this.a = new omj();
        this.n = context;
        this.k = ongVar;
        this.m = list;
        this.e = agevVar;
        this.o = executor;
        this.j = olpVar;
        this.b = ayqVar;
        this.l = agevVar2;
        this.g = oiiVar;
        this.c = synVar;
        this.i = new ahcy() { // from class: ojl
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                omh omhVar = (omh) obj;
                oip oipVar = omhVar.b;
                oiw oiwVar = omhVar.a;
                agev agevVarH = zpw.h(oipVar);
                olp olpVar2 = olpVar;
                Executor executor2 = executor;
                ListenableFuture listenableFutureK = zpw.k(oipVar, agevVarH, null, 4, false, olpVar2, executor2, ayqVar);
                ooi ooiVarF = ooi.d(olpVar2.d(oiwVar, true)).f(new gpr(16), executor2);
                return qnl.aK(listenableFutureK, ooiVarF).O(new ojj(listenableFutureK, ooiVarF, agevVar4, omhVar, 0), executor2);
            }
        };
        this.h = new syn(executor, new ons());
        this.f = new syn(executor, new ooc(agevVar3, context, 1));
        this.d = omjVar;
    }

    public zpw(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, awmd awmdVar14, awmd awmdVar15, char[] cArr) {
        awmdVar.getClass();
        this.h = awmdVar;
        awmdVar2.getClass();
        this.g = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.j = awmdVar4;
        this.i = awmdVar5;
        this.m = awmdVar6;
        this.k = awmdVar7;
        this.l = awmdVar8;
        this.n = awmdVar9;
        this.f = awmdVar10;
        this.d = awmdVar11;
        this.e = awmdVar12;
        this.b = awmdVar13;
        awmdVar14.getClass();
        this.a = awmdVar14;
        this.o = awmdVar15;
    }

    public zpw(Application application, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, aunn aunnVar9, aunn aunnVar10, aunn aunnVar11, aunn aunnVar12, aunn aunnVar13, awmd awmdVar) {
        this.n = application;
        this.j = aunnVar;
        this.k = aunnVar2;
        this.a = aunnVar3;
        this.b = aunnVar4;
        this.c = aunnVar5;
        this.e = aunnVar6;
        this.l = aunnVar7;
        this.i = aunnVar8;
        this.d = aunnVar9;
        this.g = aunnVar10;
        this.h = aunnVar11;
        this.f = aunnVar12;
        this.m = aunnVar13;
        this.o = awmdVar;
    }
}
