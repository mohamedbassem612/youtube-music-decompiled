package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gme extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(ppv ppvVar, String str, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ppvVar;
        this.c = str;
        this.d = "oauth2:https://www.googleapis.com/auth/notifications";
    }

    /* JADX WARN: Type inference failed for: r1v33, types: [awzc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [awwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, pxk] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r3v4, types: [htt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [awqg, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        gme gmeVar;
        switch (this.$cid) {
            case 0:
                gmeVar = new gme((gmj) this.b, (zwa) this.c, (awqk) this.d, awoqVar, 0);
                break;
            case 1:
                gmeVar = new gme((gmj) this.b, this.c, this.d, awoqVar, 1, null);
                break;
            case 2:
                Object obj2 = this.c;
                hbl hblVar = (hbl) obj2;
                gmeVar = new gme(hblVar, (arzo) this.d, (Bitmap) this.b, awoqVar, 2);
                break;
            case 3:
                Object obj3 = this.c;
                hub hubVar = (hub) obj3;
                gmeVar = new gme(hubVar, (String) this.d, (htt) this.b, awoqVar, 3);
                break;
            case 4:
                Object obj4 = this.b;
                ifj ifjVar = (ifj) obj4;
                gmeVar = new gme(ifjVar, (abnl) this.c, (abnp) this.d, awoqVar, 4);
                break;
            case 5:
                Object obj5 = this.b;
                ozu ozuVar = (ozu) obj5;
                gmeVar = new gme(ozuVar, (plx) this.c, (aiec) this.d, awoqVar, 5);
                break;
            case 6:
                Object obj6 = this.c;
                paj pajVar = (paj) obj6;
                gmeVar = new gme(pajVar, (Intent) this.b, (awrm) this.d, awoqVar, 6);
                break;
            case 7:
                Object obj7 = this.b;
                pfa pfaVar = (pfa) obj7;
                gmeVar = new gme(pfaVar, (plx) this.c, (aidy) this.d, awoqVar, 7);
                break;
            case 8:
                Object obj8 = this.b;
                pgm pgmVar = (pgm) obj8;
                gmeVar = new gme(pgmVar, (plx) this.c, (aidy) this.d, awoqVar, 8);
                break;
            case 9:
                gmeVar = new gme((phk) this.c, (List) this.d, (pcu) this.b, awoqVar, 9);
                break;
            case 10:
                return new gme((ppv) this.b, (String) this.c, awoqVar, 10);
            case 11:
                Object obj9 = this.b;
                pvz pvzVar = (pvz) obj9;
                gmeVar = new gme(pvzVar, (String) this.c, (List) this.d, awoqVar, 11);
                break;
            case 12:
                gmeVar = new gme((qbs) this.c, (pxk) this.b, (List) this.d, awoqVar, 12);
                break;
            case 13:
                Object obj10 = this.c;
                xte xteVar = (xte) obj10;
                gmeVar = new gme(xteVar, (Uri) this.b, (awrm) this.d, awoqVar, 13);
                break;
            case 14:
                Object obj11 = this.c;
                vwg vwgVar = (vwg) obj11;
                gmeVar = new gme(vwgVar, (asdz) this.d, (mbb) this.b, awoqVar, 14);
                break;
            case 15:
                Object obj12 = this.b;
                aesp aespVar = (aesp) obj12;
                gmeVar = new gme(aespVar, (aiqx) this.c, (String) this.d, awoqVar, 15);
                break;
            case 16:
                Object obj13 = this.b;
                aesp aespVar2 = (aesp) obj13;
                gmeVar = new gme(aespVar2, (aiqj) this.c, (String) this.d, awoqVar, 16);
                break;
            case 17:
                gmeVar = new gme((awzc) this.d, (List) this.c, (adqc) this.b, awoqVar, 17);
                break;
            case 18:
                gmeVar = new gme((awwd) this.d, (adro) this.c, (boc) this.b, awoqVar, 18);
                break;
            case 19:
                Object obj14 = this.b;
                return new gme((aduh) obj14, (ajlb) this.c, (awqg) this.d, awoqVar, 19);
            default:
                Object obj15 = this.c;
                ahpr ahprVar = (ahpr) obj15;
                gmeVar = new gme(ahprVar, (bhi) this.b, this.d, awoqVar, 20);
                break;
        }
        return gmeVar;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 1:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 2:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 3:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 4:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 5:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 6:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 7:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 8:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 9:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 10:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 11:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 12:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 13:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 14:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 15:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 16:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 17:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 18:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 19:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            default:
                return ((gme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x03b5, code lost:
    
        if (((defpackage.qbh) r0).c(r5, r14) == r8) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03c9, code lost:
    
        if (r1.e(r0, 2, r2, r4, r5, null, r14) == r8) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03cc, code lost:
    
        return r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object, pxk] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v100, types: [bec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [gmj] */
    /* JADX WARN: Type inference failed for: r1v111, types: [awwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v118, types: [aduh] */
    /* JADX WARN: Type inference failed for: r1v3, types: [gmj] */
    /* JADX WARN: Type inference failed for: r1v84, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v93, types: [bec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r2v2, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r2v31, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [htt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40, types: [awzc] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v45, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gme.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(aesp aespVar, aiqj aiqjVar, String str, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = aespVar;
        this.c = aiqjVar;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(aesp aespVar, aiqx aiqxVar, String str, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = aespVar;
        this.c = aiqxVar;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(ahpr ahprVar, bhi bhiVar, Object obj, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = ahprVar;
        this.b = bhiVar;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(awwd awwdVar, adro adroVar, boc bocVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = awwdVar;
        this.c = adroVar;
        this.b = bocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(awzc awzcVar, List list, adqc adqcVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = awzcVar;
        this.c = list;
        this.b = adqcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(gmj gmjVar, zwa zwaVar, awqk awqkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = gmjVar;
        this.c = zwaVar;
        this.d = awqkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(gmj gmjVar, zwa zwaVar, awqk awqkVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = gmjVar;
        this.c = zwaVar;
        this.d = awqkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(hbl hblVar, arzo arzoVar, Bitmap bitmap, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = hblVar;
        this.d = arzoVar;
        this.b = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(hub hubVar, String str, htt httVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = hubVar;
        this.d = str;
        this.b = httVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(ifj ifjVar, abnl abnlVar, abnp abnpVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ifjVar;
        this.c = abnlVar;
        this.d = abnpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(ozu ozuVar, plx plxVar, aiec aiecVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ozuVar;
        this.c = plxVar;
        this.d = aiecVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(paj pajVar, Intent intent, awrm awrmVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = pajVar;
        this.b = intent;
        this.d = awrmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(pfa pfaVar, plx plxVar, aidy aidyVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = pfaVar;
        this.c = plxVar;
        this.d = aidyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(pgm pgmVar, plx plxVar, aidy aidyVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = pgmVar;
        this.c = plxVar;
        this.d = aidyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(phk phkVar, List list, pcu pcuVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = phkVar;
        this.d = list;
        this.b = pcuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(aduh aduhVar, ajlb ajlbVar, awqg awqgVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = aduhVar;
        this.c = ajlbVar;
        this.d = awqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(pvz pvzVar, String str, List list, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = pvzVar;
        this.c = str;
        this.d = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(qbs qbsVar, pxk pxkVar, List list, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = qbsVar;
        this.b = pxkVar;
        this.d = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(vwg vwgVar, asdz asdzVar, mbb mbbVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = vwgVar;
        this.d = asdzVar;
        this.b = mbbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(xte xteVar, Uri uri, awrm awrmVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = xteVar;
        this.b = uri;
        this.d = awrmVar;
    }
}
