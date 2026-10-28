package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afko implements Parcelable {
    public final int a;
    public boolean b;
    agev c;
    public Object d;
    public Object e;
    private Throwable g;
    private afkm h;
    private static final agrf f = agrf.h("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture");
    public static final Parcelable.Creator CREATOR = new ahpw(1);

    public afko(Parcel parcel) {
        this.c = agdf.a;
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = parcel.readInt();
        try {
            this.d = parcel.readValue(classLoader);
            int i = parcel.readInt();
            this.c = agev.i(Integer.valueOf(i));
            if (i == 1) {
                this.b = true;
                this.e = parcel.readValue(classLoader);
                this.g = (Throwable) parcel.readValue(classLoader);
            }
        } catch (RuntimeException e) {
            ((agrc) ((agrc) ((agrc) f.b()).j(e)).k("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "<init>", 95, "ParcelableFuture.java")).u("Failed to unparcel value for %d.", this.a);
            this.b = true;
            this.g = e;
        }
    }

    private static void d(Object obj, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        try {
            parcel.writeValue(obj);
        } catch (RuntimeException e) {
            parcel.setDataPosition(iDataPosition);
            ((agrc) ((agrc) ((agrc) f.b()).j(e)).k("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "tryToWriteValue", (char) 238, "ParcelableFuture.java")).t("Result lost due to non-parcelable type.");
            throw new IllegalArgumentException("Type not supported by Parcel and will be dropped: ".concat(String.valueOf(String.valueOf(obj.getClass()))), e);
        }
    }

    public final void a() {
        afkm afkmVar = this.h;
        if (afkmVar != null) {
            Throwable th = this.g;
            if (th != null) {
                afkmVar.a.execute(afwl.i(new adab(afkmVar, this, th, 12, (char[]) null)));
            } else {
                afkmVar.a.execute(afwl.i(new adab(afkmVar, this, this.e, 11, (char[]) null)));
            }
        }
    }

    final void b(Throwable th) {
        this.g = th;
        this.b = true;
        a();
    }

    final void c(afkm afkmVar) {
        this.h = afkmVar;
        if (afkmVar == null || !this.b) {
            return;
        }
        a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        String str2;
        Object obj = this.d;
        String str3 = "";
        if (obj != null) {
            str = "input=" + obj.getClass().getName() + ';';
        } else {
            str = "";
        }
        Object obj2 = this.e;
        if (obj2 != null) {
            str2 = "result=" + obj2.getClass().getName() + ';';
        } else {
            str2 = "";
        }
        Throwable th = this.g;
        if (th != null) {
            str3 = "error=" + th.getClass().getName() + ';';
        }
        return "ParcelableFuture(" + str + str2 + str3 + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        try {
            d(this.d, parcel);
        } catch (RuntimeException e) {
            parcel.writeValue(null);
            this.b = true;
            this.g = new IllegalArgumentException("FuturesMixin input isn't Parcelable.", e);
            this.e = null;
        }
        parcel.writeInt(true != this.b ? 2 : 1);
        if (this.b) {
            try {
                d(this.e, parcel);
            } catch (RuntimeException e2) {
                parcel.writeValue(null);
                this.g = new IllegalArgumentException("FuturesMixin result isn't Parcelable.", e2);
            }
            try {
                d(this.g, parcel);
            } catch (RuntimeException e3) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("FuturesMixin result isn't Parcelable: ".concat(String.valueOf(String.valueOf(this.g))), e3);
                this.g = illegalArgumentException;
                d(illegalArgumentException, parcel);
            }
        }
    }

    public afko(int i, Object obj, ListenableFuture listenableFuture) {
        this.c = agdf.a;
        this.a = i;
        this.d = obj;
        ahng.x(listenableFuture, afwl.g(new afkn(this)), MoreExecutors.directExecutor());
    }
}
