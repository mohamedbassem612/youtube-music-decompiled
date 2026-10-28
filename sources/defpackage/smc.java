package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class smc implements Parcelable, wgn {
    protected static final long g;
    protected static final byte[] h;
    public final String i;
    public final byte[] j;
    public final String k;
    public final String l;
    public final boolean m;
    public final wiu n;
    public final String o;
    public final long p;
    public final sno q;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        g = 259200000L;
        h = new byte[0];
    }

    protected smc(String str, byte[] bArr, String str2, String str3, boolean z, wiu wiuVar, String str4, long j, sno snoVar) {
        str.getClass();
        this.i = str;
        bArr.getClass();
        this.j = bArr;
        this.k = str2;
        str3.getClass();
        this.l = str3;
        this.m = z;
        wiuVar.getClass();
        this.n = wiuVar;
        this.o = str4;
        this.p = j;
        snoVar.getClass();
        this.q = snoVar;
    }

    public static boolean av(int i) {
        return i > 0;
    }

    public boolean A() {
        return m() > 0;
    }

    public wgm J() {
        return null;
    }

    public final List K() {
        return this.q.b;
    }

    public final List L() {
        return this.q.f;
    }

    public final List M() {
        return this.q.g;
    }

    public final List N() {
        return this.q.c;
    }

    public final List O() {
        return this.q.d;
    }

    public final List P() {
        return this.q.e;
    }

    public final List Q() {
        return this.q.h;
    }

    public final List R() {
        return this.q.i;
    }

    public final List S() {
        return this.q.j;
    }

    public final List T() {
        return this.q.k;
    }

    public final List U() {
        return this.q.l;
    }

    public final List V() {
        return this.q.m;
    }

    public final List W() {
        return this.q.n;
    }

    public final List X() {
        return this.q.o;
    }

    public final List Y() {
        return this.q.p;
    }

    public final List Z() {
        return this.q.t;
    }

    public abstract int a();

    public final List aa() {
        return this.q.q;
    }

    public final List ab() {
        return this.q.r;
    }

    public final List ac() {
        return this.q.s;
    }

    public final List ad() {
        return this.q.u;
    }

    public final List ae() {
        return this.q.v;
    }

    public final List af() {
        return this.q.w;
    }

    public final List ag() {
        return this.q.x;
    }

    public final List ah() {
        return this.q.y;
    }

    public final List ai() {
        return this.q.z;
    }

    public final List aj() {
        return this.q.A;
    }

    public final List ak() {
        return this.q.B;
    }

    public final List al() {
        return this.q.C;
    }

    public final List am() {
        return this.q.D;
    }

    public final List an() {
        return this.q.E;
    }

    public final List ao() {
        return this.q.F;
    }

    public final List ap() {
        return this.q.I;
    }

    public final List aq() {
        return this.q.G;
    }

    public final List ar() {
        return this.q.H;
    }

    public final List as() {
        return this.q.L;
    }

    public final List at() {
        return this.q.J;
    }

    public final List au() {
        return this.q.K;
    }

    public final int aw() {
        return this.q.M;
    }

    public Uri b() {
        return null;
    }

    public wjf c() {
        return null;
    }

    public aiwa d() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof smc)) {
            return false;
        }
        smc smcVar = (smc) obj;
        return Objects.equals(this.i, smcVar.i) && Arrays.equals(this.j, smcVar.j) && Objects.equals(this.k, smcVar.k) && Objects.equals(this.l, smcVar.l) && this.m == smcVar.m && Objects.equals(this.n, smcVar.n) && Objects.equals(this.o, smcVar.o) && this.p == smcVar.p && Objects.equals(this.q, smcVar.q);
    }

    public String h() {
        return "";
    }

    public final int hashCode() {
        return Objects.hash(this.o);
    }

    public String i() {
        return null;
    }

    public int iI() {
        return 0;
    }

    public int iJ() {
        return 0;
    }

    @Override // defpackage.wgn
    public final long iK() {
        return this.p;
    }

    public aiua iL() {
        return null;
    }

    public abstract String j();

    public String k() {
        return null;
    }

    public boolean l() {
        return false;
    }

    public int m() {
        return 0;
    }

    public aivo p() {
        return null;
    }

    public final String toString() {
        return getClass().getSimpleName() + '_' + this.o;
    }

    public String v() {
        return "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.i);
        parcel.writeByteArray(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.n, 0);
        parcel.writeString(this.o);
        parcel.writeLong(this.p);
    }

    public List x() {
        return Collections.EMPTY_LIST;
    }
}
