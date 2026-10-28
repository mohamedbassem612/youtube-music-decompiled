package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import app.rive.semantics.SemanticState;
import com.google.android.gms.cast.MediaInfo;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kax extends kry {
    public static final Parcelable.Creator CREATOR;
    public MediaInfo a;
    public long b;
    public int c;
    public double d;
    public int e;
    public int f;
    public long g;
    long h;
    double i;
    boolean j;
    long[] k;
    public int l;
    int m;
    String n;
    JSONObject o;
    public int p;
    final List q;
    public boolean r;
    jzs s;
    kbb t;
    public kar u;
    kau v;
    boolean w;
    private final SparseArray x;

    static {
        new khn("MediaStatus", (String) null);
        CREATOR = new kay();
    }

    public kax(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, List list, boolean z2, jzs jzsVar, kbb kbbVar, kar karVar, kau kauVar) {
        this.q = new ArrayList();
        this.x = new SparseArray();
        this.a = mediaInfo;
        this.b = j;
        this.c = i;
        this.d = d;
        this.e = i2;
        this.f = i3;
        this.g = j2;
        this.h = j3;
        this.i = d2;
        this.j = z;
        this.k = jArr;
        this.l = i4;
        this.m = i5;
        this.n = str;
        if (str != null) {
            try {
                this.o = new JSONObject(this.n);
            } catch (JSONException unused) {
                this.o = null;
                this.n = null;
            }
        } else {
            this.o = null;
        }
        this.p = i6;
        if (list != null && !list.isEmpty()) {
            g(list);
        }
        this.r = z2;
        this.s = jzsVar;
        this.t = kbbVar;
        this.u = karVar;
        this.v = kauVar;
        boolean z3 = false;
        if (kauVar != null && kauVar.j) {
            z3 = true;
        }
        this.w = z3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    public static final boolean f(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        if (i2 == 1) {
            if (i3 != 0) {
                return false;
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                if (i3 != 0) {
                    return false;
                }
            }
        } else if (i4 == 2) {
            return false;
        }
        return true;
    }

    private final void g(List list) {
        List list2 = this.q;
        list2.clear();
        SparseArray sparseArray = this.x;
        sparseArray.clear();
        for (int i = 0; i < list.size(); i++) {
            kav kavVar = (kav) list.get(i);
            list2.add(kavVar);
            sparseArray.put(kavVar.b, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01a4 A[EDGE_INSN: B:107:0x01a4->B:108:0x01a8 BREAK  A[LOOP:0: B:101:0x0192->B:105:0x019f]] */
    /* JADX WARN: Code duplicated, block: B:148:0x0256  */
    /* JADX WARN: Code duplicated, block: B:230:0x03e8 A[Catch: JSONException -> 0x03fe, TRY_ENTER, TryCatch #2 {JSONException -> 0x03fe, blocks: (B:209:0x03a3, B:231:0x03ec, B:230:0x03e8), top: B:353:0x03a3 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int a(JSONObject jSONObject, int i) throws JSONException {
        JSONObject jSONObject2;
        int i2;
        long[] jArr;
        jzs jzsVar;
        int i3;
        kbb kbbVar;
        kar karVar;
        int i4;
        MediaInfo mediaInfo;
        boolean zA;
        MediaInfo mediaInfo2;
        int i5;
        int i6;
        int i7;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extendedStatus");
        if (jSONObjectOptJSONObject != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
                jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList.toArray(new String[0]));
                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    jSONObject2.put(next, jSONObjectOptJSONObject.get(next));
                }
                jSONObject2.remove("extendedStatus");
            } catch (JSONException unused) {
                jSONObject2 = jSONObject;
            }
        } else {
            jSONObject2 = jSONObject;
        }
        long j = jSONObject2.getLong("mediaSessionId");
        if (j != this.b) {
            this.b = j;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (jSONObject2.has("playerState")) {
            String string = jSONObject2.getString("playerState");
            if (string.equals("IDLE")) {
                i6 = 1;
            } else if (string.equals("PLAYING")) {
                i6 = 2;
            } else if (string.equals("PAUSED")) {
                i6 = 3;
            } else if (string.equals("BUFFERING")) {
                i6 = 4;
            } else {
                i6 = string.equals("LOADING") ? 5 : 0;
            }
            if (i6 != this.e) {
                this.e = i6;
                i2 |= 2;
            }
            if (i6 == 1 && jSONObject2.has("idleReason")) {
                String string2 = jSONObject2.getString("idleReason");
                if (string2.equals("CANCELLED")) {
                    i7 = 2;
                } else if (string2.equals("INTERRUPTED")) {
                    i7 = 3;
                } else if (string2.equals("FINISHED")) {
                    i7 = 1;
                } else {
                    i7 = string2.equals("ERROR") ? 4 : 0;
                }
                if (i7 != this.f) {
                    this.f = i7;
                    i2 |= 2;
                }
            }
        }
        if (jSONObject2.has("playbackRate")) {
            double d = jSONObject2.getDouble("playbackRate");
            if (this.d != d) {
                this.d = d;
                i2 |= 2;
            }
        }
        if (jSONObject2.has("currentTime")) {
            long jB = khe.b(jSONObject2.getDouble("currentTime"));
            if (jB != this.g) {
                this.g = jB;
                i2 |= 2;
            }
            i2 |= SemanticState.Focused;
        }
        if (jSONObject2.has("supportedMediaCommands")) {
            long j2 = jSONObject2.getLong("supportedMediaCommands");
            if (j2 != this.h) {
                this.h = j2;
                i2 |= 2;
            }
        }
        if (jSONObject2.has("volume") && i == 0) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("volume");
            double d2 = jSONObject3.getDouble("level");
            if (d2 != this.i) {
                this.i = d2;
                i2 |= 2;
            }
            boolean z = jSONObject3.getBoolean("muted");
            if (z != this.j) {
                this.j = z;
                i2 |= 2;
            }
        }
        JSONArray jSONArray = jSONObject2.has("activeTrackIds") ? jSONObject2.getJSONArray("activeTrackIds") : null;
        Pattern pattern = khe.a;
        if (jSONArray == null) {
            jArr = null;
        } else {
            jArr = new long[jSONArray.length()];
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                jArr[i8] = jSONArray.getLong(i8);
            }
        }
        long[] jArr2 = this.k;
        if (jArr == null) {
            if (jArr2 != null) {
                this.k = jArr;
                i2 |= 2;
                break;
            }
        } else {
            if (jArr2 == null) {
                this.k = jArr;
                i2 |= 2;
                break;
            }
            if (jArr2.length != jArr.length) {
                this.k = jArr;
                i2 |= 2;
                break;
            }
            for (int i9 = 0; i9 < jArr.length; i9++) {
                if (this.k[i9] != jArr[i9]) {
                    this.k = jArr;
                    i2 |= 2;
                    break;
                }
            }
        }
        if (jSONObject2.has("customData")) {
            this.o = jSONObject2.getJSONObject("customData");
            this.n = null;
            i2 |= 2;
        }
        if (jSONObject2.has("media")) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("media");
            MediaInfo mediaInfo3 = new MediaInfo(jSONObject4);
            MediaInfo mediaInfo4 = this.a;
            if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                this.a = mediaInfo3;
                i2 |= 2;
            }
            if (jSONObject4.has("metadata")) {
                i2 |= 4;
            }
        }
        if (jSONObject2.has("currentItemId") && this.c != (i5 = jSONObject2.getInt("currentItemId"))) {
            this.c = i5;
            i2 |= 2;
        }
        int iOptInt = jSONObject2.optInt("preloadedItemId", 0);
        if (this.m != iOptInt) {
            this.m = iOptInt;
            i2 |= 16;
        }
        int iOptInt2 = jSONObject2.optInt("loadingItemId", 0);
        int i10 = this.l;
        if (i10 != iOptInt2) {
            this.l = iOptInt2;
            i2 |= 2;
        } else {
            iOptInt2 = i10;
        }
        MediaInfo mediaInfo5 = this.a;
        if (f(this.e, this.f, iOptInt2, mediaInfo5 == null ? -1 : mediaInfo5.a)) {
            this.c = 0;
            this.l = 0;
            this.m = 0;
            List list = this.q;
            if (!list.isEmpty()) {
                i2 |= 8;
                this.p = 0;
                list.clear();
                this.x.clear();
            }
        } else {
            if (jSONObject2.has("repeatMode")) {
                Integer numD = ket.D(jSONObject2.getString("repeatMode"));
                int iIntValue = numD == null ? this.p : numD.intValue();
                Integer numValueOf = Integer.valueOf(iIntValue);
                int i11 = this.p;
                numValueOf.getClass();
                if (i11 != iIntValue) {
                    numValueOf.getClass();
                    this.p = iIntValue;
                    zA = true;
                } else {
                    zA = false;
                }
            } else {
                zA = false;
            }
            if (jSONObject2.has("items")) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("items");
                int length = jSONArray2.length();
                SparseArray sparseArray = new SparseArray();
                for (int i12 = 0; i12 < length; i12++) {
                    sparseArray.put(i12, Integer.valueOf(jSONArray2.getJSONObject(i12).getInt("itemId")));
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i13 = 0; i13 < length; i13++) {
                    Integer num = (Integer) sparseArray.get(i13);
                    JSONObject jSONObject5 = jSONArray2.getJSONObject(i13);
                    kav kavVarC = c(num.intValue());
                    if (kavVarC != null) {
                        zA |= kavVarC.a(jSONObject5);
                        arrayList2.add(kavVarC);
                        if (i13 != d(num.intValue()).intValue()) {
                        }
                    } else if (num.intValue() != this.c || (mediaInfo2 = this.a) == null) {
                        arrayList2.add(new kav(jSONObject5));
                    } else {
                        kav kavVar = new kav(mediaInfo2, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
                        hna.H(kavVar);
                        kavVar.a(jSONObject5);
                        arrayList2.add(kavVar);
                    }
                    zA = true;
                }
                zA |= !(this.q.size() == length);
                g(arrayList2);
            }
            if (zA) {
                i2 |= 8;
            }
        }
        int i14 = i2;
        JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("breakStatus");
        khn khnVar = jzs.a;
        if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.has("currentBreakTime") && jSONObjectOptJSONObject2.has("currentBreakClipTime")) {
            try {
                long j3 = jSONObjectOptJSONObject2.getLong("currentBreakTime") * 1000;
                long j4 = jSONObjectOptJSONObject2.getLong("currentBreakClipTime") * 1000;
                String strC = khe.c(jSONObjectOptJSONObject2, "breakId");
                String strC2 = khe.c(jSONObjectOptJSONObject2, "breakClipId");
                long jOptLong = jSONObjectOptJSONObject2.optLong("whenSkippable", -1L);
                jzsVar = new jzs(j3, j4, strC, strC2, jOptLong != -1 ? jOptLong * 1000 : -1L);
            } catch (JSONException e) {
                jzs.a.c(e, "Error while creating an AdBreakClipInfo from JSON", new Object[0]);
                jzsVar = null;
            }
        } else {
            jzsVar = null;
        }
        jzs jzsVar2 = this.s;
        if (jzsVar2 != null ? !jzsVar2.equals(jzsVar) : jzsVar != null) {
            this.r = (jzsVar == null || (jzsVar.d == null && jzsVar.e == null)) ? false : true;
            this.s = jzsVar;
            i14 |= 32;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("videoInfo");
        Parcelable.Creator creator = kbb.CREATOR;
        if (jSONObjectOptJSONObject3 != null) {
            try {
                String string3 = jSONObjectOptJSONObject3.getString("hdrType");
                int iHashCode = string3.hashCode();
                if (iHashCode != 3218) {
                    if (iHashCode != 103158) {
                        if (iHashCode != 113729) {
                            if (iHashCode == 99136405 && string3.equals("hdr10")) {
                                i3 = 2;
                            } else {
                                khn.e();
                                i3 = 0;
                            }
                        } else if (string3.equals("sdr")) {
                            i3 = 1;
                        } else {
                            khn.e();
                            i3 = 0;
                        }
                    } else if (string3.equals("hdr")) {
                        i3 = 4;
                    } else {
                        khn.e();
                        i3 = 0;
                    }
                } else if (string3.equals("dv")) {
                    i3 = 3;
                } else {
                    khn.e();
                    i3 = 0;
                }
                kbbVar = new kbb(jSONObjectOptJSONObject3.getInt("width"), jSONObjectOptJSONObject3.getInt("height"), i3);
            } catch (JSONException unused2) {
                khn.e();
                kbbVar = null;
            }
        } else {
            kbbVar = null;
        }
        kbb kbbVar2 = this.t;
        if (kbbVar2 != null ? !kbbVar2.equals(kbbVar) : kbbVar != null) {
            this.t = kbbVar;
            i14 |= 64;
        }
        if (jSONObject2.has("breakInfo") && (mediaInfo = this.a) != null) {
            mediaInfo.a(jSONObject2.getJSONObject("breakInfo"));
            i14 |= 2;
        }
        if (jSONObject2.has("queueData")) {
            kau kauVar = new kau();
            JSONObject jSONObject6 = jSONObject2.getJSONObject("queueData");
            kauVar.a();
            if (jSONObject6 != null) {
                kauVar.a = khe.c(jSONObject6, "id");
                kauVar.b = khe.c(jSONObject6, "entity");
                String strOptString = jSONObject6.optString("queueType");
                switch (strOptString.hashCode()) {
                    case -1803151310:
                        if (strOptString.equals("PODCAST_SERIES")) {
                            i4 = 5;
                            kauVar.c = i4;
                        }
                        break;
                    case -1758903120:
                        if (strOptString.equals("RADIO_STATION")) {
                            i4 = 4;
                            kauVar.c = i4;
                        }
                        break;
                    case -1632865838:
                        if (strOptString.equals("PLAYLIST")) {
                            i4 = 2;
                            kauVar.c = i4;
                        }
                        break;
                    case -1319760993:
                        if (strOptString.equals("AUDIOBOOK")) {
                            i4 = 3;
                            kauVar.c = i4;
                        }
                        break;
                    case -1088524588:
                        if (strOptString.equals("TV_SERIES")) {
                            i4 = 6;
                            kauVar.c = i4;
                        }
                        break;
                    case 62359119:
                        if (strOptString.equals("ALBUM")) {
                            kauVar.c = 1;
                        }
                        break;
                    case 73549584:
                        if (strOptString.equals("MOVIE")) {
                            i4 = 9;
                            kauVar.c = i4;
                        }
                        break;
                    case 393100598:
                        if (strOptString.equals("VIDEO_PLAYLIST")) {
                            i4 = 7;
                            kauVar.c = i4;
                        }
                        break;
                    case 902303413:
                        if (strOptString.equals("LIVE_TV")) {
                            i4 = 8;
                            kauVar.c = i4;
                        }
                        break;
                }
                kauVar.d = khe.c(jSONObject6, "name");
                JSONObject jSONObjectOptJSONObject4 = jSONObject6.has("containerMetadata") ? jSONObject6.optJSONObject("containerMetadata") : null;
                if (jSONObjectOptJSONObject4 != null) {
                    kat katVar = new kat();
                    katVar.a();
                    String strOptString2 = jSONObjectOptJSONObject4.optString("containerType", "");
                    int iHashCode2 = strOptString2.hashCode();
                    if (iHashCode2 != 6924225) {
                        if (iHashCode2 == 828666841 && strOptString2.equals("GENERIC_CONTAINER")) {
                            katVar.a = 0;
                        }
                    } else if (strOptString2.equals("AUDIOBOOK_CONTAINER")) {
                        katVar.a = 1;
                    }
                    katVar.b = khe.c(jSONObjectOptJSONObject4, "title");
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("sections");
                    if (jSONArrayOptJSONArray != null) {
                        katVar.c = new ArrayList();
                        List list2 = katVar.c;
                        for (int i15 = 0; i15 < jSONArrayOptJSONArray.length(); i15++) {
                            JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray.optJSONObject(i15);
                            if (jSONObjectOptJSONObject5 != null) {
                                kas kasVar = new kas(0);
                                kasVar.b(jSONObjectOptJSONObject5);
                                list2.add(kasVar);
                            }
                        }
                    }
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray("containerImages");
                    if (jSONArrayOptJSONArray2 != null) {
                        katVar.d = new ArrayList();
                        khu.b(katVar.d, jSONArrayOptJSONArray2);
                    }
                    katVar.e = jSONObjectOptJSONObject4.optDouble("containerDuration", katVar.e);
                    kauVar.e = new kat(katVar);
                }
                Integer numD2 = ket.D(jSONObject6.optString("repeatMode"));
                if (numD2 != null) {
                    kauVar.f = numD2.intValue();
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObject6.optJSONArray("items");
                if (jSONArrayOptJSONArray3 != null) {
                    kauVar.g = new ArrayList();
                    List list3 = kauVar.g;
                    for (int i16 = 0; i16 < jSONArrayOptJSONArray3.length(); i16++) {
                        JSONObject jSONObjectOptJSONObject6 = jSONArrayOptJSONArray3.optJSONObject(i16);
                        if (jSONObjectOptJSONObject6 != null) {
                            try {
                                list3.add(new kav(jSONObjectOptJSONObject6));
                            } catch (JSONException unused3) {
                            }
                        }
                    }
                }
                kauVar.h = jSONObject6.optInt("startIndex", kauVar.h);
                if (jSONObject6.has("startTime")) {
                    kauVar.i = khe.b(jSONObject6.optDouble("startTime", kauVar.i));
                }
                kauVar.j = jSONObject6.optBoolean("shuffle");
            }
            kau kauVar2 = new kau(kauVar);
            this.v = kauVar2;
            boolean z2 = kauVar2.j;
            if (this.w != z2) {
                this.w = z2;
                i14 |= 8;
            }
        }
        if (jSONObject2.has("liveSeekableRange")) {
            i14 |= 2;
            JSONObject jSONObjectOptJSONObject7 = jSONObject2.optJSONObject("liveSeekableRange");
            khn khnVar2 = kar.a;
            if (jSONObjectOptJSONObject7 != null && jSONObjectOptJSONObject7.has("start") && jSONObjectOptJSONObject7.has("end")) {
                try {
                    karVar = new kar(khe.b(jSONObjectOptJSONObject7.getDouble("start")), khe.b(jSONObjectOptJSONObject7.getDouble("end")), jSONObjectOptJSONObject7.optBoolean("isMovingWindow"), jSONObjectOptJSONObject7.optBoolean("isLiveDone"));
                } catch (JSONException unused4) {
                    kar.a.b("Ignoring Malformed MediaLiveSeekableRange: ".concat(jSONObjectOptJSONObject7.toString()), new Object[0]);
                    karVar = null;
                }
            } else {
                karVar = null;
            }
            this.u = karVar;
        } else {
            if (this.u != null) {
                i14 |= 2;
            }
            this.u = null;
        }
        return i14;
    }

    public final int b() {
        return this.q.size();
    }

    public final kav c(int i) {
        Integer num = (Integer) this.x.get(i);
        if (num == null) {
            return null;
        }
        return (kav) this.q.get(num.intValue());
    }

    public final Integer d(int i) {
        return (Integer) this.x.get(i);
    }

    public final boolean e(long j) {
        return (this.h & j) != 0;
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof kax) {
            kax kaxVar = (kax) obj;
            if ((this.o == null) == (kaxVar.o == null) && this.b == kaxVar.b && this.c == kaxVar.c && this.d == kaxVar.d && this.e == kaxVar.e && this.f == kaxVar.f && this.g == kaxVar.g && this.i == kaxVar.i && this.j == kaxVar.j && this.l == kaxVar.l && this.m == kaxVar.m && this.p == kaxVar.p && Arrays.equals(this.k, kaxVar.k) && khe.g(Long.valueOf(this.h), Long.valueOf(kaxVar.h)) && khe.g(this.q, kaxVar.q) && khe.g(this.a, kaxVar.a) && (((jSONObject = this.o) == null || (jSONObject2 = kaxVar.o) == null || ksw.a(jSONObject, jSONObject2)) && this.r == kaxVar.r && khe.g(this.s, kaxVar.s) && khe.g(this.t, kaxVar.t) && khe.g(this.u, kaxVar.u) && Objects.equals(this.v, kaxVar.v) && this.w == kaxVar.w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Double.valueOf(this.i), Boolean.valueOf(this.j), Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(this.l), Integer.valueOf(this.m), String.valueOf(this.o), Integer.valueOf(this.p), this.q, Boolean.valueOf(this.r), this.s, this.t, this.u, this.v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.o;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 2, this.a, i);
        ksy.m(parcel, 3, this.b);
        ksy.l(parcel, 4, this.c);
        ksy.j(parcel, 5, this.d);
        ksy.l(parcel, 6, this.e);
        ksy.l(parcel, 7, this.f);
        ksy.m(parcel, 8, this.g);
        ksy.m(parcel, 9, this.h);
        ksy.j(parcel, 10, this.i);
        ksy.i(parcel, 11, this.j);
        ksy.x(parcel, 12, this.k);
        ksy.l(parcel, 13, this.l);
        ksy.l(parcel, 14, this.m);
        ksy.B(parcel, 15, this.n);
        ksy.l(parcel, 16, this.p);
        ksy.F(parcel, 17, this.q);
        ksy.i(parcel, 18, this.r);
        ksy.A(parcel, 19, this.s, i);
        ksy.A(parcel, 20, this.t, i);
        ksy.A(parcel, 21, this.u, i);
        ksy.A(parcel, 22, this.v, i);
        ksy.h(parcel, iG);
    }

    public kax(JSONObject jSONObject) throws JSONException {
        this(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
        a(jSONObject, 0);
    }
}
