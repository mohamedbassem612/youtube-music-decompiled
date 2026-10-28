package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xgt implements Parcelable {
    public static final Parcelable.Creator CREATOR = new kwo(15);
    public final String a;
    public String b;
    public final String c;
    public final ajva d;
    public final argn e;
    public final int f;
    public final Set g;
    public final Map h;
    public final Map i;
    public final Map j;
    public final Map k;
    public final Map l;
    public final Set m;
    private final ajij q;
    private final Set r;
    private int s = 1;
    public boolean n = false;
    public int o = 0;
    public int p = 0;

    public xgt(Parcel parcel) {
        this.a = (String) Objects.requireNonNullElse(parcel.readString(), "");
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.e = (argn) tym.t(parcel, argn.a);
        this.f = parcel.readInt();
        this.d = (ajva) tym.t(parcel, ajva.a);
        ajij ajijVarA = ajij.a(parcel.readInt());
        this.q = ajijVarA == null ? ajij.AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN : ajijVarA;
        this.h = new HashMap();
        this.i = new HashMap();
        this.g = new HashSet();
        this.j = new HashMap();
        this.k = new HashMap();
        this.r = new HashSet();
        this.l = new HashMap();
        this.m = new HashSet();
    }

    public static argn c(int i, int i2) {
        aihf aihfVarCreateBuilder = argn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar = (argn) aihfVarCreateBuilder.instance;
        argnVar.b |= 2;
        argnVar.d = i;
        if (i2 >= 0) {
            aihfVarCreateBuilder.copyOnWrite();
            argn argnVar2 = (argn) aihfVarCreateBuilder.instance;
            argnVar2.b |= 8;
            argnVar2.f = i2;
        }
        return (argn) aihfVarCreateBuilder.build();
    }

    static String d(Optional optional) {
        optional.isPresent();
        byte[] bArr = new byte[((vxz) optional.get()).c(4, 45388339L, 0L) > 0 ? (int) ((vxz) optional.get()).c(4, 45388339L, 0L) : 4];
        ThreadLocalRandom.current().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    static boolean f(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aoaq.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(int i) {
        return i > 0;
    }

    private static atqd l(atqd atqdVar) {
        atqg atqgVar = atqdVar.c;
        if (atqgVar == null) {
            atqgVar = atqg.a;
        }
        if ((atqgVar.b & 2) == 0) {
            return atqdVar;
        }
        aihf builder = atqdVar.toBuilder();
        atqg atqgVar2 = atqdVar.c;
        if (atqgVar2 == null) {
            atqgVar2 = atqg.a;
        }
        aihf builder2 = atqgVar2.toBuilder();
        builder2.copyOnWrite();
        atqg atqgVar3 = (atqg) builder2.instance;
        atqgVar3.b &= -3;
        atqgVar3.d = 0;
        builder.copyOnWrite();
        atqd atqdVar2 = (atqd) builder.instance;
        atqg atqgVar4 = (atqg) builder2.build();
        atqgVar4.getClass();
        atqdVar2.c = atqgVar4;
        atqdVar2.b |= 1;
        return (atqd) builder.build();
    }

    private static boolean m(argn argnVar) {
        return argnVar != null && (argnVar.c.d() > 0 || argnVar.d > 0);
    }

    final int a(int i) {
        Set set = this.r;
        Integer numValueOf = Integer.valueOf(i);
        if (!set.contains(numValueOf)) {
            set.add(numValueOf);
            return 0;
        }
        int i2 = this.s;
        this.s = i2 + 1;
        return i2;
    }

    public final xhc b() {
        return xhb.a(this.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(xho xhoVar, boolean z) {
        argn argnVar = xhoVar.f;
        if (m(argnVar)) {
            Optional optional = xhoVar.g;
            if (!optional.isPresent()) {
                if (z) {
                    this.i.put(argnVar, xhoVar.e);
                    return;
                } else {
                    this.h.put(argnVar, xhoVar);
                    return;
                }
            }
            xgr xgrVar = new xgr();
            xgrVar.d(argnVar);
            xgrVar.c(l((atqd) optional.get()));
            xgrVar.b();
            xgs xgsVarA = xgrVar.a();
            if (z) {
                this.k.put(xgsVarA, xhoVar.e);
            } else {
                this.j.put(xgsVarA, xhoVar);
            }
        }
    }

    public final boolean h() {
        return this.q == ajij.AUTOMATED_LOG_EVENT_SOURCE_PAGE_SYSTEM;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0053 A[PHI: r1
      0x0053: PHI (r1v5 amec) = (r1v4 amec), (r1v8 amec) binds: [B:14:0x0051, B:8:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean i(xho xhoVar, boolean z) {
        amec amecVar;
        amec amecVar2;
        argn argnVar = xhoVar.f;
        if (m(argnVar)) {
            Optional optional = xhoVar.g;
            if (optional.isPresent()) {
                xgr xgrVar = new xgr();
                xgrVar.d(argnVar);
                xgrVar.c(l((atqd) optional.get()));
                xgrVar.b();
                xgs xgsVarA = xgrVar.a();
                amecVar = (amec) this.k.get(xgsVarA);
                if (amecVar == null) {
                    xho xhoVar2 = (xho) this.j.get(xgsVarA);
                    amecVar2 = xhoVar2 == null ? amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_UNKNOWN : xhoVar2.e;
                } else {
                    amecVar2 = amecVar;
                }
            } else {
                amecVar = (amec) this.i.get(argnVar);
                if (amecVar != null) {
                    amecVar2 = amecVar;
                } else {
                    xho xhoVar3 = (xho) this.h.get(argnVar);
                    amecVar2 = xhoVar3 == null ? amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_UNKNOWN : xhoVar3.e;
                }
            }
        } else {
            amecVar2 = amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_UNKNOWN;
        }
        return !(z && (xhoVar instanceof xhl) && amecVar2 == amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_UNKNOWN) && (amecVar2 == amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_FIRST_SHOWN || amecVar2 == amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SHOWN) == (xhoVar instanceof xhm);
    }

    final boolean j(argn argnVar, argn argnVar2) {
        return m(argnVar) && j$.util.Map.EL.putIfAbsent(this.l, argnVar, argnVar2) != null;
    }

    public final void k() {
        this.n = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        tym.u(this.e, parcel);
        parcel.writeInt(this.f);
        ajva ajvaVar = this.d;
        if (ajvaVar != null) {
            tym.u(ajvaVar, parcel);
        } else {
            tym.u(ajva.a, parcel);
        }
        parcel.writeInt(this.q.k);
    }

    public xgt(int i, argn argnVar, String str, String str2, Optional optional, ajij ajijVar, String str3) {
        this.a = str3 == null ? d(optional) : str3;
        this.h = new HashMap();
        this.i = new HashMap();
        this.j = new HashMap();
        this.k = new HashMap();
        this.g = new HashSet();
        this.r = new HashSet();
        this.l = new HashMap();
        this.m = new HashSet();
        this.f = i;
        this.b = str;
        this.c = str2;
        this.d = null;
        this.e = argnVar;
        this.q = ajijVar;
    }
}
