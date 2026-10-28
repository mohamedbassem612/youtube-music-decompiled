package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vi extends vm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new vj(0);
    public final String a;
    public final String[] b;
    public final long[] c;
    public final double[] d;
    public final boolean[] e;
    public final byte[][] f;
    public final uz[] g;
    public final sp[] h;
    public final rw[] i;
    private Integer j;

    public vi(String str, String[] strArr, long[] jArr, double[] dArr, boolean[] zArr, byte[][] bArr, uz[] uzVarArr, sp[] spVarArr, rw[] rwVarArr) {
        super((byte[]) null);
        this.a = str;
        this.b = strArr;
        this.c = jArr;
        this.d = dArr;
        this.e = zArr;
        this.f = bArr;
        this.g = uzVarArr;
        this.h = spVarArr;
        this.i = rwVarArr;
        int i = strArr != null ? 1 : 0;
        i = jArr != null ? i + 1 : i;
        i = dArr != null ? i + 1 : i;
        i = zArr != null ? i + 1 : i;
        i = bArr != null ? i + 1 : i;
        i = uzVarArr != null ? i + 1 : i;
        i = spVarArr != null ? i + 1 : i;
        i = rwVarArr != null ? i + 1 : i;
        if (i == 0 || i > 1) {
            throw new IllegalArgumentException("One and only one type array can be set in PropertyParcel");
        }
    }

    public final Object a() {
        String[] strArr = this.b;
        if (strArr != null) {
            return strArr;
        }
        long[] jArr = this.c;
        if (jArr != null) {
            return jArr;
        }
        double[] dArr = this.d;
        if (dArr != null) {
            return dArr;
        }
        boolean[] zArr = this.e;
        if (zArr != null) {
            return zArr;
        }
        byte[][] bArr = this.f;
        if (bArr != null) {
            return bArr;
        }
        uz[] uzVarArr = this.g;
        if (uzVarArr != null) {
            return uzVarArr;
        }
        sp[] spVarArr = this.h;
        if (spVarArr != null) {
            return spVarArr;
        }
        rw[] rwVarArr = this.i;
        if (rwVarArr == null) {
            return null;
        }
        return rwVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vi) {
            vi viVar = (vi) obj;
            if (this.a.equals(viVar.a) && Arrays.equals(this.b, viVar.b) && Arrays.equals(this.c, viVar.c) && Arrays.equals(this.d, viVar.d) && Arrays.equals(this.e, viVar.e) && Arrays.deepEquals(this.f, viVar.f) && Arrays.equals(this.g, viVar.g) && Arrays.deepEquals(this.h, viVar.h) && Arrays.deepEquals(this.i, viVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iDeepHashCode;
        Integer numValueOf = this.j;
        if (numValueOf == null) {
            String[] strArr = this.b;
            if (strArr != null) {
                iDeepHashCode = Arrays.hashCode(strArr);
            } else {
                long[] jArr = this.c;
                if (jArr != null) {
                    iDeepHashCode = Arrays.hashCode(jArr);
                } else {
                    double[] dArr = this.d;
                    if (dArr != null) {
                        iDeepHashCode = Arrays.hashCode(dArr);
                    } else {
                        boolean[] zArr = this.e;
                        if (zArr != null) {
                            iDeepHashCode = Arrays.hashCode(zArr);
                        } else {
                            byte[][] bArr = this.f;
                            if (bArr != null) {
                                iDeepHashCode = Arrays.deepHashCode(bArr);
                            } else {
                                uz[] uzVarArr = this.g;
                                if (uzVarArr != null) {
                                    iDeepHashCode = Arrays.hashCode(uzVarArr);
                                } else {
                                    sp[] spVarArr = this.h;
                                    if (spVarArr != null) {
                                        iDeepHashCode = Arrays.deepHashCode(spVarArr);
                                    } else {
                                        rw[] rwVarArr = this.i;
                                        iDeepHashCode = rwVarArr != null ? Arrays.deepHashCode(rwVarArr) : 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            numValueOf = Integer.valueOf(Objects.hash(this.a, Integer.valueOf(iDeepHashCode)));
            this.j = numValueOf;
        }
        return numValueOf.intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("propertyName", this.a);
        String[] strArr = this.b;
        if (strArr != null) {
            bundle.putStringArray("stringArray", strArr);
        } else {
            long[] jArr = this.c;
            if (jArr != null) {
                bundle.putLongArray("longArray", jArr);
            } else {
                double[] dArr = this.d;
                if (dArr != null) {
                    bundle.putDoubleArray("doubleArray", dArr);
                } else {
                    boolean[] zArr = this.e;
                    if (zArr != null) {
                        bundle.putBooleanArray("booleanArray", zArr);
                    } else {
                        byte[][] bArr = this.f;
                        int i2 = 0;
                        if (bArr != null) {
                            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(bArr.length);
                            while (i2 < bArr.length) {
                                Bundle bundle2 = new Bundle();
                                bundle2.putByteArray("byteArray", bArr[i2]);
                                arrayList.add(bundle2);
                                i2++;
                            }
                            bundle.putParcelableArrayList("bytesArray", arrayList);
                        } else {
                            uz[] uzVarArr = this.g;
                            if (uzVarArr != null) {
                                bundle.putParcelableArray("docArray", uzVarArr);
                            } else {
                                sp[] spVarArr = this.h;
                                if (spVarArr != null) {
                                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(spVarArr.length);
                                    while (i2 < spVarArr.length) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putFloatArray("embeddingValue", spVarArr[i2].a);
                                        bundle3.putString("embeddingModelSignature", spVarArr[i2].b);
                                        arrayList2.add(bundle3);
                                        i2++;
                                    }
                                    bundle.putParcelableArrayList("embeddingArray", arrayList2);
                                }
                            }
                        }
                    }
                }
            }
        }
        parcel.writeBundle(bundle);
    }
}
