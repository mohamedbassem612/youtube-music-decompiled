package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lcd extends kry {
    public static final Parcelable.Creator CREATOR = new kwo(6);
    public final String a;
    public final lcc b;
    public final String c;
    public final long d;
    public final long e;

    public lcd(lcd lcdVar, long j, long j2) {
        kro.l(lcdVar);
        this.a = lcdVar.a;
        this.b = lcdVar.b;
        this.c = lcdVar.c;
        this.d = j;
        this.e = j2;
    }

    public final String toString() {
        return "origin=" + this.c + ",name=" + this.a + ",params=" + String.valueOf(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kwo.a(this, parcel, i);
    }

    public lcd(String str, lcc lccVar, String str2, long j, long j2) {
        this.a = str;
        this.b = lccVar;
        this.c = str2;
        this.d = j;
        this.e = j2;
    }
}
