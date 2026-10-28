package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kas extends kry {
    private static final xsc e;
    public final List a;
    final Bundle b;
    public int c;
    private static final String[] d = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator CREATOR = new jys(15);

    static {
        xsc xscVar = new xsc((byte[]) null);
        xscVar.ap("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        xscVar.ap("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        xscVar.ap("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        xscVar.ap("com.google.android.gms.cast.metadata.TITLE", "title", 1);
        xscVar.ap("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        xscVar.ap("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        xscVar.ap("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        xscVar.ap("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        xscVar.ap("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        xscVar.ap("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        xscVar.ap("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        xscVar.ap("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        xscVar.ap("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        xscVar.ap("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        xscVar.ap("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        xscVar.ap("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        xscVar.ap("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        xscVar.ap("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        xscVar.ap("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        xscVar.ap("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        xscVar.ap("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        xscVar.ap("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        xscVar.ap("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        xscVar.ap("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        xscVar.ap("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        xscVar.ap("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        xscVar.ap("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        xscVar.ap("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        e = xscVar;
    }

    public kas(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    private final boolean d(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !d((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int iAo = e.ao(str);
        if (iAo == 1 || iAo == 0) {
            return this.b.getString(str);
        }
        throw new IllegalArgumentException("Value for " + str + " must be a " + d[1]);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final void b(JSONObject jSONObject) {
        this.b.clear();
        this.a.clear();
        this.c = 0;
        try {
            this.c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            khu.b(this.a, jSONArrayOptJSONArray);
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && !"metadataType".equals(next)) {
                    xsc xscVar = e;
                    String str = (String) xscVar.c.get(next);
                    if (str != null) {
                        try {
                            Object obj = jSONObject.get(next);
                            if (obj != null) {
                                int iAo = xscVar.ao(str);
                                if (iAo != 1) {
                                    if (iAo != 2) {
                                        if (iAo == 3) {
                                            double dOptDouble = jSONObject.optDouble(next);
                                            if (!Double.isNaN(dOptDouble)) {
                                                this.b.putDouble(str, dOptDouble);
                                            }
                                        } else if (iAo != 4) {
                                            if (iAo == 5) {
                                                Bundle bundle = this.b;
                                                long jOptLong = jSONObject.optLong(next);
                                                Pattern pattern = khe.a;
                                                bundle.putLong(str, jOptLong * 1000);
                                            }
                                        } else if (obj instanceof String) {
                                            String str2 = (String) obj;
                                            if (khu.a(str2) != null) {
                                                this.b.putString(str, str2);
                                            }
                                        }
                                    } else if (obj instanceof Integer) {
                                        this.b.putInt(str, ((Integer) obj).intValue());
                                    }
                                } else if (obj instanceof String) {
                                    this.b.putString(str, (String) obj);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    } else {
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof String) {
                            this.b.putString(next, (String) obj2);
                        } else if (obj2 instanceof Integer) {
                            this.b.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Double) {
                            this.b.putDouble(next, ((Double) obj2).doubleValue());
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public final boolean c() {
        List list = this.a;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kas) {
            kas kasVar = (kas) obj;
            if (d(this.b, kasVar.b) && this.a.equals(kasVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Bundle bundle = this.b;
        int iHashCode = 17;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (iHashCode * 31) + this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.F(parcel, 2, list);
        ksy.p(parcel, 3, this.b);
        ksy.l(parcel, 4, this.c);
        ksy.h(parcel, iG);
    }

    public kas(List list, Bundle bundle, int i) {
        this.a = list;
        this.b = bundle;
        this.c = i;
    }

    public kas() {
        throw null;
    }
}
