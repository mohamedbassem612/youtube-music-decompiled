package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wja implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/innertube/model/media/VideoStreamingData");
    public static final long b;
    public static final wja c;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public Set J;
    public final boolean K;
    public final boolean L;
    public final int M;
    public final int N;
    public final zs O;
    private cio P;
    private wiz Q;
    private Integer R = null;
    private Map S;
    public final StreamingDataOuterClass$StreamingData d;
    public final alvw e;
    public final byte[] f;
    public final String g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final amwn l;
    public final wiv m;
    public final String n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final List r;
    public final List s;
    public final List t;
    public final List u;
    public final List v;
    public final List w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        b = 14400000000L;
        c = new wiy(StreamingDataOuterClass$StreamingData.getDefaultInstance(), alvw.a).a();
        CREATOR = new uwz(10);
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x0201  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0163, code lost:
    
        r1 = 3;
        r14 = 3;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wja(com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData r27, defpackage.alvw r28, byte[] r29, defpackage.aomc r30, long r31, long r33, defpackage.wiv r35, java.lang.String r36, int r37, boolean r38, boolean r39, defpackage.zs r40, boolean r41, boolean r42) {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wja.<init>(com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData, alvw, byte[], aomc, long, long, wiv, java.lang.String, int, boolean, boolean, zs, boolean, boolean):void");
    }

    public static boolean C(StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData, wiu wiuVar) {
        String queryParameter;
        if (wiuVar.R() == null) {
            return streamingDataOuterClass$StreamingData.f.size() > 0 && (queryParameter = Uri.parse(((alaw) streamingDataOuterClass$StreamingData.f.get(0)).f).getQueryParameter("maxdsq")) != null && Long.parseLong(queryParameter) > 0;
        }
        return true;
    }

    private static final wiz L(wgs wgsVar) {
        if (wgsVar.an() == 3) {
            return wiz.b;
        }
        if (wgsVar.an() == 4) {
            return wiz.c;
        }
        if (wgsVar.an() == 5) {
            return wiz.f;
        }
        return (wgsVar.an() == 2 && (wgsVar.ao() == 2 || wgsVar.ao() == 3)) ? wiz.d : wiz.a;
    }

    public static String r(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((wgs) it.next()).e());
            sb.append('.');
        }
        return sb.toString();
    }

    public static boolean u(List list) {
        return !list.isEmpty() && Collection.EL.stream(list).allMatch(new uvm(16));
    }

    public final boolean A(long j) {
        return j >= this.i;
    }

    public final boolean B() {
        switch (this.o) {
            case 8:
            case 9:
            case 10:
                return true;
            default:
                return false;
        }
    }

    public final boolean D() {
        switch (this.o) {
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return true;
            default:
                return false;
        }
    }

    public final boolean E() {
        return u(this.r);
    }

    public final boolean F() {
        int i = this.o;
        return i == 11 || i == 12;
    }

    public final boolean G() {
        List list = this.r;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((wgs) it.next()).e() != wgq.RAW.ep) {
                return false;
            }
        }
        return !list.isEmpty();
    }

    public final boolean H() {
        return this.o != 8;
    }

    public final boolean I() {
        return g().a();
    }

    public final boolean J() {
        return this.o == 1;
    }

    public final boolean K() {
        return this.o == 10;
    }

    public final synchronized int a(int i) {
        if (this.R == null) {
            this.R = 0;
            for (wgs wgsVar : this.v) {
                int i2 = i <= 0 ? Alert.DURATION_SHOW_INDEFINITELY : i;
                if (wgsVar.f() <= i2) {
                    this.R = Integer.valueOf(Math.max(this.R.intValue(), wgsVar.f()));
                }
            }
        }
        return this.R.intValue();
    }

    public final int b() {
        wgs wgsVar;
        List list = this.t;
        if (list.isEmpty() || (wgsVar = (wgs) list.get(0)) == null) {
            return 0;
        }
        return wgsVar.h();
    }

    public final Uri c() {
        StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = this.d;
        if (streamingDataOuterClass$StreamingData.h.isEmpty()) {
            return null;
        }
        return Uri.parse(streamingDataOuterClass$StreamingData.h);
    }

    @Deprecated
    public final synchronized cio d(String str) {
        cio cioVar;
        cioVar = this.P;
        if (cioVar == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (wgs wgsVar : this.t) {
                if (!wgsVar.Z()) {
                    if (wgsVar.I()) {
                        arrayList.add(wgsVar.n(str));
                    } else if (wgsVar.af()) {
                        arrayList2.add(wgsVar.n(str));
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(2);
            if (!arrayList.isEmpty()) {
                arrayList3.add(new cij(-1L, 1, arrayList, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, agpi.a));
            }
            if (!arrayList2.isEmpty()) {
                arrayList3.add(new cij(-1L, 2, arrayList2, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, agpi.a));
            }
            long j = this.h;
            if (j <= 0) {
                j = -9223372036854775807L;
            }
            agke agkeVar = agpi.a;
            cioVar = new cio(-9223372036854775807L, j, -9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, null, null, null, Collections.singletonList(new aesh(null, 0L, arrayList3, agkeVar, null, agkeVar)), agkeVar, null);
            this.P = cioVar;
        }
        return cioVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final wgs e(int i) {
        for (wgs wgsVar : this.r) {
            if (wgsVar.e() == i) {
                return wgsVar;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wja) {
            wja wjaVar = (wja) obj;
            if (this.h == wjaVar.h && this.i == wjaVar.i && Arrays.equals(this.f, wjaVar.f) && Objects.equals(this.g, wjaVar.g) && Objects.equals(this.d, wjaVar.d) && this.k == wjaVar.k && Objects.equals(this.m, wjaVar.m) && Objects.equals(this.n, wjaVar.n) && this.o == wjaVar.o && this.p == wjaVar.p && this.q == wjaVar.q && this.K == wjaVar.K && this.L == wjaVar.L) {
                return true;
            }
        }
        return false;
    }

    public final wgs f(int i, String str) {
        for (wgs wgsVar : this.r) {
            if (wgsVar.e() == i && TextUtils.equals(wgsVar.C(), str)) {
                return wgsVar;
            }
        }
        return null;
    }

    public final synchronized wiz g() {
        if (this.Q == null) {
            if (this.m.a != 1) {
                Iterator it = this.t.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = this.s.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                this.Q = wiz.a;
                                break;
                            }
                            wgs wgsVar = (wgs) it2.next();
                            if (L(wgsVar) != wiz.a) {
                                wiz wizVarL = L(wgsVar);
                                this.Q = wizVarL;
                                if (wizVarL != wiz.d) {
                                    break;
                                }
                                wgsVar.ao();
                                wgsVar.al();
                                break;
                            }
                        }
                    } else {
                        wgs wgsVar2 = (wgs) it.next();
                        if (L(wgsVar2) != wiz.a) {
                            wiz wizVarL2 = L(wgsVar2);
                            this.Q = wizVarL2;
                            if (wizVarL2 != wiz.d) {
                                break;
                            }
                            wgsVar2.ao();
                            wgsVar2.al();
                            break;
                        }
                    }
                }
            } else {
                this.Q = wiz.d;
            }
        }
        return this.Q;
    }

    public final wja h(agex agexVar) {
        return i(agexVar, this.K, this.L);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.g, Integer.valueOf(Arrays.hashCode(this.f)), Long.valueOf(this.h), Long.valueOf(this.i), Integer.valueOf(this.k), this.m, this.n, Integer.valueOf(this.o), Boolean.valueOf(this.p), Boolean.valueOf(this.q), Boolean.valueOf(this.K), Boolean.valueOf(this.L));
    }

    public final wja i(agex agexVar, boolean z, boolean z2) {
        StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = this.d;
        aihf builder = streamingDataOuterClass$StreamingData.toBuilder();
        builder.copyOnWrite();
        ((StreamingDataOuterClass$StreamingData) builder.instance).f = StreamingDataOuterClass$StreamingData.emptyProtobufList();
        for (alaw alawVar : streamingDataOuterClass$StreamingData.f) {
            if (agexVar.a(alawVar)) {
                builder.cp(alawVar);
            }
        }
        return m((StreamingDataOuterClass$StreamingData) builder.build(), z, z2);
    }

    public final wja j(wiu wiuVar) {
        aihf builder = this.d.toBuilder();
        builder.copyOnWrite();
        ((StreamingDataOuterClass$StreamingData) builder.instance).f = StreamingDataOuterClass$StreamingData.emptyProtobufList();
        wiy wiyVar = new wiy((StreamingDataOuterClass$StreamingData) builder.build(), this.e);
        wiyVar.d = Long.valueOf(this.i);
        wiyVar.i = this.m;
        wiyVar.f = this.n;
        wiyVar.g = wiuVar;
        wiyVar.j = this.q;
        wiyVar.n = this.O;
        wiyVar.l = this.K;
        wiyVar.m = this.L;
        return wiyVar.a();
    }

    public final wja k() {
        return i(new wix(2), true, this.L);
    }

    public final wja l() {
        return i(new wix(1), this.K, true);
    }

    public final wja m(StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData, boolean z, boolean z2) {
        return new wja(streamingDataOuterClass$StreamingData, this.e, this.f, null, this.i, this.j, this.m, this.n, this.o, this.p, this.q, this.O, z, z2);
    }

    public final agke n() {
        return (agke) Collection.EL.stream(new aihx(this.d.m, StreamingDataOuterClass$StreamingData.a)).map(new vmw(9)).collect(aghu.a);
    }

    public final Optional o() {
        StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = this.d;
        return streamingDataOuterClass$StreamingData.l.isEmpty() ? Optional.empty() : Optional.ofNullable(Uri.parse(streamingDataOuterClass$StreamingData.l));
    }

    public final String p() {
        return this.d.k;
    }

    public final String q() {
        return r(this.r);
    }

    public final String s() {
        int i = this.o;
        if (i == 1) {
            return this.B ? "otf" : "vod";
        }
        switch (i) {
            case 8:
            case 9:
                return "manifestless";
            case 10:
                return "windowed-live";
            case 11:
                return "mfless-post-live";
            case 12:
                return "mfless-post-windowed-live";
            default:
                return "unknown";
        }
    }

    public final synchronized Map t() {
        if (this.S == null) {
            this.S = new HashMap();
            for (wgs wgsVar : this.t) {
                this.S.put(wgsVar.f, wgsVar);
            }
        }
        return this.S;
    }

    public final String toString() {
        wiv wivVar = this.m;
        return "VideoStreamingData(itags=" + q() + " videoDurationMillis=" + this.h + " expirationInElapsedTimeMillis=" + this.i + " liveChunkReadahead=" + this.k + " playerThreedRenderer=" + wivVar.toString() + " innertubeDrmSessionId=" + this.n + " playbackType=" + this.o + " useAverageBitrate=" + this.p + " canStartUsingOfflineStream=" + this.q + " disableAv1=" + this.K + " disableHfr=" + this.L + ')';
    }

    public final boolean v() {
        Iterator it = wir.v().iterator();
        while (it.hasNext()) {
            if (y(((Integer) it.next()).intValue())) {
                return true;
            }
        }
        return false;
    }

    public final boolean w() {
        return !this.s.isEmpty();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        tym.u(this.d, parcel);
        parcel.writeByteArray(this.f);
        this.m.writeToParcel(parcel, i);
        parcel.writeString(this.g);
        parcel.writeLong(this.h);
        parcel.writeLong(this.i);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l.e);
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        tym.u(this.e, parcel);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.K ? 1 : 0);
        parcel.writeInt(this.L ? 1 : 0);
    }

    public final boolean x() {
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            if (!((wgs) it.next()).V()) {
                return true;
            }
        }
        return false;
    }

    public final boolean y(int i) {
        return e(i) != null;
    }

    public final boolean z() {
        int i = this.o;
        return i == 8 || i == 9;
    }
}
