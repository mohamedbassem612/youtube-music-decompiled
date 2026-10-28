package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string;
        vdf vdfVarA = vdg.a();
        vdfVarA.r(true);
        vdfVarA.a = parcel.readString();
        vdfVarA.b = parcel.readString();
        vdfVarA.p(parcel.readLong());
        String string2 = parcel.readString();
        if (string2 != null) {
            vdfVarA.c = string2;
        }
        if (parcel.readInt() == 1) {
            try {
                byte[] bArrCreateByteArray = parcel.createByteArray();
                if (bArrCreateByteArray != null) {
                    vdfVarA.f = (aqmh) aihn.parseFrom(aqmh.a, bArrCreateByteArray, ExtensionRegistryLite.getGeneratedRegistry());
                }
            } catch (aiik e) {
                ((agrc) ((agrc) ((agrc) vdg.a.b()).j(e)).k("com/google/android/libraries/youtube/creation/music/ShortsCreationSelectedTrack$Builder$1", "createFromParcel", (char) 519, "ShortsCreationSelectedTrack.java")).t("Error parsing ShortsCreationSelectedTrack.Builder");
            }
        }
        String string3 = parcel.readString();
        if (string3 != null) {
            vdfVarA.g = string3;
        }
        vdfVarA.h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        long j = parcel.readLong();
        if (j != -1) {
            vdfVarA.k = Optional.of(Long.valueOf(j));
        }
        if (parcel.readInt() == 1 && (string = parcel.readString()) != null) {
            vdfVarA.l = Optional.of(string);
        }
        int i = parcel.readInt();
        if (i != -1) {
            byte[] bArr = new byte[i];
            parcel.readByteArray(bArr);
            vdfVarA.m = Optional.of(bArr);
        }
        if (parcel.readInt() == 1) {
            try {
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                if (bArrCreateByteArray2 != null) {
                    vdfVarA.d = (ajwo) aihn.parseFrom(ajwo.a, bArrCreateByteArray2, ExtensionRegistryLite.getGeneratedRegistry());
                }
            } catch (aiik e2) {
                ((agrc) ((agrc) ((agrc) vdg.a.b()).j(e2)).k("com/google/android/libraries/youtube/creation/music/ShortsCreationSelectedTrack$Builder$1", "createFromParcel", (char) 555, "ShortsCreationSelectedTrack.java")).t("Error parsing ShortsCreationSelectedTrack.Builder");
            }
        }
        if (parcel.readInt() == 1) {
            try {
                byte[] bArrCreateByteArray3 = parcel.createByteArray();
                if (bArrCreateByteArray3 != null) {
                    vdfVarA.e = (ajwo) aihn.parseFrom(ajwo.a, bArrCreateByteArray3, ExtensionRegistryLite.getGeneratedRegistry());
                }
            } catch (aiik e3) {
                ((agrc) ((agrc) ((agrc) vdg.a.b()).j(e3)).k("com/google/android/libraries/youtube/creation/music/ShortsCreationSelectedTrack$Builder$1", "createFromParcel", (char) 570, "ShortsCreationSelectedTrack.java")).t("Error parsing ShortsCreationSelectedTrack.Builder");
            }
        }
        vdfVarA.s(parcel.readLong());
        vdfVarA.l(parcel.readLong());
        vdfVarA.h(parcel.readLong());
        if (parcel.readInt() == 1) {
            try {
                byte[] bArrCreateByteArray4 = parcel.createByteArray();
                if (bArrCreateByteArray4 != null) {
                    vdfVarA.i = (apvm) aihn.parseFrom(apvm.a, bArrCreateByteArray4, ExtensionRegistryLite.getGeneratedRegistry());
                }
            } catch (aiik e4) {
                ((agrc) ((agrc) ((agrc) vdg.a.b()).j(e4)).k("com/google/android/libraries/youtube/creation/music/ShortsCreationSelectedTrack$Builder$1", "createFromParcel", (char) 590, "ShortsCreationSelectedTrack.java")).t("Error parsing ShortsCreationSelectedTrack.Builder");
            }
        }
        if (parcel.readInt() == 1) {
            try {
                byte[] bArrCreateByteArray5 = parcel.createByteArray();
                if (bArrCreateByteArray5 != null) {
                    vdfVarA.j = (apvy) aihn.parseFrom(apvy.a, bArrCreateByteArray5, ExtensionRegistryLite.getGeneratedRegistry());
                }
            } catch (aiik e5) {
                ((agrc) ((agrc) ((agrc) vdg.a.b()).j(e5)).k("com/google/android/libraries/youtube/creation/music/ShortsCreationSelectedTrack$Builder$1", "createFromParcel", (char) 605, "ShortsCreationSelectedTrack.java")).t("Error parsing ShortsCreationSelectedTrack.Builder");
            }
        }
        String string4 = parcel.readString();
        if (string4 != null) {
            vdfVarA.n = string4;
        }
        if (parcel.readInt() == 1) {
            try {
                byte[] bArrCreateByteArray6 = parcel.createByteArray();
                if (bArrCreateByteArray6 != null) {
                    vdfVarA.p = (auhu) aihn.parseFrom(auhu.a, bArrCreateByteArray6, ExtensionRegistryLite.getGeneratedRegistry());
                }
            } catch (aiik e6) {
                ((agrc) ((agrc) ((agrc) vdg.a.b()).j(e6)).k("com/google/android/libraries/youtube/creation/music/ShortsCreationSelectedTrack$Builder$1", "createFromParcel", (char) 627, "ShortsCreationSelectedTrack.java")).t("Error parsing ShortsCreationSelectedTrack.Builder");
            }
        }
        String string5 = parcel.readString();
        if (string5 != null) {
            vdfVarA.s = string5;
        }
        vdfVarA.n(Duration.ofMillis(parcel.readLong()));
        vdfVarA.m(Duration.ofMillis(parcel.readLong()));
        vdfVarA.i(parcel.readInt() == 1);
        vdfVarA.q(parcel.readFloat());
        if (parcel.readInt() == 1) {
            vdfVarA.t = (wgs) parcel.readParcelable(wgs.class.getClassLoader());
        }
        if (parcel.readInt() == 1) {
            vdfVarA.u = (wiu) parcel.readParcelable(wiu.class.getClassLoader());
        }
        if (parcel.readInt() == 1) {
            try {
                byte[] bArrCreateByteArray7 = parcel.createByteArray();
                if (bArrCreateByteArray7 != null) {
                    vdfVarA.v = (ajai) aihn.parseFrom(ajai.a, bArrCreateByteArray7, ExtensionRegistryLite.getGeneratedRegistry());
                }
            } catch (aiik e7) {
                ((agrc) ((agrc) ((agrc) vdg.a.b()).j(e7)).k("com/google/android/libraries/youtube/creation/music/ShortsCreationSelectedTrack$Builder$1", "createFromParcel", (char) 662, "ShortsCreationSelectedTrack.java")).t("Error parsing ShortsCreationSelectedTrack.Builder aiProvenance");
            }
        }
        vdfVarA.j(parcel.readInt() == 1);
        vdfVarA.g(parcel.readInt() == 1);
        vdfVarA.k(parcel.readInt() == 1);
        return vdfVarA;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new vdf[i];
    }
}
