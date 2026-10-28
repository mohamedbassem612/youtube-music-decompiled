package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uxb implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/creation/editor/volume/Volumes");
    public final Map a;

    static {
        agkz.t(arfu.VOLUME_TYPE_ORIGINAL, arfu.VOLUME_TYPE_ADDED_MUSIC, arfu.VOLUME_TYPE_VOICEOVER, arfu.VOLUME_TYPE_TEXT_TO_SPEECH, arfu.VOLUME_TYPE_VISUAL_REMIX);
        CREATOR = new uwz(0);
    }

    public uxb() {
        EnumMap enumMap = new EnumMap(arfu.class);
        this.a = enumMap;
        b(new uxa() { // from class: uwx
            @Override // defpackage.uxa
            public final void a(arfu arfuVar) {
                this.a.a.put(arfuVar, Float.valueOf(-1.0f));
            }
        });
        enumMap.put(arfu.VOLUME_TYPE_VISUAL_REMIX, Float.valueOf(0.4f));
    }

    public static final void b(uxa uxaVar) {
        for (arfu arfuVar : arfu.values()) {
            if (arfuVar != arfu.VOLUME_TYPE_UNKNOWN) {
                uxaVar.a(arfuVar);
            }
        }
    }

    private static boolean d(float f) {
        return ahbd.c(f, -1.0d, 0.008999999612569809d);
    }

    public final float a(arfu arfuVar) {
        float fFloatValue;
        Float f = (Float) this.a.get(arfuVar);
        if (f == null) {
            ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/creation/editor/volume/Volumes", "getInternalVolume", 139, "Volumes.java")).t("Unexpected null volume");
            fFloatValue = 1.0f;
        } else {
            fFloatValue = f.floatValue();
        }
        if (d(fFloatValue)) {
            return 1.0f;
        }
        return fFloatValue;
    }

    public final void c(float f, arfu arfuVar) {
        if (f <= 1.0f) {
            if (f >= 0.0f || d(f)) {
                this.a.put(arfuVar, Float.valueOf(f));
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Volumes:");
        b(new uwy(this, sb, 0));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b(new uwy(this, parcel, 1));
        parcel.writeInt(-1);
    }
}
