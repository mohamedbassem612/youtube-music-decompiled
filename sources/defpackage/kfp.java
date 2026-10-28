package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kfp extends AsyncTask {
    private final kfr a;
    private final kfo b;

    static {
        new khn("FetchBitmapTask", (String) null);
    }

    public kfp(Context context, int i, int i2, kfo kfoVar) {
        kfr kfrVarJ;
        this.b = kfoVar;
        Context applicationContext = context.getApplicationContext();
        kfs kfsVar = new kfs(this);
        int i3 = kdm.a;
        try {
            kdo kdoVarA = kdm.a(applicationContext.getApplicationContext());
            kfrVarJ = kdoVarA.a() >= 233700000 ? kdoVarA.j(new kun(applicationContext.getApplicationContext()), new kun(this), kfsVar, i, i2) : kdoVarA.i(new kun(this), kfsVar, i, i2);
        } catch (RemoteException | kcl unused) {
            khn.e();
            kfrVarJ = null;
        }
        this.a = kfrVarJ;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri uri;
        kfr kfrVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length != 1 || (uri = uriArr[0]) == null || (kfrVar = this.a) == null) {
            return null;
        }
        try {
            return kfrVar.a(uri);
        } catch (RemoteException unused) {
            khn.e();
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        kfo kfoVar = this.b;
        Bitmap bitmap = (Bitmap) obj;
        if (kfoVar != null) {
            kfoVar.b = bitmap;
            kfn kfnVar = kfoVar.c;
            if (kfnVar != null) {
                kfnVar.a(kfoVar.b);
            }
            kfoVar.a = null;
        }
    }
}
