package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class skl implements Parcelable {
    public final wgj b;
    public final int c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final byte[] h;
    public static final agkj a = agpn.b;
    public static final Parcelable.Creator CREATOR = new pyc(10);

    public skl(wgj wgjVar, int i, boolean z, String str, String str2, String str3, byte[] bArr) {
        wgjVar.getClass();
        this.b = wgjVar;
        this.c = i;
        this.d = z;
        typ.f(str);
        this.e = str;
        typ.f(str2);
        this.f = str2;
        if (b() != slm.PRE_ROLL) {
            str3 = null;
        } else if (z) {
            str3 = "";
        }
        this.g = str3;
        this.h = bArr;
    }

    public static slm c(wgj wgjVar) {
        int iBi = a.bi(wgjVar.a.f);
        if (iBi == 0) {
            iBi = 1;
        }
        int i = iBi - 1;
        if (i == 1) {
            return slm.PRE_ROLL;
        }
        if (i != 2) {
            if (i == 3) {
                return slm.POST_ROLL;
            }
            if (i != 6) {
                if (i != 7) {
                    return null;
                }
                return slm.PAUSE;
            }
        }
        return slm.MID_ROLL;
    }

    public final long a() {
        aisu aisuVar = this.b.a;
        int iBi = a.bi(aisuVar.f);
        if (iBi == 0 || iBi != 4) {
            return Math.max(aisuVar.c, 0);
        }
        return -1L;
    }

    public final slm b() {
        return c(this.b);
    }

    public final aivr d() {
        aivr aivrVar = this.b.a.j;
        return aivrVar == null ? aivr.a : aivrVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        wgj wgjVar = this.b;
        return wgjVar.a() == null ? "" : wgjVar.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof skl)) {
            return false;
        }
        skl sklVar = (skl) obj;
        return Objects.equals(this.b, sklVar.b) && this.c == sklVar.c && Objects.equals(this.e, sklVar.e) && Objects.equals(this.g, sklVar.g) && Arrays.equals(this.h, sklVar.h);
    }

    public final List f() {
        return this.b.b();
    }

    public final List g() {
        return this.b.c();
    }

    public final List h() {
        return this.b.d();
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.c), this.e, Integer.valueOf(Arrays.hashCode(this.h)));
    }

    public final String toString() {
        return String.format("InstreamAdBreak: [breakType:%s, adBreakIndex:%s, offset:%s, originalVideoId:%s]", b(), Integer.valueOf(this.c), Long.valueOf(a()), this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        byte[] bArr = this.h;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }
}
