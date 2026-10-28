package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afhm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new afhl(0);
    private static afhm d;
    public final boolean a;
    public final boolean b;
    public final Intent c;

    public afhm(boolean z, boolean z2, Intent intent) {
        this.a = z;
        this.b = z2;
        this.c = intent;
    }

    public static afhm a() {
        afhm afhmVar;
        synchronized (afhm.class) {
            afhmVar = d;
            if (afhmVar == null) {
                afhmVar = new afhm(true, false, null);
                d = afhmVar;
            }
        }
        return afhmVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afhm) {
            afhm afhmVar = (afhm) obj;
            if (this.a == afhmVar.a && this.b == afhmVar.b) {
                Intent intent = this.c;
                if (intent == null) {
                    if (afhmVar.c == null) {
                        return true;
                    }
                } else if (intent.equals(afhmVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.c;
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003) ^ (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "ValidationResult{isValid=" + this.a + ", clearState=" + this.b + ", getIntentToMeet=" + String.valueOf(this.c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, 0);
    }

    public afhm() {
        throw null;
    }
}
