package defpackage;

import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.model.Alert;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import org.chromium.base.IAndroidInfo;
import org.chromium.base.IApkInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afhl implements Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public afhl(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.$cid;
        if (i == 0) {
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            return new afhm(i2 == 1, i3 == 1, (Intent) parcel.readParcelable(getClass().getClassLoader()));
        }
        if (i == 1) {
            return new affg(parcel);
        }
        if (i == 2) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            return new ProtoParsers$InternalDontUse(bArr, null);
        }
        if (i != 3) {
            IApkInfo iApkInfo = new IApkInfo();
            int iDataPosition = parcel.dataPosition();
            int i4 = parcel.readInt();
            try {
                if (i4 < 4) {
                    throw new BadParcelableException("Parcelable too small");
                }
                if (parcel.dataPosition() - iDataPosition < i4) {
                    iApkInfo.a = parcel.readString();
                    if (parcel.dataPosition() - iDataPosition < i4) {
                        iApkInfo.b = parcel.readString();
                        if (parcel.dataPosition() - iDataPosition < i4) {
                            iApkInfo.c = parcel.readString();
                            if (parcel.dataPosition() - iDataPosition < i4) {
                                iApkInfo.d = parcel.readString();
                                if (parcel.dataPosition() - iDataPosition < i4) {
                                    iApkInfo.e = parcel.readInt() != 0;
                                    if (parcel.dataPosition() - iDataPosition < i4) {
                                        iApkInfo.f = parcel.readInt() != 0;
                                        if (parcel.dataPosition() - iDataPosition < i4) {
                                            iApkInfo.g = parcel.readString();
                                            if (parcel.dataPosition() - iDataPosition < i4) {
                                                iApkInfo.h = parcel.readString();
                                                if (parcel.dataPosition() - iDataPosition < i4) {
                                                    iApkInfo.i = parcel.readString();
                                                    if (parcel.dataPosition() - iDataPosition < i4) {
                                                        iApkInfo.j = parcel.readString();
                                                        if (parcel.dataPosition() - iDataPosition < i4) {
                                                            iApkInfo.k = parcel.readInt();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (iDataPosition <= Alert.DURATION_SHOW_INDEFINITELY - i4) {
                    parcel.setDataPosition(iDataPosition + i4);
                    return iApkInfo;
                }
                throw new BadParcelableException("Overflow in the size of parcelable");
            } catch (Throwable th) {
                if (iDataPosition <= Alert.DURATION_SHOW_INDEFINITELY - i4) {
                    parcel.setDataPosition(iDataPosition + i4);
                    throw th;
                }
            }
        } else {
            IAndroidInfo iAndroidInfo = new IAndroidInfo();
            int iDataPosition2 = parcel.dataPosition();
            int i5 = parcel.readInt();
            try {
                if (i5 < 4) {
                    throw new BadParcelableException("Parcelable too small");
                }
                if (parcel.dataPosition() - iDataPosition2 < i5) {
                    iAndroidInfo.a = parcel.readString();
                    if (parcel.dataPosition() - iDataPosition2 < i5) {
                        iAndroidInfo.b = parcel.readString();
                        if (parcel.dataPosition() - iDataPosition2 < i5) {
                            iAndroidInfo.c = parcel.readString();
                            if (parcel.dataPosition() - iDataPosition2 < i5) {
                                iAndroidInfo.d = parcel.readString();
                                if (parcel.dataPosition() - iDataPosition2 < i5) {
                                    iAndroidInfo.e = parcel.readString();
                                    if (parcel.dataPosition() - iDataPosition2 < i5) {
                                        iAndroidInfo.f = parcel.readString();
                                        if (parcel.dataPosition() - iDataPosition2 < i5) {
                                            iAndroidInfo.g = parcel.readString();
                                            if (parcel.dataPosition() - iDataPosition2 < i5) {
                                                iAndroidInfo.h = parcel.readString();
                                                if (parcel.dataPosition() - iDataPosition2 < i5) {
                                                    iAndroidInfo.i = parcel.readString();
                                                    if (parcel.dataPosition() - iDataPosition2 < i5) {
                                                        iAndroidInfo.j = parcel.readInt() != 0;
                                                        if (parcel.dataPosition() - iDataPosition2 < i5) {
                                                            iAndroidInfo.k = parcel.readString();
                                                            if (parcel.dataPosition() - iDataPosition2 < i5) {
                                                                iAndroidInfo.l = parcel.readString();
                                                                if (parcel.dataPosition() - iDataPosition2 < i5) {
                                                                    iAndroidInfo.m = parcel.readInt();
                                                                    if (parcel.dataPosition() - iDataPosition2 < i5) {
                                                                        iAndroidInfo.n = parcel.readInt();
                                                                        if (parcel.dataPosition() - iDataPosition2 < i5) {
                                                                            iAndroidInfo.o = parcel.readString();
                                                                            if (parcel.dataPosition() - iDataPosition2 < i5) {
                                                                                iAndroidInfo.p = parcel.readString();
                                                                                if (parcel.dataPosition() - iDataPosition2 < i5) {
                                                                                    iAndroidInfo.q = parcel.readString();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (iDataPosition2 <= Alert.DURATION_SHOW_INDEFINITELY - i5) {
                    parcel.setDataPosition(iDataPosition2 + i5);
                    return iAndroidInfo;
                }
                throw new BadParcelableException("Overflow in the size of parcelable");
            } catch (Throwable th2) {
                if (iDataPosition2 <= Alert.DURATION_SHOW_INDEFINITELY - i5) {
                    parcel.setDataPosition(iDataPosition2 + i5);
                    throw th2;
                }
            }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            return new afhm[i];
        }
        if (i2 == 1) {
            return new affg[i];
        }
        if (i2 != 2) {
            return i2 != 3 ? new IApkInfo[i] : new IAndroidInfo[i];
        }
        return new ProtoParsers$InternalDontUse[i];
    }
}
