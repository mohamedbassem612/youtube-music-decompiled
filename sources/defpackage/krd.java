package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class krd extends gdb implements kre {
    private int a;

    protected krd(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] e(String str) {
        return str.getBytes(StandardCharsets.ISO_8859_1);
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            kuo kuoVarD = d();
            parcel2.writeNoException();
            gdc.e(parcel2, kuoVarD);
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i2 = this.a;
        parcel2.writeNoException();
        parcel2.writeInt(i2);
        return true;
    }

    public abstract byte[] D();

    @Override // defpackage.kre
    public final int c() {
        return this.a;
    }

    @Override // defpackage.kre
    public final kuo d() {
        return new kun(D());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kre)) {
            return false;
        }
        try {
            kre kreVar = (kre) obj;
            if (kreVar.c() != this.a) {
                return false;
            }
            return Arrays.equals(D(), (byte[]) kun.b(kreVar.d()));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
