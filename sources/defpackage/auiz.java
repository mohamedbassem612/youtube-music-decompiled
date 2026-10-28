package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import com.google.protobuf.MessageLite;
import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auiz implements aujl {
    private static final String a = "auiz";
    private final ContentProviderClient b;
    private final Uri c;
    private final Uri d;
    private final Uri e;
    private final Uri f;

    public auiz(ContentProviderClient contentProviderClient, String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Authority key must be non-null and non-empty");
        }
        this.b = contentProviderClient;
        this.c = CommonApis.u(str, "device_params");
        this.d = CommonApis.u(str, "user_prefs");
        this.e = CommonApis.u(str, "phone_params");
        this.f = CommonApis.u(str, "sdk_configuration_params");
        CommonApis.u(str, "recent_headsets");
    }

    private final MessageLite g(aiir aiirVar, Uri uri, String str) throws Throwable {
        byte[] bArrH = h(uri, str);
        if (bArrH == null) {
            return null;
        }
        try {
            return aiirVar.mergeFrom(bArrH).build();
        } catch (aiik e) {
            Log.e(a, "Error reading params from ContentProvider", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0047 A[PHI: r8
      0x0047: PHI (r8v5 android.database.Cursor) = (r8v6 android.database.Cursor), (r8v7 android.database.Cursor) binds: [B:28:0x0045, B:8:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0050  */
    /* JADX WARN: Code duplicated, block: B:39:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    private final byte[] h(Uri uri, String str) throws Throwable {
        Throwable th;
        Throwable th2;
        Cursor cursorQuery;
        ?? r1 = 0;
        try {
            try {
                cursorQuery = this.b.query(uri, null, str, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            if (blob != null) {
                                cursorQuery.close();
                                return blob;
                            }
                        }
                    } catch (CursorIndexOutOfBoundsException | RemoteException | IllegalArgumentException e) {
                        th2 = e;
                        Log.e(a, "Error reading params from ContentProvider", th2);
                    }
                    cursorQuery.close();
                    return null;
                }
                Log.e(a, a.cp(uri, "Invalid params result from ContentProvider query: "));
            } catch (Throwable th3) {
                th = th3;
                r1 = this;
                if (r1 != 0) {
                    throw th;
                }
                r1.close();
                throw th;
            }
        } catch (CursorIndexOutOfBoundsException e2) {
            e = e2;
            th2 = e;
            cursorQuery = null;
            Log.e(a, "Error reading params from ContentProvider", th2);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (RemoteException e3) {
            e = e3;
            th2 = e;
            cursorQuery = null;
            Log.e(a, "Error reading params from ContentProvider", th2);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (IllegalArgumentException e4) {
            e = e4;
            th2 = e;
            cursorQuery = null;
            Log.e(a, "Error reading params from ContentProvider", th2);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            if (r1 != 0) {
                throw th;
            }
            r1.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    @Override // defpackage.aujl
    public final agzk a(aukb aukbVar) {
        return (agzk) g(auju.c.toBuilder(), this.f, Base64.encodeToString(aukbVar.toByteArray(), 0));
    }

    @Override // defpackage.aujl
    public final aujy b() {
        return (aujy) g(aujy.a.createBuilder(), this.c, null);
    }

    @Override // defpackage.aujl
    public final aujz c() {
        return (aujz) g(aujz.a.createBuilder(), this.e, null);
    }

    @Override // defpackage.aujl
    public final auka d() {
        return (auka) g(auka.a.createBuilder(), this.d, null);
    }

    @Override // defpackage.aujl
    public final void e() throws Exception {
        this.b.close();
    }

    @Override // defpackage.aujl
    public final boolean f(aujy aujyVar) {
        int iUpdate;
        Uri uri = this.c;
        try {
            if (aujyVar == null) {
                iUpdate = this.b.delete(uri, null, null);
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", aujyVar.toByteArray());
                iUpdate = this.b.update(uri, contentValues, null, null);
            }
            return iUpdate > 0;
        } catch (RemoteException e) {
            Log.e(a, "Failed to write params to ContentProvider", e);
        } catch (SecurityException e2) {
            Log.e(a, "Insufficient permissions to write params to ContentProvider", e2);
        }
    }
}
