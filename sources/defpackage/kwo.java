package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwo implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public kwo(int i) {
        this.$cid = i;
    }

    public static void a(lcd lcdVar, Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        String str = lcdVar.a;
        if (str != null) {
            int iG2 = ksy.g(parcel, 2);
            parcel.writeString(str);
            ksy.h(parcel, iG2);
        }
        ksy.A(parcel, 3, lcdVar.b, i);
        String str2 = lcdVar.c;
        if (str2 != null) {
            int iG3 = ksy.g(parcel, 4);
            parcel.writeString(str2);
            ksy.h(parcel, iG3);
        }
        long j = lcdVar.d;
        parcel.writeInt(524293);
        parcel.writeLong(j);
        long j2 = lcdVar.e;
        parcel.writeInt(524294);
        parcel.writeLong(j2);
        ksy.h(parcel, iG);
    }

    public static void b(lfy lfyVar, Parcel parcel) {
        int iG = ksy.g(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(lfyVar.a);
        String str = lfyVar.b;
        if (str != null) {
            int iG2 = ksy.g(parcel, 2);
            parcel.writeString(str);
            ksy.h(parcel, iG2);
        }
        long j = lfyVar.c;
        parcel.writeInt(524291);
        parcel.writeLong(j);
        ksy.z(parcel, 4, lfyVar.d);
        String str2 = lfyVar.e;
        if (str2 != null) {
            int iG3 = ksy.g(parcel, 6);
            parcel.writeString(str2);
            ksy.h(parcel, iG3);
        }
        String str3 = lfyVar.f;
        if (str3 != null) {
            int iG4 = ksy.g(parcel, 7);
            parcel.writeString(str3);
            ksy.h(parcel, iG4);
        }
        Double d = lfyVar.g;
        if (d != null) {
            parcel.writeInt(524296);
            parcel.writeDouble(d.doubleValue());
        }
        ksy.h(parcel, iG);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x0114  */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:52:0x011b  */
    /* JADX WARN: Code duplicated, block: B:53:0x011e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x0129  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0133  */
    /* JADX WARN: Code duplicated, block: B:64:0x0137  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object kwnVar;
        Object lbxVar;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        byte[] bArrAc = null;
        byte[] bArrAc2 = null;
        byte[][] bArrAh = null;
        lcc lccVar = null;
        Bundle bundleM = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        switch (this.$cid) {
            case 0:
                int iK = ksy.K(parcel);
                int i2 = 0;
                while (parcel.dataPosition() < iK) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 1) {
                        ksy.Z(parcel, i3, 4);
                        i2 = parcel.readInt();
                    } else if (c != 2) {
                        ksy.aa(parcel, i3);
                    } else {
                        bArrAc = ksy.ac(parcel, i3);
                    }
                }
                ksy.Y(parcel, iK);
                kwnVar = new kwn(i2, bArrAc);
                return kwnVar;
            case 1:
                int iK2 = ksy.K(parcel);
                String strT4 = null;
                int I = 0;
                while (parcel.dataPosition() < iK2) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        I = ksy.I(parcel, i4);
                    } else if (c2 == 2) {
                        strT3 = ksy.T(parcel, i4);
                    } else if (c2 != 3) {
                        ksy.aa(parcel, i4);
                    } else {
                        strT4 = ksy.T(parcel, i4);
                    }
                }
                ksy.Y(parcel, iK2);
                kwnVar = new kwm(I, strT3, strT4);
                return kwnVar;
            case 2:
                int iK3 = ksy.K(parcel);
                long jL = 0;
                long jL2 = 0;
                Bundle bundleM2 = null;
                String strT5 = null;
                boolean zAb = false;
                while (parcel.dataPosition() < iK3) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        jL = ksy.L(parcel, i5);
                    } else if (c3 == 2) {
                        jL2 = ksy.L(parcel, i5);
                    } else if (c3 == 3) {
                        zAb = ksy.ab(parcel, i5);
                    } else if (c3 == 7) {
                        bundleM2 = ksy.M(parcel, i5);
                    } else if (c3 != '\b') {
                        ksy.aa(parcel, i5);
                    } else {
                        strT5 = ksy.T(parcel, i5);
                    }
                }
                ksy.Y(parcel, iK3);
                return new kzu(jL, jL2, zAb, bundleM2, strT5);
            case 3:
                int iK4 = ksy.K(parcel);
                Intent intent = null;
                int I2 = 0;
                while (parcel.dataPosition() < iK4) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        I2 = ksy.I(parcel, i6);
                    } else if (c4 == 2) {
                        strT2 = ksy.T(parcel, i6);
                    } else if (c4 != 3) {
                        ksy.aa(parcel, i6);
                    } else {
                        intent = (Intent) ksy.O(parcel, i6, Intent.CREATOR);
                    }
                }
                ksy.Y(parcel, iK4);
                kwnVar = new kzv(I2, strT2, intent);
                return kwnVar;
            case 4:
                int iK5 = ksy.K(parcel);
                long jL3 = 0;
                String strT6 = null;
                int I3 = 0;
                while (parcel.dataPosition() < iK5) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 2) {
                        strT6 = ksy.T(parcel, i7);
                    } else if (c5 == 3) {
                        strT = ksy.T(parcel, i7);
                    } else if (c5 == 4) {
                        I3 = ksy.I(parcel, i7);
                    } else if (c5 != 5) {
                        ksy.aa(parcel, i7);
                    } else {
                        jL3 = ksy.L(parcel, i7);
                    }
                }
                ksy.Y(parcel, iK5);
                lbxVar = new lbx(strT6, strT, I3, jL3);
                return lbxVar;
            case 5:
                int iK6 = ksy.K(parcel);
                while (parcel.dataPosition() < iK6) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 2) {
                        ksy.aa(parcel, i8);
                    } else {
                        bundleM = ksy.M(parcel, i8);
                    }
                }
                ksy.Y(parcel, iK6);
                kwnVar = new lcc(bundleM);
                return kwnVar;
            case 6:
                int iK7 = ksy.K(parcel);
                long j = 0;
                long j2 = 0;
                String strT7 = null;
                String strT8 = null;
                while (parcel.dataPosition() < iK7) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 2) {
                        strT7 = ksy.T(parcel, i9);
                    } else if (c6 == 3) {
                        lccVar = (lcc) ksy.O(parcel, i9, lcc.CREATOR);
                    } else if (c6 == 4) {
                        strT8 = ksy.T(parcel, i9);
                    } else if (c6 == 5) {
                        ksy.Z(parcel, i9, 8);
                        j = parcel.readLong();
                    } else if (c6 != 6) {
                        ksy.aa(parcel, i9);
                    } else {
                        ksy.Z(parcel, i9, 8);
                        j2 = parcel.readLong();
                    }
                }
                ksy.Y(parcel, iK7);
                lbxVar = new lcd(strT7, lccVar, strT8, j, j2);
                return lbxVar;
            case 7:
                int iK8 = ksy.K(parcel);
                long j3 = 0;
                String strT9 = null;
                Long lS = null;
                Float fQ = null;
                String strT10 = null;
                String strT11 = null;
                Double dValueOf = null;
                int i10 = 0;
                while (parcel.dataPosition() < iK8) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            ksy.Z(parcel, i11, 4);
                            i10 = parcel.readInt();
                            break;
                        case 2:
                            strT9 = ksy.T(parcel, i11);
                            break;
                        case 3:
                            ksy.Z(parcel, i11, 8);
                            j3 = parcel.readLong();
                            break;
                        case 4:
                            lS = ksy.S(parcel, i11);
                            break;
                        case 5:
                            fQ = ksy.Q(parcel, i11);
                            break;
                        case 6:
                            strT10 = ksy.T(parcel, i11);
                            break;
                        case 7:
                            strT11 = ksy.T(parcel, i11);
                            break;
                        case '\b':
                            int iJ = ksy.J(parcel, i11);
                            if (iJ != 0) {
                                ksy.ai(parcel, iJ, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            } else {
                                dValueOf = null;
                            }
                            break;
                        default:
                            ksy.aa(parcel, i11);
                            break;
                    }
                }
                ksy.Y(parcel, iK8);
                return new lfy(i10, strT9, j3, lS, fQ, strT10, strT11, dValueOf);
            case 8:
                int iK9 = ksy.K(parcel);
                String strT12 = null;
                byte[] bArrAc3 = null;
                byte[][] bArrAh2 = null;
                byte[][] bArrAh3 = null;
                byte[][] bArrAh4 = null;
                byte[][] bArrAh5 = null;
                int[] iArrAd = null;
                byte[][] bArrAh6 = null;
                int[] iArrAd2 = null;
                while (parcel.dataPosition() < iK9) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            strT12 = ksy.T(parcel, i12);
                            break;
                        case 3:
                            bArrAc3 = ksy.ac(parcel, i12);
                            break;
                        case 4:
                            bArrAh2 = ksy.ah(parcel, i12);
                            break;
                        case 5:
                            bArrAh3 = ksy.ah(parcel, i12);
                            break;
                        case 6:
                            bArrAh4 = ksy.ah(parcel, i12);
                            break;
                        case 7:
                            bArrAh5 = ksy.ah(parcel, i12);
                            break;
                        case '\b':
                            iArrAd = ksy.ad(parcel, i12);
                            break;
                        case '\t':
                            bArrAh6 = ksy.ah(parcel, i12);
                            break;
                        case '\n':
                            iArrAd2 = ksy.ad(parcel, i12);
                            break;
                        case 11:
                            bArrAh = ksy.ah(parcel, i12);
                            break;
                        default:
                            ksy.aa(parcel, i12);
                            break;
                    }
                }
                ksy.Y(parcel, iK9);
                return new lle(strT12, bArrAc3, bArrAh2, bArrAh3, bArrAh4, bArrAh5, iArrAd, bArrAh6, iArrAd2, bArrAh);
            case 9:
                int iK10 = ksy.K(parcel);
                while (parcel.dataPosition() < iK10) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        ksy.aa(parcel, i13);
                    } else {
                        bArrAc2 = ksy.ac(parcel, i13);
                    }
                }
                ksy.Y(parcel, iK10);
                kwnVar = new llw(bArrAc2);
                return kwnVar;
            case 10:
                parcel.getClass();
                return new pxo(parcel.readString());
            case 11:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                int i16 = parcel.readInt();
                String string4 = parcel.readString();
                int i17 = parcel.readInt();
                int i18 = parcel.readInt();
                int i19 = parcel.readInt();
                String string5 = parcel.readString();
                switch (string5.hashCode()) {
                    case 549064719:
                        if (string5.equals("GAIA_DELEGATION_TYPE_UNKNOWN")) {
                            i = 1;
                            String string6 = parcel.readString();
                            if (i19 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i18 == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i17 == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (i16 == 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (i15 == 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i14 == 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            return new rlz(string, string2, string3, z6, z5, z4, string4, z3, z2, z, i, string6);
                        }
                        throw new IllegalArgumentException();
                    case 1384295528:
                        if (string5.equals("GAIA_DELEGATION_TYPE_EARLY")) {
                            i = 3;
                            String string7 = parcel.readString();
                            if (i19 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i18 == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i17 == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (i16 == 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (i15 == 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i14 == 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            return new rlz(string, string2, string3, z6, z5, z4, string4, z3, z2, z, i, string7);
                        }
                        throw new IllegalArgumentException();
                    case 1568883937:
                        if (string5.equals("GAIA_DELEGATION_TYPE_LATE")) {
                            i = 4;
                            String string8 = parcel.readString();
                            if (i19 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i18 == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i17 == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (i16 == 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (i15 == 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i14 == 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            return new rlz(string, string2, string3, z6, z5, z4, string4, z3, z2, z, i, string8);
                        }
                        throw new IllegalArgumentException();
                    case 1568956787:
                        if (string5.equals("GAIA_DELEGATION_TYPE_NONE")) {
                            i = 2;
                            String string9 = parcel.readString();
                            if (i19 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i18 == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i17 == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (i16 == 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (i15 == 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i14 == 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            return new rlz(string, string2, string3, z6, z5, z4, string4, z3, z2, z, i, string9);
                        }
                        throw new IllegalArgumentException();
                    default:
                        throw new IllegalArgumentException();
                }
            case 12:
                almd almdVar = (almd) wjr.E(parcel, almd.a);
                if (almdVar != null) {
                    return new wfy(almdVar);
                }
                return null;
            case 13:
                alaw alawVar = (alaw) tym.t(parcel, alaw.b);
                alawVar.getClass();
                String string10 = parcel.readString();
                parcel.readLong();
                return new wgs(alawVar, string10, tym.v(parcel), null);
            case 14:
                try {
                    return new wiu((aoqd) tym.t(parcel, aoqd.a));
                } catch (IllegalArgumentException unused) {
                    return wiu.c;
                }
            case 15:
                return new xgt(parcel);
            case 16:
                return new xhm(parcel);
            case 17:
                return new aavf(parcel);
            case 18:
                byte[] bArrCreateByteArray = parcel.createByteArray();
                String string11 = parcel.readString();
                if (bArrCreateByteArray == null) {
                    abnl abnlVarA = new abnk().a();
                    abnlVarA.c = string11;
                    return abnlVarA;
                }
                try {
                    jrk jrkVar = (jrk) aihn.parseFrom(jrk.a, bArrCreateByteArray, ExtensionRegistryLite.getGeneratedRegistry());
                    abnk abnkVar = new abnk();
                    abnkVar.q = jrkVar;
                    abnl abnlVarA2 = abnkVar.a();
                    abnlVarA2.c = string11;
                    return abnlVarA2;
                } catch (aiik unused2) {
                    return new abnk().a();
                }
            case 19:
                return affd.a(parcel.readInt());
            default:
                return new afff(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new kwn[i];
            case 1:
                return new kwm[i];
            case 2:
                return new kzu[i];
            case 3:
                return new kzv[i];
            case 4:
                return new lbx[i];
            case 5:
                return new lcc[i];
            case 6:
                return new lcd[i];
            case 7:
                return new lfy[i];
            case 8:
                return new lle[i];
            case 9:
                return new llw[i];
            case 10:
                return new pxo[i];
            case 11:
                return new rlz[i];
            case 12:
                return new wfy[i];
            case 13:
                return new wgs[i];
            case 14:
                return new wiu[i];
            case 15:
                return new xgt[i];
            case 16:
                return new xhm[i];
            case 17:
                return new aavf[i];
            case 18:
                return new abnl[i];
            case 19:
                return new affd[i];
            default:
                return new afff[i];
        }
    }
}
