package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ux {
    public static final sl a;
    public static final sl b;
    public static final sl c;

    static {
        sb sbVar = new sb("VisibilityType");
        rz rzVar = new rz("notPlatformSurfaceable");
        rzVar.b(2);
        sbVar.c(rzVar.a());
        sj sjVar = new sj("packageName");
        sjVar.b(1);
        sbVar.c(sjVar.a());
        avju avjuVar = new avju("sha256Cert");
        avjuVar.p(1);
        sbVar.c(avjuVar.q());
        sc scVar = new sc("permission", "VisibilityPermissionType");
        scVar.b(1);
        sbVar.c(scVar.a());
        a = sbVar.a();
        sb sbVar2 = new sb("AndroidVOverlayType");
        avju avjuVar2 = new avju("visibilityProtoSerializeProperty");
        avjuVar2.p(2);
        sbVar2.c(avjuVar2.q());
        b = sbVar2.a();
        sb sbVar3 = new sb("PublicAclOverlayType");
        sj sjVar2 = new sj("publiclyVisibleTargetPackage");
        sjVar2.b(2);
        sbVar3.c(sjVar2.a());
        avju avjuVar3 = new avju("publiclyVisibleTargetPackageSha256Cert");
        avjuVar3.p(2);
        sbVar3.c(avjuVar3.q());
        c = sbVar3.a();
    }

    public static ss a(sx sxVar) {
        sr srVar = new sr("", sxVar.a, "VisibilityType");
        srVar.b("notPlatformSurfaceable", sxVar.b);
        te teVar = sxVar.c;
        List listB = teVar.b();
        String[] strArr = new String[listB.size()];
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, listB.size(), 32);
        for (int i = 0; i < listB.size(); i++) {
            strArr[i] = ((sz) listB.get(i)).a();
            bArr[i] = ((sz) listB.get(i)).b();
        }
        srVar.i("packageName", strArr);
        srVar.c("sha256Cert", bArr);
        Set setC = teVar.c();
        if (!setC.isEmpty()) {
            afx afxVar = (afx) setC;
            ss[] ssVarArr = new ss[afxVar.c];
            afw afwVar = new afw(afxVar);
            int i2 = 0;
            while (afwVar.hasNext()) {
                tr trVar = new tr((Set) afwVar.next());
                int i3 = i2 + 1;
                if (trVar.c == null) {
                    sr srVar2 = new sr("", "", "VisibilityPermissionType");
                    int[] iArr = trVar.b;
                    long[] jArr = new long[iArr.length];
                    for (int i4 = 0; i4 < iArr.length; i4++) {
                        jArr[i4] = iArr[i4];
                    }
                    srVar2.h("allRequiredPermissions", jArr);
                    srVar2.a(0L);
                    trVar.c = srVar2.d();
                }
                ssVarArr[i2] = trVar.c;
                i2 = i3;
            }
            srVar.e("permission", ssVarArr);
        }
        srVar.a(0L);
        return srVar.d();
    }

    public static te b(jrx jrxVar) {
        zz zzVar = new zz();
        lye lyeVar = jrxVar.visibleToPackages_;
        for (int i = 0; i < lyeVar.size(); i++) {
            zzVar.b(d((jrw) jrxVar.visibleToPackages_.get(i)));
        }
        lye lyeVar2 = jrxVar.visibleToPermissions_;
        for (int i2 = 0; i2 < lyeVar2.size(); i2++) {
            zzVar.c(new afx(((jry) lyeVar2.get(i2)).permissions_));
        }
        if ((jrxVar.bitField0_ & 2) != 0) {
            jrw jrwVar = jrxVar.publiclyVisibleTargetPackage_;
            if (jrwVar == null) {
                jrwVar = jrw.DEFAULT_INSTANCE;
            }
            zzVar.d(d(jrwVar));
        }
        return zzVar.a();
    }

    public static jrw c(sz szVar) {
        List listUnmodifiableList;
        lxq lxqVarS = jrw.DEFAULT_INSTANCE.s();
        String strA = szVar.a();
        lxqVarS.s();
        jrw jrwVar = (jrw) lxqVarS.a;
        jrwVar.bitField0_ |= 1;
        jrwVar.packageName_ = strA;
        lxa lxaVarH = lxa.h(szVar.b());
        lxqVarS.s();
        jrw jrwVar2 = (jrw) lxqVarS.a;
        lxaVarH.getClass();
        jrwVar2.bitField0_ |= 2;
        jrwVar2.packageSha256Cert_ = lxaVarH;
        byte[][] bArr = szVar.a.c;
        if (bArr == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            int length = bArr.length;
            byte[][] bArr2 = new byte[length][];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = (byte[]) bArr[i].clone();
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                byte[] bArr3 = bArr2[i2];
                bArr3.getClass();
                arrayList.add(bArr3);
            }
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        if (!listUnmodifiableList.isEmpty()) {
            for (int i3 = 0; i3 < listUnmodifiableList.size(); i3++) {
                lxa lxaVarH2 = lxa.h((byte[]) listUnmodifiableList.get(i3));
                lxqVarS.s();
                jrw jrwVar3 = (jrw) lxqVarS.a;
                lxaVarH2.getClass();
                lye lyeVar = jrwVar3.packageSha256Certs_;
                if (!lyeVar.c()) {
                    jrwVar3.packageSha256Certs_ = lxt.A(lyeVar);
                }
                jrwVar3.packageSha256Certs_.add(lxaVarH2);
            }
        }
        return (jrw) lxqVarS.o();
    }

    private static sz d(jrw jrwVar) {
        if (jrwVar.packageSha256Certs_.size() <= 0) {
            return new sz(jrwVar.packageName_, jrwVar.packageSha256Cert_.j());
        }
        lye lyeVar = jrwVar.packageSha256Certs_;
        ArrayList arrayList = new ArrayList(lyeVar.size());
        for (int i = 0; i < lyeVar.size(); i++) {
            arrayList.add(((lxa) lyeVar.get(i)).j());
        }
        return new sz(jrwVar.packageName_, arrayList);
    }
}
