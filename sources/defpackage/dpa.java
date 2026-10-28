package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpa implements dos, dot {
    public final awqg a;
    public boolean b;
    public boolean c = true;
    public final ayq d;

    public dpa(ayq ayqVar, awqg awqgVar) {
        this.d = ayqVar;
        this.a = awqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00be A[LOOP:0: B:18:0x007f->B:29:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1 A[EDGE_INSN: B:38:0x00c1->B:30:0x00c1 BREAK  A[LOOP:0: B:18:0x007f->B:29:0x00be], SYNTHETIC] */
    @Override // defpackage.dos
    public final Bundle a() {
        awml[] awmlVarArr;
        Bundle bundleH;
        int i;
        ayq ayqVar = this.d;
        synchronized (ayqVar.b) {
            Object obj = ayqVar.a;
            Map agoVar = ((agu) obj).f;
            if (agoVar == null) {
                agoVar = new ago((agu) obj);
                ((agu) obj).f = agoVar;
            }
            if (agoVar.isEmpty()) {
                awmlVarArr = new awml[0];
            } else {
                ArrayList arrayList = new ArrayList(agoVar.size());
                for (Map.Entry entry : agoVar.entrySet()) {
                    arrayList.add(new awml((String) entry.getKey(), entry.getValue()));
                }
                awmlVarArr = (awml[]) arrayList.toArray(new awml[0]);
            }
            bundleH = aie.h((awml[]) Arrays.copyOf(awmlVarArr, awmlVarArr.length));
            Object obj2 = ayqVar.c;
            Object[] objArr = ((agu) obj2).b;
            Object[] objArr2 = ((agu) obj2).c;
            long[] jArr = ((agu) obj2).a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = i2 - length;
                        int i4 = 0;
                        while (true) {
                            i = 8 - ((~i3) >>> 31);
                            if (i4 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                dox.a(bundleH, (String) objArr[i5], ((doz) objArr2[i5]).a());
                            }
                            j >>= 8;
                            i4++;
                        }
                        if (i != 8) {
                            break;
                        }
                        if (i2 != length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return bundleH;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Code duplicated, block: B:16:0x005b A[Catch: all -> 0x0095, TryCatch #0 {, blocks: (B:5:0x000e, B:6:0x001a, B:8:0x0020, B:10:0x002c, B:11:0x0034, B:14:0x004b, B:16:0x005b, B:17:0x005e, B:19:0x0067, B:21:0x0070), top: B:31:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0067 A[Catch: all -> 0x0095, TryCatch #0 {, blocks: (B:5:0x000e, B:6:0x001a, B:8:0x0020, B:10:0x002c, B:11:0x0034, B:14:0x004b, B:16:0x005b, B:17:0x005e, B:19:0x0067, B:21:0x0070), top: B:31:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0070 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x000e, B:6:0x001a, B:8:0x0020, B:10:0x002c, B:11:0x0034, B:14:0x004b, B:16:0x005b, B:17:0x005e, B:19:0x0067, B:21:0x0070), top: B:31:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:24:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0090 A[LOOP:0: B:14:0x004b->B:25:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0093 A[EDGE_INSN: B:33:0x0093->B:26:0x0093 BREAK  A[LOOP:0: B:14:0x004b->B:25:0x0090], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[EDGE_INSN: B:34:0x0093->B:26:0x0093 BREAK  A[LOOP:0: B:14:0x004b->B:25:0x0090], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x008c A[EDGE_INSN: B:35:0x008c->B:23:0x008c BREAK  A[LOOP:1: B:17:0x005e->B:22:0x0088], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0088 A[SYNTHETIC] */
    @Override // defpackage.dot
    public final void b(Bundle bundle) {
        Object[] objArr;
        Object[] objArr2;
        long[] jArr;
        int length;
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        this.b = true;
        ayq ayqVar = this.d;
        synchronized (ayqVar.b) {
            if (bundle == null) {
                Object obj = ayqVar.c;
                objArr = ((agu) obj).b;
                objArr2 = ((agu) obj).c;
                jArr = ((agu) obj).a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i = 0;
                    while (true) {
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            i2 = i - length;
                            i3 = 0;
                            while (true) {
                                i4 = 8 - ((~i2) >>> 31);
                                if (i3 < i4) {
                                    break;
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    int i5 = (i << 3) + i3;
                                    ((doz) objArr2[i5]).b((Bundle) ((agu) ayqVar.a).f((String) objArr[i5]));
                                }
                                j >>= 8;
                                i3++;
                            }
                            if (i4 == 8) {
                                break;
                                break;
                            } else {
                                if (i != length) {
                                    break;
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            } else {
                for (String str : doq.b(bundle).keySet()) {
                    Bundle bundleA = doq.a(bundle, str);
                    if (bundleA != null) {
                        ((agu) ayqVar.a).g(str, bundleA);
                    }
                }
                Object obj2 = ayqVar.c;
                objArr = ((agu) obj2).b;
                objArr2 = ((agu) obj2).c;
                jArr = ((agu) obj2).a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i = 0;
                    while (true) {
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            i2 = i - length;
                            i3 = 0;
                            while (true) {
                                i4 = 8 - ((~i2) >>> 31);
                                if (i3 < i4) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    int i6 = (i << 3) + i3;
                                    ((doz) objArr2[i6]).b((Bundle) ((agu) ayqVar.a).f((String) objArr[i6]));
                                }
                                j >>= 8;
                                i3++;
                            }
                            if (i4 == 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            throw th;
        }
    }
}
