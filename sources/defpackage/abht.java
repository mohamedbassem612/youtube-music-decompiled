package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abht implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(2);
    public final long a;
    public final long b;
    public final int c;
    public final CharSequence d;
    public final Optional e;
    public final Optional f;
    public final aajc g;

    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    public abht(long j, long j2) {
        Optional optionalEmpty = Optional.empty();
        Optional optionalEmpty2 = Optional.empty();
        ahno.F(((j2 > j ? 1 : (j2 == j ? 0 : -1)) ^ (-1)) >>> 31);
        this.a = j;
        this.b = j2;
        this.c = 0;
        this.d = null;
        this.g = null;
        this.e = optionalEmpty;
        this.f = optionalEmpty2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof abht) {
            abht abhtVar = (abht) obj;
            if (this.a == abhtVar.a && this.b == abhtVar.b) {
                int i = abhtVar.c;
                if (Objects.equals(this.e, abhtVar.e) && Objects.equals(this.f, abhtVar.f)) {
                    aajc aajcVar = abhtVar.g;
                    if (Objects.equals(null, null)) {
                        CharSequence charSequence = abhtVar.d;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), 0, null, null, this.e, this.f);
    }

    public final String toString() {
        Optional optional = this.f;
        return "TimelineMarker[title=null, startMillis=" + this.a + ", endMillis=" + this.b + ", markerIndex=0, displayProperties=null, displayStartMillis=" + this.e.toString() + ", timeSpace=" + optional.toString() + ']';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
