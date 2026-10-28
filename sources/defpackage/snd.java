package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class snd implements Parcelable {
    public final aqfu a;
    private final int c;
    private List d;
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/ads/model/SurveyQuestionRendererModel");
    public static final Parcelable.Creator CREATOR = new pyc(16);

    public snd(aqfu aqfuVar, int i) {
        aqfuVar.getClass();
        this.a = aqfuVar;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof snd)) {
            return false;
        }
        snd sndVar = (snd) obj;
        return Objects.equals(this.a, sndVar.a) && this.c == sndVar.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }

    public final String toString() {
        String str;
        String string;
        alay alayVar;
        int i = this.c;
        Locale locale = Locale.US;
        Integer numValueOf = Integer.valueOf(i + 1);
        aqfu aqfuVar = this.a;
        int i2 = aqfuVar.e;
        if (i2 <= 0) {
            str = "UNSUPPORTED";
        } else {
            str = i2 == 1 ? "SINGLE_ANSWERS" : "MULTI_SELECT";
        }
        int i3 = aqfuVar.b & 1;
        if (i3 != 0) {
            if (i3 != 0) {
                alayVar = aqfuVar.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            string = ackj.k(null, alayVar, null, false).toString();
        } else {
            ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/ads/model/SurveyQuestionRendererModel", "getQuestion", 102, "SurveyQuestionRendererModel.java")).t("Survey question doesn't contain any question text.");
            string = "";
        }
        if (this.d == null) {
            this.d = new ArrayList();
            Iterator it = aqfuVar.d.iterator();
            while (it.hasNext()) {
                this.d.add(ackj.k(null, (alay) it.next(), null, false).toString());
            }
        }
        return String.format(locale, "Question #%d [type: %s question: \"%s\" answers: %s]", numValueOf, str, string, DesugarCollections.unmodifiableList(this.d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        tym.u(this.a, parcel);
        parcel.writeInt(this.c);
    }
}
