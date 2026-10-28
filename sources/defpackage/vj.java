package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vj implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public vj(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] byteArray;
        Object vaVar;
        int i = 0;
        switch (this.$cid) {
            case 0:
                Bundle bundle = parcel.readBundle(getClass().getClassLoader());
                bundle.getClass();
                String string = bundle.getString("propertyName");
                string.getClass();
                vh vhVar = new vh(string);
                String[] stringArray = bundle.getStringArray("stringArray");
                long[] longArray = bundle.getLongArray("longArray");
                double[] doubleArray = bundle.getDoubleArray("doubleArray");
                boolean[] booleanArray = bundle.getBooleanArray("booleanArray");
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("bytesArray");
                Parcelable[] parcelableArray = bundle.getParcelableArray("docArray");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("embeddingArray");
                if (stringArray != null) {
                    vhVar.b(stringArray);
                } else if (longArray != null) {
                    vhVar.a = longArray;
                } else if (doubleArray != null) {
                    vhVar.b = doubleArray;
                } else if (booleanArray != null) {
                    vhVar.c = booleanArray;
                } else if (parcelableArrayList != null) {
                    byte[][] bArr = new byte[parcelableArrayList.size()][];
                    while (i < parcelableArrayList.size()) {
                        Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                        if (bundle2 != null && (byteArray = bundle2.getByteArray("byteArray")) != null) {
                            bArr[i] = byteArray;
                        }
                        i++;
                    }
                    vhVar.d = bArr;
                } else if (parcelableArray != null) {
                    int length = parcelableArray.length;
                    uz[] uzVarArr = new uz[length];
                    System.arraycopy(parcelableArray, 0, uzVarArr, 0, length);
                    vhVar.e = uzVarArr;
                } else {
                    if (parcelableArrayList2 == null) {
                        throw new IllegalArgumentException("property bundle passed in doesn't have any value set.");
                    }
                    sp[] spVarArr = new sp[parcelableArrayList2.size()];
                    while (i < parcelableArrayList2.size()) {
                        Bundle bundle3 = (Bundle) parcelableArrayList2.get(i);
                        if (bundle3 != null) {
                            float[] floatArray = bundle3.getFloatArray("embeddingValue");
                            String string2 = bundle3.getString("embeddingModelSignature");
                            if (floatArray != null && string2 != null) {
                                spVarArr[i] = new sp(floatArray, string2, null);
                            }
                        }
                        i++;
                    }
                    vhVar.f = spVarArr;
                }
                return vhVar.a();
            case 1:
                Bundle bundle4 = parcel.readBundle(getClass().getClassLoader());
                bundle4.getClass();
                String string3 = bundle4.getString("packageName");
                string3.getClass();
                ArrayList parcelableArrayList3 = bundle4.getParcelableArrayList("sha256Certificates");
                if (parcelableArrayList3 == null || parcelableArrayList3.isEmpty()) {
                    byte[] byteArray2 = bundle4.getByteArray("sha256Certificate");
                    byteArray2.getClass();
                    vaVar = new va(string3, byteArray2, null);
                } else {
                    byte[][] bArr2 = new byte[parcelableArrayList3.size()][];
                    while (i < parcelableArrayList3.size()) {
                        Bundle bundle5 = (Bundle) parcelableArrayList3.get(i);
                        if (bundle5 != null) {
                            bArr2[i] = bundle5.getByteArray("sha256Certificate");
                        }
                        i++;
                    }
                    vaVar = new va(string3, null, bArr2);
                }
                break;
            case 2:
                Bundle bundle6 = parcel.readBundle(getClass().getClassLoader());
                bundle6.getClass();
                vaVar = new aek(bundle6);
                break;
            case 3:
                return new bdc(parcel);
            case 4:
                return new bsa(parcel);
            case 5:
                return new brz(parcel);
            case 6:
                return new btj(parcel);
            case 7:
                return new dkc(parcel);
            case 8:
                return new dkf(parcel);
            case 9:
                return new dkj(parcel);
            case 10:
                return new dkm(parcel);
            case 11:
                return new dkz(parcel);
            case 12:
                return new dll(parcel);
            case 13:
                return new dln(parcel);
            case 14:
                return new dqo(parcel);
            case 15:
                return new ParcelImpl(parcel);
            case 16:
                return new egv(parcel);
            case 17:
                return new hel(parcel);
            case 18:
                return new ijs(parcel);
            case 19:
                return new jvn(parcel);
            default:
                return new jvp(parcel);
        }
        return vaVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new vi[i];
            case 1:
                return new va[i];
            case 2:
                return new aek[i];
            case 3:
                return new bdc[i];
            case 4:
                return new bsa[i];
            case 5:
                return new brz[i];
            case 6:
                return new btj[i];
            case 7:
                return new dkc[i];
            case 8:
                return new dkf[i];
            case 9:
                return new dkj[i];
            case 10:
                return new dkm[i];
            case 11:
                return new dkz[i];
            case 12:
                return new dll[i];
            case 13:
                return new dln[i];
            case 14:
                return new dqo[i];
            case 15:
                return new ParcelImpl[i];
            case 16:
                return new egv[i];
            case 17:
                return new hel[i];
            case 18:
                return new ijs[i];
            case 19:
                return new jvn[i];
            default:
                return new jvp[i];
        }
    }
}
