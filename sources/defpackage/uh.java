package defpackage;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class uh {
    private static final String[] a = new String[0];
    private static final long[] b = new long[0];
    private static final double[] c = new double[0];
    private static final boolean[] d = new boolean[0];
    private static final byte[][] e = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 0, 0);
    private static final ss[] f = new ss[0];
    private static final sp[] g = new sp[0];

    public static ltt a(ss ssVar) {
        azs.l(ssVar);
        lxq lxqVarS = ltt.DEFAULT_INSTANCE.s();
        String strE = ssVar.e();
        lxqVarS.s();
        ltt lttVar = (ltt) lxqVarS.a;
        lttVar.bitField0_ |= 2;
        lttVar.uri_ = strE;
        lxqVarS.x(ssVar.h());
        lxqVarS.w(ssVar.f());
        int iA = ssVar.a();
        lxqVarS.s();
        ltt lttVar2 = (ltt) lxqVarS.a;
        lttVar2.bitField0_ |= 16;
        lttVar2.score_ = iA;
        long jC = ssVar.c();
        lxqVarS.s();
        ltt lttVar3 = (ltt) lxqVarS.a;
        lttVar3.bitField0_ |= 32;
        lttVar3.ttlMs_ = jC;
        long jB = ssVar.b();
        lxqVarS.s();
        ltt lttVar4 = (ltt) lxqVarS.a;
        lttVar4.bitField0_ |= 8;
        lttVar4.creationTimestampMs_ = jB;
        ArrayList arrayList = new ArrayList(ssVar.i());
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            lxq lxqVarS2 = luz.DEFAULT_INSTANCE.s();
            lxqVarS2.s();
            luz luzVar = (luz) lxqVarS2.a;
            str.getClass();
            luzVar.bitField0_ |= 1;
            luzVar.name_ = str;
            Object objD = ssVar.d(str);
            if (objD instanceof String[]) {
                for (String str2 : (String[]) objD) {
                    lxqVarS2.s();
                    luz luzVar2 = (luz) lxqVarS2.a;
                    str2.getClass();
                    lye lyeVar = luzVar2.stringValues_;
                    if (!lyeVar.c()) {
                        luzVar2.stringValues_ = lxt.A(lyeVar);
                    }
                    luzVar2.stringValues_.add(str2);
                }
            } else if (objD instanceof long[]) {
                for (long j : (long[]) objD) {
                    lxqVarS2.s();
                    luz luzVar3 = (luz) lxqVarS2.a;
                    lyd lydVar = luzVar3.int64Values_;
                    if (!lydVar.c()) {
                        luzVar3.int64Values_ = lydVar.e(lydVar.size() << 1);
                    }
                    luzVar3.int64Values_.f(j);
                }
            } else if (objD instanceof double[]) {
                for (double d2 : (double[]) objD) {
                    lxqVarS2.s();
                    luz luzVar4 = (luz) lxqVarS2.a;
                    lxw lxwVar = luzVar4.doubleValues_;
                    if (!lxwVar.c()) {
                        luzVar4.doubleValues_ = lxwVar.e(lxwVar.size() << 1);
                    }
                    luzVar4.doubleValues_.g(d2);
                }
            } else if (objD instanceof boolean[]) {
                for (boolean z : (boolean[]) objD) {
                    lxqVarS2.s();
                    luz luzVar5 = (luz) lxqVarS2.a;
                    lxv lxvVar = luzVar5.booleanValues_;
                    if (!lxvVar.c()) {
                        luzVar5.booleanValues_ = lxvVar.e(lxvVar.size() << 1);
                    }
                    luzVar5.booleanValues_.f(z);
                }
            } else if (objD instanceof byte[][]) {
                for (byte[] bArr : (byte[][]) objD) {
                    lxa lxaVarH = lxa.h(bArr);
                    lxqVarS2.s();
                    luz luzVar6 = (luz) lxqVarS2.a;
                    lxaVarH.getClass();
                    lye lyeVar2 = luzVar6.bytesValues_;
                    if (!lyeVar2.c()) {
                        luzVar6.bytesValues_ = lxt.A(lyeVar2);
                    }
                    luzVar6.bytesValues_.add(lxaVarH);
                }
            } else if (objD instanceof ss[]) {
                for (ss ssVar2 : (ss[]) objD) {
                    ltt lttVarA = a(ssVar2);
                    lxqVarS2.s();
                    luz luzVar7 = (luz) lxqVarS2.a;
                    lttVarA.getClass();
                    luzVar7.k();
                    luzVar7.documentValues_.add(lttVarA);
                }
            } else if (objD instanceof sp[]) {
                for (sp spVar : (sp[]) objD) {
                    luy luyVarB = b(spVar);
                    lxqVarS2.s();
                    luz luzVar8 = (luz) lxqVarS2.a;
                    luyVarB.getClass();
                    lye lyeVar3 = luzVar8.vectorValues_;
                    if (!lyeVar3.c()) {
                        luzVar8.vectorValues_ = lxt.A(lyeVar3);
                    }
                    luzVar8.vectorValues_.add(luyVarB);
                }
            } else {
                if (!(objD instanceof rw[])) {
                    if (objD == null) {
                        throw new IllegalStateException(String.format("Property \"%s\" doesn't have any value!", str));
                    }
                    throw new IllegalStateException(String.format("Property \"%s\" has unsupported value type %s", str, objD.getClass().toString()));
                }
                for (rw rwVar : (rw[]) objD) {
                    lxq lxqVarS3 = lux.DEFAULT_INSTANCE.s();
                    String strD = ed.d(rwVar.b, rwVar.c);
                    String str3 = rwVar.d;
                    lxqVarS3.s();
                    lux luxVar = (lux) lxqVarS3.a;
                    String strConcat = strD.concat(str3);
                    luxVar.bitField0_ |= 2;
                    luxVar.namespace_ = strConcat;
                    lxa lxaVarH2 = lxa.h(rwVar.a);
                    lxqVarS3.s();
                    lux luxVar2 = (lux) lxqVarS3.a;
                    lxaVarH2.getClass();
                    luxVar2.bitField0_ |= 1;
                    luxVar2.digest_ = lxaVarH2;
                    lux luxVar3 = (lux) lxqVarS3.o();
                    lxqVarS2.s();
                    luz luzVar9 = (luz) lxqVarS2.a;
                    luxVar3.getClass();
                    lye lyeVar4 = luzVar9.blobHandleValues_;
                    if (!lyeVar4.c()) {
                        luzVar9.blobHandleValues_ = lxt.A(lyeVar4);
                    }
                    luzVar9.blobHandleValues_.add(luxVar3);
                }
            }
            lxqVarS.s();
            ltt lttVar5 = (ltt) lxqVarS.a;
            luz luzVar10 = (luz) lxqVarS2.o();
            luzVar10.getClass();
            lttVar5.d();
            lttVar5.properties_.add(luzVar10);
        }
        return (ltt) lxqVarS.o();
    }

    public static luy b(sp spVar) {
        azs.l(spVar);
        lxq lxqVarS = luy.DEFAULT_INSTANCE.s();
        lxqVarS.s();
        luy luyVar = (luy) lxqVarS.a;
        String str = spVar.b;
        str.getClass();
        luyVar.bitField0_ |= 1;
        luyVar.modelSignature_ = str;
        so soVar = spVar.c;
        if (soVar == null) {
            int i = 0;
            while (true) {
                float[] fArr = spVar.a;
                if (i >= fArr.length) {
                    break;
                }
                float f2 = fArr[i];
                lxqVarS.s();
                luy luyVar2 = (luy) lxqVarS.a;
                lxz lxzVar = luyVar2.values_;
                if (!lxzVar.c()) {
                    luyVar2.values_ = lxzVar.e(lxzVar.size() << 1);
                }
                luyVar2.values_.g(f2);
                i++;
            }
        } else {
            byte[] bArr = soVar.c;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(bArr.length + 8).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.putFloat(soVar.a);
            byteBufferOrder.putFloat(soVar.b);
            byteBufferOrder.put(bArr);
            lxa lxaVarH = lxa.h(byteBufferOrder.array());
            lxqVarS.s();
            luy luyVar3 = (luy) lxqVarS.a;
            lxaVarH.getClass();
            luyVar3.bitField0_ |= 2;
            luyVar3.quantizedValues_ = lxaVarH;
        }
        return (luy) lxqVarS.o();
    }

    public static ss c(ltu ltuVar, String str, dep depVar, a aVar) {
        String strConcat;
        sp spVar;
        ltu ltuVar2 = ltuVar;
        String str2 = str;
        dep depVar2 = depVar;
        azs.l(ltuVar2);
        azs.l(str2);
        Map mapG = depVar2.g(str2);
        ltt lttVar = (ltt) ltuVar2;
        String strSubstring = lttVar.schema_;
        String strSubstring2 = lttVar.namespace_;
        if (strSubstring.startsWith(str2)) {
            strConcat = strSubstring;
            strSubstring = strSubstring.substring(str2.length());
        } else {
            strConcat = String.valueOf(str2).concat(String.valueOf(strSubstring));
        }
        if (strSubstring2.startsWith(str2)) {
            strSubstring2 = strSubstring2.substring(str2.length());
        }
        sr srVar = new sr(strSubstring2, lttVar.uri_, strSubstring);
        int i = lttVar.score_;
        if (i < 0) {
            throw new IllegalArgumentException("Document score cannot be negative.");
        }
        srVar.a.b = i;
        sr srVar2 = srVar.b;
        long j = lttVar.ttlMs_;
        if (j < 0) {
            throw new IllegalArgumentException("Document ttlMillis cannot be negative.");
        }
        srVar2.a.c(j);
        sr srVarA = srVar2.b.a(lttVar.creationTimestampMs_);
        int i2 = 0;
        while (i2 < ltuVar2.b()) {
            luz luzVarC = ltuVar2.c(i2);
            String str3 = luzVarC.name_;
            if (luzVarC.h() > 0) {
                int iH = luzVarC.h();
                String[] strArr = new String[iH];
                for (int i3 = 0; i3 < iH; i3++) {
                    strArr[i3] = (String) luzVarC.stringValues_.get(i3);
                }
                srVarA.i(str3, strArr);
            } else if (luzVarC.g() > 0) {
                int iG = luzVarC.g();
                long[] jArr = new long[iG];
                for (int i4 = 0; i4 < iG; i4++) {
                    jArr[i4] = luzVarC.int64Values_.a(i4);
                }
                srVarA.h(str3, jArr);
            } else if (luzVarC.f() > 0) {
                int iF = luzVarC.f();
                double[] dArr = new double[iF];
                for (int i5 = 0; i5 < iF; i5++) {
                    dArr[i5] = luzVarC.doubleValues_.d(i5);
                }
                srVarA.f(str3, dArr);
            } else if (luzVarC.c() > 0) {
                int iC = luzVarC.c();
                boolean[] zArr = new boolean[iC];
                for (int i6 = 0; i6 < iC; i6++) {
                    zArr[i6] = luzVarC.booleanValues_.g(i6);
                }
                srVarA.b(str3, zArr);
            } else if (luzVarC.d() > 0) {
                int iD = luzVarC.d();
                byte[][] bArr = new byte[iD][];
                for (int i7 = 0; i7 < iD; i7++) {
                    bArr[i7] = ((lxa) luzVarC.bytesValues_.get(i7)).j();
                }
                srVarA.c(str3, bArr);
            } else if (luzVarC.e() > 0) {
                int iE = luzVarC.e();
                ss[] ssVarArr = new ss[iE];
                for (int i8 = 0; i8 < iE; i8++) {
                    ssVarArr[i8] = c(luzVarC.j(i8), str2, depVar2, aVar);
                }
                srVarA.e(str3, ssVarArr);
            } else if (luzVarC.i() > 0) {
                int i9 = luzVarC.i();
                sp[] spVarArr = new sp[i9];
                for (int i10 = 0; i10 < i9; i10++) {
                    luy luyVar = (luy) luzVarC.vectorValues_.get(i10);
                    azs.l(luyVar);
                    if (luyVar.b() > 0) {
                        float[] fArr = new float[luyVar.b()];
                        for (int i11 = 0; i11 < luyVar.b(); i11++) {
                            fArr[i11] = luyVar.values_.d(i11);
                        }
                        spVar = new sp(fArr, luyVar.modelSignature_, null);
                    } else {
                        byte[] bArrJ = luyVar.quantizedValues_.j();
                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrJ).order(ByteOrder.LITTLE_ENDIAN);
                        float f2 = byteBufferOrder.getFloat();
                        float f3 = byteBufferOrder.getFloat();
                        byte[] bArr2 = new byte[bArrJ.length - 8];
                        byteBufferOrder.get(bArr2);
                        spVar = new sp(null, luyVar.modelSignature_, new so(f2, f3, bArr2));
                    }
                    spVarArr[i10] = spVar;
                }
                srVarA.g(str3, spVarArr);
            } else {
                if (luzVarC.b() <= 0) {
                    lvq lvqVar = (lvq) mapG.get(strConcat);
                    azs.l(lvqVar);
                    int i12 = 0;
                    while (true) {
                        if (i12 < lvqVar.c()) {
                            if (str3.equals(lvqVar.d(i12).propertyName_)) {
                                switch (lvqVar.d(i12).g() - 1) {
                                    case 1:
                                        srVarA.i(str3, a);
                                        continue;
                                        break;
                                    case 2:
                                        srVarA.h(str3, b);
                                        continue;
                                        break;
                                    case 3:
                                        srVarA.f(str3, c);
                                        continue;
                                        break;
                                    case 4:
                                        srVarA.b(str3, d);
                                        continue;
                                        break;
                                    case 5:
                                        srVarA.c(str3, e);
                                        continue;
                                        break;
                                    case 6:
                                        srVarA.e(str3, f);
                                        continue;
                                        break;
                                    case 7:
                                        srVarA.g(str3, g);
                                        continue;
                                        break;
                                }
                            }
                            i12++;
                        }
                        throw new IllegalStateException("Unknown type of value: ".concat(String.valueOf(str3)));
                    }
                }
                int iB = luzVarC.b();
                rw[] rwVarArr = new rw[iB];
                for (int i13 = 0; i13 < iB; i13++) {
                    lux luxVar = (lux) luzVarC.blobHandleValues_.get(i13);
                    String strG = ed.g(luxVar.namespace_);
                    byte[] bArrJ2 = luxVar.digest_.j();
                    String strF = ed.f(strG);
                    String strE = ed.e(strG);
                    String strH = ed.h(luxVar.namespace_);
                    azs.f(bArrJ2.length == 32, "The digest is not a SHA-256 digest");
                    azs.l(strF);
                    azs.l(strE);
                    azs.l(strH);
                    rwVarArr[i13] = new rw(bArrJ2, strF, strE, strH);
                }
                azs.l(str3);
                sr.j(str3);
                for (int i14 = 0; i14 < iB; i14++) {
                    if (rwVarArr[i14] == null) {
                        throw new IllegalArgumentException(a.bP(i14, "The BlobHandle at ", " is null."));
                    }
                }
                uy uyVar = srVarA.a;
                vh vhVar = new vh(str3);
                vhVar.g = rwVarArr;
                uyVar.b(str3, vhVar.a());
            }
            i2++;
            ltuVar2 = ltuVar;
            str2 = str;
            depVar2 = depVar;
        }
        return srVarA.d();
    }
}
