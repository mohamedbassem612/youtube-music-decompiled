package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.view.MotionEvent;
import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ktw {
    private static final Bundle[] a = new Bundle[0];
    private final agfr b;
    private int c = 0;
    private Instant d;

    public ktw(agfr agfrVar, Instant instant) {
        Instant instant2 = Instant.EPOCH;
        this.b = agfrVar;
        this.d = instant;
    }

    public final synchronized String a() {
        Bundle[] bundleArr;
        String strEncodeToString;
        Bundle bundle;
        MotionEvent motionEvent;
        this.c++;
        Instant instantB = yz.b();
        Instant instant = this.d;
        Integer num = 0;
        if (this.c - 1 > 0) {
            agfr agfrVar = this.b;
            bundleArr = (Bundle[]) ((agit) agfrVar.io()).toArray(new Bundle[((agit) agfrVar.io()).size()]);
        } else {
            bundleArr = a;
        }
        int i = this.c;
        Integer numValueOf = Integer.valueOf(i);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("vs", 1);
        if (instantB != null) {
            bundle2.putLong("stsc", instantB.toEpochMilli());
        }
        if (instant != null) {
            bundle2.putLong("stsp", instant.toEpochMilli());
        }
        num.getClass();
        bundle2.putInt("cemp", 0);
        num.getClass();
        bundle2.putInt("cef", 0);
        if (bundleArr != null) {
            bundle2.putParcelableArray("sei", bundleArr);
        }
        num.getClass();
        bundle2.putInt("cempg", 0);
        numValueOf.getClass();
        bundle2.putInt("cesg", i);
        num.getClass();
        bundle2.putInt("cefg", 0);
        afyd.d(bundle2, "stsc");
        afyd.d(bundle2, "stsp");
        afyd.c(bundle2, "cemp");
        afyd.c(bundle2, "cef");
        if (bundle2.containsKey("sei")) {
            Parcelable[] parcelableArray = Build.VERSION.SDK_INT >= 33 ? (Parcelable[]) bundle2.getParcelableArray("sei", Bundle.class) : bundle2.getParcelableArray("sei");
            if (parcelableArray != null) {
                String.valueOf(parcelableArray.length);
            }
        }
        afyd.c(bundle2, "cempg");
        afyd.c(bundle2, "cesg");
        afyd.c(bundle2, "cefg");
        if (bundle2.containsKey("e")) {
            bundle2.getString("e");
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeBundle(bundle2);
            strEncodeToString = Base64.encodeToString(parcelObtain.marshall(), 0);
            parcelObtain.recycle();
            Bundle bundle3 = new Bundle();
            bundle3.putInt("t", 2);
            if (instantB != null) {
                bundle3.putLong("stp", instantB.toEpochMilli());
            }
            (bundle3.containsKey("stp") ? Long.valueOf(bundle3.getLong("stp")) : "<not set>").toString();
            a.aS(bundle3.getInt("t"));
            bundle3.containsKey("em");
            agit agitVar = (agit) this.b.io();
            if (agitVar.a - agitVar.size() == 0 && (bundle = (Bundle) agitVar.poll()) != null && bundle.getInt("t") == 1 && (motionEvent = (MotionEvent) aie.i(bundle, "em", MotionEvent.class)) != null) {
                motionEvent.recycle();
            }
            agitVar.add(bundle3);
            this.d = instantB;
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
        return strEncodeToString;
    }
}
