package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.agjz;
import defpackage.agke;
import defpackage.jzq;
import defpackage.jzr;
import defpackage.kaq;
import defpackage.kas;
import defpackage.kaz;
import defpackage.kba;
import defpackage.khe;
import defpackage.kry;
import defpackage.ksw;
import defpackage.ksy;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class MediaInfo extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;
    public kas c;
    public long d;
    public List e;
    public kaz f;
    String g;
    public String h;
    public kba i;
    public long j;
    public String k;
    public String l;
    public String m;
    public String n;
    private String o;
    private List p;
    private List q;
    private JSONObject r;

    static {
        Pattern pattern = khe.a;
        CREATOR = new kaq();
    }

    public MediaInfo(JSONObject jSONObject) throws JSONException {
        double d;
        int i;
        int i2;
        int i3;
        agke agkeVarG;
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        String strOptString = jSONObject.optString("streamType", "NONE");
        if ("NONE".equals(strOptString)) {
            this.a = 0;
        } else if ("BUFFERED".equals(strOptString)) {
            this.a = 1;
        } else if ("LIVE".equals(strOptString)) {
            this.a = 2;
        } else {
            this.a = -1;
        }
        this.b = khe.c(jSONObject, "contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            kas kasVar = new kas(jSONObject2.getInt("metadataType"));
            this.c = kasVar;
            kasVar.b(jSONObject2);
        }
        this.d = -1L;
        double d2 = 0.0d;
        if (this.a != 2 && jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double dOptDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(dOptDouble) && !Double.isInfinite(dOptDouble) && dOptDouble >= 0.0d) {
                this.d = khe.b(dOptDouble);
            }
        }
        int i4 = 4;
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i5 = 0;
            while (i5 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i5);
                double d3 = d2;
                long j = jSONObject3.getLong("trackId");
                String strOptString2 = jSONObject3.optString("type");
                if ("TEXT".equals(strOptString2)) {
                    i2 = 1;
                } else if ("AUDIO".equals(strOptString2)) {
                    i2 = 2;
                } else {
                    i2 = "VIDEO".equals(strOptString2) ? 3 : 0;
                }
                String strC = khe.c(jSONObject3, "trackContentId");
                String strC2 = khe.c(jSONObject3, "trackContentType");
                String strC3 = khe.c(jSONObject3, "name");
                String strC4 = khe.c(jSONObject3, "language");
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i3 = 1;
                    } else if ("CAPTIONS".equals(string)) {
                        i3 = 2;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i3 = 3;
                    } else if ("CHAPTERS".equals(string)) {
                        i3 = i4;
                    } else {
                        i3 = "METADATA".equals(string) ? 5 : -1;
                    }
                } else {
                    i3 = 0;
                }
                if (jSONObject3.has("roles")) {
                    agjz agjzVar = new agjz(i4);
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    for (int i6 = 0; i6 < jSONArray2.length(); i6++) {
                        agjzVar.h(jSONArray2.optString(i6));
                    }
                    agkeVarG = agjzVar.g();
                } else {
                    agkeVarG = null;
                }
                arrayList.add(new MediaTrack(j, i2, strC, strC2, strC3, strC4, i3, agkeVarG, jSONObject3.optJSONObject("customData")));
                i5++;
                d2 = d3;
                i4 = 4;
            }
            d = d2;
            this.e = new ArrayList(arrayList);
        } else {
            d = 0.0d;
            this.e = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            kaz kazVar = new kaz(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
            kazVar.a = (float) jSONObject4.optDouble("fontScale", 1.0d);
            kazVar.b = kaz.a(jSONObject4.optString("foregroundColor"));
            kazVar.c = kaz.a(jSONObject4.optString("backgroundColor"));
            if (jSONObject4.has("edgeType")) {
                String string2 = jSONObject4.getString("edgeType");
                if ("NONE".equals(string2)) {
                    kazVar.d = 0;
                } else if ("OUTLINE".equals(string2)) {
                    kazVar.d = 1;
                } else if ("DROP_SHADOW".equals(string2)) {
                    kazVar.d = 2;
                } else if ("RAISED".equals(string2)) {
                    kazVar.d = 3;
                } else if ("DEPRESSED".equals(string2)) {
                    kazVar.d = 4;
                }
            }
            kazVar.e = kaz.a(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string3 = jSONObject4.getString("windowType");
                if ("NONE".equals(string3)) {
                    kazVar.f = 0;
                } else if ("NORMAL".equals(string3)) {
                    kazVar.f = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    kazVar.f = 2;
                }
            }
            kazVar.g = kaz.a(jSONObject4.optString("windowColor"));
            if (kazVar.f == 2) {
                kazVar.h = jSONObject4.optInt("windowRoundedCornerRadius", 0);
            }
            kazVar.i = khe.c(jSONObject4, "fontFamily");
            if (jSONObject4.has("fontGenericFamily")) {
                String string4 = jSONObject4.getString("fontGenericFamily");
                if ("SANS_SERIF".equals(string4)) {
                    kazVar.j = 0;
                } else if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                    kazVar.j = 1;
                } else if ("SERIF".equals(string4)) {
                    kazVar.j = 2;
                } else if ("MONOSPACED_SERIF".equals(string4)) {
                    kazVar.j = 3;
                } else if ("CASUAL".equals(string4)) {
                    kazVar.j = 4;
                } else {
                    if (!"CURSIVE".equals(string4)) {
                        i = "SMALL_CAPITALS".equals(string4) ? 6 : 5;
                    }
                    kazVar.j = i;
                }
            }
            if (jSONObject4.has("fontStyle")) {
                String string5 = jSONObject4.getString("fontStyle");
                if ("NORMAL".equals(string5)) {
                    kazVar.k = 0;
                } else if ("BOLD".equals(string5)) {
                    kazVar.k = 1;
                } else if ("ITALIC".equals(string5)) {
                    kazVar.k = 2;
                } else if ("BOLD_ITALIC".equals(string5)) {
                    kazVar.k = 3;
                }
            }
            kazVar.m = jSONObject4.optJSONObject("customData");
            this.f = kazVar;
        } else {
            this.f = null;
        }
        a(jSONObject);
        this.r = jSONObject.optJSONObject("customData");
        this.h = khe.c(jSONObject, "entity");
        this.k = khe.c(jSONObject, "atvEntity");
        this.i = kba.a(jSONObject.optJSONObject("vmapAdsRequest"));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double dOptDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(dOptDouble2) && !Double.isInfinite(dOptDouble2) && dOptDouble2 >= d) {
                this.j = khe.b(dOptDouble2);
            }
        }
        if (jSONObject.has("contentUrl")) {
            this.l = jSONObject.optString("contentUrl");
        }
        this.m = khe.c(jSONObject, "hlsSegmentFormat");
        this.n = khe.c(jSONObject, "hlsVideoSegmentFormat");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00aa A[LOOP:0: B:5:0x0025->B:31:0x00aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x00b3 A[SYNTHETIC] */
    public final void a(JSONObject jSONObject) {
        long j;
        jzq jzqVar;
        jzr jzrVar;
        long j2 = 1000;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    j = j2;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null && jSONObject2.has("id") && jSONObject2.has("position")) {
                    try {
                        String string = jSONObject2.getString("id");
                        long j3 = jSONObject2.getLong("position");
                        Pattern pattern = khe.a;
                        long j4 = j3 * j2;
                        boolean zOptBoolean = jSONObject2.optBoolean("isWatched");
                        long jOptLong = jSONObject2.optLong("duration") * j2;
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("breakClipIds");
                        String[] strArr = new String[0];
                        if (jSONArrayOptJSONArray != null) {
                            strArr = new String[jSONArrayOptJSONArray.length()];
                            j = j2;
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                try {
                                    strArr[i2] = jSONArrayOptJSONArray.getString(i2);
                                } catch (JSONException e) {
                                    e = e;
                                    String.format(Locale.ROOT, "Error while creating an AdBreakInfo from JSON: %s", e.getMessage());
                                    jzrVar = null;
                                }
                            }
                        } else {
                            j = j2;
                        }
                        jzrVar = new jzr(j4, string, jOptLong, zOptBoolean, strArr, jSONObject2.optBoolean("isEmbedded"), jSONObject2.optBoolean("expanded"));
                    } catch (JSONException e2) {
                        e = e2;
                        j = j2;
                    }
                    if (jzrVar != null) {
                        arrayList.clear();
                        break;
                    } else {
                        arrayList.add(jzrVar);
                        i++;
                        j2 = j;
                    }
                } else {
                    j = j2;
                }
                jzrVar = null;
                if (jzrVar != null) {
                    arrayList.clear();
                    break;
                } else {
                    arrayList.add(jzrVar);
                    i++;
                    j2 = j;
                }
            }
            this.p = new ArrayList(arrayList);
        } else {
            j = 1000;
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                if (jSONObject3 == null || !jSONObject3.has("id")) {
                    jzqVar = null;
                } else {
                    try {
                        String string2 = jSONObject3.getString("id");
                        long jOptLong2 = jSONObject3.optLong("duration");
                        Pattern pattern2 = khe.a;
                        long j5 = jOptLong2 * j;
                        String strC = khe.c(jSONObject3, "clickThroughUrl");
                        String strC2 = khe.c(jSONObject3, "contentUrl");
                        String strC3 = khe.c(jSONObject3, "mimeType");
                        if (strC3 == null) {
                            strC3 = khe.c(jSONObject3, "contentType");
                        }
                        String str = strC3;
                        String strC4 = khe.c(jSONObject3, "title");
                        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("customData");
                        jzqVar = new jzq(string2, strC4, j5, strC2, str, strC, (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() == 0) ? null : jSONObjectOptJSONObject.toString(), khe.c(jSONObject3, "contentId"), khe.c(jSONObject3, "posterUrl"), jSONObject3.has("whenSkippable") ? ((long) ((Integer) jSONObject3.get("whenSkippable")).intValue()) * j : -1L, khe.c(jSONObject3, "hlsSegmentFormat"), kba.a(jSONObject3.optJSONObject("vastAdsRequest")));
                    } catch (JSONException e3) {
                        String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", e3.getMessage());
                        jzqVar = null;
                    }
                }
                if (jzqVar == null) {
                    arrayList2.clear();
                    break;
                }
                arrayList2.add(jzqVar);
            }
            this.q = new ArrayList(arrayList2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaInfo) {
            MediaInfo mediaInfo = (MediaInfo) obj;
            JSONObject jSONObject = this.r;
            boolean z = jSONObject == null;
            JSONObject jSONObject2 = mediaInfo.r;
            if (z == (jSONObject2 == null) && ((jSONObject == null || jSONObject2 == null || ksw.a(jSONObject, jSONObject2)) && khe.g(this.o, mediaInfo.o) && this.a == mediaInfo.a && khe.g(this.b, mediaInfo.b) && khe.g(this.c, mediaInfo.c) && this.d == mediaInfo.d && khe.g(this.e, mediaInfo.e) && khe.g(this.f, mediaInfo.f) && khe.g(this.p, mediaInfo.p) && khe.g(this.q, mediaInfo.q) && khe.g(this.h, mediaInfo.h) && khe.g(this.i, mediaInfo.i) && this.j == mediaInfo.j && khe.g(this.k, mediaInfo.k) && khe.g(this.l, mediaInfo.l) && khe.g(this.m, mediaInfo.m) && khe.g(this.n, mediaInfo.n))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.o, Integer.valueOf(this.a), this.b, this.c, Long.valueOf(this.d), String.valueOf(this.r), this.e, this.f, this.p, this.q, this.h, this.i, Long.valueOf(this.j), this.k, this.m, this.n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.r;
        this.g = jSONObject == null ? null : jSONObject.toString();
        int iG = ksy.g(parcel, 20293);
        String str = this.o;
        if (str == null) {
            str = "";
        }
        ksy.B(parcel, 2, str);
        ksy.l(parcel, 3, this.a);
        ksy.B(parcel, 4, this.b);
        ksy.A(parcel, 5, this.c, i);
        ksy.m(parcel, 6, this.d);
        ksy.F(parcel, 7, this.e);
        ksy.A(parcel, 8, this.f, i);
        ksy.B(parcel, 9, this.g);
        List list = this.p;
        ksy.F(parcel, 10, list == null ? null : DesugarCollections.unmodifiableList(list));
        List list2 = this.q;
        ksy.F(parcel, 11, list2 != null ? DesugarCollections.unmodifiableList(list2) : null);
        ksy.B(parcel, 12, this.h);
        ksy.A(parcel, 13, this.i, i);
        ksy.m(parcel, 14, this.j);
        ksy.B(parcel, 15, this.k);
        ksy.B(parcel, 16, this.l);
        ksy.B(parcel, 17, this.m);
        ksy.B(parcel, 18, this.n);
        ksy.h(parcel, iG);
    }

    public MediaInfo(String str, int i, String str2, kas kasVar, long j, List list, kaz kazVar, String str3, List list2, List list3, String str4, kba kbaVar, long j2, String str5, String str6, String str7, String str8) {
        this.o = str;
        this.a = i;
        this.b = str2;
        this.c = kasVar;
        this.d = j;
        this.e = list;
        this.f = kazVar;
        this.g = str3;
        if (str3 != null) {
            try {
                this.r = new JSONObject(this.g);
            } catch (JSONException unused) {
                this.r = null;
                this.g = null;
            }
        } else {
            this.r = null;
        }
        this.p = list2;
        this.q = list3;
        this.h = str4;
        this.i = kbaVar;
        this.j = j2;
        this.k = str5;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        if (this.o == null && str6 == null && str4 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }
}
