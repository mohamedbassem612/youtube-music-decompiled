package defpackage;

import android.os.Handler;
import android.util.SparseArray;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.chromium.base.AndroidInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class boy {
    public final Object a;
    public final Object b;

    public boy(bsb bsbVar, SparseArray sparseArray) {
        this.a = bsbVar;
        SparseArray sparseArray2 = new SparseArray(bsbVar.b());
        for (int i = 0; i < bsbVar.b(); i++) {
            int iA = bsbVar.a(i);
            cdy cdyVar = (cdy) sparseArray.get(iA);
            cdyVar.getClass();
            sparseArray2.append(iA, cdyVar);
        }
        this.b = sparseArray2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c A[Catch: IOException -> 0x0259, TryCatch #0 {IOException -> 0x0259, blocks: (B:3:0x0002, B:4:0x000c, B:6:0x000f, B:8:0x0020, B:10:0x0028, B:20:0x003c, B:21:0x003f, B:22:0x004b, B:24:0x0050, B:25:0x0053, B:31:0x006e, B:33:0x0080, B:32:0x0077, B:34:0x0085, B:35:0x0090, B:36:0x0091, B:38:0x00ac, B:39:0x00af, B:41:0x00bb, B:44:0x00ca, B:51:0x00e4, B:53:0x00f2, B:56:0x00f8, B:58:0x00fe, B:57:0x00fb, B:59:0x010a, B:60:0x0117, B:61:0x0118, B:62:0x0125, B:63:0x0126, B:66:0x0133, B:68:0x0139, B:69:0x0142, B:71:0x0148, B:73:0x015b, B:75:0x0165, B:77:0x017b, B:78:0x0188, B:79:0x018b, B:80:0x019d, B:82:0x01a0, B:84:0x01ba, B:86:0x01cc, B:88:0x01d2, B:90:0x01e4, B:96:0x0241, B:91:0x0208, B:93:0x0234, B:94:0x023e, B:97:0x024b, B:98:0x0250, B:99:0x0251, B:100:0x0258), top: B:104:0x0002 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static boy s(String... strArr) {
        int iB;
        int i;
        axii axiiVar;
        String str;
        try {
            int length = strArr.length;
            axii[] axiiVarArr = new axii[length];
            axig axigVar = new axig();
            int i2 = 0;
            for (int i3 = 0; i3 < strArr.length; i3++) {
                String str2 = strArr[i3];
                String[] strArr2 = emz.a;
                axigVar.o(34);
                int length2 = str2.length();
                int i4 = 0;
                for (int i5 = 0; i5 < length2; i5++) {
                    char cCharAt = str2.charAt(i5);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i4 < i5) {
                                axigVar.q(str2, i4, i5);
                            }
                            str.getClass();
                            axigVar.q(str, 0, str.length());
                            i4 = i5 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i4 < i5) {
                            axigVar.q(str2, i4, i5);
                        }
                        str.getClass();
                        axigVar.q(str, 0, str.length());
                        i4 = i5 + 1;
                    }
                }
                if (i4 < length2) {
                    axigVar.q(str2, i4, length2);
                }
                axigVar.o(34);
                axigVar.b();
                long j = axigVar.b;
                if (j < 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(a.bS(j, "byteCount: "));
                }
                if (j >= 4096) {
                    axiiVar = axigVar.h((int) j);
                    axigVar.k(j);
                } else {
                    axiiVar = new axii(axigVar.m(j));
                }
                axiiVarArr[i3] = axiiVar;
            }
            String[] strArr3 = (String[]) strArr.clone();
            AndroidInfo androidInfo = axik.c;
            ArrayList arrayList = new ArrayList(new awnl(axiiVarArr, false));
            int i6 = 1;
            if (arrayList.size() > 1) {
                Collections.sort(arrayList);
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                arrayList2.add(-1);
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                axii axiiVar2 = axiiVarArr[i8];
                int i10 = i9 + 1;
                int size2 = arrayList.size();
                int size3 = arrayList.size();
                if (size2 < 0) {
                    throw new IllegalArgumentException(a.cj(size2, 0, "fromIndex (", ") is greater than toIndex (", ")."));
                }
                if (size2 > size3) {
                    throw new IndexOutOfBoundsException(a.cj(size3, size2, "toIndex (", ") is greater than size (", ")."));
                }
                int i11 = size2 - 1;
                int i12 = 0;
                while (true) {
                    if (i12 > i11) {
                        i = -(i12 + 1);
                        break;
                    }
                    i = (i12 + i11) >>> i6;
                    int iF = atqq.f((Comparable) arrayList.get(i), axiiVar2);
                    if (iF >= 0) {
                        if (iF <= 0) {
                            break;
                        }
                        i11 = i - 1;
                    } else {
                        i12 = i + 1;
                    }
                    i6 = 1;
                }
                arrayList2.set(i, Integer.valueOf(i9));
                i8++;
                i9 = i10;
                i6 = 1;
            }
            if (((axii) arrayList.get(0)).b() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i13 = 0;
            while (i13 < arrayList.size()) {
                axii axiiVar3 = (axii) arrayList.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < arrayList.size()) {
                    axii axiiVar4 = (axii) arrayList.get(i15);
                    axiiVar3.getClass();
                    if (!axiiVar4.g(axiiVar3, axiiVar3.b())) {
                        break;
                    }
                    if (axiiVar4.b() == axiiVar3.b()) {
                        Objects.toString(axiiVar4);
                        throw new IllegalArgumentException("duplicate option: ".concat(String.valueOf(axiiVar4)));
                    }
                    if (((Number) arrayList2.get(i15)).intValue() > ((Number) arrayList2.get(i13)).intValue()) {
                        arrayList.remove(i15);
                        ((Number) arrayList2.remove(i15)).intValue();
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            axig axigVar2 = new axig();
            androidInfo.a(0L, axigVar2, 0, arrayList, 0, arrayList.size(), arrayList2);
            long j2 = 4;
            int i16 = (int) (axigVar2.b / 4);
            int[] iArr = new int[i16];
            while (i2 < i16) {
                long j3 = axigVar2.b;
                if (j3 < j2) {
                    throw new EOFException();
                }
                axio axioVar = axigVar2.a;
                axioVar.getClass();
                int i17 = axioVar.b;
                int i18 = axioVar.c;
                long j4 = j2;
                if (i18 - i17 < j4) {
                    iB = ((axigVar2.b() & 255) << 24) | ((axigVar2.b() & 255) << 16) | ((axigVar2.b() & 255) << 8) | (axigVar2.b() & 255);
                } else {
                    byte[] bArr = axioVar.a;
                    int i19 = i17 + 3;
                    int i20 = ((bArr[i17] & 255) << 24) | ((bArr[i17 + 1] & 255) << 16) | ((bArr[i17 + 2] & 255) << 8);
                    int i21 = i17 + 4;
                    int i22 = (bArr[i19] & 255) | i20;
                    axigVar2.b = j3 - 4;
                    if (i21 == i18) {
                        axigVar2.a = axioVar.a();
                        axip.b(axioVar);
                    } else {
                        axioVar.b = i21;
                    }
                    iB = i22;
                }
                iArr[i2] = iB;
                i2++;
                strArr3 = strArr3;
                j2 = j4;
            }
            Object[] objArrCopyOf = Arrays.copyOf(axiiVarArr, length);
            objArrCopyOf.getClass();
            return new boy(strArr3, new axik((axii[]) objArrCopyOf, iArr));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    public final Object a(String str) {
        Object objC;
        Object obj = this.b;
        try {
            axaf axafVar = (axaf) ((axfd) obj).e.get(str);
            return (axafVar == null || (objC = axafVar.c()) == null) ? ((axfd) obj).c.get(str) : objC;
        } catch (ClassCastException unused) {
            ((axfd) obj).ay(str);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final void b(String str, dos dosVar) {
        ((axfd) this.b).b.put(str, dosVar);
    }

    public final void c(Exception exc) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new cfv(this, exc, 4, null));
        }
    }

    public final void d(int i) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new awu(this, i, 3));
        }
    }

    public final void e(Exception exc) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new cfv(this, exc, 5, null));
        }
    }

    public final void f(String str, long j, long j2) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new ctw(this, str, j, j2, 1));
        }
    }

    public final void g(String str) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new cfv(this, str, 6, null));
        }
    }

    public final void h(cay cayVar) {
        cayVar.a();
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new cfv(this, cayVar, 0));
        }
    }

    public final void i(cay cayVar) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new blq((Object) this, (Object) cayVar, 20, (byte[]) null));
        }
    }

    public final void j(bse bseVar, caz cazVar) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new bf((Object) this, bseVar, cazVar, 10));
        }
    }

    public final void k(long j) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new jup(this, j, 1));
        }
    }

    public final void l(boolean z) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new csd(this, z, 1));
        }
    }

    public final void m(final int i, final long j, final long j2) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new Runnable() { // from class: cfw
                /* JADX WARN: Type inference failed for: r0v2, types: [cfx, java.lang.Object] */
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = bwp.a;
                    this.d.a.h(i, j, j2);
                }
            });
        }
    }

    public final int n() {
        return ((bsb) this.a).b();
    }

    public final cdy o(int i) {
        cdy cdyVar = (cdy) ((SparseArray) this.b).get(i);
        cdyVar.getClass();
        return cdyVar;
    }

    public final boolean p(int i) {
        return ((bsb) this.a).c(i);
    }

    public final void q(cri criVar) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new cfv(this, criVar, 2, null));
        }
    }

    public final void r(cri criVar) {
        Object obj = this.b;
        if (obj != null) {
            ((Handler) obj).post(new cfv(this, criVar, 3, null));
        }
    }

    public boy(boc bocVar) {
        bocVar.getClass();
        this.b = bocVar;
        this.a = new ArrayList();
    }

    public boy() {
        this.a = new LinkedHashMap();
        this.b = new axfd(awnp.a);
    }

    public boy(Map map) {
        this.a = new LinkedHashMap();
        this.b = new axfd(map);
    }

    private boy(String[] strArr, axik axikVar) {
        this.a = strArr;
        this.b = axikVar;
    }

    public boy(Handler handler, cfx cfxVar) {
        if (cfxVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.a = cfxVar;
    }

    public boy(eir eirVar) {
        this.a = new ArrayList();
        this.b = eirVar;
    }
}
