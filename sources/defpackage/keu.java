package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class keu extends kry {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final kel G;
    public final boolean H;
    public final boolean I;
    private final int[] J;
    public final List c;
    public final long d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;
    public static final agke a = agke.r(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING);
    public static final int[] b = {0, 1};
    public static final Parcelable.Creator CREATOR = new kev();

    public keu(List list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder, boolean z, boolean z2) {
        kel kekVar;
        this.c = new ArrayList(list);
        this.J = Arrays.copyOf(iArr, iArr.length);
        this.d = j;
        this.e = str;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = i8;
        this.n = i9;
        this.o = i10;
        this.p = i11;
        this.q = i12;
        this.r = i13;
        this.s = i14;
        this.t = i15;
        this.u = i16;
        this.v = i17;
        this.w = i18;
        this.x = i19;
        this.y = i20;
        this.z = i21;
        this.A = i22;
        this.B = i23;
        this.C = i24;
        this.D = i25;
        this.E = i26;
        this.F = i27;
        this.H = z;
        this.I = z2;
        if (iBinder == null) {
            kekVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            kekVar = iInterfaceQueryLocalInterface instanceof kel ? (kel) iInterfaceQueryLocalInterface : new kek(iBinder);
        }
        this.G = kekVar;
    }

    public final int[] a() {
        int[] iArr = this.J;
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.c;
        int iG = ksy.g(parcel, 20293);
        ksy.D(parcel, 2, list);
        ksy.u(parcel, 3, a());
        ksy.m(parcel, 4, this.d);
        ksy.B(parcel, 5, this.e);
        ksy.l(parcel, 6, this.f);
        ksy.l(parcel, 7, this.g);
        ksy.l(parcel, 8, this.h);
        ksy.l(parcel, 9, this.i);
        ksy.l(parcel, 10, this.j);
        ksy.l(parcel, 11, this.k);
        ksy.l(parcel, 12, this.l);
        ksy.l(parcel, 13, this.m);
        ksy.l(parcel, 14, this.n);
        ksy.l(parcel, 15, this.o);
        ksy.l(parcel, 16, this.p);
        ksy.l(parcel, 17, this.q);
        ksy.l(parcel, 18, this.r);
        ksy.l(parcel, 19, this.s);
        ksy.l(parcel, 20, this.t);
        ksy.l(parcel, 21, this.u);
        ksy.l(parcel, 22, this.v);
        ksy.l(parcel, 23, this.w);
        ksy.l(parcel, 24, this.x);
        ksy.l(parcel, 25, this.y);
        ksy.l(parcel, 26, this.z);
        ksy.l(parcel, 27, this.A);
        ksy.l(parcel, 28, this.B);
        ksy.l(parcel, 29, this.C);
        ksy.l(parcel, 30, this.D);
        ksy.l(parcel, 31, this.E);
        ksy.l(parcel, 32, this.F);
        kel kelVar = this.G;
        ksy.t(parcel, 33, kelVar == null ? null : kelVar.asBinder());
        ksy.i(parcel, 34, this.H);
        ksy.i(parcel, 35, this.I);
        ksy.h(parcel, iG);
    }
}
