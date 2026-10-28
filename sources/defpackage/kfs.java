package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kfs extends gdb implements IInterface {
    final /* synthetic */ kfp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfs(kfp kfpVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
        this.a = kfpVar;
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            gdc.b(parcel);
            this.a.publishProgress(Long.valueOf(j), Long.valueOf(j2));
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(264205000);
        }
        return true;
    }
}
