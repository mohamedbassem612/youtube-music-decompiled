package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kvp extends kry {
    public static final Parcelable.Creator CREATOR = new kpm(15);
    ParcelFileDescriptor a;
    final String b;
    final String c;
    byte[] d;
    public File e;

    public kvp(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.a = parcelFileDescriptor;
        this.b = str;
        this.c = str2;
    }

    static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            File file = this.e;
            if (file == null) {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
            }
            try {
                File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    this.a = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                    fileCreateTempFile.delete();
                    DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                    try {
                        try {
                            dataOutputStream.writeInt(this.d.length);
                            dataOutputStream.writeUTF(this.b);
                            dataOutputStream.writeUTF(this.c);
                            dataOutputStream.write(this.d);
                            a(dataOutputStream);
                        } catch (Throwable th) {
                            a(dataOutputStream);
                            throw th;
                        }
                    } catch (IOException e) {
                        throw new IllegalStateException("Could not write into unlinked file", e);
                    }
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted.");
                }
            } catch (IOException e2) {
                throw new IllegalStateException("Could not create temporary file:", e2);
            }
        }
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 2, this.a, i);
        ksy.B(parcel, 3, this.b);
        ksy.B(parcel, 4, this.c);
        ksy.h(parcel, iG);
    }

    public kvp(byte[] bArr, String str, String str2) {
        this((ParcelFileDescriptor) null, str, str2);
        this.d = bArr;
    }
}
