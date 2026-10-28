package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wjh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new uwz(15);
    final HashMap a;
    final HashMap b;
    final HashMap c;
    public final tny d;

    public wjh(tny tnyVar) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = tnyVar;
    }

    public static final ainq h(tny tnyVar) {
        ainp ainpVarA = tnyVar.a();
        if (ainpVarA == null) {
            return null;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ainq.b);
        ainpVarA.c(aihlVarCheckIsLite);
        Object objK = ainpVarA.j.k(aihlVarCheckIsLite.d);
        return (ainq) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    @Deprecated
    public final String a(String str) {
        HashMap map = this.c;
        return map.containsKey(str) ? (String) map.get(str) : "";
    }

    @Deprecated
    public final void b(String str, boolean z) {
        this.a.put(str, Boolean.valueOf(z));
    }

    @Deprecated
    public final void c(String str, long j) {
        this.b.put(str, Long.valueOf(j));
    }

    @Deprecated
    public final void d(String str, String str2) {
        this.c.put(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public final boolean e(String str) {
        HashMap map = this.a;
        return map.containsKey(str) && ((Boolean) map.get(str)).booleanValue();
    }

    @Deprecated
    public final long f() {
        HashMap map = this.b;
        if (map.containsKey("PLAYER_RESPONSE_SOURCE_KEY")) {
            return ((Long) map.get("PLAYER_RESPONSE_SOURCE_KEY")).longValue();
        }
        return 0L;
    }

    public final void g() {
        tny tnyVar = this.d;
        ainq ainqVarH = h(tnyVar);
        if (ainqVarH != null) {
            tnyVar.b(new uwk(ainqVarH, 15));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.a);
        parcel.writeMap(this.b);
        parcel.writeMap(this.c);
        tny tnyVar = this.d;
        ainp ainpVarA = tnyVar.a() != null ? tnyVar.a() : ainp.a;
        ainpVarA.getClass();
        tym.u(ainpVarA, parcel);
    }

    public wjh() {
        this(new tnb(null));
    }
}
